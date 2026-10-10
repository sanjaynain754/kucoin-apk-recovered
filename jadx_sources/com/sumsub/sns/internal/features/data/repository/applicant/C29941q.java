package com.sumsub.sns.internal.features.data.repository.applicant;

import com.sumsub.sns.internal.features.data.model.common.remote.C29429o1;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.applicant.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29941q extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C29429o1 f60098a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60099b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29950z f60100c;

    /* JADX INFO: renamed from: d */
    public int f60101d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29941q(C29950z c29950z, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60100c = c29950z;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60099b = obj;
        this.f60101d |= Integer.MIN_VALUE;
        return this.f60100c.m70010a((C29429o1) null, this);
    }
}
