package com.sumsub.sns.internal.features.presentation.utils;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32628F extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66581a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32635M f66582b;

    /* JADX INFO: renamed from: c */
    public int f66583c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32628F(C32635M c32635m, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66582b = c32635m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66581a = obj;
        this.f66583c |= Integer.MIN_VALUE;
        return this.f66582b.m71249c(this);
    }
}
