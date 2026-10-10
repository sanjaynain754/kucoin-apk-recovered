package com.sumsub.sns.internal.features.presentation.prooface.utils;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.utils.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32268e {

    /* JADX INFO: renamed from: a */
    public final int f65728a;

    /* JADX INFO: renamed from: b */
    public final int f65729b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32268e)) {
            return false;
        }
        C32268e c32268e = (C32268e) obj;
        return this.f65728a == c32268e.f65728a && this.f65729b == c32268e.f65729b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f65729b) + (Integer.hashCode(this.f65728a) * 31);
    }

    public final String toString() {
        return "ScreenBrightness(mode=" + this.f65728a + ", value=" + this.f65729b + ")";
    }

    public C32268e(int i11, int i12) {
        this.f65728a = i11;
        this.f65729b = i12;
    }
}
