package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31891p extends AbstractC31897s {

    /* JADX INFO: renamed from: a */
    public final CharSequence f64815a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f64816b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f64817c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f64818d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f64819e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31891p)) {
            return false;
        }
        C31891p c31891p = (C31891p) obj;
        return Intrinsics.areEqual(this.f64815a, c31891p.f64815a) && Intrinsics.areEqual(this.f64816b, c31891p.f64816b) && Intrinsics.areEqual(this.f64817c, c31891p.f64817c) && Intrinsics.areEqual(this.f64818d, c31891p.f64818d) && Intrinsics.areEqual(this.f64819e, c31891p.f64819e);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f64815a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f64816b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f64817c;
        int iHashCode3 = (iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.f64818d;
        int iHashCode4 = (iHashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
        CharSequence charSequence5 = this.f64819e;
        return iHashCode4 + (charSequence5 != null ? charSequence5.hashCode() : 0);
    }

    public final String toString() {
        return "Intro(title=" + ((Object) this.f64815a) + ", bodyMarkdown=" + ((Object) this.f64816b) + ", actionMore=" + ((Object) this.f64817c) + ", actionStart=" + ((Object) this.f64818d) + ", actionSkip=" + ((Object) this.f64819e) + ")";
    }

    public C31891p(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5) {
        this.f64815a = charSequence;
        this.f64816b = charSequence2;
        this.f64817c = charSequence3;
        this.f64818d = charSequence4;
        this.f64819e = charSequence5;
    }
}
