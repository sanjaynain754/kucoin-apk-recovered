package androidx.camera.extensions.internal.sessionprocessor;

import android.view.Surface;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_SurfaceOutputConfig extends SurfaceOutputConfig {

    /* JADX INFO: renamed from: id */
    private final int f1902id;
    private final String physicalCameraId;
    private final Surface surface;
    private final int surfaceGroupId;
    private final List<Camera2OutputConfig> surfaceSharingOutputConfigs;

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SurfaceOutputConfig) {
            SurfaceOutputConfig surfaceOutputConfig = (SurfaceOutputConfig) obj;
            if (this.f1902id == surfaceOutputConfig.getId() && this.surfaceGroupId == surfaceOutputConfig.getSurfaceGroupId() && ((str = this.physicalCameraId) != null ? str.equals(surfaceOutputConfig.getPhysicalCameraId()) : surfaceOutputConfig.getPhysicalCameraId() == null) && this.surfaceSharingOutputConfigs.equals(surfaceOutputConfig.getSurfaceSharingOutputConfigs()) && this.surface.equals(surfaceOutputConfig.getSurface())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    public int getId() {
        return this.f1902id;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    public String getPhysicalCameraId() {
        return this.physicalCameraId;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig
    public Surface getSurface() {
        return this.surface;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    public int getSurfaceGroupId() {
        return this.surfaceGroupId;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    public List<Camera2OutputConfig> getSurfaceSharingOutputConfigs() {
        return this.surfaceSharingOutputConfigs;
    }

    public int hashCode() {
        int i11 = (((this.f1902id ^ 1000003) * 1000003) ^ this.surfaceGroupId) * 1000003;
        String str = this.physicalCameraId;
        return ((((i11 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.surfaceSharingOutputConfigs.hashCode()) * 1000003) ^ this.surface.hashCode();
    }

    public String toString() {
        return "SurfaceOutputConfig{id=" + this.f1902id + ", surfaceGroupId=" + this.surfaceGroupId + ", physicalCameraId=" + this.physicalCameraId + ", surfaceSharingOutputConfigs=" + this.surfaceSharingOutputConfigs + ", surface=" + this.surface + "}";
    }

    public AutoValue_SurfaceOutputConfig(int i11, int i12, String str, List<Camera2OutputConfig> list, Surface surface) {
        this.f1902id = i11;
        this.surfaceGroupId = i12;
        this.physicalCameraId = str;
        if (list != null) {
            this.surfaceSharingOutputConfigs = list;
            if (surface != null) {
                this.surface = surface;
                return;
            }
            throw new NullPointerException("Null surface");
        }
        throw new NullPointerException("Null surfaceSharingOutputConfigs");
    }
}
