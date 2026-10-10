package com.sumsub.sns.internal.features.presentation.geo;

import java.util.ArrayList;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31103n implements InterfaceC31109q {

    /* JADX INFO: renamed from: a */
    public final ArrayList f62889a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31103n) && Intrinsics.areEqual(this.f62889a, ((C31103n) obj).f62889a);
    }

    public final int hashCode() {
        return this.f62889a.hashCode();
    }

    public final String toString() {
        return "ViolationsFound(violations=" + this.f62889a + ")";
    }

    public C31103n(ArrayList arrayList) {
        this.f62889a = arrayList;
    }
}
