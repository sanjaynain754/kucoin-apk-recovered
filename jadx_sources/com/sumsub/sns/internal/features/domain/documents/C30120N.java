package com.sumsub.sns.internal.features.domain.documents;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.internal.features.data.model.common.C29697t2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.documents.N */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30120N implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final C29697t2 f60559a;

    /* JADX INFO: renamed from: b */
    public final AbstractC30108B f60560b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30120N)) {
            return false;
        }
        C30120N c30120n = (C30120N) obj;
        return Intrinsics.areEqual(this.f60559a, c30120n.f60559a) && Intrinsics.areEqual(this.f60560b, c30120n.f60560b);
    }

    public final int hashCode() {
        return this.f60560b.hashCode() + (this.f60559a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowInstructions(introParams=" + this.f60559a + ", payload=" + this.f60560b + ")";
    }

    public C30120N(C29697t2 c29697t2, AbstractC30108B abstractC30108B) {
        this.f60559a = c29697t2;
        this.f60560b = abstractC30108B;
    }
}
