package com.sumsub.sns.internal.features.presentation.preview.photo;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31916p {

    /* JADX INFO: renamed from: a */
    public final CharSequence f64879a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f64880b;

    /* JADX INFO: renamed from: c */
    public final C31913n f64881c;

    /* JADX INFO: renamed from: d */
    public final C31913n f64882d;

    /* JADX INFO: renamed from: e */
    public final SNSPreviewPhotoDocumentViewModel$Content$State f64883e;

    /* JADX INFO: renamed from: f */
    public final C31915o f64884f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31916p)) {
            return false;
        }
        C31916p c31916p = (C31916p) obj;
        return Intrinsics.areEqual(this.f64879a, c31916p.f64879a) && Intrinsics.areEqual(this.f64880b, c31916p.f64880b) && Intrinsics.areEqual(this.f64881c, c31916p.f64881c) && Intrinsics.areEqual(this.f64882d, c31916p.f64882d) && this.f64883e == c31916p.f64883e && Intrinsics.areEqual(this.f64884f, c31916p.f64884f);
    }

    /* JADX INFO: renamed from: a */
    public static C31916p m70946a(C31916p c31916p, CharSequence charSequence, C31915o c31915o, int i11) {
        if ((i11 & 1) != 0) {
            charSequence = c31916p.f64879a;
        }
        CharSequence charSequence2 = charSequence;
        CharSequence charSequence3 = c31916p.f64880b;
        C31913n c31913n = c31916p.f64881c;
        C31913n c31913n2 = c31916p.f64882d;
        SNSPreviewPhotoDocumentViewModel$Content$State sNSPreviewPhotoDocumentViewModel$Content$State = c31916p.f64883e;
        if ((i11 & 32) != 0) {
            c31915o = c31916p.f64884f;
        }
        return new C31916p(charSequence2, charSequence3, c31913n, c31913n2, sNSPreviewPhotoDocumentViewModel$Content$State, c31915o);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f64879a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f64880b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        C31913n c31913n = this.f64881c;
        int iHashCode3 = (iHashCode2 + (c31913n == null ? 0 : c31913n.hashCode())) * 31;
        C31913n c31913n2 = this.f64882d;
        int iHashCode4 = (this.f64883e.hashCode() + ((iHashCode3 + (c31913n2 == null ? 0 : c31913n2.hashCode())) * 31)) * 31;
        C31915o c31915o = this.f64884f;
        return iHashCode4 + (c31915o != null ? c31915o.hashCode() : 0);
    }

    public final String toString() {
        CharSequence charSequence = this.f64879a;
        CharSequence charSequence2 = this.f64880b;
        return "Content(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", buttonPositive=" + this.f64881c + ", buttonNegative=" + this.f64882d + ", state=" + this.f64883e + ", progress=" + this.f64884f + ")";
    }

    public C31916p(CharSequence charSequence, CharSequence charSequence2, C31913n c31913n, C31913n c31913n2, SNSPreviewPhotoDocumentViewModel$Content$State sNSPreviewPhotoDocumentViewModel$Content$State, C31915o c31915o) {
        this.f64879a = charSequence;
        this.f64880b = charSequence2;
        this.f64881c = c31913n;
        this.f64882d = c31913n2;
        this.f64883e = sNSPreviewPhotoDocumentViewModel$Content$State;
        this.f64884f = c31915o;
    }
}
