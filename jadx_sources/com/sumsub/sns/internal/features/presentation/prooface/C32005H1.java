package com.sumsub.sns.internal.features.presentation.prooface;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.H1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32005H1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65061a;

    /* JADX INFO: renamed from: b */
    public int f65062b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32008I1 f65063c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32005H1(C32008I1 c32008i1, Continuation continuation) {
        super(continuation);
        this.f65063c = c32008i1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65061a = obj;
        this.f65062b |= Integer.MIN_VALUE;
        return this.f65063c.emit(null, this);
    }
}
