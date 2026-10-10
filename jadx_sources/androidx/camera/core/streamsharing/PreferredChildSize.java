package androidx.camera.core.streamsharing;

import android.graphics.Rect;
import android.util.Size;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PreferredChildSize.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m90084d2 = {"Landroidx/camera/core/streamsharing/PreferredChildSize;", "", "cropRectBeforeScaling", "Landroid/graphics/Rect;", "childSizeToScale", "Landroid/util/Size;", "originalSelectedChildSize", "<init>", "(Landroid/graphics/Rect;Landroid/util/Size;Landroid/util/Size;)V", "getCropRectBeforeScaling", "()Landroid/graphics/Rect;", "getChildSizeToScale", "()Landroid/util/Size;", "getOriginalSelectedChildSize", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final /* data */ class PreferredChildSize {

    @NotNull
    private final Size childSizeToScale;

    @NotNull
    private final Rect cropRectBeforeScaling;

    @NotNull
    private final Size originalSelectedChildSize;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreferredChildSize)) {
            return false;
        }
        PreferredChildSize preferredChildSize = (PreferredChildSize) other;
        return Intrinsics.areEqual(this.cropRectBeforeScaling, preferredChildSize.cropRectBeforeScaling) && Intrinsics.areEqual(this.childSizeToScale, preferredChildSize.childSizeToScale) && Intrinsics.areEqual(this.originalSelectedChildSize, preferredChildSize.originalSelectedChildSize);
    }

    public PreferredChildSize(@NotNull Rect cropRectBeforeScaling, @NotNull Size childSizeToScale, @NotNull Size originalSelectedChildSize) {
        Intrinsics.checkNotNullParameter(cropRectBeforeScaling, "cropRectBeforeScaling");
        Intrinsics.checkNotNullParameter(childSizeToScale, "childSizeToScale");
        Intrinsics.checkNotNullParameter(originalSelectedChildSize, "originalSelectedChildSize");
        this.cropRectBeforeScaling = cropRectBeforeScaling;
        this.childSizeToScale = childSizeToScale;
        this.originalSelectedChildSize = originalSelectedChildSize;
    }

    public static /* synthetic */ PreferredChildSize copy$default(PreferredChildSize preferredChildSize, Rect rect, Size size, Size size2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            rect = preferredChildSize.cropRectBeforeScaling;
        }
        if ((i11 & 2) != 0) {
            size = preferredChildSize.childSizeToScale;
        }
        if ((i11 & 4) != 0) {
            size2 = preferredChildSize.originalSelectedChildSize;
        }
        return preferredChildSize.copy(rect, size, size2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Rect getCropRectBeforeScaling() {
        return this.cropRectBeforeScaling;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Size getChildSizeToScale() {
        return this.childSizeToScale;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Size getOriginalSelectedChildSize() {
        return this.originalSelectedChildSize;
    }

    @NotNull
    public final PreferredChildSize copy(@NotNull Rect cropRectBeforeScaling, @NotNull Size childSizeToScale, @NotNull Size originalSelectedChildSize) {
        Intrinsics.checkNotNullParameter(cropRectBeforeScaling, "cropRectBeforeScaling");
        Intrinsics.checkNotNullParameter(childSizeToScale, "childSizeToScale");
        Intrinsics.checkNotNullParameter(originalSelectedChildSize, "originalSelectedChildSize");
        return new PreferredChildSize(cropRectBeforeScaling, childSizeToScale, originalSelectedChildSize);
    }

    @NotNull
    public final Size getChildSizeToScale() {
        return this.childSizeToScale;
    }

    @NotNull
    public final Rect getCropRectBeforeScaling() {
        return this.cropRectBeforeScaling;
    }

    @NotNull
    public final Size getOriginalSelectedChildSize() {
        return this.originalSelectedChildSize;
    }

    public int hashCode() {
        return (((this.cropRectBeforeScaling.hashCode() * 31) + this.childSizeToScale.hashCode()) * 31) + this.originalSelectedChildSize.hashCode();
    }

    @NotNull
    public String toString() {
        return "PreferredChildSize(cropRectBeforeScaling=" + this.cropRectBeforeScaling + ", childSizeToScale=" + this.childSizeToScale + ", originalSelectedChildSize=" + this.originalSelectedChildSize + ')';
    }
}
