package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.Q0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31591Q0 extends AbstractC31596T0 {

    /* JADX INFO: renamed from: b */
    public final CharSequence f64168b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f64169c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f64170d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f64171e;

    /* JADX INFO: renamed from: f */
    public final CharSequence f64172f;

    /* JADX INFO: renamed from: g */
    public final C31629j f64173g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31591Q0)) {
            return false;
        }
        C31591Q0 c31591q0 = (C31591Q0) obj;
        if (!Intrinsics.areEqual(this.f64168b, c31591q0.f64168b) || !Intrinsics.areEqual(this.f64169c, c31591q0.f64169c) || !Intrinsics.areEqual(this.f64170d, c31591q0.f64170d) || !Intrinsics.areEqual(this.f64171e, c31591q0.f64171e) || !Intrinsics.areEqual(this.f64172f, c31591q0.f64172f)) {
            return false;
        }
        C31565D c31565d = C31565D.f64095a;
        if (!Intrinsics.areEqual(c31565d, c31565d)) {
            return false;
        }
        C31654x c31654x = C31654x.f64257a;
        if (!Intrinsics.areEqual(c31654x, c31654x)) {
            return false;
        }
        C31588P c31588p = C31588P.f64166a;
        return Intrinsics.areEqual(c31588p, c31588p) && Intrinsics.areEqual(this.f64173g, c31591q0.f64173g);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f64168b;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f64169c;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f64170d;
        int iHashCode3 = (iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.f64171e;
        int iHashCode4 = (iHashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
        CharSequence charSequence5 = this.f64172f;
        return this.f64173g.hashCode() + ((((((((iHashCode4 + (charSequence5 != null ? charSequence5.hashCode() : 0)) * 31) + 44384026) * 31) - 1055173643) * 31) - 207971761) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f64168b;
        CharSequence charSequence2 = this.f64169c;
        CharSequence charSequence3 = this.f64170d;
        CharSequence charSequence4 = this.f64171e;
        CharSequence charSequence5 = this.f64172f;
        return "PinTypeSelection(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", pinTypeText=" + ((Object) charSequence3) + ", sixDigitPin=" + ((Object) charSequence4) + ", fiveDigitPin=" + ((Object) charSequence5) + ", sixDigitAction=" + C31565D.f64095a + ", fiveDigitAction=" + C31654x.f64257a + ", pinTypeAction=" + C31588P.f64166a + ", analyticsWrapper=" + this.f64173g + ")";
    }

    public C31591Q0(String str, String str2, String str3, String str4, String str5, C31629j c31629j) {
        super(c31629j);
        this.f64168b = str;
        this.f64169c = str2;
        this.f64170d = str3;
        this.f64171e = str4;
        this.f64172f = str5;
        this.f64173g = c31629j;
    }
}
