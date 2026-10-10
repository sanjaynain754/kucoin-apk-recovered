package com.sumsub.sns.internal.features.presentation.error;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.error.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30924c implements InterfaceC30925d {

    /* JADX INFO: renamed from: a */
    public final AbstractC29149l0 f62466a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30924c) && Intrinsics.areEqual(this.f62466a, ((C30924c) obj).f62466a);
    }

    @Override // com.sumsub.sns.internal.features.presentation.error.InterfaceC30925d
    public final AbstractC29149l0 getError() {
        return this.f62466a;
    }

    public final int hashCode() {
        return this.f62466a.hashCode();
    }

    public final String toString() {
        return "SwallowedError(error=" + this.f62466a + ")";
    }

    public C30924c(AbstractC29149l0 abstractC29149l0) {
        this.f62466a = abstractC29149l0;
    }
}
