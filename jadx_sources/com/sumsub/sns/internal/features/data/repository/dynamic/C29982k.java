package com.sumsub.sns.internal.features.data.repository.dynamic;

import java.util.ArrayList;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29982k {

    /* JADX INFO: renamed from: a */
    public final ArrayList f60247a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29982k) && Intrinsics.areEqual(this.f60247a, ((C29982k) obj).f60247a);
    }

    public final int hashCode() {
        return this.f60247a.hashCode();
    }

    public final String toString() {
        return "FeatureFlags(list=" + this.f60247a + ")";
    }

    public C29982k(ArrayList arrayList) {
        this.f60247a = arrayList;
    }
}
