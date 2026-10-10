package com.sumsub.sns.internal.features.domain.ekyc;

import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.ekyc.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30160c extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f60599a;

    /* JADX INFO: renamed from: b */
    public String f60600b;

    /* JADX INFO: renamed from: c */
    public String f60601c;

    /* JADX INFO: renamed from: d */
    public C29983l f60602d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f60603e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C30161d f60604f;

    /* JADX INFO: renamed from: g */
    public int f60605g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30160c(C30161d c30161d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60604f = c30161d;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60603e = obj;
        this.f60605g |= Integer.MIN_VALUE;
        return this.f60604f.m70124a(null, null, null, this);
    }
}
