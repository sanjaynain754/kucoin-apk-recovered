package p617s5;

import android.os.Process;
import com.tencent.bugly.proguard.C33820nf;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: s5.u */
/* JADX INFO: compiled from: PriorityThreadFactory.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m90084d2 = {"Ls5/u;", "Ljava/util/concurrent/ThreadFactory;", "", "threadPriority", "", "prefix", "", "addThreadNumber", "<init>", "(ILjava/lang/String;Z)V", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "b", "I", "c", "Ljava/lang/String;", "d", "Z", "Ljava/util/concurrent/atomic/AtomicInteger;", "e", "Ljava/util/concurrent/atomic/AtomicInteger;", "threadNumber", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ThreadFactoryC44349u implements ThreadFactory {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int threadPriority;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String prefix;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean addThreadNumber;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final AtomicInteger threadNumber;

    @JvmOverloads
    public ThreadFactoryC44349u(int i11, @NotNull String prefix, boolean z11) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        this.threadPriority = i11;
        this.prefix = prefix;
        this.addThreadNumber = z11;
        this.threadNumber = new AtomicInteger(1);
    }

    /* JADX INFO: renamed from: b */
    public static final void m97815b(ThreadFactoryC44349u this$0, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        try {
            Process.setThreadPriority(this$0.threadPriority);
        } catch (Throwable unused) {
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    @NotNull
    public Thread newThread(@NotNull final Runnable runnable) {
        String str;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Runnable runnable2 = new Runnable() { // from class: s5.t
            @Override // java.lang.Runnable
            public final void run() {
                ThreadFactoryC44349u.m97815b(this.f97990b, runnable);
            }
        };
        if (this.addThreadNumber) {
            str = this.prefix + C33820nf.f71144W + this.threadNumber.getAndIncrement();
        } else {
            str = this.prefix;
        }
        return new Thread(runnable2, str);
    }
}
