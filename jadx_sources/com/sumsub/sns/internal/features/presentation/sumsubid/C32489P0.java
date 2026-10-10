package com.sumsub.sns.internal.features.presentation.sumsubid;

import com.sumsub.sentry.android.AbstractC27920h;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.P0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32489P0 extends AbstractC32498U0 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f66284a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f66285b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f66286c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f66287d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f66288e;

    /* JADX INFO: renamed from: f */
    public final CharSequence f66289f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f66290g;

    /* JADX INFO: renamed from: h */
    public final CharSequence f66291h;

    /* JADX INFO: renamed from: i */
    public final CharSequence f66292i;

    /* JADX INFO: renamed from: j */
    public final boolean f66293j;

    /* JADX INFO: renamed from: k */
    public final Function1 f66294k;

    /* JADX INFO: renamed from: l */
    public final Function1 f66295l;

    /* JADX INFO: renamed from: m */
    public final C32520f f66296m;

    /* JADX INFO: renamed from: n */
    public final C32520f f66297n;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32489P0)) {
            return false;
        }
        C32489P0 c32489p0 = (C32489P0) obj;
        return Intrinsics.areEqual(this.f66284a, c32489p0.f66284a) && Intrinsics.areEqual(this.f66285b, c32489p0.f66285b) && Intrinsics.areEqual(this.f66286c, c32489p0.f66286c) && Intrinsics.areEqual(this.f66287d, c32489p0.f66287d) && Intrinsics.areEqual(this.f66288e, c32489p0.f66288e) && Intrinsics.areEqual(this.f66289f, c32489p0.f66289f) && Intrinsics.areEqual(this.f66290g, c32489p0.f66290g) && Intrinsics.areEqual(this.f66291h, c32489p0.f66291h) && Intrinsics.areEqual(this.f66292i, c32489p0.f66292i) && this.f66293j == c32489p0.f66293j && Intrinsics.areEqual(this.f66294k, c32489p0.f66294k) && Intrinsics.areEqual(this.f66295l, c32489p0.f66295l) && Intrinsics.areEqual(this.f66296m, c32489p0.f66296m) && Intrinsics.areEqual(this.f66297n, c32489p0.f66297n);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f66284a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f66285b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f66286c;
        int iHashCode3 = (iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.f66287d;
        int iHashCode4 = (iHashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
        CharSequence charSequence5 = this.f66288e;
        int iHashCode5 = (iHashCode4 + (charSequence5 == null ? 0 : charSequence5.hashCode())) * 31;
        CharSequence charSequence6 = this.f66289f;
        int iHashCode6 = (iHashCode5 + (charSequence6 == null ? 0 : charSequence6.hashCode())) * 31;
        CharSequence charSequence7 = this.f66290g;
        int iHashCode7 = (iHashCode6 + (charSequence7 == null ? 0 : charSequence7.hashCode())) * 31;
        CharSequence charSequence8 = this.f66291h;
        int iHashCode8 = (iHashCode7 + (charSequence8 == null ? 0 : charSequence8.hashCode())) * 31;
        CharSequence charSequence9 = this.f66292i;
        return this.f66297n.hashCode() + ((this.f66296m.hashCode() + ((this.f66295l.hashCode() + ((this.f66294k.hashCode() + AbstractC27920h.m69001a(this.f66293j, (iHashCode8 + (charSequence9 != null ? charSequence9.hashCode() : 0)) * 31, 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f66284a;
        CharSequence charSequence2 = this.f66285b;
        CharSequence charSequence3 = this.f66286c;
        CharSequence charSequence4 = this.f66287d;
        CharSequence charSequence5 = this.f66288e;
        CharSequence charSequence6 = this.f66289f;
        CharSequence charSequence7 = this.f66290g;
        CharSequence charSequence8 = this.f66291h;
        CharSequence charSequence9 = this.f66292i;
        return "Agreement(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", continueText=" + ((Object) charSequence3) + ", skipText=" + ((Object) charSequence4) + ", benefitInstantlyText=" + ((Object) charSequence5) + ", benefitSecurelyText=" + ((Object) charSequence6) + ", benefitOptionallyText=" + ((Object) charSequence7) + ", consentText=" + ((Object) charSequence8) + ", footerText=" + ((Object) charSequence9) + ", buttonEnabled=" + this.f66293j + ", openUrlIntent=" + this.f66294k + ", consentChangedIntent=" + this.f66295l + ", confirmAction=" + this.f66296m + ", skipAction=" + this.f66297n + ")";
    }

    public C32489P0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z11, Function1 function1, Function1 function2, C32520f c32520f, C32520f c32520f2) {
        this.f66284a = str;
        this.f66285b = str2;
        this.f66286c = str3;
        this.f66287d = str4;
        this.f66288e = str5;
        this.f66289f = str6;
        this.f66290g = str7;
        this.f66291h = str8;
        this.f66292i = str9;
        this.f66293j = z11;
        this.f66294k = function1;
        this.f66295l = function2;
        this.f66296m = c32520f;
        this.f66297n = c32520f2;
    }
}
