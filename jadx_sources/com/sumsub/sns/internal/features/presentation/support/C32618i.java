package com.sumsub.sns.internal.features.presentation.support;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.support.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32618i extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66543a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32620k f66544b;

    /* JADX INFO: renamed from: c */
    public int f66545c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32618i(C32620k c32620k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66544b = c32620k;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66543a = obj;
        this.f66545c |= Integer.MIN_VALUE;
        return this.f66544b.onPrepare(this);
    }
}
