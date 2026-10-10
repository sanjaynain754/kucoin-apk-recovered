package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31272i implements InterfaceC31285j {

    /* JADX INFO: renamed from: a */
    public final AbstractC29149l0 f63358a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31272i) && Intrinsics.areEqual(this.f63358a, ((C31272i) obj).f63358a);
    }

    public final int hashCode() {
        return this.f63358a.hashCode();
    }

    public final String toString() {
        return "DeliverErrorCancelled(error=" + this.f63358a + ")";
    }

    public C31272i(AbstractC29149l0 abstractC29149l0) {
        this.f63358a = abstractC29149l0;
    }
}
