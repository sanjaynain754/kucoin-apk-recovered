package com.sumsub.sns.internal.features.data.network.prooface;

import com.sumsub.sns.internal.features.data.model.prooface.C29810M;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.network.prooface.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29889d extends Liveness3dFaceRepository$LivenessRepositoryResult {

    /* JADX INFO: renamed from: a */
    public final C29810M f59990a;

    public C29889d(C29810M c29810m) {
        super(null);
        this.f59990a = c29810m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29889d) && Intrinsics.areEqual(this.f59990a, ((C29889d) obj).f59990a);
    }

    public final int hashCode() {
        C29810M c29810m = this.f59990a;
        if (c29810m == null) {
            return 0;
        }
        return c29810m.hashCode();
    }

    public final String toString() {
        return "OnCompleted(session=" + this.f59990a + ")";
    }
}
