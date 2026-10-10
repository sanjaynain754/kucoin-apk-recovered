package com.sumsub.sns.internal.features.data.repository.applicant;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.applicant.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29935k extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f60076a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60077b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29950z f60078c;

    /* JADX INFO: renamed from: d */
    public int f60079d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29935k(C29950z c29950z, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60078c = c29950z;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60077b = obj;
        this.f60079d |= Integer.MIN_VALUE;
        return this.f60078c.m70007a(0, this);
    }
}
