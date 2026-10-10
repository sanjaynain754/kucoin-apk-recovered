package com.sumsub.sns.internal.features.data.repository.applicant;

import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.applicant.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29937m extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60084a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C29950z f60085b;

    /* JADX INFO: renamed from: c */
    public int f60086c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29937m(C29950z c29950z, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60085b = c29950z;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60084a = obj;
        this.f60086c |= Integer.MIN_VALUE;
        Object objM70023d = this.f60085b.m70023d(this);
        return objM70023d == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70023d : Result.m103843boximpl(objM70023d);
    }
}
