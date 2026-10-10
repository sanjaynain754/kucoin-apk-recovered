package com.kubi.margin.trade;

import com.kubi.data.entity.MarginSymbolInfo;
import com.kubi.data.entity.TradeItemBean;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: BaseMarginViewModel.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/data/entity/MarginSymbolInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.margin.trade.BaseMarginViewModel$requestBannerInfos$1$symbolOfflineDeferred$1", m90122f = "BaseMarginViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class BaseMarginViewModel$requestBannerInfos$1$symbolOfflineDeferred$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super MarginSymbolInfo>, Object> {
    final /* synthetic */ TradeItemBean $currentSymbol;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMarginViewModel$requestBannerInfos$1$symbolOfflineDeferred$1(TradeItemBean tradeItemBean, Continuation<? super BaseMarginViewModel$requestBannerInfos$1$symbolOfflineDeferred$1> continuation) {
        super(2, continuation);
        this.$currentSymbol = tradeItemBean;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseMarginViewModel$requestBannerInfos$1$symbolOfflineDeferred$1(this.$currentSymbol, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super MarginSymbolInfo> continuation) {
        return ((BaseMarginViewModel$requestBannerInfos$1$symbolOfflineDeferred$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return MarginConfigManager.f33681a.m39881Z0(this.$currentSymbol.getSymbol());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
