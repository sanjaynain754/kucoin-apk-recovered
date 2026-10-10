package com.sumsub.sns.internal.features.presentation.main;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.f0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31261f0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63315a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31332p0 f63316b;

    /* JADX INFO: renamed from: c */
    public int f63317c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31261f0(C31332p0 c31332p0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63316b = c31332p0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63315a = obj;
        this.f63317c |= Integer.MIN_VALUE;
        return this.f63316b.m70688a(this);
    }
}
