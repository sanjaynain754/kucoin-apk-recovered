package com.sumsub.sns.internal.features.presentation.status;

import com.sumsub.sns.internal.core.presentation.base.adapter.C28716e;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.Q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32408Q extends AbstractC32410T {

    /* JADX INFO: renamed from: h */
    public final SNSApplicantStatusAnalyticsState f66061h;

    @Override // com.sumsub.sns.internal.features.presentation.status.AbstractC32410T
    /* JADX INFO: renamed from: a */
    public final SNSApplicantStatusAnalyticsState mo71125a() {
        return this.f66061h;
    }

    public C32408Q(C28716e c28716e, CharSequence charSequence, SNSApplicantStatusAnalyticsState sNSApplicantStatusAnalyticsState) {
        super(null, null, charSequence, CollectionsKt.listOf(c28716e), null, false, null);
        this.f66061h = sNSApplicantStatusAnalyticsState;
    }
}
