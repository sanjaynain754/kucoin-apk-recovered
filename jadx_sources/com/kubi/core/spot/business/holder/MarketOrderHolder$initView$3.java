package com.kubi.core.spot.business.holder;

import com.kubi.tradebase.marketamount.MarketAmountContext;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: MarketOrderHolder.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* synthetic */ class MarketOrderHolder$initView$3 extends FunctionReferenceImpl implements Function0<MarketAmountContext> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p852kotlin.jvm.functions.Function0
    public final MarketAmountContext invoke() {
        return ((MarketOrderHolder) this.receiver).m23112U1();
    }

    public MarketOrderHolder$initView$3(Object obj) {
        super(0, obj, MarketOrderHolder.class, "marketAmountContext", "marketAmountContext()Lcom/kubi/tradebase/marketamount/MarketAmountContext;", 0);
    }
}
