package com.sumsub.sns.internal.features.data.repository.applicant;

import com.sumsub.sns.internal.features.data.model.esign.C29742N;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.applicant.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29940p extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C29742N f60094a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60095b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29950z f60096c;

    /* JADX INFO: renamed from: d */
    public int f60097d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29940p(C29950z c29950z, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60096c = c29950z;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60095b = obj;
        this.f60097d |= Integer.MIN_VALUE;
        return this.f60096c.m70013a((C29742N) null, this);
    }
}
