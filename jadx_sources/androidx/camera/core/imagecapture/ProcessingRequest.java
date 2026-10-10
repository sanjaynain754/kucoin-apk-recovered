package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.annotation.MainThread;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureStage;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
class ProcessingRequest {
    static final int PROGRESS_NOT_RECEIVED = -1;
    private final TakePictureCallback mCallback;
    final ListenableFuture<Void> mCaptureFuture;
    private final Rect mCropRect;
    private final int mJpegQuality;
    private int mLastCaptureProcessProgressed;
    private final ImageCapture.OutputFileOptions mOutputFileOptions;
    private final int mRequestId;
    private final int mRotationDegrees;
    private final ImageCapture.OutputFileOptions mSecondaryOutputFileOptions;
    private final Matrix mSensorToBufferTransform;
    private final List<Integer> mStageIds;
    private final String mTagBundleKey;
    TakePictureRequest mTakePictureRequest;

    public ProcessingRequest(CaptureBundle captureBundle, TakePictureRequest takePictureRequest, TakePictureCallback takePictureCallback, ListenableFuture<Void> listenableFuture) {
        this(captureBundle, takePictureRequest, takePictureCallback, listenableFuture, 0);
    }

    @MainThread
    public void onFinalResult(ImageCapture.OutputFileResults outputFileResults) {
        this.mCallback.onFinalResult(outputFileResults);
    }

    public ProcessingRequest(CaptureBundle captureBundle, TakePictureRequest takePictureRequest, TakePictureCallback takePictureCallback, ListenableFuture<Void> listenableFuture, int i11) {
        this.mLastCaptureProcessProgressed = -1;
        this.mRequestId = i11;
        this.mTakePictureRequest = takePictureRequest;
        this.mOutputFileOptions = takePictureRequest.getOutputFileOptions();
        this.mSecondaryOutputFileOptions = takePictureRequest.getSecondaryOutputFileOptions();
        this.mJpegQuality = takePictureRequest.getJpegQuality();
        this.mRotationDegrees = takePictureRequest.getRotationDegrees();
        this.mCropRect = takePictureRequest.getCropRect();
        this.mSensorToBufferTransform = takePictureRequest.getSensorToBufferTransform();
        this.mCallback = takePictureCallback;
        this.mTagBundleKey = String.valueOf(captureBundle.hashCode());
        this.mStageIds = new ArrayList();
        List<CaptureStage> captureStages = captureBundle.getCaptureStages();
        Objects.requireNonNull(captureStages);
        Iterator<CaptureStage> it = captureStages.iterator();
        while (it.hasNext()) {
            this.mStageIds.add(Integer.valueOf(it.next().getId()));
        }
        this.mCaptureFuture = listenableFuture;
    }

    public ListenableFuture<Void> getCaptureFuture() {
        return this.mCaptureFuture;
    }

    public Rect getCropRect() {
        return this.mCropRect;
    }

    public int getJpegQuality() {
        return this.mJpegQuality;
    }

    public ImageCapture.OutputFileOptions getOutputFileOptions() {
        return this.mOutputFileOptions;
    }

    public int getRequestId() {
        return this.mRequestId;
    }

    public int getRotationDegrees() {
        return this.mRotationDegrees;
    }

    public ImageCapture.OutputFileOptions getSecondaryOutputFileOptions() {
        return this.mSecondaryOutputFileOptions;
    }

    public Matrix getSensorToBufferTransform() {
        return this.mSensorToBufferTransform;
    }

    public List<Integer> getStageIds() {
        return this.mStageIds;
    }

    public String getTagBundleKey() {
        return this.mTagBundleKey;
    }

    public TakePictureRequest getTakePictureRequest() {
        return this.mTakePictureRequest;
    }

    public boolean isAborted() {
        return this.mCallback.isAborted();
    }

    @MainThread
    public void onCaptureFailure(ImageCaptureException imageCaptureException) {
        this.mCallback.onCaptureFailure(imageCaptureException);
    }

    @MainThread
    public void onCaptureProcessProgressed(int i11) {
        if (this.mLastCaptureProcessProgressed != i11) {
            this.mLastCaptureProcessProgressed = i11;
            this.mCallback.onCaptureProcessProgressed(i11);
        }
    }

    @MainThread
    public void onCaptureStarted() {
        this.mCallback.onCaptureStarted();
    }

    @MainThread
    public void onFinalResult(ImageProxy imageProxy) {
        this.mCallback.onFinalResult(imageProxy);
    }

    @MainThread
    public void onImageCaptured() {
        if (this.mLastCaptureProcessProgressed != -1) {
            onCaptureProcessProgressed(100);
        }
        this.mCallback.onImageCaptured();
    }

    public void onPostviewBitmapAvailable(Bitmap bitmap) {
        this.mCallback.onPostviewBitmapAvailable(bitmap);
    }

    @MainThread
    public void onProcessFailure(ImageCaptureException imageCaptureException) {
        this.mCallback.onProcessFailure(imageCaptureException);
    }

    public boolean isInMemoryCapture() {
        if (getOutputFileOptions() == null && getSecondaryOutputFileOptions() == null) {
            return true;
        }
        return false;
    }
}
