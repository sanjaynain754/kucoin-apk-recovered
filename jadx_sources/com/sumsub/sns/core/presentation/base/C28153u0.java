package com.sumsub.sns.core.presentation.base;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.u0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28153u0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57395a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC28073M0 f57396b;

    /* JADX INFO: renamed from: c */
    public int f57397c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28153u0(AbstractC28073M0 abstractC28073M0, Continuation continuation) {
        super(continuation);
        this.f57396b = abstractC28073M0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f57395a = obj;
        this.f57397c |= Integer.MIN_VALUE;
        return this.f57396b.awaitStringsReady(this);
    }
}
