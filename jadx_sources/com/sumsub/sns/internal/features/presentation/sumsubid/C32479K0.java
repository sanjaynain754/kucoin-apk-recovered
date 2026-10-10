package com.sumsub.sns.internal.features.presentation.sumsubid;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.K0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32479K0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C32487O0 f66234a;

    /* JADX INFO: renamed from: b */
    public C32527h0 f66235b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f66236c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32487O0 f66237d;

    /* JADX INFO: renamed from: e */
    public int f66238e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32479K0(C32487O0 c32487o0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66237d = c32487o0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66236c = obj;
        this.f66238e |= Integer.MIN_VALUE;
        return C32487O0.m71153b(this.f66237d, this);
    }
}
