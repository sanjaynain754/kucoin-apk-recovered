package com.sumsub.sns.internal.features.presentation.status;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32456y extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66167a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32403L f66168b;

    /* JADX INFO: renamed from: c */
    public int f66169c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32456y(C32403L c32403l, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66168b = c32403l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66167a = obj;
        this.f66169c |= Integer.MIN_VALUE;
        return this.f66168b.m71119a(this);
    }
}
