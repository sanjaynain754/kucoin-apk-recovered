package com.sumsub.sns.core.presentation.base;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.B0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28051B0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC28073M0 f57204a;

    /* JADX INFO: renamed from: b */
    public String f57205b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f57206c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC28073M0 f57207d;

    /* JADX INFO: renamed from: e */
    public int f57208e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28051B0(AbstractC28073M0 abstractC28073M0, Continuation continuation) {
        super(continuation);
        this.f57207d = abstractC28073M0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f57206c = obj;
        this.f57208e |= Integer.MIN_VALUE;
        return AbstractC28073M0.getString$suspendImpl(this.f57207d, null, this);
    }
}
