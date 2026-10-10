package com.sumsub.sns.internal.features.data.repository.applicant;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.applicant.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29931g extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60069a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C29950z f60070b;

    /* JADX INFO: renamed from: c */
    public int f60071c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29931g(C29950z c29950z, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60070b = c29950z;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60069a = obj;
        this.f60071c |= Integer.MIN_VALUE;
        return this.f60070b.m70022c(this);
    }
}
