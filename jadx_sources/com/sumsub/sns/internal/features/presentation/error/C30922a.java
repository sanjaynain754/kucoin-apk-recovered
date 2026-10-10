package com.sumsub.sns.internal.features.presentation.error;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.error.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30922a implements InterfaceC30925d {

    /* JADX INFO: renamed from: a */
    public final AbstractC29149l0 f62464a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30922a) && Intrinsics.areEqual(this.f62464a, ((C30922a) obj).f62464a);
    }

    @Override // com.sumsub.sns.internal.features.presentation.error.InterfaceC30925d
    public final AbstractC29149l0 getError() {
        return this.f62464a;
    }

    public final int hashCode() {
        return this.f62464a.hashCode();
    }

    public final String toString() {
        return "Action(error=" + this.f62464a + ")";
    }

    public C30922a(AbstractC29149l0 abstractC29149l0) {
        this.f62464a = abstractC29149l0;
    }
}
