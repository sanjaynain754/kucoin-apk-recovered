package com.sumsub.sns.core.presentation.base;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.b0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28104b0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57309a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC28142p0 f57310b;

    /* JADX INFO: renamed from: c */
    public int f57311c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28104b0(AbstractC28142p0 abstractC28142p0, Continuation continuation) {
        super(continuation);
        this.f57310b = abstractC28142p0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f57309a = obj;
        this.f57311c |= Integer.MIN_VALUE;
        return AbstractC28142p0.getStrings$suspendImpl(this.f57310b, this);
    }
}
