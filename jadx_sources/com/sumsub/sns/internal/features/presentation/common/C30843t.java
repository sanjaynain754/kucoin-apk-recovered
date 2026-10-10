package com.sumsub.sns.internal.features.presentation.common;

import com.sumsub.sns.core.presentation.base.InterfaceC28077Q;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.common.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30843t implements InterfaceC28077Q {

    /* JADX INFO: renamed from: a */
    public final int f62289a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30843t) && this.f62289a == ((C30843t) obj).f62289a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f62289a);
    }

    public final String toString() {
        return "ShowImageSourcePicker(viewId=" + this.f62289a + ")";
    }

    public C30843t(int i11) {
        this.f62289a = i11;
    }
}
