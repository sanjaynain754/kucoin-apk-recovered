package com.kubi.core.biz.submit;

import p309hd.InterfaceC38170b;
import p852kotlin.Metadata;
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

/* JADX INFO: compiled from: TradeSubmitVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/base/setting/data/TradePanelModel;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeSubmitVM$subSettingsChange$2", m90122f = "TradeSubmitVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TradeSubmitVM$subSettingsChange$2 extends SuspendLambda implements Function2<InterfaceC38170b, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TradeSubmitVM this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC38170b interfaceC38170b, Continuation<? super Unit> continuation) {
        return ((TradeSubmitVM$subSettingsChange$2) create(interfaceC38170b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeSubmitVM$subSettingsChange$2(TradeSubmitVM tradeSubmitVM, Continuation<? super TradeSubmitVM$subSettingsChange$2> continuation) {
        super(2, continuation);
        this.this$0 = tradeSubmitVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TradeSubmitVM$subSettingsChange$2 tradeSubmitVM$subSettingsChange$2 = new TradeSubmitVM$subSettingsChange$2(this.this$0, continuation);
        tradeSubmitVM$subSettingsChange$2.L$0 = obj;
        return tradeSubmitVM$subSettingsChange$2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final InterfaceC38170b interfaceC38170b = (InterfaceC38170b) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C44128b.m97258b("pittttttttt--subSettingsChange: " + interfaceC38170b + ", result: " + Intrinsics.areEqual(interfaceC38170b, InterfaceC38170b.b.f85867a));
        this.this$0.updateState(new Function1() { // from class: com.kubi.core.biz.submit.i2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return TradeSubmitVM$subSettingsChange$2.m22487f(interfaceC38170b, (UiState) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final UiState m22487f(InterfaceC38170b interfaceC38170b, UiState uiState) {
        return uiState.copy((57343 & 1) != 0 ? uiState.symbol : null, (57343 & 2) != 0 ? uiState.symbolInfo : null, (57343 & 4) != 0 ? uiState.tradeBalance : null, (57343 & 8) != 0 ? uiState.availableBalance : null, (57343 & 16) != 0 ? uiState.tradeType : null, (57343 & 32) != 0 ? uiState.bbo : null, (57343 & 64) != 0 ? uiState.inputBuyPrice : null, (57343 & 128) != 0 ? uiState.inputSellPrice : null, (57343 & 256) != 0 ? uiState.inputBuyTriggerPrice : null, (57343 & 512) != 0 ? uiState.inputSellTriggerPrice : null, (57343 & 1024) != 0 ? uiState.etfInfo : null, (57343 & 2048) != 0 ? uiState.panelModel : interfaceC38170b, (57343 & 4096) != 0 ? uiState.allActiveDelegations : null, (57343 & 8192) != 0 ? uiState.supportTradeTypes : null, (57343 & 16384) != 0 ? uiState.marginSymbolInfo : null, (57343 & 32768) != 0 ? uiState.availableTradeAmount : null);
    }
}
