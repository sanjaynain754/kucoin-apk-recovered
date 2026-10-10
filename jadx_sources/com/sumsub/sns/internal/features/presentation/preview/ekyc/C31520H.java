package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.H */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31520H extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63957a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31707h0 f63958b;

    /* JADX INFO: renamed from: c */
    public int f63959c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31520H(C31707h0 c31707h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63958b = c31707h0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63957a = obj;
        this.f63959c |= Integer.MIN_VALUE;
        return C31707h0.m70804a(this.f63958b, null, null, null, this);
    }
}
