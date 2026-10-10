package dj;

import com.tencent.bugly.proguard.C33978va;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import p852kotlin.text.Typography;

/* JADX INFO: renamed from: dj.e */
/* JADX INFO: compiled from: PriceEx.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001f\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007\u001a\n\u0010\b\u001a\u00020\t*\u00020\u0003\u001a\u0012\u0010\n\u001a\u00020\u000b*\u00020\t2\u0006\u0010\f\u001a\u00020\t\u001a\u001a\u0010\u0006\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\t\u001a\n\u0010\r\u001a\u00020\u000b*\u00020\t\u001a\f\u0010\u000e\u001a\u00020\u0001*\u0004\u0018\u00010\u0001¨\u0006\u000f"}, m90084d2 = {"formatPriceChangeRateToString", "", "lastDealPrice", "", "openPrice", "(Ljava/lang/Double;Ljava/lang/Double;)Ljava/lang/String;", "getPriceChangeRate", "(Ljava/lang/Double;Ljava/lang/Double;)D", "toBigDecimal", "Ljava/math/BigDecimal;", "isEq", "", "other", "cpZero", "adjustRate", "HomeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36720e {
    /* JADX INFO: renamed from: d */
    public static final double m82284d(@Nullable Double d11, @Nullable Double d12) {
        return m82285e(d11 != null ? m82286f(d11.doubleValue()) : null, d12 != null ? m82286f(d12.doubleValue()) : null);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m82281a(@Nullable String str) {
        if (str == null) {
            return "- -";
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) C33978va.f72339h, false, 2, (Object) null) && str.length() > 10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) str.subSequence(0, 9));
            sb2.append(Typography.ellipsis);
            return sb2.toString();
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) C33978va.f72339h, false, 2, (Object) null) || str.length() <= 9) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((Object) str.subSequence(0, 8));
        sb3.append(Typography.ellipsis);
        return sb3.toString();
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m82282b(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return bigDecimal.compareTo(BigDecimal.ZERO) == 0;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m82283c(@Nullable Double d11, @Nullable Double d12) {
        return (d12 == null || Intrinsics.areEqual(d12, 0.0d) || d12.doubleValue() < 0.0d || d11 == null || d11.doubleValue() < 0.0d || Intrinsics.areEqual(d11, 0.0d)) ? "- -" : m82281a(C42180b.m92642g(m82286f((d11.doubleValue() - d12.doubleValue()) / d12.doubleValue()), null, null, 0, true, false, false, 55, null));
    }

    /* JADX INFO: renamed from: e */
    public static final double m82285e(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        if (bigDecimal2 == null || m82282b(bigDecimal2)) {
            return 0.0d;
        }
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        if (bigDecimal2.compareTo(bigDecimal3) < 0 || bigDecimal == null || bigDecimal.compareTo(bigDecimal3) < 0 || m82282b(bigDecimal)) {
            return 0.0d;
        }
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimal2, RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return bigDecimalDivide.setScale(4, RoundingMode.HALF_UP).doubleValue();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final BigDecimal m82286f(double d11) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d11);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return bigDecimalValueOf;
    }
}
