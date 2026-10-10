package com.kubi.sdk.util;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.blankj.utilcode.util.C5264d;
import com.blankj.utilcode.util.C5287o0;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import ro.C44128b;

/* JADX INFO: compiled from: TimeSyncManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0087\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t*\u0001!\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010,\u001a\u00020-J\u0006\u0010.\u001a\u00020\u0013J\u0006\u00100\u001a\u00020\u0013J(\u00101\u001a\u00020\f2\b\b\u0002\u00102\u001a\u00020\u00132\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\n\b\u0002\u00105\u001a\u0004\u0018\u000106J\u000e\u00107\u001a\u00020-2\u0006\u00108\u001a\u00020\fJ\u0012\u00109\u001a\u00020-2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u0012\u0010<\u001a\u00020-2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010=\u001a\u00020-H\u0002J\b\u0010>\u001a\u00020-H\u0002J*\u0010?\u001a\u00020-2 \u0010@\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020-0AH\u0002J\b\u0010B\u001a\u00020-H\u0002J\b\u0010C\u001a\u00020-H\u0002J\b\u0010D\u001a\u00020-H\u0002J\u0018\u0010E\u001a\u00020\u00132\u0006\u0010F\u001a\u00020\u00132\u0006\u0010G\u001a\u00020\u0013H\u0002J\b\u0010H\u001a\u00020-H\u0002J\b\u0010I\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u001f\u0010&\u001a\u00060'j\u0002`(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b)\u0010*R\u000e\u0010/\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006J"}, m90084d2 = {"Lcom/kubi/sdk/util/TimeSyncManager;", "Lcom/blankj/utilcode/util/Utils$OnAppStatusChangedListener;", "<init>", "()V", "TAG", "", "mainHandler", "Landroid/os/Handler;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "tasks", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/kubi/sdk/util/KCCountdownTask;", "nextId", "Ljava/util/concurrent/atomic/AtomicInteger;", "isTimerRunning", "", "timeOffset", "", "Ljava/lang/Long;", "beforeServerTimeMills", "requestTimeCost", "retryDelayStart", "retryDelay", "retrySeq", "retryMaxCount", "lock", "", "multiApi", "Lcom/kubi/sdk/util/ISyncServerApi;", "kotlin.jvm.PlatformType", "tickRunnable", "com/kubi/sdk/util/TimeSyncManager$tickRunnable$2$1", "getTickRunnable", "()Lcom/kubi/sdk/util/TimeSyncManager$tickRunnable$2$1;", "tickRunnable$delegate", "Lkotlin/Lazy;", "retrySyncTimeRunnable", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "getRetrySyncTimeRunnable", "()Ljava/lang/Runnable;", "retrySyncTimeRunnable$delegate", "init", "", "getServerTime", "ONE_MINUTE", "getServerTimeInMills", "addCountDownTask", "serverTime", "countDownCallback", "Lcom/kubi/sdk/util/CountDownCallback;", "completion", "Lcom/kubi/sdk/util/CountDownFinishCallback;", "removeCountDownTask", "id", "onForeground", "activity", "Landroid/app/Activity;", "onBackground", "syncServerTime", "resetRetry", "fetchServerTime", "onResult", "Lkotlin/Function3;", "startTickTimer", "stopTickTimerIfNeeded", "countDown", "getRemainingSecond", "openTimeMills", "curTimeMills", "retryFetchTimer", "getBaseTimeLine", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTimeSyncManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSyncManager.kt\ncom/kubi/sdk/util/TimeSyncManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,261:1\n1#2:262\n*E\n"})
public final class TimeSyncManager implements C5287o0.b {

    /* JADX INFO: renamed from: f */
    public static boolean f48128f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public static volatile Long f48129g;

    /* JADX INFO: renamed from: h */
    public static long f48130h;

    /* JADX INFO: renamed from: l */
    public static int f48134l;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TimeSyncManager f48123a = new TimeSyncManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Handler f48124b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final InterfaceC41709m0 f48125c = C41713n0.m91125a(C41727q2.m91192b(null, 1, null).plus(C41782z0.m91392b()));

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final ConcurrentHashMap<Integer, KCCountdownTask> f48126d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final AtomicInteger f48127e = new AtomicInteger(0);

    /* JADX INFO: renamed from: i */
    public static long f48131i = Long.MAX_VALUE;

    /* JADX INFO: renamed from: j */
    public static long f48132j = 1000;

    /* JADX INFO: renamed from: k */
    public static long f48133k = 1000;

    /* JADX INFO: renamed from: m */
    public static int f48135m = 3;

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Object f48136n = new Object();

    /* JADX INFO: renamed from: o */
    public static final ISyncServerApi f48137o = (ISyncServerApi) C42597a.m93388d().create(ISyncServerApi.class);

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final Lazy f48138p = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.util.o1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TimeSyncManager.m58348B();
        }
    });

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final Lazy f48139q = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.util.p1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TimeSyncManager.m58357v();
        }
    });

    /* JADX INFO: renamed from: com.kubi.sdk.util.TimeSyncManager$a */
    /* JADX INFO: compiled from: TimeSyncManager.kt */
    /* JADX INFO: loaded from: classes43.dex */
    @Metadata(m90083d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00060\u0001j\u0002`\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m90084d2 = {"com/kubi/sdk/util/TimeSyncManager$tickRunnable$2$1", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "run", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class RunnableC24214a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            TimeSyncManager.f48123a.m58360j();
            TimeSyncManager.f48124b.postDelayed(this, 1000L);
        }
    }

    /* JADX INFO: renamed from: m */
    public final long m58363m(long j11, long j12) {
        return RangesKt.coerceAtLeast((j11 - j12) / ((long) 1000), 0L);
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m58347A(Long l11, long j11, long j12) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("serverTimeMills:");
        sb2.append(l11);
        sb2.append(", curTime:");
        sb2.append(System.currentTimeMillis());
        sb2.append(", reqTimeCost:");
        long j13 = j12 - j11;
        sb2.append(j13);
        C44128b.m97266j("TimeSyncManager", sb2.toString());
        if (l11 != null) {
            f48123a.m58370t();
            if (j13 < f48131i && f48130h != l11.longValue()) {
                f48130h = l11.longValue();
                f48129g = Long.valueOf((l11.longValue() - (j13 / ((long) 2))) - j11);
                f48131i = j13;
            }
        } else {
            f48133k *= (long) 2;
            int i11 = f48134l + 1;
            f48134l = i11;
            if (i11 > f48135m) {
                f48123a.m58370t();
            } else {
                f48123a.m58371u();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public static final RunnableC24214a m58348B() {
        return new RunnableC24214a();
    }

    /* JADX INFO: renamed from: v */
    public static final Runnable m58357v() {
        return new Runnable() { // from class: com.kubi.sdk.util.r1
            @Override // java.lang.Runnable
            public final void run() {
                TimeSyncManager.m58358w();
            }
        };
    }

    /* JADX INFO: renamed from: w */
    public static final void m58358w() {
        f48123a.m58374z();
    }

    /* JADX INFO: renamed from: i */
    public final int m58359i(long j11, @Nullable CountDownCallback countDownCallback, @Nullable CountDownFinishCallback countDownFinishCallback) {
        if (countDownCallback != null) {
            countDownCallback.mo20702l2(m58363m(j11, m58366p()));
        }
        int iIncrementAndGet = f48127e.incrementAndGet();
        f48126d.put(Integer.valueOf(iIncrementAndGet), new KCCountdownTask(iIncrementAndGet, j11, countDownCallback, countDownFinishCallback));
        m58372x();
        return iIncrementAndGet;
    }

    /* JADX INFO: renamed from: k */
    public final void m58361k(Function3<? super Long, ? super Long, ? super Long, Unit> function3) {
        C41696j.m91104d(f48125c, null, null, new TimeSyncManager$fetchServerTime$1(function3, null), 3, null);
    }

    /* JADX INFO: renamed from: n */
    public final Runnable m58364n() {
        return (Runnable) f48139q.getValue();
    }

    /* JADX INFO: renamed from: q */
    public final RunnableC24214a m58367q() {
        return (RunnableC24214a) f48138p.getValue();
    }

    /* JADX INFO: renamed from: s */
    public final void m58369s(int i11) {
        f48126d.remove(Integer.valueOf(i11));
        m58373y();
    }

    /* JADX INFO: renamed from: t */
    public final void m58370t() {
        f48133k = f48132j;
        f48134l = 0;
    }

    /* JADX INFO: renamed from: u */
    public final void m58371u() {
        Handler handler = f48124b;
        handler.removeCallbacks(m58364n());
        handler.postDelayed(m58364n(), f48133k);
    }

    /* JADX INFO: renamed from: x */
    public final void m58372x() {
        if (f48126d.isEmpty() || f48128f) {
            return;
        }
        synchronized (f48136n) {
            if (f48128f) {
                return;
            }
            f48128f = true;
            Handler handler = f48124b;
            TimeSyncManager timeSyncManager = f48123a;
            handler.removeCallbacks(timeSyncManager.m58367q());
            handler.post(timeSyncManager.m58367q());
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m58373y() {
        if (f48126d.isEmpty()) {
            synchronized (f48136n) {
                f48124b.removeCallbacks(f48123a.m58367q());
                f48128f = false;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m58374z() {
        m58361k(new Function3() { // from class: com.kubi.sdk.util.q1
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return TimeSyncManager.m58347A((Long) obj, ((Long) obj2).longValue(), ((Long) obj3).longValue());
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m58360j() {
        long jM58366p = m58366p();
        Iterator<Map.Entry<Integer, KCCountdownTask>> it = f48126d.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, KCCountdownTask> next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            KCCountdownTask value = next.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
            KCCountdownTask kCCountdownTask = value;
            long jM58363m = m58363m(kCCountdownTask.getF48155b(), jM58366p);
            if (jM58363m <= 0) {
                CountDownCallback f48156c = kCCountdownTask.getF48156c();
                if (f48156c != null) {
                    f48156c.mo20702l2(0L);
                }
                CountDownFinishCallback f48157d = kCCountdownTask.getF48157d();
                if (f48157d != null) {
                    f48157d.finish();
                }
                it.remove();
            } else {
                CountDownCallback f48156c2 = kCCountdownTask.getF48156c();
                if (f48156c2 != null) {
                    f48156c2.mo20702l2(jM58363m);
                }
            }
        }
        m58373y();
    }

    /* JADX INFO: renamed from: l */
    public final long m58362l() {
        return SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: o */
    public final long m58365o() {
        return m58366p() / ((long) 1000);
    }

    @Override // com.blankj.utilcode.util.C5287o0.b
    public void onForeground(@Nullable Activity activity) {
        m58374z();
    }

    /* JADX INFO: renamed from: p */
    public final long m58366p() {
        long jLongValue;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l11 = f48129g;
        if (l11 != null) {
            jLongValue = l11.longValue() + f48123a.m58362l();
        } else {
            jLongValue = jCurrentTimeMillis;
        }
        if (Math.abs(jLongValue - jCurrentTimeMillis) < 60000) {
            return jCurrentTimeMillis;
        }
        return jLongValue;
    }

    /* JADX INFO: renamed from: r */
    public final void m58368r() {
        m58374z();
        C5264d.unregisterAppStatusChangedListener(this);
        C5264d.registerAppStatusChangedListener(this);
    }

    @Override // com.blankj.utilcode.util.C5287o0.b
    public void onBackground(@Nullable Activity activity) {
    }
}
