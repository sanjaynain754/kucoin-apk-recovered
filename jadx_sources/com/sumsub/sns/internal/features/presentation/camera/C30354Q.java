package com.sumsub.sns.internal.features.presentation.camera;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.Q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30354Q extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC30359W f61040a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f61041b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC30359W f61042c;

    /* JADX INFO: renamed from: d */
    public int f61043d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30354Q(AbstractC30359W abstractC30359W, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61042c = abstractC30359W;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61041b = obj;
        this.f61043d |= Integer.MIN_VALUE;
        return AbstractC30359W.m70243a(this.f61042c, this);
    }
}
