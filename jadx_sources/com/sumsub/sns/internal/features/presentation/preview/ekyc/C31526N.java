package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.N */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31526N extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63989a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31707h0 f63990b;

    /* JADX INFO: renamed from: c */
    public int f63991c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31526N(C31707h0 c31707h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63990b = c31707h0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63989a = obj;
        this.f63991c |= Integer.MIN_VALUE;
        return this.f63990b.m70819d(this);
    }
}
