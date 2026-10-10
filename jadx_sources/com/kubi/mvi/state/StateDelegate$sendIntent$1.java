package com.kubi.mvi.state;

import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: StateDelegate.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mvi.state.StateDelegate$sendIntent$1", m90122f = "StateDelegate.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class StateDelegate$sendIntent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

    /* JADX INFO: Incorrect field signature: TI; */
    /* JADX INFO: renamed from: $i */
    final /* synthetic */ InterfaceC19282d f35667$i;
    int label;
    final /* synthetic */ StateDelegate<I, S, VM> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lcom/kubi/mvi/state/StateDelegate<TI;TS;TVM;>;TI;Lkotlin/coroutines/Continuation<-Lcom/kubi/mvi/state/StateDelegate$sendIntent$1;>;)V */
    public StateDelegate$sendIntent$1(StateDelegate stateDelegate, InterfaceC19282d interfaceC19282d, Continuation continuation) {
        super(1, continuation);
        this.this$0 = stateDelegate;
        this.f35667$i = interfaceC19282d;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new StateDelegate$sendIntent$1(this.this$0, this.f35667$i, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((StateDelegate$sendIntent$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.m42634w().sendIntent(this.f35667$i);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
