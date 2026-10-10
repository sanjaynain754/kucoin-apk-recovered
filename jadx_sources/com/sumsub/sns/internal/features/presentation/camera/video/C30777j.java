package com.sumsub.sns.internal.features.presentation.camera.video;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.video.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30777j extends AbstractC30783p {

    /* JADX INFO: renamed from: a */
    public final C30784q f62187a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30777j) && Intrinsics.areEqual(this.f62187a, ((C30777j) obj).f62187a);
    }

    public final int hashCode() {
        return this.f62187a.hashCode();
    }

    public final String toString() {
        return "ResultObtained(result=" + this.f62187a + ")";
    }

    public C30777j(C30784q c30784q) {
        this.f62187a = c30784q;
    }
}
