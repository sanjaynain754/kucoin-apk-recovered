package com.ishumei.smantifraud.dfp;

import android.content.Context;
import android.util.Log;
import com.ishumei.smantifraud.SmAntiFraud;
import com.ishumei.smantifraud.l111l1111llIl.l1111l111111Il;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class SMSDK {
    private static final String TAG = "Smlog";

    /* JADX INFO: renamed from: ma */
    public static native synchronized boolean m14293ma();

    /* JADX INFO: renamed from: w1 */
    public static native synchronized String m14296w1(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j11);

    /* JADX INFO: renamed from: w3 */
    private static native synchronized String m14297w3(Context context, String str, String str2, String str3, String str4);

    /* JADX INFO: renamed from: x4 */
    private static native synchronized String m14299x4(String str, String str2);

    /* JADX INFO: renamed from: x6 */
    private static native synchronized String m14301x6(String str, String str2);

    public static String getCodePath(Context context) {
        return context == null ? "ctx_is_null" : context.getPackageCodePath();
    }

    static {
        try {
            System.loadLibrary("smsdk");
        } catch (Throwable th2) {
            synchronized (SmAntiFraud.class) {
                l1111l111111Il.l1111l111111Il = "libsmsdk.so load failed.;" + th2;
                Log.e(TAG, "libsmsdk.so load failed.", th2);
            }
        }
    }

    /* JADX INFO: renamed from: v1 */
    public static String m14294v1(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j11) {
        try {
            return m14296w1(context, str, str2, str3, str4, str5, str6, str7, j11);
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(th2);
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: v3 */
    public static String m14295v3(Context context, String str, String str2, String str3, String str4) {
        try {
            return m14297w3(context, str, str2, str3, str4);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: x3 */
    public static String m14298x3(String str, String str2) throws IOException {
        try {
            return m14299x4(str2, str);
        } catch (Throwable th2) {
            throw new IOException(th2);
        }
    }

    /* JADX INFO: renamed from: x5 */
    public static String m14300x5(String str, String str2) throws IOException {
        try {
            return m14301x6(str2, str);
        } catch (Throwable th2) {
            throw new IOException(th2);
        }
    }
}
