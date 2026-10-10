package com.sumsub.sns.internal.features.domain.mrtd;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.mrtd.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30235a extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60774a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30237b f60775b;

    /* JADX INFO: renamed from: c */
    public int f60776c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30235a(C30237b c30237b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60775b = c30237b;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60774a = obj;
        this.f60776c |= Integer.MIN_VALUE;
        return this.f60775b.m70152a(null, this);
    }
}
