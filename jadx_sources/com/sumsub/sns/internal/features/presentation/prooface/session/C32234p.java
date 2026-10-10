package com.sumsub.sns.internal.features.presentation.prooface.session;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32234p extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65669a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32236q f65670b;

    /* JADX INFO: renamed from: c */
    public int f65671c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32234p(C32236q c32236q, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f65670b = c32236q;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65669a = obj;
        this.f65671c |= Integer.MIN_VALUE;
        return this.f65670b.m71063a(this);
    }
}
