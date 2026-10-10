package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.core.impl.CameraCaptureCallback;

/* JADX INFO: loaded from: classes23.dex */
final class CaptureCallbackContainer extends CameraCaptureCallback {
    private final CameraCaptureSession.CaptureCallback mCaptureCallback;

    public static CaptureCallbackContainer create(CameraCaptureSession.CaptureCallback captureCallback) {
        return new CaptureCallbackContainer(captureCallback);
    }

    public CameraCaptureSession.CaptureCallback getCaptureCallback() {
        return this.mCaptureCallback;
    }

    private CaptureCallbackContainer(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.mCaptureCallback = captureCallback;
            return;
        }
        throw new NullPointerException("captureCallback is null");
    }
}
