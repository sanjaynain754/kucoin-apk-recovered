package p840zq;

import androidx.core.util.Pools;
import androidx.media3.exoplayer.upstream.CmcdData;
import ar.MetricsRemoteConfig;
import br.InterfaceC4645a;
import br.InterfaceC4646b;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.kubi.monitor.metrics.bean.CollectorData;
import com.kubi.monitor.metrics.impl.C19229a;
import com.kubi.monitor.metrics.impl.C19230b;
import com.kubi.monitor.metrics.impl.CpuCollector;
import com.tencent.bugly.proguard.C33675gh;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.InterfaceC43845f;
import p569qq.InterfaceC43849j;
import p734wq.C45916a;
import p852kotlin.Metadata;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: zq.e */
/* JADX INFO: compiled from: MetricsManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00104¨\u00066"}, m90084d2 = {"Lzq/e;", "Lqq/j;", "<init>", "()V", "", "p", "i", "", "appStatus", "r", "(Z)V", "Lqq/f;", "page", "", JAnalysisConstants.ACCOUNT_EXTRA_ATTR, "b", "(Lqq/f;Ljava/lang/String;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "dataType", "g", "(I)Z", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Z", CmcdData.Factory.STREAM_TYPE_LIVE, "()I", "Lar/a;", "m", "()Lar/a;", "Landroidx/core/util/Pools$Pool;", "Lcom/kubi/monitor/metrics/bean/CollectorData;", "Landroidx/core/util/Pools$Pool;", "k", "()Landroidx/core/util/Pools$Pool;", "dataPool", "Ljava/util/concurrent/ScheduledExecutorService;", "c", "Ljava/util/concurrent/ScheduledExecutorService;", "runtimeExecutor", "", "Lbr/a;", "d", "Ljava/util/Set;", "collectors", "Lbr/b;", "e", "Lbr/b;", "processor", "Ljava/util/concurrent/ScheduledFuture;", "f", "Ljava/util/concurrent/ScheduledFuture;", "scheduleJob", "Lar/a;", "remoteConfig", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C46908e implements InterfaceC43849j {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46908e f104773a = new C46908e();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Pools.Pool<CollectorData> dataPool = new Pools.SynchronizedPool(20);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final ScheduledExecutorService runtimeExecutor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Set<InterfaceC4645a> collectors;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC4646b processor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public static ScheduledFuture<?> scheduleJob;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public static MetricsRemoteConfig remoteConfig;

    /* JADX INFO: renamed from: g */
    public final boolean m103321g(int dataType) {
        if (dataType == 1) {
            return m103326m().getIsCpuOpen();
        }
        if (dataType != 2) {
            return true;
        }
        return m103326m().getIsMemOpen();
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC46909f(C33675gh.f70007m));
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "newSingleThreadScheduled…ThreadFactory(\"metrics\"))");
        runtimeExecutor = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        collectors = SetsKt.mutableSetOf(new C19229a(), new CpuCollector());
        processor = new C19230b();
    }

    /* JADX INFO: renamed from: j */
    public static final void m103317j() {
        processor.release();
    }

    /* JADX INFO: renamed from: n */
    public static final void m103318n(InterfaceC43845f page, String str) {
        Intrinsics.checkNotNullParameter(page, "$page");
        C44128b.m97259c("MetricsManager", Intrinsics.stringPlus("page hide ", page.getF43551V()));
        processor.mo4595b(page.getF43551V(), str);
    }

    /* JADX INFO: renamed from: o */
    public static final void m103319o(InterfaceC43845f page, String str) {
        Intrinsics.checkNotNullParameter(page, "$page");
        C44128b.m97259c("MetricsManager", Intrinsics.stringPlus("page show ", page.getF43551V()));
        processor.mo4594a(page.getF43551V(), str);
    }

    /* JADX INFO: renamed from: q */
    public static final void m103320q() {
        try {
            for (InterfaceC4645a interfaceC4645a : collectors) {
                if (f104773a.m103321g(interfaceC4645a.mo4592a())) {
                    processor.mo4596c(interfaceC4645a.mo4593b());
                }
            }
        } catch (Exception e11) {
            if (!(e11 instanceof CancellationException)) {
                C45916a.m101366a(e11, "MetricsManager");
            }
            C44128b.m97266j("MetricsManager", e11.getStackTrace().toString());
        }
    }

    @Override // p569qq.InterfaceC43849j
    /* JADX INFO: renamed from: a */
    public void mo42473a(@NotNull final InterfaceC43845f page, @Nullable final String extra) {
        Intrinsics.checkNotNullParameter(page, "page");
        runtimeExecutor.execute(new Runnable() { // from class: zq.b
            @Override // java.lang.Runnable
            public final void run() {
                C46908e.m103318n(page, extra);
            }
        });
    }

    @Override // p569qq.InterfaceC43849j
    /* JADX INFO: renamed from: b */
    public void mo42474b(@NotNull final InterfaceC43845f page, @Nullable final String extra) {
        Intrinsics.checkNotNullParameter(page, "page");
        runtimeExecutor.execute(new Runnable() { // from class: zq.d
            @Override // java.lang.Runnable
            public final void run() {
                C46908e.m103319o(page, extra);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m103323i() {
        C44128b.m97259c("MetricsManager", "cancel runtime monitor");
        ScheduledFuture<?> scheduledFuture = scheduleJob;
        if ((scheduledFuture == null ? null : Boolean.valueOf(scheduledFuture.cancel(true))) == null) {
            return;
        }
        scheduleJob = null;
        runtimeExecutor.execute(new Runnable() { // from class: zq.a
            @Override // java.lang.Runnable
            public final void run() {
                C46908e.m103317j();
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final Pools.Pool<CollectorData> m103324k() {
        return dataPool;
    }

    /* JADX INFO: renamed from: m */
    public final MetricsRemoteConfig m103326m() {
        if (remoteConfig == null) {
            remoteConfig = new MetricsRemoteConfig(0, false, false, 7, null);
        }
        MetricsRemoteConfig metricsRemoteConfig = remoteConfig;
        if (metricsRemoteConfig == null) {
            return new MetricsRemoteConfig(0, false, false, 7, null);
        }
        Intrinsics.checkNotNull(metricsRemoteConfig);
        return metricsRemoteConfig;
    }

    /* JADX INFO: renamed from: r */
    public final void m103328r(boolean appStatus) {
        if (appStatus) {
            m103327p();
        } else {
            m103323i();
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m103322h() {
        if (m103325l() != -1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final int m103325l() {
        return m103326m().getInterval();
    }

    /* JADX INFO: renamed from: p */
    public final void m103327p() {
        if (!m103322h()) {
            C44128b.m97259c("MetricsManager", "remote config stop");
            return;
        }
        C44128b.m97259c("MetricsManager", "start runtime monitor");
        ScheduledFuture<?> scheduledFuture = scheduleJob;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        scheduleJob = runtimeExecutor.scheduleWithFixedDelay(new Runnable() { // from class: zq.c
            @Override // java.lang.Runnable
            public final void run() {
                C46908e.m103320q();
            }
        }, 0L, m103325l(), TimeUnit.SECONDS);
    }
}
