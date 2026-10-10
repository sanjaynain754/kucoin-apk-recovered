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
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: CardsViewModel.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.common.card.CardsViewModel$loadCards$1", m90122f = "CardsViewModel.kt", m90123i = {1, 2}, m90124l = {82, 89, 91, 101}, m90125m = "invokeSuspend", m90126n = {"cardConfig", "cardConfig"}, m90127s = {"L$0", "L$0"})
public final class CardsViewModel$loadCards$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $blockStartUp;
    final /* synthetic */ Ref.BooleanRef $hasShowCacheCards;
    final /* synthetic */ boolean $updateConfig;
    Object L$0;
    int label;
    final /* synthetic */ CardsViewModel this$0;

    /* JADX WARN: Code duplicated, block: B:35:0x00a4  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90350b(500, r11) == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
    
        if (r12.m29058v(r0, r11) == r2) goto L37;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CardListRsp cardListRsp;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$updateConfig) {
                HomeCardsRepository homeCardsRepository = HomeCardsRepository.f25606a;
                this.label = 1;
                obj = homeCardsRepository.m29078p(this);
                if (obj != coroutine_suspended) {
                }
            } else {
                CardsViewModel cardsViewModel = this.this$0;
                boolean z11 = this.$updateConfig;
                this.L$0 = null;
                this.label = 4;
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i11 == 2) {
            cardListRsp = (CardListRsp) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = SpillingKt.nullOutSpilledVariable(cardListRsp);
            this.label = 3;
        } else if (i11 == 3) {
            ResultKt.throwOnFailure(obj);
            C12572a.m23695d("com.kubi.home.event.HomeEvent:shimmer_show", Boxing.boxBoolean(false), 0L, 4, null);
            if (!this.$hasShowCacheCards.element) {
                this.this$0.m29061y();
            }
            CardsViewModel cardsViewModel2 = this.this$0;
            boolean z12 = this.$updateConfig;
            this.L$0 = null;
            this.label = 4;
        } else {
            if (i11 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        CardListRsp cardListRsp2 = (CardListRsp) obj;
        if (cardListRsp2 == null) {
            this.this$0.f25604X.postValue(CollectionsKt.mutableListOf(new EmptyCardData()));
            return Unit.INSTANCE;
        }
        if (this.$blockStartUp) {
            CardsViewModel cardsViewModel3 = this.this$0;
            this.L$0 = SpillingKt.nullOutSpilledVariable(cardListRsp2);
            this.label = 2;
            if (cardsViewModel3.m29054r(this) != coroutine_suspended) {
                cardListRsp = cardListRsp2;
                this.L$0 = SpillingKt.nullOutSpilledVariable(cardListRsp);
                this.label = 3;
            }
        } else {
            CardsViewModel cardsViewModel4 = this.this$0;
            boolean z13 = this.$updateConfig;
            this.L$0 = null;
            this.label = 4;
        }
        return coroutine_suspended;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsViewModel$loadCards$1(boolean z11, CardsViewModel cardsViewModel, boolean z12, Ref.BooleanRef booleanRef, Continuation<? super CardsViewModel$loadCards$1> continuation) {
        super(2, continuation);
        this.$updateConfig = z11;
        this.this$0 = cardsViewModel;
        this.$blockStartUp = z12;
        this.$hasShowCacheCards = booleanRef;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardsViewModel$loadCards$1(this.$updateConfig, this.this$0, this.$blockStartUp, this.$hasShowCacheCards, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CardsViewModel$loadCards$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
