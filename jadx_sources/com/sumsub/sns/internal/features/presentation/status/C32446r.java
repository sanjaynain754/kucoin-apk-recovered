package com.sumsub.sns.internal.features.presentation.status;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32446r implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final String f66136a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32446r) && Intrinsics.areEqual(this.f66136a, ((C32446r) obj).f66136a);
    }

    public final int hashCode() {
        return this.f66136a.hashCode();
    }

    public final String toString() {
        return "ShowAgreementEvent(text=" + this.f66136a + ")";
    }

    public C32446r(String str) {
        this.f66136a = str;
    }
}
