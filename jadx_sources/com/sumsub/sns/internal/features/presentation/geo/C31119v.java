package com.sumsub.sns.internal.features.presentation.geo;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31119v implements InterfaceC31123x {

    /* JADX INFO: renamed from: a */
    public final String f62913a;

    public C31119v() {
        this.f62913a = "uncertainGpsLocation";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31119v) && Intrinsics.areEqual(this.f62913a, ((C31119v) obj).f62913a);
    }

    public C31119v(int i11) {
        this.f62913a = null;
    }

    public final int hashCode() {
        String str = this.f62913a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "UnknownLocation(violation=" + this.f62913a + ")";
    }
}
