package com.jumio.core.extraction.docfinder.processor.base;

import com.jumio.core.data.document.CornerPoints;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006#"}, m90084d2 = {"Lcom/jumio/core/extraction/docfinder/processor/base/BaseImageData;", "", "corners", "Lcom/jumio/core/data/document/CornerPoints;", "sendRotateUpdate", "", "showGuideOverlay", "rotationAngle", "", "rotationTolerance", "rotationThreshold", "<init>", "(Lcom/jumio/core/data/document/CornerPoints;ZZDDD)V", "getCorners", "()Lcom/jumio/core/data/document/CornerPoints;", "getSendRotateUpdate", "()Z", "getShowGuideOverlay", "getRotationAngle", "()D", "getRotationTolerance", "getRotationThreshold", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "jumio-docfinder_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class BaseImageData {

    /* JADX INFO: renamed from: a */
    public final CornerPoints f14083a;

    /* JADX INFO: renamed from: b */
    public final boolean f14084b;

    /* JADX INFO: renamed from: c */
    public final boolean f14085c;

    /* JADX INFO: renamed from: d */
    public final double f14086d;

    /* JADX INFO: renamed from: e */
    public final double f14087e;

    /* JADX INFO: renamed from: f */
    public final double f14088f;

    public BaseImageData() {
        this(null, false, false, 0.0d, 0.0d, 0.0d, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseImageData)) {
            return false;
        }
        BaseImageData baseImageData = (BaseImageData) other;
        return Intrinsics.areEqual(this.f14083a, baseImageData.f14083a) && this.f14084b == baseImageData.f14084b && this.f14085c == baseImageData.f14085c && Double.compare(this.f14086d, baseImageData.f14086d) == 0 && Double.compare(this.f14087e, baseImageData.f14087e) == 0 && Double.compare(this.f14088f, baseImageData.f14088f) == 0;
    }

    public BaseImageData(@NotNull CornerPoints corners, boolean z11, boolean z12, double d11, double d12, double d13) {
        Intrinsics.checkNotNullParameter(corners, "corners");
        this.f14083a = corners;
        this.f14084b = z11;
        this.f14085c = z12;
        this.f14086d = d11;
        this.f14087e = d12;
        this.f14088f = d13;
    }

    public static /* synthetic */ BaseImageData copy$default(BaseImageData baseImageData, CornerPoints cornerPoints, boolean z11, boolean z12, double d11, double d12, double d13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cornerPoints = baseImageData.f14083a;
        }
        if ((i11 & 2) != 0) {
            z11 = baseImageData.f14084b;
        }
        if ((i11 & 4) != 0) {
            z12 = baseImageData.f14085c;
        }
        if ((i11 & 8) != 0) {
            d11 = baseImageData.f14086d;
        }
        if ((i11 & 16) != 0) {
            d12 = baseImageData.f14087e;
        }
        if ((i11 & 32) != 0) {
            d13 = baseImageData.f14088f;
        }
        double d14 = d13;
        double d15 = d12;
        boolean z13 = z12;
        return baseImageData.copy(cornerPoints, z11, z13, d11, d15, d14);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CornerPoints getF14083a() {
        return this.f14083a;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getF14084b() {
        return this.f14084b;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getF14085c() {
        return this.f14085c;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getF14086d() {
        return this.f14086d;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getF14087e() {
        return this.f14087e;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getF14088f() {
        return this.f14088f;
    }

    @NotNull
    public final BaseImageData copy(@NotNull CornerPoints corners, boolean sendRotateUpdate, boolean showGuideOverlay, double rotationAngle, double rotationTolerance, double rotationThreshold) {
        Intrinsics.checkNotNullParameter(corners, "corners");
        return new BaseImageData(corners, sendRotateUpdate, showGuideOverlay, rotationAngle, rotationTolerance, rotationThreshold);
    }

    @NotNull
    public final CornerPoints getCorners() {
        return this.f14083a;
    }

    public final double getRotationAngle() {
        return this.f14086d;
    }

    public final double getRotationThreshold() {
        return this.f14088f;
    }

    public final double getRotationTolerance() {
        return this.f14087e;
    }

    public final boolean getSendRotateUpdate() {
        return this.f14084b;
    }

    public final boolean getShowGuideOverlay() {
        return this.f14085c;
    }

    public int hashCode() {
        return Double.hashCode(this.f14088f) + ((Double.hashCode(this.f14087e) + ((Double.hashCode(this.f14086d) + ((Boolean.hashCode(this.f14085c) + ((Boolean.hashCode(this.f14084b) + (this.f14083a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "BaseImageData(corners=" + this.f14083a + ", sendRotateUpdate=" + this.f14084b + ", showGuideOverlay=" + this.f14085c + ", rotationAngle=" + this.f14086d + ", rotationTolerance=" + this.f14087e + ", rotationThreshold=" + this.f14088f + ')';
    }

    public /* synthetic */ BaseImageData(CornerPoints cornerPoints, boolean z11, boolean z12, double d11, double d12, double d13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new CornerPoints(null, null, null, null, 15, null) : cornerPoints, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? false : z12, (i11 & 8) != 0 ? 0.0d : d11, (i11 & 16) == 0 ? d12 : 0.0d, (i11 & 32) != 0 ? Math.toDegrees(3.141592653589793d) / ((double) 3) : d13);
    }
}
