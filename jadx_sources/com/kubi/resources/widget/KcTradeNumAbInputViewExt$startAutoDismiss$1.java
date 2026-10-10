package com.kubi.resources.widget;

import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KcTradeNumInputViewExt.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.resources.widget.KcTradeNumAbInputViewExt$startAutoDismiss$1", m90122f = "KcTradeNumInputViewExt.kt", m90123i = {}, m90124l = {43}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KcTradeNumAbInputViewExt$startAutoDismiss$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $durationMs;
    final /* synthetic */ KcTradeNumAbInputView $this_startAutoDismiss;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KcTradeNumAbInputViewExt$startAutoDismiss$1(long j11, KcTradeNumAbInputView kcTradeNumAbInputView, Continuation<? super KcTradeNumAbInputViewExt$startAutoDismiss$1> continuation) {
        super(2, continuation);
        this.$durationMs = j11;
        this.$this_startAutoDismiss = kcTradeNumAbInputView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KcTradeNumAbInputViewExt$startAutoDismiss$1(this.$durationMs, this.$this_startAutoDismiss, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KcTradeNumAbInputViewExt$startAutoDismiss$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            long j11 = this.$durationMs;
            this.label = 1;
            if (DelayKt.m90350b(j11, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.$this_startAutoDismiss.setTipsVisible(false);
        return Unit.INSTANCE;
    }
}
