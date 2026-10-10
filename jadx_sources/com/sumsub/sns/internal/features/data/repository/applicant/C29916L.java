package com.sumsub.sns.internal.features.data.repository.applicant;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.applicant.L */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29916L extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60054a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C29917M f60055b;

    /* JADX INFO: renamed from: c */
    public int f60056c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29916L(C29917M c29917m, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60055b = c29917m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60054a = obj;
        this.f60056c |= Integer.MIN_VALUE;
        return this.f60055b.m69997a(null, this);
    }
}
