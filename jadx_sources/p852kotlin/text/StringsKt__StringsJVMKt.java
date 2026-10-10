package p852kotlin.text;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.DeprecatedSinceKotlin;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.SinceKotlin;
import p852kotlin.collections.AbstractList;
import p852kotlin.collections.ArraysKt;
import p852kotlin.internal.InlineOnly;
import p852kotlin.internal.LowPriorityInOverloadResolution;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: StringsJVM.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0081\b\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0001H\u0081\b\u001a\u001d\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0081\b\u001a\u001d\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0001H\u0081\b\u001a \u0010\b\u001a\u00020\t*\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a$\u0010\f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a$\u0010\f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a$\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a$\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a\r\u0010\u0012\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\u0013\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\f\u0010\u0016\u001a\u00020\u0002*\u00020\u0017H\u0007\u001a \u0010\u0016\u001a\u00020\u0002*\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u0001H\u0007\u001a \u0010\u001a\u001a\u00020\u0017*\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u0001H\u0007\u001a\f\u0010\u001b\u001a\u00020\u0002*\u00020\u001cH\u0007\u001a*\u0010\u001b\u001a\u00020\u0002*\u00020\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\tH\u0007\u001a\f\u0010\u001e\u001a\u00020\u001c*\u00020\u0002H\u0007\u001a*\u0010\u001e\u001a\u00020\u001c*\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\tH\u0007\u001a\r\u0010\u001a\u001a\u00020\u0017*\u00020\u0002H\u0087\b\u001a3\u0010\u001a\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00172\b\b\u0002\u0010 \u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u0001H\u0087\b\u001a*\u0010!\u001a\u00020\u0002*\u00020\u00022\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010$0#\"\u0004\u0018\u00010$H\u0087\b¢\u0006\u0002\u0010%\u001a2\u0010!\u001a\u00020\u0002*\u00020&2\u0006\u0010!\u001a\u00020\u00022\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010$0#\"\u0004\u0018\u00010$H\u0087\b¢\u0006\u0002\u0010'\u001a4\u0010!\u001a\u00020\u0002*\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010)2\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010$0#\"\u0004\u0018\u00010$H\u0087\b¢\u0006\u0002\u0010*\u001a<\u0010!\u001a\u00020\u0002*\u00020&2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010!\u001a\u00020\u00022\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010$0#\"\u0004\u0018\u00010$H\u0087\b¢\u0006\u0002\u0010+\u001a\"\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020-*\u00020.2\u0006\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u00020\u0001\u001a\u0015\u00102\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\b\u001a\u001d\u00102\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\b\u001a\u001c\u00103\u001a\u00020\t*\u00020\u00022\u0006\u00104\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a$\u00103\u001a\u00020\t*\u00020\u00022\u0006\u00104\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a\u001c\u00105\u001a\u00020\t*\u00020\u00022\u0006\u00106\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a)\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u00012\u0006\u0010;\u001a\u00020<H\u0087\b\u001a\u0019\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020<H\u0087\b\u001a!\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u001cH\u0087\b\u001a\u0011\u00107\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u0017H\u0087\b\u001a!\u00107\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00172\u0006\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u0001H\u0087\b\u001a!\u00107\u001a\u00020\u00022\u0006\u0010>\u001a\u00020?2\u0006\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00107\u001a\u00020\u00022\u0006\u0010@\u001a\u00020AH\u0087\b\u001a\u0011\u00107\u001a\u00020\u00022\u0006\u0010B\u001a\u00020CH\u0087\b\u001a\u0015\u0010D\u001a\u00020\u0001*\u00020\u00022\u0006\u0010E\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010F\u001a\u00020\u0001*\u00020\u00022\u0006\u0010E\u001a\u00020\u0001H\u0087\b\u001a\u001d\u0010G\u001a\u00020\u0001*\u00020\u00022\u0006\u0010H\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\b\u001a\u001c\u0010I\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a\u0015\u0010J\u001a\u00020\t*\u00020\u00022\u0006\u0010K\u001a\u00020.H\u0087\b\u001a\u0015\u0010J\u001a\u00020\t*\u00020\u00022\u0006\u0010B\u001a\u00020AH\u0087\b\u001a\u0019\u0010J\u001a\u00020\t*\u0004\u0018\u00010.2\b\u0010\n\u001a\u0004\u0018\u00010.H\u0087\u0004\u001a \u0010J\u001a\u00020\t*\u0004\u0018\u00010.2\b\u0010\n\u001a\u0004\u0018\u00010.2\u0006\u0010\u000b\u001a\u00020\tH\u0007\u001a\r\u0010L\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u001d\u0010M\u001a\u00020\u0001*\u00020\u00022\u0006\u0010E\u001a\u00020\u00012\u0006\u0010N\u001a\u00020\u0001H\u0087\b\u001a4\u0010O\u001a\u00020\t*\u00020.2\u0006\u0010P\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020.2\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a4\u0010O\u001a\u00020\t*\u00020\u00022\u0006\u0010P\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a\u0015\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020)H\u0087\b\u001a\u0015\u0010\u0015\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020)H\u0087\b\u001a\u0015\u0010\u0012\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020)H\u0087\b\u001a\u0015\u0010\u0013\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020)H\u0087\b\u001a\u0017\u0010R\u001a\u00020\u001c*\u00020\u00022\b\b\u0002\u0010;\u001a\u00020<H\u0087\b\u001a\u0017\u0010S\u001a\u000200*\u00020\u00022\b\b\u0002\u0010T\u001a\u00020\u0001H\u0087\b\u001a\f\u0010U\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\u0014\u0010U\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020)H\u0007\u001a\f\u0010V\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\u0014\u0010V\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020)H\u0007\u001a\u0012\u0010W\u001a\u00020\u0002*\u00020.2\u0006\u0010X\u001a\u00020\u0001\"%\u0010Y\u001a\u0012\u0012\u0004\u0012\u00020\u00020Zj\b\u0012\u0004\u0012\u00020\u0002`[*\u00020&8F¢\u0006\u0006\u001a\u0004\b\\\u0010]¨\u0006^"}, m90084d2 = {"nativeIndexOf", "", "", "ch", "", "fromIndex", "str", "nativeLastIndexOf", "equals", "", "other", "ignoreCase", "replace", "oldChar", "newChar", "oldValue", "newValue", "replaceFirst", "toUpperCase", "uppercase", "toLowerCase", "lowercase", "concatToString", "", SpellCheckPlugin.START_INDEX_KEY, SpellCheckPlugin.END_INDEX_KEY, "toCharArray", "decodeToString", "", "throwOnInvalidSequence", "encodeToByteArray", FirebaseAnalytics.Param.DESTINATION, "destinationOffset", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "args", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lkotlin/String$Companion;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "locale", "Ljava/util/Locale;", "(Ljava/lang/String;Ljava/util/Locale;[Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "split", "", "", "regex", "Ljava/util/regex/Pattern;", TUIConstants.TUIContact.LIMIT, "substring", "startsWith", "prefix", "endsWith", "suffix", "String", "bytes", TypedValues.CycleType.S_WAVE_OFFSET, SessionDescription.ATTR_LENGTH, "charset", "Ljava/nio/charset/Charset;", "chars", "codePoints", "", "stringBuffer", "Ljava/lang/StringBuffer;", "stringBuilder", "Ljava/lang/StringBuilder;", "codePointAt", "index", "codePointBefore", "codePointCount", "beginIndex", "compareTo", "contentEquals", "charSequence", "intern", "offsetByCodePoints", "codePointOffset", "regionMatches", "thisOffset", "otherOffset", "toByteArray", "toPattern", "flags", "capitalize", "decapitalize", "repeat", "n", "CASE_INSENSITIVE_ORDER", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "getCASE_INSENSITIVE_ORDER", "(Lkotlin/jvm/internal/StringCompanionObject;)Ljava/util/Comparator;", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/text/StringsKt")
@SourceDebugExtension({"SMAP\nStringsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,814:1\n1179#2,2:815\n1#3:817\n*S KotlinDebug\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n*L\n73#1:815,2\n*E\n"})
public class StringsKt__StringsJVMKt extends StringsKt__StringNumberConversionsKt {
    @InlineOnly
    private static final String String(byte[] bytes, int i11, int i12, Charset charset) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(bytes, i11, i12, charset);
    }

    @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @NotNull
    public static final String capitalize(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        return capitalize(str, locale);
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static String concatToString(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    @InlineOnly
    private static final boolean contentEquals(String str, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        return str.contentEquals(charSequence);
    }

    @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @NotNull
    public static final String decapitalize(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        sb2.append(lowerCase);
        String strSubstring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        return sb2.toString();
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static String decodeToString(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, Charsets.UTF_8);
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static byte[] encodeToByteArray(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    @InlineOnly
    private static final String format(String str, Object... args) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        String str2 = String.format(str, Arrays.copyOf(args, args.length));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final String lowercase(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @InlineOnly
    private static final int nativeIndexOf(String str, char c11, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.indexOf(c11, i11);
    }

    @InlineOnly
    private static final int nativeLastIndexOf(String str, char c11, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.lastIndexOf(c11, i11);
    }

    public static final boolean regionMatches(@NotNull CharSequence charSequence, int i11, @NotNull CharSequence other, int i12, int i13, boolean z11) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return ((charSequence instanceof String) && (other instanceof String)) ? regionMatches((String) charSequence, i11, (String) other, i12, i13, z11) : StringsKt__StringsKt.regionMatchesImpl(charSequence, i11, other, i12, i13, z11);
    }

    public static /* synthetic */ boolean regionMatches$default(CharSequence charSequence, int i11, CharSequence charSequence2, int i12, int i13, boolean z11, int i14, Object obj) {
        if ((i14 & 16) != 0) {
            z11 = false;
        }
        return regionMatches(charSequence, i11, charSequence2, i12, i13, z11);
    }

    @NotNull
    public static final String replace(@NotNull String str, char c11, char c12, boolean z11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!z11) {
            String strReplace = str.replace(c11, c12);
            Intrinsics.checkNotNullExpressionValue(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (CharsKt__CharKt.equals(cCharAt, c11, z11)) {
                cCharAt = c12;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    public static /* synthetic */ String replace$default(String str, char c11, char c12, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return replace(str, c11, c12, z11);
    }

    @NotNull
    public static final String replaceFirst(@NotNull String str, char c11, char c12, boolean z11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default(str, c11, 0, z11, 2, (Object) null);
        return iIndexOf$default < 0 ? str : StringsKt__StringsKt.replaceRange((CharSequence) str, iIndexOf$default, iIndexOf$default + 1, (CharSequence) String.valueOf(c12)).toString();
    }

    public static /* synthetic */ String replaceFirst$default(String str, char c11, char c12, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return replaceFirst(str, c11, c12, z11);
    }

    public static boolean startsWith(@NotNull String str, @NotNull String prefix, boolean z11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z11 ? str.startsWith(prefix) : regionMatches(str, 0, prefix, 0, prefix.length(), z11);
    }

    public static /* synthetic */ boolean startsWith$default(String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return startsWith(str, str2, z11);
    }

    @InlineOnly
    private static final String substring(String str, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strSubstring = str.substring(i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final char[] toCharArray(@NotNull String str, int i11, int i12) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i11, i12, str.length());
        char[] cArr = new char[i12 - i11];
        str.getChars(i11, i12, cArr, 0);
        return cArr;
    }

    public static /* synthetic */ char[] toCharArray$default(String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        return toCharArray(str, i11, i12);
    }

    @Deprecated(message = "Use lowercase() instead.", replaceWith = @ReplaceWith(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.5")
    @InlineOnly
    private static final String toLowerCase(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String lowerCase = str.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Deprecated(message = "Use uppercase() instead.", replaceWith = @ReplaceWith(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.5")
    @InlineOnly
    private static final String toUpperCase(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String upperCase = str.toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final String uppercase(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @InlineOnly
    private static final String String(byte[] bytes, Charset charset) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(bytes, charset);
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @LowPriorityInOverloadResolution
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final String capitalize(@NotNull String str, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (str.length() <= 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (!Character.isLowerCase(cCharAt)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char titleCase = Character.toTitleCase(cCharAt);
        if (titleCase != Character.toUpperCase(cCharAt)) {
            sb2.append(titleCase);
        } else {
            String strSubstring = str.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strSubstring.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sb2.append(upperCase);
        }
        String strSubstring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        return sb2.toString();
    }

    @InlineOnly
    private static final int codePointAt(String str, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.codePointAt(i11);
    }

    @InlineOnly
    private static final int codePointBefore(String str, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.codePointBefore(i11);
    }

    @InlineOnly
    private static final int codePointCount(String str, int i11, int i12) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.codePointCount(i11, i12);
    }

    public static final int compareTo(@NotNull String str, @NotNull String other, boolean z11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return z11 ? str.compareToIgnoreCase(other) : str.compareTo(other);
    }

    public static /* synthetic */ int compareTo$default(String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return compareTo(str, str2, z11);
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static String concatToString(@NotNull char[] cArr, int i11, int i12) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i11, i12, cArr.length);
        return new String(cArr, i11, i12 - i11);
    }

    public static /* synthetic */ String concatToString$default(char[] cArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = cArr.length;
        }
        return concatToString(cArr, i11, i12);
    }

    @InlineOnly
    private static final boolean contentEquals(String str, StringBuffer stringBuilder) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(stringBuilder, "stringBuilder");
        return str.contentEquals(stringBuilder);
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @LowPriorityInOverloadResolution
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final String decapitalize(@NotNull String str, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        sb2.append(lowerCase);
        String strSubstring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        return sb2.toString();
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final String decodeToString(@NotNull byte[] bArr, int i11, int i12, boolean z11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i11, i12, bArr.length);
        if (!z11) {
            return new String(bArr, i11, i12 - i11, Charsets.UTF_8);
        }
        CharsetDecoder charsetDecoderNewDecoder = Charsets.UTF_8.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        String string = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, i11, i12 - i11)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String decodeToString$default(byte[] bArr, int i11, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = bArr.length;
        }
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        return decodeToString(bArr, i11, i12, z11);
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final byte[] encodeToByteArray(@NotNull String str, int i11, int i12, boolean z11) throws CharacterCodingException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i11, i12, str.length());
        if (!z11) {
            String strSubstring = str.substring(i11, i12);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Charset charset = Charsets.UTF_8;
            Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return bytes;
        }
        CharsetEncoder charsetEncoderNewEncoder = Charsets.UTF_8.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, i11, i12));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            int iRemaining = byteBufferEncode.remaining();
            byte[] bArrArray = byteBufferEncode.array();
            Intrinsics.checkNotNull(bArrArray);
            if (iRemaining == bArrArray.length) {
                byte[] bArrArray2 = byteBufferEncode.array();
                Intrinsics.checkNotNull(bArrArray2);
                return bArrArray2;
            }
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(String str, int i11, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        return encodeToByteArray(str, i11, i12, z11);
    }

    public static boolean endsWith(@NotNull String str, @NotNull String suffix, boolean z11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return !z11 ? str.endsWith(suffix) : regionMatches(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean endsWith$default(String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return endsWith(str, str2, z11);
    }

    public static boolean equals(@Nullable String str, @Nullable String str2, boolean z11) {
        if (str == null) {
            return str2 == null;
        }
        return !z11 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean equals$default(String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return equals(str, str2, z11);
    }

    @InlineOnly
    private static final String format(StringCompanionObject stringCompanionObject, String format, Object... args) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        String str = String.format(format, Arrays.copyOf(args, args.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public static Comparator<String> getCASE_INSENSITIVE_ORDER(@NotNull StringCompanionObject stringCompanionObject) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        Comparator<String> CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    @InlineOnly
    private static final String intern(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strIntern = str.intern();
        Intrinsics.checkNotNullExpressionValue(strIntern, "intern(...)");
        return strIntern;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final String lowercase(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @InlineOnly
    private static final int nativeIndexOf(String str, String str2, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str2, "str");
        return str.indexOf(str2, i11);
    }

    @InlineOnly
    private static final int nativeLastIndexOf(String str, String str2, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str2, "str");
        return str.lastIndexOf(str2, i11);
    }

    @InlineOnly
    private static final int offsetByCodePoints(String str, int i11, int i12) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.offsetByCodePoints(i11, i12);
    }

    public static /* synthetic */ boolean regionMatches$default(String str, int i11, String str2, int i12, int i13, boolean z11, int i14, Object obj) {
        if ((i14 & 16) != 0) {
            z11 = false;
        }
        return regionMatches(str, i11, str2, i12, i13, z11);
    }

    @NotNull
    public static String repeat(@NotNull CharSequence charSequence, int i11) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i11 + '.').toString());
        }
        if (i11 == 0) {
            return "";
        }
        int i12 = 1;
        if (i11 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                cArr[i13] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() * i11);
        if (1 <= i11) {
            while (true) {
                sb2.append(charSequence);
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNull(string);
        return string;
    }

    public static /* synthetic */ String replace$default(String str, String str2, String str3, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return replace(str, str2, str3, z11);
    }

    public static /* synthetic */ String replaceFirst$default(String str, String str2, String str3, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return replaceFirst(str, str2, str3, z11);
    }

    @NotNull
    public static final List<String> split(@NotNull CharSequence charSequence, @NotNull Pattern regex, int i11) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        StringsKt__StringsKt.requireNonNegativeLimit(i11);
        if (i11 == 0) {
            i11 = -1;
        }
        String[] strArrSplit = regex.split(charSequence, i11);
        Intrinsics.checkNotNullExpressionValue(strArrSplit, "split(...)");
        return ArraysKt.asList(strArrSplit);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, Pattern pattern, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return split(charSequence, pattern, i11);
    }

    public static /* synthetic */ boolean startsWith$default(String str, String str2, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return startsWith(str, str2, i11, z11);
    }

    @InlineOnly
    private static final String substring(String str, int i11, int i12) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strSubstring = str.substring(i11, i12);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @InlineOnly
    private static final byte[] toByteArray(String str, Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    public static /* synthetic */ byte[] toByteArray$default(String str, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    @Deprecated(message = "Use lowercase() instead.", replaceWith = @ReplaceWith(expression = "lowercase(locale)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.5")
    @InlineOnly
    private static final String toLowerCase(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @InlineOnly
    private static final Pattern toPattern(String str, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Pattern patternCompile = Pattern.compile(str, i11);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        return patternCompile;
    }

    public static /* synthetic */ Pattern toPattern$default(String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Pattern patternCompile = Pattern.compile(str, i11);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        return patternCompile;
    }

    @Deprecated(message = "Use uppercase() instead.", replaceWith = @ReplaceWith(expression = "uppercase(locale)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.5")
    @InlineOnly
    private static final String toUpperCase(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final String uppercase(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @InlineOnly
    private static final String String(byte[] bytes, int i11, int i12) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return new String(bytes, i11, i12, Charsets.UTF_8);
    }

    @SinceKotlin(version = "1.5")
    public static final boolean contentEquals(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        if ((charSequence instanceof String) && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        return StringsKt__StringsKt.contentEqualsImpl(charSequence, charSequence2);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final String format(String str, Locale locale, Object... args) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        String str2 = String.format(locale, str, Arrays.copyOf(args, args.length));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    @NotNull
    public static final String replaceFirst(@NotNull String str, @NotNull String oldValue, @NotNull String newValue, boolean z11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default(str, oldValue, 0, z11, 2, (Object) null);
        return iIndexOf$default < 0 ? str : StringsKt__StringsKt.replaceRange((CharSequence) str, iIndexOf$default, oldValue.length() + iIndexOf$default, (CharSequence) newValue).toString();
    }

    public static boolean startsWith(@NotNull String str, @NotNull String prefix, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!z11) {
            return str.startsWith(prefix, i11);
        }
        return regionMatches(str, i11, prefix, 0, prefix.length(), z11);
    }

    @InlineOnly
    private static final char[] toCharArray(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        return charArray;
    }

    public static /* synthetic */ char[] toCharArray$default(String str, char[] destination, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = str.length();
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        str.getChars(i12, i13, destination, i11);
        return destination;
    }

    @InlineOnly
    private static final String String(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return new String(bytes, Charsets.UTF_8);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final String format(StringCompanionObject stringCompanionObject, Locale locale, String format, Object... args) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        String str = String.format(locale, format, Arrays.copyOf(args, args.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static boolean regionMatches(@NotNull String str, int i11, @NotNull String other, int i12, int i13, boolean z11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (!z11) {
            return str.regionMatches(i11, other, i12, i13);
        }
        return str.regionMatches(z11, i11, other, i12, i13);
    }

    @InlineOnly
    private static final char[] toCharArray(String str, char[] destination, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        str.getChars(i12, i13, destination, i11);
        return destination;
    }

    @InlineOnly
    private static final String String(char[] chars) {
        Intrinsics.checkNotNullParameter(chars, "chars");
        return new String(chars);
    }

    @InlineOnly
    private static final String String(char[] chars, int i11, int i12) {
        Intrinsics.checkNotNullParameter(chars, "chars");
        return new String(chars, i11, i12);
    }

    @SinceKotlin(version = "1.5")
    public static boolean contentEquals(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, boolean z11) {
        if (z11) {
            return StringsKt__StringsKt.contentEqualsIgnoreCaseImpl(charSequence, charSequence2);
        }
        return contentEquals(charSequence, charSequence2);
    }

    @NotNull
    public static String replace(@NotNull String str, @NotNull String oldValue, @NotNull String newValue, boolean z11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int i11 = 0;
        int iIndexOf = StringsKt__StringsKt.indexOf(str, oldValue, 0, z11);
        if (iIndexOf < 0) {
            return str;
        }
        int length = oldValue.length();
        int iCoerceAtLeast = RangesKt.coerceAtLeast(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            do {
                sb2.append((CharSequence) str, i11, iIndexOf);
                sb2.append(newValue);
                i11 = iIndexOf + length;
                if (iIndexOf >= str.length()) {
                    break;
                }
                iIndexOf = StringsKt__StringsKt.indexOf(str, oldValue, iIndexOf + iCoerceAtLeast, z11);
            } while (iIndexOf > 0);
            sb2.append((CharSequence) str, i11, str.length());
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        throw new OutOfMemoryError();
    }

    @InlineOnly
    private static final String String(int[] codePoints, int i11, int i12) {
        Intrinsics.checkNotNullParameter(codePoints, "codePoints");
        return new String(codePoints, i11, i12);
    }

    @InlineOnly
    private static final String String(StringBuffer stringBuffer) {
        Intrinsics.checkNotNullParameter(stringBuffer, "stringBuffer");
        return new String(stringBuffer);
    }

    @InlineOnly
    private static final String String(StringBuilder stringBuilder) {
        Intrinsics.checkNotNullParameter(stringBuilder, "stringBuilder");
        return new String(stringBuilder);
    }
}
