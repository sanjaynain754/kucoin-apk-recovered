package com.kubi.utils.extensions;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import androidx.credentials.provider.CredentialEntry;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.utils.C27085s;
import com.kubi.utils.InterfaceC27083r;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.bugly.proguard.RunnableC33958ua;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.utils.extensions.f */
/* JADX INFO: compiled from: StringEx.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0000*\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\n\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\n\u0010\u0002\u001a)\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0000*\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0011\u001a#\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0011\u0010\u001c\u001a\u00020\u001b*\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001d\u0010\u001f\u001a\u00020\u001b*\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 \u001a\u0015\u0010\"\u001a\u0004\u0018\u00010!*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\"\u0010#\u001a*\u0010*\u001a\u00020)*\u00020\u00002\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$¢\u0006\u0002\b'¢\u0006\u0004\b*\u0010+¨\u0006,"}, m90084d2 = {"", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/String;)Ljava/lang/String;", "default", "i", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Landroid/text/SpannableStringBuilder;", "", "g", "(Landroid/text/SpannableStringBuilder;Ljava/lang/String;)Ljava/lang/CharSequence;", "q", "", "color", "size", "b", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;", "j", "(Ljava/lang/String;I)Ljava/lang/String;", "f", "(Ljava/lang/String;ILjava/lang/Integer;)Ljava/lang/String;", "p", "(I)Ljava/lang/String;", "e", "byteSize", "encode", "n", "(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;", "", "d", "(Ljava/lang/String;)Z", "defaultValue", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/String;Z)Z", "Ljava/math/BigDecimal;", "k", "(Ljava/lang/String;)Ljava/math/BigDecimal;", "Lkotlin/Function1;", "Lcom/kubi/utils/r;", "", "Lkotlin/ExtensionFunctionType;", "init", "Landroid/text/Spannable;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Landroid/text/Spannable;", "Utils_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStringEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringEx.kt\ncom/kubi/utils/extensions/StringExKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,186:1\n1183#2,3:187\n*S KotlinDebug\n*F\n+ 1 StringEx.kt\ncom/kubi/utils/extensions/StringExKt\n*L\n122#1:187,3\n*E\n"})
public final class C27041f {
    @Nullable
    /* JADX INFO: renamed from: k */
    public static final BigDecimal m66671k(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            return new BigDecimal(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Spannable m66661a(@NotNull String str, @NotNull Function1<? super InterfaceC27083r, Unit> init) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        C27085s c27085s = new C27085s(str);
        init.invoke(c27085s);
        return c27085s.getBuilder();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m66662b(@NotNull String str, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (num == null && num2 == null) {
            return str;
        }
        if (num2 != null) {
            return m66666f(StringsKt.replace$default(str, "<", "&#60;", false, 4, (Object) null), num2.intValue(), num);
        }
        String strReplace$default = StringsKt.replace$default(str, "<", "&#60;", false, 4, (Object) null);
        Intrinsics.checkNotNull(num);
        return m66670j(strReplace$default, num.intValue());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m66663c(String str, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        if ((i11 & 2) != 0) {
            num2 = null;
        }
        return m66662b(str, num, num2);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m66664d(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.length() <= 300 && new Regex("^[\\s\\S]*[{【$][a-zA-Z0-9]{7}[}】$][\\s\\S]*$").matches(str);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m66665e(@NotNull String str, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!StringsKt.contains$default((CharSequence) str, (CharSequence) C33978va.f72339h, false, 2, (Object) null)) {
            return str;
        }
        List listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{C33978va.f72339h}, false, 0, 6, (Object) null);
        String str2 = (String) listSplit$default.get(0);
        String str3 = (String) listSplit$default.get(1);
        if (str2.length() >= i11) {
            return str2;
        }
        if (str2.length() + str3.length() <= i11) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append('.');
        String strSubstring = str3.substring(0, i11 - str2.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb2.append(strSubstring);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: f */
    public static final String m66666f(String str, int i11, Integer num) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<myfont size='" + i11 + '\'');
        if (num != null) {
            stringBuffer.append(" color='");
            stringBuffer.append(m66676p(num.intValue()));
            stringBuffer.append("'");
        }
        stringBuffer.append(">");
        stringBuffer.append(str);
        stringBuffer.append("</myfont>");
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer()\n        .…nt>\")\n        .toString()");
        return string;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final CharSequence m66667g(@Nullable SpannableStringBuilder spannableStringBuilder, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "default");
        if (spannableStringBuilder != null) {
            return spannableStringBuilder;
        }
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) str);
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilderAppend, "SpannableStringBuilder().append(default)");
        return spannableStringBuilderAppend;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m66668h(@Nullable String str) {
        return str == null ? "" : str;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m66669i(@Nullable String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "default");
        return str == null ? str2 : str;
    }

    /* JADX INFO: renamed from: j */
    public static final String m66670j(String str, int i11) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<font color='");
        stringBuffer.append(m66676p(i11));
        stringBuffer.append("'>");
        stringBuffer.append(str);
        stringBuffer.append("</font>");
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer()\n        .…nt>\")\n        .toString()");
        return string;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m66672l(@Nullable String str, boolean z11) {
        String lowerCase;
        if (str != null) {
            try {
                lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            } catch (Exception unused) {
            }
        } else {
            lowerCase = null;
        }
        if (Intrinsics.areEqual(lowerCase, CredentialEntry.FALSE_STRING)) {
            return Boolean.parseBoolean(str);
        }
        if (Intrinsics.areEqual(lowerCase, CredentialEntry.TRUE_STRING)) {
            return Boolean.parseBoolean(str);
        }
        return z11;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ boolean m66673m(String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return m66672l(str, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static final String m66674n(@NotNull String str, int i11, @NotNull String encode) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(encode, "encode");
        StringBuilder sb2 = new StringBuilder();
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        int length = 0;
        for (char c11 : charArray) {
            String strValueOf = String.valueOf(c11);
            Charset charsetForName = Charset.forName(encode);
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
            byte[] bytes = strValueOf.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            length += bytes.length;
            if (length > i11) {
                break;
            }
            sb2.append(c11);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ String m66675o(String str, int i11, String str2, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str2 = "GBK";
        }
        return m66674n(str, i11, str2);
    }

    /* JADX INFO: renamed from: p */
    public static final String m66676p(int i11) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(RunnableC33958ua.f72251f);
        String hexString = Integer.toHexString((i11 >> 16) & 255);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(red)");
        String upperCase = hexString.toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase()");
        stringBuffer.append(upperCase);
        String hexString2 = Integer.toHexString((i11 >> 8) & 255);
        Intrinsics.checkNotNullExpressionValue(hexString2, "toHexString(green)");
        String upperCase2 = hexString2.toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase()");
        stringBuffer.append(upperCase2);
        String hexString3 = Integer.toHexString(i11 & 255);
        Intrinsics.checkNotNullExpressionValue(hexString3, "toHexString(blue)");
        String upperCase3 = hexString3.toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase3, "this as java.lang.String).toUpperCase()");
        stringBuffer.append(upperCase3);
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer()\n        .…se())\n        .toString()");
        return string;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public static final String m66677q(@Nullable String str) {
        String upperCase;
        if (str != null) {
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            upperCase = str.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        } else {
            upperCase = null;
        }
        return Intrinsics.areEqual("XBT", upperCase) ? "BTC" : str;
    }
}
