package com.sumsub.sns.internal.features.presentation.sumsubid;

import com.sumsub.sentry.android.AbstractC27920h;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.R0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32492R0 extends AbstractC32498U0 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f66307a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f66308b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f66309c;

    /* JADX INFO: renamed from: d */
    public final String f66310d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f66311e;

    /* JADX INFO: renamed from: f */
    public final CharSequence f66312f;

    /* JADX INFO: renamed from: g */
    public final boolean f66313g;

    /* JADX INFO: renamed from: h */
    public final CharSequence f66314h;

    /* JADX INFO: renamed from: i */
    public final Function1 f66315i;

    /* JADX INFO: renamed from: j */
    public final C32520f f66316j;

    /* JADX INFO: renamed from: k */
    public final C32520f f66317k;

    /* JADX INFO: renamed from: l */
    public final C32520f f66318l;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32492R0)) {
            return false;
        }
        C32492R0 c32492r0 = (C32492R0) obj;
        return Intrinsics.areEqual(this.f66307a, c32492r0.f66307a) && Intrinsics.areEqual(this.f66308b, c32492r0.f66308b) && Intrinsics.areEqual(this.f66309c, c32492r0.f66309c) && Intrinsics.areEqual(this.f66310d, c32492r0.f66310d) && Intrinsics.areEqual(this.f66311e, c32492r0.f66311e) && Intrinsics.areEqual(this.f66312f, c32492r0.f66312f) && this.f66313g == c32492r0.f66313g && Intrinsics.areEqual(this.f66314h, c32492r0.f66314h) && Intrinsics.areEqual(this.f66315i, c32492r0.f66315i) && Intrinsics.areEqual(this.f66316j, c32492r0.f66316j) && Intrinsics.areEqual(this.f66317k, c32492r0.f66317k) && Intrinsics.areEqual(this.f66318l, c32492r0.f66318l);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f66307a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f66308b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f66309c;
        int iHashCode3 = (iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        String str = this.f66310d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence4 = this.f66311e;
        int iHashCode5 = (iHashCode4 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
        CharSequence charSequence5 = this.f66312f;
        int iM69001a = AbstractC27920h.m69001a(this.f66313g, (iHashCode5 + (charSequence5 == null ? 0 : charSequence5.hashCode())) * 31, 31);
        CharSequence charSequence6 = this.f66314h;
        return this.f66318l.hashCode() + ((this.f66317k.hashCode() + ((this.f66316j.hashCode() + ((this.f66315i.hashCode() + ((iM69001a + (charSequence6 != null ? charSequence6.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f66307a;
        CharSequence charSequence2 = this.f66308b;
        CharSequence charSequence3 = this.f66309c;
        String str = this.f66310d;
        CharSequence charSequence4 = this.f66311e;
        CharSequence charSequence5 = this.f66312f;
        boolean z11 = this.f66313g;
        CharSequence charSequence6 = this.f66314h;
        return "Email(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", hint=" + ((Object) charSequence3) + ", currentEmail=" + str + ", errorText=" + ((Object) charSequence4) + ", buttonText=" + ((Object) charSequence5) + ", buttonEnabled=" + z11 + ", skipText=" + ((Object) charSequence6) + ", emailChangedIntent=" + this.f66315i + ", confirmAction=" + this.f66316j + ", skipAction=" + this.f66317k + ", learnMoreAction=" + this.f66318l + ")";
    }

    public C32492R0(String str, String str2, String str3, String str4, CharSequence charSequence, CharSequence charSequence2, boolean z11, String str5, Function1 function1, C32520f c32520f, C32520f c32520f2, C32520f c32520f3) {
        this.f66307a = str;
        this.f66308b = str2;
        this.f66309c = str3;
        this.f66310d = str4;
        this.f66311e = charSequence;
        this.f66312f = charSequence2;
        this.f66313g = z11;
        this.f66314h = str5;
        this.f66315i = function1;
        this.f66316j = c32520f;
        this.f66317k = c32520f2;
        this.f66318l = c32520f3;
    }
}
