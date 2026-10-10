package com.kubi.home.common.card;

import com.kubi.kucoin.home.cards.BaseCardData;
import com.kubi.kucoin.home.cardsconfig.CardListRsp;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CardsViewModel.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.common.card.CardsViewModel$removeCard$1", m90122f = "CardsViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nCardsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardsViewModel.kt\ncom/kubi/home/common/card/CardsViewModel$removeCard$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n774#2:239\n865#2,2:240\n1#3:242\n*S KotlinDebug\n*F\n+ 1 CardsViewModel.kt\ncom/kubi/home/common/card/CardsViewModel$removeCard$1\n*L\n226#1:239\n226#1:240,2\n*E\n"})
public final class CardsViewModel$removeCard$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $code;
    int label;
    final /* synthetic */ CardsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsViewModel$removeCard$1(String str, CardsViewModel cardsViewModel, Continuation<? super CardsViewModel$removeCard$1> continuation) {
        super(2, continuation);
        this.$code = str;
        this.this$0 = cardsViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardsViewModel$removeCard$1(this.$code, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CardsViewModel$removeCard$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            HomeCardsRepository homeCardsRepository = HomeCardsRepository.f25606a;
            homeCardsRepository.m29069e(this.$code);
            CardListRsp cardListRspM29072i = homeCardsRepository.m29072i();
            List<CardListRsp.Card> cardList = cardListRspM29072i.getCardList();
            String str = this.$code;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : cardList) {
                if (!Intrinsics.areEqual(((CardListRsp.Card) obj2).getCode(), str)) {
                    arrayList.add(obj2);
                }
            }
            cardListRspM29072i.setCardList(CollectionsKt.toList(arrayList));
            HomeCardsRepository homeCardsRepository2 = HomeCardsRepository.f25606a;
            homeCardsRepository2.m29081s(cardListRspM29072i, false);
            homeCardsRepository2.m29067c();
            this.this$0.f25603W.add(this.$code);
            homeCardsRepository2.m29079q(this.$code);
            List<BaseCardData> listM29075l = homeCardsRepository2.m29075l();
            if (listM29075l != null) {
                this.this$0.f25604X.postValue(listM29075l);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
