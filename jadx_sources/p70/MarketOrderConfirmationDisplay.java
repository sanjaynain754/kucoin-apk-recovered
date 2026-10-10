package p70;

import com.kubi.tradebase.marketamount.MarketAmountUnit;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: p70.b, reason: from toString */
/* JADX INFO: compiled from: MarketOrderConfirmationDisplay.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/utaspotlib/biz/order/infodetail/MarketOrderConfirmationDisplay;", "", "value", "Ljava/math/BigDecimal;", "unit", "Lcom/kubi/tradebase/marketamount/MarketAmountUnit;", "currencyName", "", "showQuantity", "", "<init>", "(Ljava/math/BigDecimal;Lcom/kubi/tradebase/marketamount/MarketAmountUnit;Ljava/lang/String;Z)V", "getValue", "()Ljava/math/BigDecimal;", "getUnit", "()Lcom/kubi/tradebase/marketamount/MarketAmountUnit;", "getCurrencyName", "()Ljava/lang/String;", "getShowQuantity", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarketOrderConfirmationDisplay {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final BigDecimal value;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final MarketAmountUnit unit;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final String currencyName;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final boolean showQuantity;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketOrderConfirmationDisplay)) {
            return false;
        }
        MarketOrderConfirmationDisplay marketOrderConfirmationDisplay = (MarketOrderConfirmationDisplay) other;
        return Intrinsics.areEqual(this.value, marketOrderConfirmationDisplay.value) && this.unit == marketOrderConfirmationDisplay.unit && Intrinsics.areEqual(this.currencyName, marketOrderConfirmationDisplay.currencyName) && this.showQuantity == marketOrderConfirmationDisplay.showQuantity;
    }

    public MarketOrderConfirmationDisplay(@NotNull BigDecimal value, @NotNull MarketAmountUnit unit, @NotNull String currencyName, boolean z11) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(currencyName, "currencyName");
        this.value = value;
        this.unit = unit;
        this.currencyName = currencyName;
        this.showQuantity = z11;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShowQuantity() {
        return this.showQuantity;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((this.value.hashCode() * 31) + this.unit.hashCode()) * 31) + this.currencyName.hashCode()) * 31) + Boolean.hashCode(this.showQuantity);
    }

    @NotNull
    public String toString() {
        return "MarketOrderConfirmationDisplay(value=" + this.value + ", unit=" + this.unit + ", currencyName=" + this.currencyName + ", showQuantity=" + this.showQuantity + ')';
    }
}
