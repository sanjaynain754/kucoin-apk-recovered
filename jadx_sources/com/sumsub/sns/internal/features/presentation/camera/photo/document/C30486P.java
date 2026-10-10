package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.core.presentation.base.C28135m;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.P */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30486P implements InterfaceC28147s {

    /* JADX INFO: renamed from: a */
    public final C30531c0 f61537a;

    /* JADX INFO: renamed from: b */
    public final C30483O f61538b;

    /* JADX INFO: renamed from: c */
    public final C30477M f61539c;

    /* JADX INFO: renamed from: d */
    public final C30489Q f61540d;

    /* JADX INFO: renamed from: e */
    public final C28135m f61541e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30486P)) {
            return false;
        }
        C30486P c30486p = (C30486P) obj;
        return Intrinsics.areEqual(this.f61537a, c30486p.f61537a) && Intrinsics.areEqual(this.f61538b, c30486p.f61538b) && Intrinsics.areEqual(this.f61539c, c30486p.f61539c) && Intrinsics.areEqual(this.f61540d, c30486p.f61540d) && Intrinsics.areEqual(this.f61541e, c30486p.f61541e);
    }

    /* JADX INFO: renamed from: a */
    public static C30486P m70403a(C30486P c30486p, C30531c0 c30531c0, C30483O c30483o, C30477M c30477m, C30489Q c30489q, C28135m c28135m, int i11) {
        if ((i11 & 1) != 0) {
            c30531c0 = c30486p.f61537a;
        }
        C30531c0 c30531c1 = c30531c0;
        if ((i11 & 2) != 0) {
            c30483o = c30486p.f61538b;
        }
        C30483O c30483o2 = c30483o;
        if ((i11 & 4) != 0) {
            c30477m = c30486p.f61539c;
        }
        C30477M c30477m2 = c30477m;
        if ((i11 & 8) != 0) {
            c30489q = c30486p.f61540d;
        }
        C30489Q c30489q2 = c30489q;
        if ((i11 & 16) != 0) {
            c28135m = c30486p.f61541e;
        }
        c30486p.getClass();
        return new C30486P(c30531c1, c30483o2, c30477m2, c30489q2, c28135m);
    }

    public final int hashCode() {
        C30531c0 c30531c0 = this.f61537a;
        int iHashCode = (this.f61538b.hashCode() + ((c30531c0 == null ? 0 : c30531c0.hashCode()) * 31)) * 31;
        C30477M c30477m = this.f61539c;
        int iHashCode2 = (iHashCode + (c30477m == null ? 0 : c30477m.hashCode())) * 31;
        C30489Q c30489q = this.f61540d;
        int iHashCode3 = (iHashCode2 + (c30489q == null ? 0 : c30489q.hashCode())) * 31;
        C28135m c28135m = this.f61541e;
        return iHashCode3 + (c28135m != null ? c28135m.hashCode() : 0);
    }

    public final String toString() {
        return "DocumentCaptureViewState(videoCapture=" + this.f61537a + ", switch=" + this.f61538b + ", autoCaptureHint=" + this.f61539c + ", frameHint=" + this.f61540d + ", error=" + this.f61541e + ")";
    }

    public C30486P(C30531c0 c30531c0, C30483O c30483o, C30477M c30477m, C30489Q c30489q, C28135m c28135m) {
        this.f61537a = c30531c0;
        this.f61538b = c30483o;
        this.f61539c = c30477m;
        this.f61540d = c30489q;
        this.f61541e = c28135m;
    }
}
