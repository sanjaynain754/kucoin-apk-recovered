package com.kubi.tradebase.marketamount;

import java.math.BigDecimal;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.tradebase.marketamount.h */
/* JADX INFO: compiled from: MarketAmountUnit.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, m90084d2 = {"toPositiveFiniteBigDecimalOrNull", "Ljava/math/BigDecimal;", "", "TradeBaseLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketAmountUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketAmountUnit.kt\ncom/kubi/tradebase/marketamount/MarketAmountUnitKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
public final class C25898h {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final BigDecimal m63239a(double d11) {
        Double dValueOf = Double.valueOf(d11);
        double dDoubleValue = dValueOf.doubleValue();
        if (Math.abs(dDoubleValue) > Double.MAX_VALUE || dDoubleValue <= 0.0d) {
            dValueOf = null;
        }
        if (dValueOf == null) {
            return null;
        }
        return new BigDecimal(String.valueOf(dValueOf.doubleValue()));
    }
}
