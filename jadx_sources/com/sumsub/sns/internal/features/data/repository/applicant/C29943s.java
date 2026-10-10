package com.sumsub.sns.internal.features.data.repository.applicant;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.applicant.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29943s extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f60106a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60107b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29950z f60108c;

    /* JADX INFO: renamed from: d */
    public int f60109d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29943s(C29950z c29950z, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60108c = c29950z;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60107b = obj;
        this.f60109d |= Integer.MIN_VALUE;
        return this.f60108c.m70016a((String) null, this);
    }
}
