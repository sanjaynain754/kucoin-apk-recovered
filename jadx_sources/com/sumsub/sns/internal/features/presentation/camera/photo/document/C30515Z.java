package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.util.Size;
import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.internal.p126ml.docdetector.C33350a;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.Z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30515Z implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final Size f61618a;

    /* JADX INFO: renamed from: b */
    public final Size f61619b;

    /* JADX INFO: renamed from: c */
    public final C33350a f61620c;

    /* JADX INFO: renamed from: d */
    public final boolean f61621d;

    /* JADX INFO: renamed from: e */
    public final boolean f61622e;

    /* JADX INFO: renamed from: f */
    public final boolean f61623f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30515Z)) {
            return false;
        }
        C30515Z c30515z = (C30515Z) obj;
        return Intrinsics.areEqual(this.f61618a, c30515z.f61618a) && Intrinsics.areEqual(this.f61619b, c30515z.f61619b) && Intrinsics.areEqual(this.f61620c, c30515z.f61620c) && this.f61621d == c30515z.f61621d && this.f61622e == c30515z.f61622e && this.f61623f == c30515z.f61623f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f61623f) + AbstractC27920h.m69001a(this.f61622e, AbstractC27920h.m69001a(this.f61621d, (this.f61620c.hashCode() + ((this.f61619b.hashCode() + (this.f61618a.hashCode() * 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "ShowDocDetectionResult(photoSize=" + this.f61618a + ", sampleSize=" + this.f61619b + ", result=" + this.f61620c + ", frameHit=" + this.f61621d + ", drawDetectedFrame=" + this.f61622e + ", saveScreen=" + this.f61623f + ")";
    }

    public C30515Z(Size size, Size size2, C33350a c33350a, boolean z11, boolean z12, boolean z13) {
        this.f61618a = size;
        this.f61619b = size2;
        this.f61620c = c33350a;
        this.f61621d = z11;
        this.f61622e = z12;
        this.f61623f = z13;
    }
}
