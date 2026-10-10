package com.sumsub.sns.internal.features.presentation.verification;

import android.text.Spanned;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.C */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32678C extends AbstractC32680E {

    /* JADX INFO: renamed from: a */
    public final CharSequence f66717a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f66718b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f66719c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f66720d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f66721e;

    /* JADX INFO: renamed from: f */
    public final C32743y f66722f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f66723g;

    /* JADX INFO: renamed from: h */
    public final boolean f66724h;

    public C32678C(String str, String str2, String str3, String str4, CharSequence charSequence, C32743y c32743y, Spanned spanned, boolean z11) {
        super(0);
        this.f66717a = str;
        this.f66718b = str2;
        this.f66719c = str3;
        this.f66720d = str4;
        this.f66721e = charSequence;
        this.f66722f = c32743y;
        this.f66723g = spanned;
        this.f66724h = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32678C)) {
            return false;
        }
        C32678C c32678c = (C32678C) obj;
        return Intrinsics.areEqual(this.f66717a, c32678c.f66717a) && Intrinsics.areEqual(this.f66718b, c32678c.f66718b) && Intrinsics.areEqual(this.f66719c, c32678c.f66719c) && Intrinsics.areEqual(this.f66720d, c32678c.f66720d) && Intrinsics.areEqual(this.f66721e, c32678c.f66721e) && Intrinsics.areEqual(this.f66722f, c32678c.f66722f) && Intrinsics.areEqual(this.f66723g, c32678c.f66723g) && this.f66724h == c32678c.f66724h;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f66717a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f66718b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f66719c;
        int iHashCode3 = (iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.f66720d;
        int iHashCode4 = (iHashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
        CharSequence charSequence5 = this.f66721e;
        int iHashCode5 = (this.f66722f.hashCode() + ((iHashCode4 + (charSequence5 == null ? 0 : charSequence5.hashCode())) * 31)) * 31;
        CharSequence charSequence6 = this.f66723g;
        return Boolean.hashCode(this.f66724h) + ((iHashCode5 + (charSequence6 != null ? charSequence6.hashCode() : 0)) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f66717a;
        CharSequence charSequence2 = this.f66718b;
        CharSequence charSequence3 = this.f66719c;
        CharSequence charSequence4 = this.f66720d;
        CharSequence charSequence5 = this.f66721e;
        C32743y c32743y = this.f66722f;
        CharSequence charSequence6 = this.f66723g;
        return "VerifyEmail(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", initialValue=" + ((Object) charSequence3) + ", hint=" + ((Object) charSequence4) + ", error=" + ((Object) charSequence5) + ", primaryButton=" + c32743y + ", footer=" + ((Object) charSequence6) + ", inputDisabled=" + this.f66724h + ")";
    }
}
