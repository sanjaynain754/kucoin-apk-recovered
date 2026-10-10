package com.tencent.bugly.common.utils;

import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.Charsets;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0007J\u0012\u0010\u0015\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/tencent/bugly/common/utils/StringUtil;", "", "()V", "TAG", "", "digits", "", "bytes2HexStr", "bytes", "", "encode", "value", "getMD5", "source", "isNullOrNil", "", "str", "nullAsNil", "parseHex", "", "valueStr", "replaceBlank", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class StringUtil {

    @NotNull
    public static final String TAG = "RMonitor_common_StringUtil";

    @NotNull
    public static final StringUtil INSTANCE = new StringUtil();

    @NotNull
    private static final char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @JvmStatic
    @NotNull
    public static final String bytes2HexStr(@Nullable byte[] bytes) {
        if (bytes == null || bytes.length == 0) {
            return "";
        }
        char[] cArr = new char[bytes.length * 2];
        int length = bytes.length;
        for (int i11 = 0; i11 < length; i11++) {
            byte b11 = bytes[i11];
            int i12 = i11 * 2;
            char[] cArr2 = digits;
            cArr[i12 + 1] = cArr2[b11 & 15];
            cArr[i12] = cArr2[((byte) (b11 >>> 4)) & 15];
        }
        return new String(cArr);
    }

    @JvmStatic
    @NotNull
    public static final String getMD5(@Nullable String source) {
        if (source == null) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bytes = source.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            messageDigest.update(bytes);
            return bytes2HexStr(messageDigest.digest());
        } catch (NoSuchAlgorithmException e11) {
            e11.printStackTrace();
            return "";
        }
    }

    @JvmStatic
    public static final boolean isNullOrNil(@Nullable String str) {
        return str == null || str.length() == 0;
    }

    @JvmStatic
    @NotNull
    public static final String nullAsNil(@Nullable String str) {
        return str == null ? "" : str;
    }

    @JvmStatic
    @NotNull
    public static final String replaceBlank(@Nullable String str) {
        if (str == null) {
            return "";
        }
        String strReplaceAll = Pattern.compile("[\t\r\n]").matcher(str).replaceAll("");
        Intrinsics.checkNotNullExpressionValue(strReplaceAll, "m.replaceAll(\"\")");
        return strReplaceAll;
    }

    private StringUtil() {
    }

    @JvmStatic
    @NotNull
    public static final String encode(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            String strEncode = URLEncoder.encode(value, "UTF-8");
            Intrinsics.checkNotNullExpressionValue(strEncode, "{\n            URLEncoder…value, \"UTF-8\")\n        }");
            return strEncode;
        } catch (Throwable unused) {
            return "";
        }
    }

    @JvmStatic
    public static final long parseHex(@NotNull String valueStr) {
        Intrinsics.checkNotNullParameter(valueStr, "valueStr");
        try {
            return Long.parseLong(valueStr, 16);
        } catch (Exception unused) {
            return 0L;
        }
    }
}
