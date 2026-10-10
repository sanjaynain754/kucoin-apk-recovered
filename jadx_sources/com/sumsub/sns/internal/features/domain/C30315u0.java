package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.u0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30315u0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60944a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30319v0 f60945b;

    /* JADX INFO: renamed from: c */
    public int f60946c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30315u0(C30319v0 c30319v0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60945b = c30319v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60944a = obj;
        this.f60946c |= Integer.MIN_VALUE;
        return this.f60945b.m70185a((C30313t0) null, (AbstractC29172p) null, (String) null, this);
    }
}
