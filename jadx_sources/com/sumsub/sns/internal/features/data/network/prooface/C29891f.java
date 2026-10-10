package com.sumsub.sns.internal.features.data.network.prooface;

import com.sumsub.sns.internal.features.data.model.prooface.C29810M;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.network.prooface.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29891f extends Liveness3dFaceRepository$LivenessRepositoryResult {

    /* JADX INFO: renamed from: a */
    public final C29810M f59992a;

    public C29891f(C29810M c29810m) {
        super(null);
        this.f59992a = c29810m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29891f) && Intrinsics.areEqual(this.f59992a, ((C29891f) obj).f59992a);
    }

    public final int hashCode() {
        C29810M c29810m = this.f59992a;
        if (c29810m == null) {
            return 0;
        }
        return c29810m.hashCode();
    }

    public final String toString() {
        return "OnProgress(session=" + this.f59992a + ")";
    }
}
