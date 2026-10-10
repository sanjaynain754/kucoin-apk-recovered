package com.sumsub.sns.internal.features.data.network.prooface;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.network.prooface.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29898m extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C29900o f59999a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60000b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29900o f60001c;

    /* JADX INFO: renamed from: d */
    public int f60002d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29898m(C29900o c29900o, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60001c = c29900o;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60000b = obj;
        this.f60002d |= Integer.MIN_VALUE;
        return this.f60001c.m69943a(null, this);
    }
}
