package com.facebook.hermes.intl;

import android.icu.text.CompactDecimalFormat;
import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.icu.text.MeasureFormat;
import android.icu.text.NumberingSystem;
import android.icu.util.Currency;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.icu.util.ULocale;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tuicore.TUIThemeManager;
import java.text.AttributedCharacterIterator;
import java.text.Format;
import java.util.ArrayList;
import p359j5.C40275d;
import p359j5.C40278g;
import p359j5.InterfaceC40273b;

/* JADX INFO: renamed from: com.facebook.hermes.intl.e */
/* JADX INFO: compiled from: PlatformNumberFormatterICU.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5634e implements IPlatformNumberFormatter {

    /* JADX INFO: renamed from: a */
    public Format f8791a;

    /* JADX INFO: renamed from: b */
    public android.icu.text.NumberFormat f8792b;

    /* JADX INFO: renamed from: c */
    public C40278g f8793c;

    /* JADX INFO: renamed from: d */
    public IPlatformNumberFormatter.Style f8794d;

    /* JADX INFO: renamed from: e */
    public MeasureUnit f8795e;

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public C5634e mo9012f(int i11) {
        if (i11 != -1) {
            this.f8792b.setMinimumIntegerDigits(i11);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public C5634e mo9015i(IPlatformNumberFormatter.SignDisplay signDisplay) {
        android.icu.text.NumberFormat numberFormat = this.f8792b;
        if (numberFormat instanceof DecimalFormat) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
            if (Build.VERSION.SDK_INT >= 31) {
                int i11 = a.f8796a[signDisplay.ordinal()];
                if (i11 == 1) {
                    decimalFormat.setSignAlwaysShown(false);
                    return this;
                }
                if (i11 == 2 || i11 == 3) {
                    decimalFormat.setSignAlwaysShown(true);
                    return this;
                }
            } else {
                int i12 = a.f8796a[signDisplay.ordinal()];
                if (i12 == 1) {
                    decimalFormat.setPositivePrefix("");
                    decimalFormat.setPositiveSuffix("");
                    decimalFormat.setNegativePrefix("");
                    decimalFormat.setNegativeSuffix("");
                } else if (i12 == 2 || i12 == 3) {
                    if (!decimalFormat.getNegativePrefix().isEmpty()) {
                        decimalFormat.setPositivePrefix(new String(new char[]{decimalFormatSymbols.getPlusSign()}));
                    }
                    if (!decimalFormat.getNegativeSuffix().isEmpty()) {
                        decimalFormat.setPositiveSuffix(new String(new char[]{decimalFormatSymbols.getPlusSign()}));
                        return this;
                    }
                }
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: com.facebook.hermes.intl.e$a */
    /* JADX INFO: compiled from: PlatformNumberFormatterICU.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f8796a;

        static {
            int[] iArr = new int[IPlatformNumberFormatter.SignDisplay.values().length];
            f8796a = iArr;
            try {
                iArr[IPlatformNumberFormatter.SignDisplay.NEVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8796a[IPlatformNumberFormatter.SignDisplay.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8796a[IPlatformNumberFormatter.SignDisplay.EXCEPTZERO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: a */
    public AttributedCharacterIterator mo9007a(double d11) {
        try {
            try {
                Format format = this.f8791a;
                return (!(format instanceof MeasureFormat) || this.f8795e == null) ? format.formatToCharacterIterator(Double.valueOf(d11)) : format.formatToCharacterIterator(new Measure(Double.valueOf(d11), this.f8795e));
            } catch (RuntimeException unused) {
                return android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag(TUIThemeManager.LANGUAGE_EN)).formatToCharacterIterator(Double.valueOf(d11));
            }
        } catch (NumberFormatException unused2) {
            return android.icu.text.NumberFormat.getInstance(ULocale.getDefault()).formatToCharacterIterator(Double.valueOf(d11));
        } catch (Exception unused3) {
            return android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag(TUIThemeManager.LANGUAGE_EN)).formatToCharacterIterator(Double.valueOf(d11));
        }
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: b */
    public String mo9008b(double d11) {
        try {
            try {
                Format format = this.f8791a;
                return (!(format instanceof MeasureFormat) || this.f8795e == null) ? format.format(Double.valueOf(d11)) : format.format(new Measure(Double.valueOf(d11), this.f8795e));
            } catch (NumberFormatException unused) {
                return android.icu.text.NumberFormat.getInstance(ULocale.getDefault()).format(d11);
            }
        } catch (RuntimeException unused2) {
            return android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag(TUIThemeManager.LANGUAGE_EN)).format(d11);
        }
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: l */
    public String mo9018l(AttributedCharacterIterator.Attribute attribute, double d11) {
        if (attribute == android.icu.text.NumberFormat.Field.SIGN) {
            return Double.compare(d11, 0.0d) >= 0 ? "plusSign" : "minusSign";
        }
        if (attribute == android.icu.text.NumberFormat.Field.INTEGER) {
            if (Double.isNaN(d11)) {
                return "nan";
            }
            return Double.isInfinite(d11) ? "infinity" : TypedValues.Custom.S_INT;
        }
        if (attribute == android.icu.text.NumberFormat.Field.FRACTION) {
            return "fraction";
        }
        if (attribute == android.icu.text.NumberFormat.Field.EXPONENT) {
            return "exponentInteger";
        }
        if (attribute == android.icu.text.NumberFormat.Field.EXPONENT_SIGN) {
            return "exponentMinusSign";
        }
        if (attribute == android.icu.text.NumberFormat.Field.EXPONENT_SYMBOL) {
            return "exponentSeparator";
        }
        if (attribute == android.icu.text.NumberFormat.Field.DECIMAL_SEPARATOR) {
            return "decimal";
        }
        if (attribute == android.icu.text.NumberFormat.Field.GROUPING_SEPARATOR) {
            return "group";
        }
        if (attribute == android.icu.text.NumberFormat.Field.PERCENT) {
            return "percentSign";
        }
        if (attribute == android.icu.text.NumberFormat.Field.PERMILLE) {
            return "permilleSign";
        }
        if (attribute == android.icu.text.NumberFormat.Field.CURRENCY) {
            return FirebaseAnalytics.Param.CURRENCY;
        }
        return attribute.toString().equals("android.icu.text.NumberFormat$Field(compact)") ? "compact" : "literal";
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C5634e mo9010d(InterfaceC40273b<?> interfaceC40273b, String str, IPlatformNumberFormatter.Style style, IPlatformNumberFormatter.CurrencySign currencySign, IPlatformNumberFormatter.Notation notation, IPlatformNumberFormatter.CompactDisplay compactDisplay) throws JSRangeErrorException {
        if (!str.isEmpty()) {
            try {
                if (NumberingSystem.getInstanceByName(C40275d.m88677h(str)) == null) {
                    throw new JSRangeErrorException("Invalid numbering system: " + str);
                }
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(C40275d.m88677h(str));
                interfaceC40273b.mo88660c("nu", arrayList);
            } catch (RuntimeException unused) {
                throw new JSRangeErrorException("Invalid numbering system: " + str);
            }
        }
        if (notation == IPlatformNumberFormatter.Notation.COMPACT && (style == IPlatformNumberFormatter.Style.DECIMAL || style == IPlatformNumberFormatter.Style.UNIT)) {
            m9066o(CompactDecimalFormat.getInstance((ULocale) interfaceC40273b.getLocale(), compactDisplay == IPlatformNumberFormatter.CompactDisplay.SHORT ? CompactDecimalFormat.CompactStyle.SHORT : CompactDecimalFormat.CompactStyle.LONG), interfaceC40273b, style);
            return this;
        }
        android.icu.text.NumberFormat numberFormat = android.icu.text.NumberFormat.getInstance((ULocale) interfaceC40273b.getLocale(), style.getInitialNumberFormatStyle(notation, currencySign));
        if (notation == IPlatformNumberFormatter.Notation.ENGINEERING) {
            numberFormat.setMaximumIntegerDigits(3);
        }
        m9066o(numberFormat, interfaceC40273b, style);
        return this;
    }

    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: o */
    public final void m9066o(android.icu.text.NumberFormat numberFormat, InterfaceC40273b<?> interfaceC40273b, IPlatformNumberFormatter.Style style) {
        this.f8792b = numberFormat;
        this.f8791a = numberFormat;
        this.f8793c = (C40278g) interfaceC40273b;
        this.f8794d = style;
        numberFormat.setRoundingMode(4);
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public C5634e mo9011e(String str, IPlatformNumberFormatter.CurrencyDisplay currencyDisplay) throws JSRangeErrorException {
        if (this.f8794d == IPlatformNumberFormatter.Style.CURRENCY) {
            Currency currency = Currency.getInstance(str);
            this.f8792b.setCurrency(currency);
            if (currencyDisplay != IPlatformNumberFormatter.CurrencyDisplay.CODE) {
                str = currency.getName(this.f8793c.getLocale(), currencyDisplay.getNameStyle(), (boolean[]) null);
            }
            android.icu.text.NumberFormat numberFormat = this.f8792b;
            if (numberFormat instanceof DecimalFormat) {
                DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
                DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
                decimalFormatSymbols.setCurrencySymbol(str);
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C5634e mo9014h(IPlatformNumberFormatter.RoundingType roundingType, int i11, int i12) {
        if (roundingType == IPlatformNumberFormatter.RoundingType.FRACTION_DIGITS) {
            if (i11 >= 0) {
                this.f8792b.setMinimumFractionDigits(i11);
            }
            if (i12 >= 0) {
                this.f8792b.setMaximumFractionDigits(i12);
            }
            android.icu.text.NumberFormat numberFormat = this.f8792b;
            if (numberFormat instanceof DecimalFormat) {
                ((DecimalFormat) numberFormat).setSignificantDigitsUsed(false);
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public C5634e mo9013g(boolean z11) {
        this.f8792b.setGroupingUsed(z11);
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public C5634e mo9016j(IPlatformNumberFormatter.RoundingType roundingType, int i11, int i12) throws JSRangeErrorException {
        android.icu.text.NumberFormat numberFormat = this.f8792b;
        if ((numberFormat instanceof DecimalFormat) && roundingType == IPlatformNumberFormatter.RoundingType.SIGNIFICANT_DIGITS) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            if (i11 >= 0) {
                decimalFormat.setMinimumSignificantDigits(i11);
            }
            if (i12 >= 0) {
                if (i12 < decimalFormat.getMinimumSignificantDigits()) {
                    throw new JSRangeErrorException("maximumSignificantDigits should be at least equal to minimumSignificantDigits");
                }
                decimalFormat.setMaximumSignificantDigits(i12);
            }
            decimalFormat.setSignificantDigitsUsed(true);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public C5634e mo9017k(String str, IPlatformNumberFormatter.UnitDisplay unitDisplay) throws JSRangeErrorException {
        if (this.f8794d == IPlatformNumberFormatter.Style.UNIT) {
            this.f8795e = m9064p(str);
            this.f8791a = MeasureFormat.getInstance(this.f8793c.getLocale(), unitDisplay.getFormatWidth(), this.f8792b);
        }
        return this;
    }

    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: n */
    public static int m9063n(String str) throws JSRangeErrorException {
        try {
            return Currency.getInstance(str).getDefaultFractionDigits();
        } catch (IllegalArgumentException unused) {
            throw new JSRangeErrorException("Invalid currency code !");
        }
    }

    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: p */
    public static MeasureUnit m9064p(String str) throws JSRangeErrorException {
        for (MeasureUnit measureUnit : MeasureUnit.getAvailable()) {
            if (!measureUnit.getSubtype().equals(str)) {
                if (measureUnit.getSubtype().equals(measureUnit.getType() + C33820nf.f71144W + str)) {
                }
            }
            return measureUnit;
        }
        throw new JSRangeErrorException("Unknown unit: " + str);
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: c */
    public String mo9009c(InterfaceC40273b<?> interfaceC40273b) throws JSRangeErrorException {
        return NumberingSystem.getInstance((ULocale) interfaceC40273b.getLocale()).getName();
    }
}
