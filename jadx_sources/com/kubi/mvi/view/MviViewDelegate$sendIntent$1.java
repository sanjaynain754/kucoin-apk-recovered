package com.kubi.mvi.view;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.mvi.state.InterfaceC19282d;
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

/* JADX INFO: compiled from: MviViewDelegate.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\u0014\b\u0002\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, m90084d2 = {"Lcom/kubi/mvi/state/d;", "I", "Lcom/kubi/mvi/state/f;", ExifInterface.LATITUDE_SOUTH, "Lcom/kubi/mvi/state/BaseStateVM;", "VM", "", "<anonymous>", "()V"}, m90085k = 3, m90086mv = {1, 9, 0})
@DebugMetadata(m90121c = "com.kubi.mvi.view.MviViewDelegate$sendIntent$1", m90122f = "MviViewDelegate.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MviViewDelegate$sendIntent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

    /* JADX INFO: Incorrect field signature: TI; */
    /* JADX INFO: renamed from: $i */
    final /* synthetic */ InterfaceC19282d f35712$i;
    int label;
    final /* synthetic */ MviViewDelegate<I, S, VM> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lcom/kubi/mvi/view/MviViewDelegate<TI;TS;TVM;>;TI;Lkotlin/coroutines/Continuation<-Lcom/kubi/mvi/view/MviViewDelegate$sendIntent$1;>;)V */
    public MviViewDelegate$sendIntent$1(MviViewDelegate mviViewDelegate, InterfaceC19282d interfaceC19282d, Continuation continuation) {
        super(1, continuation);
        this.this$0 = mviViewDelegate;
        this.f35712$i = interfaceC19282d;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new MviViewDelegate$sendIntent$1(this.this$0, this.f35712$i, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
        return ((MviViewDelegate$sendIntent$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.m42713o().sendIntent(this.f35712$i);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
