package com.sumsub.sns.internal.features.domain.geo;

import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.geo.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30214y extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60724a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30215z f60725b;

    /* JADX INFO: renamed from: c */
    public int f60726c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30214y(C30215z c30215z, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60725b = c30215z;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60724a = obj;
        this.f60726c |= Integer.MIN_VALUE;
        Object objM70142a = this.f60725b.m70142a(this);
        return objM70142a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70142a : Result.m103843boximpl(objM70142a);
    }
}
