package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.R0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31592R0 extends AbstractC31596T0 {

    /* JADX INFO: renamed from: b */
    public final CharSequence f64174b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f64175c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f64176d;

    /* JADX INFO: renamed from: e */
    public final Integer f64177e;

    /* JADX INFO: renamed from: f */
    public final CharSequence f64178f;

    /* JADX INFO: renamed from: g */
    public final AbstractC31595T f64179g;

    /* JADX INFO: renamed from: h */
    public final CharSequence f64180h;

    /* JADX INFO: renamed from: i */
    public final CharSequence f64181i;

    /* JADX INFO: renamed from: j */
    public final C31629j f64182j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31592R0)) {
            return false;
        }
        C31592R0 c31592r0 = (C31592R0) obj;
        return Intrinsics.areEqual(this.f64174b, c31592r0.f64174b) && Intrinsics.areEqual(this.f64175c, c31592r0.f64175c) && Intrinsics.areEqual(this.f64176d, c31592r0.f64176d) && Intrinsics.areEqual(this.f64177e, c31592r0.f64177e) && Intrinsics.areEqual(this.f64178f, c31592r0.f64178f) && Intrinsics.areEqual(this.f64179g, c31592r0.f64179g) && Intrinsics.areEqual(this.f64180h, c31592r0.f64180h) && Intrinsics.areEqual(this.f64181i, c31592r0.f64181i) && Intrinsics.areEqual(this.f64182j, c31592r0.f64182j);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f64174b;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f64175c;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f64176d;
        int iHashCode3 = (iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        Integer num = this.f64177e;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        CharSequence charSequence4 = this.f64178f;
        int iHashCode5 = (iHashCode4 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
        AbstractC31595T abstractC31595T = this.f64179g;
        int iHashCode6 = (iHashCode5 + (abstractC31595T == null ? 0 : abstractC31595T.hashCode())) * 31;
        CharSequence charSequence5 = this.f64180h;
        int iHashCode7 = (iHashCode6 + (charSequence5 == null ? 0 : charSequence5.hashCode())) * 31;
        CharSequence charSequence6 = this.f64181i;
        return this.f64182j.hashCode() + ((iHashCode7 + (charSequence6 != null ? charSequence6.hashCode() : 0)) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f64174b;
        CharSequence charSequence2 = this.f64175c;
        CharSequence charSequence3 = this.f64176d;
        Integer num = this.f64177e;
        CharSequence charSequence4 = this.f64178f;
        AbstractC31595T abstractC31595T = this.f64179g;
        CharSequence charSequence5 = this.f64180h;
        CharSequence charSequence6 = this.f64181i;
        return "Scanning(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", status=" + ((Object) charSequence3) + ", progress=" + num + ", buttonText=" + ((Object) charSequence4) + ", buttonAction=" + abstractC31595T + ", animationChip=" + ((Object) charSequence5) + ", animationPhone=" + ((Object) charSequence6) + ", analyticsWrapper=" + this.f64182j + ")";
    }

    public C31592R0(String str, String str2, String str3, Integer num, String str4, AbstractC31595T abstractC31595T, String str5, String str6, C31629j c31629j) {
        super(c31629j);
        this.f64174b = str;
        this.f64175c = str2;
        this.f64176d = str3;
        this.f64177e = num;
        this.f64178f = str4;
        this.f64179g = abstractC31595T;
        this.f64180h = str5;
        this.f64181i = str6;
        this.f64182j = c31629j;
    }
}
