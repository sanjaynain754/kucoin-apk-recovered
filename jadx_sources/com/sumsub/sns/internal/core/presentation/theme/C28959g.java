package com.sumsub.sns.internal.core.presentation.theme;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.theme.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28959g extends AbstractC28962j {

    /* JADX INFO: renamed from: a */
    public final Float f58866a;

    /* JADX INFO: renamed from: b */
    public final Float f58867b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28959g)) {
            return false;
        }
        C28959g c28959g = (C28959g) obj;
        return Intrinsics.areEqual((Object) this.f58866a, (Object) c28959g.f58866a) && Intrinsics.areEqual((Object) this.f58867b, (Object) c28959g.f58867b);
    }

    public final int hashCode() {
        Float f11 = this.f58866a;
        int iHashCode = (f11 == null ? 0 : f11.hashCode()) * 31;
        Float f12 = this.f58867b;
        return iHashCode + (f12 != null ? f12.hashCode() : 0);
    }

    public final String toString() {
        return "Size(width=" + this.f58866a + ", height=" + this.f58867b + ")";
    }

    public C28959g(Float f11, Float f12) {
        this.f58866a = f11;
        this.f58867b = f12;
    }
}
