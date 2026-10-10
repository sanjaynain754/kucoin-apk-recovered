package o00;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.thread.impl.KThreadPoolImpl;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o00.g */
/* JADX INFO: compiled from: KThreadPool.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0013\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0016\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\u000bR\u001a\u0010\u001b\u001a\u00020\u00178FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m90084d2 = {"Lo00/g;", "", "<init>", "()V", "", "name", "Ljava/util/concurrent/ExecutorService;", "f", "(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/Executor;", "c", "()Ljava/util/concurrent/Executor;", "getIO$annotations", "IO", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "getCompute$annotations", "Compute", "e", "getMain$annotations", "Main", "d", "getLongTime$annotations", "LongTime", "Ljava/util/concurrent/ScheduledExecutorService;", "b", "()Ljava/util/concurrent/ScheduledExecutorService;", "getDelayed$annotations", "Delayed", "ThreadPool_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C42917g {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42917g f95022a = new C42917g();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final ExecutorService m94140f(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return KThreadPoolImpl.m58225k(name);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Executor m94135a() {
        return KThreadPoolImpl.m58220e();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final ScheduledExecutorService m94136b() {
        return KThreadPoolImpl.m58221f();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final Executor m94137c() {
        return KThreadPoolImpl.m58222g();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final Executor m94138d() {
        return KThreadPoolImpl.m58223h();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final Executor m94139e() {
        return KThreadPoolImpl.m58224i();
    }
}
