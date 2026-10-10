package com.sumsub.sns.internal.features.presentation.prooface.session;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.W0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32187W0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65549a;

    /* JADX INFO: renamed from: b */
    public int f65550b;

    /* JADX INFO: renamed from: c */
    public InterfaceC41635f f65551c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32189X0 f65552d;

    /* JADX INFO: renamed from: e */
    public C32160I0 f65553e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32187W0(C32189X0 c32189x0, Continuation continuation) {
        super(continuation);
        this.f65552d = c32189x0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65549a = obj;
        this.f65550b |= Integer.MIN_VALUE;
        return this.f65552d.emit(null, this);
    }
}
