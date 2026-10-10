package com.kubi.spot.quote.market.trade;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.spot.quote.market.info.MarketCoinInfo;
import com.kubi.utils.extensions.C27041f;
import e20.InterfaceC37053d;
import kotlinx.coroutines.InterfaceC41709m0;
import p402kf.C41016c;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketTradeCountDownFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.quote.market.trade.MarketTradeCountDownFragment$getInfo$1", m90122f = "MarketTradeCountDownFragment.kt", m90123i = {0}, m90124l = {163}, m90125m = "invokeSuspend", m90126n = {"$i$a$-runCatching-MarketTradeCountDownFragment$getInfo$1$1"}, m90127s = {"I$0"})
public final class MarketTradeCountDownFragment$getInfo$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ TradeItemBean $tradeBean;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ MarketTradeCountDownFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketTradeCountDownFragment$getInfo$1(MarketTradeCountDownFragment marketTradeCountDownFragment, TradeItemBean tradeItemBean, Continuation<? super MarketTradeCountDownFragment$getInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = marketTradeCountDownFragment;
        this.$tradeBean = tradeItemBean;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketTradeCountDownFragment$getInfo$1(this.this$0, this.$tradeBean, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MarketTradeCountDownFragment$getInfo$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        MarketTradeCountDownFragment marketTradeCountDownFragment;
        Object objM82912K;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    MarketTradeCountDownFragment marketTradeCountDownFragment2 = (MarketTradeCountDownFragment) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    marketTradeCountDownFragment = marketTradeCountDownFragment2;
                    objM82912K = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                marketTradeCountDownFragment = this.this$0;
                TradeItemBean tradeItemBean = this.$tradeBean;
                Result.Companion companion = Result.INSTANCE;
                InterfaceC37053d interfaceC37053dM62872v3 = marketTradeCountDownFragment.m62872v3();
                String strM66668h = C27041f.m66668h(tradeItemBean.getSymbolInfoEntity().getBaseCurrency());
                String strM66668h2 = C27041f.m66668h(tradeItemBean.getSymbol());
                String strM89965c = C41016c.m89965c();
                Intrinsics.checkNotNullExpressionValue(strM89965c, "getCurrentCurrency(...)");
                String localString = MultiLanguageManager.f46811g.getLocalString();
                this.L$0 = marketTradeCountDownFragment;
                this.I$0 = 0;
                this.label = 1;
                objM82912K = InterfaceC37053d.m82912K(interfaceC37053dM62872v3, strM66668h, strM66668h2, strM89965c, localString, null, this, 16, null);
                if (objM82912K == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            BaseEntity baseEntity = (BaseEntity) objM82912K;
            if (baseEntity.getSuccess()) {
                marketTradeCountDownFragment.m62878G3((MarketCoinInfo) baseEntity.getData());
            } else {
                C19331c.m42836c(new ApiException(baseEntity.getCode(), baseEntity.getMsg(), baseEntity.getData()), null, 2, null);
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C19331c.m42836c(thM103847exceptionOrNullimpl, null, 2, null);
        }
        return Unit.INSTANCE;
    }
}
