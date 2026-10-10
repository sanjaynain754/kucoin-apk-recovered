package com.sumsub.sns.internal.features.domain.geo;

import java.util.Map;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.geo.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30201l implements InterfaceC30204o {

    /* JADX INFO: renamed from: a */
    public final Map f60692a;

    /* JADX INFO: renamed from: b */
    public final Long f60693b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30201l)) {
            return false;
        }
        C30201l c30201l = (C30201l) obj;
        return Intrinsics.areEqual(this.f60692a, c30201l.f60692a) && Intrinsics.areEqual(this.f60693b, c30201l.f60693b);
    }

    public final int hashCode() {
        int iHashCode = this.f60692a.hashCode() * 31;
        Long l11 = this.f60693b;
        return iHashCode + (l11 == null ? 0 : l11.hashCode());
    }

    public final String toString() {
        return "Success(address=" + this.f60692a + ", timeToResendInSec=" + this.f60693b + ")";
    }

    public C30201l(Map map, Long l11) {
        this.f60692a = map;
        this.f60693b = l11;
    }
}
