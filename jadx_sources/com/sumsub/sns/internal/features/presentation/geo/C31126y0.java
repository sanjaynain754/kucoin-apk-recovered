package com.sumsub.sns.internal.features.presentation.geo;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.y0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31126y0 {

    /* JADX INFO: renamed from: a */
    public final C31124x0 f62944a;

    /* JADX INFO: renamed from: b */
    public final C31124x0 f62945b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31126y0)) {
            return false;
        }
        C31126y0 c31126y0 = (C31126y0) obj;
        return Intrinsics.areEqual(this.f62944a, c31126y0.f62944a) && Intrinsics.areEqual(this.f62945b, c31126y0.f62945b);
    }

    public final int hashCode() {
        C31124x0 c31124x0 = this.f62944a;
        int iHashCode = (c31124x0 == null ? 0 : c31124x0.hashCode()) * 31;
        C31124x0 c31124x1 = this.f62945b;
        return iHashCode + (c31124x1 != null ? c31124x1.hashCode() : 0);
    }

    public final String toString() {
        return "ButtonsPanel(primaryButton=" + this.f62944a + ", secondaryButton=" + this.f62945b + ")";
    }

    public C31126y0(C31124x0 c31124x0, C31124x0 c31124x1) {
        this.f62944a = c31124x0;
        this.f62945b = c31124x1;
    }
}
