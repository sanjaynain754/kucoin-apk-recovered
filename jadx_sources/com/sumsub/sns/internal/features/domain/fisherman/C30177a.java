package com.sumsub.sns.internal.features.domain.fisherman;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.fisherman.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30177a extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f60641a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60642b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30182f f60643c;

    /* JADX INFO: renamed from: d */
    public int f60644d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30177a(C30182f c30182f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60643c = c30182f;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60642b = obj;
        this.f60644d |= Integer.MIN_VALUE;
        return this.f60643c.m70132a(null, this);
    }
}
