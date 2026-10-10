package com.kubi.unify.unify.common.order.delegate;

import com.kubi.kumex.data.trade.model.OrdersPageEntity;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: IOrderSocketApiDelegate.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.unify.common.order.delegate.IOrderSocketApiDelegate$map2OrderEntityObs$1", m90122f = "IOrderSocketApiDelegate.kt", m90123i = {0}, m90124l = {75}, m90125m = "invokeSuspend", m90126n = {"$this$onStart"}, m90127s = {"L$0"})
public final class IOrderSocketApiDelegate$map2OrderEntityObs$1 extends SuspendLambda implements Function2<InterfaceC41635f<? super Object>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    public IOrderSocketApiDelegate$map2OrderEntityObs$1(Continuation<? super IOrderSocketApiDelegate$map2OrderEntityObs$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41635f<? super Object> interfaceC41635f, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC41635f<Object>) interfaceC41635f, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IOrderSocketApiDelegate$map2OrderEntityObs$1 iOrderSocketApiDelegate$map2OrderEntityObs$1 = new IOrderSocketApiDelegate$map2OrderEntityObs$1(continuation);
        iOrderSocketApiDelegate$map2OrderEntityObs$1.L$0 = obj;
        return iOrderSocketApiDelegate$map2OrderEntityObs$1;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41635f<Object> interfaceC41635f, Continuation<? super Unit> continuation) {
        return ((IOrderSocketApiDelegate$map2OrderEntityObs$1) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41635f interfaceC41635f = (InterfaceC41635f) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            OrdersPageEntity ordersPageEntity = new OrdersPageEntity(null, -1L, 1, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
            this.label = 1;
            if (interfaceC41635f.emit(ordersPageEntity, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
