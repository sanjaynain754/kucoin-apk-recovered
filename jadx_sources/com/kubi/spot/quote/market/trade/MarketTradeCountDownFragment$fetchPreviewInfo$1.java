package com.kubi.spot.quote.market.trade;

import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.SymbolPreviewEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.extensions.C27041f;
import d20.C36596a;
import e20.InterfaceC37053d;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42916f;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: MarketTradeCountDownFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.quote.market.trade.MarketTradeCountDownFragment$fetchPreviewInfo$1", m90122f = "MarketTradeCountDownFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MarketTradeCountDownFragment$fetchPreviewInfo$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ TradeItemBean $data;
    int label;
    final /* synthetic */ MarketTradeCountDownFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketTradeCountDownFragment$fetchPreviewInfo$1(MarketTradeCountDownFragment marketTradeCountDownFragment, TradeItemBean tradeItemBean, Continuation<? super MarketTradeCountDownFragment$fetchPreviewInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = marketTradeCountDownFragment;
        this.$data = tradeItemBean;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketTradeCountDownFragment$fetchPreviewInfo$1(this.this$0, this.$data, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MarketTradeCountDownFragment$fetchPreviewInfo$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m62892k(TradeItemBean tradeItemBean, SymbolPreviewEntity symbolPreviewEntity) {
        C36596a.m81887b(tradeItemBean, symbolPreviewEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final void m62893l(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m62894m(MarketTradeCountDownFragment marketTradeCountDownFragment, SymbolPreviewEntity symbolPreviewEntity) {
        marketTradeCountDownFragment.f51110U = symbolPreviewEntity;
        marketTradeCountDownFragment.m62880s3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final void m62895n(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m62896o(MarketTradeCountDownFragment marketTradeCountDownFragment, Throwable th2) {
        C44128b.m97264h(th2);
        marketTradeCountDownFragment.m62874B3(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final void m62897p(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String code;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            final MarketTradeCountDownFragment marketTradeCountDownFragment = this.this$0;
            final TradeItemBean tradeItemBean = this.$data;
            try {
                Result.Companion companion = Result.INSTANCE;
                InterfaceC37053d interfaceC37053dM62872v3 = marketTradeCountDownFragment.m62872v3();
                SymbolInfoEntity symbolInfoEntity = tradeItemBean.getSymbolInfoEntity();
                String baseCurrency = null;
                if (symbolInfoEntity != null) {
                    code = symbolInfoEntity.getCode();
                } else {
                    code = null;
                }
                String strM66668h = C27041f.m66668h(code);
                SymbolInfoEntity symbolInfoEntity2 = tradeItemBean.getSymbolInfoEntity();
                if (symbolInfoEntity2 != null) {
                    baseCurrency = symbolInfoEntity2.getBaseCurrency();
                }
                String strM66668h2 = C27041f.m66668h(baseCurrency);
                String string = MultiLanguageManager.f46811g.getLocale().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                Observable observableObserveOn = interfaceC37053dM62872v3.m82936d(strM66668h, strM66668h2, string).compose(C24217a1.m58389m()).observeOn(C42916f.m94127f());
                final Function1 function1 = new Function1() { // from class: com.kubi.spot.quote.market.trade.r0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return MarketTradeCountDownFragment$fetchPreviewInfo$1.m62892k(tradeItemBean, (SymbolPreviewEntity) obj2);
                    }
                };
                Observable observableObserveOn2 = observableObserveOn.doOnNext(new Consumer() { // from class: com.kubi.spot.quote.market.trade.s0
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj2) {
                        MarketTradeCountDownFragment$fetchPreviewInfo$1.m62893l(function1, obj2);
                    }
                }).observeOn(AndroidSchedulers.mainThread());
                final Function1 function2 = new Function1() { // from class: com.kubi.spot.quote.market.trade.t0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return MarketTradeCountDownFragment$fetchPreviewInfo$1.m62894m(marketTradeCountDownFragment, (SymbolPreviewEntity) obj2);
                    }
                };
                Consumer consumer = new Consumer() { // from class: com.kubi.spot.quote.market.trade.u0
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj2) {
                        MarketTradeCountDownFragment$fetchPreviewInfo$1.m62895n(function2, obj2);
                    }
                };
                final Function1 function3 = new Function1() { // from class: com.kubi.spot.quote.market.trade.v0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return MarketTradeCountDownFragment$fetchPreviewInfo$1.m62896o(marketTradeCountDownFragment, (Throwable) obj2);
                    }
                };
                Disposable disposableSubscribe = observableObserveOn2.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.quote.market.trade.w0
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj2) {
                        MarketTradeCountDownFragment$fetchPreviewInfo$1.m62897p(function3, obj2);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
                Result.m103844constructorimpl(DisposableKt.addTo(disposableSubscribe, marketTradeCountDownFragment.getDestroyDisposable()));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
