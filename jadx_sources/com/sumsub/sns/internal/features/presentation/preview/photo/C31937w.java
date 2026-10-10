package com.sumsub.sns.internal.features.presentation.preview.photo;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31937w extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64926a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC31770c0 f64927b;

    /* JADX INFO: renamed from: c */
    public int f64928c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31937w(AbstractC31770c0 abstractC31770c0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f64927b = abstractC31770c0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f64926a = obj;
        this.f64928c |= Integer.MIN_VALUE;
        return this.f64927b.m70861a((ContinuationImpl) this);
    }
}
