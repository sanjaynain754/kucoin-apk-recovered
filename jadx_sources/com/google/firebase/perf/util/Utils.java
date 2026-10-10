package com.google.firebase.perf.util;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import com.google.firebase.perf.logging.AndroidLogger;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes.dex */
public class Utils {
    private static Boolean isDebugLoggingEnabled;

    public static int bufferToInt(@NonNull byte[] bArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 4 && i12 < bArr.length; i12++) {
            i11 |= (bArr[i12] & 255) << (i12 * 8);
        }
        return i11;
    }

    public static void checkArgument(boolean z11, String str) {
        if (!z11) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean isDebugLoggingEnabled(@NonNull Context context) {
        Boolean bool = isDebugLoggingEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean boolValueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            isDebugLoggingEnabled = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e11) {
            AndroidLogger.getInstance().debug("No perf logcat meta data found " + e11.getMessage());
            return false;
        }
    }

    public static int saturatedIntCast(long j11) {
        if (j11 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j11 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j11;
    }

    public static String stripSensitiveInfo(@NonNull String str) {
        HttpUrl httpUrl = HttpUrl.parse(str);
        if (httpUrl != null) {
            return httpUrl.newBuilder().username("").password("").query(null).fragment(null).toString();
        }
        return str;
    }

    public static String truncateURL(String str, int i11) {
        int iLastIndexOf;
        if (str.length() <= i11) {
            return str;
        }
        if (str.charAt(i11) == '/') {
            return str.substring(0, i11);
        }
        HttpUrl httpUrl = HttpUrl.parse(str);
        if (httpUrl == null) {
            return str.substring(0, i11);
        }
        if (httpUrl.encodedPath().lastIndexOf(47) >= 0 && (iLastIndexOf = str.lastIndexOf(47, i11 - 1)) >= 0) {
            return str.substring(0, iLastIndexOf);
        }
        return str.substring(0, i11);
    }
}
