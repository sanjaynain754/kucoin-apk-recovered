package com.sumsub.sns.internal.features.presentation.geo;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31121w implements InterfaceC31123x {

    /* JADX INFO: renamed from: a */
    public final String f62937a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31121w) && Intrinsics.areEqual(this.f62937a, ((C31121w) obj).f62937a);
    }

    public final int hashCode() {
        String str = this.f62937a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "VpnRestriction(violation=" + this.f62937a + ")";
    }

    public C31121w(String str) {
        this.f62937a = str;
    }
}
