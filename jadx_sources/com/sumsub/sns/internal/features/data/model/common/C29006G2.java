package com.sumsub.sns.internal.features.data.model.common;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.G2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29006G2 {

    /* JADX INFO: renamed from: a */
    public final boolean f58951a;

    /* JADX INFO: renamed from: b */
    public final PhotosAmount f58952b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29006G2)) {
            return false;
        }
        C29006G2 c29006g2 = (C29006G2) obj;
        return this.f58951a == c29006g2.f58951a && this.f58952b == c29006g2.f58952b;
    }

    public final int hashCode() {
        return this.f58952b.hashCode() + (Boolean.hashCode(this.f58951a) * 31);
    }

    public final String toString() {
        return "BankCard(allowed=" + this.f58951a + ", photosAmount=" + this.f58952b + ")";
    }

    public C29006G2(boolean z11, PhotosAmount photosAmount) {
        this.f58951a = z11;
        this.f58952b = photosAmount;
    }
}
