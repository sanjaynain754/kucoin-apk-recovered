package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.P */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31842P extends AbstractC31844S {

    /* JADX INFO: renamed from: a */
    public final CharSequence f64711a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f64712b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f64713c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31842P)) {
            return false;
        }
        C31842P c31842p = (C31842P) obj;
        return Intrinsics.areEqual(this.f64711a, c31842p.f64711a) && Intrinsics.areEqual(this.f64712b, c31842p.f64712b) && Intrinsics.areEqual(this.f64713c, c31842p.f64713c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f64711a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f64712b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f64713c;
        return iHashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
    }

    public final String toString() {
        return "Listening(title=" + ((Object) this.f64711a) + ", subtitle=" + ((Object) this.f64712b) + ", actionCancel=" + ((Object) this.f64713c) + ")";
    }

    public C31842P(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.f64711a = charSequence;
        this.f64712b = charSequence2;
        this.f64713c = charSequence3;
    }
}
