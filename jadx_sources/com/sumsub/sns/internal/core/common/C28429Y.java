package com.sumsub.sns.internal.core.common;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.Y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28429Y extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57939a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28446d0 f57940b;

    /* JADX INFO: renamed from: c */
    public int f57941c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28429Y(C28446d0 c28446d0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f57940b = c28446d0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f57939a = obj;
        this.f57941c |= Integer.MIN_VALUE;
        return this.f57940b.mo69276a(null, this);
    }
}
