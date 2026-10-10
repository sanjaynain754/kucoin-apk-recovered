package com.sumsub.sns.internal.features.data.repository.applicant;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.applicant.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29949y extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f60136a;

    /* JADX INFO: renamed from: b */
    public String f60137b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f60138c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C29950z f60139d;

    /* JADX INFO: renamed from: e */
    public int f60140e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29949y(C29950z c29950z, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60139d = c29950z;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60138c = obj;
        this.f60140e |= Integer.MIN_VALUE;
        return this.f60139d.m70015a(null, null, this);
    }
}
