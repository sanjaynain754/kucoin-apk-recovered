package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.S0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31594S0 extends AbstractC31596T0 {

    /* JADX INFO: renamed from: b */
    public final CharSequence f64184b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f64185c;

    /* JADX INFO: renamed from: d */
    public final String f64186d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f64187e;

    /* JADX INFO: renamed from: f */
    public final AbstractC31595T f64188f;

    /* JADX INFO: renamed from: g */
    public final C31629j f64189g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31594S0)) {
            return false;
        }
        C31594S0 c31594s0 = (C31594S0) obj;
        return Intrinsics.areEqual(this.f64184b, c31594s0.f64184b) && Intrinsics.areEqual(this.f64185c, c31594s0.f64185c) && Intrinsics.areEqual(this.f64186d, c31594s0.f64186d) && Intrinsics.areEqual(this.f64187e, c31594s0.f64187e) && Intrinsics.areEqual(this.f64188f, c31594s0.f64188f) && Intrinsics.areEqual(this.f64189g, c31594s0.f64189g);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(true) * 31;
        CharSequence charSequence = this.f64184b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f64185c;
        int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        String str = this.f64186d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence3 = this.f64187e;
        return this.f64189g.hashCode() + ((this.f64188f.hashCode() + ((iHashCode4 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f64184b;
        CharSequence charSequence2 = this.f64185c;
        String str = this.f64186d;
        CharSequence charSequence3 = this.f64187e;
        return "Status(success=true, title=" + ((Object) charSequence) + ", text=" + ((Object) charSequence2) + ", icon=" + str + ", buttonText=" + ((Object) charSequence3) + ", buttonAction=" + this.f64188f + ", analyticsWrapper=" + this.f64189g + ")";
    }

    public C31594S0(String str, String str2, String str3, String str4, AbstractC31595T abstractC31595T, C31629j c31629j) {
        super(c31629j);
        this.f64184b = str;
        this.f64185c = str2;
        this.f64186d = str3;
        this.f64187e = str4;
        this.f64188f = abstractC31595T;
        this.f64189g = c31629j;
    }
}
