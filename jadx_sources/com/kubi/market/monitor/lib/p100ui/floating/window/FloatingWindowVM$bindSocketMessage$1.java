package com.kubi.market.monitor.lib.p100ui.floating.window;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FloatingWindowVM.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.window.FloatingWindowVM$bindSocketMessage$1", m90122f = "FloatingWindowVM.kt", m90123i = {}, m90124l = {235}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FloatingWindowVM$bindSocketMessage$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ FloatingWindowVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingWindowVM$bindSocketMessage$1(FloatingWindowVM floatingWindowVM, Continuation<? super FloatingWindowVM$bindSocketMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = floatingWindowVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FloatingWindowVM$bindSocketMessage$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FloatingWindowVM$bindSocketMessage$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FloatingWindowVM floatingWindowVM;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                floatingWindowVM = (FloatingWindowVM) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            this.this$0.m41087g0();
            FloatingWindowVM floatingWindowVM2 = this.this$0;
            this.L$0 = floatingWindowVM2;
            this.label = 1;
            Object objM41080Y = floatingWindowVM2.m41080Y(this);
            if (objM41080Y == coroutine_suspended) {
                return coroutine_suspended;
            }
            floatingWindowVM = floatingWindowVM2;
            obj = objM41080Y;
        }
        floatingWindowVM.f34454g0 = (String) obj;
        String str = this.this$0.f34454g0;
        if (str != null) {
            this.this$0.m41073N(str);
        }
        return Unit.INSTANCE;
    }
}
