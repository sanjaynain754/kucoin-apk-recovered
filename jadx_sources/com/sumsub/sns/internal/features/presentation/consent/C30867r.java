package com.sumsub.sns.internal.features.presentation.consent;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.consent.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30867r extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62348a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30870u f62349b;

    /* JADX INFO: renamed from: c */
    public int f62350c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30867r(C30870u c30870u, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f62349b = c30870u;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62348a = obj;
        this.f62350c |= Integer.MIN_VALUE;
        return C30870u.m70500a(this.f62349b, this);
    }
}
