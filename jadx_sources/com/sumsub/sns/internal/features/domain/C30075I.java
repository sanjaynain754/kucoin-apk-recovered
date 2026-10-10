package com.sumsub.sns.internal.features.domain;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.I */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30075I extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60428a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30078L f60429b;

    /* JADX INFO: renamed from: c */
    public int f60430c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30075I(C30078L c30078l, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60429b = c30078l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60428a = obj;
        this.f60430c |= Integer.MIN_VALUE;
        return C30078L.m70102a(this.f60429b, this);
    }
}
