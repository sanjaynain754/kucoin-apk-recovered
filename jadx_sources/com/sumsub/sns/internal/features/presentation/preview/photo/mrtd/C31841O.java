package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.O */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31841O extends AbstractC31844S {

    /* JADX INFO: renamed from: a */
    public final CharSequence f64706a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f64707b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f64708c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f64709d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f64710e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31841O)) {
            return false;
        }
        C31841O c31841o = (C31841O) obj;
        return Intrinsics.areEqual(this.f64706a, c31841o.f64706a) && Intrinsics.areEqual(this.f64707b, c31841o.f64707b) && Intrinsics.areEqual(this.f64708c, c31841o.f64708c) && Intrinsics.areEqual(this.f64709d, c31841o.f64709d) && Intrinsics.areEqual(this.f64710e, c31841o.f64710e);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f64706a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f64707b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f64708c;
        int iHashCode3 = (iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.f64709d;
        int iHashCode4 = (iHashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
        CharSequence charSequence5 = this.f64710e;
        return iHashCode4 + (charSequence5 != null ? charSequence5.hashCode() : 0);
    }

    public final String toString() {
        return "Intro(title=" + ((Object) this.f64706a) + ", bodyMarkdown=" + ((Object) this.f64707b) + ", actionMore=" + ((Object) this.f64708c) + ", actionStart=" + ((Object) this.f64709d) + ", actionSkip=" + ((Object) this.f64710e) + ")";
    }

    public C31841O(CharSequence charSequence, String str, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
        this.f64706a = charSequence;
        this.f64707b = str;
        this.f64708c = charSequence2;
        this.f64709d = charSequence3;
        this.f64710e = charSequence4;
    }
}
