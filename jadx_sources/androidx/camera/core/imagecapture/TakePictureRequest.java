package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.internal.compat.workaround.CaptureFailedRetryEnabler;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
@AutoValue
public abstract class TakePictureRequest {
    private static final String TAG = "TakePictureRequest";
    private int mRemainingRetires = new CaptureFailedRetryEnabler().getRetryCount();
    private final Map<Integer, Boolean> mFormatCaptureStatus = new HashMap();

    public interface RetryControl {
        void retryRequest(TakePictureRequest takePictureRequest);
    }

    /* JADX INFO: renamed from: of */
    public static TakePictureRequest m1933of(Executor executor, ImageCapture.OnImageCapturedCallback onImageCapturedCallback, ImageCapture.OnImageSavedCallback onImageSavedCallback, ImageCapture.OutputFileOptions outputFileOptions, ImageCapture.OutputFileOptions outputFileOptions2, Rect rect, Matrix matrix, int i11, int i12, int i13, boolean z11, List<CameraCaptureCallback> list) {
        Preconditions.checkArgument((onImageSavedCallback == null) == (outputFileOptions == null), "onDiskCallback and outputFileOptions should be both null or both non-null.");
        Preconditions.checkArgument((onImageCapturedCallback == null) ^ (onImageSavedCallback == null), "One and only one on-disk or in-memory callback should be present.");
        AutoValue_TakePictureRequest autoValue_TakePictureRequest = new AutoValue_TakePictureRequest(executor, onImageCapturedCallback, onImageSavedCallback, outputFileOptions, outputFileOptions2, rect, matrix, i11, i12, i13, z11, list);
        if (z11) {
            autoValue_TakePictureRequest.initFormatProcessStatusInSimultaneousCapture();
        }
        return autoValue_TakePictureRequest;
    }

    public abstract Executor getAppExecutor();

    public abstract int getCaptureMode();

    public abstract Rect getCropRect();

    public abstract ImageCapture.OnImageCapturedCallback getInMemoryCallback();

    @IntRange(from = 1, m1553to = 100)
    public abstract int getJpegQuality();

    public abstract ImageCapture.OnImageSavedCallback getOnDiskCallback();

    public abstract ImageCapture.OutputFileOptions getOutputFileOptions();

    public abstract int getRotationDegrees();

    public abstract ImageCapture.OutputFileOptions getSecondaryOutputFileOptions();

    public abstract Matrix getSensorToBufferTransform();

    public abstract List<CameraCaptureCallback> getSessionConfigCameraCaptureCallbacks();

    public abstract boolean isSimultaneousCapture();

    public void onResult(final ImageCapture.OutputFileResults outputFileResults) {
        getAppExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.a0
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureRequest.m1929b(this.f1610b, outputFileResults);
            }
        });
    }

    public void initFormatProcessStatusInSimultaneousCapture() {
        Map<Integer, Boolean> map = this.mFormatCaptureStatus;
        Boolean bool = Boolean.FALSE;
        map.put(32, bool);
        this.mFormatCaptureStatus.put(256, bool);
    }

    public boolean isFormatProcessedInSimultaneousCapture() {
        Iterator<Map.Entry<Integer, Boolean>> it = this.mFormatCaptureStatus.entrySet().iterator();
        while (it.hasNext()) {
            if (!it.next().getValue().booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public void markFormatProcessStatusInSimultaneousCapture(int i11, boolean z11) {
        if (this.mFormatCaptureStatus.containsKey(Integer.valueOf(i11))) {
            this.mFormatCaptureStatus.put(Integer.valueOf(i11), Boolean.valueOf(z11));
        } else {
            Logger.m1868e(TAG, "The format is not supported in simultaneous capture");
        }
    }

    public void onResult(final ImageProxy imageProxy) {
        getAppExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.y
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureRequest.m1930c(this.f1648b, imageProxy);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1928a(TakePictureRequest takePictureRequest, ImageCaptureException imageCaptureException) {
        boolean z11;
        boolean z12 = false;
        if (takePictureRequest.getInMemoryCallback() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (takePictureRequest.getOnDiskCallback() != null) {
            z12 = true;
        }
        if (z11 && !z12) {
            ImageCapture.OnImageCapturedCallback inMemoryCallback = takePictureRequest.getInMemoryCallback();
            Objects.requireNonNull(inMemoryCallback);
            inMemoryCallback.onError(imageCaptureException);
        } else {
            if (z12 && !z11) {
                ImageCapture.OnImageSavedCallback onDiskCallback = takePictureRequest.getOnDiskCallback();
                Objects.requireNonNull(onDiskCallback);
                onDiskCallback.onError(imageCaptureException);
                return;
            }
            throw new IllegalStateException("One and only one callback is allowed.");
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1929b(TakePictureRequest takePictureRequest, ImageCapture.OutputFileResults outputFileResults) {
        ImageCapture.OnImageSavedCallback onDiskCallback = takePictureRequest.getOnDiskCallback();
        Objects.requireNonNull(onDiskCallback);
        Objects.requireNonNull(outputFileResults);
        onDiskCallback.onImageSaved(outputFileResults);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m1930c(TakePictureRequest takePictureRequest, ImageProxy imageProxy) {
        ImageCapture.OnImageCapturedCallback inMemoryCallback = takePictureRequest.getInMemoryCallback();
        Objects.requireNonNull(inMemoryCallback);
        Objects.requireNonNull(imageProxy);
        inMemoryCallback.onCaptureSuccess(imageProxy);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m1931d(TakePictureRequest takePictureRequest, Bitmap bitmap) {
        if (takePictureRequest.getOnDiskCallback() != null) {
            takePictureRequest.getOnDiskCallback().onPostviewBitmapAvailable(bitmap);
        } else if (takePictureRequest.getInMemoryCallback() != null) {
            takePictureRequest.getInMemoryCallback().onPostviewBitmapAvailable(bitmap);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m1932e(TakePictureRequest takePictureRequest, int i11) {
        if (takePictureRequest.getOnDiskCallback() != null) {
            takePictureRequest.getOnDiskCallback().onCaptureProcessProgressed(i11);
        } else if (takePictureRequest.getInMemoryCallback() != null) {
            takePictureRequest.getInMemoryCallback().onCaptureProcessProgressed(i11);
        }
    }

    @MainThread
    public boolean decrementRetryCounter() {
        Threads.checkMainThread();
        int i11 = this.mRemainingRetires;
        if (i11 > 0) {
            this.mRemainingRetires = i11 - 1;
            return true;
        }
        return false;
    }

    @MainThread
    @VisibleForTesting
    public int getRemainingRetries() {
        Threads.checkMainThread();
        return this.mRemainingRetires;
    }

    @MainThread
    public void incrementRetryCounter() {
        Threads.checkMainThread();
        this.mRemainingRetires++;
    }

    public void onCaptureProcessProgressed(final int i11) {
        getAppExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.b0
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureRequest.m1932e(this.f1613b, i11);
            }
        });
    }

    public void onError(final ImageCaptureException imageCaptureException) {
        getAppExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.c0
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureRequest.m1928a(this.f1616b, imageCaptureException);
            }
        });
    }

    public void onPostviewBitmapAvailable(final Bitmap bitmap) {
        getAppExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.z
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureRequest.m1931d(this.f1650b, bitmap);
            }
        });
    }
}
