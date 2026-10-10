package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31639o implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final boolean f64247a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31639o) && this.f64247a == ((C31639o) obj).f64247a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64247a);
    }

    public final String toString() {
        return "EnterPinEvent(needCan=" + this.f64247a + ")";
    }

    public C31639o(boolean z11) {
        this.f64247a = z11;
    }
}
