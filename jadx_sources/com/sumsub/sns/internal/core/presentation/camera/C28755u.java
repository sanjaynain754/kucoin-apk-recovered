package com.sumsub.sns.internal.core.presentation.camera;

import androidx.camera.core.ImageProxy;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.camera.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28755u implements InterfaceC28756v {

    /* JADX INFO: renamed from: a */
    public final ImageProxy f58486a;

    /* JADX INFO: renamed from: b */
    public final C28758x f58487b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28755u)) {
            return false;
        }
        C28755u c28755u = (C28755u) obj;
        return Intrinsics.areEqual(this.f58486a, c28755u.f58486a) && Intrinsics.areEqual(this.f58487b, c28755u.f58487b);
    }

    public final int hashCode() {
        return this.f58487b.hashCode() + (this.f58486a.hashCode() * 31);
    }

    public final String toString() {
        return "FrameCaptured(image=" + this.f58486a + ", exposure=" + this.f58487b + ")";
    }

    public C28755u(ImageProxy imageProxy, C28758x c28758x) {
        this.f58486a = imageProxy;
        this.f58487b = c28758x;
    }
}
