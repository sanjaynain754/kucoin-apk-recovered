package w90;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: w90.k */
/* JADX INFO: compiled from: ThreadPool.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m90084d2 = {"Lw90/k;", "", "<init>", "()V", "Ljava/util/concurrent/ThreadPoolExecutor;", "b", "Ljava/util/concurrent/ThreadPoolExecutor;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/util/concurrent/ThreadPoolExecutor;", "getExecutor$annotations", "executor", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C45772k {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45772k f103203a = new C45772k();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final ThreadPoolExecutor executor = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors() + 1, Runtime.getRuntime().availableProcessors() + 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a());

    /* JADX INFO: renamed from: w90.k$a */
    /* JADX INFO: compiled from: ThreadPool.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, m90084d2 = {"w90/k$a", "Ljava/util/concurrent/ThreadFactory;", "Ljava/lang/Runnable;", "r", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "Ljava/util/concurrent/atomic/AtomicInteger;", "b", "Ljava/util/concurrent/atomic/AtomicInteger;", "count", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class a implements ThreadFactory {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final AtomicInteger count = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public Thread newThread(@NotNull Runnable r11) {
            Intrinsics.checkNotNullParameter(r11, "r");
            return new Thread(r11, Intrinsics.stringPlus("TranscoderThread #", Integer.valueOf(this.count.getAndIncrement())));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ThreadPoolExecutor m101086a() {
        return executor;
    }
}
