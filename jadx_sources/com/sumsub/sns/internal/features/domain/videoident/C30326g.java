package com.sumsub.sns.internal.features.domain.videoident;

import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.videoident.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30326g extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60978a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30327h f60979b;

    /* JADX INFO: renamed from: c */
    public int f60980c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30326g(C30327h c30327h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60979b = c30327h;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60978a = obj;
        this.f60980c |= Integer.MIN_VALUE;
        Object objM70189a = this.f60979b.m70189a(this);
        return objM70189a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70189a : Result.m103843boximpl(objM70189a);
    }
}
