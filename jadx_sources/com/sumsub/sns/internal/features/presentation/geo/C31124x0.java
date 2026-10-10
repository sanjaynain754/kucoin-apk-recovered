package com.sumsub.sns.internal.features.presentation.geo;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.x0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31124x0 {

    /* JADX INFO: renamed from: a */
    public final String f62940a;

    /* JADX INFO: renamed from: b */
    public final AbstractC31050G0 f62941b;

    /* JADX INFO: renamed from: c */
    public final boolean f62942c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31124x0)) {
            return false;
        }
        C31124x0 c31124x0 = (C31124x0) obj;
        return Intrinsics.areEqual(this.f62940a, c31124x0.f62940a) && Intrinsics.areEqual(this.f62941b, c31124x0.f62941b);
    }

    public final int hashCode() {
        int iHashCode = this.f62940a.hashCode() * 31;
        AbstractC31050G0 abstractC31050G0 = this.f62941b;
        return iHashCode + (abstractC31050G0 == null ? 0 : abstractC31050G0.hashCode());
    }

    public final String toString() {
        String str = this.f62940a;
        return "ButtonSpec(text=" + ((Object) str) + ", intent=" + this.f62941b + ")";
    }

    public C31124x0(String str, AbstractC31050G0 abstractC31050G0) {
        boolean z11;
        this.f62940a = str;
        this.f62941b = abstractC31050G0;
        if (abstractC31050G0 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f62942c = z11;
    }
}
