package com.sumsub.sns.internal.core.presentation.camera;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.camera.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28758x {

    /* JADX INFO: renamed from: a */
    public final float f58488a;

    /* JADX INFO: renamed from: b */
    public final float f58489b;

    /* JADX INFO: renamed from: c */
    public final float f58490c;

    public C28758x() {
        this.f58488a = 0.0f;
        this.f58489b = 0.0f;
        this.f58490c = 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28758x)) {
            return false;
        }
        C28758x c28758x = (C28758x) obj;
        return Float.compare(this.f58488a, c28758x.f58488a) == 0 && Float.compare(this.f58489b, c28758x.f58489b) == 0 && Float.compare(this.f58490c, c28758x.f58490c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f58490c) + ((Float.hashCode(this.f58489b) + (Float.hashCode(this.f58488a) * 31)) * 31);
    }

    public final String toString() {
        return "Exposure(current=" + this.f58488a + ", min=" + this.f58489b + ", max=" + this.f58490c + ")";
    }

    public C28758x(float f11, float f12, float f13) {
        this.f58488a = f11;
        this.f58489b = f12;
        this.f58490c = f13;
    }
}
