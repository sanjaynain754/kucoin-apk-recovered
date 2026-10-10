package com.sumsub.sns.internal.core.presentation.common;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.common.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28781n extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58536a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1 f58537b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28781n(Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f58537b = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28781n c28781n = new C28781n(this.f58537b, continuation);
        c28781n.f58536a = obj;
        return c28781n;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C28781n c28781n = new C28781n(this.f58537b, (Continuation) obj2);
        c28781n.f58536a = (InterfaceC28771f) obj;
        return c28781n.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC28771f interfaceC28771f = (InterfaceC28771f) this.f58536a;
        if (interfaceC28771f != null) {
            this.f58537b.invoke(interfaceC28771f);
        }
        return Unit.INSTANCE;
    }
}
