package com.sumsub.sns.internal.features.domain.esign;

import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.esign.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30173j extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60632a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30174k f60633b;

    /* JADX INFO: renamed from: c */
    public int f60634c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30173j(C30174k c30174k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60633b = c30174k;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60632a = obj;
        this.f60634c |= Integer.MIN_VALUE;
        Object objM70130a = this.f60633b.m70130a(null, this);
        return objM70130a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70130a : Result.m103843boximpl(objM70130a);
    }
}
