package com.sumsub.sns.internal.features.domain.geo;

import java.util.ArrayList;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.geo.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30203n implements InterfaceC30204o {

    /* JADX INFO: renamed from: a */
    public final ArrayList f60695a;

    /* JADX INFO: renamed from: b */
    public final Long f60696b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30203n)) {
            return false;
        }
        C30203n c30203n = (C30203n) obj;
        return Intrinsics.areEqual(this.f60695a, c30203n.f60695a) && Intrinsics.areEqual(this.f60696b, c30203n.f60696b);
    }

    public final int hashCode() {
        int iHashCode = this.f60695a.hashCode() * 31;
        Long l11 = this.f60696b;
        return iHashCode + (l11 == null ? 0 : l11.hashCode());
    }

    public final String toString() {
        return "ViolationsFound(violations=" + this.f60695a + ", timeToResendInSec=" + this.f60696b + ")";
    }

    public C30203n(ArrayList arrayList, Long l11) {
        this.f60695a = arrayList;
        this.f60696b = l11;
    }
}
