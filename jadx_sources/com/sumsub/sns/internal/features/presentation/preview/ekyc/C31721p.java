package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31721p implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final String f64429a;

    /* JADX INFO: renamed from: b */
    public final String f64430b;

    /* JADX INFO: renamed from: c */
    public final String f64431c;

    /* JADX INFO: renamed from: d */
    public final String f64432d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31721p)) {
            return false;
        }
        C31721p c31721p = (C31721p) obj;
        return Intrinsics.areEqual(this.f64429a, c31721p.f64429a) && Intrinsics.areEqual(this.f64430b, c31721p.f64430b) && Intrinsics.areEqual(this.f64431c, c31721p.f64431c) && Intrinsics.areEqual(this.f64432d, c31721p.f64432d);
    }

    public final int hashCode() {
        String str = this.f64429a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f64430b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f64431c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f64432d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "EidConfirmationEvent(mobileToken=" + this.f64429a + ", url=" + this.f64430b + ", certificatePem=***, confirmationId=" + this.f64432d + ")";
    }

    public C31721p(String str, String str2, String str3, String str4) {
        this.f64429a = str;
        this.f64430b = str2;
        this.f64431c = str3;
        this.f64432d = str4;
    }
}
