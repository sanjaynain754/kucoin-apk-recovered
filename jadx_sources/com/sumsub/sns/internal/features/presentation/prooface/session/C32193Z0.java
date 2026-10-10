package com.sumsub.sns.internal.features.presentation.prooface.session;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.Z0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32193Z0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65563a;

    /* JADX INFO: renamed from: b */
    public int f65564b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32196a1 f65565c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32193Z0(C32196a1 c32196a1, Continuation continuation) {
        super(continuation);
        this.f65565c = c32196a1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65563a = obj;
        this.f65564b |= Integer.MIN_VALUE;
        return this.f65565c.emit(null, this);
    }
}
