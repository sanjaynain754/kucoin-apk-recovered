package com.sumsub.sns.internal.features.data.repository.sumsubid;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.sumsubid.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30058g extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f60395a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60396b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30059h f60397c;

    /* JADX INFO: renamed from: d */
    public int f60398d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30058g(C30059h c30059h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60397c = c30059h;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60396b = obj;
        this.f60398d |= Integer.MIN_VALUE;
        return this.f60397c.m70083a(null, this);
    }
}
