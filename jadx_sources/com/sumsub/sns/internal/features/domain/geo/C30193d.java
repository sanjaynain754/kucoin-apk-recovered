package com.sumsub.sns.internal.features.domain.geo;

import java.util.ArrayList;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.geo.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30193d implements InterfaceC30194e {

    /* JADX INFO: renamed from: a */
    public final ArrayList f60684a;

    /* JADX INFO: renamed from: b */
    public final Long f60685b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30193d)) {
            return false;
        }
        C30193d c30193d = (C30193d) obj;
        return Intrinsics.areEqual(this.f60684a, c30193d.f60684a) && Intrinsics.areEqual(this.f60685b, c30193d.f60685b);
    }

    public final int hashCode() {
        int iHashCode = this.f60684a.hashCode() * 31;
        Long l11 = this.f60685b;
        return iHashCode + (l11 == null ? 0 : l11.hashCode());
    }

    public final String toString() {
        return "ViolationsFound(violations=" + this.f60684a + ", timeToResendInSec=" + this.f60685b + ")";
    }

    public C30193d(ArrayList arrayList, Long l11) {
        this.f60684a = arrayList;
        this.f60685b = l11;
    }
}
