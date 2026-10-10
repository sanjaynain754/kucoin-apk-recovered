package com.kubi.futures.data.market;

import com.kubi.kumex.data.market.model.AvailableTradeAreaEntity;
import java.util.List;
import p836zl.C46894j;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: MarketServiceImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/kumex/data/market/model/AvailableTradeAreaEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.data.market.MarketServiceImpl$fetchTradingArea$2", m90122f = "MarketServiceImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nMarketServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketServiceImpl.kt\ncom/kubi/futures/data/market/MarketServiceImpl$fetchTradingArea$2\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,467:1\n162#2,2:468\n162#2,2:470\n*S KotlinDebug\n*F\n+ 1 MarketServiceImpl.kt\ncom/kubi/futures/data/market/MarketServiceImpl$fetchTradingArea$2\n*L\n440#1:468,2\n442#1:470,2\n*E\n"})
public final class MarketServiceImpl$fetchTradingArea$2 extends SuspendLambda implements Function2<List<? extends AvailableTradeAreaEntity>, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isRobot;
    /* synthetic */ Object L$0;
    int label;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends AvailableTradeAreaEntity> list, Continuation<? super Unit> continuation) {
        return invoke2((List<AvailableTradeAreaEntity>) list, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketServiceImpl$fetchTradingArea$2(boolean z11, Continuation<? super MarketServiceImpl$fetchTradingArea$2> continuation) {
        super(2, continuation);
        this.$isRobot = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketServiceImpl$fetchTradingArea$2 marketServiceImpl$fetchTradingArea$2 = new MarketServiceImpl$fetchTradingArea$2(this.$isRobot, continuation);
        marketServiceImpl$fetchTradingArea$2.L$0 = obj;
        return marketServiceImpl$fetchTradingArea$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<AvailableTradeAreaEntity> list, Continuation<? super Unit> continuation) {
        return ((MarketServiceImpl$fetchTradingArea$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$isRobot) {
            C46392a.m102332o(C46894j.f104736a.m103242G(), list);
        } else {
            C46392a.m102332o(C46894j.f104736a.m103284w(), list);
        }
        return Unit.INSTANCE;
    }
}
