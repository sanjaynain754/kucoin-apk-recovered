package com.kubi.mvi.state;

import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty1;

/* JADX INFO: compiled from: StateDelegate.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mvi.state.StateDelegate$bindState$1", m90122f = "StateDelegate.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class StateDelegate$bindState$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<A, Continuation<? super Unit>, Object> $action;
    final /* synthetic */ KProperty1<S, A> $kProperty1;
    int label;
    final /* synthetic */ StateDelegate<I, S, VM> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StateDelegate$bindState$1(StateDelegate<I, S, VM> stateDelegate, KProperty1<S, ? extends A> kProperty1, Function2<? super A, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super StateDelegate$bindState$1> continuation) {
        super(1, continuation);
        this.this$0 = stateDelegate;
        this.$kProperty1 = kProperty1;
        this.$action = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new StateDelegate$bindState$1(this.this$0, this.$kProperty1, this.$action, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((StateDelegate$bindState$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            StateExKt.m42639a(this.this$0.m42634w(), this.this$0.getF35660a(), this.$kProperty1, this.$action);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
