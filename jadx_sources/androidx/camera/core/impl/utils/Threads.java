package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.core.util.Preconditions;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes23.dex */
public final class Threads {
    private static final long TIMEOUT_RUN_ON_MAIN_MS = 30000;

    private static Handler getMainHandler() {
        return new Handler(Looper.getMainLooper());
    }

    private Threads() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1979a(Runnable runnable, CountDownLatch countDownLatch) {
        try {
            runnable.run();
        } finally {
            countDownLatch.countDown();
        }
    }

    public static void checkBackgroundThread() {
        Preconditions.checkState(isBackgroundThread(), "In application's main thread");
    }

    public static void checkMainThread() {
        Preconditions.checkState(isMainThread(), "Not in application's main thread");
    }

    public static boolean isBackgroundThread() {
        return !isMainThread();
    }

    public static boolean isMainThread() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public static void runOnMain(Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
        } else {
            Preconditions.checkState(getMainHandler().post(runnable), "Unable to post to main thread");
        }
    }

    public static void runOnMainSync(final Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        Preconditions.checkState(getMainHandler().post(new Runnable() { // from class: androidx.camera.core.impl.utils.e
            @Override // java.lang.Runnable
            public final void run() {
                Threads.m1979a(runnable, countDownLatch);
            }
        }), "Unable to post to main thread");
        try {
            if (countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
            } else {
                throw new IllegalStateException("Timeout to wait main thread execution");
            }
        } catch (InterruptedException e11) {
            throw new InterruptedRuntimeException(e11);
        }
    }
}
