package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.core.presentation.camera.C28758x;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.L0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32016L0 implements InterfaceC32019M0 {

    /* JADX INFO: renamed from: a */
    public final C28758x f65082a;

    /* JADX INFO: renamed from: b */
    public final boolean f65083b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32016L0)) {
            return false;
        }
        C32016L0 c32016l0 = (C32016L0) obj;
        return Intrinsics.areEqual(this.f65082a, c32016l0.f65082a) && this.f65083b == c32016l0.f65083b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65083b) + (this.f65082a.hashCode() * 31);
    }

    public final String toString() {
        return "Enabled(exposure=" + this.f65082a + ", previewReady=" + this.f65083b + ")";
    }

    public C32016L0(C28758x c28758x, boolean z11) {
        this.f65082a = c28758x;
        this.f65083b = z11;
    }
}
