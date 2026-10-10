package com.sumsub.sns.internal.features.presentation.sumsubid;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.C0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32463C0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66186a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32487O0 f66187b;

    /* JADX INFO: renamed from: c */
    public int f66188c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32463C0(C32487O0 c32487o0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66187b = c32487o0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66186a = obj;
        this.f66188c |= Integer.MIN_VALUE;
        return this.f66187b.m71154a((Throwable) null, this);
    }
}
