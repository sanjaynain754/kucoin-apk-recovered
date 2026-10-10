package com.kubi.home.common.card;

import com.kubi.event.api.C12572a;
import com.kubi.home.empty.EmptyCardData;
import com.kubi.kucoin.home.cardsconfig.CardListRsp;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: CardsViewModel.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.common.card.CardsViewModel$pullRefresh$1", m90122f = "CardsViewModel.kt", m90123i = {1}, m90124l = {109, 113}, m90125m = "invokeSuspend", m90126n = {"cardConfig"}, m90127s = {"L$0"})
public final class CardsViewModel$pullRefresh$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ CardsViewModel this$0;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if (r2.m29058v(true, r8) == r1) goto L18;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            HomeCardsRepository homeCardsRepository = HomeCardsRepository.f25606a;
            this.label = 1;
            obj = homeCardsRepository.m29078p(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        C12572a.m23695d("EVENT_FINISH_REFRESH_LOAD", null, 0L, 6, null);
        return Unit.INSTANCE;
        CardListRsp cardListRsp = (CardListRsp) obj;
        if (cardListRsp == null) {
            this.this$0.f25604X.postValue(CollectionsKt.mutableListOf(new EmptyCardData()));
        } else {
            CardsViewModel cardsViewModel = this.this$0;
            this.L$0 = SpillingKt.nullOutSpilledVariable(cardListRsp);
            this.label = 2;
        }
        C12572a.m23695d("EVENT_FINISH_REFRESH_LOAD", null, 0L, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsViewModel$pullRefresh$1(CardsViewModel cardsViewModel, Continuation<? super CardsViewModel$pullRefresh$1> continuation) {
        super(2, continuation);
        this.this$0 = cardsViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardsViewModel$pullRefresh$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CardsViewModel$pullRefresh$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
