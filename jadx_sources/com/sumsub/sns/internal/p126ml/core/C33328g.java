package com.sumsub.sns.internal.p126ml.core;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.coroutines.jvm.internal.SuspendFunction;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.core.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C33328g extends FunctionReferenceImpl implements Function2, SuspendFunction {
    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Function1) this.receiver).invoke((InterfaceC41709m0) obj);
    }

    public C33328g(Function1 function1) {
        super(2, function1, Intrinsics.Kotlin.class, "suspendConversion0", "runInTensorFlowContext$suspendConversion0(Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }
}
