package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.annotation.MainThread;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;

/* JADX INFO: loaded from: classes23.dex */
interface TakePictureCallback {
    boolean isAborted();

    @MainThread
    void onCaptureFailure(ImageCaptureException imageCaptureException);

    void onCaptureProcessProgressed(int i11);

    void onCaptureStarted();

    @MainThread
    void onFinalResult(ImageCapture.OutputFileResults outputFileResults);

    @MainThread
    void onFinalResult(ImageProxy imageProxy);

    @MainThread
    void onImageCaptured();

    void onPostviewBitmapAvailable(Bitmap bitmap);

    @MainThread
    void onProcessFailure(ImageCaptureException imageCaptureException);
}
