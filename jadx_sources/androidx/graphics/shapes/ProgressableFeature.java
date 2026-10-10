package androidx.graphics.shapes;

import com.tencent.bugly.proguard.C34052z4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FeatureMapping.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m90084d2 = {"Landroidx/graphics/shapes/ProgressableFeature;", "", "progress", "", C34052z4.f72599k, "Landroidx/graphics/shapes/Feature;", "(FLandroidx/graphics/shapes/Feature;)V", "getFeature", "()Landroidx/graphics/shapes/Feature;", "getProgress", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "graphics-shapes_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class ProgressableFeature {

    @NotNull
    private final Feature feature;
    private final float progress;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressableFeature)) {
            return false;
        }
        ProgressableFeature progressableFeature = (ProgressableFeature) other;
        return Float.compare(this.progress, progressableFeature.progress) == 0 && Intrinsics.areEqual(this.feature, progressableFeature.feature);
    }

    public ProgressableFeature(float f11, @NotNull Feature feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        this.progress = f11;
        this.feature = feature;
    }

    public static /* synthetic */ ProgressableFeature copy$default(ProgressableFeature progressableFeature, float f11, Feature feature, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = progressableFeature.progress;
        }
        if ((i11 & 2) != 0) {
            feature = progressableFeature.feature;
        }
        return progressableFeature.copy(f11, feature);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Feature getFeature() {
        return this.feature;
    }

    @NotNull
    public final ProgressableFeature copy(float progress, @NotNull Feature feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        return new ProgressableFeature(progress, feature);
    }

    @NotNull
    public final Feature getFeature() {
        return this.feature;
    }

    public final float getProgress() {
        return this.progress;
    }

    public int hashCode() {
        return (Float.hashCode(this.progress) * 31) + this.feature.hashCode();
    }

    @NotNull
    public String toString() {
        return "ProgressableFeature(progress=" + this.progress + ", feature=" + this.feature + ')';
    }
}
