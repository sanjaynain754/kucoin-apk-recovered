package com.sumsub.sns.internal.features.data.repository.sumsubid;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.sumsubid.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30054c extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60388a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30055d f60389b;

    /* JADX INFO: renamed from: c */
    public int f60390c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30054c(C30055d c30055d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60389b = c30055d;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60388a = obj;
        this.f60390c |= Integer.MIN_VALUE;
        return this.f60389b.m70081a(this);
    }
}
