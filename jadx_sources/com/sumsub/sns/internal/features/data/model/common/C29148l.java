package com.sumsub.sns.internal.features.data.model.common;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29148l {

    /* JADX INFO: renamed from: a */
    public final C29136j f59129a;

    /* JADX INFO: renamed from: b */
    public final C29136j f59130b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29148l)) {
            return false;
        }
        C29148l c29148l = (C29148l) obj;
        return Intrinsics.areEqual(this.f59129a, c29148l.f59129a) && Intrinsics.areEqual(this.f59130b, c29148l.f59130b);
    }

    public final int hashCode() {
        C29136j c29136j = this.f59129a;
        int iHashCode = (c29136j == null ? 0 : c29136j.hashCode()) * 31;
        C29136j c29136j2 = this.f59130b;
        return iHashCode + (c29136j2 != null ? c29136j2.hashCode() : 0);
    }

    public final String toString() {
        return "RawInfo(info=" + this.f59129a + ", fixedInfo=" + this.f59130b + ")";
    }

    public C29148l(C29136j c29136j, C29136j c29136j2) {
        this.f59129a = c29136j;
        this.f59130b = c29136j2;
    }
}
