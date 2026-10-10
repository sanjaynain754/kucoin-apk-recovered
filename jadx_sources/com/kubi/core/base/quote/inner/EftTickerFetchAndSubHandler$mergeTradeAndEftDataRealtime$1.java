package com.kubi.core.base.quote.inner;

import java.math.BigDecimal;
import p260fd.InterfaceC37432d;
import p756xc.ETFInfoResponse;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: EftTickerFetchAndSubHandler.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/core/base/arch/api/data/SymbolQuoteData$ETFInfoResponse;", "fetchData", "pushValue", "Ljava/math/BigDecimal;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.base.quote.inner.EftTickerFetchAndSubHandler$mergeTradeAndEftDataRealtime$1", m90122f = "EftTickerFetchAndSubHandler.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class EftTickerFetchAndSubHandler$mergeTradeAndEftDataRealtime$1 extends SuspendLambda implements Function3<ETFInfoResponse, BigDecimal, Continuation<? super ETFInfoResponse>, Object> {
    final /* synthetic */ String $baseCurrency;
    final /* synthetic */ String $symbol;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EftTickerFetchAndSubHandler$mergeTradeAndEftDataRealtime$1(String str, String str2, Continuation<? super EftTickerFetchAndSubHandler$mergeTradeAndEftDataRealtime$1> continuation) {
        super(3, continuation);
        this.$symbol = str;
        this.$baseCurrency = str2;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(ETFInfoResponse eTFInfoResponse, BigDecimal bigDecimal, Continuation<? super ETFInfoResponse> continuation) {
        EftTickerFetchAndSubHandler$mergeTradeAndEftDataRealtime$1 eftTickerFetchAndSubHandler$mergeTradeAndEftDataRealtime$1 = new EftTickerFetchAndSubHandler$mergeTradeAndEftDataRealtime$1(this.$symbol, this.$baseCurrency, continuation);
        eftTickerFetchAndSubHandler$mergeTradeAndEftDataRealtime$1.L$0 = eTFInfoResponse;
        eftTickerFetchAndSubHandler$mergeTradeAndEftDataRealtime$1.L$1 = bigDecimal;
        return eftTickerFetchAndSubHandler$mergeTradeAndEftDataRealtime$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ETFInfoResponse eTFInfoResponse = (ETFInfoResponse) this.L$0;
        BigDecimal bigDecimal = (BigDecimal) this.L$1;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (eTFInfoResponse == null) {
            return null;
        }
        String str = this.$symbol;
        return new ETFInfoResponse(str, this.$baseCurrency, bigDecimal != null ? new InterfaceC37432d.Detail(str, bigDecimal) : eTFInfoResponse.getInfo());
    }
}
