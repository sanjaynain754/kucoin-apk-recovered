package com.sumsub.sns.internal.features.data.repository.dynamic;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29985n extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60250a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C29986o f60251b;

    /* JADX INFO: renamed from: c */
    public int f60252c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29985n(C29986o c29986o, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60251b = c29986o;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60250a = obj;
        this.f60252c |= Integer.MIN_VALUE;
        return this.f60251b.m70063a(null, this);
    }
}
