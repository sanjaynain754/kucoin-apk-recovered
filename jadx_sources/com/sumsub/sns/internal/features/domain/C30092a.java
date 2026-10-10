package com.sumsub.sns.internal.features.domain;

import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30092a extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60483a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30101b f60484b;

    /* JADX INFO: renamed from: c */
    public int f60485c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30092a(C30101b c30101b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60484b = c30101b;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60483a = obj;
        this.f60485c |= Integer.MIN_VALUE;
        Object objM70112a = this.f60484b.m70112a(null, null, this);
        return objM70112a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70112a : Result.m103843boximpl(objM70112a);
    }
}
