package com.sumsub.sns.internal.features.data.repository.applicant;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.applicant.I */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29913I extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60048a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C29914J f60049b;

    /* JADX INFO: renamed from: c */
    public int f60050c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29913I(C29914J c29914j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60049b = c29914j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60048a = obj;
        this.f60050c |= Integer.MIN_VALUE;
        return this.f60049b.m69960b(null, null, null, null, null, null, null, this);
    }
}
