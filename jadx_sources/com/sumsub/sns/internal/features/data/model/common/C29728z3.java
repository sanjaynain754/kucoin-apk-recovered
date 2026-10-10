package com.sumsub.sns.internal.features.data.model.common;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.z3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29728z3 {

    /* JADX INFO: renamed from: a */
    public final int f59795a;

    /* JADX INFO: renamed from: b */
    public final int f59796b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29728z3)) {
            return false;
        }
        C29728z3 c29728z3 = (C29728z3) obj;
        return this.f59795a == c29728z3.f59795a && this.f59796b == c29728z3.f59796b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59796b) + (Integer.hashCode(this.f59795a) * 31);
    }

    public final String toString() {
        return "AspectRatio(width=" + this.f59795a + ", height=" + this.f59796b + ")";
    }

    public C29728z3(int i11, int i12) {
        this.f59795a = i11;
        this.f59796b = i12;
    }
}
