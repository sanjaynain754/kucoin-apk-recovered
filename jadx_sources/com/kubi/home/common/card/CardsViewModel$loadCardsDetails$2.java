package com.kubi.home.common.card;

import com.kubi.home.empty.EmptyCardData;
import com.kubi.kucoin.home.cards.BaseCardData;
import com.kubi.kucoin.home.cards.ExtensionKt;
import com.kubi.kucoin.home.cardsconfig.CardListRsp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.C41696j;
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
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CardsViewModel.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.common.card.CardsViewModel$loadCardsDetails$2", m90122f = "CardsViewModel.kt", m90123i = {0}, m90124l = {204}, m90125m = "invokeSuspend", m90126n = {"$this$withContext"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nCardsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardsViewModel.kt\ncom/kubi/home/common/card/CardsViewModel$loadCardsDetails$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,238:1\n774#2:239\n865#2,2:240\n1563#2:242\n1634#2,3:243\n*S KotlinDebug\n*F\n+ 1 CardsViewModel.kt\ncom/kubi/home/common/card/CardsViewModel$loadCardsDetails$2\n*L\n166#1:239\n166#1:240,2\n169#1:242\n169#1:243,3\n*E\n"})
public final class CardsViewModel$loadCardsDetails$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $updateConfig;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CardsViewModel this$0;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            List<CardListRsp.Card> cardList = HomeCardsRepository.f25606a.m29072i().getCardList();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : cardList) {
                CardListRsp.Card card = (CardListRsp.Card) obj2;
                if (ExtensionKt.m32183i(card) && !card.isCustomQuery()) {
                    arrayList.add(obj2);
                }
            }
            boolean z11 = this.$updateConfig;
            CardsViewModel cardsViewModel = this.this$0;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(C41696j.m91102b(interfaceC41709m0, null, null, new CardsViewModel$loadCardsDetails$2$2$1((CardListRsp.Card) it.next(), z11, cardsViewModel, null), 3, null));
            }
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.label = 1;
            if (AwaitKt.m90345a(arrayList2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        CardsViewModel.f25601Z = false;
        HomeCardsRepository homeCardsRepository = HomeCardsRepository.f25606a;
        homeCardsRepository.m29067c();
        List<BaseCardData> listM29075l = homeCardsRepository.m29075l();
        if (listM29075l == null || listM29075l.isEmpty()) {
            this.this$0.f25604X.postValue(CollectionsKt.mutableListOf(new EmptyCardData()));
        } else {
            this.this$0.f25604X.postValue(listM29075l);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsViewModel$loadCardsDetails$2(CardsViewModel cardsViewModel, boolean z11, Continuation<? super CardsViewModel$loadCardsDetails$2> continuation) {
        super(2, continuation);
        this.this$0 = cardsViewModel;
        this.$updateConfig = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CardsViewModel$loadCardsDetails$2 cardsViewModel$loadCardsDetails$2 = new CardsViewModel$loadCardsDetails$2(this.this$0, this.$updateConfig, continuation);
        cardsViewModel$loadCardsDetails$2.L$0 = obj;
        return cardsViewModel$loadCardsDetails$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CardsViewModel$loadCardsDetails$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
