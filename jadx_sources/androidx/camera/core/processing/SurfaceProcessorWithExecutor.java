package androidx.camera.core.processing;

import androidx.annotation.IntRange;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.Logger;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceProcessor;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.core.util.Consumer;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes23.dex */
public class SurfaceProcessorWithExecutor implements SurfaceProcessorInternal {
    private static final String TAG = "SurfaceProcessor";
    private final Consumer<Throwable> mErrorListener;
    private final Executor mExecutor;
    private final SurfaceProcessor mSurfaceProcessor;

    @VisibleForTesting
    public Executor getExecutor() {
        return this.mExecutor;
    }

    @VisibleForTesting
    public SurfaceProcessor getProcessor() {
        return this.mSurfaceProcessor;
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onInputSurface(final SurfaceRequest surfaceRequest) {
        try {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.core.processing.h0
                @Override // java.lang.Runnable
                public final void run() {
                    SurfaceProcessorWithExecutor.m2036b(this.f1805b, surfaceRequest);
                }
            });
        } catch (RejectedExecutionException unused) {
            Logger.m1868e(TAG, "SurfaceProcessor failed due to executor shutdown");
        }
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onOutputSurface(final SurfaceOutput surfaceOutput) {
        try {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.core.processing.i0
                @Override // java.lang.Runnable
                public final void run() {
                    SurfaceProcessorWithExecutor.m2035a(this.f1809b, surfaceOutput);
                }
            });
        } catch (RejectedExecutionException unused) {
            Logger.m1868e(TAG, "SurfaceProcessor failed due to executor shutdown");
        }
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public ListenableFuture<Void> snapshot(@IntRange(from = 0, m1553to = 100) int i11, @IntRange(from = 0, m1553to = 359) int i12) {
        return Futures.immediateFailedFuture(new Exception("Snapshot not supported by external SurfaceProcessor"));
    }

    public String toString() {
        return "SurfaceProcessorWithExecutor(" + this.mSurfaceProcessor + ")";
    }

    public SurfaceProcessorWithExecutor(CameraEffect cameraEffect) {
        SurfaceProcessor surfaceProcessor = cameraEffect.getSurfaceProcessor();
        Objects.requireNonNull(surfaceProcessor);
        this.mSurfaceProcessor = surfaceProcessor;
        this.mExecutor = cameraEffect.getExecutor();
        this.mErrorListener = cameraEffect.getErrorListener();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2035a(SurfaceProcessorWithExecutor surfaceProcessorWithExecutor, SurfaceOutput surfaceOutput) {
        surfaceProcessorWithExecutor.getClass();
        try {
            surfaceProcessorWithExecutor.mSurfaceProcessor.onOutputSurface(surfaceOutput);
        } catch (ProcessingException e11) {
            Logger.m1869e(TAG, "Failed to setup SurfaceProcessor output.", e11);
            surfaceProcessorWithExecutor.mErrorListener.accept(e11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2036b(SurfaceProcessorWithExecutor surfaceProcessorWithExecutor, SurfaceRequest surfaceRequest) {
        surfaceProcessorWithExecutor.getClass();
        try {
            surfaceProcessorWithExecutor.mSurfaceProcessor.onInputSurface(surfaceRequest);
        } catch (ProcessingException e11) {
            Logger.m1869e(TAG, "Failed to setup SurfaceProcessor input.", e11);
            surfaceProcessorWithExecutor.mErrorListener.accept(e11);
        }
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public void release() {
    }
}
