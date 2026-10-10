package com.kubi.home.cardsconfig;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: CardsConfigFragment.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.cardsconfig.CardsConfigFragment$onViewCreated$3$1$3$1", m90122f = "CardsConfigFragment.kt", m90123i = {0}, m90124l = {146}, m90125m = "invokeSuspend", m90126n = {"$this$flow"}, m90127s = {"L$0"})
public final class CardsConfigFragment$onViewCreated$3$1$3$1 extends SuspendLambda implements Function2<InterfaceC41635f<? super Unit>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CardsConfigFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsConfigFragment$onViewCreated$3$1$3$1(CardsConfigFragment cardsConfigFragment, Continuation<? super CardsConfigFragment$onViewCreated$3$1$3$1> continuation) {
        super(2, continuation);
        this.this$0 = cardsConfigFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CardsConfigFragment$onViewCreated$3$1$3$1 cardsConfigFragment$onViewCreated$3$1$3$1 = new CardsConfigFragment$onViewCreated$3$1$3$1(this.this$0, continuation);
        cardsConfigFragment$onViewCreated$3$1$3$1.L$0 = obj;
        return cardsConfigFragment$onViewCreated$3$1$3$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41635f<? super Unit> interfaceC41635f, Continuation<? super Unit> continuation) {
        return ((CardsConfigFragment$onViewCreated$3$1$3$1) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41635f interfaceC41635f = (InterfaceC41635f) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.m29025J3();
            Unit unit = Unit.INSTANCE;
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
            this.label = 1;
            if (interfaceC41635f.emit(unit, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
