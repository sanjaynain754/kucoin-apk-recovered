package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.LiveData;
import androidx.sqlite.p023db.SimpleSQLiteQuery;
import androidx.sqlite.p023db.SupportSQLiteDatabase;
import androidx.sqlite.p023db.SupportSQLiteStatement;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
public class InvalidationTracker {
    private static final String CREATE_TRACKING_TABLE_SQL = "CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";
    private static final String INVALIDATED_COLUMN_NAME = "invalidated";

    @VisibleForTesting
    static final String RESET_UPDATED_TABLES_SQL = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ";

    @VisibleForTesting
    static final String SELECT_UPDATED_TABLES_SQL = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";
    private static final String TABLE_ID_COLUMN_NAME = "table_id";
    private static final String[] TRIGGERS = {"UPDATE", "DELETE", "INSERT"};
    private static final String UPDATE_TABLE_NAME = "room_table_modification_log";

    @Nullable
    AutoCloser mAutoCloser;
    volatile SupportSQLiteStatement mCleanupStatement;
    final RoomDatabase mDatabase;
    private volatile boolean mInitialized;
    private final InvalidationLiveDataContainer mInvalidationLiveDataContainer;
    private MultiInstanceInvalidationClient mMultiInstanceInvalidationClient;
    private ObservedTableTracker mObservedTableTracker;

    @SuppressLint({"RestrictedApi"})
    @VisibleForTesting
    final SafeIterableMap<Observer, ObserverWrapper> mObserverMap;
    AtomicBoolean mPendingRefresh;

    @VisibleForTesting
    Runnable mRefreshRunnable;

    @NonNull
    final HashMap<String, Integer> mTableIdLookup;
    final String[] mTableNames;

    @NonNull
    private Map<String, Set<String>> mViewTables;

    /* JADX INFO: loaded from: classes34.dex */
    public static class ObserverWrapper {
        final Observer mObserver;
        private final Set<String> mSingleTableSet;
        final int[] mTableIds;
        private final String[] mTableNames;

        public void notifyByTableInvalidStatus(Set<Integer> set) {
            int length = this.mTableIds.length;
            Set<String> hashSet = null;
            for (int i11 = 0; i11 < length; i11++) {
                if (set.contains(Integer.valueOf(this.mTableIds[i11]))) {
                    if (length == 1) {
                        hashSet = this.mSingleTableSet;
                    } else {
                        if (hashSet == null) {
                            hashSet = new HashSet<>(length);
                        }
                        hashSet.add(this.mTableNames[i11]);
                    }
                }
            }
            if (hashSet != null) {
                this.mObserver.onInvalidated(hashSet);
            }
        }

        public void notifyByTableNames(String[] strArr) {
            Set<String> set = null;
            if (this.mTableNames.length == 1) {
                for (String str : strArr) {
                    if (str.equalsIgnoreCase(this.mTableNames[0])) {
                        set = this.mSingleTableSet;
                        break;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str2 : strArr) {
                    for (String str3 : this.mTableNames) {
                        if (str3.equalsIgnoreCase(str2)) {
                            hashSet.add(str3);
                            break;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.mObserver.onInvalidated(set);
            }
        }

        public ObserverWrapper(Observer observer, int[] iArr, String[] strArr) {
            this.mObserver = observer;
            this.mTableIds = iArr;
            this.mTableNames = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                this.mSingleTableSet = Collections.unmodifiableSet(hashSet);
                return;
            }
            this.mSingleTableSet = null;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static class WeakObserver extends Observer {
        final WeakReference<Observer> mDelegateRef;
        final InvalidationTracker mTracker;

        public WeakObserver(InvalidationTracker invalidationTracker, Observer observer) {
            super(observer.mTables);
            this.mTracker = invalidationTracker;
            this.mDelegateRef = new WeakReference<>(observer);
        }

        @Override // androidx.room.InvalidationTracker.Observer
        public void onInvalidated(@NonNull Set<String> set) {
            Observer observer = this.mDelegateRef.get();
            if (observer == null) {
                this.mTracker.removeObserver(this);
            } else {
                observer.onInvalidated(set);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public InvalidationTracker(RoomDatabase roomDatabase, String... strArr) {
        this(roomDatabase, new HashMap(), Collections.EMPTY_MAP, strArr);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public <T> LiveData<T> createLiveData(String[] strArr, Callable<T> callable) {
        return createLiveData(strArr, false, callable);
    }

    public void internalInit(SupportSQLiteDatabase supportSQLiteDatabase) {
        synchronized (this) {
            try {
                if (this.mInitialized) {
                    Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                    return;
                }
                supportSQLiteDatabase.execSQL("PRAGMA temp_store = MEMORY;");
                supportSQLiteDatabase.execSQL("PRAGMA recursive_triggers='ON';");
                supportSQLiteDatabase.execSQL(CREATE_TRACKING_TABLE_SQL);
                syncTriggers(supportSQLiteDatabase);
                this.mCleanupStatement = supportSQLiteDatabase.compileStatement(RESET_UPDATED_TABLES_SQL);
                this.mInitialized = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void onAutoCloseCallback() {
        synchronized (this) {
            this.mInitialized = false;
            this.mObservedTableTracker.resetTriggerState();
        }
    }

    public void syncTriggers(SupportSQLiteDatabase supportSQLiteDatabase) {
        if (supportSQLiteDatabase.inTransaction()) {
            return;
        }
        while (true) {
            try {
                Lock closeLock = this.mDatabase.getCloseLock();
                closeLock.lock();
                try {
                    int[] tablesToSync = this.mObservedTableTracker.getTablesToSync();
                    if (tablesToSync == null) {
                        closeLock.unlock();
                        return;
                    }
                    int length = tablesToSync.length;
                    beginTransactionInternal(supportSQLiteDatabase);
                    for (int i11 = 0; i11 < length; i11++) {
                        try {
                            int i12 = tablesToSync[i11];
                            if (i12 == 1) {
                                startTrackingTable(supportSQLiteDatabase, i11);
                            } else if (i12 == 2) {
                                stopTrackingTable(supportSQLiteDatabase, i11);
                            }
                        } catch (Throwable th2) {
                            supportSQLiteDatabase.endTransaction();
                            throw th2;
                        }
                    }
                    supportSQLiteDatabase.setTransactionSuccessful();
                    supportSQLiteDatabase.endTransaction();
                    this.mObservedTableTracker.onSyncCompleted();
                    closeLock.unlock();
                } catch (Throwable th3) {
                    closeLock.unlock();
                    throw th3;
                }
            } catch (SQLiteException | IllegalStateException e11) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
                return;
            }
        }
    }

    public static class ObservedTableTracker {
        static final int ADD = 1;
        static final int NO_OP = 0;
        static final int REMOVE = 2;
        boolean mNeedsSync;
        boolean mPendingSync;
        final long[] mTableObservers;
        final int[] mTriggerStateChanges;
        final boolean[] mTriggerStates;

        @Nullable
        public int[] getTablesToSync() {
            synchronized (this) {
                try {
                    if (this.mNeedsSync && !this.mPendingSync) {
                        int length = this.mTableObservers.length;
                        int i11 = 0;
                        while (true) {
                            int i12 = 1;
                            if (i11 >= length) {
                                this.mPendingSync = true;
                                this.mNeedsSync = false;
                                return this.mTriggerStateChanges;
                            }
                            boolean z11 = this.mTableObservers[i11] > 0;
                            boolean[] zArr = this.mTriggerStates;
                            if (z11 != zArr[i11]) {
                                int[] iArr = this.mTriggerStateChanges;
                                if (!z11) {
                                    i12 = 2;
                                }
                                iArr[i11] = i12;
                            } else {
                                this.mTriggerStateChanges[i11] = 0;
                            }
                            zArr[i11] = z11;
                            i11++;
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public boolean onAdded(int... iArr) {
            boolean z11;
            synchronized (this) {
                try {
                    z11 = false;
                    for (int i11 : iArr) {
                        long[] jArr = this.mTableObservers;
                        long j11 = jArr[i11];
                        jArr[i11] = 1 + j11;
                        if (j11 == 0) {
                            z11 = true;
                            this.mNeedsSync = true;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z11;
        }

        public boolean onRemoved(int... iArr) {
            boolean z11;
            synchronized (this) {
                try {
                    z11 = false;
                    for (int i11 : iArr) {
                        long[] jArr = this.mTableObservers;
                        long j11 = jArr[i11];
                        jArr[i11] = j11 - 1;
                        if (j11 == 1) {
                            z11 = true;
                            this.mNeedsSync = true;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z11;
        }

        public void onSyncCompleted() {
            synchronized (this) {
                this.mPendingSync = false;
            }
        }

        public void resetTriggerState() {
            synchronized (this) {
                Arrays.fill(this.mTriggerStates, false);
                this.mNeedsSync = true;
            }
        }

        public ObservedTableTracker(int i11) {
            long[] jArr = new long[i11];
            this.mTableObservers = jArr;
            boolean[] zArr = new boolean[i11];
            this.mTriggerStates = zArr;
            this.mTriggerStateChanges = new int[i11];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public InvalidationTracker(RoomDatabase roomDatabase, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.mAutoCloser = null;
        this.mPendingRefresh = new AtomicBoolean(false);
        this.mInitialized = false;
        this.mObserverMap = new SafeIterableMap<>();
        this.mRefreshRunnable = new Runnable() { // from class: androidx.room.InvalidationTracker.1
            private Set<Integer> checkUpdatedTable() {
                HashSet hashSet = new HashSet();
                Cursor cursorQuery = InvalidationTracker.this.mDatabase.query(new SimpleSQLiteQuery(InvalidationTracker.SELECT_UPDATED_TABLES_SQL));
                while (cursorQuery.moveToNext()) {
                    try {
                        hashSet.add(Integer.valueOf(cursorQuery.getInt(0)));
                    } catch (Throwable th2) {
                        cursorQuery.close();
                        throw th2;
                    }
                }
                cursorQuery.close();
                if (!hashSet.isEmpty()) {
                    InvalidationTracker.this.mCleanupStatement.executeUpdateDelete();
                }
                return hashSet;
            }

            @Override // java.lang.Runnable
            public void run() {
                AutoCloser autoCloser;
                Lock closeLock = InvalidationTracker.this.mDatabase.getCloseLock();
                closeLock.lock();
                Set<Integer> setCheckUpdatedTable = null;
                try {
                    try {
                        if (!InvalidationTracker.this.ensureInitialization()) {
                            closeLock.unlock();
                            AutoCloser autoCloser2 = InvalidationTracker.this.mAutoCloser;
                            if (autoCloser2 != null) {
                                autoCloser2.decrementCountAndScheduleClose();
                                return;
                            }
                            return;
                        }
                        if (!InvalidationTracker.this.mPendingRefresh.compareAndSet(true, false)) {
                            closeLock.unlock();
                            AutoCloser autoCloser3 = InvalidationTracker.this.mAutoCloser;
                            if (autoCloser3 != null) {
                                autoCloser3.decrementCountAndScheduleClose();
                                return;
                            }
                            return;
                        }
                        if (InvalidationTracker.this.mDatabase.inTransaction()) {
                            closeLock.unlock();
                            AutoCloser autoCloser4 = InvalidationTracker.this.mAutoCloser;
                            if (autoCloser4 != null) {
                                autoCloser4.decrementCountAndScheduleClose();
                                return;
                            }
                            return;
                        }
                        SupportSQLiteDatabase writableDatabase = InvalidationTracker.this.mDatabase.getOpenHelper().getWritableDatabase();
                        writableDatabase.beginTransactionNonExclusive();
                        try {
                            setCheckUpdatedTable = checkUpdatedTable();
                            writableDatabase.setTransactionSuccessful();
                            writableDatabase.endTransaction();
                            closeLock.unlock();
                            autoCloser = InvalidationTracker.this.mAutoCloser;
                            if (autoCloser != null) {
                                autoCloser.decrementCountAndScheduleClose();
                            }
                            if (setCheckUpdatedTable == null || setCheckUpdatedTable.isEmpty()) {
                                return;
                            }
                            synchronized (InvalidationTracker.this.mObserverMap) {
                                try {
                                    Iterator<Map.Entry<Observer, ObserverWrapper>> it = InvalidationTracker.this.mObserverMap.iterator();
                                    while (it.hasNext()) {
                                        it.next().getValue().notifyByTableInvalidStatus(setCheckUpdatedTable);
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            writableDatabase.endTransaction();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        closeLock.unlock();
                        AutoCloser autoCloser5 = InvalidationTracker.this.mAutoCloser;
                        if (autoCloser5 != null) {
                            autoCloser5.decrementCountAndScheduleClose();
                        }
                        throw th4;
                    }
                } catch (SQLiteException | IllegalStateException e11) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
                    closeLock.unlock();
                    autoCloser = InvalidationTracker.this.mAutoCloser;
                    if (autoCloser != null) {
                    }
                }
            }
        };
        this.mDatabase = roomDatabase;
        this.mObservedTableTracker = new ObservedTableTracker(strArr.length);
        this.mTableIdLookup = new HashMap<>();
        this.mViewTables = map2;
        this.mInvalidationLiveDataContainer = new InvalidationLiveDataContainer(roomDatabase);
        int length = strArr.length;
        this.mTableNames = new String[length];
        for (int i11 = 0; i11 < length; i11++) {
            String str = strArr[i11];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.mTableIdLookup.put(lowerCase, Integer.valueOf(i11));
            String str2 = map.get(strArr[i11]);
            if (str2 != null) {
                this.mTableNames[i11] = str2.toLowerCase(locale);
            } else {
                this.mTableNames[i11] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = value.toLowerCase(locale2);
            if (this.mTableIdLookup.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> map3 = this.mTableIdLookup;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    private static void appendTriggerName(StringBuilder sb2, String str, String str2) {
        sb2.append("`");
        sb2.append("room_table_modification_trigger_");
        sb2.append(str);
        sb2.append("_");
        sb2.append(str2);
        sb2.append("`");
    }

    private String[] resolveViews(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.mViewTables.containsKey(lowerCase)) {
                hashSet.addAll(this.mViewTables.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private void startTrackingTable(SupportSQLiteDatabase supportSQLiteDatabase, int i11) {
        supportSQLiteDatabase.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i11 + ", 0)");
        String str = this.mTableNames[i11];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : TRIGGERS) {
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            appendTriggerName(sb2, str, str2);
            sb2.append(" AFTER ");
            sb2.append(str2);
            sb2.append(" ON `");
            sb2.append(str);
            sb2.append("` BEGIN UPDATE ");
            sb2.append(UPDATE_TABLE_NAME);
            sb2.append(" SET ");
            sb2.append(INVALIDATED_COLUMN_NAME);
            sb2.append(" = 1");
            sb2.append(" WHERE ");
            sb2.append(TABLE_ID_COLUMN_NAME);
            sb2.append(" = ");
            sb2.append(i11);
            sb2.append(" AND ");
            sb2.append(INVALIDATED_COLUMN_NAME);
            sb2.append(" = 0");
            sb2.append("; END");
            supportSQLiteDatabase.execSQL(sb2.toString());
        }
    }

    private void stopTrackingTable(SupportSQLiteDatabase supportSQLiteDatabase, int i11) {
        String str = this.mTableNames[i11];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : TRIGGERS) {
            sb2.setLength(0);
            sb2.append("DROP TRIGGER IF EXISTS ");
            appendTriggerName(sb2, str, str2);
            supportSQLiteDatabase.execSQL(sb2.toString());
        }
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    public void addObserver(@NonNull Observer observer) {
        ObserverWrapper observerWrapperPutIfAbsent;
        String[] strArrResolveViews = resolveViews(observer.mTables);
        int[] iArr = new int[strArrResolveViews.length];
        int length = strArrResolveViews.length;
        for (int i11 = 0; i11 < length; i11++) {
            Integer num = this.mTableIdLookup.get(strArrResolveViews[i11].toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + strArrResolveViews[i11]);
            }
            iArr[i11] = num.intValue();
        }
        ObserverWrapper observerWrapper = new ObserverWrapper(observer, iArr, strArrResolveViews);
        synchronized (this.mObserverMap) {
            observerWrapperPutIfAbsent = this.mObserverMap.putIfAbsent(observer, observerWrapper);
        }
        if (observerWrapperPutIfAbsent == null && this.mObservedTableTracker.onAdded(iArr)) {
            syncTriggers();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void addWeakObserver(Observer observer) {
        addObserver(new WeakObserver(this, observer));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public <T> LiveData<T> createLiveData(String[] strArr, boolean z11, Callable<T> callable) {
        return this.mInvalidationLiveDataContainer.create(validateAndResolveTableNames(strArr), z11, callable);
    }

    public boolean ensureInitialization() {
        if (!this.mDatabase.isOpen()) {
            return false;
        }
        if (!this.mInitialized) {
            this.mDatabase.getOpenHelper().getWritableDatabase();
        }
        if (this.mInitialized) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting(otherwise = 3)
    public void notifyObserversByTableNames(String... strArr) {
        synchronized (this.mObserverMap) {
            try {
                for (Map.Entry<Observer, ObserverWrapper> entry : this.mObserverMap) {
                    if (!entry.getKey().isRemote()) {
                        entry.getValue().notifyByTableNames(strArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void refreshVersionsAsync() {
        if (this.mPendingRefresh.compareAndSet(false, true)) {
            AutoCloser autoCloser = this.mAutoCloser;
            if (autoCloser != null) {
                autoCloser.incrementCountAndEnsureDbIsOpen();
            }
            this.mDatabase.getQueryExecutor().execute(this.mRefreshRunnable);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @WorkerThread
    public void refreshVersionsSync() {
        AutoCloser autoCloser = this.mAutoCloser;
        if (autoCloser != null) {
            autoCloser.incrementCountAndEnsureDbIsOpen();
        }
        syncTriggers();
        this.mRefreshRunnable.run();
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    public void removeObserver(@NonNull Observer observer) {
        ObserverWrapper observerWrapperRemove;
        synchronized (this.mObserverMap) {
            observerWrapperRemove = this.mObserverMap.remove(observer);
        }
        if (observerWrapperRemove == null || !this.mObservedTableTracker.onRemoved(observerWrapperRemove.mTableIds)) {
            return;
        }
        syncTriggers();
    }

    public void setAutoCloser(AutoCloser autoCloser) {
        this.mAutoCloser = autoCloser;
        autoCloser.setAutoCloseCallback(new Runnable() { // from class: androidx.room.f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3619b.onAutoCloseCallback();
            }
        });
    }

    public void startMultiInstanceInvalidation(Context context, String str, Intent intent) {
        this.mMultiInstanceInvalidationClient = new MultiInstanceInvalidationClient(context, str, intent, this, this.mDatabase.getQueryExecutor());
    }

    public void stopMultiInstanceInvalidation() {
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.mMultiInstanceInvalidationClient;
        if (multiInstanceInvalidationClient != null) {
            multiInstanceInvalidationClient.stop();
            this.mMultiInstanceInvalidationClient = null;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static abstract class Observer {
        final String[] mTables;

        public Observer(@NonNull String str, String... strArr) {
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
            this.mTables = strArr2;
            strArr2[strArr.length] = str;
        }

        public boolean isRemote() {
            return false;
        }

        public abstract void onInvalidated(@NonNull Set<String> set);

        public Observer(@NonNull String[] strArr) {
            this.mTables = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
    }

    private static void beginTransactionInternal(SupportSQLiteDatabase supportSQLiteDatabase) {
        if (supportSQLiteDatabase.isWriteAheadLoggingEnabled()) {
            supportSQLiteDatabase.beginTransactionNonExclusive();
        } else {
            supportSQLiteDatabase.beginTransaction();
        }
    }

    private String[] validateAndResolveTableNames(String[] strArr) {
        String[] strArrResolveViews = resolveViews(strArr);
        for (String str : strArrResolveViews) {
            if (!this.mTableIdLookup.containsKey(str.toLowerCase(Locale.US))) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
        }
        return strArrResolveViews;
    }

    public void syncTriggers() {
        if (this.mDatabase.isOpen()) {
            syncTriggers(this.mDatabase.getOpenHelper().getWritableDatabase());
        }
    }
}
