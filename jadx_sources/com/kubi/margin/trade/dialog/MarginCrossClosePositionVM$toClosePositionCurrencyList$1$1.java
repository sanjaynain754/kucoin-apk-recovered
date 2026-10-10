package com.kubi.margin.trade.dialog;

import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: MarginCrossClosePositionVM.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* synthetic */ class MarginCrossClosePositionVM$toClosePositionCurrencyList$1$1 extends FunctionReferenceImpl implements Function1<ClosePositionCurrency, Unit> {
    @Override // p852kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ClosePositionCurrency closePositionCurrency) {
        invoke2(closePositionCurrency);
        return Unit.INSTANCE;
    }

    public MarginCrossClosePositionVM$toClosePositionCurrencyList$1$1(Object obj) {
        super(1, obj, MarginCrossClosePositionVM.class, "invokeCurrencyChange", "invokeCurrencyChange(Lcom/kubi/margin/trade/dialog/ClosePositionCurrency;)V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ClosePositionCurrency closePositionCurrency) {
        ((MarginCrossClosePositionVM) this.receiver).invokeCurrencyChange(closePositionCurrency);
    }
}
