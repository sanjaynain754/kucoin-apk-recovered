package com.kubi.sdk.log.realtime.cache;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.kumex.data.market.model.FundingRateEntity;
import com.kubi.sdk.log.realtime.RealTimeReporter;
import com.kubi.sdk.log.realtime.p116db.LogData;
import com.kubi.sdk.log.realtime.p116db.RealLogDBProxy;
import com.kubi.utils.C27100x0;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p519oz.InterfaceC43338a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: LogCache.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0003\u001c4 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u0003J\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0003J\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0018\u0010\rJ\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0003R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010$\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, m90084d2 = {"Lcom/kubi/sdk/log/realtime/cache/LogCache;", "", "<init>", "()V", "Lcom/kubi/sdk/log/realtime/cache/LogCache$b;", TUIConstants.TUIChat.CALL_BACK, "", "q", "(Lcom/kubi/sdk/log/realtime/cache/LogCache$b;)V", "", "Lcom/kubi/sdk/log/realtime/db/LogData;", "logs", "t", "(Ljava/util/List;)V", CmcdData.Factory.STREAM_TYPE_LIVE, CmcdData.Factory.STREAMING_FORMAT_HLS, "log", "g", "(Lcom/kubi/sdk/log/realtime/db/LogData;)V", "", TUIConstants.TUIContact.LIMIT, "Lcom/kubi/sdk/log/realtime/cache/LogCache$a;", "o", "(I)Lcom/kubi/sdk/log/realtime/cache/LogCache$a;", "m", "j", "r", "Lcom/kubi/sdk/log/realtime/cache/f;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/kubi/sdk/log/realtime/cache/f;", "logMemCache", "Lcom/kubi/sdk/log/realtime/db/RealLogDBProxy;", "b", "Lkotlin/Lazy;", "p", "()Lcom/kubi/sdk/log/realtime/db/RealLogDBProxy;", "logDbCache", "Ljava/util/concurrent/atomic/AtomicInteger;", "c", "Ljava/util/concurrent/atomic/AtomicInteger;", "dbCacheCount", "", "d", "J", "lastCleanTimeStamp", "e", "Lcom/kubi/sdk/log/realtime/cache/LogCache$b;", "logCacheCallback", "Ljava/util/concurrent/ExecutorService;", "f", "Ljava/util/concurrent/ExecutorService;", "dbThread", "Companion", "Logger-realtime_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLogCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogCache.kt\ncom/kubi/sdk/log/realtime/cache/LogCache\n+ 2 RealLogger.kt\ncom/kubi/sdk/log/realtime/utils/RealLoggerKt\n*L\n1#1,214:1\n16#2,4:215\n16#2,4:219\n*S KotlinDebug\n*F\n+ 1 LogCache.kt\ncom/kubi/sdk/log/realtime/cache/LogCache\n*L\n125#1:215,4\n129#1:219,4\n*E\n"})
public final class LogCache {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long lastCleanTimeStamp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public InterfaceC23877b logCacheCallback;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C23883f<LogData> logMemCache = new C23883f<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy logDbCache = LazyKt.lazy(new Function0<RealLogDBProxy>() { // from class: com.kubi.sdk.log.realtime.cache.LogCache$logDbCache$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @Nullable
        public final RealLogDBProxy invoke() {
            return RealLogDBProxy.INSTANCE.getInstance();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AtomicInteger dbCacheCount = new AtomicInteger(0);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final ExecutorService dbThread = C42917g.m94140f("logger-db-thread");

    /* JADX INFO: renamed from: com.kubi.sdk.log.realtime.cache.LogCache$a, reason: from toString */
    /* JADX INFO: compiled from: LogCache.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/sdk/log/realtime/cache/LogCache$a;", "", "", "Lcom/kubi/sdk/log/realtime/db/LogData;", "logs", "", "isFromMem", "<init>", "(Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/List;", "()Ljava/util/List;", "b", "Z", "()Z", "Logger-realtime_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final /* data */ class CacheDataWrapper {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<LogData> logs;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean isFromMem;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CacheDataWrapper)) {
                return false;
            }
            CacheDataWrapper cacheDataWrapper = (CacheDataWrapper) other;
            return Intrinsics.areEqual(this.logs, cacheDataWrapper.logs) && this.isFromMem == cacheDataWrapper.isFromMem;
        }

        public CacheDataWrapper(@NotNull List<LogData> logs, boolean z11) {
            Intrinsics.checkNotNullParameter(logs, "logs");
            this.logs = logs;
            this.isFromMem = z11;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<LogData> m57231a() {
            return this.logs;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsFromMem() {
            return this.isFromMem;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            int iHashCode = this.logs.hashCode() * 31;
            boolean z11 = this.isFromMem;
            ?? r11 = z11;
            if (z11) {
                r11 = 1;
            }
            return iHashCode + r11;
        }

        @NotNull
        public String toString() {
            return "CacheDataWrapper(logs=" + this.logs + ", isFromMem=" + this.isFromMem + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.log.realtime.cache.LogCache$b */
    /* JADX INFO: compiled from: LogCache.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/sdk/log/realtime/cache/LogCache$b;", "", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "Logger-realtime_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface InterfaceC23877b {
        /* JADX INFO: renamed from: a */
        void mo57203a();
    }

    /* JADX INFO: renamed from: i */
    public static final void m57216i(final LogCache this$0, final RealLogDBProxy dbCache) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dbCache, "$dbCache");
        C27100x0.m66923d(new Function0<Unit>() { // from class: com.kubi.sdk.log.realtime.cache.LogCache$clearAll$1$1
            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.dbCacheCount.set(0);
                dbCache.mo57238d().deleteAll();
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static final void m57217k(final LogCache this$0, final RealLogDBProxy dbCache) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dbCache, "$dbCache");
        C27100x0.m66923d(new Function0<Unit>() { // from class: com.kubi.sdk.log.realtime.cache.LogCache$clearExpiredData$1$1
            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.this$0.dbCacheCount.get() > 2000) {
                    dbCache.mo57238d().mo95409e(1000);
                }
                dbCache.mo57238d().mo95407c(System.currentTimeMillis() - 604800000);
                this.this$0.dbCacheCount.set(dbCache.mo57238d().mo95405a());
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static final void m57218n(final RealLogDBProxy dbCache, final List logs, final LogCache this$0) {
        Intrinsics.checkNotNullParameter(dbCache, "$dbCache");
        Intrinsics.checkNotNullParameter(logs, "$logs");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C27100x0.m66923d(new Function0<Unit>() { // from class: com.kubi.sdk.log.realtime.cache.LogCache$deleteDBCache$1$1
            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                dbCache.mo57238d().mo95408d(logs);
                this$0.dbCacheCount.addAndGet(-logs.size());
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static final void m57219s(final RealLogDBProxy dbCache, final LogCache this$0) {
        Intrinsics.checkNotNullParameter(dbCache, "$dbCache");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C27100x0.m66923d(new Function0<Unit>() { // from class: com.kubi.sdk.log.realtime.cache.LogCache$initDbCountAsync$1$1
            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this$0.dbCacheCount.set(dbCache.mo57238d().mo95405a());
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static final void m57220u(final RealLogDBProxy dbCache, final List logs, final LogCache this$0) {
        Intrinsics.checkNotNullParameter(dbCache, "$dbCache");
        Intrinsics.checkNotNullParameter(logs, "$logs");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C27100x0.m66923d(new Function0<Unit>() { // from class: com.kubi.sdk.log.realtime.cache.LogCache$saveToDBCache$1$1
            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                dbCache.mo57238d().mo95410f(logs);
                this$0.dbCacheCount.addAndGet(logs.size());
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m57221g(@NotNull LogData log) {
        InterfaceC23877b interfaceC23877b;
        Intrinsics.checkNotNullParameter(log, "log");
        this.logMemCache.m57233a(log);
        if (this.logMemCache.m57236d() == 30 && (interfaceC23877b = this.logCacheCallback) != null) {
            interfaceC23877b.mo57203a();
        }
        if (this.logMemCache.m57236d() > 30) {
            C23883f<LogData> c23883f = this.logMemCache;
            m57230t(c23883f.m57235c(c23883f.m57236d()));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m57223j() {
        if (RealTimeReporter.f46947a.m57189j().isDBOpen() && System.currentTimeMillis() - this.lastCleanTimeStamp >= FundingRateEntity.MILLIS_PER_HOUR) {
            this.lastCleanTimeStamp = System.currentTimeMillis();
            final RealLogDBProxy realLogDBProxyM57227p = m57227p();
            if (realLogDBProxyM57227p == null) {
                return;
            }
            this.dbThread.execute(new Runnable() { // from class: com.kubi.sdk.log.realtime.cache.c
                @Override // java.lang.Runnable
                public final void run() {
                    LogCache.m57217k(this.f46973b, realLogDBProxyM57227p);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m57224l() {
        this.logMemCache.m57234b();
    }

    /* JADX INFO: renamed from: m */
    public final void m57225m(@NotNull final List<LogData> logs) {
        final RealLogDBProxy realLogDBProxyM57227p;
        Intrinsics.checkNotNullParameter(logs, "logs");
        if (RealTimeReporter.f46947a.m57189j().isDBOpen() && (realLogDBProxyM57227p = m57227p()) != null) {
            this.dbThread.execute(new Runnable() { // from class: com.kubi.sdk.log.realtime.cache.d
                @Override // java.lang.Runnable
                public final void run() {
                    LogCache.m57218n(realLogDBProxyM57227p, logs, this);
                }
            });
        }
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final CacheDataWrapper m57226o(int limit) {
        boolean z11;
        InterfaceC43338a interfaceC43338aMo57238d;
        ArrayList arrayList = new ArrayList(limit);
        if (this.logMemCache.m57236d() > 20) {
            if (this.logMemCache.m57236d() > 0) {
                C23883f<LogData> c23883f = this.logMemCache;
                arrayList.addAll(c23883f.m57235c(c23883f.m57236d()));
            }
            z11 = true;
        } else {
            if (this.dbCacheCount.get() > 0 && RealTimeReporter.f46947a.m57189j().isDBOpen()) {
                try {
                    RealLogDBProxy realLogDBProxyM57227p = m57227p();
                    List<LogData> listMo95406b = (realLogDBProxyM57227p == null || (interfaceC43338aMo57238d = realLogDBProxyM57227p.mo57238d()) == null) ? null : interfaceC43338aMo57238d.mo95406b(limit);
                    if (listMo95406b == null || listMo95406b.isEmpty()) {
                        this.dbCacheCount.set(0);
                    } else {
                        arrayList.addAll(listMo95406b);
                    }
                } catch (Exception e11) {
                    C44128b.m97261e("Logger::LogCache", "getDataWithLimit get from db err " + e11.getMessage());
                }
            }
            z11 = false;
        }
        return new CacheDataWrapper(arrayList, z11);
    }

    /* JADX INFO: renamed from: p */
    public final RealLogDBProxy m57227p() {
        return (RealLogDBProxy) this.logDbCache.getValue();
    }

    /* JADX INFO: renamed from: q */
    public final void m57228q(@NotNull InterfaceC23877b callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.logCacheCallback = callback;
        m57229r();
    }

    /* JADX INFO: renamed from: r */
    public final void m57229r() {
        final RealLogDBProxy realLogDBProxyM57227p;
        if (RealTimeReporter.f46947a.m57189j().isDBOpen() && (realLogDBProxyM57227p = m57227p()) != null) {
            this.dbThread.execute(new Runnable() { // from class: com.kubi.sdk.log.realtime.cache.b
                @Override // java.lang.Runnable
                public final void run() {
                    LogCache.m57219s(realLogDBProxyM57227p, this);
                }
            });
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m57230t(@NotNull final List<LogData> logs) {
        final RealLogDBProxy realLogDBProxyM57227p;
        Intrinsics.checkNotNullParameter(logs, "logs");
        if (RealTimeReporter.f46947a.m57189j().isDBOpen() && (realLogDBProxyM57227p = m57227p()) != null) {
            this.dbThread.execute(new Runnable() { // from class: com.kubi.sdk.log.realtime.cache.e
                @Override // java.lang.Runnable
                public final void run() {
                    LogCache.m57220u(realLogDBProxyM57227p, logs, this);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m57222h() {
        final RealLogDBProxy realLogDBProxyM57227p;
        m57224l();
        if (!RealTimeReporter.f46947a.m57189j().isDBOpen() || (realLogDBProxyM57227p = m57227p()) == null) {
            return;
        }
        this.dbThread.execute(new Runnable() { // from class: com.kubi.sdk.log.realtime.cache.a
            @Override // java.lang.Runnable
            public final void run() {
                LogCache.m57216i(this.f46969b, realLogDBProxyM57227p);
            }
        });
    }
}
