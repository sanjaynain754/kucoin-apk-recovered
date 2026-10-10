package com.sumsub.sns.internal.features.presentation.preview.photo.common;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.common.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31779i extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64576a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31783m f64577b;

    /* JADX INFO: renamed from: c */
    public int f64578c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31779i(C31783m c31783m, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f64577b = c31783m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f64576a = obj;
        this.f64578c |= Integer.MIN_VALUE;
        return this.f64577b.mo70865c((Continuation) this);
    }
}
