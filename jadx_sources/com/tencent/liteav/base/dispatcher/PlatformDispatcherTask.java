package com.tencent.liteav.base.dispatcher;

import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav")
class PlatformDispatcherTask implements Runnable {
    private long mNativePlatformDispatcherTask = 0;

    private static native void nativeDestroyTask(long j11);

    private static native void nativeOnTaskFineshed(long j11, PlatformDispatcherTask platformDispatcherTask);

    private static native void nativeRunTask(long j11);

    private void destroyTask(long j11) {
        if (j11 != 0) {
            nativeDestroyTask(j11);
        }
    }

    public static Handler getMainHandler() {
        return new Handler(Looper.getMainLooper());
    }

    public void finalize() throws Throwable {
        destroyTask(this.mNativePlatformDispatcherTask);
        this.mNativePlatformDispatcherTask = 0L;
        super.finalize();
    }

    public void resetTask(long j11) {
        this.mNativePlatformDispatcherTask = j11;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j11 = this.mNativePlatformDispatcherTask;
        this.mNativePlatformDispatcherTask = 0L;
        if (j11 != 0) {
            nativeRunTask(j11);
            nativeOnTaskFineshed(j11, this);
            destroyTask(j11);
        }
    }
}
