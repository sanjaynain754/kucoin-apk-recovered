package com.sumsub.sns.internal.features.data.model.common;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.H2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29010H2 {

    /* JADX INFO: renamed from: a */
    public final boolean f58954a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29010H2) && this.f58954a == ((C29010H2) obj).f58954a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58954a);
    }

    public final String toString() {
        return "CryptoWallet(allowed=" + this.f58954a + ")";
    }

    public C29010H2(boolean z11) {
        this.f58954a = z11;
    }
}
