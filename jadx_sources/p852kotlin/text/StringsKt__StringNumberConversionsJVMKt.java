package p852kotlin.text;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: StringNumberConversionsJVM.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0002\u0010\n\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\f\n\u0002\b\u000e\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u000f\u0010\u0007\u001a\u00020\b*\u0004\u0018\u00010\u0001H\u0087\b\u001a\r\u0010\t\u001a\u00020\u0002*\u00020\u0001H\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\r\u0010\n\u001a\u00020\u0005*\u00020\u0001H\u0087\b\u001a\u0015\u0010\n\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\r\u0010\u000b\u001a\u00020\u0004*\u00020\u0001H\u0087\b\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\r\u0010\f\u001a\u00020\u0006*\u00020\u0001H\u0087\b\u001a\u0015\u0010\f\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\r\u0010\r\u001a\u00020\u000e*\u00020\u0001H\u0087\b\u001a\r\u0010\u000f\u001a\u00020\u0010*\u00020\u0001H\u0087\b\u001a\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0012\u001a\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0010*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0016*\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0015\u001a\u00020\u0016*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u000e\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u0001H\u0007\u001a\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\r\u0010\u0018\u001a\u00020\u0019*\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0018\u001a\u00020\u0019*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0087\b\u001a\u000e\u0010\u001c\u001a\u0004\u0018\u00010\u0019*\u00020\u0001H\u0007\u001a\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0019*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0007\u001a4\u0010\u001d\u001a\u0004\u0018\u0001H\u001e\"\u0004\b\u0000\u0010\u001e2\u0006\u0010\u001f\u001a\u00020\u00012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\u001e0!H\u0082\b¢\u0006\u0004\b\"\u0010#\u001a\u0015\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0001H\u0002¢\u0006\u0002\b&\u001a \u0010'\u001a\u0004\u0018\u00010\u00012\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0004H\u0083\b¢\u0006\u0002\b*\u001a\u0012\u0010+\u001a\u00020\b*\u00020,H\u0083\b¢\u0006\u0002\b-\u001a\u0012\u0010.\u001a\u00020\b*\u00020,H\u0083\b¢\u0006\u0002\b/\u001a\u0012\u00100\u001a\u00020\u0004*\u00020,H\u0083\b¢\u0006\u0002\b1\u001a6\u00102\u001a\u00020\u0004*\u00020\u00012\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b0!H\u0083\b¢\u0006\u0002\b4\u001a6\u00105\u001a\u00020\u0004*\u00020\u00012\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b0!H\u0083\b¢\u0006\u0002\b6\u001a>\u00107\u001a\u00020\u0004*\u00020\u00012\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u00108\u001a\u00020\b2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b0!H\u0083\b¢\u0006\u0002\b9¨\u0006:"}, m90084d2 = {"toString", "", "", "radix", "", "", "", "toBoolean", "", "toByte", "toShort", "toInt", "toLong", "toFloat", "", "toDouble", "", "toFloatOrNull", "(Ljava/lang/String;)Ljava/lang/Float;", "toDoubleOrNull", "(Ljava/lang/String;)Ljava/lang/Double;", "toBigInteger", "Ljava/math/BigInteger;", "toBigIntegerOrNull", "toBigDecimal", "Ljava/math/BigDecimal;", "mathContext", "Ljava/math/MathContext;", "toBigDecimalOrNull", "screenFloatValue", ExifInterface.GPS_DIRECTION_TRUE, "str", "parse", "Lkotlin/Function1;", "screenFloatValue$StringsKt__StringNumberConversionsJVMKt", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "isValidFloat", CmcdData.Factory.STREAMING_FORMAT_SS, "isValidFloat$StringsKt__StringNumberConversionsJVMKt", "guessNamedFloatConstant", "start", "endInclusive", "guessNamedFloatConstant$StringsKt__StringNumberConversionsJVMKt", "isAsciiDigit", "", "isAsciiDigit$StringsKt__StringNumberConversionsJVMKt", "isHexLetter", "isHexLetter$StringsKt__StringNumberConversionsJVMKt", "asciiLetterToLowerCaseCode", "asciiLetterToLowerCaseCode$StringsKt__StringNumberConversionsJVMKt", "advanceWhile", "predicate", "advanceWhile$StringsKt__StringNumberConversionsJVMKt", "backtrackWhile", "backtrackWhile$StringsKt__StringNumberConversionsJVMKt", "advanceAndValidateMantissa", "hexFormat", "advanceAndValidateMantissa$StringsKt__StringNumberConversionsJVMKt", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/text/StringsKt")
@SourceDebugExtension({"SMAP\nStringNumberConversionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,512:1\n267#1,7:513\n267#1,7:520\n267#1,7:527\n267#1,7:534\n1#2:541\n*S KotlinDebug\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n166#1:513,7\n173#1:520,7\n253#1:527,7\n264#1:534,7\n*E\n"})
public class StringsKt__StringNumberConversionsJVMKt extends StringsKt__StringBuilderKt {
    @InlineOnly
    /* JADX INFO: renamed from: advanceAndValidateMantissa$StringsKt__StringNumberConversionsJVMKt */
    private static final int m90326x47690acb(String str, int i11, int i12, boolean z11, Function1<? super Character, Boolean> function1) {
        boolean z12;
        String str2;
        int i13 = i11;
        while (i13 <= i12 && function1.invoke(Character.valueOf(str.charAt(i13))).booleanValue()) {
            i13++;
        }
        boolean z13 = i11 != i13;
        if (i13 > i12) {
            if (z11) {
                return -1;
            }
            return i13;
        }
        if (str.charAt(i13) == '.') {
            int i14 = i13 + 1;
            int i15 = i14;
            while (i15 <= i12 && function1.invoke(Character.valueOf(str.charAt(i15))).booleanValue()) {
                i15++;
            }
            z12 = i14 != i15;
            i13 = i15;
        } else {
            z12 = false;
        }
        if (z13 || z12) {
            return i13;
        }
        if (z11) {
            return -1;
        }
        if (i12 == i13 + 2) {
            str2 = "NaN";
        } else {
            str2 = i12 == i13 + 7 ? "Infinity" : null;
        }
        if (str2 != null && StringsKt__StringsKt.indexOf((CharSequence) str, str2, i13, false) == i13) {
            return i12 + 1;
        }
        return -1;
    }

    private static final <T> T screenFloatValue$StringsKt__StringNumberConversionsJVMKt(String str, Function1<? super String, ? extends T> function1) {
        try {
            if (isValidFloat$StringsKt__StringNumberConversionsJVMKt(str)) {
                return function1.invoke(str);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new BigDecimal(str);
    }

    @SinceKotlin(version = "1.2")
    @Nullable
    public static BigDecimal toBigDecimalOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (isValidFloat$StringsKt__StringNumberConversionsJVMKt(str)) {
                return new BigDecimal(str);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger toBigInteger(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new BigInteger(str);
    }

    @SinceKotlin(version = "1.2")
    @Nullable
    public static final BigInteger toBigIntegerOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toBigIntegerOrNull(str, 10);
    }

    @InlineOnly
    private static final byte toByte(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Byte.parseByte(str);
    }

    @InlineOnly
    private static final int toInt(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Integer.parseInt(str);
    }

    @InlineOnly
    private static final long toLong(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Long.parseLong(str);
    }

    @InlineOnly
    private static final short toShort(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Short.parseShort(str);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String toString(byte b11, int i11) {
        String string = Integer.toString(b11, CharsKt__CharJVMKt.checkRadix(i11));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @InlineOnly
    private static final int advanceWhile$StringsKt__StringNumberConversionsJVMKt(String str, int i11, int i12, Function1<? super Character, Boolean> function1) {
        while (i11 <= i12 && function1.invoke(Character.valueOf(str.charAt(i11))).booleanValue()) {
            i11++;
        }
        return i11;
    }

    @InlineOnly
    /* JADX INFO: renamed from: asciiLetterToLowerCaseCode$StringsKt__StringNumberConversionsJVMKt */
    private static final int m90327xae944efa(char c11) {
        return c11 | ' ';
    }

    @InlineOnly
    private static final int backtrackWhile$StringsKt__StringNumberConversionsJVMKt(String str, int i11, int i12, Function1<? super Character, Boolean> function1) {
        while (i12 > i11 && function1.invoke(Character.valueOf(str.charAt(i12))).booleanValue()) {
            i12--;
        }
        return i12;
    }

    @InlineOnly
    private static final String guessNamedFloatConstant$StringsKt__StringNumberConversionsJVMKt(int i11, int i12) {
        if (i12 == i11 + 2) {
            return "NaN";
        }
        if (i12 == i11 + 7) {
            return "Infinity";
        }
        return null;
    }

    @InlineOnly
    private static final boolean isAsciiDigit$StringsKt__StringNumberConversionsJVMKt(char c11) {
        return ((c11 + 65488) & 65535) < 10;
    }

    @InlineOnly
    private static final boolean isHexLetter$StringsKt__StringNumberConversionsJVMKt(char c11) {
        return (((c11 | ' ') + (-97)) & 65535) < 6;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0121  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    private static final boolean isValidFloat$StringsKt__StringNumberConversionsJVMKt(String str) {
        char c11;
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        String str2;
        boolean z14;
        boolean z15 = true;
        int length = str.length() - 1;
        int i12 = 0;
        while (true) {
            c11 = ' ';
            if (i12 > length || str.charAt(i12) > ' ') {
                break;
            }
            i12++;
        }
        if (i12 > length) {
            return false;
        }
        while (length > i12 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i12) == '+' || str.charAt(i12) == '-') {
            i12++;
        }
        if (i12 > length) {
            return false;
        }
        if (str.charAt(i12) != '0') {
            z11 = true;
            z12 = false;
        } else {
            int i13 = i12 + 1;
            if (i13 > length) {
                return true;
            }
            if ((str.charAt(i13) | ' ') == 120) {
                int i14 = i12 + 2;
                int i15 = i14;
                while (true) {
                    if (i15 > length) {
                        z11 = z15;
                        break;
                    }
                    char cCharAt = str.charAt(i15);
                    z11 = z15;
                    if (((cCharAt - '0') & 65535) >= 10 && (((cCharAt | ' ') - 97) & 65535) >= 6) {
                        break;
                    }
                    i15++;
                    z15 = z11;
                }
                boolean z16 = i14 != i15 ? z11 : false;
                if (i15 <= length) {
                    if (str.charAt(i15) == '.') {
                        int i16 = i15 + 1;
                        int i17 = i16;
                        while (i17 <= length) {
                            char cCharAt2 = str.charAt(i17);
                            char c12 = c11;
                            if (((cCharAt2 - '0') & 65535) >= 10 && (((cCharAt2 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i17++;
                            c11 = c12;
                        }
                        z14 = i16 != i17 ? z11 : false;
                        i15 = i17;
                    } else {
                        z14 = false;
                    }
                    if (z16 || z14) {
                        i12 = i15;
                    }
                    if (i12 != -1 || i12 > length) {
                        return false;
                    }
                    z12 = z11;
                }
                i12 = -1;
                if (i12 != -1) {
                }
                return false;
            }
            z11 = true;
            z12 = false;
        }
        if (!z12) {
            int i18 = i12;
            while (i18 <= length && ((str.charAt(i18) - '0') & 65535) < 10) {
                i18++;
            }
            boolean z17 = i12 != i18 ? z11 : false;
            if (i18 > length) {
                i12 = i18;
            } else {
                if (str.charAt(i18) == '.') {
                    int i19 = i18 + 1;
                    i11 = i19;
                    while (i11 <= length && ((str.charAt(i11) - '0') & 65535) < 10) {
                        i11++;
                    }
                    if (i19 != i11) {
                        z13 = z11;
                    }
                    if (!z17 || z13) {
                        i12 = i11;
                    } else {
                        if (length == i11 + 2) {
                            str2 = "NaN";
                        } else {
                            str2 = length == i11 + 7 ? "Infinity" : null;
                        }
                        i12 = (str2 != null && StringsKt__StringsKt.indexOf((CharSequence) str, str2, i11, false) == i11) ? length + 1 : -1;
                    }
                } else {
                    i11 = i18;
                }
                z13 = false;
                if (z17) {
                    i12 = i11;
                } else {
                    i12 = i11;
                }
            }
            if (i12 == -1) {
                return false;
            }
            if (i12 > length) {
                return z11;
            }
        }
        int i21 = i12 + 1;
        int iCharAt = str.charAt(i12) | ' ';
        if (iCharAt != (z12 ? 112 : 101)) {
            if (z12 || (!(iCharAt == 102 || iCharAt == 100) || i21 <= length)) {
                return false;
            }
            return z11;
        }
        if (i21 > length) {
            return false;
        }
        if ((str.charAt(i21) == '+' || str.charAt(i21) == '-') && (i21 = i12 + 2) > length) {
            return false;
        }
        while (i21 <= length && ((str.charAt(i21) - '0') & 65535) < 10) {
            i21++;
        }
        if (i21 > length) {
            return z11;
        }
        if (i21 != length) {
            return false;
        }
        int iCharAt2 = str.charAt(i21) | ' ';
        if (iCharAt2 == 102 || iCharAt2 == 100) {
            return z11;
        }
        return false;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(String str, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(str, mathContext);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger toBigInteger(String str, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new BigInteger(str, CharsKt__CharJVMKt.checkRadix(i11));
    }

    @SinceKotlin(version = "1.2")
    @Nullable
    public static final BigInteger toBigIntegerOrNull(@NotNull String str, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i11);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        if (length != 1) {
            for (int i12 = str.charAt(0) == '-' ? 1 : 0; i12 < length; i12++) {
                if (CharsKt__CharJVMKt.digitOf(str.charAt(i12), i11) < 0) {
                    return null;
                }
            }
        } else if (CharsKt__CharJVMKt.digitOf(str.charAt(0), i11) < 0) {
            return null;
        }
        return new BigInteger(str, CharsKt__CharJVMKt.checkRadix(i11));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte toByte(String str, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Byte.parseByte(str, CharsKt__CharJVMKt.checkRadix(i11));
    }

    @InlineOnly
    private static final double toDouble(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Double.parseDouble(str);
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static Double toDoubleOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (isValidFloat$StringsKt__StringNumberConversionsJVMKt(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @InlineOnly
    private static final float toFloat(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Float.parseFloat(str);
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static Float toFloatOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (isValidFloat$StringsKt__StringNumberConversionsJVMKt(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int toInt(String str, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Integer.parseInt(str, CharsKt__CharJVMKt.checkRadix(i11));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long toLong(String str, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Long.parseLong(str, CharsKt__CharJVMKt.checkRadix(i11));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short toShort(String str, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Short.parseShort(str, CharsKt__CharJVMKt.checkRadix(i11));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String toString(short s11, int i11) {
        String string = Integer.toString(s11, CharsKt__CharJVMKt.checkRadix(i11));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final boolean toBoolean(String str) {
        return Boolean.parseBoolean(str);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String toString(int i11, int i12) {
        String string = Integer.toString(i11, CharsKt__CharJVMKt.checkRadix(i12));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @SinceKotlin(version = "1.2")
    @Nullable
    public static final BigDecimal toBigDecimalOrNull(@NotNull String str, @NotNull MathContext mathContext) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        try {
            if (isValidFloat$StringsKt__StringNumberConversionsJVMKt(str)) {
                return new BigDecimal(str, mathContext);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String toString(long j11, int i11) {
        String string = Long.toString(j11, CharsKt__CharJVMKt.checkRadix(i11));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
