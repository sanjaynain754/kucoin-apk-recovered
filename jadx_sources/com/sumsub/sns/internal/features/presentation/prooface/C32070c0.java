package com.sumsub.sns.internal.features.presentation.prooface;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.c0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32070c0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65254a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32109k0 f65255b;

    /* JADX INFO: renamed from: c */
    public int f65256c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32070c0(C32109k0 c32109k0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f65255b = c32109k0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65254a = obj;
        this.f65256c |= Integer.MIN_VALUE;
        return this.f65255b.onPrepare(this);
    }
}
