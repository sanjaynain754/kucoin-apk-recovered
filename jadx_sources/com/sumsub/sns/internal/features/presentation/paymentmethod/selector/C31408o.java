package com.sumsub.sns.internal.features.presentation.paymentmethod.selector;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.selector.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31408o extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63641a;

    /* JADX INFO: renamed from: b */
    public int f63642b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31409p f63643c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31408o(C31409p c31409p, Continuation continuation) {
        super(continuation);
        this.f63643c = c31409p;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63641a = obj;
        this.f63642b |= Integer.MIN_VALUE;
        return this.f63643c.emit(null, this);
    }
}
