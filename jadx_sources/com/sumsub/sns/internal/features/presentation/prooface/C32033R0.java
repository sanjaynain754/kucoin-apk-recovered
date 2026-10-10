package com.sumsub.sns.internal.features.presentation.prooface;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.R0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32033R0 implements InterfaceC32054Y0 {

    /* JADX INFO: renamed from: a */
    public final Exception f65139a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32033R0) && Intrinsics.areEqual(this.f65139a, ((C32033R0) obj).f65139a);
    }

    public final int hashCode() {
        return this.f65139a.hashCode();
    }

    public final String toString() {
        return "OnCameraError(error=" + this.f65139a + ")";
    }

    public C32033R0(Exception exc) {
        this.f65139a = exc;
    }
}
