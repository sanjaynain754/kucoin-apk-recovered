package com.sumsub.sns.internal.features.presentation.main;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.j0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31286j0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f63394a;

    /* JADX INFO: renamed from: b */
    public boolean f63395b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f63396c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31332p0 f63397d;

    /* JADX INFO: renamed from: e */
    public int f63398e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31286j0(C31332p0 c31332p0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63397d = c31332p0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63396c = obj;
        this.f63398e |= Integer.MIN_VALUE;
        return this.f63397d.m70691a(false, false, (ContinuationImpl) this);
    }
}
