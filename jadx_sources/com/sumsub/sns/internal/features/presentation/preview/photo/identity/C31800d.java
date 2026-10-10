package com.sumsub.sns.internal.features.presentation.preview.photo.identity;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.identity.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31800d extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64618a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31801e f64619b;

    /* JADX INFO: renamed from: c */
    public int f64620c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31800d(C31801e c31801e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f64619b = c31801e;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f64618a = obj;
        this.f64620c |= Integer.MIN_VALUE;
        return this.f64619b.m70882b(false, this);
    }
}
