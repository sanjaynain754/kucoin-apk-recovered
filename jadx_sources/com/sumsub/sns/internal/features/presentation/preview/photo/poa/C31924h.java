package com.sumsub.sns.internal.features.presentation.preview.photo.poa;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.poa.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31924h extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64899a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31925i f64900b;

    /* JADX INFO: renamed from: c */
    public int f64901c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31924h(C31925i c31925i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f64900b = c31925i;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f64899a = obj;
        this.f64901c |= Integer.MIN_VALUE;
        return this.f64900b.onPrepare(this);
    }
}
