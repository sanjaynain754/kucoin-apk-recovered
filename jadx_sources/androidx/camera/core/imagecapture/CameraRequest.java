package androidx.camera.core.imagecapture;

import androidx.camera.core.impl.CaptureConfig;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class CameraRequest {
    private final TakePictureCallback mCallback;
    private final List<CaptureConfig> mCaptureConfigs;

    public List<CaptureConfig> getCaptureConfigs() {
        return this.mCaptureConfigs;
    }

    public boolean isAborted() {
        return this.mCallback.isAborted();
    }

    public CameraRequest(List<CaptureConfig> list, TakePictureCallback takePictureCallback) {
        this.mCaptureConfigs = list;
        this.mCallback = takePictureCallback;
    }
}
