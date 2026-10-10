package com.kubi.mvi.state;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: StateDelegate.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mvi.state.StateDelegate$emitTask$1", m90122f = "StateDelegate.kt", m90123i = {}, m90124l = {55}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class StateDelegate$emitTask$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $block;
    final /* synthetic */ boolean $mainThread;
    final /* synthetic */ boolean $sequence;
    int label;
    final /* synthetic */ StateDelegate<I, S, VM> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StateDelegate$emitTask$1(StateDelegate<I, S, VM> stateDelegate, boolean z11, boolean z12, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super StateDelegate$emitTask$1> continuation) {
        super(2, continuation);
        this.this$0 = stateDelegate;
        this.$sequence = z11;
        this.$mainThread = z12;
        this.$block = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StateDelegate$emitTask$1(this.this$0, this.$sequence, this.$mainThread, this.$block, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((StateDelegate$emitTask$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            TaskFlow taskFlowM42633v = this.this$0.m42633v();
            boolean z11 = this.$sequence;
            boolean z12 = this.$mainThread;
            Function1<Continuation<? super Unit>, Object> function1 = this.$block;
            this.label = 1;
            if (taskFlowM42633v.m42657g(z11, z12, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
