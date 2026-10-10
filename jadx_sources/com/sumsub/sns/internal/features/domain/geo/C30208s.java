package com.sumsub.sns.internal.features.domain.geo;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.geo.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30208s extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f60706a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60707b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30210u f60708c;

    /* JADX INFO: renamed from: d */
    public int f60709d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30208s(C30210u c30210u, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60708c = c30210u;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60707b = obj;
        this.f60709d |= Integer.MIN_VALUE;
        return this.f60708c.m70139a(null, this);
    }
}
