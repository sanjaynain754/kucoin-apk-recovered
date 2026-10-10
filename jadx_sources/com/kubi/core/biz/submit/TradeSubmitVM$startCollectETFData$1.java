package com.kubi.core.biz.submit;

import com.kubi.core.utils.FlowExtKt;
import com.kubi.data.entity.SymbolInfoEntity;
import gf.C37890n;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import o00.C42911a;
import p260fd.InterfaceC37432d;
import p756xc.ETFInfoResponse;
import p756xc.Request;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TradeSubmitVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeSubmitVM$startCollectETFData$1", m90122f = "TradeSubmitVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TradeSubmitVM$startCollectETFData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $symbol;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TradeSubmitVM this$0;

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeSubmitVM$startCollectETFData$1$3 */
    /* JADX INFO: compiled from: TradeSubmitVM.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/base/arch/api/data/SymbolQuoteData$ETFInfoResponse;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeSubmitVM$startCollectETFData$1$3", m90122f = "TradeSubmitVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C120623 extends SuspendLambda implements Function2<ETFInfoResponse, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TradeSubmitVM this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120623(TradeSubmitVM tradeSubmitVM, Continuation<? super C120623> continuation) {
            super(2, continuation);
            this.this$0 = tradeSubmitVM;
        }

        /* JADX INFO: renamed from: f */
        public static final UiState m22485f(ETFInfoResponse eTFInfoResponse, UiState uiState) {
            return uiState.copy((57343 & 1) != 0 ? uiState.symbol : null, (57343 & 2) != 0 ? uiState.symbolInfo : null, (57343 & 4) != 0 ? uiState.tradeBalance : null, (57343 & 8) != 0 ? uiState.availableBalance : null, (57343 & 16) != 0 ? uiState.tradeType : null, (57343 & 32) != 0 ? uiState.bbo : null, (57343 & 64) != 0 ? uiState.inputBuyPrice : null, (57343 & 128) != 0 ? uiState.inputSellPrice : null, (57343 & 256) != 0 ? uiState.inputBuyTriggerPrice : null, (57343 & 512) != 0 ? uiState.inputSellTriggerPrice : null, (57343 & 1024) != 0 ? uiState.etfInfo : eTFInfoResponse != null ? eTFInfoResponse.getInfo() : null, (57343 & 2048) != 0 ? uiState.panelModel : null, (57343 & 4096) != 0 ? uiState.allActiveDelegations : null, (57343 & 8192) != 0 ? uiState.supportTradeTypes : null, (57343 & 16384) != 0 ? uiState.marginSymbolInfo : null, (57343 & 32768) != 0 ? uiState.availableTradeAmount : null);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C120623 c120623 = new C120623(this.this$0, continuation);
            c120623.L$0 = obj;
            return c120623;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ETFInfoResponse eTFInfoResponse, Continuation<? super Unit> continuation) {
            return ((C120623) create(eTFInfoResponse, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final ETFInfoResponse eTFInfoResponse = (ETFInfoResponse) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.updateState(new Function1() { // from class: com.kubi.core.biz.submit.h2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TradeSubmitVM$startCollectETFData$1.C120623.m22485f(eTFInfoResponse, (UiState) obj2);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeSubmitVM$startCollectETFData$1(String str, TradeSubmitVM tradeSubmitVM, Continuation<? super TradeSubmitVM$startCollectETFData$1> continuation) {
        super(2, continuation);
        this.$symbol = str;
        this.this$0 = tradeSubmitVM;
    }

    /* JADX INFO: renamed from: g */
    public static final UiState m22482g(UiState uiState) {
        return uiState.copy((57343 & 1) != 0 ? uiState.symbol : null, (57343 & 2) != 0 ? uiState.symbolInfo : null, (57343 & 4) != 0 ? uiState.tradeBalance : null, (57343 & 8) != 0 ? uiState.availableBalance : null, (57343 & 16) != 0 ? uiState.tradeType : null, (57343 & 32) != 0 ? uiState.bbo : null, (57343 & 64) != 0 ? uiState.inputBuyPrice : null, (57343 & 128) != 0 ? uiState.inputSellPrice : null, (57343 & 256) != 0 ? uiState.inputBuyTriggerPrice : null, (57343 & 512) != 0 ? uiState.inputSellTriggerPrice : null, (57343 & 1024) != 0 ? uiState.etfInfo : InterfaceC37432d.b.f83034a, (57343 & 2048) != 0 ? uiState.panelModel : null, (57343 & 4096) != 0 ? uiState.allActiveDelegations : null, (57343 & 8192) != 0 ? uiState.supportTradeTypes : null, (57343 & 16384) != 0 ? uiState.marginSymbolInfo : null, (57343 & 32768) != 0 ? uiState.availableTradeAmount : null);
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC37432d m22483h(ETFInfoResponse eTFInfoResponse) {
        if (eTFInfoResponse != null) {
            return eTFInfoResponse.getInfo();
        }
        return null;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TradeSubmitVM$startCollectETFData$1 tradeSubmitVM$startCollectETFData$1 = new TradeSubmitVM$startCollectETFData$1(this.$symbol, this.this$0, continuation);
        tradeSubmitVM$startCollectETFData$1.L$0 = obj;
        return tradeSubmitVM$startCollectETFData$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TradeSubmitVM$startCollectETFData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(this.$symbol);
        if (symbolInfoEntityM85601B == null) {
            return Unit.INSTANCE;
        }
        if (symbolInfoEntityM85601B.isEtfSymbol()) {
            FlowExtKt.m23400a(C41636g.m90941x(this.this$0.m22470j0().m21142f(new Request(this.$symbol), interfaceC41709m0), new Function1() { // from class: com.kubi.core.biz.submit.g2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TradeSubmitVM$startCollectETFData$1.m22483h((ETFInfoResponse) obj2);
                }
            }), C42911a.m94121c(), interfaceC41709m0, new C120623(this.this$0, null));
            return Unit.INSTANCE;
        }
        this.this$0.updateState(new Function1() { // from class: com.kubi.core.biz.submit.f2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return TradeSubmitVM$startCollectETFData$1.m22482g((UiState) obj2);
            }
        });
        return Unit.INSTANCE;
    }
}
