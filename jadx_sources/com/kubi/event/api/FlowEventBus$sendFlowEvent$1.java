package com.kubi.event.api;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41668m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import pf.InterfaceC43461b;

/* JADX INFO: compiled from: FlowEventBus.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m90084d2 = {"Lpf/b;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 6, 0})
@DebugMetadata(m90121c = "com.kubi.event.api.FlowEventBus$sendFlowEvent$1", m90122f = "FlowEventBus.kt", m90123i = {}, m90124l = {59, 60}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FlowEventBus$sendFlowEvent$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $delay;

    /* JADX INFO: Incorrect field signature: TT; */
    final /* synthetic */ InterfaceC43461b $event;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (JTT;Lkotlin/coroutines/Continuation<-Lcom/kubi/event/api/FlowEventBus$sendFlowEvent$1;>;)V */
    public FlowEventBus$sendFlowEvent$1(long j11, InterfaceC43461b interfaceC43461b, Continuation continuation) {
        super(2, continuation);
        this.$delay = j11;
        this.$event = interfaceC43461b;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FlowEventBus$sendFlowEvent$1(this.$delay, this.$event, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
        return ((FlowEventBus$sendFlowEvent$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L15;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        long j11 = this.$delay;
        this.label = 1;
        if (DelayKt.m90350b(j11, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        InterfaceC41668m interfaceC41668m = FlowEventBus.mutableSharedFlow;
        InterfaceC43461b interfaceC43461b = this.$event;
        this.label = 2;
    }
}
