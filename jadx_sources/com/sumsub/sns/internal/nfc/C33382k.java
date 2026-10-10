package com.sumsub.sns.internal.nfc;

/* JADX INFO: renamed from: com.sumsub.sns.internal.nfc.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33382k extends AbstractC33384m {

    /* JADX INFO: renamed from: a */
    public final NfcResult$Failed$Reason f68084a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33382k) && this.f68084a == ((C33382k) obj).f68084a;
    }

    public final int hashCode() {
        return this.f68084a.hashCode();
    }

    public final String toString() {
        return "Failed(reason=" + this.f68084a + ")";
    }

    public C33382k(NfcResult$Failed$Reason nfcResult$Failed$Reason) {
        this.f68084a = nfcResult$Failed$Reason;
    }
}
