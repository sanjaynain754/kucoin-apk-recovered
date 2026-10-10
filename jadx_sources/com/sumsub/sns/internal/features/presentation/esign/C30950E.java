package com.sumsub.sns.internal.features.presentation.esign;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.E */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30950E extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f62528a;

    /* JADX INFO: renamed from: b */
    public Object f62529b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f62530c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30997n0 f62531d;

    /* JADX INFO: renamed from: e */
    public int f62532e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30950E(C30997n0 c30997n0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f62531d = c30997n0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62530c = obj;
        this.f62532e |= Integer.MIN_VALUE;
        return this.f62531d.m70545a(this);
    }
}
