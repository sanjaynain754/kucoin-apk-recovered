package com.sumsub.sns.internal.features.data.network.prooface;

import com.sumsub.sns.internal.features.data.model.prooface.C29810M;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.network.prooface.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29894i extends Liveness3dFaceRepository$LivenessRepositoryResult {

    /* JADX INFO: renamed from: a */
    public final C29810M f59995a;

    public C29894i(C29810M c29810m) {
        super(null);
        this.f59995a = c29810m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29894i) && Intrinsics.areEqual(this.f59995a, ((C29894i) obj).f59995a);
    }

    public final int hashCode() {
        C29810M c29810m = this.f59995a;
        if (c29810m == null) {
            return 0;
        }
        return c29810m.hashCode();
    }

    public final String toString() {
        return "OnTerminated(session=" + this.f59995a + ")";
    }
}
