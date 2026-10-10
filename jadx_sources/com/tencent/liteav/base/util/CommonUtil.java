package com.tencent.liteav.base.util;

import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav")
public class CommonUtil {
    private static long mNativeNtpTimeManagerListener;
    private static InterfaceC34729a sCallback;

    /* JADX INFO: renamed from: com.tencent.liteav.base.util.CommonUtil$a */
    public interface InterfaceC34729a {
        /* JADX INFO: renamed from: a */
        void mo76075a(int i11, String str);
    }

    private static native long nativeCreate();

    private static native long nativeGetNetworkTimestamp(long j11);

    public static native String nativeGetSDKVersion();

    private static native int nativeSetGlobalEnv(String str);

    private static native boolean nativeSetSocks5Proxy(String str, int i11, String str2, String str3, boolean z11, boolean z12, boolean z13);

    private static native int nativeUpdateNetworkTime(long j11);

    public static boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static String getFileExtension(String str) {
        int iLastIndexOf;
        if (str == null || str.length() <= 0 || (iLastIndexOf = str.lastIndexOf(46)) < 0 || iLastIndexOf >= str.length() - 1) {
            return null;
        }
        return str.substring(iLastIndexOf + 1);
    }

    private static boolean nativeNtpTimeManagerListenerHasBeenCreated() {
        return sCallback != null;
    }

    public static void onUpdateNetworkTime(int i11, String str) {
        InterfaceC34729a interfaceC34729a = sCallback;
        if (interfaceC34729a != null) {
            interfaceC34729a.mo76075a(i11, str);
        }
    }

    static {
        SoLoader.loadAllLibraries();
    }

    public static long getNetworkTimestamp() {
        if (nativeNtpTimeManagerListenerHasBeenCreated()) {
            return nativeGetNetworkTimestamp(mNativeNtpTimeManagerListener);
        }
        return 0L;
    }

    public static String getSDKVersionStr() {
        return nativeGetSDKVersion();
    }

    public static int setGlobalEnv(String str) {
        return nativeSetGlobalEnv(str);
    }

    public static boolean setSocks5Proxy(String str, int i11, String str2, String str3, boolean z11, boolean z12, boolean z13) {
        return nativeSetSocks5Proxy(str, i11, str2, str3, z11, z12, z13);
    }

    public static void setUpdateNetworkTimeCallback(InterfaceC34729a interfaceC34729a) {
        if (nativeNtpTimeManagerListenerHasBeenCreated()) {
            return;
        }
        mNativeNtpTimeManagerListener = nativeCreate();
        sCallback = interfaceC34729a;
    }

    public static int updateNetworkTime() {
        if (nativeNtpTimeManagerListenerHasBeenCreated()) {
            return nativeUpdateNetworkTime(mNativeNtpTimeManagerListener);
        }
        return -1;
    }
}
