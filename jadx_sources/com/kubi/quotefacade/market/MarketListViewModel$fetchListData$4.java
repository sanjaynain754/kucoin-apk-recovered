package com.kubi.quotefacade.market;

import com.kubi.quotefacade.entity.MarketListEntity;
import java.util.ArrayList;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MarketListViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/quotefacade/entity/MarketListEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.market.MarketListViewModel$fetchListData$4", m90122f = "MarketListViewModel.kt", m90123i = {0}, m90124l = {162}, m90125m = "invokeSuspend", m90126n = {"it"}, m90127s = {"L$0"})
public final class MarketListViewModel$fetchListData$4 extends SuspendLambda implements Function2<MarketListEntity, Continuation<? super Unit>, Object> {
    final /* synthetic */ Integer $marketType;
    final /* synthetic */ ArrayList<String> $symbol;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarketListViewModel this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(MarketListEntity marketListEntity, Continuation<? super Unit> continuation) {
        return ((MarketListViewModel$fetchListData$4) create(marketListEntity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketListViewModel$fetchListData$4(MarketListViewModel marketListViewModel, Integer num, ArrayList<String> arrayList, Continuation<? super MarketListViewModel$fetchListData$4> continuation) {
        super(2, continuation);
        this.this$0 = marketListViewModel;
        this.$marketType = num;
        this.$symbol = arrayList;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketListViewModel$fetchListData$4 marketListViewModel$fetchListData$4 = new MarketListViewModel$fetchListData$4(this.this$0, this.$marketType, this.$symbol, continuation);
        marketListViewModel$fetchListData$4.L$0 = obj;
        return marketListViewModel$fetchListData$4;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MarketListEntity marketListEntity = (MarketListEntity) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            MarketListViewModel marketListViewModel = this.this$0;
            Integer num = this.$marketType;
            ArrayList<String> arrayList = this.$symbol;
            this.L$0 = SpillingKt.nullOutSpilledVariable(marketListEntity);
            this.label = 1;
            if (marketListViewModel.m52364v(num, marketListEntity, arrayList, true, this) == coroutine_suspended) {
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
