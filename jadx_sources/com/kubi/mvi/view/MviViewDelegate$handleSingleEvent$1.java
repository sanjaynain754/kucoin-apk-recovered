package com.kubi.mvi.view;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.mvi.common.C19243e;
import com.kubi.mvi.event.SingleEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MviViewDelegate.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\u0014\b\u0002\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u008a@¢\u0006\u0004\b\t\u0010\n"}, m90084d2 = {"Lcom/kubi/mvi/state/d;", "I", "Lcom/kubi/mvi/state/f;", ExifInterface.LATITUDE_SOUTH, "Lcom/kubi/mvi/state/BaseStateVM;", "VM", "Ldr/a;", "it", "", "<anonymous>", "(Ldr/a;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
@DebugMetadata(m90121c = "com.kubi.mvi.view.MviViewDelegate$handleSingleEvent$1", m90122f = "MviViewDelegate.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MviViewDelegate$handleSingleEvent$1 extends SuspendLambda implements Function2<InterfaceC36952a, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<InterfaceC36952a, Unit> $singleIntentHandler;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MviViewDelegate<I, S, VM> this$0;

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC36952a interfaceC36952a, @Nullable Continuation<? super Unit> continuation) {
        return ((MviViewDelegate$handleSingleEvent$1) create(interfaceC36952a, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MviViewDelegate$handleSingleEvent$1(MviViewDelegate<I, S, VM> mviViewDelegate, Function1<? super InterfaceC36952a, Unit> function1, Continuation<? super MviViewDelegate$handleSingleEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = mviViewDelegate;
        this.$singleIntentHandler = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        MviViewDelegate$handleSingleEvent$1 mviViewDelegate$handleSingleEvent$1 = new MviViewDelegate$handleSingleEvent$1(this.this$0, this.$singleIntentHandler, continuation);
        mviViewDelegate$handleSingleEvent$1.L$0 = obj;
        return mviViewDelegate$handleSingleEvent$1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC36952a interfaceC36952a = (InterfaceC36952a) this.L$0;
            C19243e.m42536e("handleSingleEvent->" + interfaceC36952a, this.this$0.getMviConfig().m42567g());
            if (interfaceC36952a instanceof SingleEvent.C19253i) {
                this.this$0.m42705B();
            } else if (interfaceC36952a instanceof SingleEvent.C19248d) {
                this.this$0.m42722x();
            } else if (interfaceC36952a instanceof SingleEvent.C19250f) {
                this.this$0.m42724z(((SingleEvent.C19250f) interfaceC36952a).m42543a());
            } else if (interfaceC36952a instanceof SingleEvent.C19251g) {
                this.this$0.m42704A(((SingleEvent.C19251g) interfaceC36952a).m42544a());
            } else if (interfaceC36952a instanceof SingleEvent.C19249e) {
                this.this$0.m42723y();
            } else {
                Function1<InterfaceC36952a, Unit> function1 = this.$singleIntentHandler;
                if (function1 != null) {
                    function1.invoke(interfaceC36952a);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
