package com.sumsub.sns.internal.features.domain.videoident;

import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.videoident.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30320a extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60951a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30321b f60952b;

    /* JADX INFO: renamed from: c */
    public int f60953c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30320a(C30321b c30321b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60952b = c30321b;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60951a = obj;
        this.f60953c |= Integer.MIN_VALUE;
        Object objM70186a = this.f60952b.m70186a(this);
        return objM70186a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70186a : Result.m103843boximpl(objM70186a);
    }
}
