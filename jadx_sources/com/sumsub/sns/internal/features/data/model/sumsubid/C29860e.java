package com.sumsub.sns.internal.features.data.model.sumsubid;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.sumsubid.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29860e {

    /* JADX INFO: renamed from: a */
    public final int f59946a;

    /* JADX INFO: renamed from: b */
    public final String f59947b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29860e)) {
            return false;
        }
        C29860e c29860e = (C29860e) obj;
        return this.f59946a == c29860e.f59946a && Intrinsics.areEqual(this.f59947b, c29860e.f59947b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f59946a) * 31;
        String str = this.f59947b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SNSSumsubIdAddress(index=" + this.f59946a + ", formattedAddress=" + this.f59947b + ")";
    }

    public C29860e(int i11, String str) {
        this.f59946a = i11;
        this.f59947b = str;
    }
}
