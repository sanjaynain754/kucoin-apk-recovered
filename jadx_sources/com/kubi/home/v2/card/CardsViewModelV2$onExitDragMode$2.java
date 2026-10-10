package com.kubi.home.v2.card;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: CardsViewModelV2.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.v2.card.CardsViewModelV2$onExitDragMode$2", m90122f = "CardsViewModelV2.kt", m90123i = {}, m90124l = {343, 346}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class CardsViewModelV2$onExitDragMode$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CardsViewModelV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsViewModelV2$onExitDragMode$2(CardsViewModelV2 cardsViewModelV2, Continuation<? super CardsViewModelV2$onExitDragMode$2> continuation) {
        super(2, continuation);
        this.this$0 = cardsViewModelV2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardsViewModelV2$onExitDragMode$2(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CardsViewModelV2$onExitDragMode$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r5.m30761n0(r4) == r0) goto L19;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
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
        if (this.this$0.f26472X) {
            CardsViewModelV2 cardsViewModelV2 = this.this$0;
            this.label = 1;
            if (cardsViewModelV2.m30772y0(this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (this.this$0.f26471W) {
            CardsViewModelV2 cardsViewModelV3 = this.this$0;
            this.label = 2;
        }
        return Unit.INSTANCE;
    }
}
