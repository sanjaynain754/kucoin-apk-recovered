package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31540b {

    /* JADX INFO: renamed from: a */
    public final CharSequence f64039a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f64040b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f64041c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31540b)) {
            return false;
        }
        C31540b c31540b = (C31540b) obj;
        return Intrinsics.areEqual(this.f64039a, c31540b.f64039a) && Intrinsics.areEqual(this.f64040b, c31540b.f64040b) && Intrinsics.areEqual(this.f64041c, c31540b.f64041c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f64039a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f64040b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f64041c;
        return iHashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
    }

    public final String toString() {
        return "EkycOauthInstructions(title=" + ((Object) this.f64039a) + ", body=" + ((Object) this.f64040b) + ", buttonText=" + ((Object) this.f64041c) + ")";
    }

    public C31540b(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.f64039a = charSequence;
        this.f64040b = charSequence2;
        this.f64041c = charSequence3;
    }
}
