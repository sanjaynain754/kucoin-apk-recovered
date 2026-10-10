package com.kubi.core.biz.submit;

import com.kubi.core.spot.entity.MarginSymbolInfo;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TradeSubmitVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeSubmitVM$sendBizIntent$5$1", m90122f = "TradeSubmitVM.kt", m90123i = {}, m90124l = {183}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TradeSubmitVM$sendBizIntent$5$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ TradeSubmitVM this$0;

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeSubmitVM$sendBizIntent$5$1$1 */
    /* JADX INFO: compiled from: TradeSubmitVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/core/spot/entity/MarginSymbolInfo;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeSubmitVM$sendBizIntent$5$1$1", m90122f = "TradeSubmitVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C120611 extends SuspendLambda implements Function2<List<? extends MarginSymbolInfo>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TradeSubmitVM this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends MarginSymbolInfo> list, Continuation<? super Unit> continuation) {
            return invoke2((List<MarginSymbolInfo>) list, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120611(TradeSubmitVM tradeSubmitVM, Continuation<? super C120611> continuation) {
            super(2, continuation);
            this.this$0 = tradeSubmitVM;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C120611 c120611 = new C120611(this.this$0, continuation);
            c120611.L$0 = obj;
            return c120611;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<MarginSymbolInfo> list, Continuation<? super Unit> continuation) {
            return ((C120611) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.updateState(new Function1() { // from class: com.kubi.core.biz.submit.e2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TradeSubmitVM$sendBizIntent$5$1.C120611.m22479f(list, (UiState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: f */
        public static final UiState m22479f(List list, UiState uiState) {
            return uiState.copy((57343 & 1) != 0 ? uiState.symbol : null, (57343 & 2) != 0 ? uiState.symbolInfo : null, (57343 & 4) != 0 ? uiState.tradeBalance : null, (57343 & 8) != 0 ? uiState.availableBalance : null, (57343 & 16) != 0 ? uiState.tradeType : null, (57343 & 32) != 0 ? uiState.bbo : null, (57343 & 64) != 0 ? uiState.inputBuyPrice : null, (57343 & 128) != 0 ? uiState.inputSellPrice : null, (57343 & 256) != 0 ? uiState.inputBuyTriggerPrice : null, (57343 & 512) != 0 ? uiState.inputSellTriggerPrice : null, (57343 & 1024) != 0 ? uiState.etfInfo : null, (57343 & 2048) != 0 ? uiState.panelModel : null, (57343 & 4096) != 0 ? uiState.allActiveDelegations : null, (57343 & 8192) != 0 ? uiState.supportTradeTypes : null, (57343 & 16384) != 0 ? uiState.marginSymbolInfo : (MarginSymbolInfo) CollectionsKt.firstOrNull(list), (57343 & 32768) != 0 ? uiState.availableTradeAmount : null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeSubmitVM$sendBizIntent$5$1(TradeSubmitVM tradeSubmitVM, String str, Continuation<? super TradeSubmitVM$sendBizIntent$5$1> continuation) {
        super(2, continuation);
        this.this$0 = tradeSubmitVM;
        this.$symbol = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeSubmitVM$sendBizIntent$5$1(this.this$0, this.$symbol, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TradeSubmitVM$sendBizIntent$5$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e<List<MarginSymbolInfo>> interfaceC41634eM21871d = this.this$0.m22454A0().m21871d(this.$symbol);
            C120611 c120611 = new C120611(this.this$0, null);
            this.label = 1;
            if (RetrofitFlowExKt.m42824e(interfaceC41634eM21871d, false, c120611, this, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
