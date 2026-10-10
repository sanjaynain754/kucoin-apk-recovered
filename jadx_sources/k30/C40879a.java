package k30;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: k30.a */
/* JADX INFO: compiled from: AvailableTradeAmount.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005J&\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0005J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/tradebase/available/AvailableTradeAmountCalculator;", "", "<init>", "()V", "calculateBuy", "Ljava/math/BigDecimal;", "quoteAvailable", "executionPrice", "feeRate", "baseIncrement", "calculateSell", "baseAvailable", "quoteIncrement", "alignDown", "value", "increment", "isValidAmount", "", "isValidFee", "isPositive", "CALCULATION_SCALE", "", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40879a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C40879a f90891a = new C40879a();

    /* JADX INFO: renamed from: d */
    public final boolean m89480d(BigDecimal bigDecimal) {
        return bigDecimal != null && bigDecimal.signum() > 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m89481e(BigDecimal bigDecimal) {
        return bigDecimal != null && bigDecimal.signum() >= 0;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m89482f(BigDecimal bigDecimal) {
        return bigDecimal != null && bigDecimal.signum() >= 0 && BigDecimal.ONE.add(bigDecimal).signum() > 0;
    }

    /* JADX INFO: renamed from: a */
    public final BigDecimal m89477a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        if (bigDecimal.signum() == 0) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        BigDecimal bigDecimalMultiply = bigDecimal.divide(bigDecimal2, 0, RoundingMode.DOWN).multiply(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final BigDecimal m89478b(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4) {
        if (!m89481e(bigDecimal) || !m89480d(bigDecimal2) || !m89482f(bigDecimal3) || !m89480d(bigDecimal4)) {
            return null;
        }
        Intrinsics.checkNotNull(bigDecimal2);
        BigDecimal bigDecimal5 = BigDecimal.ONE;
        Intrinsics.checkNotNull(bigDecimal3);
        BigDecimal bigDecimalMultiply = bigDecimal2.multiply(bigDecimal5.add(bigDecimal3));
        if (bigDecimalMultiply.signum() <= 0) {
            return null;
        }
        Intrinsics.checkNotNull(bigDecimal);
        BigDecimal bigDecimalDivide = bigDecimal.divide(bigDecimalMultiply, 32, RoundingMode.DOWN);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        Intrinsics.checkNotNull(bigDecimal4);
        return m89477a(bigDecimalDivide, bigDecimal4);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final BigDecimal m89479c(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3) {
        if (m89481e(bigDecimal) && m89480d(bigDecimal2) && m89480d(bigDecimal3)) {
            Intrinsics.checkNotNull(bigDecimal);
            Intrinsics.checkNotNull(bigDecimal2);
            BigDecimal bigDecimalMultiply = bigDecimal.multiply(bigDecimal2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            Intrinsics.checkNotNull(bigDecimal3);
            return m89477a(bigDecimalMultiply, bigDecimal3);
        }
        return null;
    }
}
