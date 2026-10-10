package com.facebook.hermes.intl;

import androidx.core.text.util.LocalePreferences;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33577c3;
import java.text.AttributedCharacterIterator;
import p359j5.InterfaceC40273b;

/* JADX INFO: loaded from: classes34.dex */
public interface IPlatformDateTimeFormatter {

    public enum DateStyle {
        FULL,
        LONG,
        MEDIUM,
        SHORT,
        UNDEFINED;

        @Override // java.lang.Enum
        public String toString() {
            int i11 = C5622a.f8725l[ordinal()];
            if (i11 == 1) {
                return "full";
            }
            if (i11 == 2) {
                return "long";
            }
            if (i11 == 3) {
                return "medium";
            }
            if (i11 == 4) {
                return "short";
            }
            if (i11 == 5) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum Day {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String getSkeleonSymbol() {
            int i11 = C5622a.f8720g[ordinal()];
            if (i11 == 1) {
                return "d";
            }
            if (i11 == 2) {
                return "dd";
            }
            if (i11 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i11 = C5622a.f8720g[ordinal()];
            if (i11 == 1) {
                return "numeric";
            }
            if (i11 == 2) {
                return "2-digit";
            }
            if (i11 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum Era {
        LONG,
        SHORT,
        NARROW,
        UNDEFINED;

        public String getSkeleonSymbol() {
            int i11 = C5622a.f8717d[ordinal()];
            if (i11 == 1) {
                return "GGGG";
            }
            if (i11 == 2) {
                return "GGG";
            }
            if (i11 == 3) {
                return C33577c3.f69358o;
            }
            if (i11 == 4) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i11 = C5622a.f8717d[ordinal()];
            if (i11 == 1) {
                return "long";
            }
            if (i11 == 2) {
                return "short";
            }
            if (i11 == 3) {
                return "narrow";
            }
            if (i11 == 4) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum FormatMatcher {
        BESTFIT,
        BASIC;

        @Override // java.lang.Enum
        public String toString() {
            int i11 = C5622a.f8714a[ordinal()];
            if (i11 == 1) {
                return "best fit";
            }
            if (i11 == 2) {
                return "basic";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum Hour {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String getSkeleonSymbol12() {
            int i11 = C5622a.f8721h[ordinal()];
            if (i11 == 1) {
                return CmcdData.Factory.STREAMING_FORMAT_HLS;
            }
            if (i11 == 2) {
                return "hh";
            }
            if (i11 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        public String getSkeleonSymbol24() {
            int i11 = C5622a.f8721h[ordinal()];
            if (i11 == 1) {
                return "k";
            }
            if (i11 == 2) {
                return "kk";
            }
            if (i11 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i11 = C5622a.f8721h[ordinal()];
            if (i11 == 1) {
                return "numeric";
            }
            if (i11 == 2) {
                return "2-digit";
            }
            if (i11 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum HourCycle {
        H11,
        H12,
        H23,
        H24,
        UNDEFINED;

        @Override // java.lang.Enum
        public String toString() {
            int i11 = C5622a.f8715b[ordinal()];
            if (i11 == 1) {
                return LocalePreferences.HourCycle.H11;
            }
            if (i11 == 2) {
                return LocalePreferences.HourCycle.H12;
            }
            if (i11 == 3) {
                return LocalePreferences.HourCycle.H23;
            }
            if (i11 == 4) {
                return LocalePreferences.HourCycle.H24;
            }
            if (i11 == 5) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum Minute {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String getSkeleonSymbol() {
            int i11 = C5622a.f8722i[ordinal()];
            if (i11 == 1) {
                return "m";
            }
            if (i11 == 2) {
                return "mm";
            }
            if (i11 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i11 = C5622a.f8722i[ordinal()];
            if (i11 == 1) {
                return "numeric";
            }
            if (i11 == 2) {
                return "2-digit";
            }
            if (i11 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum Month {
        NUMERIC,
        DIGIT2,
        LONG,
        SHORT,
        NARROW,
        UNDEFINED;

        public String getSkeleonSymbol() {
            switch (C5622a.f8719f[ordinal()]) {
                case 1:
                    return "M";
                case 2:
                    return "MM";
                case 3:
                    return "MMMM";
                case 4:
                    return "MMM";
                case 5:
                    return "MMMMM";
                case 6:
                    return "";
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // java.lang.Enum
        public String toString() {
            switch (C5622a.f8719f[ordinal()]) {
                case 1:
                    return "numeric";
                case 2:
                    return "2-digit";
                case 3:
                    return "long";
                case 4:
                    return "short";
                case 5:
                    return "narrow";
                case 6:
                    return "";
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    public enum Second {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String getSkeleonSymbol() {
            int i11 = C5622a.f8723j[ordinal()];
            if (i11 == 1) {
                return CmcdData.Factory.STREAMING_FORMAT_SS;
            }
            if (i11 == 2) {
                return "ss";
            }
            if (i11 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i11 = C5622a.f8723j[ordinal()];
            if (i11 == 1) {
                return "numeric";
            }
            if (i11 == 2) {
                return "2-digit";
            }
            if (i11 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum TimeStyle {
        FULL,
        LONG,
        MEDIUM,
        SHORT,
        UNDEFINED;

        @Override // java.lang.Enum
        public String toString() {
            int i11 = C5622a.f8726m[ordinal()];
            if (i11 == 1) {
                return "full";
            }
            if (i11 == 2) {
                return "long";
            }
            if (i11 == 3) {
                return "medium";
            }
            if (i11 == 4) {
                return "short";
            }
            if (i11 == 5) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum TimeZoneName {
        LONG,
        LONGOFFSET,
        LONGGENERIC,
        SHORT,
        SHORTOFFSET,
        SHORTGENERIC,
        UNDEFINED;

        public String getSkeleonSymbol() {
            switch (C5622a.f8724k[ordinal()]) {
                case 1:
                    return "zzzz";
                case 2:
                    return "OOOO";
                case 3:
                    return "vvvv";
                case 4:
                    return "z";
                case 5:
                    return "O";
                case 6:
                    return "v";
                case 7:
                    return "";
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // java.lang.Enum
        public String toString() {
            switch (C5622a.f8724k[ordinal()]) {
                case 1:
                    return "long";
                case 2:
                    return "longOffset";
                case 3:
                    return "longGeneric";
                case 4:
                    return "short";
                case 5:
                    return "shortOffset";
                case 6:
                    return "shortGeneric";
                case 7:
                    return "";
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    public enum WeekDay {
        LONG,
        SHORT,
        NARROW,
        UNDEFINED;

        public String getSkeleonSymbol() {
            int i11 = C5622a.f8716c[ordinal()];
            if (i11 == 1) {
                return "EEEE";
            }
            if (i11 == 2) {
                return "EEE";
            }
            if (i11 == 3) {
                return "EEEEE";
            }
            if (i11 == 4) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i11 = C5622a.f8716c[ordinal()];
            if (i11 == 1) {
                return "long";
            }
            if (i11 == 2) {
                return "short";
            }
            if (i11 == 3) {
                return "narrow";
            }
            if (i11 == 4) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum Year {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String getSkeleonSymbol() {
            int i11 = C5622a.f8718e[ordinal()];
            if (i11 == 1) {
                return "yyyy";
            }
            if (i11 == 2) {
                return "yy";
            }
            if (i11 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i11 = C5622a.f8718e[ordinal()];
            if (i11 == 1) {
                return "numeric";
            }
            if (i11 == 2) {
                return "2-digit";
            }
            if (i11 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: a */
    AttributedCharacterIterator mo8986a(double d11) throws JSRangeErrorException;

    /* JADX INFO: renamed from: b */
    String mo8987b(double d11) throws JSRangeErrorException;

    /* JADX INFO: renamed from: c */
    String mo8988c(InterfaceC40273b<?> interfaceC40273b) throws JSRangeErrorException;

    /* JADX INFO: renamed from: d */
    String mo8989d(InterfaceC40273b<?> interfaceC40273b) throws JSRangeErrorException;

    /* JADX INFO: renamed from: e */
    String mo8990e(AttributedCharacterIterator.Attribute attribute, String str);

    /* JADX INFO: renamed from: f */
    HourCycle mo8991f(InterfaceC40273b<?> interfaceC40273b) throws JSRangeErrorException;

    /* JADX INFO: renamed from: g */
    void mo8992g(InterfaceC40273b<?> interfaceC40273b, String str, String str2, FormatMatcher formatMatcher, WeekDay weekDay, Era era, Year year, Month month, Day day, Hour hour, Minute minute, Second second, TimeZoneName timeZoneName, HourCycle hourCycle, Object obj, DateStyle dateStyle, TimeStyle timeStyle, Object obj2) throws JSRangeErrorException;

    /* JADX INFO: renamed from: h */
    String mo8993h(InterfaceC40273b<?> interfaceC40273b) throws JSRangeErrorException;

    /* JADX INFO: renamed from: com.facebook.hermes.intl.IPlatformDateTimeFormatter$a */
    public static /* synthetic */ class C5622a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f8714a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f8715b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f8716c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f8717d;

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ int[] f8718e;

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ int[] f8719f;

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ int[] f8720g;

        /* JADX INFO: renamed from: h */
        public static final /* synthetic */ int[] f8721h;

        /* JADX INFO: renamed from: i */
        public static final /* synthetic */ int[] f8722i;

        /* JADX INFO: renamed from: j */
        public static final /* synthetic */ int[] f8723j;

        /* JADX INFO: renamed from: k */
        public static final /* synthetic */ int[] f8724k;

        /* JADX INFO: renamed from: l */
        public static final /* synthetic */ int[] f8725l;

        /* JADX INFO: renamed from: m */
        public static final /* synthetic */ int[] f8726m;

        static {
            int[] iArr = new int[TimeStyle.values().length];
            f8726m = iArr;
            try {
                iArr[TimeStyle.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8726m[TimeStyle.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8726m[TimeStyle.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8726m[TimeStyle.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8726m[TimeStyle.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[DateStyle.values().length];
            f8725l = iArr2;
            try {
                iArr2[DateStyle.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8725l[DateStyle.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8725l[DateStyle.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8725l[DateStyle.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8725l[DateStyle.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr3 = new int[TimeZoneName.values().length];
            f8724k = iArr3;
            try {
                iArr3[TimeZoneName.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8724k[TimeZoneName.LONGOFFSET.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f8724k[TimeZoneName.LONGGENERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f8724k[TimeZoneName.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f8724k[TimeZoneName.SHORTOFFSET.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f8724k[TimeZoneName.SHORTGENERIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f8724k[TimeZoneName.UNDEFINED.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            int[] iArr4 = new int[Second.values().length];
            f8723j = iArr4;
            try {
                iArr4[Second.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f8723j[Second.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f8723j[Second.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            int[] iArr5 = new int[Minute.values().length];
            f8722i = iArr5;
            try {
                iArr5[Minute.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f8722i[Minute.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f8722i[Minute.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            int[] iArr6 = new int[Hour.values().length];
            f8721h = iArr6;
            try {
                iArr6[Hour.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f8721h[Hour.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f8721h[Hour.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            int[] iArr7 = new int[Day.values().length];
            f8720g = iArr7;
            try {
                iArr7[Day.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f8720g[Day.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f8720g[Day.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            int[] iArr8 = new int[Month.values().length];
            f8719f = iArr8;
            try {
                iArr8[Month.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f8719f[Month.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f8719f[Month.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f8719f[Month.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f8719f[Month.NARROW.ordinal()] = 5;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f8719f[Month.UNDEFINED.ordinal()] = 6;
            } catch (NoSuchFieldError unused35) {
            }
            int[] iArr9 = new int[Year.values().length];
            f8718e = iArr9;
            try {
                iArr9[Year.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f8718e[Year.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f8718e[Year.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused38) {
            }
            int[] iArr10 = new int[Era.values().length];
            f8717d = iArr10;
            try {
                iArr10[Era.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f8717d[Era.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f8717d[Era.NARROW.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f8717d[Era.UNDEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused42) {
            }
            int[] iArr11 = new int[WeekDay.values().length];
            f8716c = iArr11;
            try {
                iArr11[WeekDay.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f8716c[WeekDay.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f8716c[WeekDay.NARROW.ordinal()] = 3;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f8716c[WeekDay.UNDEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused46) {
            }
            int[] iArr12 = new int[HourCycle.values().length];
            f8715b = iArr12;
            try {
                iArr12[HourCycle.H11.ordinal()] = 1;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f8715b[HourCycle.H12.ordinal()] = 2;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f8715b[HourCycle.H23.ordinal()] = 3;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f8715b[HourCycle.H24.ordinal()] = 4;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f8715b[HourCycle.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused51) {
            }
            int[] iArr13 = new int[FormatMatcher.values().length];
            f8714a = iArr13;
            try {
                iArr13[FormatMatcher.BESTFIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f8714a[FormatMatcher.BASIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused53) {
            }
        }
    }
}
