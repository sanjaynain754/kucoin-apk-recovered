package com.sumsub.sns.internal.features.domain.geo;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.geo.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30206q extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60700a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30207r f60701b;

    /* JADX INFO: renamed from: c */
    public int f60702c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30206q(C30207r c30207r, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60701b = c30207r;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60700a = obj;
        this.f60702c |= Integer.MIN_VALUE;
        return this.f60701b.m70137a(null, null, this);
    }
}
