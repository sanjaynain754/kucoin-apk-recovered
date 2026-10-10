package com.kubi.margin.market.trade;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.margin.market.info.MarketTradeStat;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import p768xo.InterfaceC46307h;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MarginMarketAnalysisFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.margin.market.trade.MarginMarketAnalysisFragment$fetchStat$1", m90122f = "MarginMarketAnalysisFragment.kt", m90123i = {0, 0}, m90124l = {118}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "$i$a$-runCatching-MarginMarketAnalysisFragment$fetchStat$1$1"}, m90127s = {"L$0", "I$1"})
public final class MarginMarketAnalysisFragment$fetchStat$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $type;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MarginMarketAnalysisFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginMarketAnalysisFragment$fetchStat$1(MarginMarketAnalysisFragment marginMarketAnalysisFragment, int i11, Continuation<? super MarginMarketAnalysisFragment$fetchStat$1> continuation) {
        super(2, continuation);
        this.this$0 = marginMarketAnalysisFragment;
        this.$type = i11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarginMarketAnalysisFragment$fetchStat$1 marginMarketAnalysisFragment$fetchStat$1 = new MarginMarketAnalysisFragment$fetchStat$1(this.this$0, this.$type, continuation);
        marginMarketAnalysisFragment$fetchStat$1.L$0 = obj;
        return marginMarketAnalysisFragment$fetchStat$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MarginMarketAnalysisFragment$fetchStat$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        MarginMarketAnalysisFragment marginMarketAnalysisFragment;
        int i11;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                marginMarketAnalysisFragment = this.this$0;
                int i13 = this.$type;
                Result.Companion companion = Result.INSTANCE;
                InterfaceC46307h interfaceC46307hM39245w3 = marginMarketAnalysisFragment.m39245w3();
                TradeItemBean tradeItemBean = marginMarketAnalysisFragment.getTradeItemBean();
                String strM66668h = C27041f.m66668h(tradeItemBean != null ? tradeItemBean.getSymbol() : null);
                String strM39240A3 = marginMarketAnalysisFragment.m39240A3(i13);
                this.L$0 = interfaceC41709m0;
                this.L$1 = marginMarketAnalysisFragment;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                Object objM102132p = interfaceC46307hM39245w3.m102132p(strM66668h, strM39240A3, this);
                if (objM102132p == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i11 = i13;
                obj = objM102132p;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.I$0;
                marginMarketAnalysisFragment = (MarginMarketAnalysisFragment) this.L$1;
                ResultKt.throwOnFailure(obj);
            }
            BaseEntity baseEntity = (BaseEntity) obj;
            if (baseEntity.getSuccess()) {
                marginMarketAnalysisFragment.m39242F3(i11, (MarketTradeStat) baseEntity.getData());
            } else {
                C19331c.m42836c(new ApiException(baseEntity.getCode(), baseEntity.getMsg(), baseEntity.getData()), null, 2, null);
                marginMarketAnalysisFragment.m39242F3(i11, null);
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        MarginMarketAnalysisFragment marginMarketAnalysisFragment2 = this.this$0;
        int i14 = this.$type;
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C19331c.m42836c(thM103847exceptionOrNullimpl, null, 2, null);
            if (C41713n0.m91132h(interfaceC41709m0)) {
                marginMarketAnalysisFragment2.m39242F3(i14, null);
            }
        }
        return Unit.INSTANCE;
    }
}
