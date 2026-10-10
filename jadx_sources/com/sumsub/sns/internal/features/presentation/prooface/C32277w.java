package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32277w implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final AbstractC29149l0 f65747a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32277w) && Intrinsics.areEqual(this.f65747a, ((C32277w) obj).f65747a);
    }

    public final int hashCode() {
        return this.f65747a.hashCode();
    }

    public final String toString() {
        return "HandleErrorEvent(error=" + this.f65747a + ")";
    }

    public C32277w(AbstractC29149l0 abstractC29149l0) {
        this.f65747a = abstractC29149l0;
    }
}
