package com.sumsub.sns.internal.features.presentation.geo;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.A0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31038A0 extends AbstractC31052H0 {

    /* JADX INFO: renamed from: a */
    public final C31040B0 f62735a;

    /* JADX INFO: renamed from: b */
    public final C31126y0 f62736b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31038A0)) {
            return false;
        }
        C31038A0 c31038a0 = (C31038A0) obj;
        return Intrinsics.areEqual(this.f62735a, c31038a0.f62735a) && Intrinsics.areEqual(this.f62736b, c31038a0.f62736b);
    }

    public final int hashCode() {
        return this.f62736b.hashCode() + (this.f62735a.hashCode() * 31);
    }

    public final String toString() {
        return "InfoPage(infoPanel=" + this.f62735a + ", buttonsPanel=" + this.f62736b + ")";
    }

    public C31038A0(C31040B0 c31040b0, C31126y0 c31126y0) {
        this.f62735a = c31040b0;
        this.f62736b = c31126y0;
    }
}
