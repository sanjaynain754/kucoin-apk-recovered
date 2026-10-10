package com.tencent.feedback.eup.jni;

import com.tencent.bugly.proguard.C33978va;
import com.tencent.bugly.proguard.C34012x4;
import com.tencent.rmonitor.common.logger.LogState;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class NativeExceptionUpload {
    public static final int ANDROID_LOG_DEBUG = 3;
    public static final int ANDROID_LOG_ERROR = 6;
    public static final int ANDROID_LOG_INFO = 4;
    public static final int ANDROID_LOG_WARN = 5;
    private static final String EXTRA_JNI_NATIVE_VERSION = "nativeRqd.2.1.0";
    public static final int JAR_JNI_VERSION = 1;
    public static AtomicBoolean isEnable = new AtomicBoolean(true);
    protected static NativeExceptionHandler instance = null;

    public static native boolean appendNativeLog(String str, String str2, String str3);

    public static native boolean appendWholeNativeLog(String str);

    public static native void doNativeCrashForTest();

    public static native void enableHandler(boolean z11);

    public static native String getCrashThreadLocalValue();

    public static native String getNativeLog();

    public static native boolean putNativeKeyValue(String str, String str2);

    public static native boolean registNativeExceptionHandler(String str, String str2, int i11);

    public static native String registNativeExceptionHandler2(String str, String str2, int i11, int i12);

    public static native String removeNativeKeyValue(String str);

    public static native void setLogMode(int i11);

    public static void testNativeCrash() {
        C34012x4.m75442d("rqdp{ test native crash}", new Object[0]);
        doNativeCrashForTest();
    }

    public static synchronized NativeExceptionHandler getmHandler() {
        return instance;
    }

    public static synchronized void setmHandler(NativeExceptionHandler nativeExceptionHandler) {
        instance = nativeExceptionHandler;
    }

    public static boolean checkExtraJni(String str) {
        C34012x4.m75434a("Check extra jni for RQD NDK: %s", str);
        String strReplace = EXTRA_JNI_NATIVE_VERSION.replace("nativeRqd.", "").replace(C33978va.f72339h, "");
        String strReplace2 = str.replace("nativeRqd.", "").replace(C33978va.f72339h, "");
        if (strReplace2.length() == 2) {
            strReplace2 = strReplace2.concat("0");
        } else if (strReplace2.length() == 1) {
            strReplace2 = strReplace2.concat("00");
        }
        try {
            if (Integer.parseInt(strReplace2) >= Integer.parseInt(strReplace)) {
                C34012x4.m75431a(LogState.INFO, "Extra RQD JNI can be accessed.", new Object[0]);
                return true;
            }
        } catch (Throwable th2) {
            if (!C34012x4.m75432a(LogState.WARN, th2)) {
                th2.printStackTrace();
            }
        }
        C34012x4.m75431a(LogState.WARN, "Extra RQD JNI can not be accessed.", new Object[0]);
        return false;
    }
}
