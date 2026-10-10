package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.D */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31516D extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63942a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31707h0 f63943b;

    /* JADX INFO: renamed from: c */
    public int f63944c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31516D(C31707h0 c31707h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63943b = c31707h0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63942a = obj;
        this.f63944c |= Integer.MIN_VALUE;
        return this.f63943b.m70809a(this);
    }
}
