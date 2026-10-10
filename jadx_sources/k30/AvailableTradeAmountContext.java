package k30;

import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: k30.b, reason: from toString */
/* JADX INFO: compiled from: AvailableTradeAmount.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u000bHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006("}, m90084d2 = {"Lcom/kubi/tradebase/available/AvailableTradeAmountContext;", "", "accountMode", "", "symbol", "baseCurrency", "quoteCurrency", "baseIncrement", "Ljava/math/BigDecimal;", "quoteIncrement", "basePrecision", "", "quotePrecision", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;II)V", "getAccountMode", "()Ljava/lang/String;", "getSymbol", "getBaseCurrency", "getQuoteCurrency", "getBaseIncrement", "()Ljava/math/BigDecimal;", "getQuoteIncrement", "getBasePrecision", "()I", "getQuotePrecision", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AvailableTradeAmountContext {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String accountMode;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String symbol;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final String baseCurrency;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final String quoteCurrency;

    /* JADX INFO: renamed from: e, reason: from toString */
    @NotNull
    public final BigDecimal baseIncrement;

    /* JADX INFO: renamed from: f, reason: from toString */
    @NotNull
    public final BigDecimal quoteIncrement;

    /* JADX INFO: renamed from: g, reason: from toString */
    public final int basePrecision;

    /* JADX INFO: renamed from: h, reason: from toString */
    public final int quotePrecision;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableTradeAmountContext)) {
            return false;
        }
        AvailableTradeAmountContext availableTradeAmountContext = (AvailableTradeAmountContext) other;
        return Intrinsics.areEqual(this.accountMode, availableTradeAmountContext.accountMode) && Intrinsics.areEqual(this.symbol, availableTradeAmountContext.symbol) && Intrinsics.areEqual(this.baseCurrency, availableTradeAmountContext.baseCurrency) && Intrinsics.areEqual(this.quoteCurrency, availableTradeAmountContext.quoteCurrency) && Intrinsics.areEqual(this.baseIncrement, availableTradeAmountContext.baseIncrement) && Intrinsics.areEqual(this.quoteIncrement, availableTradeAmountContext.quoteIncrement) && this.basePrecision == availableTradeAmountContext.basePrecision && this.quotePrecision == availableTradeAmountContext.quotePrecision;
    }

    public AvailableTradeAmountContext(@NotNull String accountMode, @NotNull String symbol, @NotNull String baseCurrency, @NotNull String quoteCurrency, @NotNull BigDecimal baseIncrement, @NotNull BigDecimal quoteIncrement, int i11, int i12) {
        Intrinsics.checkNotNullParameter(accountMode, "accountMode");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
        Intrinsics.checkNotNullParameter(baseIncrement, "baseIncrement");
        Intrinsics.checkNotNullParameter(quoteIncrement, "quoteIncrement");
        this.accountMode = accountMode;
        this.symbol = symbol;
        this.baseCurrency = baseCurrency;
        this.quoteCurrency = quoteCurrency;
        this.baseIncrement = baseIncrement;
        this.quoteIncrement = quoteIncrement;
        this.basePrecision = i11;
        this.quotePrecision = i12;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccountMode() {
        return this.accountMode;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getBaseIncrement() {
        return this.baseIncrement;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getBasePrecision() {
        return this.basePrecision;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final BigDecimal getQuoteIncrement() {
        return this.quoteIncrement;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getQuotePrecision() {
        return this.quotePrecision;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        return (((((((((((((this.accountMode.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.baseCurrency.hashCode()) * 31) + this.quoteCurrency.hashCode()) * 31) + this.baseIncrement.hashCode()) * 31) + this.quoteIncrement.hashCode()) * 31) + Integer.hashCode(this.basePrecision)) * 31) + Integer.hashCode(this.quotePrecision);
    }

    @NotNull
    public String toString() {
        return "AvailableTradeAmountContext(accountMode=" + this.accountMode + ", symbol=" + this.symbol + ", baseCurrency=" + this.baseCurrency + ", quoteCurrency=" + this.quoteCurrency + ", baseIncrement=" + this.baseIncrement + ", quoteIncrement=" + this.quoteIncrement + ", basePrecision=" + this.basePrecision + ", quotePrecision=" + this.quotePrecision + ')';
    }
}
