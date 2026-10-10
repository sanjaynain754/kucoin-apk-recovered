package com.sumsub.sns.internal.features.domain.geo;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.geo.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30192c implements InterfaceC30194e {

    /* JADX INFO: renamed from: a */
    public final Long f60683a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30192c) && Intrinsics.areEqual(this.f60683a, ((C30192c) obj).f60683a) && Intrinsics.areEqual("uncertainGpsLocation", "uncertainGpsLocation");
    }

    public final int hashCode() {
        Long l11 = this.f60683a;
        return ((l11 == null ? 0 : l11.hashCode()) * 31) + 814745302;
    }

    public final String toString() {
        return "UnknownLocation(timeToResendInSec=" + this.f60683a + ", violation=uncertainGpsLocation)";
    }

    public C30192c(Long l11) {
        this.f60683a = l11;
    }
}
