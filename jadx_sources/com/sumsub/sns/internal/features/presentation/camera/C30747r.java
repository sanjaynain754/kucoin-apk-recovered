package com.sumsub.sns.internal.features.presentation.camera;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30747r {

    /* JADX INFO: renamed from: a */
    public final C30372e f62117a;

    /* JADX INFO: renamed from: b */
    public final C30360a f62118b;

    /* JADX INFO: renamed from: c */
    public final C30800z f62119c;

    public C30747r(C30372e c30372e, C30360a c30360a, C30800z c30800z) {
        this.f62117a = c30372e;
        this.f62118b = c30360a;
        this.f62119c = c30800z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30747r)) {
            return false;
        }
        C30747r c30747r = (C30747r) obj;
        return Intrinsics.areEqual(this.f62117a, c30747r.f62117a) && Intrinsics.areEqual(this.f62118b, c30747r.f62118b) && Intrinsics.areEqual(this.f62119c, c30747r.f62119c);
    }

    public final int hashCode() {
        return this.f62119c.hashCode() + ((this.f62118b.hashCode() + (this.f62117a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Config(cameraConfig=" + this.f62117a + ", buttonsConfig=" + this.f62118b + ", toolbarConfig=" + this.f62119c + ")";
    }

    public C30747r(C30372e c30372e, C30360a c30360a, int i11) {
        c30372e = (i11 & 1) != 0 ? new C30372e(15) : c30372e;
        c30360a = (i11 & 2) != 0 ? new C30360a() : c30360a;
        C30800z c30800z = new C30800z(0);
        this.f62117a = c30372e;
        this.f62118b = c30360a;
        this.f62119c = c30800z;
    }
}
