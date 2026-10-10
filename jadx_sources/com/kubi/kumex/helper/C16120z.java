package com.kubi.kumex.helper;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.helper.z */
/* JADX INFO: compiled from: KuMexCalculator.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a:\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a(\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0011"}, m90084d2 = {"calculatorLimitGains", "Ljava/math/BigDecimal;", "isInverse", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, FirebaseAnalytics.Param.PRICE, "qty", "posCost", "closeQty", "calculatorMarketGains", "ps", TtmlNode.TAG_DIV, "other", "scale", "", "roundingMode", "Ljava/math/RoundingMode;", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C16120z {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final BigDecimal m34091a(boolean z11, @NotNull BigDecimal a11, @NotNull BigDecimal price, @NotNull BigDecimal qty, @NotNull BigDecimal posCost, @NotNull BigDecimal closeQty) {
        BigDecimal bigDecimalSubtract;
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(qty, "qty");
        Intrinsics.checkNotNullParameter(posCost, "posCost");
        Intrinsics.checkNotNullParameter(closeQty, "closeQty");
        try {
            try {
                if (price.doubleValue() > 1000000.0d) {
                    price = new BigDecimal("1000000");
                }
                BigDecimal bigDecimal = price;
                if (z11) {
                    BigDecimal bigDecimalMultiply = closeQty.multiply(a11);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                    bigDecimalSubtract = m34094d(bigDecimalMultiply, bigDecimal, 18, null, 4, null).subtract(posCost.multiply(m34094d(closeQty, qty, 18, null, 4, null)));
                } else {
                    bigDecimalSubtract = bigDecimal.multiply(closeQty).multiply(a11).subtract(posCost.multiply(m34094d(closeQty, qty, 18, null, 4, null)));
                }
                Intrinsics.checkNotNull(bigDecimalSubtract);
                return bigDecimalSubtract;
            } catch (Exception unused) {
                return new BigDecimal("0.00");
            }
        } catch (Throwable unused2) {
            return new BigDecimal(0);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final BigDecimal m34092b(boolean z11, @NotNull BigDecimal a11, @Nullable BigDecimal bigDecimal, @NotNull BigDecimal qty, @NotNull BigDecimal posCost, @NotNull BigDecimal closeQty) {
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(qty, "qty");
        Intrinsics.checkNotNullParameter(posCost, "posCost");
        Intrinsics.checkNotNullParameter(closeQty, "closeQty");
        try {
            if (bigDecimal == null) {
                return null;
            }
            try {
                if (bigDecimal.doubleValue() > 1000000.0d) {
                    bigDecimal = new BigDecimal("1000000");
                }
                BigDecimal bigDecimal2 = bigDecimal;
                if (!z11) {
                    return bigDecimal2.multiply(closeQty).multiply(a11).subtract(posCost.multiply(m34094d(closeQty, qty, 18, null, 4, null)));
                }
                BigDecimal bigDecimalMultiply = closeQty.multiply(a11);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                return m34094d(bigDecimalMultiply, bigDecimal2, 18, null, 4, null).subtract(posCost.multiply(m34094d(closeQty, qty, 18, null, 4, null)));
            } catch (Exception unused) {
                return new BigDecimal("0.00");
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ BigDecimal m34094d(BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11, RoundingMode roundingMode, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 18;
        }
        if ((i12 & 4) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        return m34093c(bigDecimal, bigDecimal2, i11, roundingMode);
    }

    /* JADX INFO: renamed from: c */
    public static final BigDecimal m34093c(BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11, RoundingMode roundingMode) {
        BigDecimal bigDecimalDivide = bigDecimal.divide(bigDecimal2, i11, roundingMode);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return bigDecimalDivide;
    }
}
