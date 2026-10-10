package com.sumsub.sns.internal.features.data.repository.sumsubid;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.sumsubid.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30057f extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60392a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30059h f60393b;

    /* JADX INFO: renamed from: c */
    public int f60394c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30057f(C30059h c30059h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60393b = c30059h;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60392a = obj;
        this.f60394c |= Integer.MIN_VALUE;
        return this.f60393b.m70082a(null, null, this);
    }
}
