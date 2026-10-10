package com.sumsub.sns.internal.core.presentation.helper;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.ApplicantStatus;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.helper.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28879c {

    /* JADX INFO: renamed from: a */
    public final ApplicantStatus f58721a;

    /* JADX INFO: renamed from: b */
    public final AbstractC29172p f58722b;

    /* JADX INFO: renamed from: c */
    public final List f58723c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28879c)) {
            return false;
        }
        C28879c c28879c = (C28879c) obj;
        return this.f58721a == c28879c.f58721a && Intrinsics.areEqual(this.f58722b, c28879c.f58722b) && Intrinsics.areEqual(this.f58723c, c28879c.f58723c);
    }

    public final int hashCode() {
        return this.f58723c.hashCode() + ((this.f58722b.hashCode() + (this.f58721a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DocumentItemsParams(status=" + this.f58721a + ", applicant=" + this.f58722b + ", documents=" + this.f58723c + ")";
    }

    public C28879c(ApplicantStatus applicantStatus, AbstractC29172p abstractC29172p, List list) {
        this.f58721a = applicantStatus;
        this.f58722b = abstractC29172p;
        this.f58723c = list;
    }
}
