package com.sumsub.sns.internal.features.presentation.paymentmethod.upload;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.upload.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31432l {

    /* JADX INFO: renamed from: a */
    public final CharSequence f63690a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f63691b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f63692c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f63693d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f63694e;

    /* JADX INFO: renamed from: f */
    public final CharSequence f63695f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f63696g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31432l)) {
            return false;
        }
        C31432l c31432l = (C31432l) obj;
        return Intrinsics.areEqual(this.f63690a, c31432l.f63690a) && Intrinsics.areEqual(this.f63691b, c31432l.f63691b) && Intrinsics.areEqual(this.f63692c, c31432l.f63692c) && Intrinsics.areEqual(this.f63693d, c31432l.f63693d) && Intrinsics.areEqual(this.f63694e, c31432l.f63694e) && Intrinsics.areEqual(this.f63695f, c31432l.f63695f) && Intrinsics.areEqual(this.f63696g, c31432l.f63696g);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f63690a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f63691b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f63692c;
        int iHashCode3 = (iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.f63693d;
        int iHashCode4 = (iHashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
        CharSequence charSequence5 = this.f63694e;
        int iHashCode5 = (iHashCode4 + (charSequence5 == null ? 0 : charSequence5.hashCode())) * 31;
        CharSequence charSequence6 = this.f63695f;
        int iHashCode6 = (iHashCode5 + (charSequence6 == null ? 0 : charSequence6.hashCode())) * 31;
        CharSequence charSequence7 = this.f63696g;
        return iHashCode6 + (charSequence7 != null ? charSequence7.hashCode() : 0);
    }

    public final String toString() {
        return "FileBinderTexts(addFileLabel=" + ((Object) this.f63690a) + ", optionalAddFileLabel=" + ((Object) this.f63691b) + ", documentLabel=" + ((Object) this.f63692c) + ", optionalDocumentLabel=" + ((Object) this.f63693d) + ", uploadingLabel=" + ((Object) this.f63694e) + ", processingLabel=" + ((Object) this.f63695f) + ", optionalSuffix=" + ((Object) this.f63696g) + ")";
    }

    public C31432l(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f63690a = str;
        this.f63691b = str2;
        this.f63692c = str3;
        this.f63693d = str4;
        this.f63694e = str5;
        this.f63695f = str6;
        this.f63696g = str7;
    }
}
