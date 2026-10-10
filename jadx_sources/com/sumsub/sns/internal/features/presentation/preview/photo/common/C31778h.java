package com.sumsub.sns.internal.features.presentation.preview.photo.common;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.common.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31778h extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64573a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31783m f64574b;

    /* JADX INFO: renamed from: c */
    public int f64575c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31778h(C31783m c31783m, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f64574b = c31783m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f64573a = obj;
        this.f64575c |= Integer.MIN_VALUE;
        return this.f64574b.mo70863b((Continuation) this);
    }
}
