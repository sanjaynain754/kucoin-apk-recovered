package com.sumsub.sns.internal.features.data.model.common;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.I2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29014I2 {

    /* JADX INFO: renamed from: a */
    public final boolean f58956a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29014I2) && this.f58956a == ((C29014I2) obj).f58956a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58956a);
    }

    public final String toString() {
        return "EWallet(allowed=" + this.f58956a + ")";
    }

    public C29014I2(boolean z11) {
        this.f58956a = z11;
    }
}
