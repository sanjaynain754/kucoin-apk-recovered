package com.tencent.liteav.base.util;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.p130b.C34691a;
import java.util.Locale;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav")
public class LiteavLog {
    private static final int LEVEL_DEBUG = 1;
    private static final int LEVEL_ERROR = 4;
    private static final int LEVEL_FATAL = 5;
    private static final int LEVEL_INFO = 2;
    private static final int LEVEL_NULL = 6;
    private static final int LEVEL_VERBOSE = 0;
    private static final int LEVEL_WARN = 3;
    private static InterfaceC34734a sCallback = null;
    private static final boolean useChromiumBaseLog = true;

    /* JADX INFO: renamed from: com.tencent.liteav.base.util.LiteavLog$a */
    public interface InterfaceC34734a {
        /* JADX INFO: renamed from: a */
        void mo76095a(int i11, String str, String str2);
    }

    /* JADX INFO: renamed from: com.tencent.liteav.base.util.LiteavLog$b */
    public enum EnumC34735b {
        kAll(0),
        kInfo(1),
        kWarning(2),
        kError(3),
        kFatal(4),
        kNone(5);

        public int mNativeValue;

        /* JADX INFO: renamed from: a */
        public static int m76096a(int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 1) {
                return 2;
            }
            if (i11 == 2) {
                return 3;
            }
            if (i11 != 3) {
                return i11 != 4 ? 6 : 5;
            }
            return 4;
        }

        EnumC34735b(int i11) {
            this.mNativeValue = i11;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m76078d(C34691a c34691a, String str, String str2, Object... objArr) {
        if (c34691a == null || !c34691a.m76041a()) {
            return;
        }
        m76080d(str, str2, objArr);
    }

    /* JADX INFO: renamed from: e */
    public static void m76082e(C34691a c34691a, String str, String str2, Object... objArr) {
        if (c34691a == null || !c34691a.m76041a()) {
            return;
        }
        m76085e(str, str2, objArr);
    }

    /* JADX INFO: renamed from: i */
    public static void m76086i(C34691a c34691a, String str, String str2, Object... objArr) {
        if (c34691a == null || !c34691a.m76041a()) {
            return;
        }
        m76088i(str, str2, objArr);
    }

    public static native int nativeGetLogLevel();

    public static native void nativeSetConsoleLogEnabled(boolean z11);

    public static native void nativeSetLogCallbackEnabled(boolean z11);

    public static native void nativeSetLogCompressEnabled(boolean z11);

    public static native void nativeSetLogFilePath(String str);

    public static native void nativeSetLogLevel(int i11);

    public static native void nativeSetLogToFileEnabled(boolean z11);

    /* JADX INFO: renamed from: v */
    public static void m76089v(C34691a c34691a, String str, String str2, Object... objArr) {
        if (c34691a == null || !c34691a.m76041a()) {
            return;
        }
        m76091v(str, str2, objArr);
    }

    /* JADX INFO: renamed from: w */
    public static void m76092w(C34691a c34691a, String str, String str2, Object... objArr) {
        if (c34691a == null || !c34691a.m76041a()) {
            return;
        }
        m76094w(str, str2, objArr);
    }

    public static void onLog(int i11, String str) {
        InterfaceC34734a interfaceC34734a = sCallback;
        if (interfaceC34734a != null) {
            interfaceC34734a.mo76095a(EnumC34735b.m76096a(i11), "TXLiteAVSDK", str);
        }
    }

    public static void setCallback(InterfaceC34734a interfaceC34734a) {
        sCallback = interfaceC34734a;
    }

    static {
        SoLoader.loadAllLibraries();
    }

    /* JADX INFO: renamed from: d */
    public static void m76080d(String str, String str2, Object... objArr) {
        m76079d(str, String.format(Locale.ENGLISH, str2, objArr));
    }

    /* JADX INFO: renamed from: e */
    public static void m76085e(String str, String str2, Object... objArr) {
        m76083e(str, String.format(Locale.ENGLISH, str2, objArr));
    }

    public static int getLogLevel() {
        return nativeGetLogLevel();
    }

    /* JADX INFO: renamed from: i */
    public static void m76088i(String str, String str2, Object... objArr) {
        m76087i(str, String.format(Locale.ENGLISH, str2, objArr));
    }

    /* JADX INFO: renamed from: v */
    public static void m76091v(String str, String str2, Object... objArr) {
        m76090v(str, String.format(Locale.ENGLISH, str2, objArr));
    }

    /* JADX INFO: renamed from: w */
    public static void m76094w(String str, String str2, Object... objArr) {
        m76093w(str, String.format(Locale.ENGLISH, str2, objArr));
    }

    /* JADX INFO: renamed from: d */
    public static void m76079d(String str, String str2) {
        Log.m76032d(str, str2, new Object[0]);
    }

    /* JADX INFO: renamed from: e */
    public static void m76083e(String str, String str2) {
        Log.m76033e(str, str2, new Object[0]);
    }

    /* JADX INFO: renamed from: i */
    public static void m76087i(String str, String str2) {
        Log.m76034i(str, str2, new Object[0]);
    }

    /* JADX INFO: renamed from: v */
    public static void m76090v(String str, String str2) {
        Log.m76035v(str, str2, new Object[0]);
    }

    /* JADX INFO: renamed from: w */
    public static void m76093w(String str, String str2) {
        Log.m76036w(str, str2, new Object[0]);
    }

    /* JADX INFO: renamed from: e */
    public static void m76081e(C34691a c34691a, String str, String str2, Throwable th2) {
        if (c34691a == null || !c34691a.m76041a()) {
            return;
        }
        m76084e(str, str2, th2);
    }

    /* JADX INFO: renamed from: e */
    public static void m76084e(String str, String str2, Throwable th2) {
        m76083e(str, str2 + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + android.util.Log.getStackTraceString(th2));
    }
}
