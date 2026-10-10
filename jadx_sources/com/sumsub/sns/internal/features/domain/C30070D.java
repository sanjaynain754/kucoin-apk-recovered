package com.sumsub.sns.internal.features.domain;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.D */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30070D extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f60408a;

    /* JADX INFO: renamed from: b */
    public Object f60409b;

    /* JADX INFO: renamed from: c */
    public String f60410c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f60411d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C30071E f60412e;

    /* JADX INFO: renamed from: f */
    public int f60413f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30070D(C30071E c30071e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60412e = c30071e;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60411d = obj;
        this.f60413f |= Integer.MIN_VALUE;
        return this.f60412e.m70098a(null, null, this);
    }
}
