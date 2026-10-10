package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.core.presentation.camera.C28758x;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.S0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32036S0 implements InterfaceC32054Y0 {

    /* JADX INFO: renamed from: a */
    public final C28758x f65148a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32036S0) && Intrinsics.areEqual(this.f65148a, ((C32036S0) obj).f65148a);
    }

    public final int hashCode() {
        return this.f65148a.hashCode();
    }

    public final String toString() {
        return "OnCameraReady(exposure=" + this.f65148a + ")";
    }

    public C32036S0(C28758x c28758x) {
        this.f65148a = c28758x;
    }
}
