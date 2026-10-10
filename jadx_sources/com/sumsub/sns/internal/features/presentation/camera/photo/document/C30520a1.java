package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.graphics.Bitmap;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.a1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30520a1 {

    /* JADX INFO: renamed from: a */
    public final Bitmap f61633a;

    /* JADX INFO: renamed from: b */
    public final C30556g1 f61634b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30520a1)) {
            return false;
        }
        C30520a1 c30520a1 = (C30520a1) obj;
        return Intrinsics.areEqual(this.f61633a, c30520a1.f61633a) && Intrinsics.areEqual(this.f61634b, c30520a1.f61634b);
    }

    public final int hashCode() {
        return this.f61634b.hashCode() + (this.f61633a.hashCode() * 31);
    }

    public final String toString() {
        return "AutoCapturedFrame(frame=" + this.f61633a + ", quality=" + this.f61634b + ")";
    }

    public C30520a1(Bitmap bitmap, C30556g1 c30556g1) {
        this.f61633a = bitmap;
        this.f61634b = c30556g1;
    }
}
