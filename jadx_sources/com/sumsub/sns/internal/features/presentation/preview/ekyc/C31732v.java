package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import com.sumsub.sns.internal.features.domain.appdata.C30095b;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31732v extends AbstractC31514B {

    /* JADX INFO: renamed from: a */
    public final CharSequence f64448a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f64449b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f64450c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f64451d;

    /* JADX INFO: renamed from: e */
    public final C30095b f64452e;

    /* JADX INFO: renamed from: f */
    public final String f64453f;

    /* JADX INFO: renamed from: g */
    public final String f64454g;

    /* JADX INFO: renamed from: h */
    public final List f64455h;

    /* JADX INFO: renamed from: i */
    public final C31540b f64456i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31732v)) {
            return false;
        }
        C31732v c31732v = (C31732v) obj;
        return Intrinsics.areEqual(this.f64448a, c31732v.f64448a) && Intrinsics.areEqual(this.f64449b, c31732v.f64449b) && Intrinsics.areEqual(this.f64450c, c31732v.f64450c) && Intrinsics.areEqual(this.f64451d, c31732v.f64451d) && Intrinsics.areEqual(this.f64452e, c31732v.f64452e) && Intrinsics.areEqual(this.f64453f, c31732v.f64453f) && Intrinsics.areEqual(this.f64454g, c31732v.f64454g) && Intrinsics.areEqual(this.f64455h, c31732v.f64455h) && Intrinsics.areEqual(this.f64456i, c31732v.f64456i);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f64448a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f64449b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f64450c;
        int iHashCode3 = (iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.f64451d;
        int iHashCode4 = (this.f64452e.hashCode() + ((iHashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31)) * 31;
        String str = this.f64453f;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f64454g;
        int iHashCode6 = (this.f64455h.hashCode() + ((iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        C31540b c31540b = this.f64456i;
        return iHashCode6 + (c31540b != null ? c31540b.hashCode() : 0);
    }

    public final String toString() {
        CharSequence charSequence = this.f64448a;
        CharSequence charSequence2 = this.f64449b;
        CharSequence charSequence3 = this.f64450c;
        CharSequence charSequence4 = this.f64451d;
        return "AppData(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", buttonContinue=" + ((Object) charSequence3) + ", buttonSkip=" + ((Object) charSequence4) + ", resources=" + this.f64452e + ", currentCountry=" + this.f64453f + ", currentSourceId=" + this.f64454g + ", formItems=" + this.f64455h + ", oauthInstructions=" + this.f64456i + ")";
    }

    public C31732v(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, C30095b c30095b, String str, String str2, List list, C31540b c31540b) {
        this.f64448a = charSequence;
        this.f64449b = charSequence2;
        this.f64450c = charSequence3;
        this.f64451d = charSequence4;
        this.f64452e = c30095b;
        this.f64453f = str;
        this.f64454g = str2;
        this.f64455h = list;
        this.f64456i = c31540b;
    }
}
