package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.e0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31547e0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f64055a;

    /* JADX INFO: renamed from: b */
    public Object f64056b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f64057c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31707h0 f64058d;

    /* JADX INFO: renamed from: e */
    public int f64059e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31547e0(C31707h0 c31707h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f64058d = c31707h0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f64057c = obj;
        this.f64059e |= Integer.MIN_VALUE;
        return this.f64058d.m70821e(this);
    }
}
