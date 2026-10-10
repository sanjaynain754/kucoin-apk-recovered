package com.sumsub.sns.internal.features.domain;

import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.d0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30106d0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60538a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30157e0 f60539b;

    /* JADX INFO: renamed from: c */
    public int f60540c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30106d0(C30157e0 c30157e0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60539b = c30157e0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60538a = obj;
        this.f60540c |= Integer.MIN_VALUE;
        Object objM70121a = this.f60539b.m70121a(null, null, this);
        return objM70121a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70121a : Result.m103843boximpl(objM70121a);
    }
}
