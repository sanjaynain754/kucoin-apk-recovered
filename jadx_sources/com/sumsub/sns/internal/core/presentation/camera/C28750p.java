package com.sumsub.sns.internal.core.presentation.camera;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.camera.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28750p implements InterfaceC28752r {

    /* JADX INFO: renamed from: a */
    public final C28740f f58482a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28750p) && Intrinsics.areEqual(this.f58482a, ((C28750p) obj).f58482a);
    }

    public final int hashCode() {
        return this.f58482a.hashCode();
    }

    public final String toString() {
        return "VideoRecordingFinalized(result=" + this.f58482a + ")";
    }

    public C28750p(C28740f c28740f) {
        this.f58482a = c28740f;
    }
}
