package com.jumio.commons.camera;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u001c"}, m90084d2 = {"Lcom/jumio/commons/camera/MeteringPoint;", "", "x", "", "y", "width", "height", "<init>", "(FFFF)V", "getX", "()F", "getY", "getWidth", "getHeight", "isNormalized", "", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MeteringPoint {

    /* JADX INFO: renamed from: a */
    public final float f13557a;

    /* JADX INFO: renamed from: b */
    public final float f13558b;

    /* JADX INFO: renamed from: c */
    public final float f13559c;

    /* JADX INFO: renamed from: d */
    public final float f13560d;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MeteringPoint)) {
            return false;
        }
        MeteringPoint meteringPoint = (MeteringPoint) other;
        return Float.compare(this.f13557a, meteringPoint.f13557a) == 0 && Float.compare(this.f13558b, meteringPoint.f13558b) == 0 && Float.compare(this.f13559c, meteringPoint.f13559c) == 0 && Float.compare(this.f13560d, meteringPoint.f13560d) == 0;
    }

    public static /* synthetic */ MeteringPoint copy$default(MeteringPoint meteringPoint, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = meteringPoint.f13557a;
        }
        if ((i11 & 2) != 0) {
            f12 = meteringPoint.f13558b;
        }
        if ((i11 & 4) != 0) {
            f13 = meteringPoint.f13559c;
        }
        if ((i11 & 8) != 0) {
            f14 = meteringPoint.f13560d;
        }
        return meteringPoint.copy(f11, f12, f13, f14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getF13557a() {
        return this.f13557a;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getF13558b() {
        return this.f13558b;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getF13559c() {
        return this.f13559c;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getF13560d() {
        return this.f13560d;
    }

    @NotNull
    public final MeteringPoint copy(float x11, float y11, float width, float height) {
        return new MeteringPoint(x11, y11, width, height);
    }

    public final float getHeight() {
        return this.f13560d;
    }

    public final float getWidth() {
        return this.f13559c;
    }

    public final float getX() {
        return this.f13557a;
    }

    public final float getY() {
        return this.f13558b;
    }

    public int hashCode() {
        return Float.hashCode(this.f13560d) + ((Float.hashCode(this.f13559c) + ((Float.hashCode(this.f13558b) + (Float.hashCode(this.f13557a) * 31)) * 31)) * 31);
    }

    public final boolean isNormalized() {
        return this.f13557a <= 1.0f && this.f13558b <= 1.0f && this.f13559c <= 1.0f && this.f13560d <= 1.0f;
    }

    @NotNull
    public String toString() {
        return "MeteringPoint(x=" + this.f13557a + ", y=" + this.f13558b + ", width=" + this.f13559c + ", height=" + this.f13560d + ')';
    }

    public MeteringPoint(float f11, float f12, float f13, float f14) {
        this.f13557a = f11;
        this.f13558b = f12;
        this.f13559c = f13;
        this.f13560d = f14;
    }
}
