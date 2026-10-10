package com.sumsub.sns.internal.features.domain.mrtd;

import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.mrtd.E */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30232E extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60764a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30234G f60765b;

    /* JADX INFO: renamed from: c */
    public int f60766c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30232E(C30234G c30234g, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60765b = c30234g;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60764a = obj;
        this.f60766c |= Integer.MIN_VALUE;
        Object objM70151a = this.f60765b.m70151a(null, null, null, null, this);
        return objM70151a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70151a : Result.m103843boximpl(objM70151a);
    }
}
