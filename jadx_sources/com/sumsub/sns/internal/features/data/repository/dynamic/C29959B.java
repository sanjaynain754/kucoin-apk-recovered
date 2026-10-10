package com.sumsub.sns.internal.features.data.repository.dynamic;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29959B extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60165a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C29967J f60166b;

    /* JADX INFO: renamed from: c */
    public int f60167c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29959B(C29967J c29967j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60166b = c29967j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60165a = obj;
        this.f60167c |= Integer.MIN_VALUE;
        return this.f60166b.m70044b(this);
    }
}
