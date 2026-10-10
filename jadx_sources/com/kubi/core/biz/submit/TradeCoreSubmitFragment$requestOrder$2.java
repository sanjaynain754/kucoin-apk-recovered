package com.kubi.core.biz.submit;

import com.kubi.core.spot.helper.ITradeTypeRequestOrder;
import com.kubi.data.entity.SymbolInfoEntity;
import java.util.Map;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TradeCoreSubmitFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "validationToken", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeCoreSubmitFragment$requestOrder$2", m90122f = "TradeCoreSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TradeCoreSubmitFragment$requestOrder$2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $baseCurrency;
    final /* synthetic */ Function2<Boolean, String, Unit> $callback;
    final /* synthetic */ Map<String, String> $marketOderParams;
    final /* synthetic */ SymbolInfoEntity $symbolInfo;
    final /* synthetic */ ITradeTypeRequestOrder $tradeTypeRequestOrder;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TradeCoreSubmitFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TradeCoreSubmitFragment$requestOrder$2(Map<String, String> map, TradeCoreSubmitFragment tradeCoreSubmitFragment, ITradeTypeRequestOrder iTradeTypeRequestOrder, Function2<? super Boolean, ? super String, Unit> function2, SymbolInfoEntity symbolInfoEntity, String str, Continuation<? super TradeCoreSubmitFragment$requestOrder$2> continuation) {
        super(2, continuation);
        this.$marketOderParams = map;
        this.this$0 = tradeCoreSubmitFragment;
        this.$tradeTypeRequestOrder = iTradeTypeRequestOrder;
        this.$callback = function2;
        this.$symbolInfo = symbolInfoEntity;
        this.$baseCurrency = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TradeCoreSubmitFragment$requestOrder$2 tradeCoreSubmitFragment$requestOrder$2 = new TradeCoreSubmitFragment$requestOrder$2(this.$marketOderParams, this.this$0, this.$tradeTypeRequestOrder, this.$callback, this.$symbolInfo, this.$baseCurrency, continuation);
        tradeCoreSubmitFragment$requestOrder$2.L$0 = obj;
        return tradeCoreSubmitFragment$requestOrder$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((TradeCoreSubmitFragment$requestOrder$2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Map<String, String> map = this.$marketOderParams;
        if (str == null) {
            str = "";
        }
        map.put("X-VALIDATION-TOKEN", str);
        this.this$0.m22368R5(this.$marketOderParams, this.$tradeTypeRequestOrder, this.$callback, this.$symbolInfo, this.$baseCurrency);
        return Unit.INSTANCE;
    }
}
