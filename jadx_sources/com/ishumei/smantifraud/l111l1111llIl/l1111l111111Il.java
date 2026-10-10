package com.ishumei.smantifraud.l111l1111llIl;

import android.util.Log;
import java.util.Locale;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes.dex */
public final class l1111l111111Il {
    public static String l1111l111111Il = "smsdk not init!";
    private static int l111l11111I1l = 5;
    private static boolean l111l11111lIl;

    private static String l1111l111111Il(String str, Object... objArr) {
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj instanceof String[]) {
                objArr[i11] = l1111l111111Il((String[]) obj);
            }
        }
        return "[" + Thread.currentThread().getId() + "] " + String.format(Locale.US, str, objArr);
    }

    private static String l1111l111111Il(String[] strArr) {
        if (strArr.length == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder("[");
        int length = strArr.length - 1;
        for (int i11 = 0; i11 < length; i11++) {
            sb2.append(strArr[i11]);
            sb2.append(", ");
        }
        sb2.append(strArr[length]);
        sb2.append("]");
        return sb2.toString();
    }

    private static void l111l11111I1l(String str, String str2, Object... objArr) {
        if (!l111l11111lIl || l111l11111I1l > 2) {
            return;
        }
        Log.v(str, l1111l111111Il(str2, objArr));
    }

    private static void l111l11111Il(String str, String str2, Object... objArr) {
        if (!l111l11111lIl || l111l11111I1l > 4) {
            return;
        }
        Log.i(str, l1111l111111Il(str2, objArr));
    }

    public static void l111l11111lIl(String str, String str2, Object... objArr) {
        if (!l111l11111lIl || l111l11111I1l > 6) {
            return;
        }
        Log.e(str, l1111l111111Il(str2, objArr));
    }

    private static void l111l1111l1Il(String str, String str2, Object... objArr) {
        if (!l111l11111lIl || l111l11111I1l > 5) {
            return;
        }
        Log.w(str, l1111l111111Il(str2, objArr));
    }

    private static void l111l1111llIl(String str, String str2, Object... objArr) {
        if (l111l11111I1l <= 6) {
            Log.e(str, l1111l111111Il(str2, objArr));
        }
    }

    private static void l1111l111111Il(int i11) {
        l111l11111I1l = i11;
    }

    public static void l1111l111111Il(String str, String str2, Object... objArr) {
        if (!l111l11111lIl || l111l11111I1l > 3) {
            return;
        }
        Log.d(str, l1111l111111Il(str2, objArr));
    }

    public static void l1111l111111Il(Throwable th2) {
        if (l111l11111lIl) {
            th2.printStackTrace();
        }
    }

    private static void l1111l111111Il(boolean z11) {
        l111l11111lIl = z11;
    }
}
