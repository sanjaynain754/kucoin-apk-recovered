package com.kubi.mvi.common;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.tensorflow.lite.schema.BuiltinOperator;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MviEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mvi.common.MviExKt$repeatCall$2", m90122f = "MviEx.kt", m90123i = {}, m90124l = {BuiltinOperator.RIGHT_SHIFT}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MviExKt$repeatCall$2 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Integer, Continuation<? super Unit>, Object> $action;
    /* synthetic */ int I$0;
    int label;

    @Nullable
    public final Object invoke(int i11, @Nullable Continuation<? super Unit> continuation) {
        return ((MviExKt$repeatCall$2) create(Integer.valueOf(i11), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MviExKt$repeatCall$2(Function2<? super Integer, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super MviExKt$repeatCall$2> continuation) {
        super(2, continuation);
        this.$action = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        MviExKt$repeatCall$2 mviExKt$repeatCall$2 = new MviExKt$repeatCall$2(this.$action, continuation);
        mviExKt$repeatCall$2.I$0 = ((Number) obj).intValue();
        return mviExKt$repeatCall$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
        return invoke(num.intValue(), continuation);
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
            int i12 = this.I$0;
            Function2<Integer, Continuation<? super Unit>, Object> function2 = this.$action;
            Integer numBoxInt = Boxing.boxInt(i12);
            this.label = 1;
            if (function2.invoke(numBoxInt, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
