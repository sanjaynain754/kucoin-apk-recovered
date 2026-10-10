package com.sumsub.sns.internal.features.presentation.prooface.session;

import kotlinx.coroutines.flow.C41636g;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.SuspendFunction;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.o0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C32233o0 extends FunctionReferenceImpl implements Function1, SuspendFunction {
    public C32233o0(Object obj) {
        super(1, obj, C32208e1.class, "awaitTerminalState", "awaitTerminalState(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return C41636g.m90882F(C41636g.m90881E(((C32208e1) this.receiver).f65603a), (Continuation) obj);
    }
}
