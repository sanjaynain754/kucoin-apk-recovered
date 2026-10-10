package androidx.camera.camera2.internal;

import androidx.camera.core.Logger;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoUsageControl.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Landroidx/camera/camera2/internal/VideoUsageControl;", "", "executor", "Ljava/util/concurrent/Executor;", "<init>", "(Ljava/util/concurrent/Executor;)V", "mVideoUsage", "Ljava/util/concurrent/atomic/AtomicInteger;", "incrementUsage", "", "decrementUsage", "reset", "resetDirectly", "getUsage", "", "camera-camera2_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class VideoUsageControl {

    @NotNull
    private final Executor executor;

    @NotNull
    private final AtomicInteger mVideoUsage;

    public VideoUsageControl(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.executor = executor;
        this.mVideoUsage = new AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void decrementUsage$lambda$1(VideoUsageControl videoUsageControl) {
        int iDecrementAndGet = videoUsageControl.mVideoUsage.decrementAndGet();
        if (iDecrementAndGet >= 0) {
            Logger.m1866d("VideoUsageControl", "decrementUsage: mVideoUsage = " + iDecrementAndGet);
            return;
        }
        Logger.m1872w("VideoUsageControl", "decrementUsage: mVideoUsage = " + iDecrementAndGet + ", which is less than 0!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void incrementUsage$lambda$0(VideoUsageControl videoUsageControl) {
        Logger.m1866d("VideoUsageControl", "incrementUsage: mVideoUsage = " + videoUsageControl.mVideoUsage.incrementAndGet());
    }

    public final void decrementUsage() {
        this.executor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.n4
            @Override // java.lang.Runnable
            public final void run() {
                VideoUsageControl.decrementUsage$lambda$1(this.f1416b);
            }
        });
    }

    public final int getUsage() {
        return this.mVideoUsage.get();
    }

    public final void incrementUsage() {
        this.executor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.p4
            @Override // java.lang.Runnable
            public final void run() {
                VideoUsageControl.incrementUsage$lambda$0(this.f1439b);
            }
        });
    }

    public final void reset() {
        this.executor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.o4
            @Override // java.lang.Runnable
            public final void run() {
                this.f1430b.resetDirectly();
            }
        });
    }

    public final void resetDirectly() {
        this.mVideoUsage.set(0);
        Logger.m1866d("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }
}
