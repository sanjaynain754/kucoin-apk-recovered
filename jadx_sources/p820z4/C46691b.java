package p820z4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: z4.b */
/* JADX INFO: compiled from: AnimationLoaderExecutor.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u001c\u0010\u0010\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m90084d2 = {"Lz4/b;", "", "<init>", "()V", "Ljava/lang/Runnable;", "task", "", "b", "(Ljava/lang/Runnable;)V", "Ljava/util/concurrent/ThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "frameThreadFactory", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "c", "Ljava/util/concurrent/ExecutorService;", "executor", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C46691b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46691b f104529a = new C46691b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final ThreadFactory frameThreadFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final ExecutorService executor;

    static {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: z4.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return C46691b.m102927c(runnable);
            }
        };
        frameThreadFactory = threadFactory;
        executor = Executors.newCachedThreadPool(threadFactory);
    }

    /* JADX INFO: renamed from: c */
    public static final Thread m102927c(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(1);
        return thread;
    }

    /* JADX INFO: renamed from: b */
    public final void m102928b(@NotNull Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        executor.execute(task);
    }
}
