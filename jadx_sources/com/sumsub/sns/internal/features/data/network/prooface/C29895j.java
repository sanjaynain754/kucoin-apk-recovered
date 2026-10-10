package com.sumsub.sns.internal.features.data.network.prooface;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.network.prooface.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29895j extends Liveness3dFaceRepository$LivenessRepositoryResult {

    /* JADX INFO: renamed from: a */
    public final String f59996a;

    public C29895j(String str) {
        super(null);
        this.f59996a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29895j) && Intrinsics.areEqual(this.f59996a, ((C29895j) obj).f59996a);
    }

    public final int hashCode() {
        String str = this.f59996a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "OnUnknown(message=" + this.f59996a + ")";
    }
}
