package com.kubi.kumex.market.p091v2.viewModel;

import com.kubi.broker.RepositoryServiceLocator;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: MarketInfoViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/kumex/market/v2/viewModel/UsStockMarketStatus;", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.market.v2.viewModel.MarketInfoViewModel$startLowLiquidityPolling$2", m90122f = "MarketInfoViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MarketInfoViewModel$startLowLiquidityPolling$2 extends SuspendLambda implements Function2<Unit, Continuation<? super UsStockMarketStatus>, Object> {
    final /* synthetic */ boolean $isUsStock;
    int label;
    final /* synthetic */ MarketInfoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketInfoViewModel$startLowLiquidityPolling$2(boolean z11, MarketInfoViewModel marketInfoViewModel, Continuation<? super MarketInfoViewModel$startLowLiquidityPolling$2> continuation) {
        super(2, continuation);
        this.$isUsStock = z11;
        this.this$0 = marketInfoViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketInfoViewModel$startLowLiquidityPolling$2(this.$isUsStock, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super UsStockMarketStatus> continuation) {
        return ((MarketInfoViewModel$startLowLiquidityPolling$2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.$isUsStock) {
                return new UsStockMarketStatus(false, null, 3, null);
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(C16509b.m35127b(RepositoryServiceLocator.f19236a.m20288g().mo24995W()));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            MarketInfoViewModel marketInfoViewModel = this.this$0;
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C44128b.m97264h(thM103847exceptionOrNullimpl);
                objM103844constructorimpl = (UsStockMarketStatus) marketInfoViewModel.f29857X.getValue();
                if (objM103844constructorimpl == null) {
                    objM103844constructorimpl = new UsStockMarketStatus(false, null, 3, null);
                }
            }
            return (UsStockMarketStatus) objM103844constructorimpl;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
