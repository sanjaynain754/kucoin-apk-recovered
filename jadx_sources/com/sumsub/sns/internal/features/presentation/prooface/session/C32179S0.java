package com.sumsub.sns.internal.features.presentation.prooface.session;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.S0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32179S0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65534a;

    /* JADX INFO: renamed from: b */
    public int f65535b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32181T0 f65536c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32179S0(C32181T0 c32181t0, Continuation continuation) {
        super(continuation);
        this.f65536c = c32181t0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65534a = obj;
        this.f65535b |= Integer.MIN_VALUE;
        return this.f65536c.emit(null, this);
    }
}
