package com.sumsub.sns.internal.features.presentation.main;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31289k extends AbstractC31245b0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC31285j f63402a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31289k) && Intrinsics.areEqual(this.f63402a, ((C31289k) obj).f63402a);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(true) * 31;
        InterfaceC31285j interfaceC31285j = this.f63402a;
        return iHashCode + (interfaceC31285j == null ? 0 : interfaceC31285j.hashCode());
    }

    public final String toString() {
        return "HandleErrorResolution(popScreen=true, action=" + this.f63402a + ")";
    }

    public C31289k(InterfaceC31285j interfaceC31285j) {
        this.f63402a = interfaceC31285j;
    }
}
