package com.sumsub.sns.internal.features.presentation.main;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.g2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31267g2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC31275i2 f63336a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f63337b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC31275i2 f63338c;

    /* JADX INFO: renamed from: d */
    public int f63339d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31267g2(AbstractC31275i2 abstractC31275i2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63338c = abstractC31275i2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63337b = obj;
        this.f63339d |= Integer.MIN_VALUE;
        return AbstractC31275i2.m70663a(this.f63338c, this);
    }
}
