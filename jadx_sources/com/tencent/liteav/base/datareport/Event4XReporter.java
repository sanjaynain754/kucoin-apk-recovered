package com.tencent.liteav.base.datareport;

import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav")
public class Event4XReporter {
    private static final int INVALID_INSTANCE = 0;
    public static final int REPORT_EVENT = 1;
    public static final int REPORT_STATUS = 2;
    private static final String TAG = "Event4XReporter";
    private long mNativeEvent4XReporterAndroid;

    private static native long nativeCreate(int i11, int i12, String str, boolean z11, int i13);

    private static native void nativeDestroy(long j11);

    private static native int nativeGetColdDownTime(long j11);

    private static native void nativeSendReport(long j11);

    private static native void nativeSetCommonIntValue(long j11, String str, long j12);

    private static native void nativeSetCommonStringValue(long j11, String str, String str2);

    private static native void nativeSetEventIntValue(long j11, String str, long j12);

    private static native void nativeSetEventStringValue(long j11, String str, String str2);

    public synchronized void destroy() {
        long j11 = this.mNativeEvent4XReporterAndroid;
        if (j11 == 0) {
            return;
        }
        nativeDestroy(j11);
        this.mNativeEvent4XReporterAndroid = 0L;
    }

    public synchronized void reportDau(int i11, int i12, String str) {
        long j11 = this.mNativeEvent4XReporterAndroid;
        if (j11 == 0) {
            return;
        }
        nativeSetEventStringValue(j11, "event_id", String.valueOf(i11));
        nativeSetEventStringValue(this.mNativeEvent4XReporterAndroid, "err_code", String.valueOf(i12));
        nativeSetEventStringValue(this.mNativeEvent4XReporterAndroid, "err_info", str);
        nativeSendReport(this.mNativeEvent4XReporterAndroid);
    }

    public synchronized void sendReport() {
        long j11 = this.mNativeEvent4XReporterAndroid;
        if (j11 == 0) {
            return;
        }
        nativeSendReport(j11);
    }

    public synchronized void setCommonIntValue(String str, long j11) {
        long j12 = this.mNativeEvent4XReporterAndroid;
        if (j12 != 0 && str != null) {
            nativeSetCommonIntValue(j12, str, j11);
        }
    }

    public synchronized void setCommonStringValue(String str, String str2) {
        long j11 = this.mNativeEvent4XReporterAndroid;
        if (j11 != 0 && str != null && str2 != null) {
            nativeSetCommonStringValue(j11, str, str2);
        }
    }

    public synchronized void setEventIntValue(String str, long j11) {
        long j12 = this.mNativeEvent4XReporterAndroid;
        if (j12 != 0 && str != null) {
            nativeSetEventIntValue(j12, str, j11);
        }
    }

    public synchronized void setEventStringValue(String str, String str2) {
        long j11 = this.mNativeEvent4XReporterAndroid;
        if (j11 != 0 && str != null && str2 != null) {
            nativeSetEventStringValue(j11, str, str2);
        }
    }

    public int getColdDownTime() {
        long j11 = this.mNativeEvent4XReporterAndroid;
        if (j11 == 0) {
            return 10000;
        }
        return nativeGetColdDownTime(j11);
    }

    public Event4XReporter(int i11, int i12, String str, boolean z11, int i13) {
        this.mNativeEvent4XReporterAndroid = 0L;
        this.mNativeEvent4XReporterAndroid = nativeCreate(i11, i12, str, z11, i13);
    }

    public void finalize() throws Throwable {
        super.finalize();
        destroy();
    }
}
