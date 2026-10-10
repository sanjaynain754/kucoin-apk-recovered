package com.sumsub.sns.internal.features.domain.geo;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.geo.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30209t extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f60710a;

    /* JADX INFO: renamed from: b */
    public Object f60711b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f60712c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30210u f60713d;

    /* JADX INFO: renamed from: e */
    public int f60714e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30209t(C30210u c30210u, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60713d = c30210u;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60712c = obj;
        this.f60714e |= Integer.MIN_VALUE;
        return this.f60713d.m70138a(null, null, this);
    }
}
