package bg0;

import androidx.annotation.ColorInt;
import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: bg0.d, reason: from toString */
/* JADX INFO: compiled from: ShadowTokens.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/theme/tokens/ShadowStyle;", "", "elevation", "", "color", "", "x", "y", "radius", ViewProps.OPACITY, "<init>", "(FIFFFF)V", "getElevation", "()F", "getColor", "()I", "getX", "getY", "getRadius", "getOpacity", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ShadowStyle {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final float elevation;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final int color;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final float x;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final float y;

    /* JADX INFO: renamed from: e, reason: from toString */
    public final float radius;

    /* JADX INFO: renamed from: f, reason: from toString */
    public final float opacity;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShadowStyle)) {
            return false;
        }
        ShadowStyle shadowStyle = (ShadowStyle) other;
        return Float.compare(this.elevation, shadowStyle.elevation) == 0 && this.color == shadowStyle.color && Float.compare(this.x, shadowStyle.x) == 0 && Float.compare(this.y, shadowStyle.y) == 0 && Float.compare(this.radius, shadowStyle.radius) == 0 && Float.compare(this.opacity, shadowStyle.opacity) == 0;
    }

    public int hashCode() {
        return (((((((((Float.hashCode(this.elevation) * 31) + Integer.hashCode(this.color)) * 31) + Float.hashCode(this.x)) * 31) + Float.hashCode(this.y)) * 31) + Float.hashCode(this.radius)) * 31) + Float.hashCode(this.opacity);
    }

    @NotNull
    public String toString() {
        return "ShadowStyle(elevation=" + this.elevation + ", color=" + this.color + ", x=" + this.x + ", y=" + this.y + ", radius=" + this.radius + ", opacity=" + this.opacity + ')';
    }

    public ShadowStyle(float f11, @ColorInt int i11, float f12, float f13, float f14, float f15) {
        this.elevation = f11;
        this.color = i11;
        this.x = f12;
        this.y = f13;
        this.radius = f14;
        this.opacity = f15;
    }
}
