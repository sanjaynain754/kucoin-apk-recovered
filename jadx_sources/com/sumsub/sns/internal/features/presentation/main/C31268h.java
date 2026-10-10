package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31268h implements InterfaceC31285j {

    /* JADX INFO: renamed from: a */
    public final AbstractC29149l0 f63340a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31268h) && Intrinsics.areEqual(this.f63340a, ((C31268h) obj).f63340a);
    }

    public final int hashCode() {
        return this.f63340a.hashCode();
    }

    public final String toString() {
        return "DeliverErrorAction(error=" + this.f63340a + ")";
    }

    public C31268h(AbstractC29149l0 abstractC29149l0) {
        this.f63340a = abstractC29149l0;
    }
}
