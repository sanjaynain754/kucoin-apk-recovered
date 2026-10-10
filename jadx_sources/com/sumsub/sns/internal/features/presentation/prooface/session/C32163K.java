package com.sumsub.sns.internal.features.presentation.prooface.session;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.K */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32163K extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65485a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32169N f65486b;

    /* JADX INFO: renamed from: c */
    public int f65487c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32163K(C32169N c32169n, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f65486b = c32169n;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65485a = obj;
        this.f65487c |= Integer.MIN_VALUE;
        return this.f65486b.m71052a(this);
    }
}
