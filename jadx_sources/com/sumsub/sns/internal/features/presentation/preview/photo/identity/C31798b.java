package com.sumsub.sns.internal.features.presentation.preview.photo.identity;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.identity.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31798b extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64612a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31801e f64613b;

    /* JADX INFO: renamed from: c */
    public int f64614c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31798b(C31801e c31801e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f64613b = c31801e;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f64612a = obj;
        this.f64614c |= Integer.MIN_VALUE;
        return this.f64613b.m70884d(this);
    }
}
