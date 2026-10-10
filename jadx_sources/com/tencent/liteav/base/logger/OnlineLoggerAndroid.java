package com.tencent.liteav.base.logger;

import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav")
public class OnlineLoggerAndroid {
    private static final int INVALID_INSTANCE = -1;
    private long mNativeOnlineLoggerAndroid;

    private static native long nativeCreate(int i11, int i12, String str, String str2);

    private static native void nativeDestroy(long j11);

    private static native void nativeLog(long j11, int i11, String str);

    public synchronized void destroy() {
        long j11 = this.mNativeOnlineLoggerAndroid;
        if (j11 == -1) {
            return;
        }
        nativeDestroy(j11);
        this.mNativeOnlineLoggerAndroid = -1L;
    }

    public synchronized void log(EnumC34710b enumC34710b, String str) {
        long j11 = this.mNativeOnlineLoggerAndroid;
        if (j11 == -1) {
            return;
        }
        nativeLog(j11, enumC34710b.level, str);
    }

    /* JADX INFO: renamed from: com.tencent.liteav.base.logger.OnlineLoggerAndroid$a */
    public enum EnumC34709a {
        kTRTC(0),
        kLive(1),
        kVod(2);

        int value;

        EnumC34709a(int i11) {
            this.value = i11;
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.base.logger.OnlineLoggerAndroid$b */
    public enum EnumC34710b {
        kApi(1),
        kInfo(2),
        kWarning(3),
        kError(4);

        int level;

        EnumC34710b(int i11) {
            this.level = i11;
        }
    }

    public OnlineLoggerAndroid(EnumC34709a enumC34709a, int i11, String str, String str2) {
        this.mNativeOnlineLoggerAndroid = -1L;
        this.mNativeOnlineLoggerAndroid = nativeCreate(enumC34709a.value, i11, str, str2);
    }

    public void finalize() throws Throwable {
        super.finalize();
        destroy();
    }
}
