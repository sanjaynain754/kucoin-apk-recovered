package com.sumsub.sns.core.presentation.base;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.x0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28159x0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57404a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC28073M0 f57405b;

    /* JADX INFO: renamed from: c */
    public int f57406c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28159x0(AbstractC28073M0 abstractC28073M0, Continuation continuation) {
        super(continuation);
        this.f57405b = abstractC28073M0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f57404a = obj;
        this.f57406c |= Integer.MIN_VALUE;
        return this.f57405b.awaitViewModelPrepared(this);
    }
}
