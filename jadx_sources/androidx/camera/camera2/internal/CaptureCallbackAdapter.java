package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.TagBundle;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: classes23.dex */
final class CaptureCallbackAdapter extends CameraCaptureSession.CaptureCallback {
    private final CameraCaptureCallback mCameraCaptureCallback;

    public CaptureCallbackAdapter(CameraCaptureCallback cameraCaptureCallback) {
        if (cameraCaptureCallback != null) {
            this.mCameraCaptureCallback = cameraCaptureCallback;
            return;
        }
        throw new NullPointerException("cameraCaptureCallback is null");
    }

    private int getCaptureConfigId(CaptureRequest captureRequest) {
        Integer num;
        if (!(captureRequest.getTag() instanceof TagBundle) || (num = (Integer) ((TagBundle) captureRequest.getTag()).getTag(CaptureConfig.CAPTURE_CONFIG_ID_TAG_KEY)) == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        TagBundle tagBundleEmptyBundle;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            Preconditions.checkArgument(tag instanceof TagBundle, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            tagBundleEmptyBundle = (TagBundle) tag;
        } else {
            tagBundleEmptyBundle = TagBundle.emptyBundle();
        }
        this.mCameraCaptureCallback.onCaptureCompleted(getCaptureConfigId(captureRequest), new Camera2CameraCaptureResult(tagBundleEmptyBundle, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.mCameraCaptureCallback.onCaptureFailed(getCaptureConfigId(captureRequest), new CameraCaptureFailure(CameraCaptureFailure.Reason.ERROR));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j11, long j12) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j11, j12);
        this.mCameraCaptureCallback.onCaptureStarted(getCaptureConfigId(captureRequest));
    }
}
