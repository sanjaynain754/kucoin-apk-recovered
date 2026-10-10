package com.sumsub.sns.internal.features.data.repository.applicant;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.applicant.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29938n extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60087a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C29950z f60088b;

    /* JADX INFO: renamed from: c */
    public int f60089c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29938n(C29950z c29950z, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60088b = c29950z;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60087a = obj;
        this.f60089c |= Integer.MIN_VALUE;
        return this.f60088b.m70024e(this);
    }
}
