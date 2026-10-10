package p852kotlin.text;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p852kotlin.ExperimentalStdlibApi;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.ULong;
import p852kotlin.UShort;
import p852kotlin.WasExperimental;
import p852kotlin.collections.AbstractList;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: HexExtensions.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0001\n\u0000\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010\u000b\u001a\u00020\u0001*\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a,\u0010\u0012\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0002\u001a,\u0010\u0016\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0002\u001a,\u0010\u0017\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0002\u001a,\u0010\u0018\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0002\u001a<\u0010\u0019\u001a\u00020\u0010*\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0010H\u0002\u001a,\u0010\u0019\u001a\u00020\u0010*\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0010H\u0002\u001a(\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010H\u0002\u001a@\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010H\u0000\u001a\u0010\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020*H\u0002\u001a\u0016\u0010+\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010+\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0002\u001a&\u0010,\u001a\u0004\u0018\u00010\f*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a&\u0010-\u001a\u0004\u0018\u00010\f*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a&\u0010.\u001a\u0004\u0018\u00010\f*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a$\u0010/\u001a\u00020\f*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a\u0014\u00100\u001a\u000201*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0010H\u0002\u001a@\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010H\u0000\u001a \u00104\u001a\u00020*2\u0006\u00105\u001a\u00020*2\u0006\u00106\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0010H\u0002\u001a \u00108\u001a\u00020*2\u0006\u00104\u001a\u00020*2\u0006\u00105\u001a\u00020*2\u0006\u00107\u001a\u00020\u0010H\u0002\u001a\u001c\u00109\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u0002012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0016\u0010:\u001a\u000201*\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010:\u001a\u000201*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u00020;2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0016\u0010<\u001a\u00020;*\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010<\u001a\u00020;*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0016\u0010=\u001a\u00020\u0010*\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010=\u001a\u00020\u0010*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0000\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u00020*2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0016\u0010>\u001a\u00020**\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010>\u001a\u00020**\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0000\u001a$\u0010?\u001a\u00020\u0001*\u00020*2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u00012\u0006\u0010C\u001a\u00020\u0010H\u0002\u001a\u001c\u0010D\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0010H\u0002\u001a,\u0010E\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u0010H\u0002\u001a,\u0010G\u001a\u00020**\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u0010H\u0002\u001a<\u0010H\u001a\u00020I*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010J\u001a\u00020\u00012\u0006\u0010K\u001a\u00020\u00012\u0006\u0010L\u001a\u00020M2\u0006\u0010F\u001a\u00020\u0010H\u0002\u001a$\u0010N\u001a\u00020I*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010F\u001a\u00020\u0010H\u0002\u001a\u001c\u0010O\u001a\u00020I*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a\u001c\u0010P\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a\u001c\u0010Q\u001a\u00020**\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a5\u0010R\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010S\u001a\u00020\u00012\u0006\u0010L\u001a\u00020M2\u0006\u0010T\u001a\u00020\u0001H\u0082\b\u001a\u0015\u0010U\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0010H\u0082\b\u001a\u0015\u0010V\u001a\u00020**\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0010H\u0082\b\u001a,\u0010W\u001a\u00020I*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010X\u001a\u00020\u00012\u0006\u0010Y\u001a\u00020\u0010H\u0002\u001a,\u0010Z\u001a\u00020I*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010S\u001a\u00020\u00012\u0006\u0010T\u001a\u00020\u0001H\u0002\u001a,\u0010[\u001a\u00020I*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010J\u001a\u00020\u00012\u0006\u0010K\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\\\u001a\u00020]*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0010H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006^"}, m90084d2 = {"LOWER_CASE_HEX_DIGITS", "", "UPPER_CASE_HEX_DIGITS", "BYTE_TO_LOWER_CASE_HEX_DIGITS", "", "getBYTE_TO_LOWER_CASE_HEX_DIGITS", "()[I", "BYTE_TO_UPPER_CASE_HEX_DIGITS", "HEX_DIGITS_TO_DECIMAL", "HEX_DIGITS_TO_LONG_DECIMAL", "", "toHexString", "", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "Lkotlin/text/HexFormat;", SpellCheckPlugin.START_INDEX_KEY, "", SpellCheckPlugin.END_INDEX_KEY, "toHexStringNoLineAndGroupSeparator", "bytesFormat", "Lkotlin/text/HexFormat$BytesHexFormat;", "byteToDigits", "toHexStringShortByteSeparatorNoPrefixAndSuffix", "toHexStringNoLineAndGroupSeparatorSlowPath", "toHexStringSlowPath", "formatByteAt", "index", "bytePrefix", "byteSuffix", FirebaseAnalytics.Param.DESTINATION, "", "destinationOffset", "formattedStringLength", "numberOfBytes", "byteSeparatorLength", "bytePrefixLength", "byteSuffixLength", "bytesPerLine", "bytesPerGroup", "groupSeparatorLength", "checkFormatLength", "formatLength", "", "hexToByteArray", "hexToByteArrayNoLineAndGroupSeparator", "hexToByteArrayShortByteSeparatorNoPrefixAndSuffix", "hexToByteArrayNoLineAndGroupSeparatorSlowPath", "hexToByteArraySlowPath", "parseByteAt", "", "parsedByteArrayMaxSize", "stringLength", "charsPerSet", "charsPerElement", "elementsPerSet", "elementSeparatorLength", "wholeElementsPerSet", "checkNewLineAt", "hexToByte", "", "hexToShort", "hexToInt", "hexToLong", "toHexStringImpl", "numberFormat", "Lkotlin/text/HexFormat$NumberHexFormat;", "digits", "bits", "toCharArrayIfNotEmpty", "hexToIntImpl", "typeHexLength", "hexToLongImpl", "checkPrefixSuffixNumberOfDigits", "", "prefix", "suffix", "ignoreCase", "", "checkNumberOfDigits", "checkZeroDigits", "parseInt", "parseLong", "checkContainsAt", "part", "partName", "decimalFromHexDigitAt", "longDecimalFromHexDigitAt", "throwInvalidNumberOfDigits", "specifier", "expected", "throwNotContainedAt", "throwInvalidPrefixSuffix", "throwInvalidDigitAt", "", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHexExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,1237:1\n1186#1,7:1239\n1186#1,7:1246\n1186#1,7:1253\n1186#1,7:1260\n1186#1,7:1267\n1186#1,7:1274\n1186#1,7:1281\n1186#1,7:1288\n1197#1,5:1295\n1197#1,5:1300\n1186#1,7:1305\n1186#1,7:1312\n1197#1,5:1319\n1206#1,5:1324\n1#2:1238\n1188#3,3:1329\n1188#3,3:1332\n1188#3,3:1335\n1188#3,3:1338\n*S KotlinDebug\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n*L\n450#1:1239,7\n482#1:1246,7\n486#1:1253,7\n489#1:1260,7\n529#1:1267,7\n532#1:1274,7\n537#1:1281,7\n542#1:1288,7\n549#1:1295,5\n550#1:1300,5\n1141#1:1305,7\n1143#1:1312,7\n1171#1:1319,5\n1179#1:1324,5\n42#1:1329,3\n43#1:1332,3\n54#1:1335,3\n55#1:1338,3\n*E\n"})
public final class HexExtensionsKt {

    @NotNull
    private static final int[] BYTE_TO_LOWER_CASE_HEX_DIGITS;

    @NotNull
    private static final int[] BYTE_TO_UPPER_CASE_HEX_DIGITS;

    @NotNull
    private static final int[] HEX_DIGITS_TO_DECIMAL;

    @NotNull
    private static final long[] HEX_DIGITS_TO_LONG_DECIMAL;

    @NotNull
    private static final String LOWER_CASE_HEX_DIGITS = "0123456789abcdef";

    @NotNull
    private static final String UPPER_CASE_HEX_DIGITS = "0123456789ABCDEF";

    private static final int formatByteAt(byte[] bArr, int i11, String str, String str2, int[] iArr, char[] cArr, int i12) {
        return toCharArrayIfNotEmpty(str2, cArr, formatByteAt(bArr, i11, iArr, cArr, toCharArrayIfNotEmpty(str, cArr, i12)));
    }

    private static final int formattedStringLength(int i11, int i12, int i13, int i14) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j11 = i12;
        return checkFormatLength((((long) i11) * (((((long) i13) + 2) + ((long) i14)) + j11)) - j11);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final byte hexToByte(@NotNull String str, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToByte(str, 0, str.length(), format);
    }

    public static /* synthetic */ byte hexToByte$default(String str, HexFormat hexFormat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByte(str, hexFormat);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final byte[] hexToByteArray(@NotNull String str, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToByteArray(str, 0, str.length(), format);
    }

    public static /* synthetic */ byte[] hexToByteArray$default(String str, HexFormat hexFormat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByteArray(str, hexFormat);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final int hexToInt(@NotNull String str, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToInt(str, 0, str.length(), format);
    }

    public static /* synthetic */ int hexToInt$default(String str, HexFormat hexFormat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToInt(str, hexFormat);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final long hexToLong(@NotNull String str, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToLong(str, 0, str.length(), format);
    }

    public static /* synthetic */ long hexToLong$default(String str, HexFormat hexFormat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToLong(str, hexFormat);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final short hexToShort(@NotNull String str, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToShort(str, 0, str.length(), format);
    }

    public static /* synthetic */ short hexToShort$default(String str, HexFormat hexFormat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToShort(str, hexFormat);
    }

    private static final int parseInt(String str, int i11, int i12) {
        int i13;
        int i14 = 0;
        while (i11 < i12) {
            int i15 = i14 << 4;
            char cCharAt = str.charAt(i11);
            if ((cCharAt >>> '\b') != 0 || (i13 = HEX_DIGITS_TO_DECIMAL[cCharAt]) < 0) {
                throwInvalidDigitAt(str, i11);
                throw new KotlinNothingValueException();
            }
            i14 = i15 | i13;
            i11++;
        }
        return i14;
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final String toHexString(@NotNull byte[] bArr, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexString(bArr, 0, bArr.length, format);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, HexFormat hexFormat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(bArr, hexFormat);
    }

    static {
        int[] iArr = new int[256];
        int i11 = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            iArr[i12] = LOWER_CASE_HEX_DIGITS.charAt(i12 & 15) | (LOWER_CASE_HEX_DIGITS.charAt(i12 >> 4) << '\b');
        }
        BYTE_TO_LOWER_CASE_HEX_DIGITS = iArr;
        int[] iArr2 = new int[256];
        for (int i13 = 0; i13 < 256; i13++) {
            iArr2[i13] = UPPER_CASE_HEX_DIGITS.charAt(i13 & 15) | (UPPER_CASE_HEX_DIGITS.charAt(i13 >> 4) << '\b');
        }
        BYTE_TO_UPPER_CASE_HEX_DIGITS = iArr2;
        int[] iArr3 = new int[256];
        for (int i14 = 0; i14 < 256; i14++) {
            iArr3[i14] = -1;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < LOWER_CASE_HEX_DIGITS.length()) {
            iArr3[LOWER_CASE_HEX_DIGITS.charAt(i15)] = i16;
            i15++;
            i16++;
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < UPPER_CASE_HEX_DIGITS.length()) {
            iArr3[UPPER_CASE_HEX_DIGITS.charAt(i17)] = i18;
            i17++;
            i18++;
        }
        HEX_DIGITS_TO_DECIMAL = iArr3;
        long[] jArr = new long[256];
        for (int i19 = 0; i19 < 256; i19++) {
            jArr[i19] = -1;
        }
        int i21 = 0;
        int i22 = 0;
        while (i21 < LOWER_CASE_HEX_DIGITS.length()) {
            jArr[LOWER_CASE_HEX_DIGITS.charAt(i21)] = i22;
            i21++;
            i22++;
        }
        int i23 = 0;
        while (i11 < UPPER_CASE_HEX_DIGITS.length()) {
            jArr[UPPER_CASE_HEX_DIGITS.charAt(i11)] = i23;
            i11++;
            i23++;
        }
        HEX_DIGITS_TO_LONG_DECIMAL = jArr;
    }

    private static final long charsPerSet(long j11, int i11, int i12) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j12 = i11;
        return (j11 * j12) + (((long) i12) * (j12 - 1));
    }

    private static final int checkFormatLength(long j11) {
        if (0 <= j11 && j11 <= 2147483647L) {
            return (int) j11;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) ULong.m104064toStringimpl(ULong.m104018constructorimpl(j11))));
    }

    private static final void checkNumberOfDigits(String str, int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if (i14 < 1) {
            throwInvalidNumberOfDigits(str, i11, i12, "at least", 1);
        } else if (i14 > i13) {
            checkZeroDigits(str, i11, (i14 + i11) - i13);
        }
    }

    private static final void checkPrefixSuffixNumberOfDigits(String str, int i11, int i12, String str2, String str3, boolean z11, int i13) {
        if ((i12 - i11) - str2.length() <= str3.length()) {
            throwInvalidPrefixSuffix(str, i11, i12, str2, str3);
        }
        if (str2.length() != 0) {
            int length = str2.length();
            for (int i14 = 0; i14 < length; i14++) {
                if (!CharsKt__CharKt.equals(str2.charAt(i14), str.charAt(i11 + i14), z11)) {
                    throwNotContainedAt(str, i11, i12, str2, "prefix");
                }
            }
            i11 += str2.length();
        }
        int length2 = i12 - str3.length();
        if (str3.length() != 0) {
            int length3 = str3.length();
            for (int i15 = 0; i15 < length3; i15++) {
                if (!CharsKt__CharKt.equals(str3.charAt(i15), str.charAt(length2 + i15), z11)) {
                    throwNotContainedAt(str, length2, i12, str3, "suffix");
                }
            }
        }
        checkNumberOfDigits(str, i11, length2, i13);
    }

    private static final void checkZeroDigits(String str, int i11, int i12) {
        while (i11 < i12) {
            if (str.charAt(i11) != '0') {
                throw new NumberFormatException("Expected the hexadecimal digit '0' at index " + i11 + ", but was '" + str.charAt(i11) + "'.\nThe result won't fit the type being parsed.");
            }
            i11++;
        }
    }

    @NotNull
    public static final int[] getBYTE_TO_LOWER_CASE_HEX_DIGITS() {
        return BYTE_TO_LOWER_CASE_HEX_DIGITS;
    }

    private static final byte hexToByte(String str, int i11, int i12, HexFormat hexFormat) {
        return (byte) hexToIntImpl(str, i11, i12, hexFormat, 2);
    }

    private static final byte[] hexToByteArray(String str, int i11, int i12, HexFormat hexFormat) {
        byte[] bArrHexToByteArrayNoLineAndGroupSeparator;
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i11, i12, str.length());
        if (i11 == i12) {
            return new byte[0];
        }
        HexFormat.BytesHexFormat bytes = hexFormat.getBytes();
        return (!bytes.getNoLineAndGroupSeparator() || (bArrHexToByteArrayNoLineAndGroupSeparator = hexToByteArrayNoLineAndGroupSeparator(str, i11, i12, bytes)) == null) ? hexToByteArraySlowPath(str, i11, i12, bytes) : bArrHexToByteArrayNoLineAndGroupSeparator;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:45:0x010d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0110  */
    /* JADX WARN: Code duplicated, block: B:48:0x0117  */
    /* JADX WARN: Code duplicated, block: B:50:0x0129  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x012e A[SYNTHETIC] */
    private static final byte[] hexToByteArraySlowPath(String str, int i11, int i12, HexFormat.BytesHexFormat bytesHexFormat) {
        int i13;
        int i14;
        int i15;
        int length;
        int i16;
        int i17;
        int length2;
        int i18;
        int bytesPerLine = bytesHexFormat.getBytesPerLine();
        int bytesPerGroup = bytesHexFormat.getBytesPerGroup();
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        String groupSeparator = bytesHexFormat.getGroupSeparator();
        boolean ignoreCase$kotlin_stdlib = bytesHexFormat.getIgnoreCase();
        int i19 = parsedByteArrayMaxSize(i12 - i11, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        byte[] bArr = new byte[i19];
        int length3 = i11;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (length3 < i12) {
            if (i22 == bytesPerLine) {
                length3 = checkNewLineAt(str, length3, i12);
                i13 = bytesPerLine;
                i14 = bytesPerGroup;
                i22 = 0;
            } else {
                if (i23 != bytesPerGroup) {
                    i13 = bytesPerLine;
                    i14 = bytesPerGroup;
                    if (i23 != 0 && byteSeparator.length() != 0) {
                        int length4 = byteSeparator.length();
                        int i24 = 0;
                        while (i24 < length4) {
                            int i25 = length4;
                            if (!CharsKt__CharKt.equals(byteSeparator.charAt(i24), str.charAt(length3 + i24), ignoreCase$kotlin_stdlib)) {
                                throwNotContainedAt(str, length3, i12, byteSeparator, "byte separator");
                            }
                            i24++;
                            length4 = i25;
                        }
                        length3 += byteSeparator.length();
                    }
                } else if (groupSeparator.length() == 0) {
                    i13 = bytesPerLine;
                    i14 = bytesPerGroup;
                } else {
                    int length5 = groupSeparator.length();
                    int i26 = 0;
                    while (i26 < length5) {
                        int i27 = bytesPerLine;
                        int i28 = bytesPerGroup;
                        if (!CharsKt__CharKt.equals(groupSeparator.charAt(i26), str.charAt(length3 + i26), ignoreCase$kotlin_stdlib)) {
                            throwNotContainedAt(str, length3, i12, groupSeparator, "group separator");
                        }
                        i26++;
                        bytesPerLine = i27;
                        bytesPerGroup = i28;
                    }
                    i13 = bytesPerLine;
                    i14 = bytesPerGroup;
                    length3 += groupSeparator.length();
                }
                i22++;
                i23++;
                if (bytePrefix.length() != 0) {
                    length2 = bytePrefix.length();
                    i18 = 0;
                    while (i18 < length2) {
                        int i29 = length2;
                        if (!CharsKt__CharKt.equals(bytePrefix.charAt(i18), str.charAt(length3 + i18), ignoreCase$kotlin_stdlib)) {
                            throwNotContainedAt(str, length3, i12, bytePrefix, "byte prefix");
                        }
                        i18++;
                        length2 = i29;
                    }
                    length3 += bytePrefix.length();
                }
                if (i12 - 2 < length3) {
                    throwInvalidNumberOfDigits(str, length3, i12, "exactly", 2);
                }
                i15 = i21 + 1;
                bArr[i21] = parseByteAt(str, length3);
                length3 += 2;
                if (byteSuffix.length() == 0) {
                    i17 = i15;
                } else {
                    length = byteSuffix.length();
                    i16 = 0;
                    while (i16 < length) {
                        int i31 = i15;
                        if (!CharsKt__CharKt.equals(byteSuffix.charAt(i16), str.charAt(length3 + i16), ignoreCase$kotlin_stdlib)) {
                            throwNotContainedAt(str, length3, i12, byteSuffix, "byte suffix");
                        }
                        i16++;
                        i15 = i31;
                    }
                    i17 = i15;
                    length3 += byteSuffix.length();
                }
                i21 = i17;
                bytesPerLine = i13;
                bytesPerGroup = i14;
            }
            i23 = 0;
            i22++;
            i23++;
            if (bytePrefix.length() != 0) {
                length2 = bytePrefix.length();
                i18 = 0;
                while (i18 < length2) {
                    int i210 = length2;
                    if (!CharsKt__CharKt.equals(bytePrefix.charAt(i18), str.charAt(length3 + i18), ignoreCase$kotlin_stdlib)) {
                        throwNotContainedAt(str, length3, i12, bytePrefix, "byte prefix");
                    }
                    i18++;
                    length2 = i210;
                }
                length3 += bytePrefix.length();
            }
            if (i12 - 2 < length3) {
                throwInvalidNumberOfDigits(str, length3, i12, "exactly", 2);
            }
            i15 = i21 + 1;
            bArr[i21] = parseByteAt(str, length3);
            length3 += 2;
            if (byteSuffix.length() == 0) {
                i17 = i15;
            } else {
                length = byteSuffix.length();
                i16 = 0;
                while (i16 < length) {
                    int i32 = i15;
                    if (!CharsKt__CharKt.equals(byteSuffix.charAt(i16), str.charAt(length3 + i16), ignoreCase$kotlin_stdlib)) {
                        throwNotContainedAt(str, length3, i12, byteSuffix, "byte suffix");
                    }
                    i16++;
                    i15 = i32;
                }
                i17 = i15;
                length3 += byteSuffix.length();
            }
            i21 = i17;
            bytesPerLine = i13;
            bytesPerGroup = i14;
        }
        if (i21 == i19) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i21);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public static final int hexToInt(@NotNull String str, int i11, int i12, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToIntImpl(str, i11, i12, format, 8);
    }

    private static final int hexToIntImpl(String str, int i11, int i12, HexFormat hexFormat, int i13) {
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i11, i12, str.length());
        HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (number.getIsDigitsOnly()) {
            checkNumberOfDigits(str, i11, i12, i13);
            return parseInt(str, i11, i12);
        }
        String prefix = number.getPrefix();
        String suffix = number.getSuffix();
        checkPrefixSuffixNumberOfDigits(str, i11, i12, prefix, suffix, number.getIgnoreCase(), i13);
        return parseInt(str, i11 + prefix.length(), i12 - suffix.length());
    }

    public static final long hexToLong(@NotNull String str, int i11, int i12, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToLongImpl(str, i11, i12, format, 16);
    }

    private static final long hexToLongImpl(String str, int i11, int i12, HexFormat hexFormat, int i13) {
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i11, i12, str.length());
        HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (number.getIsDigitsOnly()) {
            checkNumberOfDigits(str, i11, i12, i13);
            return parseLong(str, i11, i12);
        }
        String prefix = number.getPrefix();
        String suffix = number.getSuffix();
        checkPrefixSuffixNumberOfDigits(str, i11, i12, prefix, suffix, number.getIgnoreCase(), i13);
        return parseLong(str, i11 + prefix.length(), i12 - suffix.length());
    }

    private static final short hexToShort(String str, int i11, int i12, HexFormat hexFormat) {
        return (short) hexToIntImpl(str, i11, i12, hexFormat, 4);
    }

    private static final long parseLong(String str, int i11, int i12) {
        long j11 = 0;
        while (i11 < i12) {
            long j12 = j11 << 4;
            char cCharAt = str.charAt(i11);
            if ((cCharAt >>> '\b') == 0) {
                long j13 = HEX_DIGITS_TO_LONG_DECIMAL[cCharAt];
                if (j13 >= 0) {
                    j11 = j12 | j13;
                    i11++;
                }
            }
            throwInvalidDigitAt(str, i11);
            throw new KotlinNothingValueException();
        }
        return j11;
    }

    public static final int parsedByteArrayMaxSize(int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        long jCharsPerSet;
        if (i11 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j11 = ((long) i16) + 2 + ((long) i17);
        long jCharsPerSet2 = charsPerSet(j11, i13, i15);
        if (i12 <= i13) {
            jCharsPerSet = charsPerSet(j11, i12, i15);
        } else {
            jCharsPerSet = charsPerSet(jCharsPerSet2, i12 / i13, i14);
            int i18 = i12 % i13;
            if (i18 != 0) {
                jCharsPerSet = jCharsPerSet + ((long) i14) + charsPerSet(j11, i18, i15);
            }
        }
        long j12 = i11;
        long jWholeElementsPerSet = wholeElementsPerSet(j12, jCharsPerSet, 1);
        long j13 = j12 - ((jCharsPerSet + 1) * jWholeElementsPerSet);
        long jWholeElementsPerSet2 = wholeElementsPerSet(j13, jCharsPerSet2, i14);
        long j14 = j13 - ((jCharsPerSet2 + ((long) i14)) * jWholeElementsPerSet2);
        long jWholeElementsPerSet3 = wholeElementsPerSet(j14, j11, i15);
        return (int) ((jWholeElementsPerSet * ((long) i12)) + (jWholeElementsPerSet2 * ((long) i13)) + jWholeElementsPerSet3 + ((long) (j14 - ((j11 + ((long) i15)) * jWholeElementsPerSet3) > 0 ? 1 : 0)));
    }

    private static final Void throwInvalidDigitAt(String str, int i11) {
        throw new NumberFormatException("Expected a hexadecimal digit at index " + i11 + ", but was " + str.charAt(i11));
    }

    private static final void throwInvalidNumberOfDigits(String str, int i11, int i12, String str2, int i13) {
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i11, i12);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i13 + " hexadecimal digits at index " + i11 + ", but was \"" + strSubstring + "\" of length " + (i12 - i11));
    }

    private static final void throwInvalidPrefixSuffix(String str, int i11, int i12, String str2, String str3) {
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i11, i12);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"" + str2 + "\" and suffix \"" + str3 + "\", but was " + strSubstring);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final String toHexString(@NotNull byte[] bArr, int i11, int i12, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i11, i12, bArr.length);
        if (i11 == i12) {
            return "";
        }
        int[] iArr = format.getUpperCase() ? BYTE_TO_UPPER_CASE_HEX_DIGITS : BYTE_TO_LOWER_CASE_HEX_DIGITS;
        HexFormat.BytesHexFormat bytes = format.getBytes();
        return bytes.getNoLineAndGroupSeparator() ? toHexStringNoLineAndGroupSeparator(bArr, i11, i12, bytes, iArr) : toHexStringSlowPath(bArr, i11, i12, bytes, iArr);
    }

    private static final String toHexStringImpl(long j11, HexFormat.NumberHexFormat numberHexFormat, String str, int i11) {
        if ((i11 & 3) != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i12 = i11 >> 2;
        int minLength = numberHexFormat.getMinLength();
        int iCoerceAtLeast = RangesKt.coerceAtLeast(minLength - i12, 0);
        String prefix = numberHexFormat.getPrefix();
        String suffix = numberHexFormat.getSuffix();
        boolean removeLeadingZeros = numberHexFormat.getRemoveLeadingZeros();
        int iCheckFormatLength = checkFormatLength(((long) prefix.length()) + ((long) iCoerceAtLeast) + ((long) i12) + ((long) suffix.length()));
        char[] cArr = new char[iCheckFormatLength];
        int charArrayIfNotEmpty = toCharArrayIfNotEmpty(prefix, cArr, 0);
        if (iCoerceAtLeast > 0) {
            int i13 = iCoerceAtLeast + charArrayIfNotEmpty;
            ArraysKt.fill(cArr, str.charAt(0), charArrayIfNotEmpty, i13);
            charArrayIfNotEmpty = i13;
        }
        int i14 = i11;
        for (int i15 = 0; i15 < i12; i15++) {
            i14 -= 4;
            int i16 = (int) ((j11 >> i14) & 15);
            removeLeadingZeros = removeLeadingZeros && i16 == 0 && (i14 >> 2) >= minLength;
            if (!removeLeadingZeros) {
                cArr[charArrayIfNotEmpty] = str.charAt(i16);
                charArrayIfNotEmpty++;
            }
        }
        int charArrayIfNotEmpty2 = toCharArrayIfNotEmpty(suffix, cArr, charArrayIfNotEmpty);
        return charArrayIfNotEmpty2 == iCheckFormatLength ? StringsKt__StringsJVMKt.concatToString(cArr) : StringsKt__StringsJVMKt.concatToString$default(cArr, 0, charArrayIfNotEmpty2, 1, null);
    }

    private static final String toHexStringSlowPath(byte[] bArr, int i11, int i12, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        int i13;
        int i14;
        int bytesPerLine = bytesHexFormat.getBytesPerLine();
        int bytesPerGroup = bytesHexFormat.getBytesPerGroup();
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        String groupSeparator = bytesHexFormat.getGroupSeparator();
        int i15 = formattedStringLength(i12 - i11, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        char[] cArr = new char[i15];
        int i16 = i11;
        int charArrayIfNotEmpty = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < i12) {
            if (i17 == bytesPerLine) {
                cArr[charArrayIfNotEmpty] = '\n';
                charArrayIfNotEmpty++;
                i13 = 0;
                i14 = 0;
            } else if (i18 == bytesPerGroup) {
                charArrayIfNotEmpty = toCharArrayIfNotEmpty(groupSeparator, cArr, charArrayIfNotEmpty);
                i13 = i17;
                i14 = 0;
            } else {
                i13 = i17;
                i14 = i18;
            }
            if (i14 != 0) {
                charArrayIfNotEmpty = toCharArrayIfNotEmpty(byteSeparator, cArr, charArrayIfNotEmpty);
            }
            String str = bytePrefix;
            int byteAt = formatByteAt(bArr, i16, str, byteSuffix, iArr, cArr, charArrayIfNotEmpty);
            i16++;
            i18 = i14 + 1;
            charArrayIfNotEmpty = byteAt;
            bytePrefix = str;
            i17 = i13 + 1;
        }
        if (charArrayIfNotEmpty == i15) {
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    private static final long wholeElementsPerSet(long j11, long j12, int i11) {
        if (j11 <= 0 || j12 <= 0) {
            return 0L;
        }
        long j13 = i11;
        return (j11 + j13) / (j12 + j13);
    }

    private static final int checkContainsAt(String str, int i11, int i12, String str2, boolean z11, String str3) {
        if (str2.length() == 0) {
            return i11;
        }
        int length = str2.length();
        for (int i13 = 0; i13 < length; i13++) {
            if (!CharsKt__CharKt.equals(str2.charAt(i13), str.charAt(i11 + i13), z11)) {
                throwNotContainedAt(str, i11, i12, str2, str3);
            }
        }
        return i11 + str2.length();
    }

    private static final int checkNewLineAt(String str, int i11, int i12) {
        if (str.charAt(i11) == '\r') {
            int i13 = i11 + 1;
            if (i13 < i12 && str.charAt(i13) == '\n') {
                return i11 + 2;
            }
            return i13;
        }
        if (str.charAt(i11) == '\n') {
            return i11 + 1;
        }
        throw new NumberFormatException("Expected a new line at index " + i11 + ", but was " + str.charAt(i11));
    }

    private static final int decimalFromHexDigitAt(String str, int i11) {
        int i12;
        char cCharAt = str.charAt(i11);
        if ((cCharAt >>> '\b') == 0 && (i12 = HEX_DIGITS_TO_DECIMAL[cCharAt]) >= 0) {
            return i12;
        }
        throwInvalidDigitAt(str, i11);
        throw new KotlinNothingValueException();
    }

    public static final int formattedStringLength(int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (i11 > 0) {
            int i18 = i11 - 1;
            int i19 = i18 / i12;
            int i21 = (i12 - 1) / i13;
            int i22 = i11 % i12;
            if (i22 != 0) {
                i12 = i22;
            }
            int i23 = (i21 * i19) + ((i12 - 1) / i13);
            return checkFormatLength(((long) i19) + (((long) i23) * ((long) i14)) + (((long) ((i18 - i19) - i23)) * ((long) i15)) + (((long) i11) * (((long) i16) + 2 + ((long) i17))));
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static /* synthetic */ byte hexToByte$default(String str, int i11, int i12, HexFormat hexFormat, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        if ((i13 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByte(str, i11, i12, hexFormat);
    }

    public static /* synthetic */ byte[] hexToByteArray$default(String str, int i11, int i12, HexFormat hexFormat, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        if ((i13 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByteArray(str, i11, i12, hexFormat);
    }

    private static final byte[] hexToByteArrayNoLineAndGroupSeparator(String str, int i11, int i12, HexFormat.BytesHexFormat bytesHexFormat) {
        if (bytesHexFormat.getShortByteSeparatorNoPrefixAndSuffix()) {
            return hexToByteArrayShortByteSeparatorNoPrefixAndSuffix(str, i11, i12, bytesHexFormat);
        }
        return hexToByteArrayNoLineAndGroupSeparatorSlowPath(str, i11, i12, bytesHexFormat);
    }

    private static final byte[] hexToByteArrayNoLineAndGroupSeparatorSlowPath(String str, int i11, int i12, HexFormat.BytesHexFormat bytesHexFormat) {
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        long length = byteSeparator.length();
        long length2 = ((long) bytePrefix.length()) + 2 + ((long) byteSuffix.length()) + length;
        long j11 = i12 - i11;
        int i13 = (int) ((j11 + length) / length2);
        if ((((long) i13) * length2) - length != j11) {
            return null;
        }
        boolean ignoreCase$kotlin_stdlib = bytesHexFormat.getIgnoreCase();
        byte[] bArr = new byte[i13];
        if (bytePrefix.length() != 0) {
            int length3 = bytePrefix.length();
            for (int i14 = 0; i14 < length3; i14++) {
                if (!CharsKt__CharKt.equals(bytePrefix.charAt(i14), str.charAt(i11 + i14), ignoreCase$kotlin_stdlib)) {
                    throwNotContainedAt(str, i11, i12, bytePrefix, "byte prefix");
                }
            }
            i11 += bytePrefix.length();
        }
        String str2 = byteSuffix + byteSeparator + bytePrefix;
        int i15 = i13 - 1;
        for (int i16 = 0; i16 < i15; i16++) {
            bArr[i16] = parseByteAt(str, i11);
            i11 += 2;
            if (str2.length() != 0) {
                int length4 = str2.length();
                for (int i17 = 0; i17 < length4; i17++) {
                    if (!CharsKt__CharKt.equals(str2.charAt(i17), str.charAt(i11 + i17), ignoreCase$kotlin_stdlib)) {
                        throwNotContainedAt(str, i11, i12, str2, "byte suffix + byte separator + byte prefix");
                    }
                }
                i11 += str2.length();
            }
        }
        bArr[i15] = parseByteAt(str, i11);
        int i18 = i11 + 2;
        if (byteSuffix.length() == 0) {
            return bArr;
        }
        int length5 = byteSuffix.length();
        for (int i19 = 0; i19 < length5; i19++) {
            if (!CharsKt__CharKt.equals(byteSuffix.charAt(i19), str.charAt(i18 + i19), ignoreCase$kotlin_stdlib)) {
                throwNotContainedAt(str, i18, i12, byteSuffix, "byte suffix");
            }
        }
        return bArr;
    }

    private static final byte[] hexToByteArrayShortByteSeparatorNoPrefixAndSuffix(String str, int i11, int i12, HexFormat.BytesHexFormat bytesHexFormat) {
        int length = bytesHexFormat.getByteSeparator().length();
        if (length <= 1) {
            int i13 = i12 - i11;
            int i14 = 2;
            if (length == 0) {
                if ((i13 & 1) != 0) {
                    return null;
                }
                int i15 = i13 >> 1;
                byte[] bArr = new byte[i15];
                int i16 = 0;
                for (int i17 = 0; i17 < i15; i17++) {
                    bArr[i17] = parseByteAt(str, i16);
                    i16 += 2;
                }
                return bArr;
            }
            if (i13 % 3 != 2) {
                return null;
            }
            int i18 = (i13 / 3) + 1;
            byte[] bArr2 = new byte[i18];
            char cCharAt = bytesHexFormat.getByteSeparator().charAt(0);
            bArr2[0] = parseByteAt(str, 0);
            for (int i19 = 1; i19 < i18; i19++) {
                if (str.charAt(i14) != cCharAt) {
                    String byteSeparator = bytesHexFormat.getByteSeparator();
                    boolean ignoreCase$kotlin_stdlib = bytesHexFormat.getIgnoreCase();
                    if (byteSeparator.length() != 0) {
                        int length2 = byteSeparator.length();
                        for (int i21 = 0; i21 < length2; i21++) {
                            if (!CharsKt__CharKt.equals(byteSeparator.charAt(i21), str.charAt(i14 + i21), ignoreCase$kotlin_stdlib)) {
                                throwNotContainedAt(str, i14, i12, byteSeparator, "byte separator");
                            }
                        }
                        byteSeparator.length();
                    }
                }
                bArr2[i19] = parseByteAt(str, i14 + 1);
                i14 += 3;
            }
            return bArr2;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static /* synthetic */ int hexToInt$default(String str, int i11, int i12, HexFormat hexFormat, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        if ((i13 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToInt(str, i11, i12, hexFormat);
    }

    public static /* synthetic */ long hexToLong$default(String str, int i11, int i12, HexFormat hexFormat, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        if ((i13 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToLong(str, i11, i12, hexFormat);
    }

    public static /* synthetic */ short hexToShort$default(String str, int i11, int i12, HexFormat hexFormat, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        if ((i13 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToShort(str, i11, i12, hexFormat);
    }

    private static final long longDecimalFromHexDigitAt(String str, int i11) {
        char cCharAt = str.charAt(i11);
        if ((cCharAt >>> '\b') == 0) {
            long j11 = HEX_DIGITS_TO_LONG_DECIMAL[cCharAt];
            if (j11 >= 0) {
                return j11;
            }
        }
        throwInvalidDigitAt(str, i11);
        throw new KotlinNothingValueException();
    }

    private static final byte parseByteAt(String str, int i11) {
        int[] iArr;
        int i12;
        int i13;
        char cCharAt = str.charAt(i11);
        if ((cCharAt >>> '\b') == 0 && (i12 = (iArr = HEX_DIGITS_TO_DECIMAL)[cCharAt]) >= 0) {
            int i14 = i11 + 1;
            char cCharAt2 = str.charAt(i14);
            if ((cCharAt2 >>> '\b') == 0 && (i13 = iArr[cCharAt2]) >= 0) {
                return (byte) ((i12 << 4) | i13);
            }
            throwInvalidDigitAt(str, i14);
            throw new KotlinNothingValueException();
        }
        throwInvalidDigitAt(str, i11);
        throw new KotlinNothingValueException();
    }

    private static final void throwNotContainedAt(String str, int i11, int i12, String str2, String str3) {
        int iCoerceAtMost = RangesKt.coerceAtMost(str2.length() + i11, i12);
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i11, iCoerceAtMost);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str3 + " \"" + str2 + "\" at index " + i11 + ", but was " + strSubstring);
    }

    private static final int toCharArrayIfNotEmpty(String str, char[] cArr, int i11) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                int length2 = str.length();
                Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                str.getChars(0, length2, cArr, i11);
            } else {
                cArr[i11] = str.charAt(0);
            }
        }
        return i11 + str.length();
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, int i11, int i12, HexFormat hexFormat, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = bArr.length;
        }
        if ((i13 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(bArr, i11, i12, hexFormat);
    }

    private static final String toHexStringNoLineAndGroupSeparator(byte[] bArr, int i11, int i12, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        if (bytesHexFormat.getShortByteSeparatorNoPrefixAndSuffix()) {
            return toHexStringShortByteSeparatorNoPrefixAndSuffix(bArr, i11, i12, bytesHexFormat, iArr);
        }
        return toHexStringNoLineAndGroupSeparatorSlowPath(bArr, i11, i12, bytesHexFormat, iArr);
    }

    private static final String toHexStringNoLineAndGroupSeparatorSlowPath(byte[] bArr, int i11, int i12, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        char[] cArr = new char[formattedStringLength(i12 - i11, byteSeparator.length(), bytePrefix.length(), byteSuffix.length())];
        int byteAt = formatByteAt(bArr, i11, bytePrefix, byteSuffix, iArr, cArr, 0);
        for (int i13 = i11 + 1; i13 < i12; i13++) {
            byteAt = formatByteAt(bArr, i13, bytePrefix, byteSuffix, iArr, cArr, toCharArrayIfNotEmpty(byteSeparator, cArr, byteAt));
        }
        return StringsKt__StringsJVMKt.concatToString(cArr);
    }

    private static final String toHexStringShortByteSeparatorNoPrefixAndSuffix(byte[] bArr, int i11, int i12, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        int length = bytesHexFormat.getByteSeparator().length();
        if (length <= 1) {
            int i13 = i12 - i11;
            int byteAt = 0;
            if (length == 0) {
                char[] cArr = new char[checkFormatLength(((long) i13) * 2)];
                while (i11 < i12) {
                    byteAt = formatByteAt(bArr, i11, iArr, cArr, byteAt);
                    i11++;
                }
                return StringsKt__StringsJVMKt.concatToString(cArr);
            }
            char[] cArr2 = new char[checkFormatLength((((long) i13) * 3) - 1)];
            char cCharAt = bytesHexFormat.getByteSeparator().charAt(0);
            int byteAt2 = formatByteAt(bArr, i11, iArr, cArr2, 0);
            for (int i14 = i11 + 1; i14 < i12; i14++) {
                cArr2[byteAt2] = cCharAt;
                byteAt2 = formatByteAt(bArr, i14, iArr, cArr2, byteAt2 + 1);
            }
            return StringsKt__StringsJVMKt.concatToString(cArr2);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private static final int formatByteAt(byte[] bArr, int i11, int[] iArr, char[] cArr, int i12) {
        int i13 = iArr[bArr[i11] & 255];
        cArr[i12] = (char) (i13 >> 8);
        cArr[i12 + 1] = (char) (i13 & 255);
        return i12 + 2;
    }

    public static /* synthetic */ String toHexString$default(byte b11, HexFormat hexFormat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(b11, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(short s11, HexFormat hexFormat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(s11, hexFormat);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final String toHexString(byte b11, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = format.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((b11 >> 4) & 15), str.charAt(b11 & 15)};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost((Integer.numberOfLeadingZeros(b11 & 255) - 24) >> 2, 1), 0, 2, null);
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        return toHexStringImpl(b11, number, str, 8);
    }

    public static /* synthetic */ String toHexString$default(int i11, HexFormat hexFormat, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(i11, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(long j11, HexFormat hexFormat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(j11, hexFormat);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final String toHexString(short s11, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = format.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((s11 >> 12) & 15), str.charAt((s11 >> 8) & 15), str.charAt((s11 >> 4) & 15), str.charAt(s11 & 15)};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost((Integer.numberOfLeadingZeros(s11 & UShort.MAX_VALUE) - 16) >> 2, 3), 0, 2, null);
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        return toHexStringImpl(s11, number, str, 16);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final String toHexString(int i11, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = format.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((i11 >> 28) & 15), str.charAt((i11 >> 24) & 15), str.charAt((i11 >> 20) & 15), str.charAt((i11 >> 16) & 15), str.charAt((i11 >> 12) & 15), str.charAt((i11 >> 8) & 15), str.charAt((i11 >> 4) & 15), str.charAt(i11 & 15)};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost(Integer.numberOfLeadingZeros(i11) >> 2, 7), 0, 2, null);
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        return toHexStringImpl(i11, number, str, 32);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final String toHexString(long j11, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = format.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((int) ((j11 >> 60) & 15)), str.charAt((int) ((j11 >> 56) & 15)), str.charAt((int) ((j11 >> 52) & 15)), str.charAt((int) ((j11 >> 48) & 15)), str.charAt((int) ((j11 >> 44) & 15)), str.charAt((int) ((j11 >> 40) & 15)), str.charAt((int) ((j11 >> 36) & 15)), str.charAt((int) ((j11 >> 32) & 15)), str.charAt((int) ((j11 >> 28) & 15)), str.charAt((int) ((j11 >> 24) & 15)), str.charAt((int) ((j11 >> 20) & 15)), str.charAt((int) ((j11 >> 16) & 15)), str.charAt((int) ((j11 >> 12) & 15)), str.charAt((int) ((j11 >> 8) & 15)), str.charAt((int) ((j11 >> 4) & 15)), str.charAt((int) (j11 & 15))};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost(Long.numberOfLeadingZeros(j11) >> 2, 15), 0, 2, null);
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        return toHexStringImpl(j11, number, str, 64);
    }
}
