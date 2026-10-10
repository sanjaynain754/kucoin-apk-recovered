package com.kubi.quotefacade.market.holdings;

import com.kubi.quotefacade.entity.HoldingData;
import com.kubi.quotefacade.entity.HoldingEntity;
import com.kubi.quotefacade.event.UIState;
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
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/quotefacade/entity/HoldingData;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.market.holdings.MarketHoldingsViewModel$handleHoldingsData$3", m90122f = "MarketHoldingsViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nMarketHoldingsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketHoldingsViewModel.kt\ncom/kubi/quotefacade/market/holdings/MarketHoldingsViewModel$handleHoldingsData$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1617#2,9:220\n1869#2:229\n1870#2:231\n1626#2:232\n1#3:230\n*S KotlinDebug\n*F\n+ 1 MarketHoldingsViewModel.kt\ncom/kubi/quotefacade/market/holdings/MarketHoldingsViewModel$handleHoldingsData$3\n*L\n91#1:220,9\n91#1:229\n91#1:231\n91#1:232\n91#1:230\n*E\n"})
public final class MarketHoldingsViewModel$handleHoldingsData$3 extends SuspendLambda implements Function2<HoldingData, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $holdingsType;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarketHoldingsViewModel this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(HoldingData holdingData, Continuation<? super Unit> continuation) {
        return ((MarketHoldingsViewModel$handleHoldingsData$3) create(holdingData, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHoldingsViewModel$handleHoldingsData$3(MarketHoldingsViewModel marketHoldingsViewModel, String str, Continuation<? super MarketHoldingsViewModel$handleHoldingsData$3> continuation) {
        super(2, continuation);
        this.this$0 = marketHoldingsViewModel;
        this.$holdingsType = str;
    }

    /* JADX INFO: renamed from: g */
    public static final UIState m52600g(UIState uIState) {
        return UIState.copy$default(uIState, new Object(), null, null, 6, null);
    }

    /* JADX INFO: renamed from: h */
    public static final UIState m52601h(UIState uIState) {
        return UIState.copy$default(uIState, new Object(), null, null, 6, null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketHoldingsViewModel$handleHoldingsData$3 marketHoldingsViewModel$handleHoldingsData$3 = new MarketHoldingsViewModel$handleHoldingsData$3(this.this$0, this.$holdingsType, continuation);
        marketHoldingsViewModel$handleHoldingsData$3.L$0 = obj;
        return marketHoldingsViewModel$handleHoldingsData$3;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HoldingData holdingData = (HoldingData) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (holdingData != null) {
            this.this$0.send(new C36970j(holdingData));
            if (holdingData.getList() == null) {
                Boxing.boxBoolean(this.this$0.updateState(new Function1() { // from class: com.kubi.quotefacade.market.holdings.v0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return MarketHoldingsViewModel$handleHoldingsData$3.m52600g((UIState) obj2);
                    }
                }));
            } else {
                List<HoldingEntity> list = holdingData.getList();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    String symbol = ((HoldingEntity) it.next()).getSymbol();
                    if (symbol != null) {
                        arrayList.add(symbol);
                    }
                }
                this.this$0.m52588P(arrayList, this.$holdingsType);
                Unit unit = Unit.INSTANCE;
            }
        } else {
            Boxing.boxBoolean(this.this$0.updateState(new Function1() { // from class: com.kubi.quotefacade.market.holdings.w0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return MarketHoldingsViewModel$handleHoldingsData$3.m52601h((UIState) obj2);
                }
            }));
        }
        return Unit.INSTANCE;
    }
}
