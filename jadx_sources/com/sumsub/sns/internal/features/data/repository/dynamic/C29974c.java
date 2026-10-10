package com.sumsub.sns.internal.features.data.repository.dynamic;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29974c extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60214a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C29978g f60215b;

    /* JADX INFO: renamed from: c */
    public int f60216c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29974c(C29978g c29978g, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60215b = c29978g;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60214a = obj;
        this.f60216c |= Integer.MIN_VALUE;
        return this.f60215b.m70056a(false, (ContinuationImpl) this);
    }
}
