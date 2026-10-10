package com.sumsub.sns.internal.core.presentation.camera;

import android.graphics.Bitmap;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.camera.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28754t implements InterfaceC28756v {

    /* JADX INFO: renamed from: a */
    public final Bitmap f58484a;

    /* JADX INFO: renamed from: b */
    public final C28758x f58485b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28754t)) {
            return false;
        }
        C28754t c28754t = (C28754t) obj;
        return Intrinsics.areEqual(this.f58484a, c28754t.f58484a) && Intrinsics.areEqual(this.f58485b, c28754t.f58485b);
    }

    public final int hashCode() {
        return this.f58485b.hashCode() + (this.f58484a.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapFrameCaptured(bitmap=" + this.f58484a + ", exposure=" + this.f58485b + ")";
    }

    public C28754t(Bitmap bitmap, C28758x c28758x) {
        this.f58484a = bitmap;
        this.f58485b = c28758x;
    }
}
