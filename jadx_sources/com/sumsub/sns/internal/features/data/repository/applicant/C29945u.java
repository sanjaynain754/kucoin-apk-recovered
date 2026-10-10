package com.sumsub.sns.internal.features.data.repository.applicant;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.applicant.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29945u extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f60114a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60115b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29950z f60116c;

    /* JADX INFO: renamed from: d */
    public int f60117d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29945u(C29950z c29950z, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60116c = c29950z;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60115b = obj;
        this.f60117d |= Integer.MIN_VALUE;
        return this.f60116c.m70025f(this);
    }
}
