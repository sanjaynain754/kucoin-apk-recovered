package com.kubi.quotefacade.market.holdings;

import com.kubi.quotefacade.entity.HoldingAlphaData;
import com.kubi.quotefacade.entity.HoldingData;
import com.kubi.quotefacade.entity.HoldingEntity;
import com.kubi.quotefacade.event.UIState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p212dv.C36970j;
import p414kv.C41990f;
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
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "alphaData", "Lcom/kubi/quotefacade/entity/HoldingAlphaData;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.market.holdings.MarketHoldingsViewModel$handleHoldingsAlphaData$3", m90122f = "MarketHoldingsViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nMarketHoldingsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketHoldingsViewModel.kt\ncom/kubi/quotefacade/market/holdings/MarketHoldingsViewModel$handleHoldingsAlphaData$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1617#2,9:220\n1869#2:229\n1870#2:231\n1626#2:232\n1#3:230\n*S KotlinDebug\n*F\n+ 1 MarketHoldingsViewModel.kt\ncom/kubi/quotefacade/market/holdings/MarketHoldingsViewModel$handleHoldingsAlphaData$3\n*L\n161#1:220,9\n161#1:229\n161#1:231\n161#1:232\n161#1:230\n*E\n"})
public final class MarketHoldingsViewModel$handleHoldingsAlphaData$3 extends SuspendLambda implements Function2<HoldingAlphaData, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarketHoldingsViewModel this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(HoldingAlphaData holdingAlphaData, Continuation<? super Unit> continuation) {
        return ((MarketHoldingsViewModel$handleHoldingsAlphaData$3) create(holdingAlphaData, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHoldingsViewModel$handleHoldingsAlphaData$3(MarketHoldingsViewModel marketHoldingsViewModel, Continuation<? super MarketHoldingsViewModel$handleHoldingsAlphaData$3> continuation) {
        super(2, continuation);
        this.this$0 = marketHoldingsViewModel;
    }

    /* JADX INFO: renamed from: g */
    public static final UIState m52596g(UIState uIState) {
        return UIState.copy$default(uIState, new Object(), null, null, 6, null);
    }

    /* JADX INFO: renamed from: h */
    public static final UIState m52597h(UIState uIState) {
        return UIState.copy$default(uIState, new Object(), null, null, 6, null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketHoldingsViewModel$handleHoldingsAlphaData$3 marketHoldingsViewModel$handleHoldingsAlphaData$3 = new MarketHoldingsViewModel$handleHoldingsAlphaData$3(this.this$0, continuation);
        marketHoldingsViewModel$handleHoldingsAlphaData$3.L$0 = obj;
        return marketHoldingsViewModel$handleHoldingsAlphaData$3;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HoldingAlphaData holdingAlphaData = (HoldingAlphaData) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (holdingAlphaData != null) {
            HoldingData holdingDataMo51723a = new C41990f().mo51723a(holdingAlphaData);
            MarketHoldingsViewModel marketHoldingsViewModel = this.this$0;
            marketHoldingsViewModel.send(new C36970j(holdingDataMo51723a));
            if (holdingDataMo51723a.getList() == null) {
                Boxing.boxBoolean(marketHoldingsViewModel.updateState(new Function1() { // from class: com.kubi.quotefacade.market.holdings.t0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return MarketHoldingsViewModel$handleHoldingsAlphaData$3.m52596g((UIState) obj2);
                    }
                }));
            } else {
                List<HoldingEntity> list = holdingDataMo51723a.getList();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    String tokenBridgeId = ((HoldingEntity) it.next()).getTokenBridgeId();
                    if (tokenBridgeId != null) {
                        arrayList.add(tokenBridgeId);
                    }
                }
                marketHoldingsViewModel.m52587N(arrayList);
            }
        } else {
            Boxing.boxBoolean(this.this$0.updateState(new Function1() { // from class: com.kubi.quotefacade.market.holdings.u0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return MarketHoldingsViewModel$handleHoldingsAlphaData$3.m52597h((UIState) obj2);
                }
            }));
        }
        return Unit.INSTANCE;
    }
}
