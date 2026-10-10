package com.sumsub.sns.internal.features.data.model.common;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.B3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28984B3 {

    /* JADX INFO: renamed from: a */
    public final ReviewStatusType f58905a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28984B3) && this.f58905a == ((C28984B3) obj).f58905a;
    }

    public final int hashCode() {
        ReviewStatusType reviewStatusType = this.f58905a;
        if (reviewStatusType == null) {
            return 0;
        }
        return reviewStatusType.hashCode();
    }

    public final String toString() {
        return "VideoIdentData(reviewStatus=" + this.f58905a + ")";
    }

    public C28984B3(ReviewStatusType reviewStatusType) {
        this.f58905a = reviewStatusType;
    }
}
