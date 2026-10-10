package com.sumsub.sns.internal.features.presentation.sumsubid;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.A */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32458A extends AbstractC32484N {

    /* JADX INFO: renamed from: a */
    public final String f66173a;

    /* JADX INFO: renamed from: b */
    public final Long f66174b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32458A)) {
            return false;
        }
        C32458A c32458a = (C32458A) obj;
        return Intrinsics.areEqual(this.f66173a, c32458a.f66173a) && Intrinsics.areEqual(this.f66174b, c32458a.f66174b);
    }

    public final int hashCode() {
        int iHashCode = this.f66173a.hashCode() * 31;
        Long l11 = this.f66174b;
        return iHashCode + (l11 == null ? 0 : l11.hashCode());
    }

    public final String toString() {
        return "CheckCode(code=" + this.f66173a + ", timestamp=" + this.f66174b + ")";
    }

    public C32458A(String str, Long l11) {
        this.f66173a = str;
        this.f66174b = l11;
    }
}
