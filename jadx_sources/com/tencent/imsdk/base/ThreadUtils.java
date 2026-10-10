package com.tencent.imsdk.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.tencent.imsdk.base.annotations.CalledByNative;
import com.tencent.imsdk.base.annotations.VisibleForTesting;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes59.dex */
public class ThreadUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object sLock = new Object();
    private static boolean sThreadAssertsDisabled;
    private static Handler sUiThreadHandler;
    private static boolean sWillOverride;

    @Deprecated
    public static <T> FutureTask<T> postOnUiThread(FutureTask<T> futureTask) {
        getUiThreadHandler().post(futureTask);
        return futureTask;
    }

    @Deprecated
    public static <T> FutureTask<T> runOnUiThread(FutureTask<T> futureTask) {
        if (runningOnUiThread()) {
            futureTask.run();
            return futureTask;
        }
        postOnUiThread((FutureTask) futureTask);
        return futureTask;
    }

    @Deprecated
    public static void runOnUiThreadBlocking(Runnable runnable) {
        if (runningOnUiThread()) {
            runnable.run();
            return;
        }
        FutureTask futureTask = new FutureTask(runnable, null);
        postOnUiThread(futureTask);
        try {
            futureTask.get();
        } catch (Exception e11) {
            throw new RuntimeException("Exception occurred while waiting for runnable", e11);
        }
    }

    public static void checkUiThread() {
        if (!sThreadAssertsDisabled && !runningOnUiThread()) {
            throw new IllegalStateException("Must be called on the UI thread.");
        }
    }

    public static Handler getUiThreadHandler() {
        Handler handler;
        synchronized (sLock) {
            try {
                if (sUiThreadHandler == null) {
                    if (sWillOverride) {
                        throw new RuntimeException("Did not yet override the UI thread");
                    }
                    sUiThreadHandler = new Handler(Looper.getMainLooper());
                }
                handler = sUiThreadHandler;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    @Deprecated
    public static void postOnUiThread(Runnable runnable) {
        getUiThreadHandler().post(runnable);
    }

    public static void setThreadAssertsDisabledForTesting(boolean z11) {
        sThreadAssertsDisabled = z11;
    }

    @CalledByNative
    public static void setThreadPriorityAudio(int i11) {
        Process.setThreadPriority(i11, -16);
    }

    public static void setUiThread(Looper looper) {
        synchronized (sLock) {
            try {
                if (looper == null) {
                    sUiThreadHandler = null;
                    return;
                }
                Handler handler = sUiThreadHandler;
                if (handler != null && handler.getLooper() != looper) {
                    throw new RuntimeException("UI thread looper is already set to " + sUiThreadHandler.getLooper() + " (Main thread looper is " + Looper.getMainLooper() + "), cannot set to new looper " + looper);
                }
                sUiThreadHandler = new Handler(looper);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void setWillOverrideUiThread(boolean z11) {
        synchronized (sLock) {
            sWillOverride = z11;
        }
    }

    public static Looper getUiThreadLooper() {
        return getUiThreadHandler().getLooper();
    }

    @CalledByNative
    private static boolean isThreadPriorityAudio(int i11) {
        if (Process.getThreadPriority(i11) == -16) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    @Deprecated
    public static void postOnUiThreadDelayed(Runnable runnable, long j11) {
        getUiThreadHandler().postDelayed(runnable, j11);
    }

    @VisibleForTesting
    @Deprecated
    public static <T> T runOnUiThreadBlockingNoException(Callable<T> callable) {
        try {
            return (T) runOnUiThreadBlocking(callable);
        } catch (ExecutionException e11) {
            throw new RuntimeException("Error occurred waiting for callable", e11);
        }
    }

    public static boolean runningOnUiThread() {
        if (getUiThreadHandler().getLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    @Deprecated
    public static <T> FutureTask<T> runOnUiThread(Callable<T> callable) {
        return runOnUiThread(new FutureTask(callable));
    }

    @Deprecated
    public static void runOnUiThread(Runnable runnable) {
        if (runningOnUiThread()) {
            runnable.run();
        } else {
            getUiThreadHandler().post(runnable);
        }
    }

    @Deprecated
    public static <T> T runOnUiThreadBlocking(Callable<T> callable) throws ExecutionException {
        FutureTask futureTask = new FutureTask(callable);
        runOnUiThread(futureTask);
        try {
            return (T) futureTask.get();
        } catch (InterruptedException e11) {
            throw new RuntimeException("Interrupted waiting for callable", e11);
        }
    }

    public static void assertOnBackgroundThread() {
    }

    public static void assertOnUiThread() {
    }
}
