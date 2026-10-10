package com.facebook.hermes.intl;

import android.icu.text.MeasureFormat;
import androidx.annotation.RequiresApi;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.text.AttributedCharacterIterator;
import p359j5.InterfaceC40273b;

/* JADX INFO: loaded from: classes34.dex */
public interface IPlatformNumberFormatter {

    public enum CompactDisplay {
        SHORT,
        LONG;

        @Override // java.lang.Enum
        public String toString() {
            int i11 = C5623a.f8737c[ordinal()];
            if (i11 == 1) {
                return "short";
            }
            if (i11 == 2) {
                return "long";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum CurrencyDisplay {
        SYMBOL,
        NARROWSYMBOL,
        CODE,
        NAME;

        public int getNameStyle() {
            return C5623a.f8740f[ordinal()] != 4 ? 0 : 1;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i11 = C5623a.f8740f[ordinal()];
            if (i11 == 1) {
                return "symbol";
            }
            if (i11 == 2) {
                return "narrowSymbol";
            }
            if (i11 == 3) {
                return "code";
            }
            if (i11 == 4) {
                return "name";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum CurrencySign {
        STANDARD,
        ACCOUNTING;

        @Override // java.lang.Enum
        public String toString() {
            int i11 = C5623a.f8741g[ordinal()];
            if (i11 == 1) {
                return "accounting";
            }
            if (i11 == 2) {
                return "standard";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum Notation {
        STANDARD,
        SCIENTIFIC,
        ENGINEERING,
        COMPACT;

        @Override // java.lang.Enum
        public String toString() {
            int i11 = C5623a.f8736b[ordinal()];
            if (i11 == 1) {
                return "standard";
            }
            if (i11 == 2) {
                return "scientific";
            }
            if (i11 == 3) {
                return "engineering";
            }
            if (i11 == 4) {
                return "compact";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum RoundingType {
        SIGNIFICANT_DIGITS,
        FRACTION_DIGITS,
        COMPACT_ROUNDING
    }

    public enum SignDisplay {
        AUTO,
        ALWAYS,
        NEVER,
        EXCEPTZERO;

        @Override // java.lang.Enum
        public String toString() {
            int i11 = C5623a.f8738d[ordinal()];
            if (i11 == 1) {
                return "auto";
            }
            if (i11 == 2) {
                return ReactScrollViewHelper.OVER_SCROLL_ALWAYS;
            }
            if (i11 == 3) {
                return ReactScrollViewHelper.OVER_SCROLL_NEVER;
            }
            if (i11 == 4) {
                return "exceptZero";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum Style {
        DECIMAL,
        PERCENT,
        CURRENCY,
        UNIT;

        public int getInitialNumberFormatStyle(Notation notation, CurrencySign currencySign) throws JSRangeErrorException {
            int i11 = C5623a.f8735a[ordinal()];
            if (i11 == 2) {
                return 2;
            }
            if (i11 != 3) {
                return (notation == Notation.SCIENTIFIC || notation == Notation.ENGINEERING) ? 3 : 0;
            }
            if (currencySign == CurrencySign.ACCOUNTING) {
                return 7;
            }
            if (currencySign == CurrencySign.STANDARD) {
                return 1;
            }
            throw new JSRangeErrorException("Unrecognized formatting style requested.");
        }

        @Override // java.lang.Enum
        public String toString() {
            int i11 = C5623a.f8735a[ordinal()];
            if (i11 == 1) {
                return "decimal";
            }
            if (i11 == 2) {
                return "percent";
            }
            if (i11 == 3) {
                return FirebaseAnalytics.Param.CURRENCY;
            }
            if (i11 == 4) {
                return "unit";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum UnitDisplay {
        SHORT,
        NARROW,
        LONG;

        @RequiresApi(api = 24)
        public MeasureFormat.FormatWidth getFormatWidth() {
            int i11 = C5623a.f8739e[ordinal()];
            if (i11 != 2) {
                return i11 != 3 ? MeasureFormat.FormatWidth.SHORT : MeasureFormat.FormatWidth.WIDE;
            }
            return MeasureFormat.FormatWidth.NARROW;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i11 = C5623a.f8739e[ordinal()];
            if (i11 == 1) {
                return "short";
            }
            if (i11 == 2) {
                return "narrow";
            }
            if (i11 == 3) {
                return "long";
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: a */
    AttributedCharacterIterator mo9007a(double d11) throws JSRangeErrorException;

    /* JADX INFO: renamed from: b */
    String mo9008b(double d11) throws JSRangeErrorException;

    /* JADX INFO: renamed from: c */
    String mo9009c(InterfaceC40273b<?> interfaceC40273b) throws JSRangeErrorException;

    /* JADX INFO: renamed from: d */
    IPlatformNumberFormatter mo9010d(InterfaceC40273b<?> interfaceC40273b, String str, Style style, CurrencySign currencySign, Notation notation, CompactDisplay compactDisplay) throws JSRangeErrorException;

    /* JADX INFO: renamed from: e */
    IPlatformNumberFormatter mo9011e(String str, CurrencyDisplay currencyDisplay) throws JSRangeErrorException;

    /* JADX INFO: renamed from: f */
    IPlatformNumberFormatter mo9012f(int i11);

    /* JADX INFO: renamed from: g */
    IPlatformNumberFormatter mo9013g(boolean z11);

    /* JADX INFO: renamed from: h */
    IPlatformNumberFormatter mo9014h(RoundingType roundingType, int i11, int i12);

    /* JADX INFO: renamed from: i */
    IPlatformNumberFormatter mo9015i(SignDisplay signDisplay);

    /* JADX INFO: renamed from: j */
    IPlatformNumberFormatter mo9016j(RoundingType roundingType, int i11, int i12) throws JSRangeErrorException;

    /* JADX INFO: renamed from: k */
    IPlatformNumberFormatter mo9017k(String str, UnitDisplay unitDisplay) throws JSRangeErrorException;

    /* JADX INFO: renamed from: l */
    String mo9018l(AttributedCharacterIterator.Attribute attribute, double d11);

    /* JADX INFO: renamed from: com.facebook.hermes.intl.IPlatformNumberFormatter$a */
    public static /* synthetic */ class C5623a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f8735a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f8736b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f8737c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f8738d;

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ int[] f8739e;

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ int[] f8740f;

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ int[] f8741g;

        static {
            int[] iArr = new int[CurrencySign.values().length];
            f8741g = iArr;
            try {
                iArr[CurrencySign.ACCOUNTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8741g[CurrencySign.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[CurrencyDisplay.values().length];
            f8740f = iArr2;
            try {
                iArr2[CurrencyDisplay.SYMBOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8740f[CurrencyDisplay.NARROWSYMBOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8740f[CurrencyDisplay.CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8740f[CurrencyDisplay.NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[UnitDisplay.values().length];
            f8739e = iArr3;
            try {
                iArr3[UnitDisplay.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8739e[UnitDisplay.NARROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8739e[UnitDisplay.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[SignDisplay.values().length];
            f8738d = iArr4;
            try {
                iArr4[SignDisplay.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8738d[SignDisplay.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8738d[SignDisplay.NEVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f8738d[SignDisplay.EXCEPTZERO.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr5 = new int[CompactDisplay.values().length];
            f8737c = iArr5;
            try {
                iArr5[CompactDisplay.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f8737c[CompactDisplay.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr6 = new int[Notation.values().length];
            f8736b = iArr6;
            try {
                iArr6[Notation.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f8736b[Notation.SCIENTIFIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f8736b[Notation.ENGINEERING.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f8736b[Notation.COMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            int[] iArr7 = new int[Style.values().length];
            f8735a = iArr7;
            try {
                iArr7[Style.DECIMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f8735a[Style.PERCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f8735a[Style.CURRENCY.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f8735a[Style.UNIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }
}
