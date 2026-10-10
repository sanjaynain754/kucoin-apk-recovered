package com.sumsub.sns.internal.features.domain.videoident;

import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.videoident.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30328i extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60983a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30329j f60984b;

    /* JADX INFO: renamed from: c */
    public int f60985c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30328i(C30329j c30329j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60984b = c30329j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60983a = obj;
        this.f60985c |= Integer.MIN_VALUE;
        Object objM70190a = this.f60984b.m70190a(this);
        return objM70190a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70190a : Result.m103843boximpl(objM70190a);
    }
}
