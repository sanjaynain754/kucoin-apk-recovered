package com.sumsub.sns.internal.features.presentation.consent;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.consent.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30859j extends AbstractC30861l {

    /* JADX INFO: renamed from: a */
    public final int f62323a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30859j) && this.f62323a == ((C30859j) obj).f62323a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f62323a);
    }

    public final String toString() {
        return "OnCountrySelected(agreementId=" + this.f62323a + ")";
    }

    public C30859j(int i11) {
        this.f62323a = i11;
    }
}
