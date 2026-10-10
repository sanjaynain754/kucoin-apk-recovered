package com.sumsub.sns.core.presentation.base;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.C0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28053C0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC28073M0 f57209a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f57210b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC28073M0 f57211c;

    /* JADX INFO: renamed from: d */
    public int f57212d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28053C0(AbstractC28073M0 abstractC28073M0, Continuation continuation) {
        super(continuation);
        this.f57211c = abstractC28073M0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f57210b = obj;
        this.f57212d |= Integer.MIN_VALUE;
        return AbstractC28073M0.getStrings$suspendImpl(this.f57211c, this);
    }
}
