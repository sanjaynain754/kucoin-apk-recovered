package com.sumsub.sns.internal.features.presentation.paymentmethod.upload;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.upload.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31433m {

    /* JADX INFO: renamed from: a */
    public final C31432l f63697a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f63698b;

    /* JADX INFO: renamed from: c */
    public final C31434n f63699c;

    /* JADX INFO: renamed from: d */
    public final C31434n f63700d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31433m)) {
            return false;
        }
        C31433m c31433m = (C31433m) obj;
        return Intrinsics.areEqual(this.f63697a, c31433m.f63697a) && Intrinsics.areEqual(this.f63698b, c31433m.f63698b) && Intrinsics.areEqual(this.f63699c, c31433m.f63699c) && Intrinsics.areEqual(this.f63700d, c31433m.f63700d);
    }

    public final int hashCode() {
        int iHashCode = this.f63697a.hashCode() * 31;
        CharSequence charSequence = this.f63698b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        C31434n c31434n = this.f63699c;
        int iHashCode3 = (iHashCode2 + (c31434n == null ? 0 : c31434n.hashCode())) * 31;
        C31434n c31434n2 = this.f63700d;
        return iHashCode3 + (c31434n2 != null ? c31434n2.hashCode() : 0);
    }

    public final String toString() {
        C31432l c31432l = this.f63697a;
        CharSequence charSequence = this.f63698b;
        return "FileChooserState(texts=" + c31432l + ", fileFormats=" + ((Object) charSequence) + ", file1=" + this.f63699c + ", file2=" + this.f63700d + ")";
    }

    public C31433m(C31432l c31432l, String str, C31434n c31434n, C31434n c31434n2) {
        this.f63697a = c31432l;
        this.f63698b = str;
        this.f63699c = c31434n;
        this.f63700d = c31434n2;
    }
}
