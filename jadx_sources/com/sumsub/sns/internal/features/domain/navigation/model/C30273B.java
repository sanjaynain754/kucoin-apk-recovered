package com.sumsub.sns.internal.features.domain.navigation.model;

import com.sumsub.sns.internal.features.data.model.common.remote.response.C29586o0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.navigation.model.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30273B {

    /* JADX INFO: renamed from: a */
    public final C29586o0 f60863a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30273B) && Intrinsics.areEqual(this.f60863a, ((C30273B) obj).f60863a);
    }

    public final int hashCode() {
        C29586o0 c29586o0 = this.f60863a;
        if (c29586o0 == null) {
            return 0;
        }
        return c29586o0.hashCode();
    }

    public final String toString() {
        return "SdkStepData(restriction=" + this.f60863a + ")";
    }

    public C30273B(C29586o0 c29586o0) {
        this.f60863a = c29586o0;
    }
}
