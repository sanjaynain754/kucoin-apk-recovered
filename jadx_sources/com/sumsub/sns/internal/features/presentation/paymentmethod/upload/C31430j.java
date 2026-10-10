package com.sumsub.sns.internal.features.presentation.paymentmethod.upload;

import com.sumsub.sns.core.presentation.base.InterfaceC28077Q;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.upload.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31430j implements InterfaceC28077Q {

    /* JADX INFO: renamed from: a */
    public final int f63687a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31430j) && this.f63687a == ((C31430j) obj).f63687a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f63687a);
    }

    public final String toString() {
        return "RemoveDoc(index=" + this.f63687a + ")";
    }

    public C31430j(int i11) {
        this.f63687a = i11;
    }
}
