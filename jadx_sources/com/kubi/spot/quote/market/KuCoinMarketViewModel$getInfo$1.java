package com.kubi.spot.quote.market;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.function.language.MultiLanguageManager;
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

/* JADX INFO: compiled from: KuCoinMarketViewModel.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.quote.market.KuCoinMarketViewModel$getInfo$1", m90122f = "KuCoinMarketViewModel.kt", m90123i = {0}, m90124l = {33}, m90125m = "invokeSuspend", m90126n = {"$i$a$-runCatching-KuCoinMarketViewModel$getInfo$1$1"}, m90127s = {"I$0"})
public final class KuCoinMarketViewModel$getInfo$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ TradeItemBean $tradeItemBean;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ KuCoinMarketViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KuCoinMarketViewModel$getInfo$1(KuCoinMarketViewModel kuCoinMarketViewModel, TradeItemBean tradeItemBean, Continuation<? super KuCoinMarketViewModel$getInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = kuCoinMarketViewModel;
        this.$tradeItemBean = tradeItemBean;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KuCoinMarketViewModel$getInfo$1(this.this$0, this.$tradeItemBean, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KuCoinMarketViewModel$getInfo$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        KuCoinMarketViewModel kuCoinMarketViewModel;
        Object objM82909C;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    KuCoinMarketViewModel kuCoinMarketViewModel2 = (KuCoinMarketViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    kuCoinMarketViewModel = kuCoinMarketViewModel2;
                    objM82909C = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                kuCoinMarketViewModel = this.this$0;
                TradeItemBean tradeItemBean = this.$tradeItemBean;
                Result.Companion companion = Result.INSTANCE;
                InterfaceC37053d interfaceC37053dM62352t = kuCoinMarketViewModel.m62352t();
                String baseCurrency = tradeItemBean.getSymbolInfoEntity().getBaseCurrency();
                Intrinsics.checkNotNullExpressionValue(baseCurrency, "getBaseCurrency(...)");
                String symbol = tradeItemBean.getSymbol();
                Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
                String strM89965c = C41016c.m89965c();
                Intrinsics.checkNotNullExpressionValue(strM89965c, "getCurrentCurrency(...)");
                String localString = MultiLanguageManager.f46811g.getLocalString();
                this.L$0 = kuCoinMarketViewModel;
                this.I$0 = 0;
                this.label = 1;
                objM82909C = InterfaceC37053d.m82909C(interfaceC37053dM62352t, baseCurrency, symbol, strM89965c, localString, null, this, 16, null);
                if (objM82909C == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            BaseEntity baseEntity = (BaseEntity) objM82909C;
            if (baseEntity.getSuccess()) {
                kuCoinMarketViewModel.m62350r().postValue(baseEntity.getData());
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
