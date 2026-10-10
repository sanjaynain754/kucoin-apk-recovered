package com.sumsub.sns.core.presentation.base;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.A0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28049A0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC28073M0 f57192a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f57193b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC28073M0 f57194c;

    /* JADX INFO: renamed from: d */
    public int f57195d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28049A0(AbstractC28073M0 abstractC28073M0, Continuation continuation) {
        super(continuation);
        this.f57194c = abstractC28073M0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f57193b = obj;
        this.f57195d |= Integer.MIN_VALUE;
        return AbstractC28073M0.getConfig$suspendImpl(this.f57194c, this);
    }
}
