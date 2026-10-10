package com.sumsub.sns.internal.features.presentation.utils;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32663n {

    /* JADX INFO: renamed from: a */
    public final CharSequence f66659a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f66660b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f66661c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f66662d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f66663e;

    /* JADX INFO: renamed from: f */
    public final CharSequence f66664f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f66665g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32663n)) {
            return false;
        }
        C32663n c32663n = (C32663n) obj;
        return Intrinsics.areEqual(this.f66659a, c32663n.f66659a) && Intrinsics.areEqual(this.f66660b, c32663n.f66660b) && Intrinsics.areEqual(this.f66661c, c32663n.f66661c) && Intrinsics.areEqual(this.f66662d, c32663n.f66662d) && Intrinsics.areEqual(this.f66663e, c32663n.f66663e) && Intrinsics.areEqual(this.f66664f, c32663n.f66664f) && Intrinsics.areEqual(this.f66665g, c32663n.f66665g);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f66659a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f66660b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f66661c;
        int iHashCode3 = (iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.f66662d;
        int iHashCode4 = (iHashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
        CharSequence charSequence5 = this.f66663e;
        int iHashCode5 = (iHashCode4 + (charSequence5 == null ? 0 : charSequence5.hashCode())) * 31;
        CharSequence charSequence6 = this.f66664f;
        int iHashCode6 = (iHashCode5 + (charSequence6 == null ? 0 : charSequence6.hashCode())) * 31;
        CharSequence charSequence7 = this.f66665g;
        return iHashCode6 + (charSequence7 != null ? charSequence7.hashCode() : 0);
    }

    public final String toString() {
        return "Texts(addFileLabel=" + ((Object) this.f66659a) + ", addOptionalFileLabel=" + ((Object) this.f66660b) + ", documentLabel=" + ((Object) this.f66661c) + ", optionalDocumentLabel=" + ((Object) this.f66662d) + ", uploading=" + ((Object) this.f66663e) + ", processing=" + ((Object) this.f66664f) + ", optionalSuffix=" + ((Object) this.f66665g) + ")";
    }

    public C32663n(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, CharSequence charSequence6, CharSequence charSequence7) {
        this.f66659a = charSequence;
        this.f66660b = charSequence2;
        this.f66661c = charSequence3;
        this.f66662d = charSequence4;
        this.f66663e = charSequence5;
        this.f66664f = charSequence6;
        this.f66665g = charSequence7;
    }
}
