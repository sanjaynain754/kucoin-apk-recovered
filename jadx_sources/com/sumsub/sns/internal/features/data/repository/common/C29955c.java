package com.sumsub.sns.internal.features.data.repository.common;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.common.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29955c extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C29957e f60148a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60149b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29957e f60150c;

    /* JADX INFO: renamed from: d */
    public int f60151d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29955c(C29957e c29957e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60150c = c29957e;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60149b = obj;
        this.f60151d |= Integer.MIN_VALUE;
        return this.f60150c.m70035a(this);
    }
}
