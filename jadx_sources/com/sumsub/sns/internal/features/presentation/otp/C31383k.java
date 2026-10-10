package com.sumsub.sns.internal.features.presentation.otp;

import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.core.widget.AbstractC28250a;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.otp.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31383k implements InterfaceC28147s {

    /* JADX INFO: renamed from: a */
    public final String f63589a;

    /* JADX INFO: renamed from: b */
    public final String f63590b;

    /* JADX INFO: renamed from: c */
    public final int f63591c;

    /* JADX INFO: renamed from: d */
    public final String f63592d;

    /* JADX INFO: renamed from: e */
    public final boolean f63593e;

    /* JADX INFO: renamed from: f */
    public final String f63594f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31383k)) {
            return false;
        }
        C31383k c31383k = (C31383k) obj;
        return Intrinsics.areEqual(this.f63589a, c31383k.f63589a) && Intrinsics.areEqual(this.f63590b, c31383k.f63590b) && this.f63591c == c31383k.f63591c && Intrinsics.areEqual(this.f63592d, c31383k.f63592d) && this.f63593e == c31383k.f63593e && Intrinsics.areEqual(this.f63594f, c31383k.f63594f);
    }

    public final int hashCode() {
        String str = this.f63589a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f63590b;
        int iM69223a = AbstractC28250a.m69223a(this.f63591c, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f63592d;
        int iM69001a = AbstractC27920h.m69001a(this.f63593e, (iM69223a + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.f63594f;
        return iM69001a + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "OtpInputViewState(title=" + this.f63589a + ", subTitle=" + this.f63590b + ", pinLength=" + this.f63591c + ", resendButton=" + this.f63592d + ", isResendEnabled=" + this.f63593e + ", error=" + this.f63594f + ")";
    }

    public C31383k(int i11, String str, String str2, String str3, String str4, boolean z11) {
        this.f63589a = str;
        this.f63590b = str2;
        this.f63591c = i11;
        this.f63592d = str3;
        this.f63593e = z11;
        this.f63594f = str4;
    }
}
