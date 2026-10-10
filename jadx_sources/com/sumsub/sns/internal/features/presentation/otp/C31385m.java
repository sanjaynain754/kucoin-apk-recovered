package com.sumsub.sns.internal.features.presentation.otp;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.otp.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31385m extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63600a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31389q f63601b;

    /* JADX INFO: renamed from: c */
    public int f63602c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31385m(C31389q c31389q, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63601b = c31389q;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63600a = obj;
        this.f63602c |= Integer.MIN_VALUE;
        return this.f63601b.onPrepare(this);
    }
}
