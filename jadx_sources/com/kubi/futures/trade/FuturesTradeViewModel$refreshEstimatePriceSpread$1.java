package com.kubi.futures.trade;

import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizType;
import com.kubi.futures.data.platform.FuturesSpreadConfigService;
import com.kubi.kumex.utils.Log;
import java.math.BigDecimal;
import kotlinx.coroutines.InterfaceC41709m0;
import p314hi.InterfaceC38213a;
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
@DebugMetadata(m90121c = "com.kubi.futures.trade.FuturesTradeViewModel$refreshEstimatePriceSpread$1", m90122f = "FuturesTradeViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FuturesTradeViewModel$refreshEstimatePriceSpread$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ MultiBizType $bizType;
    final /* synthetic */ long $requestId;
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ FuturesTradeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesTradeViewModel$refreshEstimatePriceSpread$1(String str, MultiBizType multiBizType, FuturesTradeViewModel futuresTradeViewModel, long j11, Continuation<? super FuturesTradeViewModel$refreshEstimatePriceSpread$1> continuation) {
        super(2, continuation);
        this.$symbol = str;
        this.$bizType = multiBizType;
        this.this$0 = futuresTradeViewModel;
        this.$requestId = j11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesTradeViewModel$refreshEstimatePriceSpread$1(this.$symbol, this.$bizType, this.this$0, this.$requestId, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FuturesTradeViewModel$refreshEstimatePriceSpread$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:17:0x00e5  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC38213a value;
        String symbol;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            BigDecimal bigDecimalM24886d = FuturesSpreadConfigService.f22739a.m24886d(this.$symbol, this.$bizType);
            String symbol2 = null;
            if (this.this$0.f23630n0 == this.$requestId) {
                InterfaceC38213a value2 = this.this$0.m26686X0().getValue();
                if (value2 != null) {
                    symbol = value2.getSymbol();
                } else {
                    symbol = null;
                }
                if (Intrinsics.areEqual(symbol, this.$symbol) && BrokerConfig.f19211a.m20201d().mo4515x() == this.$bizType) {
                    Log.f30813a.m36617c(this.this$0.f23612V, "spread refresh apply requestId=" + this.$requestId + " symbol=" + this.$symbol + " bizType=" + this.$bizType.getValue() + " old=" + this.this$0.m26691c1().getValue() + " new=" + bigDecimalM24886d);
                    this.this$0.m26691c1().postValue(bigDecimalM24886d);
                } else {
                    Log log = Log.f30813a;
                    String str = this.this$0.f23612V;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("spread refresh discard requestId=");
                    sb2.append(this.$requestId);
                    sb2.append(" symbol=");
                    sb2.append(this.$symbol);
                    sb2.append(" currentRequestId=");
                    sb2.append(this.this$0.f23630n0);
                    sb2.append(" currentSymbol=");
                    value = this.this$0.m26686X0().getValue();
                    if (value != null) {
                        symbol2 = value.getSymbol();
                    }
                    sb2.append(symbol2);
                    sb2.append(" currentBizType=");
                    sb2.append(BrokerConfig.f19211a.m20201d().mo4515x().getValue());
                    sb2.append(" spread=");
                    sb2.append(bigDecimalM24886d);
                    log.m36618d(str, sb2.toString());
                }
            } else {
                Log log2 = Log.f30813a;
                String str2 = this.this$0.f23612V;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("spread refresh discard requestId=");
                sb3.append(this.$requestId);
                sb3.append(" symbol=");
                sb3.append(this.$symbol);
                sb3.append(" currentRequestId=");
                sb3.append(this.this$0.f23630n0);
                sb3.append(" currentSymbol=");
                value = this.this$0.m26686X0().getValue();
                if (value != null) {
                    symbol2 = value.getSymbol();
                }
                sb3.append(symbol2);
                sb3.append(" currentBizType=");
                sb3.append(BrokerConfig.f19211a.m20201d().mo4515x().getValue());
                sb3.append(" spread=");
                sb3.append(bigDecimalM24886d);
                log2.m36618d(str2, sb3.toString());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
