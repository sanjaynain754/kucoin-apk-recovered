package com.facebook.react.uimanager.style;

import androidx.annotation.ColorInt;
import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: BorderColors.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m90084d2 = {"Lcom/facebook/react/uimanager/style/ColorEdges;", "", "left", "", ViewProps.TOP, "right", ViewProps.BOTTOM, "<init>", "(IIII)V", "getLeft", "()I", "getTop", "getRight", "getBottom", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final /* data */ class ColorEdges {
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    public ColorEdges() {
        this(0, 0, 0, 0, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorEdges)) {
            return false;
        }
        ColorEdges colorEdges = (ColorEdges) other;
        return this.left == colorEdges.left && this.top == colorEdges.top && this.right == colorEdges.right && this.bottom == colorEdges.bottom;
    }

    public ColorEdges(@ColorInt int i11, @ColorInt int i12, @ColorInt int i13, @ColorInt int i14) {
        this.left = i11;
        this.top = i12;
        this.right = i13;
        this.bottom = i14;
    }

    public static /* synthetic */ ColorEdges copy$default(ColorEdges colorEdges, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = colorEdges.left;
        }
        if ((i15 & 2) != 0) {
            i12 = colorEdges.top;
        }
        if ((i15 & 4) != 0) {
            i13 = colorEdges.right;
        }
        if ((i15 & 8) != 0) {
            i14 = colorEdges.bottom;
        }
        return colorEdges.copy(i11, i12, i13, i14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    @NotNull
    public final ColorEdges copy(@ColorInt int left, @ColorInt int top, @ColorInt int right, @ColorInt int bottom) {
        return new ColorEdges(left, top, right, bottom);
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.left) * 31) + Integer.hashCode(this.top)) * 31) + Integer.hashCode(this.right)) * 31) + Integer.hashCode(this.bottom);
    }

    @NotNull
    public String toString() {
        return "ColorEdges(left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ")";
    }

    public /* synthetic */ ColorEdges(int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? -16777216 : i11, (i15 & 2) != 0 ? -16777216 : i12, (i15 & 4) != 0 ? -16777216 : i13, (i15 & 8) != 0 ? -16777216 : i14);
    }
}
