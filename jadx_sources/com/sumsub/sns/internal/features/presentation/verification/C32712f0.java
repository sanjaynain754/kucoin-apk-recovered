package com.sumsub.sns.internal.features.presentation.verification;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.f0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32712f0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C32720j0 f66912a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f66913b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32720j0 f66914c;

    /* JADX INFO: renamed from: d */
    public int f66915d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32712f0(C32720j0 c32720j0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66914c = c32720j0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66913b = obj;
        this.f66915d |= Integer.MIN_VALUE;
        return this.f66914c.m71310b(null, this);
    }
}
