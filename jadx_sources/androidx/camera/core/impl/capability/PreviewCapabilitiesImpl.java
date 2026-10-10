package androidx.camera.core.impl.capability;

import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.PreviewCapabilities;
import androidx.camera.core.impl.CameraInfoInternal;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class PreviewCapabilitiesImpl implements PreviewCapabilities {
    private boolean mIsStabilizationSupported;

    public static PreviewCapabilities from(CameraInfo cameraInfo) {
        return new PreviewCapabilitiesImpl((CameraInfoInternal) cameraInfo);
    }

    @Override // androidx.camera.core.PreviewCapabilities
    public boolean isStabilizationSupported() {
        return this.mIsStabilizationSupported;
    }

    public PreviewCapabilitiesImpl(CameraInfoInternal cameraInfoInternal) {
        this.mIsStabilizationSupported = cameraInfoInternal.isPreviewStabilizationSupported();
    }
}
