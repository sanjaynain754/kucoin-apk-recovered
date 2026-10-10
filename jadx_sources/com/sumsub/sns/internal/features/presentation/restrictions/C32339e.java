package com.sumsub.sns.internal.features.presentation.restrictions;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.restrictions.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32339e extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65895a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32340f f65896b;

    /* JADX INFO: renamed from: c */
    public int f65897c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32339e(C32340f c32340f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f65896b = c32340f;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65895a = obj;
        this.f65897c |= Integer.MIN_VALUE;
        return this.f65896b.m71100a(this);
    }
}
