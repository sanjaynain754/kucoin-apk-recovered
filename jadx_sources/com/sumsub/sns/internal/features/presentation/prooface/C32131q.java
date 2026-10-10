package com.sumsub.sns.internal.features.presentation.prooface;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32131q extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65410a;

    /* JADX INFO: renamed from: b */
    public int f65411b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32135r f65412c;

    /* JADX INFO: renamed from: d */
    public InterfaceC41635f f65413d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32131q(C32135r c32135r, Continuation continuation) {
        super(continuation);
        this.f65412c = c32135r;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65410a = obj;
        this.f65411b |= Integer.MIN_VALUE;
        return this.f65412c.emit(null, this);
    }
}
