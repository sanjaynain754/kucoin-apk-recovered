package p402kf;

import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: kf.b */
/* JADX INFO: compiled from: ChainLegalPriceFormat.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\u001a*\u0010\u0002\u001a\u00020\u0003*\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a*\u0010\n\u001a\u00020\u0003*\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a$\u0010\u000b\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\f\u0010\r\u001a\u00020\t*\u00020\u0001H\u0002\u001a\u0014\u0010\u000e\u001a\u00020\t*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\tH\u0002\u001a \u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\n\u0010\u0014\u001a\u00020\u0005*\u00020\u0015\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"PRICE_DECIMAL_THRESHOLD", "Ljava/math/BigDecimal;", "formatChainLegalPrice", "Landroid/text/SpannableStringBuilder;", "legal", "", "roundingMode", "Ljava/math/RoundingMode;", "numberOfZeroWhenFolding", "", "formatChainStyleLegalFiatDisplay", "buildLegalPriceSpannable", "legalPrefix", "getPriceDefaultPrecision", "findDecimalPrecisionOffset", TypedValues.CycleType.S_WAVE_OFFSET, "applyFoldingZeroIfNeeded", "fullPriceString", "foldEligible", "", "getCoinLegalPriceFromK", "", "LDataProvider_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChainLegalPriceFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainLegalPriceFormat.kt\ncom/kubi/data/rate/ChainLegalPriceFormatKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,137:1\n158#2,6:138\n158#2,6:144\n*S KotlinDebug\n*F\n+ 1 ChainLegalPriceFormat.kt\ncom/kubi/data/rate/ChainLegalPriceFormatKt\n*L\n92#1:138,6\n116#1:144,6\n*E\n"})
public final class C41015b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final BigDecimal f91243a = new BigDecimal("0.00000001");

    /* JADX INFO: renamed from: a */
    public static final SpannableStringBuilder m89954a(String str, boolean z11, int i11) {
        if (!z11) {
            return new SpannableStringBuilder(str);
        }
        NumberFormat numberFormatM92646k = C42180b.m92646k(null, 1, null);
        Intrinsics.checkNotNull(numberFormatM92646k, "null cannot be cast to non-null type java.text.DecimalFormat");
        String strValueOf = String.valueOf(((DecimalFormat) numberFormatM92646k).getDecimalFormatSymbols().getDecimalSeparator());
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, strValueOf, 0, false, 6, (Object) null);
        int i12 = -1;
        if (iIndexOf$default == -1) {
            return new SpannableStringBuilder(str);
        }
        String strSubstring = str.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = str.substring(iIndexOf$default + strValueOf.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        int length = strSubstring2.length();
        for (int i13 = 0; i13 < length; i13++) {
            if (strSubstring2.charAt(i13) != '0') {
                i12 = i13;
                break;
            }
        }
        if (i12 < i11 || strSubstring2.length() <= i12) {
            return new SpannableStringBuilder(str);
        }
        String strSubstring3 = strSubstring2.substring(i12);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) strSubstring);
        spannableStringBuilder.append((CharSequence) strValueOf);
        spannableStringBuilder.append((CharSequence) "0");
        spannableStringBuilder.append(String.valueOf(i12), new RelativeSizeSpan(0.6f), 33);
        spannableStringBuilder.append((CharSequence) strSubstring3);
        return spannableStringBuilder;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final SpannableStringBuilder m89957d(@NotNull BigDecimal bigDecimal, @Nullable String str, @NotNull RoundingMode roundingMode, int i11) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        BigDecimal bigDecimalAbs = new BigDecimal(String.valueOf(C41014a.m89940n(bigDecimal, "USD"))).abs();
        if (str == null) {
            str = C41016c.m89966d();
        }
        Intrinsics.checkNotNull(bigDecimalAbs);
        Intrinsics.checkNotNull(str);
        return m89955b(bigDecimalAbs, str, roundingMode, i11);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ SpannableStringBuilder m89958e(BigDecimal bigDecimal, String str, RoundingMode roundingMode, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = C41016c.m89966d();
        }
        if ((i12 & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        if ((i12 & 4) != 0) {
            i11 = 4;
        }
        return m89957d(bigDecimal, str, roundingMode, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final SpannableStringBuilder m89959f(@NotNull BigDecimal bigDecimal, @Nullable String str, @NotNull RoundingMode roundingMode, int i11) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        if (bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
            return new SpannableStringBuilder("--");
        }
        BigDecimal bigDecimalAbs = bigDecimal.abs();
        if (str == null) {
            str = C41016c.m89966d();
        }
        Intrinsics.checkNotNull(bigDecimalAbs);
        Intrinsics.checkNotNull(str);
        return m89955b(bigDecimalAbs, str, roundingMode, i11);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ SpannableStringBuilder m89960g(BigDecimal bigDecimal, String str, RoundingMode roundingMode, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = C41016c.m89966d();
        }
        if ((i12 & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        if ((i12 & 4) != 0) {
            i11 = 4;
        }
        return m89959f(bigDecimal, str, roundingMode, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m89961h(double d11) {
        return C41014a.m89929c(new BigDecimal(String.valueOf(C41014a.m89939m(d11, "USD"))), false, true, 1, null);
    }

    /* JADX INFO: renamed from: i */
    public static final int m89962i(BigDecimal bigDecimal) {
        if (bigDecimal.compareTo(BigDecimal.ONE) >= 0) {
            return 2;
        }
        if (bigDecimal.compareTo(f91243a) >= 0) {
            return m89956c(bigDecimal, 4);
        }
        if (bigDecimal.compareTo(BigDecimal.ZERO) > 0) {
            return m89956c(bigDecimal, 2);
        }
        return 2;
    }

    /* JADX INFO: renamed from: b */
    public static final SpannableStringBuilder m89955b(BigDecimal bigDecimal, String str, RoundingMode roundingMode, int i11) {
        boolean z11;
        String str2 = str + C42180b.m92640e(bigDecimal, roundingMode, m89962i(bigDecimal), false, false, false, 0, null, 124, null);
        if (i11 > 0 && bigDecimal.compareTo(BigDecimal.ZERO) > 0 && bigDecimal.compareTo(BigDecimal.ONE) < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        return m89954a(str2, z11, i11);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX INFO: renamed from: c */
    public static final int m89956c(BigDecimal bigDecimal, int i11) {
        String plainString = bigDecimal.toPlainString();
        Intrinsics.checkNotNull(plainString);
        int i12 = 0;
        if (StringsKt.contains$default((CharSequence) plainString, '.', false, 2, (Object) null)) {
            String strSubstringAfter$default = StringsKt.substringAfter$default(plainString, '.', (String) null, 2, (Object) null);
            int length = strSubstringAfter$default.length();
            while (i12 < length) {
                if (strSubstringAfter$default.charAt(i12) == '0') {
                    i12++;
                } else if (i12 >= 0) {
                    return i12 + i11;
                }
            }
            i12 = -1;
            if (i12 >= 0) {
                return i12 + i11;
            }
        }
        return i11;
    }
}
