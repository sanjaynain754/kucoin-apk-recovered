package com.facebook.react.bridge;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.facebook.react.common.build.ReactBuildConfig;

/* JADX INFO: loaded from: classes45.dex */
public class UiThreadUtil {

    @Nullable
    private static volatile Handler sMainHandler;

    public static boolean runOnUiThread(Runnable runnable) {
        return getUiThreadHandler().postDelayed(runnable, 0L);
    }

    public static void assertNotOnUiThread() {
        if (ReactBuildConfig.DEBUG) {
            SoftAssertions.assertCondition(!isOnUiThread(), "Expected not to run on UI thread!");
        }
    }

    public static void assertOnUiThread() {
        if (ReactBuildConfig.DEBUG) {
            SoftAssertions.assertCondition(isOnUiThread(), "Expected to run on UI thread!");
        }
    }

    public static Handler getUiThreadHandler() {
        if (sMainHandler == null) {
            synchronized (UiThreadUtil.class) {
                try {
                    if (sMainHandler == null) {
                        sMainHandler = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return sMainHandler;
    }

    public static boolean runOnUiThread(Runnable runnable, long j11) {
        return getUiThreadHandler().postDelayed(runnable, j11);
    }

    public static boolean isOnUiThread() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public static void removeOnUiThread(Runnable runnable) {
        getUiThreadHandler().removeCallbacks(runnable);
    }
}
