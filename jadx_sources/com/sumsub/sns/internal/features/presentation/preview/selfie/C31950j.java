package com.sumsub.sns.internal.features.presentation.preview.selfie;

import com.sumsub.sns.internal.features.presentation.preview.AbstractC31512e;
import java.io.File;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.selfie.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31950j extends AbstractC31512e {

    /* JADX INFO: renamed from: a */
    public final File f64964a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f64965b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f64966c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f64967d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f64968e;

    /* JADX INFO: renamed from: f */
    public final boolean f64969f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31950j)) {
            return false;
        }
        C31950j c31950j = (C31950j) obj;
        return Intrinsics.areEqual(this.f64964a, c31950j.f64964a) && Intrinsics.areEqual(this.f64965b, c31950j.f64965b) && Intrinsics.areEqual(this.f64966c, c31950j.f64966c) && Intrinsics.areEqual(this.f64967d, c31950j.f64967d) && Intrinsics.areEqual(this.f64968e, c31950j.f64968e) && this.f64969f == c31950j.f64969f;
    }

    /* JADX INFO: renamed from: a */
    public static C31950j m70960a(C31950j c31950j, File file, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z11, int i11) {
        if ((i11 & 1) != 0) {
            file = c31950j.f64964a;
        }
        File file2 = file;
        if ((i11 & 2) != 0) {
            charSequence = c31950j.f64965b;
        }
        CharSequence charSequence5 = charSequence;
        if ((i11 & 4) != 0) {
            charSequence2 = c31950j.f64966c;
        }
        CharSequence charSequence6 = charSequence2;
        if ((i11 & 8) != 0) {
            charSequence3 = c31950j.f64967d;
        }
        CharSequence charSequence7 = charSequence3;
        if ((i11 & 16) != 0) {
            charSequence4 = c31950j.f64968e;
        }
        CharSequence charSequence8 = charSequence4;
        if ((i11 & 32) != 0) {
            z11 = c31950j.f64969f;
        }
        c31950j.getClass();
        return new C31950j(file2, charSequence5, charSequence6, charSequence7, charSequence8, z11);
    }

    public final int hashCode() {
        File file = this.f64964a;
        int iHashCode = (file == null ? 0 : file.hashCode()) * 31;
        CharSequence charSequence = this.f64965b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f64966c;
        int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f64967d;
        int iHashCode4 = (iHashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.f64968e;
        return Boolean.hashCode(this.f64969f) + ((iHashCode4 + (charSequence4 != null ? charSequence4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        File file = this.f64964a;
        CharSequence charSequence = this.f64965b;
        CharSequence charSequence2 = this.f64966c;
        CharSequence charSequence3 = this.f64967d;
        CharSequence charSequence4 = this.f64968e;
        return "ViewState(videoFile=" + file + ", title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", buttonPositive=" + ((Object) charSequence3) + ", buttonNegative=" + ((Object) charSequence4) + ", showContent=" + this.f64969f + ")";
    }

    public C31950j(File file, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z11) {
        this.f64964a = file;
        this.f64965b = charSequence;
        this.f64966c = charSequence2;
        this.f64967d = charSequence3;
        this.f64968e = charSequence4;
        this.f64969f = z11;
    }
}
