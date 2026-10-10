package com.sumsub.sns.internal.features.domain.ekyc;

import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.ekyc.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30162e extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f60607a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60608b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30163f f60609c;

    /* JADX INFO: renamed from: d */
    public int f60610d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30162e(C30163f c30163f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60609c = c30163f;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60608b = obj;
        this.f60610d |= Integer.MIN_VALUE;
        Object objM70125a = this.f60609c.m70125a(null, this);
        return objM70125a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70125a : Result.m103843boximpl(objM70125a);
    }
}
