package com.sumsub.sns.internal.features.domain.esign;

import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.esign.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30171h extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60629a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30172i f60630b;

    /* JADX INFO: renamed from: c */
    public int f60631c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30171h(C30172i c30172i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60630b = c30172i;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60629a = obj;
        this.f60631c |= Integer.MIN_VALUE;
        Object objM70129a = this.f60630b.m70129a(null, null, this);
        return objM70129a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70129a : Result.m103843boximpl(objM70129a);
    }
}
