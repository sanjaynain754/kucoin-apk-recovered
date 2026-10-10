package com.sumsub.sns.internal.features.data.repository.dynamic;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29997z extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60282a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C29967J f60283b;

    /* JADX INFO: renamed from: c */
    public int f60284c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29997z(C29967J c29967j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60283b = c29967j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60282a = obj;
        this.f60284c |= Integer.MIN_VALUE;
        return this.f60283b.m70047c(false, this);
    }
}
