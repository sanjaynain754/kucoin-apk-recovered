package com.kubi.core.biz.submit;

import com.kubi.core.biz.margininfo.IMarginInfoApi;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeSubmitVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "", "it"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeSubmitVM$startFundsInfo$1", m90122f = "TradeSubmitVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TradeSubmitVM$startFundsInfo$1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TradeSubmitVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeSubmitVM$startFundsInfo$1(TradeSubmitVM tradeSubmitVM, Continuation<? super TradeSubmitVM$startFundsInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = tradeSubmitVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeSubmitVM$startFundsInfo$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((TradeSubmitVM$startFundsInfo$1) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            TradeSubmitVM tradeSubmitVM = this.this$0;
            UiState uiState = (UiState) tradeSubmitVM.getState();
            IMarginInfoApi iMarginInfoApiM22454A0 = this.this$0.m22454A0();
            Intrinsics.checkNotNullExpressionValue(iMarginInfoApiM22454A0, "access$getUtaOrderApi(...)");
            TradeSymbolBalanceExtKt.m22494g(tradeSubmitVM, uiState, iMarginInfoApiM22454A0, false, 4, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
