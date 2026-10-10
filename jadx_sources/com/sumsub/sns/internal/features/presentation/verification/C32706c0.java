package com.sumsub.sns.internal.features.presentation.verification;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.c0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32706c0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f66893a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f66894b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32720j0 f66895c;

    /* JADX INFO: renamed from: d */
    public int f66896d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32706c0(C32720j0 c32720j0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66895c = c32720j0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66894b = obj;
        this.f66896d |= Integer.MIN_VALUE;
        return this.f66895c.m71300a(0L, this);
    }
}
