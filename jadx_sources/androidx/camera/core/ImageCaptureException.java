package androidx.camera.core;

/* JADX INFO: loaded from: classes23.dex */
public class ImageCaptureException extends Exception {
    private final int mImageCaptureError;

    public int getImageCaptureError() {
        return this.mImageCaptureError;
    }

    public ImageCaptureException(int i11, String str, Throwable th2) {
        super(str, th2);
        this.mImageCaptureError = i11;
    }
}
