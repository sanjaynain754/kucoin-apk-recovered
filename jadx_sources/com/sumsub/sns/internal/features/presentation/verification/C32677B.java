package com.sumsub.sns.internal.features.presentation.verification;

import com.sumsub.sentry.AbstractC27897U;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32677B extends AbstractC32680E {

    /* JADX INFO: renamed from: a */
    public final CharSequence f66709a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f66710b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f66711c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f66712d;

    /* JADX INFO: renamed from: e */
    public final Integer f66713e;

    /* JADX INFO: renamed from: f */
    public final CharSequence f66714f;

    /* JADX INFO: renamed from: g */
    public final String f66715g;

    /* JADX INFO: renamed from: h */
    public final String f66716h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32677B)) {
            return false;
        }
        C32677B c32677b = (C32677B) obj;
        return Intrinsics.areEqual(this.f66709a, c32677b.f66709a) && Intrinsics.areEqual(this.f66710b, c32677b.f66710b) && Intrinsics.areEqual(this.f66711c, c32677b.f66711c) && Intrinsics.areEqual(this.f66712d, c32677b.f66712d) && Intrinsics.areEqual(this.f66713e, c32677b.f66713e) && Intrinsics.areEqual(this.f66714f, c32677b.f66714f) && Intrinsics.areEqual(this.f66715g, c32677b.f66715g) && Intrinsics.areEqual(this.f66716h, c32677b.f66716h);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f66709a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f66710b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f66711c;
        int iHashCode3 = (iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.f66712d;
        int iHashCode4 = (iHashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
        Integer num = this.f66713e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        CharSequence charSequence5 = this.f66714f;
        return this.f66716h.hashCode() + AbstractC27897U.m68983a(this.f66715g, (iHashCode5 + (charSequence5 != null ? charSequence5.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f66709a;
        CharSequence charSequence2 = this.f66710b;
        CharSequence charSequence3 = this.f66711c;
        CharSequence charSequence4 = this.f66712d;
        Integer num = this.f66713e;
        CharSequence charSequence5 = this.f66714f;
        return "VerifyCode(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", timer=" + ((Object) charSequence3) + ", resendButton=" + ((Object) charSequence4) + ", verificationCodeLength=" + num + ", error=" + ((Object) charSequence5) + ", identifier=" + this.f66715g + ", id=" + this.f66716h + ")";
    }

    public C32677B(CharSequence charSequence, CharSequence charSequence2, String str, String str2, Integer num, CharSequence charSequence3, String str3, String str4) {
        this.f66709a = charSequence;
        this.f66710b = charSequence2;
        this.f66711c = str;
        this.f66712d = str2;
        this.f66713e = num;
        this.f66714f = charSequence3;
        this.f66715g = str3;
        this.f66716h = str4;
    }
}
