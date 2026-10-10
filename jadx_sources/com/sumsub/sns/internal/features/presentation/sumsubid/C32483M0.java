package com.sumsub.sns.internal.features.presentation.sumsubid;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.M0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32483M0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Throwable f66250a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f66251b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32487O0 f66252c;

    /* JADX INFO: renamed from: d */
    public int f66253d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32483M0(C32487O0 c32487o0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66252c = c32487o0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66251b = obj;
        this.f66253d |= Integer.MIN_VALUE;
        return this.f66252c.m71157b((Throwable) null, this);
    }
}
