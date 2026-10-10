package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.O0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31587O0 extends AbstractC31596T0 {

    /* JADX INFO: renamed from: b */
    public final CharSequence f64160b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f64161c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f64162d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f64163e;

    /* JADX INFO: renamed from: f */
    public final C31576J f64164f;

    /* JADX INFO: renamed from: g */
    public final C31629j f64165g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31587O0)) {
            return false;
        }
        C31587O0 c31587o0 = (C31587O0) obj;
        if (!Intrinsics.areEqual(this.f64160b, c31587o0.f64160b) || !Intrinsics.areEqual(this.f64161c, c31587o0.f64161c) || !Intrinsics.areEqual(this.f64162d, c31587o0.f64162d)) {
            return false;
        }
        C31584N c31584n = C31584N.f64153a;
        return Intrinsics.areEqual(c31584n, c31584n) && Intrinsics.areEqual(this.f64163e, c31587o0.f64163e) && Intrinsics.areEqual(this.f64164f, c31587o0.f64164f) && Intrinsics.areEqual(this.f64165g, c31587o0.f64165g);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f64160b;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f64161c;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f64162d;
        int iHashCode3 = (((iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31) - 1297974563) * 31;
        CharSequence charSequence4 = this.f64163e;
        return this.f64165g.hashCode() + ((this.f64164f.hashCode() + ((iHashCode3 + (charSequence4 != null ? charSequence4.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f64160b;
        CharSequence charSequence2 = this.f64161c;
        CharSequence charSequence3 = this.f64162d;
        C31584N c31584n = C31584N.f64153a;
        CharSequence charSequence4 = this.f64163e;
        return "LegalInfo(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", infoButtonText=" + ((Object) charSequence3) + ", infoButtonAction=" + c31584n + ", buttonText=" + ((Object) charSequence4) + ", buttonAction=" + this.f64164f + ", analyticsWrapper=" + this.f64165g + ")";
    }

    public C31587O0(String str, String str2, String str3, String str4, C31576J c31576j, C31629j c31629j) {
        super(c31629j);
        this.f64160b = str;
        this.f64161c = str2;
        this.f64162d = str3;
        this.f64163e = str4;
        this.f64164f = c31576j;
        this.f64165g = c31629j;
    }
}
