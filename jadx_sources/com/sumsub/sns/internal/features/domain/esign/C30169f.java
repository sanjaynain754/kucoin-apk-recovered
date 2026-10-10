package com.sumsub.sns.internal.features.domain.esign;

import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.esign.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30169f extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60626a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30170g f60627b;

    /* JADX INFO: renamed from: c */
    public int f60628c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30169f(C30170g c30170g, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60627b = c30170g;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60626a = obj;
        this.f60628c |= Integer.MIN_VALUE;
        Object objM70128a = this.f60627b.m70128a(null, this);
        return objM70128a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70128a : Result.m103843boximpl(objM70128a);
    }
}
