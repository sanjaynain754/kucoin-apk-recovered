package com.sumsub.sns.internal.features.presentation.preview.photo.identity;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.identity.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31799c extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64615a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31801e f64616b;

    /* JADX INFO: renamed from: c */
    public int f64617c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31799c(C31801e c31801e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f64616b = c31801e;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f64615a = obj;
        this.f64617c |= Integer.MIN_VALUE;
        return this.f64616b.m70880a(false, (ContinuationImpl) this);
    }
}
