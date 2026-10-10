package com.sumsub.sns.internal.features.presentation.geo;

import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31111r implements InterfaceC31123x {

    /* JADX INFO: renamed from: a */
    public final List f62900a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31111r) && Intrinsics.areEqual(this.f62900a, ((C31111r) obj).f62900a);
    }

    public final int hashCode() {
        return this.f62900a.hashCode();
    }

    public final String toString() {
        return "AddressConfirmation(items=" + this.f62900a + ")";
    }

    public C31111r(List list) {
        this.f62900a = list;
    }
}
