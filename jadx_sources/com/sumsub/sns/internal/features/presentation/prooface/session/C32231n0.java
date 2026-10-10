package com.sumsub.sns.internal.features.presentation.prooface.session;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.SuspendFunction;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.n0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C32231n0 extends FunctionReferenceImpl implements Function1, SuspendFunction {
    public C32231n0(C32239r0 c32239r0) {
        super(1, c32239r0, C32239r0.class, "executeSessionSteps", "executeSessionSteps(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return C32239r0.m71064a((C32239r0) this.receiver, (Continuation) obj);
    }
}
