package androidx.camera.core.streamsharing;

import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.ForwardingCameraInfo;
import androidx.camera.core.impl.utils.TransformUtils;
import com.tencent.bugly.proguard.C33820nf;
import java.util.UUID;

/* JADX INFO: loaded from: classes23.dex */
public class VirtualCameraInfo extends ForwardingCameraInfo {
    private final String mVirtualCameraId;
    private int mVirtualCameraRotationDegrees;

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees() {
        return getSensorRotationDegrees(0);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.impl.CameraInfoInternal
    public String getCameraId() {
        return this.mVirtualCameraId;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees(int i11) {
        return TransformUtils.within360(super.getSensorRotationDegrees(i11) - this.mVirtualCameraRotationDegrees);
    }

    public void setVirtualCameraRotationDegrees(int i11) {
        this.mVirtualCameraRotationDegrees = i11;
    }

    public VirtualCameraInfo(CameraInfoInternal cameraInfoInternal) {
        super(cameraInfoInternal);
        this.mVirtualCameraId = "virtual-" + cameraInfoInternal.getCameraId() + C33820nf.f71144W + UUID.randomUUID().toString();
    }
}
