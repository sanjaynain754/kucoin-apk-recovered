package com.sumsub.sns.internal.features.domain;

import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.Z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30091Z extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60480a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30093a0 f60481b;

    /* JADX INFO: renamed from: c */
    public int f60482c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30091Z(C30093a0 c30093a0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60481b = c30093a0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60480a = obj;
        this.f60482c |= Integer.MIN_VALUE;
        Object objM70110a = this.f60481b.m70110a(null, this);
        return objM70110a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70110a : Result.m103843boximpl(objM70110a);
    }
}
