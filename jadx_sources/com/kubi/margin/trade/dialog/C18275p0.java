package com.kubi.margin.trade.dialog;

import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.margin.R$string;
import com.kubi.tradebase.marketamount.MarketAmountUnit;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.margin.trade.dialog.p0 */
/* JADX INFO: compiled from: MarginConfirmDialog.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001aH\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0000¨\u0006\u000e"}, m90084d2 = {"resolveOrderAmountDisplay", "Lcom/kubi/margin/trade/dialog/MarginOrderAmountDisplay;", "isBuy", "", "symbol", "Lcom/kubi/data/entity/SymbolInfoEntity;", "fallbackAmount", "Ljava/math/BigDecimal;", "fallbackCurrency", "", "fallbackCurrencyName", "marketDisplayAmount", "marketAmountUnit", "Lcom/kubi/tradebase/marketamount/MarketAmountUnit;", "MarginLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C18275p0 {

    /* JADX INFO: renamed from: com.kubi.margin.trade.dialog.p0$a */
    /* JADX INFO: compiled from: MarginConfirmDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketAmountUnit.values().length];
            try {
                iArr[MarketAmountUnit.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketAmountUnit.QUOTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final MarginOrderAmountDisplay m40272a(boolean z11, @NotNull SymbolInfoEntity symbol, @NotNull BigDecimal fallbackAmount, @Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable MarketAmountUnit marketAmountUnit) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(fallbackAmount, "fallbackAmount");
        if (bigDecimal == null || marketAmountUnit == null) {
            return new MarginOrderAmountDisplay(z11 ? R$string.margin_order_total_amount : R$string.margin_order_count, fallbackAmount, str, str2);
        }
        int i11 = a.$EnumSwitchMapping$0[marketAmountUnit.ordinal()];
        if (i11 == 1) {
            return new MarginOrderAmountDisplay(R$string.margin_order_count, bigDecimal, symbol.getBaseCurrency(), symbol.getBaseCurrencyName());
        }
        if (i11 == 2) {
            return new MarginOrderAmountDisplay(R$string.margin_order_total_amount, bigDecimal, symbol.getQuoteCurrency(), symbol.getQuoteCurrencyName());
        }
        throw new NoWhenBranchMatchedException();
    }
}
