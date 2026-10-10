package com.facebook.react.uimanager.style;

import com.facebook.react.uimanager.PixelUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: CornerRadii.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u0000J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m90084d2 = {"Lcom/facebook/react/uimanager/style/CornerRadii;", "", "horizontal", "", "vertical", "<init>", "(FF)V", "getHorizontal", "()F", "getVertical", "toPixelFromDIP", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final /* data */ class CornerRadii {
    private final float horizontal;
    private final float vertical;

    /* JADX WARN: Illegal instructions before constructor call */
    public CornerRadii() {
        float f11 = 0.0f;
        this(f11, f11, 3, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CornerRadii)) {
            return false;
        }
        CornerRadii cornerRadii = (CornerRadii) other;
        return Float.compare(this.horizontal, cornerRadii.horizontal) == 0 && Float.compare(this.vertical, cornerRadii.vertical) == 0;
    }

    public CornerRadii(float f11, float f12) {
        this.horizontal = f11;
        this.vertical = f12;
    }

    public static /* synthetic */ CornerRadii copy$default(CornerRadii cornerRadii, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = cornerRadii.horizontal;
        }
        if ((i11 & 2) != 0) {
            f12 = cornerRadii.vertical;
        }
        return cornerRadii.copy(f11, f12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getHorizontal() {
        return this.horizontal;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getVertical() {
        return this.vertical;
    }

    @NotNull
    public final CornerRadii copy(float horizontal, float vertical) {
        return new CornerRadii(horizontal, vertical);
    }

    public final float getHorizontal() {
        return this.horizontal;
    }

    public final float getVertical() {
        return this.vertical;
    }

    public int hashCode() {
        return (Float.hashCode(this.horizontal) * 31) + Float.hashCode(this.vertical);
    }

    @NotNull
    public final CornerRadii toPixelFromDIP() {
        return new CornerRadii(PixelUtil.toPixelFromDIP(this.horizontal), PixelUtil.toPixelFromDIP(this.vertical));
    }

    @NotNull
    public String toString() {
        return "CornerRadii(horizontal=" + this.horizontal + ", vertical=" + this.vertical + ")";
    }

    public /* synthetic */ CornerRadii(float f11, float f12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0f : f11, (i11 & 2) != 0 ? 0.0f : f12);
    }
}
