package com.sumsub.sns.internal.features.domain.appdata;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.ReviewStatusType;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.appdata.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30096c {

    /* JADX INFO: renamed from: a */
    public final AbstractC29172p f60496a;

    /* JADX INFO: renamed from: b */
    public final List f60497b;

    /* JADX INFO: renamed from: c */
    public final ReviewStatusType f60498c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30096c)) {
            return false;
        }
        C30096c c30096c = (C30096c) obj;
        return Intrinsics.areEqual(this.f60496a, c30096c.f60496a) && Intrinsics.areEqual(this.f60497b, c30096c.f60497b) && this.f60498c == c30096c.f60498c;
    }

    public final int hashCode() {
        int iHashCode = (this.f60497b.hashCode() + (this.f60496a.hashCode() * 31)) * 31;
        ReviewStatusType reviewStatusType = this.f60498c;
        return iHashCode + (reviewStatusType == null ? 0 : reviewStatusType.hashCode());
    }

    public final String toString() {
        return "SNSApplicantData(applicant=" + this.f60496a + ", documents=" + this.f60497b + ", viStatus=" + this.f60498c + ")";
    }

    public C30096c(AbstractC29172p abstractC29172p, List list, ReviewStatusType reviewStatusType) {
        this.f60496a = abstractC29172p;
        this.f60497b = list;
        this.f60498c = reviewStatusType;
    }
}
