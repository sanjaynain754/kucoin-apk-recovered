package com.sumsub.sns.internal.features.domain.mrtd;

import com.sumsub.sns.internal.features.data.model.common.C28988C2;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.remote.C29307Y0;
import com.sumsub.sns.internal.features.data.model.common.remote.C29655v0;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.mrtd.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30249h extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C29655v0 f60812a;

    /* JADX INFO: renamed from: b */
    public C28988C2 f60813b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f60814c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30251i f60815d;

    /* JADX INFO: renamed from: e */
    public int f60816e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30249h(C30251i c30251i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60815d = c30251i;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60814c = obj;
        this.f60816e |= Integer.MIN_VALUE;
        return this.f60815d.m70157a((C29307Y0) null, (Document) null, false, (ContinuationImpl) this);
    }
}
