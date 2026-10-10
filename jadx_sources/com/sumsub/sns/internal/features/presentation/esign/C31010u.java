package com.sumsub.sns.internal.features.presentation.esign;

import com.sumsub.sns.internal.features.data.model.esign.C29783s;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31010u extends AbstractC31000p {

    /* JADX INFO: renamed from: b */
    public final String f62673b;

    /* JADX INFO: renamed from: c */
    public final C29783s f62674c;

    /* JADX INFO: renamed from: d */
    public final String f62675d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31010u)) {
            return false;
        }
        C31010u c31010u = (C31010u) obj;
        return Intrinsics.areEqual(this.f62673b, c31010u.f62673b) && Intrinsics.areEqual(this.f62674c, c31010u.f62674c) && Intrinsics.areEqual(this.f62675d, c31010u.f62675d);
    }

    public final int hashCode() {
        String str = this.f62673b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C29783s c29783s = this.f62674c;
        int iHashCode2 = (iHashCode + (c29783s == null ? 0 : c29783s.hashCode())) * 31;
        String str2 = this.f62675d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "OtpView(phone=" + this.f62673b + ", otp=" + this.f62674c + ", error=" + this.f62675d + ")";
    }

    public C31010u(String str, C29783s c29783s, String str2) {
        this.f62673b = str;
        this.f62674c = c29783s;
        this.f62675d = str2;
    }
}
