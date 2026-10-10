package com.sumsub.sns.internal.features.presentation.common;

import com.sumsub.sns.core.presentation.base.InterfaceC28077Q;
import com.sumsub.sns.internal.features.domain.documents.AbstractC30117K;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.common.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30839p implements InterfaceC28077Q {

    /* JADX INFO: renamed from: a */
    public final AbstractC30117K f62285a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30839p) && Intrinsics.areEqual(this.f62285a, ((C30839p) obj).f62285a);
    }

    public final int hashCode() {
        return this.f62285a.hashCode();
    }

    public final String toString() {
        return "OnPhotoPreviewed(result=" + this.f62285a + ")";
    }

    public C30839p(AbstractC30117K abstractC30117K) {
        this.f62285a = abstractC30117K;
    }
}
