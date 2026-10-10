package com.sumsub.sns.internal.features.data.repository.applicant;

import com.sumsub.sns.internal.features.data.model.common.C29069W2;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.applicant.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29946v extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C29069W2 f60118a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60119b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29950z f60120c;

    /* JADX INFO: renamed from: d */
    public int f60121d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29946v(C29950z c29950z, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60120c = c29950z;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60119b = obj;
        this.f60121d |= Integer.MIN_VALUE;
        return this.f60120c.m70008a((C29069W2) null, this);
    }
}
