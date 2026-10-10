package com.kubi.tradebase.marketamount;

import com.kubi.resources.widget.TradeInputValueAdapter;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.tradebase.marketamount.c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MarketAmountTradeInputAdapter.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/tradebase/marketamount/MarketAmountTradeInputAdapter;", "Lcom/kubi/resources/widget/TradeInputValueAdapter;", "sideProvider", "Lkotlin/Function0;", "Lcom/kubi/tradebase/marketamount/MarketAmountSide;", "unitProvider", "Lcom/kubi/tradebase/marketamount/MarketAmountUnit;", "contextProvider", "Lcom/kubi/tradebase/marketamount/MarketAmountContext;", "businessPrecisionProvider", "", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "businessPrecision", "getBusinessPrecision", "()I", "toBusinessValue", "Ljava/math/BigDecimal;", "displayValue", "toDisplayValue", "businessValue", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarketAmountTradeInputAdapter implements TradeInputValueAdapter {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Function0<MarketAmountSide> f51570a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Function0<MarketAmountUnit> f51571b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Function0<MarketAmountContext> f51572c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Function0<Integer> f51573d;

    /* JADX WARN: Multi-variable type inference failed */
    public MarketAmountTradeInputAdapter(@NotNull Function0<? extends MarketAmountSide> sideProvider, @NotNull Function0<? extends MarketAmountUnit> unitProvider, @NotNull Function0<MarketAmountContext> contextProvider, @NotNull Function0<Integer> businessPrecisionProvider) {
        Intrinsics.checkNotNullParameter(sideProvider, "sideProvider");
        Intrinsics.checkNotNullParameter(unitProvider, "unitProvider");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(businessPrecisionProvider, "businessPrecisionProvider");
        this.f51570a = sideProvider;
        this.f51571b = unitProvider;
        this.f51572c = contextProvider;
        this.f51573d = businessPrecisionProvider;
    }

    @Override // com.kubi.resources.widget.TradeInputValueAdapter
    @Nullable
    /* JADX INFO: renamed from: a */
    public BigDecimal mo55049a(@NotNull BigDecimal businessValue) {
        Intrinsics.checkNotNullParameter(businessValue, "businessValue");
        return MarketAmountConverter.f51569a.m63238d(businessValue, this.f51571b.invoke(), this.f51570a.invoke(), this.f51572c.invoke());
    }

    @Override // com.kubi.resources.widget.TradeInputValueAdapter
    /* JADX INFO: renamed from: b */
    public int mo55050b() {
        return this.f51573d.invoke().intValue();
    }

    @Override // com.kubi.resources.widget.TradeInputValueAdapter
    @Nullable
    /* JADX INFO: renamed from: c */
    public BigDecimal mo55051c(@NotNull BigDecimal displayValue) {
        Intrinsics.checkNotNullParameter(displayValue, "displayValue");
        return MarketAmountConverter.f51569a.m63237c(displayValue, this.f51571b.invoke(), this.f51570a.invoke(), this.f51572c.invoke());
    }
}
