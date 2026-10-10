package com.th3rdwave.safeareacontext;

import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: EdgeInsets.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, m90084d2 = {"Lcom/th3rdwave/safeareacontext/EdgeInsets;", "", ViewProps.TOP, "", "right", ViewProps.BOTTOM, "left", "<init>", "(FFFF)V", "getTop", "()F", "getRight", "getBottom", "getLeft", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "react-native-safe-area-context_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final /* data */ class EdgeInsets {
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EdgeInsets)) {
            return false;
        }
        EdgeInsets edgeInsets = (EdgeInsets) other;
        return Float.compare(this.top, edgeInsets.top) == 0 && Float.compare(this.right, edgeInsets.right) == 0 && Float.compare(this.bottom, edgeInsets.bottom) == 0 && Float.compare(this.left, edgeInsets.left) == 0;
    }

    public static /* synthetic */ EdgeInsets copy$default(EdgeInsets edgeInsets, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = edgeInsets.top;
        }
        if ((i11 & 2) != 0) {
            f12 = edgeInsets.right;
        }
        if ((i11 & 4) != 0) {
            f13 = edgeInsets.bottom;
        }
        if ((i11 & 8) != 0) {
            f14 = edgeInsets.left;
        }
        return edgeInsets.copy(f11, f12, f13, f14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    @NotNull
    public final EdgeInsets copy(float top, float right, float bottom, float left) {
        return new EdgeInsets(top, right, bottom, left);
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.top) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom)) * 31) + Float.hashCode(this.left);
    }

    @NotNull
    public String toString() {
        return "EdgeInsets(top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", left=" + this.left + ")";
    }

    public EdgeInsets(float f11, float f12, float f13, float f14) {
        this.top = f11;
        this.right = f12;
        this.bottom = f13;
        this.left = f14;
    }
}
