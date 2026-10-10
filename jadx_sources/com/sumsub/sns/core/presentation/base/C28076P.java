package com.sumsub.sns.core.presentation.base;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.P */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28076P {

    /* JADX INFO: renamed from: a */
    public final AbstractC28082W f57272a;

    /* JADX INFO: renamed from: b */
    public final boolean f57273b;

    public C28076P() {
        this.f57272a = C28079T.f57274a;
        this.f57273b = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28076P)) {
            return false;
        }
        C28076P c28076p = (C28076P) obj;
        return Intrinsics.areEqual(this.f57272a, c28076p.f57272a) && this.f57273b == c28076p.f57273b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f57273b) + (this.f57272a.hashCode() * 31);
    }

    public final String toString() {
        return "InitViewModelConfig(initialViewState=" + this.f57272a + ", filterDataWhenBuildingViewState=" + this.f57273b + ")";
    }

    public C28076P(int i11) {
        AbstractC28082W abstractC28082W = (i11 & 1) != 0 ? C28080U.f57275a : C28079T.f57274a;
        boolean z11 = (i11 & 2) != 0;
        this.f57272a = abstractC28082W;
        this.f57273b = z11;
    }
}
