package com.kubi.mvi.state;

import androidx.exifinterface.media.ExifInterface;
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
import p852kotlin.reflect.KProperty1;

/* JADX INFO: compiled from: Status.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u008a@"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, ExifInterface.LATITUDE_SOUTH}, m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mvi.state.MviViewStatusDelegate$bindData$1", m90122f = "Status.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MviViewStatusDelegate$bindData$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<A, Continuation<? super Unit>, Object> $action;
    final /* synthetic */ KProperty1<S, A> $kProperty1;
    int label;
    final /* synthetic */ MviViewStatusDelegate<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MviViewStatusDelegate$bindData$1(MviViewStatusDelegate<S> mviViewStatusDelegate, KProperty1<S, ? extends A> kProperty1, Function2<? super A, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super MviViewStatusDelegate$bindData$1> continuation) {
        super(1, continuation);
        this.this$0 = mviViewStatusDelegate;
        this.$kProperty1 = kProperty1;
        this.$action = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new MviViewStatusDelegate$bindData$1(this.this$0, this.$kProperty1, this.$action, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
        return ((MviViewStatusDelegate$bindData$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            StatusKt.m42642b(this.this$0.m42713o(), this.this$0.getMviConfig(), this.$kProperty1, this.$action);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
