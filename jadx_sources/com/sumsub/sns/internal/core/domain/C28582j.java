package com.sumsub.sns.internal.core.domain;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.domain.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28582j extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f58193a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC28584k f58194b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28582j(InterfaceC28584k interfaceC28584k, Continuation continuation) {
        super(2, continuation);
        this.f58194b = interfaceC28584k;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28582j(this.f58194b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C28582j(this.f58194b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f58193a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC28584k interfaceC28584k = this.f58194b;
        this.f58193a = 1;
        Object objMo69411a = interfaceC28584k.mo69411a(this);
        if (objMo69411a == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objMo69411a;
    }
}
