package com.sumsub.sns.internal.features.presentation.sumsubid;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.N0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32485N0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Throwable f66254a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f66255b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32487O0 f66256c;

    /* JADX INFO: renamed from: d */
    public int f66257d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32485N0(C32487O0 c32487o0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66256c = c32487o0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66255b = obj;
        this.f66257d |= Integer.MIN_VALUE;
        return this.f66256c.m71158c(null, this);
    }
}
