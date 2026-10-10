package p479nw;

import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: nw.f, reason: from toString */
/* JADX INFO: compiled from: Paddings.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/resources/widget/chart/data/Paddings;", "", "left", "", ViewProps.TOP, "right", ViewProps.BOTTOM, "<init>", "(FFFF)V", "getLeft", "()F", "getTop", "getRight", "getBottom", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Paddings {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final float left;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final float top;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final float right;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final float bottom;

    public Paddings() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Paddings)) {
            return false;
        }
        Paddings paddings = (Paddings) other;
        return Float.compare(this.left, paddings.left) == 0 && Float.compare(this.top, paddings.top) == 0 && Float.compare(this.right, paddings.right) == 0 && Float.compare(this.bottom, paddings.bottom) == 0;
    }

    public Paddings(float f11, float f12, float f13, float f14) {
        this.left = f11;
        this.top = f12;
        this.right = f13;
        this.bottom = f14;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Paddings m94061a(float f11, float f12, float f13, float f14) {
        return new Paddings(f11, f12, f13, f14);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom);
    }

    @NotNull
    public String toString() {
        return "Paddings(left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ')';
    }

    public /* synthetic */ Paddings(float f11, float f12, float f13, float f14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0f : f11, (i11 & 2) != 0 ? 0.0f : f12, (i11 & 4) != 0 ? 0.0f : f13, (i11 & 8) != 0 ? 0.0f : f14);
    }
}
