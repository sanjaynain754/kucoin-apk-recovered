package com.sumsub.sns.internal.features.data.repository.applicant;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.applicant.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29906B extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60027a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C29914J f60028b;

    /* JADX INFO: renamed from: c */
    public int f60029c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29906B(C29914J c29914j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60028b = c29914j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60027a = obj;
        this.f60029c |= Integer.MIN_VALUE;
        return this.f60028b.m69949a(0, this);
    }
}
