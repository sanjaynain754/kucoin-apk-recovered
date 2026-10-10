package com.sumsub.sns.internal.features.presentation.geo;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31099l implements InterfaceC31109q {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31099l) && Intrinsics.areEqual("uncertainGpsLocation", "uncertainGpsLocation");
    }

    public final String toString() {
        return "FailureUnknownLocation(violation=uncertainGpsLocation)";
    }

    public final int hashCode() {
        return 814745302;
    }
}
