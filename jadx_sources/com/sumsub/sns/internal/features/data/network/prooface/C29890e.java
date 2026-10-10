package com.sumsub.sns.internal.features.data.network.prooface;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.network.prooface.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29890e extends Liveness3dFaceRepository$LivenessRepositoryResult {

    /* JADX INFO: renamed from: a */
    public final Throwable f59991a;

    public C29890e(Throwable th2) {
        super(null);
        this.f59991a = th2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29890e) && Intrinsics.areEqual(this.f59991a, ((C29890e) obj).f59991a);
    }

    public final int hashCode() {
        return this.f59991a.hashCode();
    }

    public final String toString() {
        return "OnFailure(e=" + this.f59991a + ")";
    }
}
