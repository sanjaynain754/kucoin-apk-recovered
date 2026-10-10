package com.sumsub.sns.internal.features.presentation.camera;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.U */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30357U extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61046a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC30359W f61047b;

    /* JADX INFO: renamed from: c */
    public int f61048c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30357U(AbstractC30359W abstractC30359W, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61047b = abstractC30359W;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61046a = obj;
        this.f61048c |= Integer.MIN_VALUE;
        return this.f61047b.m70245a(this);
    }
}
