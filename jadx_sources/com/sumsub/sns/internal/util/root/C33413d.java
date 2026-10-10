package com.sumsub.sns.internal.util.root;

/* JADX INFO: renamed from: com.sumsub.sns.internal.util.root.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33413d {

    /* JADX INFO: renamed from: a */
    public final boolean f68124a;

    /* JADX INFO: renamed from: b */
    public final boolean f68125b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33413d)) {
            return false;
        }
        C33413d c33413d = (C33413d) obj;
        return this.f68124a == c33413d.f68124a && this.f68125b == c33413d.f68125b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f68125b) + (Boolean.hashCode(this.f68124a) * 31);
    }

    public final String toString() {
        return "SNSRootConfig(checkForBinary=" + this.f68124a + ", checkForMagiskBinary=" + this.f68125b + ")";
    }

    public C33413d(boolean z11, boolean z12) {
        this.f68124a = z11;
        this.f68125b = z12;
    }
}
