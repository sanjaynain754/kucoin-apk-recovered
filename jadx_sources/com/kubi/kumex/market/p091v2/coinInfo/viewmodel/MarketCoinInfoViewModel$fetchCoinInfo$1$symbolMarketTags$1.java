package com.kubi.kumex.market.p091v2.coinInfo.viewmodel;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.data.market.IMarketApi;
import com.kubi.kumex.market.p091v2.coinInfo.entity.TagEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MarketCoinInfoViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/kumex/market/v2/coinInfo/entity/TagEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.market.v2.coinInfo.viewmodel.MarketCoinInfoViewModel$fetchCoinInfo$1$symbolMarketTags$1", m90122f = "MarketCoinInfoViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MarketCoinInfoViewModel$fetchCoinInfo$1$symbolMarketTags$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super TagEntity>, Object> {
    final /* synthetic */ String $spotSymbol;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketCoinInfoViewModel$fetchCoinInfo$1$symbolMarketTags$1(String str, Continuation<? super MarketCoinInfoViewModel$fetchCoinInfo$1$symbolMarketTags$1> continuation) {
        super(2, continuation);
        this.$spotSymbol = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketCoinInfoViewModel$fetchCoinInfo$1$symbolMarketTags$1(this.$spotSymbol, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super TagEntity> continuation) {
        return ((MarketCoinInfoViewModel$fetchCoinInfo$1$symbolMarketTags$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return IMarketApi.m24855j(RepositoryServiceLocator.f19236a.m20286e(), this.$spotSymbol, null, 2, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
