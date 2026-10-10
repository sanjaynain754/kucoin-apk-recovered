package com.sumsub.sns.internal.features.data.repository.applicant;

import com.sumsub.sns.internal.features.data.model.esign.C29733E;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.applicant.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29934j extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C29733E f60072a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60073b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29950z f60074c;

    /* JADX INFO: renamed from: d */
    public int f60075d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29934j(C29950z c29950z, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60074c = c29950z;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60073b = obj;
        this.f60075d |= Integer.MIN_VALUE;
        return this.f60074c.m70011a((C29733E) null, this);
    }
}
