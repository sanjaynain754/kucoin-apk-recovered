package com.kubi.home.v2.card;

import com.kubi.home.R$string;
import com.kubi.kucoin.home.p090v2.cards.BaseCardDataV2;
import com.kubi.kucoin.home.p090v2.cardsconfig.CardListRspV2;
import com.kubi.utils.ToastCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CardsViewModelV2.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.v2.card.CardsViewModelV2$saveUserChanges$2", m90122f = "CardsViewModelV2.kt", m90123i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, m90124l = {451, 457, 463}, m90125m = "invokeSuspend", m90126n = {"config", "updatedCardList", "updateVersion", "config", "updatedCardList", "ret", "updateVersion", "config", "updatedCardList", "ret", "updateVersion"}, m90127s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0"})
@SourceDebugExtension({"SMAP\nCardsViewModelV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardsViewModelV2.kt\ncom/kubi/home/v2/card/CardsViewModelV2$saveUserChanges$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,651:1\n1563#2:652\n1634#2,3:653\n*S KotlinDebug\n*F\n+ 1 CardsViewModelV2.kt\ncom/kubi/home/v2/card/CardsViewModelV2$saveUserChanges$2\n*L\n447#1:652\n447#1:653,3\n*E\n"})
public final class CardsViewModelV2$saveUserChanges$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ CardsViewModelV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsViewModelV2$saveUserChanges$2(CardsViewModelV2 cardsViewModelV2, Continuation<? super CardsViewModelV2$saveUserChanges$2> continuation) {
        super(2, continuation);
        this.this$0 = cardsViewModelV2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardsViewModelV2$saveUserChanges$2(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CardsViewModelV2$saveUserChanges$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:39:0x0108  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d6, code lost:
    
        if (r2.m30798o(r6, r4, false, r9) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ff, code lost:
    
        if (r3.m30796m(r9) == r0) goto L37;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CardListRspV2 cardListRspV2M30792i;
        List<CardListRspV2.UserCustomWidget> list;
        int userCustomVersion;
        Boolean bool;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        ResultKt.throwOnFailure(obj);
                        ToastCompat.m66437C(R$string.homepage_feature_save_failed);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
            } else {
                userCustomVersion = this.I$0;
                list = (List) this.L$1;
                cardListRspV2M30792i = (CardListRspV2) this.L$0;
                ResultKt.throwOnFailure(obj);
                bool = (Boolean) obj;
                if (Intrinsics.areEqual(bool, Boxing.boxBoolean(true))) {
                    cardListRspV2M30792i.setUserCustomWidgetList(list);
                    cardListRspV2M30792i.setUserCustomVersion(userCustomVersion);
                    HomeCardsRepositoryV2 homeCardsRepositoryV2 = HomeCardsRepositoryV2.f26494a;
                    List<CardListRspV2.AppWidgetConfigVO> allWidgetList = cardListRspV2M30792i.getAllWidgetList();
                    this.L$0 = SpillingKt.nullOutSpilledVariable(cardListRspV2M30792i);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(list);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(bool);
                    this.I$0 = userCustomVersion;
                    this.label = 2;
                } else if (Intrinsics.areEqual(bool, Boxing.boxBoolean(false))) {
                    HomeCardsRepositoryV2 homeCardsRepositoryV3 = HomeCardsRepositoryV2.f26494a;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(cardListRspV2M30792i);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(list);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(bool);
                    this.I$0 = userCustomVersion;
                    this.label = 3;
                } else {
                    ToastCompat.m66437C(R$string.homepage_feature_save_failed);
                }
            }
        } else {
            ResultKt.throwOnFailure(obj);
            cardListRspV2M30792i = HomeCardsRepositoryV2.f26494a.m30792i();
            if (cardListRspV2M30792i == null) {
                return Unit.INSTANCE;
            }
            Collection data = this.this$0.m30747X().getData();
            if (data != null) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(data, 10));
                Iterator it = data.iterator();
                while (it.hasNext()) {
                    arrayList.add(C15000n.m30815e((BaseCardDataV2) it.next()));
                }
                list = arrayList;
            } else {
                list = null;
            }
            if (list != null) {
                userCustomVersion = cardListRspV2M30792i.getUserCustomVersion() + 1;
                HomeCardsRepositoryV2 homeCardsRepositoryV4 = HomeCardsRepositoryV2.f26494a;
                this.L$0 = cardListRspV2M30792i;
                this.L$1 = list;
                this.I$0 = userCustomVersion;
                this.label = 1;
                obj = homeCardsRepositoryV4.m30799q(list, userCustomVersion, this);
                if (obj != coroutine_suspended) {
                    bool = (Boolean) obj;
                    if (Intrinsics.areEqual(bool, Boxing.boxBoolean(true))) {
                        cardListRspV2M30792i.setUserCustomWidgetList(list);
                        cardListRspV2M30792i.setUserCustomVersion(userCustomVersion);
                        HomeCardsRepositoryV2 homeCardsRepositoryV5 = HomeCardsRepositoryV2.f26494a;
                        List<CardListRspV2.AppWidgetConfigVO> allWidgetList2 = cardListRspV2M30792i.getAllWidgetList();
                        this.L$0 = SpillingKt.nullOutSpilledVariable(cardListRspV2M30792i);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(list);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(bool);
                        this.I$0 = userCustomVersion;
                        this.label = 2;
                    } else if (Intrinsics.areEqual(bool, Boxing.boxBoolean(false))) {
                        HomeCardsRepositoryV2 homeCardsRepositoryV6 = HomeCardsRepositoryV2.f26494a;
                        this.L$0 = SpillingKt.nullOutSpilledVariable(cardListRspV2M30792i);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(list);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(bool);
                        this.I$0 = userCustomVersion;
                        this.label = 3;
                    } else {
                        ToastCompat.m66437C(R$string.homepage_feature_save_failed);
                    }
                }
                return coroutine_suspended;
            }
            ToastCompat.m66437C(R$string.homepage_feature_save_failed);
        }
        this.this$0.m30740G0();
        return Unit.INSTANCE;
    }
}
