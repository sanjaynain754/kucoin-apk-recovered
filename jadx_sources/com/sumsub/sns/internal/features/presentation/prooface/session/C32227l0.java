package com.sumsub.sns.internal.features.presentation.prooface.session;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.l0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32227l0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f65654a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f65655b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32239r0 f65656c;

    /* JADX INFO: renamed from: d */
    public int f65657d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32227l0(C32239r0 c32239r0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f65656c = c32239r0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65655b = obj;
        this.f65657d |= Integer.MIN_VALUE;
        return this.f65656c.m71071b(this);
    }
}
