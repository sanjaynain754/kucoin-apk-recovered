package com.sumsub.sns.internal.features.presentation.verification2.code;

import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import com.sumsub.sns.core.widget.AbstractC28250a;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.code.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32761q extends AbstractC28081V {

    /* JADX INFO: renamed from: a */
    public final CharSequence f67024a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f67025b;

    /* JADX INFO: renamed from: c */
    public final int f67026c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f67027d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f67028e;

    /* JADX INFO: renamed from: f */
    public final boolean f67029f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f67030g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32761q)) {
            return false;
        }
        C32761q c32761q = (C32761q) obj;
        return Intrinsics.areEqual(this.f67024a, c32761q.f67024a) && Intrinsics.areEqual(this.f67025b, c32761q.f67025b) && this.f67026c == c32761q.f67026c && Intrinsics.areEqual(this.f67027d, c32761q.f67027d) && Intrinsics.areEqual(this.f67028e, c32761q.f67028e) && this.f67029f == c32761q.f67029f && Intrinsics.areEqual(this.f67030g, c32761q.f67030g);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f67024a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f67025b;
        int iM69223a = AbstractC28250a.m69223a(this.f67026c, (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31, 31);
        CharSequence charSequence3 = this.f67027d;
        int iHashCode2 = (iM69223a + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.f67028e;
        int iM69001a = AbstractC27920h.m69001a(this.f67029f, (iHashCode2 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31, 31);
        CharSequence charSequence5 = this.f67030g;
        return iM69001a + (charSequence5 != null ? charSequence5.hashCode() : 0);
    }

    public final String toString() {
        CharSequence charSequence = this.f67024a;
        CharSequence charSequence2 = this.f67025b;
        int i11 = this.f67026c;
        CharSequence charSequence3 = this.f67027d;
        CharSequence charSequence4 = this.f67028e;
        return "ViewState(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", verificationCodeLength=" + i11 + ", timerText=" + ((Object) charSequence3) + ", resendButtonText=" + ((Object) charSequence4) + ", resendEnabled=" + this.f67029f + ", error=" + ((Object) this.f67030g) + ")";
    }

    public C32761q(String str, String str2, int i11, String str3, String str4, boolean z11, CharSequence charSequence) {
        this.f67024a = str;
        this.f67025b = str2;
        this.f67026c = i11;
        this.f67027d = str3;
        this.f67028e = str4;
        this.f67029f = z11;
        this.f67030g = charSequence;
    }
}
