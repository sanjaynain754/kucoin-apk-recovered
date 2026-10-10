package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.util.Size;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.internal.p126ml.docdetector.C33350a;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.m1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30592m1 implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final Size f61787a;

    /* JADX INFO: renamed from: b */
    public final Size f61788b;

    /* JADX INFO: renamed from: c */
    public final C33350a f61789c;

    /* JADX INFO: renamed from: d */
    public final boolean f61790d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30592m1)) {
            return false;
        }
        C30592m1 c30592m1 = (C30592m1) obj;
        return Intrinsics.areEqual(this.f61787a, c30592m1.f61787a) && Intrinsics.areEqual(this.f61788b, c30592m1.f61788b) && Intrinsics.areEqual(this.f61789c, c30592m1.f61789c) && this.f61790d == c30592m1.f61790d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f61790d) + ((this.f61789c.hashCode() + ((this.f61788b.hashCode() + (this.f61787a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ShowDocDetectionResult(photoSize=" + this.f61787a + ", sampleSize=" + this.f61788b + ", result=" + this.f61789c + ", frameHit=" + this.f61790d + ")";
    }

    public C30592m1(Size size, Size size2, C33350a c33350a, boolean z11) {
        this.f61787a = size;
        this.f61788b = size2;
        this.f61789c = c33350a;
        this.f61790d = z11;
    }
}
