package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import com.sumsub.sns.internal.features.data.model.common.remote.response.C29456A0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31736z extends AbstractC31514B {

    /* JADX INFO: renamed from: a */
    public final CharSequence f64463a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f64464b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f64465c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f64466d;

    /* JADX INFO: renamed from: e */
    public final long f64467e;

    /* JADX INFO: renamed from: f */
    public final C29456A0 f64468f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31736z)) {
            return false;
        }
        C31736z c31736z = (C31736z) obj;
        return Intrinsics.areEqual(this.f64463a, c31736z.f64463a) && Intrinsics.areEqual(this.f64464b, c31736z.f64464b) && Intrinsics.areEqual(this.f64465c, c31736z.f64465c) && Intrinsics.areEqual(this.f64466d, c31736z.f64466d) && this.f64467e == c31736z.f64467e && Intrinsics.areEqual(this.f64468f, c31736z.f64468f);
    }

    /* JADX INFO: renamed from: a */
    public static C31736z m70852a(C31736z c31736z, CharSequence charSequence, String str, long j11, C29456A0 c29456a0, int i11) {
        CharSequence charSequence2 = c31736z.f64463a;
        CharSequence charSequence3 = c31736z.f64464b;
        CharSequence charSequence4 = str;
        if ((i11 & 8) != 0) {
            charSequence4 = c31736z.f64466d;
        }
        CharSequence charSequence5 = charSequence4;
        if ((i11 & 16) != 0) {
            j11 = c31736z.f64467e;
        }
        long j12 = j11;
        if ((i11 & 32) != 0) {
            c29456a0 = c31736z.f64468f;
        }
        return new C31736z(charSequence2, charSequence3, charSequence, charSequence5, j12, c29456a0);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f64463a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f64464b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f64465c;
        int iHashCode3 = (iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.f64466d;
        int iHashCode4 = (Long.hashCode(this.f64467e) + ((iHashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31)) * 31;
        C29456A0 c29456a0 = this.f64468f;
        return iHashCode4 + (c29456a0 != null ? c29456a0.hashCode() : 0);
    }

    public final String toString() {
        CharSequence charSequence = this.f64463a;
        CharSequence charSequence2 = this.f64464b;
        CharSequence charSequence3 = this.f64465c;
        CharSequence charSequence4 = this.f64466d;
        return "OtpConfirm(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", buttonResendCode=" + ((Object) charSequence3) + ", error=" + ((Object) charSequence4) + ", secondsRemaining=" + this.f64467e + ", submitResponse=" + this.f64468f + ")";
    }

    public C31736z(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, long j11, C29456A0 c29456a0) {
        this.f64463a = charSequence;
        this.f64464b = charSequence2;
        this.f64465c = charSequence3;
        this.f64466d = charSequence4;
        this.f64467e = j11;
        this.f64468f = c29456a0;
    }
}
