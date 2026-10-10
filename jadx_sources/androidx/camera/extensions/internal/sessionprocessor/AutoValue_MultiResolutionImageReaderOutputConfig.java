package androidx.camera.extensions.internal.sessionprocessor;

import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_MultiResolutionImageReaderOutputConfig extends MultiResolutionImageReaderOutputConfig {

    /* JADX INFO: renamed from: id */
    private final int f1901id;
    private final int imageFormat;
    private final int maxImages;
    private final String physicalCameraId;
    private final int surfaceGroupId;
    private final List<Camera2OutputConfig> surfaceSharingOutputConfigs;

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof MultiResolutionImageReaderOutputConfig) {
            MultiResolutionImageReaderOutputConfig multiResolutionImageReaderOutputConfig = (MultiResolutionImageReaderOutputConfig) obj;
            if (this.f1901id == multiResolutionImageReaderOutputConfig.getId() && this.surfaceGroupId == multiResolutionImageReaderOutputConfig.getSurfaceGroupId() && ((str = this.physicalCameraId) != null ? str.equals(multiResolutionImageReaderOutputConfig.getPhysicalCameraId()) : multiResolutionImageReaderOutputConfig.getPhysicalCameraId() == null) && this.surfaceSharingOutputConfigs.equals(multiResolutionImageReaderOutputConfig.getSurfaceSharingOutputConfigs()) && this.imageFormat == multiResolutionImageReaderOutputConfig.getImageFormat() && this.maxImages == multiResolutionImageReaderOutputConfig.getMaxImages()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    public int getId() {
        return this.f1901id;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig
    public int getImageFormat() {
        return this.imageFormat;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig
    public int getMaxImages() {
        return this.maxImages;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    public String getPhysicalCameraId() {
        return this.physicalCameraId;
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
        int i11 = (((this.f1901id ^ 1000003) * 1000003) ^ this.surfaceGroupId) * 1000003;
        String str = this.physicalCameraId;
        return ((((((i11 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.surfaceSharingOutputConfigs.hashCode()) * 1000003) ^ this.imageFormat) * 1000003) ^ this.maxImages;
    }

    public String toString() {
        return "MultiResolutionImageReaderOutputConfig{id=" + this.f1901id + ", surfaceGroupId=" + this.surfaceGroupId + ", physicalCameraId=" + this.physicalCameraId + ", surfaceSharingOutputConfigs=" + this.surfaceSharingOutputConfigs + ", imageFormat=" + this.imageFormat + ", maxImages=" + this.maxImages + "}";
    }

    public AutoValue_MultiResolutionImageReaderOutputConfig(int i11, int i12, String str, List<Camera2OutputConfig> list, int i13, int i14) {
        this.f1901id = i11;
        this.surfaceGroupId = i12;
        this.physicalCameraId = str;
        if (list != null) {
            this.surfaceSharingOutputConfigs = list;
            this.imageFormat = i13;
            this.maxImages = i14;
            return;
        }
        throw new NullPointerException("Null surfaceSharingOutputConfigs");
    }
}
