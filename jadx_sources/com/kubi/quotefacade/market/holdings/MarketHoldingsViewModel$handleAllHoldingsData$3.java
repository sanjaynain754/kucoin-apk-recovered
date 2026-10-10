package com.kubi.quotefacade.market.holdings;

import com.kubi.quotefacade.entity.HoldingCombinedData;
import com.kubi.quotefacade.entity.HoldingData;
import com.kubi.quotefacade.entity.HoldingEntity;
import com.kubi.quotefacade.event.UIState;
import com.kubi.quotefacade.mapper.HoldingCombinedDataMapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p212dv.C36970j;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MarketHoldingsViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "combinedData", "Lcom/kubi/quotefacade/entity/HoldingCombinedData;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.market.holdings.MarketHoldingsViewModel$handleAllHoldingsData$3", m90122f = "MarketHoldingsViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nMarketHoldingsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketHoldingsViewModel.kt\ncom/kubi/quotefacade/market/holdings/MarketHoldingsViewModel$handleAllHoldingsData$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n774#2:220\n865#2,2:221\n1617#2,9:223\n1869#2:232\n1870#2:234\n1626#2:235\n774#2:236\n865#2,2:237\n1617#2,9:239\n1869#2:248\n1870#2:250\n1626#2:251\n1#3:233\n1#3:249\n*S KotlinDebug\n*F\n+ 1 MarketHoldingsViewModel.kt\ncom/kubi/quotefacade/market/holdings/MarketHoldingsViewModel$handleAllHoldingsData$3\n*L\n125#1:220\n125#1:221,2\n126#1:223,9\n126#1:232\n126#1:234\n126#1:235\n128#1:236\n128#1:237,2\n129#1:239,9\n129#1:248\n129#1:250\n129#1:251\n126#1:233\n129#1:249\n*E\n"})
public final class MarketHoldingsViewModel$handleAllHoldingsData$3 extends SuspendLambda implements Function2<HoldingCombinedData, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarketHoldingsViewModel this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(HoldingCombinedData holdingCombinedData, Continuation<? super Unit> continuation) {
        return ((MarketHoldingsViewModel$handleAllHoldingsData$3) create(holdingCombinedData, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHoldingsViewModel$handleAllHoldingsData$3(MarketHoldingsViewModel marketHoldingsViewModel, Continuation<? super MarketHoldingsViewModel$handleAllHoldingsData$3> continuation) {
        super(2, continuation);
        this.this$0 = marketHoldingsViewModel;
    }

    /* JADX INFO: renamed from: g */
    public static final UIState m52592g(UIState uIState) {
        return UIState.copy$default(uIState, new Object(), null, null, 6, null);
    }

    /* JADX INFO: renamed from: h */
    public static final UIState m52593h(UIState uIState) {
        return UIState.copy$default(uIState, new Object(), null, null, 6, null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketHoldingsViewModel$handleAllHoldingsData$3 marketHoldingsViewModel$handleAllHoldingsData$3 = new MarketHoldingsViewModel$handleAllHoldingsData$3(this.this$0, continuation);
        marketHoldingsViewModel$handleAllHoldingsData$3.L$0 = obj;
        return marketHoldingsViewModel$handleAllHoldingsData$3;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HoldingCombinedData holdingCombinedData = (HoldingCombinedData) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (holdingCombinedData != null) {
            HoldingData holdingDataMo51723a = new HoldingCombinedDataMapper().mo51723a(holdingCombinedData);
            MarketHoldingsViewModel marketHoldingsViewModel = this.this$0;
            marketHoldingsViewModel.send(new C36970j(holdingDataMo51723a));
            if (holdingDataMo51723a.getList() == null) {
                marketHoldingsViewModel.updateState(new Function1() { // from class: com.kubi.quotefacade.market.holdings.r0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return MarketHoldingsViewModel$handleAllHoldingsData$3.m52592g((UIState) obj2);
                    }
                });
            } else {
                List<HoldingEntity> list = holdingDataMo51723a.getList();
                if (list != null && !list.isEmpty()) {
                    List<HoldingEntity> list2 = holdingDataMo51723a.getList();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list2) {
                        if (!((HoldingEntity) obj2).isAlphaItem()) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String symbol = ((HoldingEntity) it.next()).getSymbol();
                        if (symbol != null) {
                            arrayList2.add(symbol);
                        }
                    }
                    List<HoldingEntity> list3 = holdingDataMo51723a.getList();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : list3) {
                        if (((HoldingEntity) obj3).isAlphaItem()) {
                            arrayList3.add(obj3);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        String tokenBridgeId = ((HoldingEntity) it2.next()).getTokenBridgeId();
                        if (tokenBridgeId != null) {
                            arrayList4.add(tokenBridgeId);
                        }
                    }
                    marketHoldingsViewModel.m52588P(arrayList2, "TRADING");
                    marketHoldingsViewModel.m52587N(arrayList4);
                }
            }
        } else {
            Boxing.boxBoolean(this.this$0.updateState(new Function1() { // from class: com.kubi.quotefacade.market.holdings.s0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    return MarketHoldingsViewModel$handleAllHoldingsData$3.m52593h((UIState) obj4);
                }
            }));
        }
        return Unit.INSTANCE;
    }
}
