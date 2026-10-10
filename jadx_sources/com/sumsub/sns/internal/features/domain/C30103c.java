package com.sumsub.sns.internal.features.domain;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30103c extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C30270n f60522a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60523b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30156e f60524c;

    /* JADX INFO: renamed from: d */
    public int f60525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30103c(C30156e c30156e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60524c = c30156e;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60523b = obj;
        this.f60525d |= Integer.MIN_VALUE;
        return this.f60524c.m70119a((C30270n) null, this);
    }
}
