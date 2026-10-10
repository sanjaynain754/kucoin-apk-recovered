package com.sumsub.sns.internal.p126ml.core;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.core.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33325d extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC33329h f67953a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f67954b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC33329h f67955c;

    /* JADX INFO: renamed from: d */
    public int f67956d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33325d(AbstractC33329h abstractC33329h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f67955c = abstractC33329h;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f67954b = obj;
        this.f67956d |= Integer.MIN_VALUE;
        return AbstractC33329h.m71648a(this.f67955c, (ContinuationImpl) this);
    }
}
