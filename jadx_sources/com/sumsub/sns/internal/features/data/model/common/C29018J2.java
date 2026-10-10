package com.sumsub.sns.internal.features.data.model.common;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.J2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29018J2 {

    /* JADX INFO: renamed from: a */
    public final C29006G2 f58960a;

    /* JADX INFO: renamed from: b */
    public final C29002F2 f58961b;

    /* JADX INFO: renamed from: c */
    public final C29014I2 f58962c;

    /* JADX INFO: renamed from: d */
    public final C29010H2 f58963d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29018J2)) {
            return false;
        }
        C29018J2 c29018j2 = (C29018J2) obj;
        return Intrinsics.areEqual(this.f58960a, c29018j2.f58960a) && Intrinsics.areEqual(this.f58961b, c29018j2.f58961b) && Intrinsics.areEqual(this.f58962c, c29018j2.f58962c) && Intrinsics.areEqual(this.f58963d, c29018j2.f58963d);
    }

    public final int hashCode() {
        C29006G2 c29006g2 = this.f58960a;
        int iHashCode = (c29006g2 == null ? 0 : c29006g2.hashCode()) * 31;
        C29002F2 c29002f2 = this.f58961b;
        int iHashCode2 = (iHashCode + (c29002f2 == null ? 0 : c29002f2.hashCode())) * 31;
        C29014I2 c29014i2 = this.f58962c;
        int iHashCode3 = (iHashCode2 + (c29014i2 == null ? 0 : c29014i2.hashCode())) * 31;
        C29010H2 c29010h2 = this.f58963d;
        return iHashCode3 + (c29010h2 != null ? c29010h2.hashCode() : 0);
    }

    public final String toString() {
        return "TypeSettings(bankCard=" + this.f58960a + ", bankAccount=" + this.f58961b + ", eWallet=" + this.f58962c + ", cryptoWallet=" + this.f58963d + ")";
    }

    public C29018J2(C29006G2 c29006g2, C29002F2 c29002f2, C29014I2 c29014i2, C29010H2 c29010h2) {
        this.f58960a = c29006g2;
        this.f58961b = c29002f2;
        this.f58962c = c29014i2;
        this.f58963d = c29010h2;
    }
}
