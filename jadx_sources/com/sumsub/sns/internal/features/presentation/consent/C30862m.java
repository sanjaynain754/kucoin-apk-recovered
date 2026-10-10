package com.sumsub.sns.internal.features.presentation.consent;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.consent.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30862m implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final String f62325a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30862m) && Intrinsics.areEqual(this.f62325a, ((C30862m) obj).f62325a);
    }

    public final int hashCode() {
        return this.f62325a.hashCode();
    }

    public final String toString() {
        return "ShowAgreementEvent(text=" + this.f62325a + ")";
    }

    public C30862m(String str) {
        this.f62325a = str;
    }
}
