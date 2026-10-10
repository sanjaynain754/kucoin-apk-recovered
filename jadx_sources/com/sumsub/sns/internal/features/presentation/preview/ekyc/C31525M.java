package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.M */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31525M extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public CharSequence f63984a;

    /* JADX INFO: renamed from: b */
    public String f63985b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f63986c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31707h0 f63987d;

    /* JADX INFO: renamed from: e */
    public int f63988e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31525M(C31707h0 c31707h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63987d = c31707h0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63986c = obj;
        this.f63988e |= Integer.MIN_VALUE;
        return this.f63987d.m70818c(this);
    }
}
