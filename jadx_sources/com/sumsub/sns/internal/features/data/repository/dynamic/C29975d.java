package com.sumsub.sns.internal.features.data.repository.dynamic;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29975d extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60217a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C29978g f60218b;

    /* JADX INFO: renamed from: c */
    public int f60219c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29975d(C29978g c29978g, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60218b = c29978g;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60217a = obj;
        this.f60219c |= Integer.MIN_VALUE;
        return this.f60218b.m70055a(this);
    }
}
