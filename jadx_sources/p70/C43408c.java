package p70;

import com.kubi.tradebase.marketamount.MarketAmountUnit;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: p70.c */
/* JADX INFO: compiled from: MarketOrderConfirmationDisplay.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¨\u0006\t"}, m90084d2 = {"resolveMarketOrderConfirmationDisplay", "Lcom/kubi/utaspotlib/biz/order/infodetail/MarketOrderConfirmationDisplay;", "value", "Ljava/math/BigDecimal;", "unit", "Lcom/kubi/tradebase/marketamount/MarketAmountUnit;", "baseCurrencyName", "", "quoteCurrencyName", "UtaSpotLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43408c {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final MarketOrderConfirmationDisplay m95594a(@NotNull BigDecimal value, @NotNull MarketAmountUnit unit, @NotNull String baseCurrencyName, @NotNull String quoteCurrencyName) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(baseCurrencyName, "baseCurrencyName");
        Intrinsics.checkNotNullParameter(quoteCurrencyName, "quoteCurrencyName");
        MarketAmountUnit marketAmountUnit = MarketAmountUnit.BASE;
        if (unit != marketAmountUnit) {
            baseCurrencyName = quoteCurrencyName;
        }
        return new MarketOrderConfirmationDisplay(value, unit, baseCurrencyName, unit == marketAmountUnit);
    }
}
