package com.sumsub.sns.internal.features.domain;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30334y extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60996a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30336z f60997b;

    /* JADX INFO: renamed from: c */
    public int f60998c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30334y(C30336z c30336z, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60997b = c30336z;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60996a = obj;
        this.f60998c |= Integer.MIN_VALUE;
        return this.f60997b.m70193a(this);
    }
}
