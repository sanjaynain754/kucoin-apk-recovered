package com.kubi.home.v2.card;

import androidx.lifecycle.ViewModelKt;
import com.kubi.home.config.HomeFeedTab;
import com.kubi.kucoin.home.p090v2.cardsconfig.CardListRspV2;
import com.kubi.sdk.util.StartupTrace;
import com.tencent.bugly.proguard.InterfaceC33568bf;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import p233ej.C37201i;
import p502oj.C43101f;
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
import ro.C44128b;

/* JADX INFO: compiled from: CardsViewModelV2.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.v2.card.CardsViewModelV2$loadCards$1", m90122f = "CardsViewModelV2.kt", m90123i = {1, 2, 3}, m90124l = {197, 207, 210, InterfaceC33568bf.f69245q}, m90125m = "invokeSuspend", m90126n = {"cardConfig", "cardConfig", "cardConfig"}, m90127s = {"L$0", "L$0", "L$0"})
@SourceDebugExtension({"SMAP\nCardsViewModelV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardsViewModelV2.kt\ncom/kubi/home/v2/card/CardsViewModelV2$loadCards$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,651:1\n774#2:652\n865#2,2:653\n*S KotlinDebug\n*F\n+ 1 CardsViewModelV2.kt\ncom/kubi/home/v2/card/CardsViewModelV2$loadCards$1\n*L\n217#1:652\n217#1:653,2\n*E\n"})
public final class CardsViewModelV2$loadCards$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $blockStartUp;
    Object L$0;
    int label;
    final /* synthetic */ CardsViewModelV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsViewModelV2$loadCards$1(CardsViewModelV2 cardsViewModelV2, boolean z11, Continuation<? super CardsViewModelV2$loadCards$1> continuation) {
        super(2, continuation);
        this.this$0 = cardsViewModelV2;
        this.$blockStartUp = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardsViewModelV2$loadCards$1(this.this$0, this.$blockStartUp, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CardsViewModelV2$loadCards$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0094 A[PHI: r1
      0x0094: PHI (r1v4 com.kubi.kucoin.home.v2.cardsconfig.CardListRspV2) = 
      (r1v3 com.kubi.kucoin.home.v2.cardsconfig.CardListRspV2)
      (r1v3 com.kubi.kucoin.home.v2.cardsconfig.CardListRspV2)
      (r1v11 com.kubi.kucoin.home.v2.cardsconfig.CardListRspV2)
     binds: [B:22:0x0081, B:24:0x0091, B:12:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a5 A[PHI: r1
      0x00a5: PHI (r1v5 com.kubi.kucoin.home.v2.cardsconfig.CardListRspV2) = (r1v4 com.kubi.kucoin.home.v2.cardsconfig.CardListRspV2), (r1v13 com.kubi.kucoin.home.v2.cardsconfig.CardListRspV2) binds: [B:27:0x00a2, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
    
        if (r14 == r0) goto L31;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CardListRspV2 cardListRspV2;
        CardsViewModelV2 cardsViewModelV2;
        boolean z11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        cardListRspV2 = (CardListRspV2) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        StartupTrace.f48194a.m58450j("duration9");
                        HomeCardsRepositoryV2 homeCardsRepositoryV2 = HomeCardsRepositoryV2.f26494a;
                        this.L$0 = SpillingKt.nullOutSpilledVariable(cardListRspV2);
                        this.label = 4;
                        obj = homeCardsRepositoryV2.m30790g(this);
                    }
                } else {
                    cardListRspV2 = (CardListRspV2) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    cardsViewModelV2 = this.this$0;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(cardListRspV2);
                    this.label = 3;
                    if (cardsViewModelV2.m30761n0(this) != coroutine_suspended) {
                        StartupTrace.f48194a.m58450j("duration9");
                        HomeCardsRepositoryV2 homeCardsRepositoryV3 = HomeCardsRepositoryV2.f26494a;
                        this.L$0 = SpillingKt.nullOutSpilledVariable(cardListRspV2);
                        this.label = 4;
                        obj = homeCardsRepositoryV3.m30790g(this);
                    }
                    return coroutine_suspended;
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            List list = (List) obj;
            C44128b.m97266j("CardsViewModelV2", "[loadCards] tabs:" + list);
            if (list != null) {
                CardsViewModelV2 cardsViewModelV3 = this.this$0;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    String code = ((HomeFeedTab) obj2).getCode();
                    if (code != null && code.length() != 0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        arrayList.add(obj2);
                    }
                }
                C41696j.m91104d(ViewModelKt.getViewModelScope(cardsViewModelV3), C41782z0.m91392b(), null, new CardsViewModelV2$loadCards$1$1$2$1(arrayList, null), 2, null);
            }
            this.this$0.f26476b0.postValue(C37201i.f82500a.m83228q());
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        C43101f.f95302a.m94709b("home_page_start_fetch_data");
        HomeCardsRepositoryV2 homeCardsRepositoryV4 = HomeCardsRepositoryV2.f26494a;
        this.label = 1;
        obj = homeCardsRepositoryV4.m30796m(this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        cardListRspV2 = (CardListRspV2) obj;
        C43101f c43101f = C43101f.f95302a;
        c43101f.m94709b("home_page_end_fetch_data");
        if (cardListRspV2 == null) {
            c43101f.m94714h();
            StartupTrace.f48194a.m58450j("duration9");
            this.this$0.f26475a0.postValue(CollectionsKt.mutableListOf(this.this$0.m30753d0()));
            return Unit.INSTANCE;
        }
        if (this.$blockStartUp) {
            CardsViewModelV2 cardsViewModelV4 = this.this$0;
            this.L$0 = SpillingKt.nullOutSpilledVariable(cardListRspV2);
            this.label = 2;
            if (cardsViewModelV4.m30716S(this) != coroutine_suspended) {
                cardsViewModelV2 = this.this$0;
                this.L$0 = SpillingKt.nullOutSpilledVariable(cardListRspV2);
                this.label = 3;
                if (cardsViewModelV2.m30761n0(this) != coroutine_suspended) {
                    StartupTrace.f48194a.m58450j("duration9");
                    HomeCardsRepositoryV2 homeCardsRepositoryV5 = HomeCardsRepositoryV2.f26494a;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(cardListRspV2);
                    this.label = 4;
                    obj = homeCardsRepositoryV5.m30790g(this);
                }
            }
        } else {
            cardsViewModelV2 = this.this$0;
            this.L$0 = SpillingKt.nullOutSpilledVariable(cardListRspV2);
            this.label = 3;
            if (cardsViewModelV2.m30761n0(this) != coroutine_suspended) {
                StartupTrace.f48194a.m58450j("duration9");
                HomeCardsRepositoryV2 homeCardsRepositoryV6 = HomeCardsRepositoryV2.f26494a;
                this.L$0 = SpillingKt.nullOutSpilledVariable(cardListRspV2);
                this.label = 4;
                obj = homeCardsRepositoryV6.m30790g(this);
            }
        }
        return coroutine_suspended;
    }
}
