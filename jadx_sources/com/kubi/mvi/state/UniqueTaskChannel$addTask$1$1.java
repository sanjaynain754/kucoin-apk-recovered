package com.kubi.mvi.state;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.channels.InterfaceC41565d;
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

/* JADX INFO: compiled from: UniqueTaskChannel.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
@DebugMetadata(m90121c = "com.kubi.mvi.state.UniqueTaskChannel$addTask$1$1", m90122f = "UniqueTaskChannel.kt", m90123i = {}, m90124l = {45}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UniqueTaskChannel$addTask$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ T $task;
    int label;
    final /* synthetic */ UniqueTaskChannel<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniqueTaskChannel$addTask$1$1(UniqueTaskChannel<T> uniqueTaskChannel, T t11, Continuation<? super UniqueTaskChannel$addTask$1$1> continuation) {
        super(2, continuation);
        this.this$0 = uniqueTaskChannel;
        this.$task = t11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UniqueTaskChannel$addTask$1$1(this.this$0, this.$task, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
        return ((UniqueTaskChannel$addTask$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41565d interfaceC41565d = this.this$0.channel;
            T t11 = this.$task;
            this.label = 1;
            if (interfaceC41565d.send(t11, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
