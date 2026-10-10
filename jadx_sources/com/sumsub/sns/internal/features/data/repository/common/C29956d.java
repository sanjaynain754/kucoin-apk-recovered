package com.sumsub.sns.internal.features.data.repository.common;

import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.common.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29956d extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60152a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C29957e f60153b;

    /* JADX INFO: renamed from: c */
    public int f60154c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29956d(C29957e c29957e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60153b = c29957e;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60152a = obj;
        this.f60154c |= Integer.MIN_VALUE;
        Object objM70037b = this.f60153b.m70037b(this);
        return objM70037b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70037b : Result.m103843boximpl(objM70037b);
    }
}
