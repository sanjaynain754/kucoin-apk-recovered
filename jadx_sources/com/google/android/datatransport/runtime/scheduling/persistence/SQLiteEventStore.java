package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
@WorkerThread
public class SQLiteEventStore implements EventStore, SynchronizationGuard, ClientHealthMetricsStore {
    private static final int LOCK_RETRY_BACK_OFF_MILLIS = 50;
    private static final String LOG_TAG = "SQLiteEventStore";
    static final int MAX_RETRIES = 16;
    private static final Encoding PROTOBUF_ENCODING = Encoding.m12812of("proto");
    private final EventStoreConfig config;
    private final Clock monotonicClock;
    private final Provider<String> packageName;
    private final SchemaManager schemaManager;
    private final Clock wallClock;

    public interface Function<T, U> {
        U apply(T t11);
    }

    public static class Metadata {
        final String key;
        final String value;

        private Metadata(String str, String str2) {
            this.key = str;
            this.value = str2;
        }
    }

    public interface Producer<T> {
        T produce();
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ TimeWindow m12846Q(final long j11, SQLiteDatabase sQLiteDatabase) {
        return (TimeWindow) tryWithCursor(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.s
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.m12847a(j11, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ List m12857o(SQLiteDatabase sQLiteDatabase) {
        return (List) tryWithCursor(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.n
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.m12849g((Cursor) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ Object m12860u(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete(DbParams.TABLE_EVENTS, null, new String[0]);
        sQLiteDatabase.delete("transport_contexts", null, new String[0]);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ List m12848b(SQLiteEventStore sQLiteEventStore, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        List<PersistedEvent> listLoadEvents = sQLiteEventStore.loadEvents(sQLiteDatabase, transportContext, sQLiteEventStore.config.getLoadBatchSize());
        for (Priority priority : Priority.values()) {
            if (priority != transportContext.getPriority()) {
                int loadBatchSize = sQLiteEventStore.config.getLoadBatchSize() - listLoadEvents.size();
                if (loadBatchSize <= 0) {
                    break;
                }
                listLoadEvents.addAll(sQLiteEventStore.loadEvents(sQLiteDatabase, transportContext.withPriority(priority), loadBatchSize));
            }
        }
        return sQLiteEventStore.join(listLoadEvents, sQLiteEventStore.loadMetadata(sQLiteDatabase, listLoadEvents));
    }

    private LogEventDropped.Reason convertToReason(int i11) {
        LogEventDropped.Reason reason = LogEventDropped.Reason.REASON_UNKNOWN;
        if (i11 == reason.getNumber()) {
            return reason;
        }
        LogEventDropped.Reason reason2 = LogEventDropped.Reason.MESSAGE_TOO_OLD;
        if (i11 == reason2.getNumber()) {
            return reason2;
        }
        LogEventDropped.Reason reason3 = LogEventDropped.Reason.CACHE_FULL;
        if (i11 == reason3.getNumber()) {
            return reason3;
        }
        LogEventDropped.Reason reason4 = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
        if (i11 == reason4.getNumber()) {
            return reason4;
        }
        LogEventDropped.Reason reason5 = LogEventDropped.Reason.MAX_RETRIES_REACHED;
        if (i11 == reason5.getNumber()) {
            return reason5;
        }
        LogEventDropped.Reason reason6 = LogEventDropped.Reason.INVALID_PAYLOD;
        if (i11 == reason6.getNumber()) {
            return reason6;
        }
        LogEventDropped.Reason reason7 = LogEventDropped.Reason.SERVER_ERROR;
        if (i11 == reason7.getNumber()) {
            return reason7;
        }
        Logging.m12818d(LOG_TAG, "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i11));
        return reason;
    }

    private void ensureBeginTransaction(final SQLiteDatabase sQLiteDatabase) {
        retryIfDbLocked(new Producer() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.u
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer
            public final Object produce() {
                return SQLiteEventStore.m12862w(sQLiteDatabase);
            }
        }, new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.v
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.m12864z((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ List m12849g(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(TransportContext.builder().setBackendName(cursor.getString(1)).setPriority(PriorityMapping.valueOf(cursor.getInt(2))).setExtras(maybeBase64Decode(cursor.getString(3))).build());
        }
        return arrayList;
    }

    private TimeWindow getTimeWindow() {
        final long time = this.wallClock.getTime();
        return (TimeWindow) inTransaction(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.q
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.m12846Q(time, (SQLiteDatabase) obj);
            }
        });
    }

    @Nullable
    private Long getTransportContextId(SQLiteDatabase sQLiteDatabase, TransportContext transportContext) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(transportContext.getBackendName(), String.valueOf(PriorityMapping.toInt(transportContext.getPriority()))));
        if (transportContext.getExtras() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(transportContext.getExtras(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) tryWithCursor(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.c
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.m12863x((Cursor) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ SQLiteDatabase m12851i(Throwable th2) {
        throw new SynchronizationException("Timed out while trying to open db.", th2);
    }

    private List<PersistedEvent> loadEvents(SQLiteDatabase sQLiteDatabase, final TransportContext transportContext, int i11) {
        final ArrayList arrayList = new ArrayList();
        Long transportContextId = getTransportContextId(sQLiteDatabase, transportContext);
        if (transportContextId == null) {
            return arrayList;
        }
        tryWithCursor(sQLiteDatabase.query(DbParams.TABLE_EVENTS, new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id"}, "context_id = ?", new String[]{transportContextId.toString()}, null, null, null, String.valueOf(i11)), new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.b
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.m12842L(this.f11650a, arrayList, transportContext, (Cursor) obj);
            }
        });
        return arrayList;
    }

    private Map<Long, Set<Metadata>> loadMetadata(SQLiteDatabase sQLiteDatabase, List<PersistedEvent> list) {
        final HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(list.get(i11).getId());
            if (i11 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        tryWithCursor(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.j
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.m12840E(map, (Cursor) obj);
            }
        });
        return map;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Object m12855m(long j11, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j11));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{transportContext.getBackendName(), String.valueOf(PriorityMapping.toInt(transportContext.getPriority()))}) < 1) {
            contentValues.put("backend_name", transportContext.getBackendName());
            contentValues.put("priority", Integer.valueOf(PriorityMapping.toInt(transportContext.getPriority())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    private static byte[] maybeBase64Decode(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ byte[] m12856n(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            byte[] bArr2 = (byte[]) arrayList.get(i11);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    private <T> T retryIfDbLocked(Producer<T> producer, Function<Throwable, T> function) {
        long time = this.monotonicClock.getTime();
        while (true) {
            try {
                return producer.produce();
            } catch (SQLiteDatabaseLockedException e11) {
                if (this.monotonicClock.getTime() >= ((long) this.config.getCriticalSectionEnterTimeoutMs()) + time) {
                    return function.apply(e11);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static Encoding toEncoding(@Nullable String str) {
        return str == null ? PROTOBUF_ENCODING : Encoding.m12812of(str);
    }

    private static String toIdList(Iterable<PersistedEvent> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<PersistedEvent> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().getId());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ Object m12864z(Throwable th2) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th2);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public int cleanUp() {
        final long time = this.wallClock.getTime() - this.config.getEventCleanUpAge();
        return ((Integer) inTransaction(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.k
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.m12841J(this.f11666a, time, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public void clearDb() {
        inTransaction(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.x
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.m12860u((SQLiteDatabase) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.schemaManager.close();
    }

    @VisibleForTesting
    public SQLiteDatabase getDb() {
        final SchemaManager schemaManager = this.schemaManager;
        Objects.requireNonNull(schemaManager);
        return (SQLiteDatabase) retryIfDbLocked(new Producer() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.z
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer
            public final Object produce() {
                return schemaManager.getWritableDatabase();
            }
        }, new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.a0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.m12851i((Throwable) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public boolean hasPendingEventsFor(final TransportContext transportContext) {
        return ((Boolean) inTransaction(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.f
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.m12854l(this.f11657a, transportContext, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public Iterable<TransportContext> loadActiveContexts() {
        return (Iterable) inTransaction(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.p
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.m12857o((SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public Iterable<PersistedEvent> loadBatch(final TransportContext transportContext) {
        return (Iterable) inTransaction(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.y
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.m12848b(this.f11678a, transportContext, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public void recordLogEventDropped(final long j11, final LogEventDropped.Reason reason, final String str) {
        inTransaction(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.m
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.m12839C(str, reason, j11, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordNextCallTime(final TransportContext transportContext, final long j11) {
        inTransaction(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.h
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.m12855m(j11, transportContext, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public void resetClientMetrics() {
        inTransaction(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.i
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.m12843M(this.f11664a, (SQLiteDatabase) obj);
            }
        });
    }

    public SQLiteEventStore(@WallTime Clock clock, @Monotonic Clock clock2, EventStoreConfig eventStoreConfig, SchemaManager schemaManager, Provider<String> provider) {
        this.schemaManager = schemaManager;
        this.wallClock = clock;
        this.monotonicClock = clock2;
        this.config = eventStoreConfig;
        this.packageName = provider;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ Object m12839C(String str, LogEventDropped.Reason reason, long j11, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) tryWithCursor(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.getNumber())}), new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.d
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.m12859q((Cursor) obj);
            }
        })).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(reason.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j11));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        }
        sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j11 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.getNumber())});
        return null;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ Object m12840E(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j11 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j11));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j11), hashSet);
            }
            hashSet.add(new Metadata(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ Integer m12841J(final SQLiteEventStore sQLiteEventStore, long j11, SQLiteDatabase sQLiteDatabase) {
        sQLiteEventStore.getClass();
        String[] strArr = {String.valueOf(j11)};
        tryWithCursor(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.t
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.m12852j(this.f11676a, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete(DbParams.TABLE_EVENTS, "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ Object m12842L(SQLiteEventStore sQLiteEventStore, List list, TransportContext transportContext, Cursor cursor) {
        sQLiteEventStore.getClass();
        while (cursor.moveToNext()) {
            boolean z11 = false;
            long j11 = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z11 = true;
            }
            EventInternal.Builder uptimeMillis = EventInternal.builder().setTransportName(cursor.getString(1)).setEventMillis(cursor.getLong(2)).setUptimeMillis(cursor.getLong(3));
            if (z11) {
                uptimeMillis.setEncodedPayload(new EncodedPayload(toEncoding(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                uptimeMillis.setEncodedPayload(new EncodedPayload(toEncoding(cursor.getString(4)), sQLiteEventStore.readPayload(j11)));
            }
            if (!cursor.isNull(6)) {
                uptimeMillis.setCode(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                uptimeMillis.setProductId(Integer.valueOf(cursor.getInt(8)));
            }
            list.add(PersistedEvent.create(j11, transportContext, uptimeMillis.build()));
        }
        return null;
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ Object m12843M(SQLiteEventStore sQLiteEventStore, SQLiteDatabase sQLiteDatabase) {
        sQLiteEventStore.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + sQLiteEventStore.wallClock.getTime()).execute();
        return null;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ ClientMetrics m12844O(final SQLiteEventStore sQLiteEventStore, String str, final Map map, final ClientMetrics.Builder builder, SQLiteDatabase sQLiteDatabase) {
        sQLiteEventStore.getClass();
        return (ClientMetrics) tryWithCursor(sQLiteDatabase.rawQuery(str, new String[0]), new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.g
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.m12858p(this.f11659a, map, builder, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ Long m12845P(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ TimeWindow m12847a(long j11, Cursor cursor) {
        cursor.moveToNext();
        return TimeWindow.newBuilder().setStartMs(cursor.getLong(0)).setEndMs(j11).build();
    }

    private long ensureTransportContext(SQLiteDatabase sQLiteDatabase, TransportContext transportContext) {
        Long transportContextId = getTransportContextId(sQLiteDatabase, transportContext);
        if (transportContextId != null) {
            return transportContextId.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", transportContext.getBackendName());
        contentValues.put("priority", Integer.valueOf(PriorityMapping.toInt(transportContext.getPriority())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (transportContext.getExtras() != null) {
            contentValues.put("extras", Base64.encodeToString(transportContext.getExtras(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private GlobalMetrics getGlobalMetrics() {
        return GlobalMetrics.newBuilder().setStorageMetrics(StorageMetrics.newBuilder().setCurrentCacheSizeBytes(getByteSize()).setMaxCacheSizeBytes(EventStoreConfig.DEFAULT.getMaxStorageSizeInBytes()).build()).build();
    }

    private long getPageCount() {
        return getDb().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long getPageSize() {
        return getDb().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m12850h(SQLiteEventStore sQLiteEventStore, Cursor cursor) {
        sQLiteEventStore.getClass();
        while (cursor.moveToNext()) {
            sQLiteEventStore.recordLogEventDropped(cursor.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    private boolean isStorageAtLimit() {
        if (getPageCount() * getPageSize() >= this.config.getMaxStorageSizeInBytes()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Object m12852j(SQLiteEventStore sQLiteEventStore, Cursor cursor) {
        sQLiteEventStore.getClass();
        while (cursor.moveToNext()) {
            sQLiteEventStore.recordLogEventDropped(cursor.getInt(0), LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    private List<PersistedEvent> join(List<PersistedEvent> list, Map<Long, Set<Metadata>> map) {
        ListIterator<PersistedEvent> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            PersistedEvent next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.getId()))) {
                EventInternal.Builder builder = next.getEvent().toBuilder();
                for (Metadata metadata : map.get(Long.valueOf(next.getId()))) {
                    builder.addMetadata(metadata.key, metadata.value);
                }
                listIterator.set(PersistedEvent.create(next.getId(), next.getTransportContext(), builder.build()));
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Object m12853k(final SQLiteEventStore sQLiteEventStore, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteEventStore.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        tryWithCursor(sQLiteDatabase.rawQuery(str2, null), new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.b0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.m12850h(this.f11653a, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Boolean m12854l(SQLiteEventStore sQLiteEventStore, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        Long transportContextId = sQLiteEventStore.getTransportContextId(sQLiteDatabase, transportContext);
        if (transportContextId == null) {
            return Boolean.FALSE;
        }
        return (Boolean) tryWithCursor(sQLiteEventStore.getDb().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{transportContextId.toString()}), new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.w
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ ClientMetrics m12858p(SQLiteEventStore sQLiteEventStore, Map map, ClientMetrics.Builder builder, Cursor cursor) {
        sQLiteEventStore.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            LogEventDropped.Reason reasonConvertToReason = sQLiteEventStore.convertToReason(cursor.getInt(1));
            long j11 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(LogEventDropped.newBuilder().setReason(reasonConvertToReason).setEventsDroppedCount(j11).build());
        }
        sQLiteEventStore.populateLogSourcesMetrics(builder, map);
        return builder.setWindow(sQLiteEventStore.getTimeWindow()).setGlobalMetrics(sQLiteEventStore.getGlobalMetrics()).setAppNamespace(sQLiteEventStore.packageName.get()).build();
    }

    private void populateLogSourcesMetrics(ClientMetrics.Builder builder, Map<String, List<LogEventDropped>> map) {
        for (Map.Entry<String, List<LogEventDropped>> entry : map.entrySet()) {
            builder.addLogSourceMetrics(LogSourceMetrics.newBuilder().setLogSource(entry.getKey()).setLogEventDroppedList(entry.getValue()).build());
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Boolean m12859q(Cursor cursor) {
        boolean z11;
        if (cursor.getCount() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    private byte[] readPayload(long j11) {
        return (byte[]) tryWithCursor(getDb().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j11)}, null, null, "sequence_num"), new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.o
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.m12856n((Cursor) obj);
            }
        });
    }

    @VisibleForTesting
    public static <T> T tryWithCursor(Cursor cursor, Function<Cursor, T> function) {
        try {
            return function.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ Long m12861v(SQLiteEventStore sQLiteEventStore, EventInternal eventInternal, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        boolean z11;
        byte[] bArr;
        if (sQLiteEventStore.isStorageAtLimit()) {
            sQLiteEventStore.recordLogEventDropped(1L, LogEventDropped.Reason.CACHE_FULL, eventInternal.getTransportName());
            return -1L;
        }
        long jEnsureTransportContext = sQLiteEventStore.ensureTransportContext(sQLiteDatabase, transportContext);
        int maxBlobByteSizePerRow = sQLiteEventStore.config.getMaxBlobByteSizePerRow();
        byte[] bytes = eventInternal.getEncodedPayload().getBytes();
        if (bytes.length <= maxBlobByteSizePerRow) {
            z11 = true;
        } else {
            z11 = false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jEnsureTransportContext));
        contentValues.put("transport_name", eventInternal.getTransportName());
        contentValues.put("timestamp_ms", Long.valueOf(eventInternal.getEventMillis()));
        contentValues.put("uptime_ms", Long.valueOf(eventInternal.getUptimeMillis()));
        contentValues.put("payload_encoding", eventInternal.getEncodedPayload().getEncoding().getName());
        contentValues.put("code", eventInternal.getCode());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z11));
        if (z11) {
            bArr = bytes;
        } else {
            bArr = new byte[0];
        }
        contentValues.put("payload", bArr);
        contentValues.put("product_id", eventInternal.getProductId());
        long jInsert = sQLiteDatabase.insert(DbParams.TABLE_EVENTS, null, contentValues);
        if (!z11) {
            int iCeil = (int) Math.ceil(((double) bytes.length) / ((double) maxBlobByteSizePerRow));
            for (int i11 = 1; i11 <= iCeil; i11++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bytes, (i11 - 1) * maxBlobByteSizePerRow, Math.min(i11 * maxBlobByteSizePerRow, bytes.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i11));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : eventInternal.getMetadata().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ Object m12862w(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ Long m12863x(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    @VisibleForTesting
    public long getByteSize() {
        return getPageCount() * getPageSize();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public long getNextCallTime(TransportContext transportContext) {
        return ((Long) tryWithCursor(getDb().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{transportContext.getBackendName(), String.valueOf(PriorityMapping.toInt(transportContext.getPriority()))}), new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.r
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.m12845P((Cursor) obj);
            }
        })).longValue();
    }

    @VisibleForTesting
    public <T> T inTransaction(Function<SQLiteDatabase, T> function) {
        SQLiteDatabase db2 = getDb();
        db2.beginTransaction();
        try {
            T tApply = function.apply(db2);
            db2.setTransactionSuccessful();
            return tApply;
        } finally {
            db2.endTransaction();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public ClientMetrics loadClientMetrics() {
        final ClientMetrics.Builder builderNewBuilder = ClientMetrics.newBuilder();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (ClientMetrics) inTransaction(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.a
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.m12844O(this.f11646a, str, map, builderNewBuilder, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    @Nullable
    public PersistedEvent persist(final TransportContext transportContext, final EventInternal eventInternal) {
        Logging.m12820d(LOG_TAG, "Storing event with priority=%s, name=%s for destination %s", transportContext.getPriority(), eventInternal.getTransportName(), transportContext.getBackendName());
        long jLongValue = ((Long) inTransaction(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.e
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.m12861v(this.f11654a, eventInternal, transportContext, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return PersistedEvent.create(jLongValue, transportContext, eventInternal);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordFailure(Iterable<PersistedEvent> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + toIdList(iterable);
        final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
        inTransaction(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.l
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.m12853k(this.f11668a, str, str2, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordSuccess(Iterable<PersistedEvent> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        getDb().compileStatement("DELETE FROM events WHERE _id in " + toIdList(iterable)).execute();
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard
    public <T> T runCriticalSection(SynchronizationGuard.CriticalSection<T> criticalSection) {
        SQLiteDatabase db2 = getDb();
        ensureBeginTransaction(db2);
        try {
            T tExecute = criticalSection.execute();
            db2.setTransactionSuccessful();
            return tExecute;
        } finally {
            db2.endTransaction();
        }
    }
}
