package androidx.camera.video;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_QualityRatioToResolutionsTable_QualityRatio extends QualityRatioToResolutionsTable.QualityRatio {
    private final int aspectRatio;
    private final Quality quality;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof QualityRatioToResolutionsTable.QualityRatio) {
            QualityRatioToResolutionsTable.QualityRatio qualityRatio = (QualityRatioToResolutionsTable.QualityRatio) obj;
            if (this.quality.equals(qualityRatio.getQuality()) && this.aspectRatio == qualityRatio.getAspectRatio()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio
    public int getAspectRatio() {
        return this.aspectRatio;
    }

    @Override // androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio
    public Quality getQuality() {
        return this.quality;
    }

    public int hashCode() {
        return ((this.quality.hashCode() ^ 1000003) * 1000003) ^ this.aspectRatio;
    }

    public String toString() {
        return "QualityRatio{quality=" + this.quality + ", aspectRatio=" + this.aspectRatio + "}";
    }

    public AutoValue_QualityRatioToResolutionsTable_QualityRatio(Quality quality, int i11) {
        if (quality != null) {
            this.quality = quality;
            this.aspectRatio = i11;
            return;
        }
        throw new NullPointerException("Null quality");
    }
}
