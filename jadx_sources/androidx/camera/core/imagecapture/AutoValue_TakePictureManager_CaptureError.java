package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageCaptureException;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_TakePictureManager_CaptureError extends TakePictureManager.CaptureError {
    private final ImageCaptureException imageCaptureException;
    private final int requestId;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TakePictureManager.CaptureError) {
            TakePictureManager.CaptureError captureError = (TakePictureManager.CaptureError) obj;
            if (this.requestId == captureError.getRequestId() && this.imageCaptureException.equals(captureError.getImageCaptureException())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager.CaptureError
    public ImageCaptureException getImageCaptureException() {
        return this.imageCaptureException;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager.CaptureError
    public int getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        return ((this.requestId ^ 1000003) * 1000003) ^ this.imageCaptureException.hashCode();
    }

    public String toString() {
        return "CaptureError{requestId=" + this.requestId + ", imageCaptureException=" + this.imageCaptureException + "}";
    }

    public AutoValue_TakePictureManager_CaptureError(int i11, ImageCaptureException imageCaptureException) {
        this.requestId = i11;
        if (imageCaptureException != null) {
            this.imageCaptureException = imageCaptureException;
            return;
        }
        throw new NullPointerException("Null imageCaptureException");
    }
}
