package com.sumsub.sns.internal.features.presentation.poa;

import com.sumsub.sns.core.presentation.base.InterfaceC28077Q;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.poa.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31457i implements InterfaceC28077Q {

    /* JADX INFO: renamed from: a */
    public final int f63764a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31457i) && this.f63764a == ((C31457i) obj).f63764a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f63764a);
    }

    public final String toString() {
        return "RemoveDoc(index=" + this.f63764a + ")";
    }

    public C31457i(int i11) {
        this.f63764a = i11;
    }
}
