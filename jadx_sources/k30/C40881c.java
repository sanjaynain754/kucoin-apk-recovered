package k30;

import com.fasterxml.jackson.databind.node.C6447a;
import java.math.BigDecimal;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: k30.c */
/* JADX INFO: compiled from: AvailableTradeAmount.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u0006H\u0002\u001a\u000e\u0010\u0007\u001a\u00020\b*\u0004\u0018\u00010\u0006H\u0002¨\u0006\t"}, m90084d2 = {"normalizedEquals", "", "Lcom/kubi/tradebase/available/AvailableTradeCapacity;", "other", "Lcom/kubi/tradebase/available/AvailableTradeAmountContext;", "normalized", "Ljava/math/BigDecimal;", "normalizedKey", "", "TradeBaseLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40881c {
    /* JADX INFO: renamed from: f */
    public static final boolean m89496f(AvailableTradeAmountContext availableTradeAmountContext, AvailableTradeAmountContext availableTradeAmountContext2) {
        return availableTradeAmountContext != null && Intrinsics.areEqual(availableTradeAmountContext.getAccountMode(), availableTradeAmountContext2.getAccountMode()) && Intrinsics.areEqual(availableTradeAmountContext.getSymbol(), availableTradeAmountContext2.getSymbol()) && Intrinsics.areEqual(availableTradeAmountContext.getBaseCurrency(), availableTradeAmountContext2.getBaseCurrency()) && Intrinsics.areEqual(availableTradeAmountContext.getQuoteCurrency(), availableTradeAmountContext2.getQuoteCurrency()) && Intrinsics.areEqual(m89495e(availableTradeAmountContext.getBaseIncrement()), m89495e(availableTradeAmountContext2.getBaseIncrement())) && Intrinsics.areEqual(m89495e(availableTradeAmountContext.getQuoteIncrement()), m89495e(availableTradeAmountContext2.getQuoteIncrement())) && availableTradeAmountContext.getBasePrecision() == availableTradeAmountContext2.getBasePrecision() && availableTradeAmountContext.getQuotePrecision() == availableTradeAmountContext2.getQuotePrecision();
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m89497g(AvailableTradeCapacity availableTradeCapacity, AvailableTradeCapacity availableTradeCapacity2) {
        if (Intrinsics.areEqual(m89495e(availableTradeCapacity != null ? availableTradeCapacity.getQuoteAvailable() : null), m89495e(availableTradeCapacity2.getQuoteAvailable()))) {
            return Intrinsics.areEqual(m89495e(availableTradeCapacity != null ? availableTradeCapacity.getBaseAvailable() : null), m89495e(availableTradeCapacity2.getBaseAvailable()));
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static final BigDecimal m89495e(BigDecimal bigDecimal) {
        if (bigDecimal != null) {
            return C6447a.m11724a(bigDecimal);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final String m89498h(BigDecimal bigDecimal) {
        String plainString;
        BigDecimal bigDecimalM89495e = m89495e(bigDecimal);
        if (bigDecimalM89495e != null) {
            plainString = bigDecimalM89495e.toPlainString();
        } else {
            plainString = null;
        }
        if (plainString == null) {
            return "";
        }
        return plainString;
    }
}
