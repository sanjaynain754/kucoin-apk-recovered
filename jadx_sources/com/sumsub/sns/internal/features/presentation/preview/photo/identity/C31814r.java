package com.sumsub.sns.internal.features.presentation.preview.photo.identity;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.identity.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31814r extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64644a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31816t f64645b;

    /* JADX INFO: renamed from: c */
    public int f64646c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31814r(C31816t c31816t, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f64645b = c31816t;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f64644a = obj;
        this.f64646c |= Integer.MIN_VALUE;
        return this.f64645b.onPrepare(this);
    }
}
