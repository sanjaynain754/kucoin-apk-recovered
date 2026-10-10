package com.kubi.core.spot.business.holder;

import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: MarketOrderHolder.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* synthetic */ class MarketOrderHolder$initView$4 extends FunctionReferenceImpl implements Function0<Integer> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p852kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(((MarketOrderHolder) this.receiver).m23111T1());
    }

    public MarketOrderHolder$initView$4(Object obj) {
        super(0, obj, MarketOrderHolder.class, "marketAmountBusinessPrecision", "marketAmountBusinessPrecision()I", 0);
    }
}
