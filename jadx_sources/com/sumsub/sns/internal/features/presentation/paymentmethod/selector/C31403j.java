package com.sumsub.sns.internal.features.presentation.paymentmethod.selector;

import com.sumsub.sns.core.presentation.base.InterfaceC28077Q;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.selector.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31403j implements InterfaceC28077Q {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31403j) && Intrinsics.areEqual("bankCard", "bankCard");
    }

    public final String toString() {
        return "OnItemSelected(typeKey=bankCard)";
    }

    public final int hashCode() {
        return -1859618964;
    }
}
