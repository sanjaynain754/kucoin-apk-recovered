package com.sumsub.sns.internal.features.presentation.status;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32438n {

    /* JADX INFO: renamed from: a */
    public final SNSApplicantStatusAnalyticsState f66127a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32438n) && this.f66127a == ((C32438n) obj).f66127a;
    }

    public final int hashCode() {
        return this.f66127a.hashCode();
    }

    public final String toString() {
        return "SNSApplicantStatusOpenEvent(state=" + this.f66127a + ")";
    }

    public C32438n(SNSApplicantStatusAnalyticsState sNSApplicantStatusAnalyticsState) {
        this.f66127a = sNSApplicantStatusAnalyticsState;
    }
}
