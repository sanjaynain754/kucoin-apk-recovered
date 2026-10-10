package com.sumsub.sns.internal.features.presentation.status;

import java.util.Map;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.S */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32409S extends AbstractC32410T {

    /* JADX INFO: renamed from: h */
    public final Map f66062h;

    /* JADX INFO: renamed from: i */
    public final C32414b f66063i;

    /* JADX INFO: renamed from: j */
    public final SNSApplicantStatusAnalyticsState f66064j;

    @Override // com.sumsub.sns.internal.features.presentation.status.AbstractC32410T
    /* JADX INFO: renamed from: a */
    public final SNSApplicantStatusAnalyticsState mo71125a() {
        return this.f66064j;
    }

    public C32409S(Map map, CharSequence charSequence, CharSequence charSequence2, boolean z11, C32414b c32414b, SNSApplicantStatusAnalyticsState sNSApplicantStatusAnalyticsState) {
        super(null, null, charSequence, CollectionsKt.emptyList(), charSequence2, z11, null);
        this.f66062h = map;
        this.f66063i = c32414b;
        this.f66064j = sNSApplicantStatusAnalyticsState;
    }
}
