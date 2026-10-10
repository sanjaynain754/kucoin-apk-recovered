package o00;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.thread.impl.KThreadPoolImpl;
import com.tencent.rmonitor.base.p144db.table.TrafficInfoTable;
import io.reactivex.Scheduler;
import io.reactivex.android.plugins.RxAndroidPlugins;
import io.reactivex.functions.Function;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o00.f */
/* JADX INFO: compiled from: KSchedulers.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\u0003R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u0014"}, m90084d2 = {"Lo00/f;", "", "<init>", "()V", "Lio/reactivex/Scheduler;", "f", "()Lio/reactivex/Scheduler;", "e", "m", "g", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "b", "Lio/reactivex/Scheduler;", "IOScheduler", "c", "ComputeScheduler", "d", "SingleScheduler", "MainScheduler", "ThreadPool_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C42916f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42916f f95017a = new C42916f();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Scheduler IOScheduler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Scheduler ComputeScheduler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Scheduler SingleScheduler;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Scheduler MainScheduler;

    static {
        Scheduler schedulerFrom = Schedulers.from(KThreadPoolImpl.m58222g());
        Intrinsics.checkNotNullExpressionValue(schedulerFrom, "from(KThreadPoolImpl.IO)");
        IOScheduler = schedulerFrom;
        Scheduler schedulerFrom2 = Schedulers.from(KThreadPoolImpl.m58220e());
        Intrinsics.checkNotNullExpressionValue(schedulerFrom2, "from(KThreadPoolImpl.Compute)");
        ComputeScheduler = schedulerFrom2;
        Scheduler schedulerFrom3 = Schedulers.from(KThreadPoolImpl.m58225k(TrafficInfoTable.COLUMN_RX));
        Intrinsics.checkNotNullExpressionValue(schedulerFrom3, "from(KThreadPoolImpl.newSingle(\"rx\"))");
        SingleScheduler = schedulerFrom3;
        Scheduler schedulerFrom4 = Schedulers.from(KThreadPoolImpl.m58224i());
        Intrinsics.checkNotNullExpressionValue(schedulerFrom4, "from(KThreadPoolImpl.Main)");
        MainScheduler = schedulerFrom4;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final Scheduler m94126e() {
        return ComputeScheduler;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final Scheduler m94127f() {
        return IOScheduler;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final Scheduler m94128g() {
        return MainScheduler;
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m94129h() {
        RxJavaPlugins.setIoSchedulerHandler(new Function() { // from class: o00.b
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C42916f.m94130i((Scheduler) obj);
            }
        });
        RxJavaPlugins.setComputationSchedulerHandler(new Function() { // from class: o00.c
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C42916f.m94131j((Scheduler) obj);
            }
        });
        RxJavaPlugins.setSingleSchedulerHandler(new Function() { // from class: o00.d
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C42916f.m94132k((Scheduler) obj);
            }
        });
        RxAndroidPlugins.setInitMainThreadSchedulerHandler(new Function() { // from class: o00.e
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C42916f.m94133l((Callable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static final Scheduler m94130i(Scheduler it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return IOScheduler;
    }

    /* JADX INFO: renamed from: j */
    public static final Scheduler m94131j(Scheduler it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ComputeScheduler;
    }

    /* JADX INFO: renamed from: k */
    public static final Scheduler m94132k(Scheduler it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SingleScheduler;
    }

    /* JADX INFO: renamed from: l */
    public static final Scheduler m94133l(Callable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return MainScheduler;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final Scheduler m94134m() {
        return SingleScheduler;
    }
}
