package com.sumsub.sns.internal.features.presentation.esign;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.k0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30991k0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f62623a;

    /* JADX INFO: renamed from: b */
    public Object f62624b;

    /* JADX INFO: renamed from: c */
    public Object f62625c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f62626d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C30997n0 f62627e;

    /* JADX INFO: renamed from: f */
    public int f62628f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30991k0(C30997n0 c30997n0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f62627e = c30997n0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62626d = obj;
        this.f62628f |= Integer.MIN_VALUE;
        return this.f62627e.m70546a(false, (ContinuationImpl) this);
    }
}
