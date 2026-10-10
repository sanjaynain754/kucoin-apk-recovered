package com.sumsub.sns.internal.features.presentation.sumsubid;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.j0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32533j0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f66360a;

    /* JADX INFO: renamed from: b */
    public Throwable f66361b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f66362c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32487O0 f66363d;

    /* JADX INFO: renamed from: e */
    public int f66364e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32533j0(C32487O0 c32487o0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66363d = c32487o0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66362c = obj;
        this.f66364e |= Integer.MIN_VALUE;
        return C32487O0.m71152a(this.f66363d, this);
    }
}
