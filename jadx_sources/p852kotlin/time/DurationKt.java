package p852kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.flutter.plugin.editing.SpellCheckPlugin;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.math.MathKt;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0015\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\t\u001a\u001c\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0001H\u0087\n¢\u0006\u0004\b\f\u0010\r\u001a\u001c\u0010\n\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0001H\u0087\n¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¢\u0006\u0002\u0010\u0015\u001a\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a)\u0010\u0017\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00022\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00140\u001aH\u0082\b\u001a)\u0010\u001c\u001a\u00020\u0002*\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00022\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00140\u001aH\u0082\b\u001a\u0010\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H\u0002\u001a\u0010\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0002\u001a\u0015\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010'\u001a\u0015\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010'\u001a\u001d\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0002H\u0002¢\u0006\u0002\u0010-\u001a\u0015\u0010.\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010'\u001a\u0015\u0010/\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010'\"\u000e\u0010\u001d\u001a\u00020\u0002X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u00060"}, m90084d2 = {"toDuration", "Lkotlin/time/Duration;", "", "unit", "Lkotlin/time/DurationUnit;", "(ILkotlin/time/DurationUnit;)J", "", "(JLkotlin/time/DurationUnit;)J", "", "(DLkotlin/time/DurationUnit;)J", "times", TypedValues.TransitionType.S_DURATION, "times-mvk6XK0", "(IJ)J", "times-kIfJnKk", "(DJ)J", "parseDuration", "value", "", "strictIso", "", "(Ljava/lang/String;Z)J", "parseOverLongIsoComponent", "substringWhile", SpellCheckPlugin.START_INDEX_KEY, "predicate", "Lkotlin/Function1;", "", "skipWhile", "NANOS_IN_MILLIS", "MAX_NANOS", "MAX_MILLIS", "MAX_NANOS_IN_MILLIS", "nanosToMillis", "nanos", "millisToNanos", "millis", "durationOfNanos", "normalNanos", "(J)J", "durationOfMillis", "normalMillis", "durationOf", "normalValue", "unitDiscriminator", "(JI)J", "durationOfNanosNormalized", "durationOfMillisNormalized", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1062:1\n1015#1,6:1064\n1018#1,3:1070\n1015#1,6:1073\n1015#1,6:1079\n1018#1,3:1085\n1#2:1063\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n*L\n930#1:1064,6\n964#1:1070,3\n967#1:1073,6\n970#1:1079,6\n1015#1:1085,3\n*E\n"})
public final class DurationKt {
    public static final long MAX_MILLIS = 4611686018427387903L;
    public static final long MAX_NANOS = 4611686018426999999L;
    private static final long MAX_NANOS_IN_MILLIS = 4611686018426L;
    public static final int NANOS_IN_MILLIS = 1000000;

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOf(long j11, int i11) {
        return Duration.m105187constructorimpl((j11 << 1) + ((long) i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfMillis(long j11) {
        return Duration.m105187constructorimpl((j11 << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfNanos(long j11) {
        return Duration.m105187constructorimpl(j11 << 1);
    }

    private static final String substringWhile(String str, int i11, Function1<? super Character, Boolean> function1) {
        int i12 = i11;
        while (i12 < str.length() && function1.invoke(Character.valueOf(str.charAt(i12))).booleanValue()) {
            i12++;
        }
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i11, i12);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @SinceKotlin(version = "1.6")
    public static final long toDuration(int i11, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.compareTo(DurationUnit.SECONDS) <= 0 ? durationOfNanos(DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(i11, unit, DurationUnit.NANOSECONDS)) : toDuration(i11, unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long parseDuration(String str, boolean z11) {
        boolean z12;
        int i11;
        char cCharAt;
        char cCharAt2;
        int i12;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        Duration.Companion companion = Duration.INSTANCE;
        long jM105278getZEROUwyO8pc = companion.m105278getZEROUwyO8pc();
        char cCharAt3 = str.charAt(0);
        int length2 = (cCharAt3 == '+' || cCharAt3 == '-') ? 1 : 0;
        boolean z13 = length2 > 0;
        boolean z14 = z13 && StringsKt.startsWith$default((CharSequence) str, '-', false, 2, (Object) null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        char c11 = ':';
        char c12 = '0';
        String str2 = "null cannot be cast to non-null type java.lang.String";
        if (str.charAt(length2) == 'P') {
            int i13 = length2 + 1;
            if (i13 == length) {
                throw new IllegalArgumentException();
            }
            boolean z15 = false;
            DurationUnit durationUnit = null;
            while (i13 < length) {
                if (str.charAt(i13) != 'T') {
                    int i14 = i13;
                    while (true) {
                        if (i14 >= str.length()) {
                            i12 = length;
                            break;
                        }
                        char cCharAt4 = str.charAt(i14);
                        if (c12 > cCharAt4 || cCharAt4 >= c11) {
                            i12 = length;
                            if (!StringsKt.contains$default((CharSequence) "+-.", cCharAt4, false, 2, (Object) null)) {
                                break;
                            }
                        } else {
                            i12 = length;
                        }
                        i14++;
                        length = i12;
                        c12 = '0';
                        c11 = ':';
                    }
                    Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str.substring(i13, i14);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i13 + strSubstring.length();
                    if (length3 < 0 || length3 >= str.length()) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt5 = str.charAt(length3);
                    i13 = length3 + 1;
                    DurationUnit durationUnitDurationUnitByIsoChar = DurationUnitKt__DurationUnitKt.durationUnitByIsoChar(cCharAt5, z15);
                    if (durationUnit != null && durationUnit.compareTo(durationUnitDurationUnitByIsoChar) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iIndexOf$default = StringsKt.indexOf$default((CharSequence) strSubstring, '.', 0, false, 6, (Object) null);
                    if (durationUnitDurationUnitByIsoChar != DurationUnit.SECONDS || iIndexOf$default <= 0) {
                        jM105278getZEROUwyO8pc = Duration.m105216plusLRDsOJo(jM105278getZEROUwyO8pc, toDuration(parseOverLongIsoComponent(strSubstring), durationUnitDurationUnitByIsoChar));
                    } else {
                        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        long jM105216plusLRDsOJo = Duration.m105216plusLRDsOJo(jM105278getZEROUwyO8pc, toDuration(parseOverLongIsoComponent(strSubstring2), durationUnitDurationUnitByIsoChar));
                        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                        jM105278getZEROUwyO8pc = Duration.m105216plusLRDsOJo(jM105216plusLRDsOJo, toDuration(Double.parseDouble(strSubstring3), durationUnitDurationUnitByIsoChar));
                    }
                    durationUnit = durationUnitDurationUnitByIsoChar;
                    length = i12;
                    c12 = '0';
                    c11 = ':';
                } else {
                    if (z15 || (i13 = i13 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z15 = true;
                }
            }
        } else {
            if (z11) {
                throw new IllegalArgumentException();
            }
            int iMax = Math.max(length - length2, 8);
            char c13 = '0';
            if (StringsKt.regionMatches(str, length2, "Infinity", 0, iMax, true)) {
                jM105278getZEROUwyO8pc = companion.m105276getINFINITEUwyO8pc();
            } else {
                boolean z16 = !z13;
                if (z13 && str.charAt(length2) == '(' && StringsKt.last(str) == ')') {
                    length2++;
                    int i15 = length - 1;
                    if (length2 == i15) {
                        throw new IllegalArgumentException("No components");
                    }
                    i11 = i15;
                    z12 = true;
                } else {
                    z12 = z16;
                    i11 = length;
                }
                boolean z17 = false;
                DurationUnit durationUnitDurationUnitByShortName = null;
                while (length2 < i11) {
                    if (z17 && z12) {
                        while (length2 < str.length() && str.charAt(length2) == ' ') {
                            length2++;
                        }
                    }
                    int i16 = length2;
                    while (i16 < str.length() && ((c13 <= (cCharAt2 = str.charAt(i16)) && cCharAt2 < ':') || cCharAt2 == '.')) {
                        i16++;
                    }
                    Intrinsics.checkNotNull(str, str2);
                    String strSubstring4 = str.substring(length2, i16);
                    Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i17 = length4;
                    while (i17 < str.length() && 'a' <= (cCharAt = str.charAt(i17)) && cCharAt < '{') {
                        i17++;
                    }
                    Intrinsics.checkNotNull(str, str2);
                    String strSubstring5 = str.substring(length4, i17);
                    Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
                    length2 = length4 + strSubstring5.length();
                    durationUnitDurationUnitByShortName = DurationUnitKt__DurationUnitKt.durationUnitByShortName(strSubstring5);
                    if (durationUnitDurationUnitByShortName != null && durationUnitDurationUnitByShortName.compareTo(durationUnitDurationUnitByShortName) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) strSubstring4, '.', 0, false, 6, (Object) null);
                    if (iIndexOf$default2 > 0) {
                        Intrinsics.checkNotNull(strSubstring4, str2);
                        String strSubstring6 = strSubstring4.substring(0, iIndexOf$default2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
                        String str3 = str2;
                        long jM105216plusLRDsOJo2 = Duration.m105216plusLRDsOJo(jM105278getZEROUwyO8pc, toDuration(Long.parseLong(strSubstring6), durationUnitDurationUnitByShortName));
                        Intrinsics.checkNotNull(strSubstring4, str3);
                        String strSubstring7 = strSubstring4.substring(iIndexOf$default2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring7, "substring(...)");
                        boolean z18 = z12;
                        jM105278getZEROUwyO8pc = Duration.m105216plusLRDsOJo(jM105216plusLRDsOJo2, toDuration(Double.parseDouble(strSubstring7), durationUnitDurationUnitByShortName));
                        if (length2 < i11) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                        z12 = z18;
                        str2 = str3;
                    } else {
                        jM105278getZEROUwyO8pc = Duration.m105216plusLRDsOJo(jM105278getZEROUwyO8pc, toDuration(Long.parseLong(strSubstring4), durationUnitDurationUnitByShortName));
                        z12 = z12;
                    }
                    z17 = true;
                    c13 = '0';
                }
            }
        }
        return z14 ? Duration.m105231unaryMinusUwyO8pc(jM105278getZEROUwyO8pc) : jM105278getZEROUwyO8pc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long millisToNanos(long j11) {
        return j11 * ((long) 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long nanosToMillis(long j11) {
        return j11 / ((long) 1000000);
    }

    private static final long parseOverLongIsoComponent(String str) {
        int i11;
        char cCharAt;
        int length = str.length();
        if (length > 0 && StringsKt.contains$default((CharSequence) "+-", str.charAt(0), false, 2, (Object) null)) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (length - i11 > 16) {
            int i12 = i11;
            while (true) {
                if (i11 < length) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 == '0') {
                        if (i12 == i11) {
                            i12++;
                        }
                    } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                        break;
                    }
                    i11++;
                } else {
                    if (length - i12 <= 16) {
                        break;
                    }
                    if (str.charAt(0) == '-') {
                        return Long.MIN_VALUE;
                    }
                    return Long.MAX_VALUE;
                }
            }
        }
        if (StringsKt.startsWith$default(str, "+", false, 2, (Object) null) && length > 1 && '0' <= (cCharAt = str.charAt(1)) && cCharAt < ':') {
            return Long.parseLong(StringsKt.drop(str, 1));
        }
        return Long.parseLong(str);
    }

    private static final int skipWhile(String str, int i11, Function1<? super Character, Boolean> function1) {
        while (i11 < str.length() && function1.invoke(Character.valueOf(str.charAt(i11))).booleanValue()) {
            i11++;
        }
        return i11;
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* JADX INFO: renamed from: times-kIfJnKk, reason: not valid java name */
    private static final long m105283timeskIfJnKk(double d11, long j11) {
        return Duration.m105217timesUwyO8pc(j11, d11);
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* JADX INFO: renamed from: times-mvk6XK0, reason: not valid java name */
    private static final long m105284timesmvk6XK0(int i11, long j11) {
        return Duration.m105218timesUwyO8pc(j11, i11);
    }

    @SinceKotlin(version = "1.6")
    public static final long toDuration(long j11, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        long jConvertDurationUnitOverflow = DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(MAX_NANOS, durationUnit, unit);
        if ((-jConvertDurationUnitOverflow) <= j11 && j11 <= jConvertDurationUnitOverflow) {
            return durationOfNanos(DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(j11, unit, durationUnit));
        }
        return durationOfMillis(RangesKt.coerceIn(DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(j11, unit, DurationUnit.MILLISECONDS), -4611686018427387903L, MAX_MILLIS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfMillisNormalized(long j11) {
        if (-4611686018426L <= j11 && j11 < 4611686018427L) {
            return durationOfNanos(millisToNanos(j11));
        }
        return durationOfMillis(RangesKt.coerceIn(j11, -4611686018427387903L, MAX_MILLIS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfNanosNormalized(long j11) {
        if (-4611686018426999999L <= j11 && j11 < 4611686018427000000L) {
            return durationOfNanos(j11);
        }
        return durationOfMillis(nanosToMillis(j11));
    }

    @SinceKotlin(version = "1.6")
    public static final long toDuration(double d11, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double dConvertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d11, unit, DurationUnit.NANOSECONDS);
        if (!Double.isNaN(dConvertDurationUnit)) {
            long jRoundToLong = MathKt.roundToLong(dConvertDurationUnit);
            if (-4611686018426999999L <= jRoundToLong && jRoundToLong < 4611686018427000000L) {
                return durationOfNanos(jRoundToLong);
            }
            return durationOfMillisNormalized(MathKt.roundToLong(DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d11, unit, DurationUnit.MILLISECONDS)));
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.");
    }
}
