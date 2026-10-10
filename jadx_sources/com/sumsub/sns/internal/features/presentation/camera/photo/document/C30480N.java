package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.graphics.Bitmap;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.N */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30480N {

    /* JADX INFO: renamed from: a */
    public final Bitmap f61519a;

    /* JADX INFO: renamed from: b */
    public final C30497T f61520b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30480N)) {
            return false;
        }
        C30480N c30480n = (C30480N) obj;
        return Intrinsics.areEqual(this.f61519a, c30480n.f61519a) && Intrinsics.areEqual(this.f61520b, c30480n.f61520b);
    }

    public final int hashCode() {
        return this.f61520b.hashCode() + (this.f61519a.hashCode() * 31);
    }

    public final String toString() {
        return "AutoCapturedFrame(frame=" + this.f61519a + ", quality=" + this.f61520b + ")";
    }

    public C30480N(Bitmap bitmap, C30497T c30497t) {
        this.f61519a = bitmap;
        this.f61520b = c30497t;
    }
}
