package com.sumsub.sns.internal.features.presentation.verification;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.a0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32702a0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f66875a;

    /* JADX INFO: renamed from: b */
    public int f66876b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f66877c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32720j0 f66878d;

    /* JADX INFO: renamed from: e */
    public int f66879e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32702a0(C32720j0 c32720j0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66878d = c32720j0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66877c = obj;
        this.f66879e |= Integer.MIN_VALUE;
        return C32720j0.m71298a(this.f66878d, false, (Long) null, false, (String) null, (ContinuationImpl) this);
    }
}
