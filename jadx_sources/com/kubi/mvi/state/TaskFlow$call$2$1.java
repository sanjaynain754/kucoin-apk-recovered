package com.kubi.mvi.state;

import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TaskFlow.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
@DebugMetadata(m90121c = "com.kubi.mvi.state.TaskFlow$call$2$1", m90122f = "TaskFlow.kt", m90123i = {}, m90124l = {71}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TaskFlow$call$2$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ C19298t $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFlow$call$2$1(C19298t c19298t, Continuation<? super TaskFlow$call$2$1> continuation) {
        super(2, continuation);
        this.$it = c19298t;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TaskFlow$call$2$1(this.$it, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
        return ((TaskFlow$call$2$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
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
            Function1<Continuation<? super Unit>, Object> function1M42674a = this.$it.m42674a();
            this.label = 1;
            if (function1M42674a.invoke(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
