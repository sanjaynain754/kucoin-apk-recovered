package com.kubi.futures.trade;

import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.kumex.data.platform.model.MarginModeInfoEntity;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesTradeViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.FuturesTradeViewModel$modifyLeverageByMarginMode$1", m90122f = "FuturesTradeViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FuturesTradeViewModel$modifyLeverageByMarginMode$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $leverage;
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ FuturesTradeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesTradeViewModel$modifyLeverageByMarginMode$1(String str, FuturesTradeViewModel futuresTradeViewModel, String str2, Continuation<? super FuturesTradeViewModel$modifyLeverageByMarginMode$1> continuation) {
        super(2, continuation);
        this.$symbol = str;
        this.this$0 = futuresTradeViewModel;
        this.$leverage = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesTradeViewModel$modifyLeverageByMarginMode$1(this.$symbol, this.this$0, this.$leverage, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FuturesTradeViewModel$modifyLeverageByMarginMode$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            String marginMode = null;
            MarginModeInfoEntity marginModeInfoEntity = MultiBizFacadeManager.m20256j(MultiBizFacadeManager.f19232a, null, 1, null).mo24484i0(false, this.$symbol).get(this.$symbol);
            if (marginModeInfoEntity != null) {
                marginMode = marginModeInfoEntity.getMarginMode();
            }
            if (Intrinsics.areEqual(marginMode, SharedPositionInfo.MARGIN_MODE_ISOLATED)) {
                this.this$0.m26679G1(this.$symbol, this.$leverage);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
