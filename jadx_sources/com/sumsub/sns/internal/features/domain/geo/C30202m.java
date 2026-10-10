package com.sumsub.sns.internal.features.domain.geo;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.geo.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30202m implements InterfaceC30204o {

    /* JADX INFO: renamed from: a */
    public final Long f60694a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30202m) && Intrinsics.areEqual(this.f60694a, ((C30202m) obj).f60694a) && Intrinsics.areEqual("uncertainGpsLocation", "uncertainGpsLocation");
    }

    public final int hashCode() {
        Long l11 = this.f60694a;
        return ((l11 == null ? 0 : l11.hashCode()) * 31) + 814745302;
    }

    public final String toString() {
        return "UnknownLocation(timeToResendInSec=" + this.f60694a + ", violation=uncertainGpsLocation)";
    }

    public C30202m(Long l11) {
        this.f60694a = l11;
    }
}
