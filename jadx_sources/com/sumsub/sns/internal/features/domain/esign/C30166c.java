package com.sumsub.sns.internal.features.domain.esign;

import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.esign.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30166c extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60617a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30168e f60618b;

    /* JADX INFO: renamed from: c */
    public int f60619c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30166c(C30168e c30168e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60618b = c30168e;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60617a = obj;
        this.f60619c |= Integer.MIN_VALUE;
        Object objM70127a = this.f60618b.m70127a(null, null, 0, null, this);
        return objM70127a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70127a : Result.m103843boximpl(objM70127a);
    }
}
