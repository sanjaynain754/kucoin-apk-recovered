package androidx.camera.extensions.internal.sessionprocessor;

import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_ImageReaderOutputConfig extends ImageReaderOutputConfig {

    /* JADX INFO: renamed from: id */
    private final int f1900id;
    private final int imageFormat;
    private final int maxImages;
    private final String physicalCameraId;
    private final Size size;
    private final int surfaceGroupId;
    private final List<Camera2OutputConfig> surfaceSharingOutputConfigs;

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImageReaderOutputConfig) {
            ImageReaderOutputConfig imageReaderOutputConfig = (ImageReaderOutputConfig) obj;
            if (this.f1900id == imageReaderOutputConfig.getId() && this.surfaceGroupId == imageReaderOutputConfig.getSurfaceGroupId() && ((str = this.physicalCameraId) != null ? str.equals(imageReaderOutputConfig.getPhysicalCameraId()) : imageReaderOutputConfig.getPhysicalCameraId() == null) && this.surfaceSharingOutputConfigs.equals(imageReaderOutputConfig.getSurfaceSharingOutputConfigs()) && this.size.equals(imageReaderOutputConfig.getSize()) && this.imageFormat == imageReaderOutputConfig.getImageFormat() && this.maxImages == imageReaderOutputConfig.getMaxImages()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    public int getId() {
        return this.f1900id;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig
    public int getImageFormat() {
        return this.imageFormat;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig
    public int getMaxImages() {
        return this.maxImages;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    public String getPhysicalCameraId() {
        return this.physicalCameraId;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig
    public Size getSize() {
        return this.size;
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
        int i11 = (((this.f1900id ^ 1000003) * 1000003) ^ this.surfaceGroupId) * 1000003;
        String str = this.physicalCameraId;
        return ((((((((i11 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.surfaceSharingOutputConfigs.hashCode()) * 1000003) ^ this.size.hashCode()) * 1000003) ^ this.imageFormat) * 1000003) ^ this.maxImages;
    }

    public String toString() {
        return "ImageReaderOutputConfig{id=" + this.f1900id + ", surfaceGroupId=" + this.surfaceGroupId + ", physicalCameraId=" + this.physicalCameraId + ", surfaceSharingOutputConfigs=" + this.surfaceSharingOutputConfigs + ", size=" + this.size + ", imageFormat=" + this.imageFormat + ", maxImages=" + this.maxImages + "}";
    }

    public AutoValue_ImageReaderOutputConfig(int i11, int i12, String str, List<Camera2OutputConfig> list, Size size, int i13, int i14) {
        this.f1900id = i11;
        this.surfaceGroupId = i12;
        this.physicalCameraId = str;
        if (list != null) {
            this.surfaceSharingOutputConfigs = list;
            if (size != null) {
                this.size = size;
                this.imageFormat = i13;
                this.maxImages = i14;
                return;
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null surfaceSharingOutputConfigs");
    }
}
