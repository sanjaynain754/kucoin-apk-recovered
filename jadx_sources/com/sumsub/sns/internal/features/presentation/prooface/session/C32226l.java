package com.sumsub.sns.internal.features.presentation.prooface.session;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32226l extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65651a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32228m f65652b;

    /* JADX INFO: renamed from: c */
    public int f65653c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32226l(C32228m c32228m, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f65652b = c32228m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65651a = obj;
        this.f65653c |= Integer.MIN_VALUE;
        return this.f65652b.m71060b(this);
    }
}
