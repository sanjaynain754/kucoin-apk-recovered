package p429lf;

import com.blankj.utilcode.util.C5303w0;
import com.kubi.data.R$string;
import com.kubi.sdk.function.language.LanguageType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.bugly.proguard.C33978va;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: lf.b */
/* JADX INFO: compiled from: FinancialRegulationsEx.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0002\u0001\u0004\u001aP\u0010\u0006\u001a\u00020\u0007*\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u001a\u0010\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u001a\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0013H\u0002\u001a\f\u0010\u001b\u001a\u00020\u0013*\u00020\u0013H\u0002\u001aF\u0010\u001c\u001a\u00020\u0007*\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\f2\b\b\u0002\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\r\u001a\u00020\u000e\u001a\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0013H\u0002\u001a\f\u0010 \u001a\u00020\u0007*\u0004\u0018\u00010\u0007\u001a\f\u0010!\u001a\u00020\u0007*\u0004\u0018\u00010\u0007\u001a\u0018\u0010\"\u001a\u0004\u0018\u00010\b*\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u001a\u0018\u0010#\u001a\u0004\u0018\u00010\b*\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0013\u001a\u001a\u0010$\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0013H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u001e\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0019j\b\u0012\u0004\u0012\u00020\u0007`\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"numberFormatMapLocal", "com/kubi/data/regulations/FinancialRegulationsExKt$numberFormatMapLocal$1", "Lcom/kubi/data/regulations/FinancialRegulationsExKt$numberFormatMapLocal$1;", "percentFormatMapLocal", "com/kubi/data/regulations/FinancialRegulationsExKt$percentFormatMapLocal$1", "Lcom/kubi/data/regulations/FinancialRegulationsExKt$percentFormatMapLocal$1;", "formatNumber", "", "Ljava/math/BigDecimal;", "roundingMode", "Ljava/math/RoundingMode;", "precision", "", "keepZero", "", "isShowLess", "isGroup", "miniPrecision", "cLocale", "Ljava/util/Locale;", "getLanguageNumberFormat", "Ljava/text/NumberFormat;", "generateNumberFormat", "locale", "r2lMap", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "percentLocalMapper", "formatPercentRegular", "maxPrecision", "addPlusSign", "generatePercentFormat", "percentPlaceHolder", "numberPlaceHolder", "asPercentBigDecimalIgnoreSeparator", "asBigDecimalIgnoreSeparator", "convertStringIgnoreSeparator", "LDataProvider_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFinancialRegulationsEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialRegulationsEx.kt\ncom/kubi/data/regulations/FinancialRegulationsExKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,267:1\n1#2:268\n*E\n"})
public final class C42180b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final a f93647a = new a();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final b f93648b = new b();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final HashSet<String> f93649c = SetsKt.hashSetOf("ar_AE", "ur_PK");

    /* JADX INFO: renamed from: lf.b$a */
    /* JADX INFO: compiled from: FinancialRegulationsEx.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00050\u0001J$\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u0005H\u0014¨\u0006\u0007"}, m90084d2 = {"com/kubi/data/regulations/FinancialRegulationsExKt$numberFormatMapLocal$1", "Ljava/lang/ThreadLocal;", "Ljava/util/HashMap;", "Ljava/util/Locale;", "Ljava/text/NumberFormat;", "Lkotlin/collections/HashMap;", "initialValue", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends ThreadLocal<HashMap<Locale, NumberFormat>> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HashMap<Locale, NumberFormat> initialValue() {
            return new HashMap<>();
        }
    }

    /* JADX INFO: renamed from: lf.b$b */
    /* JADX INFO: compiled from: FinancialRegulationsEx.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00050\u0001J$\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u0005H\u0014¨\u0006\u0007"}, m90084d2 = {"com/kubi/data/regulations/FinancialRegulationsExKt$percentFormatMapLocal$1", "Ljava/lang/ThreadLocal;", "Ljava/util/HashMap;", "Ljava/util/Locale;", "Ljava/text/NumberFormat;", "Lkotlin/collections/HashMap;", "initialValue", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends ThreadLocal<HashMap<Locale, NumberFormat>> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HashMap<Locale, NumberFormat> initialValue() {
            return new HashMap<>();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final BigDecimal m92636a(@Nullable String str, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        return DowngradeExKt.m66536f(str != null ? m92638c(str, locale) : null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ BigDecimal m92637b(String str, Locale locale, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            locale = MultiLanguageManager.f46811g.getLocale();
        }
        return m92636a(str, locale);
    }

    /* JADX INFO: renamed from: c */
    public static final String m92638c(String str, Locale locale) {
        String strReplace$default;
        if (SetsKt.hashSetOf("ar_AE", "bn_BD", "ur_PK").contains(locale.toString())) {
            if (str != null) {
                return StringsKt.replace$default(str, ",", "", false, 4, (Object) null);
            }
            return null;
        }
        String strValueOf = Intrinsics.areEqual(locale.toString(), "pt_PT") ? C33978va.f72339h : String.valueOf(DecimalFormatSymbols.getInstance(locale).getGroupingSeparator());
        String strValueOf2 = String.valueOf(DecimalFormatSymbols.getInstance(locale).getDecimalSeparator());
        if (str == null || (strReplace$default = StringsKt.replace$default(str, strValueOf, "", false, 4, (Object) null)) == null) {
            return null;
        }
        return StringsKt.replace$default(strReplace$default, strValueOf2, C33978va.f72339h, false, 4, (Object) null);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m92639d(@NotNull BigDecimal bigDecimal, @NotNull RoundingMode roundingMode, int i11, boolean z11, boolean z12, boolean z13, int i12, @NotNull Locale cLocale) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        Intrinsics.checkNotNullParameter(cLocale, "cLocale");
        NumberFormat numberFormatM92645j = m92645j(cLocale);
        numberFormatM92645j.setRoundingMode(roundingMode);
        numberFormatM92645j.setGroupingUsed(z13);
        numberFormatM92645j.setMaximumFractionDigits(i11);
        if (z11) {
            numberFormatM92645j.setMinimumFractionDigits(i11);
        } else {
            numberFormatM92645j.setMinimumFractionDigits(i12);
        }
        if (z12) {
            BigDecimal bigDecimal2 = BigDecimal.ZERO;
            if (bigDecimal.compareTo(bigDecimal2) != 0 && C41014a.m89919D(bigDecimal.setScale(i11, roundingMode))) {
                return (bigDecimal.compareTo(bigDecimal2) < 0 ? ">-" : "<") + m92640e(C42181c.f93650a.m92654c(i11), null, i11, false, false, false, 0, null, 125, null);
            }
        }
        String str = numberFormatM92645j.format(bigDecimal);
        Intrinsics.checkNotNull(str);
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m92640e(BigDecimal bigDecimal, RoundingMode roundingMode, int i11, boolean z11, boolean z12, boolean z13, int i12, Locale locale, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        if ((i13 & 2) != 0) {
            i11 = 2;
        }
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        if ((i13 & 8) != 0) {
            z12 = false;
        }
        if ((i13 & 16) != 0) {
            z13 = true;
        }
        if ((i13 & 32) != 0) {
            i12 = 0;
        }
        if ((i13 & 64) != 0) {
            locale = MultiLanguageManager.f46811g.getLocale();
        }
        Locale locale2 = locale;
        boolean z14 = z13;
        return m92639d(bigDecimal, roundingMode, i11, z11, z12, z14, i12, locale2);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m92641f(@NotNull BigDecimal bigDecimal, @NotNull Locale cLocale, @NotNull RoundingMode roundingMode, int i11, boolean z11, boolean z12, boolean z13) {
        BigDecimal bigDecimalPow;
        String str;
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(cLocale, "cLocale");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        Locale localeM92648m = m92648m(cLocale);
        b bVar = f93648b;
        HashMap<Locale, NumberFormat> map = bVar.get();
        if (map == null) {
            map = new HashMap<>();
            bVar.set(map);
        }
        NumberFormat numberFormatM92644i = map.get(localeM92648m);
        if (numberFormatM92644i == null) {
            numberFormatM92644i = m92644i(localeM92648m);
            map.put(localeM92648m, numberFormatM92644i);
        }
        numberFormatM92644i.setGroupingUsed(true);
        numberFormatM92644i.setMaximumFractionDigits(i11);
        int i12 = i11 + 2;
        boolean zM89919D = C41014a.m89919D(bigDecimal.setScale(i12, RoundingMode.DOWN));
        if (z13) {
            numberFormatM92644i.setMinimumFractionDigits(Math.min(i11, 4));
        } else {
            numberFormatM92644i.setMinimumFractionDigits(0);
        }
        numberFormatM92644i.setRoundingMode(roundingMode);
        String str2 = "";
        if (z12 && !C41014a.m89919D(bigDecimal) && zM89919D) {
            str = bigDecimal.compareTo(BigDecimal.ZERO) > 0 ? "<" : ">-";
            bigDecimalPow = new BigDecimal("0.1").pow(i12);
        } else {
            bigDecimalPow = bigDecimal;
            str = "";
        }
        boolean zContains = f93649c.contains(cLocale.toString());
        if (z11 && bigDecimal.compareTo(BigDecimal.ZERO) > 0) {
            str2 = "+";
        }
        C42181c c42181c = C42181c.f93650a;
        String str3 = numberFormatM92644i.format(bigDecimalPow);
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        return str2 + str + c42181c.m92655d(str3, zContains);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ String m92642g(BigDecimal bigDecimal, Locale locale, RoundingMode roundingMode, int i11, boolean z11, boolean z12, boolean z13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            locale = MultiLanguageManager.f46811g.getLocale();
        }
        if ((i12 & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        if ((i12 & 4) != 0) {
            i11 = 2;
        }
        if ((i12 & 8) != 0) {
            z11 = false;
        }
        if ((i12 & 16) != 0) {
            z12 = false;
        }
        if ((i12 & 32) != 0) {
            z13 = true;
        }
        return m92641f(bigDecimal, locale, roundingMode, i11, z11, z12, z13);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final NumberFormat m92645j(@NotNull Locale cLocale) {
        Intrinsics.checkNotNullParameter(cLocale, "cLocale");
        a aVar = f93647a;
        HashMap<Locale, NumberFormat> map = aVar.get();
        if (map == null) {
            map = new HashMap<>();
            aVar.set(map);
        }
        NumberFormat numberFormat = map.get(cLocale);
        if (numberFormat != null) {
            return numberFormat;
        }
        NumberFormat numberFormatM92643h = m92643h(cLocale);
        map.put(cLocale, numberFormatM92643h);
        return numberFormatM92643h;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ NumberFormat m92646k(Locale locale, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            locale = MultiLanguageManager.f46811g.getLocale();
        }
        return m92645j(locale);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final String m92647l(@Nullable String str) {
        return str == null ? C27017c.f54310a.m66516f(R$string.stub, new Object[0]) : str;
    }

    /* JADX INFO: renamed from: m */
    public static final Locale m92648m(Locale locale) {
        return f93649c.contains(locale.toString()) ? LanguageType.f46799TR.getLocale() : locale;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static final String m92649n(@Nullable String str) {
        if (str == null) {
            return C5303w0.m6511a() ? "%-" : "-%";
        }
        return str;
    }

    /* JADX INFO: renamed from: h */
    public static final NumberFormat m92643h(Locale locale) {
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        if (numberFormat instanceof DecimalFormat) {
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(locale);
            decimalFormatSymbols.setZeroDigit(new DecimalFormatSymbols(Locale.US).getZeroDigit());
            if (Intrinsics.areEqual(locale, LanguageType.f46796PT.getLocale())) {
                decimalFormatSymbols.setGroupingSeparator('.');
            }
            if (Intrinsics.areEqual(locale, LanguageType.f46785AR.getLocale())) {
                decimalFormatSymbols.setGroupingSeparator(',');
                decimalFormatSymbols.setDecimalSeparator('.');
            }
            ((DecimalFormat) numberFormat).setDecimalFormatSymbols(decimalFormatSymbols);
        }
        Intrinsics.checkNotNull(numberFormat);
        return numberFormat;
    }

    /* JADX INFO: renamed from: i */
    public static final NumberFormat m92644i(Locale locale) {
        NumberFormat percentInstance = NumberFormat.getPercentInstance(locale);
        if (percentInstance instanceof DecimalFormat) {
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(locale);
            decimalFormatSymbols.setZeroDigit(new DecimalFormatSymbols(Locale.US).getZeroDigit());
            if (Intrinsics.areEqual(locale, LanguageType.f46796PT.getLocale())) {
                decimalFormatSymbols.setGroupingSeparator('.');
            }
            ((DecimalFormat) percentInstance).setDecimalFormatSymbols(decimalFormatSymbols);
        }
        Intrinsics.checkNotNull(percentInstance);
        return percentInstance;
    }
}
