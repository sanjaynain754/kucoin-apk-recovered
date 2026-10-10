package com.sumsub.sns.internal.features.presentation.sumsubid;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.D */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32464D extends AbstractC32484N {

    /* JADX INFO: renamed from: a */
    public final boolean f66189a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32464D) && this.f66189a == ((C32464D) obj).f66189a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f66189a);
    }

    public final String toString() {
        return "OnAgreementAccepted(userConsentAccepted=" + this.f66189a + ")";
    }

    public C32464D(boolean z11) {
        this.f66189a = z11;
    }
}
