package com.sumsub.sns.internal.features.domain.geo;

import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.geo.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30212w extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60719a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30213x f60720b;

    /* JADX INFO: renamed from: c */
    public int f60721c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30212w(C30213x c30213x, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60720b = c30213x;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60719a = obj;
        this.f60721c |= Integer.MIN_VALUE;
        Object objM70141a = this.f60720b.m70141a(null, this);
        return objM70141a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70141a : Result.m103843boximpl(objM70141a);
    }
}
