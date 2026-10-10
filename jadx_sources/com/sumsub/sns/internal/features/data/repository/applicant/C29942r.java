package com.sumsub.sns.internal.features.data.repository.applicant;

import com.sumsub.sns.internal.features.data.model.esign.C29736H;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.applicant.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29942r extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C29736H f60102a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60103b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29950z f60104c;

    /* JADX INFO: renamed from: d */
    public int f60105d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29942r(C29950z c29950z, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60104c = c29950z;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60103b = obj;
        this.f60105d |= Integer.MIN_VALUE;
        return this.f60104c.m70012a((C29736H) null, this);
    }
}
