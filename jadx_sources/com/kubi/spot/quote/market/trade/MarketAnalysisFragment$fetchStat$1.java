package com.kubi.spot.quote.market.trade;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.spot.quote.market.info.MarketTradeStat;
import com.kubi.utils.extensions.C27041f;
import e20.InterfaceC37053d;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MarketAnalysisFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.quote.market.trade.MarketAnalysisFragment$fetchStat$1", m90122f = "MarketAnalysisFragment.kt", m90123i = {0, 0}, m90124l = {111}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "$i$a$-runCatching-MarketAnalysisFragment$fetchStat$1$1"}, m90127s = {"L$0", "I$1"})
public final class MarketAnalysisFragment$fetchStat$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $type;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MarketAnalysisFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketAnalysisFragment$fetchStat$1(MarketAnalysisFragment marketAnalysisFragment, int i11, Continuation<? super MarketAnalysisFragment$fetchStat$1> continuation) {
        super(2, continuation);
        this.this$0 = marketAnalysisFragment;
        this.$type = i11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketAnalysisFragment$fetchStat$1 marketAnalysisFragment$fetchStat$1 = new MarketAnalysisFragment$fetchStat$1(this.this$0, this.$type, continuation);
        marketAnalysisFragment$fetchStat$1.L$0 = obj;
        return marketAnalysisFragment$fetchStat$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MarketAnalysisFragment$fetchStat$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        MarketAnalysisFragment marketAnalysisFragment;
        int i11;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                marketAnalysisFragment = this.this$0;
                int i13 = this.$type;
                Result.Companion companion = Result.INSTANCE;
                InterfaceC37053d interfaceC37053dM62762w3 = marketAnalysisFragment.m62762w3();
                TradeItemBean tradeItemBean = marketAnalysisFragment.getTradeItemBean();
                String strM66668h = C27041f.m66668h(tradeItemBean != null ? tradeItemBean.getSymbol() : null);
                String strM62741A3 = marketAnalysisFragment.m62741A3(i13);
                this.L$0 = interfaceC41709m0;
                this.L$1 = marketAnalysisFragment;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                Object objM82948p = interfaceC37053dM62762w3.m82948p(strM66668h, strM62741A3, this);
                if (objM82948p == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i11 = i13;
                obj = objM82948p;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.I$0;
                marketAnalysisFragment = (MarketAnalysisFragment) this.L$1;
                ResultKt.throwOnFailure(obj);
            }
            BaseEntity baseEntity = (BaseEntity) obj;
            if (baseEntity.getSuccess()) {
                marketAnalysisFragment.m62764F3(i11, (MarketTradeStat) baseEntity.getData());
            } else {
                C19331c.m42836c(new ApiException(baseEntity.getCode(), baseEntity.getMsg(), baseEntity.getData()), null, 2, null);
                marketAnalysisFragment.m62764F3(i11, null);
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        MarketAnalysisFragment marketAnalysisFragment2 = this.this$0;
        int i14 = this.$type;
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C19331c.m42836c(thM103847exceptionOrNullimpl, null, 2, null);
            if (C41713n0.m91132h(interfaceC41709m0)) {
                marketAnalysisFragment2.m62764F3(i14, null);
            }
        }
        return Unit.INSTANCE;
    }
}
