package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.core.presentation.base.C28135m;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.d1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30538d1 implements InterfaceC28147s {

    /* JADX INFO: renamed from: a */
    public final C30616q1 f61665a;

    /* JADX INFO: renamed from: b */
    public final Boolean f61666b;

    /* JADX INFO: renamed from: c */
    public final C30516Z0 f61667c;

    /* JADX INFO: renamed from: d */
    public final C30544e1 f61668d;

    /* JADX INFO: renamed from: e */
    public final C30610p1 f61669e;

    /* JADX INFO: renamed from: f */
    public final C28135m f61670f;

    public /* synthetic */ C30538d1(C30616q1 c30616q1, int i11) {
        this(c30616q1, (i11 & 2) != 0 ? null : Boolean.FALSE, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30538d1)) {
            return false;
        }
        C30538d1 c30538d1 = (C30538d1) obj;
        return Intrinsics.areEqual(this.f61665a, c30538d1.f61665a) && Intrinsics.areEqual(this.f61666b, c30538d1.f61666b) && Intrinsics.areEqual(this.f61667c, c30538d1.f61667c) && Intrinsics.areEqual(this.f61668d, c30538d1.f61668d) && Intrinsics.areEqual(this.f61669e, c30538d1.f61669e) && Intrinsics.areEqual(this.f61670f, c30538d1.f61670f);
    }

    public C30538d1(C30616q1 c30616q1, Boolean bool, C30516Z0 c30516z0, C30544e1 c30544e1, C30610p1 c30610p1, C28135m c28135m) {
        this.f61665a = c30616q1;
        this.f61666b = bool;
        this.f61667c = c30516z0;
        this.f61668d = c30544e1;
        this.f61669e = c30610p1;
        this.f61670f = c28135m;
    }

    /* JADX INFO: renamed from: a */
    public static C30538d1 m70407a(C30538d1 c30538d1, C30616q1 c30616q1, Boolean bool, C30516Z0 c30516z0, C30544e1 c30544e1, C30610p1 c30610p1, C28135m c28135m, int i11) {
        if ((i11 & 1) != 0) {
            c30616q1 = c30538d1.f61665a;
        }
        C30616q1 c30616q2 = c30616q1;
        if ((i11 & 2) != 0) {
            bool = c30538d1.f61666b;
        }
        Boolean bool2 = bool;
        if ((i11 & 4) != 0) {
            c30516z0 = c30538d1.f61667c;
        }
        C30516Z0 c30516z1 = c30516z0;
        if ((i11 & 8) != 0) {
            c30544e1 = c30538d1.f61668d;
        }
        C30544e1 c30544e2 = c30544e1;
        if ((i11 & 16) != 0) {
            c30610p1 = c30538d1.f61669e;
        }
        C30610p1 c30610p2 = c30610p1;
        if ((i11 & 32) != 0) {
            c28135m = c30538d1.f61670f;
        }
        c30538d1.getClass();
        return new C30538d1(c30616q2, bool2, c30516z1, c30544e2, c30610p2, c28135m);
    }

    public final int hashCode() {
        C30616q1 c30616q1 = this.f61665a;
        int iHashCode = (c30616q1 == null ? 0 : c30616q1.hashCode()) * 31;
        Boolean bool = this.f61666b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        C30516Z0 c30516z0 = this.f61667c;
        int iHashCode3 = (iHashCode2 + (c30516z0 == null ? 0 : c30516z0.hashCode())) * 31;
        C30544e1 c30544e1 = this.f61668d;
        int iHashCode4 = (iHashCode3 + (c30544e1 == null ? 0 : c30544e1.hashCode())) * 31;
        C30610p1 c30610p1 = this.f61669e;
        int iHashCode5 = (iHashCode4 + (c30610p1 == null ? 0 : c30610p1.hashCode())) * 31;
        C28135m c28135m = this.f61670f;
        return iHashCode5 + (c28135m != null ? c28135m.hashCode() : 0);
    }

    public final String toString() {
        return "DocumentCaptureViewState(videoCapture=" + this.f61665a + ", autocapture=" + this.f61666b + ", autoCaptureHint=" + this.f61667c + ", frameHint=" + this.f61668d + ", tiltHint=" + this.f61669e + ", error=" + this.f61670f + ")";
    }
}
