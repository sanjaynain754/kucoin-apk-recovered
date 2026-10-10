package com.sumsub.sns.internal.features.domain.geo;

import java.util.ArrayList;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.geo.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30191b implements InterfaceC30194e {

    /* JADX INFO: renamed from: a */
    public final ArrayList f60681a;

    /* JADX INFO: renamed from: b */
    public final Long f60682b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30191b)) {
            return false;
        }
        C30191b c30191b = (C30191b) obj;
        return Intrinsics.areEqual(this.f60681a, c30191b.f60681a) && Intrinsics.areEqual(this.f60682b, c30191b.f60682b);
    }

    public final int hashCode() {
        int iHashCode = this.f60681a.hashCode() * 31;
        Long l11 = this.f60682b;
        return iHashCode + (l11 == null ? 0 : l11.hashCode());
    }

    public final String toString() {
        return "Success(items=" + this.f60681a + ", timeToResendInSec=" + this.f60682b + ")";
    }

    public C30191b(ArrayList arrayList, Long l11) {
        this.f60681a = arrayList;
        this.f60682b = l11;
    }
}
