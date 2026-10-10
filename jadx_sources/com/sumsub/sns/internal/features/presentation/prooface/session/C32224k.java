package com.sumsub.sns.internal.features.presentation.prooface.session;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32224k extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65644a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32228m f65645b;

    /* JADX INFO: renamed from: c */
    public int f65646c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32224k(C32228m c32228m, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f65645b = c32228m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65644a = obj;
        this.f65646c |= Integer.MIN_VALUE;
        return this.f65645b.m71059a(this);
    }
}
