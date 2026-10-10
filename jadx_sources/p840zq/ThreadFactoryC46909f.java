package p840zq;

import java.util.concurrent.ThreadFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zq.f */
/* JADX INFO: compiled from: MetricsThreadFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lzq/f;", "Ljava/util/concurrent/ThreadFactory;", "", "prefix", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "b", "Ljava/lang/String;", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class ThreadFactoryC46909f implements ThreadFactory {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String prefix;

    public ThreadFactoryC46909f(@NotNull String prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        this.prefix = prefix;
    }

    @Override // java.util.concurrent.ThreadFactory
    @NotNull
    public Thread newThread(@Nullable Runnable runnable) {
        Thread thread = new Thread(runnable, this.prefix);
        thread.setDaemon(true);
        return thread;
    }
}
