package com.sumsub.sns.internal.features.domain.geo;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.geo.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30205p extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60697a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30207r f60698b;

    /* JADX INFO: renamed from: c */
    public int f60699c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30205p(C30207r c30207r, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60698b = c30207r;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60697a = obj;
        this.f60699c |= Integer.MIN_VALUE;
        return this.f60698b.m70136a(null, this);
    }
}
