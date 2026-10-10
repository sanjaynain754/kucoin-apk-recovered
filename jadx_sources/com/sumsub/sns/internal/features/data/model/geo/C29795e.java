package com.sumsub.sns.internal.features.data.model.geo;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.geo.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29795e {

    /* JADX INFO: renamed from: a */
    public final double f59867a;

    /* JADX INFO: renamed from: b */
    public final double f59868b;

    /* JADX INFO: renamed from: c */
    public final float f59869c;

    /* JADX INFO: renamed from: d */
    public final boolean f59870d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29795e)) {
            return false;
        }
        C29795e c29795e = (C29795e) obj;
        return Double.compare(this.f59867a, c29795e.f59867a) == 0 && Double.compare(this.f59868b, c29795e.f59868b) == 0 && Float.compare(this.f59869c, c29795e.f59869c) == 0 && this.f59870d == c29795e.f59870d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59870d) + ((Float.hashCode(this.f59869c) + ((Double.hashCode(this.f59868b) + (Double.hashCode(this.f59867a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Location(latitude=" + this.f59867a + ", longitude=" + this.f59868b + ", accuracy=" + this.f59869c + ", isMock=" + this.f59870d + ")";
    }

    public C29795e(double d11, double d12, float f11, boolean z11) {
        this.f59867a = d11;
        this.f59868b = d12;
        this.f59869c = f11;
        this.f59870d = z11;
    }
}
