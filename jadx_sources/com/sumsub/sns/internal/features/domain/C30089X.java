package com.sumsub.sns.internal.features.domain;

import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.X */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30089X extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60476a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30090Y f60477b;

    /* JADX INFO: renamed from: c */
    public int f60478c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30089X(C30090Y c30090y, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60477b = c30090y;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60476a = obj;
        this.f60478c |= Integer.MIN_VALUE;
        Object objM70109a = this.f60477b.m70109a(null, null, this);
        return objM70109a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70109a : Result.m103843boximpl(objM70109a);
    }
}
