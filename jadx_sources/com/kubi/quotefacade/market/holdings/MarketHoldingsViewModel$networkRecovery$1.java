package com.kubi.quotefacade.market.holdings;

import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: MarketHoldingsViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* synthetic */ class MarketHoldingsViewModel$networkRecovery$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // p852kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    public MarketHoldingsViewModel$networkRecovery$1(Object obj) {
        super(0, obj, MarketHoldingsViewModel.class, "requestNetworkRecoveryRefresh", "requestNetworkRecoveryRefresh()V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((MarketHoldingsViewModel) this.receiver).m52561T();
    }
}
