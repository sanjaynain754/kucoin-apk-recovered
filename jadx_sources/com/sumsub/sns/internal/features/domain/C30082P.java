package com.sumsub.sns.internal.features.domain;

import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.P */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30082P extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60455a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30083Q f60456b;

    /* JADX INFO: renamed from: c */
    public int f60457c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30082P(C30083Q c30083q, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60456b = c30083q;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60455a = obj;
        this.f60457c |= Integer.MIN_VALUE;
        Object objM70106a = this.f60456b.m70106a(null, null, this);
        return objM70106a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70106a : Result.m103843boximpl(objM70106a);
    }
}
