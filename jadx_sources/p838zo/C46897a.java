package p838zo;

import com.kubi.tradebase.entity.CurrencyBalance;
import gf.C37885i;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zo.a */
/* JADX INFO: compiled from: CurrencyBalance.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0001\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\u0002\u001a\f\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u0002\u001a\f\u0010\r\u001a\u0004\u0018\u00010\u000b*\u00020\u0002\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\u0002\u001a\f\u0010\u000f\u001a\u0004\u0018\u00010\u000b*\u00020\u0002\u001a\f\u0010\u0010\u001a\u0004\u0018\u00010\u000b*\u00020\u0002\u001a\f\u0010\u0011\u001a\u0004\u0018\u00010\u000b*\u00020\u0002\u001a\f\u0010\u0012\u001a\u0004\u0018\u00010\u000b*\u00020\u0002\u001a\f\u0010\u0013\u001a\u0004\u0018\u00010\u000b*\u00020\u0002\u001a\f\u0010\u0014\u001a\u0004\u0018\u00010\u000b*\u00020\u0002\u001a\f\u0010\u0015\u001a\u0004\u0018\u00010\u000b*\u00020\u0002¨\u0006\u0016"}, m90084d2 = {"getLatestMarkPriceBtc", "Ljava/math/BigDecimal;", "Lcom/kubi/tradebase/entity/CurrencyBalance;", "setLatestMarketPrice", "", "value", "getStableMarkPriceBtc", "getTotalLiability", "getTotalLiabilityBTC", "getTotalBalanceBTC", "getTotalDebtString", "", "getTotalDebtLegalString", "getMaxOutString", "getNetBalanceString", "getAvailableBalanceString", "getAvailableBalanceLegalString", "liabilityInterestIsolateString", "liabilityPrincipalIsolateString", "totalBalanceString", "holdBalanceString", "getHoldBalancePriceString", "MarginApi_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46897a {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final String m103289a(@NotNull CurrencyBalance currencyBalance) {
        Intrinsics.checkNotNullParameter(currencyBalance, "<this>");
        BigDecimal availableBalanceCompat = currencyBalance.getAvailableBalanceCompat();
        if (availableBalanceCompat != null) {
            return C41014a.m89950x(C41014a.m89940n(availableBalanceCompat, currencyBalance.getCurrency()), null, null, 0, false, false, false, true, 63, null);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m103290b(@NotNull CurrencyBalance currencyBalance) {
        Intrinsics.checkNotNullParameter(currencyBalance, "<this>");
        BigDecimal availableBalanceCompat = currencyBalance.getAvailableBalanceCompat();
        if (availableBalanceCompat != null) {
            return C37885i.m85563b(availableBalanceCompat, currencyBalance.getCurrency(), 0, 2, null);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final String m103291c(@NotNull CurrencyBalance currencyBalance) {
        Intrinsics.checkNotNullParameter(currencyBalance, "<this>");
        BigDecimal holdBalance = currencyBalance.getHoldBalance();
        if (holdBalance != null) {
            return C41014a.m89950x(C41014a.m89939m(holdBalance.doubleValue(), currencyBalance.getCurrency()), null, null, 0, false, false, false, true, 63, null);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final BigDecimal m103292d(@NotNull CurrencyBalance currencyBalance) {
        Intrinsics.checkNotNullParameter(currencyBalance, "<this>");
        if (currencyBalance.getLatestMarkPrice() == null) {
            currencyBalance.setLatestMarkPrice(m103295g(currencyBalance));
        }
        return currencyBalance.getLatestMarkPrice();
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final String m103293e(@NotNull CurrencyBalance currencyBalance) {
        Intrinsics.checkNotNullParameter(currencyBalance, "<this>");
        BigDecimal transferOutBalance = currencyBalance.getTransferOutBalance();
        if (transferOutBalance != null) {
            return C37885i.m85563b(transferOutBalance, currencyBalance.getCurrency(), 0, 2, null);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static final String m103294f(@NotNull CurrencyBalance currencyBalance) {
        Intrinsics.checkNotNullParameter(currencyBalance, "<this>");
        BigDecimal netBalance = currencyBalance.getNetBalance();
        if (netBalance != null) {
            return C37885i.m85563b(netBalance, currencyBalance.getCurrency(), 0, 2, null);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final BigDecimal m103295g(@NotNull CurrencyBalance currencyBalance) {
        Intrinsics.checkNotNullParameter(currencyBalance, "<this>");
        if (Intrinsics.areEqual(currencyBalance.getCurrency(), "BTC")) {
            currencyBalance.setMarkPrice(BigDecimal.ONE);
        }
        return currencyBalance.getMarkPrice();
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static final BigDecimal m103296h(@NotNull CurrencyBalance currencyBalance) {
        BigDecimal totalBalance;
        Intrinsics.checkNotNullParameter(currencyBalance, "<this>");
        if (m103292d(currencyBalance) == null || (totalBalance = currencyBalance.getTotalBalance()) == null) {
            return null;
        }
        BigDecimal bigDecimalMultiply = totalBalance.multiply(C41014a.m89921F(m103292d(currencyBalance), "1"));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static final String m103297i(@NotNull CurrencyBalance currencyBalance) {
        Intrinsics.checkNotNullParameter(currencyBalance, "<this>");
        BigDecimal bigDecimalM103299k = m103299k(currencyBalance);
        if (bigDecimalM103299k != null) {
            return C41014a.m89950x(C41014a.m89940n(bigDecimalM103299k, currencyBalance.getCurrency()), null, null, 0, false, false, false, true, 63, null);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static final String m103298j(@NotNull CurrencyBalance currencyBalance) {
        Intrinsics.checkNotNullParameter(currencyBalance, "<this>");
        BigDecimal bigDecimalM103299k = m103299k(currencyBalance);
        if (bigDecimalM103299k != null) {
            return C37885i.m85563b(bigDecimalM103299k, currencyBalance.getCurrency(), 0, 2, null);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static final BigDecimal m103299k(@NotNull CurrencyBalance currencyBalance) {
        Intrinsics.checkNotNullParameter(currencyBalance, "<this>");
        if (currencyBalance.getLiabilityInterest() == null || currencyBalance.getLiabilityPrincipal() == null) {
            return currencyBalance.getLiability();
        }
        BigDecimal liabilityInterest = currencyBalance.getLiabilityInterest();
        if (liabilityInterest != null) {
            return liabilityInterest.add(C41014a.m89922G(currencyBalance.getLiabilityPrincipal(), null, 1, null));
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public static final BigDecimal m103300l(@NotNull CurrencyBalance currencyBalance) {
        BigDecimal bigDecimalM103299k;
        Intrinsics.checkNotNullParameter(currencyBalance, "<this>");
        if (m103292d(currencyBalance) == null || (bigDecimalM103299k = m103299k(currencyBalance)) == null) {
            return null;
        }
        BigDecimal bigDecimalMultiply = bigDecimalM103299k.multiply(C41014a.m89921F(m103292d(currencyBalance), "1"));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public static final String m103301m(@NotNull CurrencyBalance currencyBalance) {
        Intrinsics.checkNotNullParameter(currencyBalance, "<this>");
        BigDecimal holdBalance = currencyBalance.getHoldBalance();
        if (holdBalance != null) {
            return C37885i.m85563b(holdBalance, currencyBalance.getCurrency(), 0, 2, null);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static final String m103302n(@NotNull CurrencyBalance currencyBalance) {
        Intrinsics.checkNotNullParameter(currencyBalance, "<this>");
        BigDecimal liabilityInterest = currencyBalance.getLiabilityInterest();
        if (liabilityInterest != null) {
            return C37885i.m85563b(liabilityInterest, currencyBalance.getCurrency(), 0, 2, null);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public static final String m103303o(@NotNull CurrencyBalance currencyBalance) {
        Intrinsics.checkNotNullParameter(currencyBalance, "<this>");
        BigDecimal liabilityPrincipal = currencyBalance.getLiabilityPrincipal();
        if (liabilityPrincipal != null) {
            return C37885i.m85563b(liabilityPrincipal, currencyBalance.getCurrency(), 0, 2, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static final void m103304p(@NotNull CurrencyBalance currencyBalance, @NotNull BigDecimal value) {
        Intrinsics.checkNotNullParameter(currencyBalance, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        currencyBalance.setLatestMarkPrice(value);
        if (Intrinsics.areEqual(currencyBalance.getCurrency(), "USDT")) {
            C46901e.f104766a.m103310b(value);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public static final String m103305q(@NotNull CurrencyBalance currencyBalance) {
        Intrinsics.checkNotNullParameter(currencyBalance, "<this>");
        BigDecimal totalBalance = currencyBalance.getTotalBalance();
        if (totalBalance != null) {
            return C37885i.m85563b(totalBalance, currencyBalance.getCurrency(), 0, 2, null);
        }
        return null;
    }
}
