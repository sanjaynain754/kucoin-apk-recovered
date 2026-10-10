package androidx.camera.core;

import android.graphics.Matrix;
import androidx.camera.core.impl.TagBundle;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_ImmutableImageInfo extends ImmutableImageInfo {
    private final int flashState;
    private final int rotationDegrees;
    private final Matrix sensorToBufferTransformMatrix;
    private final TagBundle tagBundle;
    private final long timestamp;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableImageInfo) {
            ImmutableImageInfo immutableImageInfo = (ImmutableImageInfo) obj;
            if (this.tagBundle.equals(immutableImageInfo.getTagBundle()) && this.timestamp == immutableImageInfo.getTimestamp() && this.rotationDegrees == immutableImageInfo.getRotationDegrees() && this.sensorToBufferTransformMatrix.equals(immutableImageInfo.getSensorToBufferTransformMatrix()) && this.flashState == immutableImageInfo.getFlashState()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.ImmutableImageInfo, androidx.camera.core.ImageInfo
    public int getFlashState() {
        return this.flashState;
    }

    @Override // androidx.camera.core.ImmutableImageInfo, androidx.camera.core.ImageInfo
    public int getRotationDegrees() {
        return this.rotationDegrees;
    }

    @Override // androidx.camera.core.ImmutableImageInfo, androidx.camera.core.ImageInfo
    public Matrix getSensorToBufferTransformMatrix() {
        return this.sensorToBufferTransformMatrix;
    }

    @Override // androidx.camera.core.ImmutableImageInfo, androidx.camera.core.ImageInfo
    public TagBundle getTagBundle() {
        return this.tagBundle;
    }

    @Override // androidx.camera.core.ImmutableImageInfo, androidx.camera.core.ImageInfo
    public long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = (this.tagBundle.hashCode() ^ 1000003) * 1000003;
        long j11 = this.timestamp;
        return ((((((iHashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.rotationDegrees) * 1000003) ^ this.sensorToBufferTransformMatrix.hashCode()) * 1000003) ^ this.flashState;
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.tagBundle + ", timestamp=" + this.timestamp + ", rotationDegrees=" + this.rotationDegrees + ", sensorToBufferTransformMatrix=" + this.sensorToBufferTransformMatrix + ", flashState=" + this.flashState + "}";
    }

    public AutoValue_ImmutableImageInfo(TagBundle tagBundle, long j11, int i11, Matrix matrix, int i12) {
        if (tagBundle != null) {
            this.tagBundle = tagBundle;
            this.timestamp = j11;
            this.rotationDegrees = i11;
            if (matrix != null) {
                this.sensorToBufferTransformMatrix = matrix;
                this.flashState = i12;
                return;
            }
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        throw new NullPointerException("Null tagBundle");
    }
}
