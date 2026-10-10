package com.sumsub.sns.internal.features.domain.esign;

import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.esign.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30164a extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60614a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30165b f60615b;

    /* JADX INFO: renamed from: c */
    public int f60616c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30164a(C30165b c30165b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60615b = c30165b;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60614a = obj;
        this.f60616c |= Integer.MIN_VALUE;
        Object objM70126a = this.f60615b.m70126a(null, null, this);
        return objM70126a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70126a : Result.m103843boximpl(objM70126a);
    }
}
