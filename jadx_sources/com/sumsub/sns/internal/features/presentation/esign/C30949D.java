package com.sumsub.sns.internal.features.presentation.esign;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.D */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30949D extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f62524a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f62525b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30997n0 f62526c;

    /* JADX INFO: renamed from: d */
    public int f62527d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30949D(C30997n0 c30997n0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f62526c = c30997n0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62525b = obj;
        this.f62527d |= Integer.MIN_VALUE;
        return this.f62526c.m70543a((String) null, this);
    }
}
