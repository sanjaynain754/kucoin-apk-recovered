package com.sumsub.sns.internal.features.presentation.verification;

import android.text.Spanned;
import com.sumsub.sns.internal.features.domain.C30270n;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.D */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32679D extends AbstractC32680E {

    /* JADX INFO: renamed from: a */
    public final CharSequence f66725a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f66726b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f66727c;

    /* JADX INFO: renamed from: d */
    public final C30270n f66728d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f66729e;

    /* JADX INFO: renamed from: f */
    public final C32743y f66730f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f66731g;

    /* JADX INFO: renamed from: h */
    public final boolean f66732h;

    public C32679D(CharSequence charSequence, CharSequence charSequence2, String str, C30270n c30270n, CharSequence charSequence3, C32743y c32743y, Spanned spanned, boolean z11) {
        super(0);
        this.f66725a = charSequence;
        this.f66726b = charSequence2;
        this.f66727c = str;
        this.f66728d = c30270n;
        this.f66729e = charSequence3;
        this.f66730f = c32743y;
        this.f66731g = spanned;
        this.f66732h = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32679D)) {
            return false;
        }
        C32679D c32679d = (C32679D) obj;
        return Intrinsics.areEqual(this.f66725a, c32679d.f66725a) && Intrinsics.areEqual(this.f66726b, c32679d.f66726b) && Intrinsics.areEqual(this.f66727c, c32679d.f66727c) && Intrinsics.areEqual(this.f66728d, c32679d.f66728d) && Intrinsics.areEqual(this.f66729e, c32679d.f66729e) && Intrinsics.areEqual(this.f66730f, c32679d.f66730f) && Intrinsics.areEqual(this.f66731g, c32679d.f66731g) && this.f66732h == c32679d.f66732h;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f66725a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f66726b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f66727c;
        int iHashCode3 = (this.f66728d.hashCode() + ((iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31)) * 31;
        CharSequence charSequence4 = this.f66729e;
        int iHashCode4 = (this.f66730f.hashCode() + ((iHashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31)) * 31;
        CharSequence charSequence5 = this.f66731g;
        return Boolean.hashCode(this.f66732h) + ((iHashCode4 + (charSequence5 != null ? charSequence5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f66725a;
        CharSequence charSequence2 = this.f66726b;
        CharSequence charSequence3 = this.f66727c;
        C30270n c30270n = this.f66728d;
        CharSequence charSequence4 = this.f66729e;
        C32743y c32743y = this.f66730f;
        CharSequence charSequence5 = this.f66731g;
        return "VerifyPhone(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", initialValue=" + ((Object) charSequence3) + ", countryResultData=" + c30270n + ", error=" + ((Object) charSequence4) + ", primaryButton=" + c32743y + ", footer=" + ((Object) charSequence5) + ", inputDisabled=" + this.f66732h + ")";
    }
}
