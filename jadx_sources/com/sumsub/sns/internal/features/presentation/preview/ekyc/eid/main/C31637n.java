package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main;

import com.sumsub.sentry.AbstractC27897U;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31637n implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final String f64243a;

    /* JADX INFO: renamed from: b */
    public final String f64244b;

    /* JADX INFO: renamed from: c */
    public final String f64245c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31637n)) {
            return false;
        }
        C31637n c31637n = (C31637n) obj;
        return Intrinsics.areEqual(this.f64243a, c31637n.f64243a) && Intrinsics.areEqual(this.f64244b, c31637n.f64244b) && Intrinsics.areEqual(this.f64245c, c31637n.f64245c);
    }

    public final int hashCode() {
        int iM68983a = AbstractC27897U.m68983a(this.f64244b, this.f64243a.hashCode() * 31, 31);
        String str = this.f64245c;
        return iM68983a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "EnterCanForTransportPinEvent(pin=" + this.f64243a + ", newPin=" + this.f64244b + ", lastPinDigit=" + this.f64245c + ")";
    }

    public C31637n(String str, String str2, String str3) {
        this.f64243a = str;
        this.f64244b = str2;
        this.f64245c = str3;
    }
}
