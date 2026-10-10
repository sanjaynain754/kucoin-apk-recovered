package com.tencent.thumbplayer.tcmedia.core.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLog;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes64.dex */
public class TPThreadPool {
    private static final int CORE_POOL_SIZE = 1;
    private static final int MAX_POOL_SIZE = 20;
    private static final String PRE_THREAD_NAME = "TPCoreHdr";
    private static final String SHARE_THREAD_NAME = "TPCore-ShareThread";
    private static final String TAG = "TPCore[TPThreadPool]";
    private static volatile ExecutorService sCustomExecutor;
    private static volatile HandlerThread sHandlerThread;
    private static volatile TPThreadPool sInstance;
    private static volatile Handler sMainThreadHandler;
    private static volatile ScheduledExecutorService sScheduler;
    private static volatile ExecutorService sShareSingleExecutor;
    private static int sShareThreadCount;

    public HandlerThread obtainHandleThread(String str) {
        return obtainHandleThread(str, 0);
    }

    public static TPThreadPool getInstance() {
        if (sInstance == null) {
            synchronized (TPThreadPool.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new TPThreadPool();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return sInstance;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0029 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0010, B:13:0x0021, B:15:0x0029, B:16:0x003a, B:10:0x0016, B:12:0x001e), top: B:20:0x0003 }] */
    private static void initHandlerThread() {
        HandlerThread handlerThread;
        synchronized (TPThreadPool.class) {
            try {
                if (sHandlerThread == null) {
                    handlerThread = new HandlerThread(SHARE_THREAD_NAME);
                    sHandlerThread = handlerThread;
                } else {
                    if (!sHandlerThread.isAlive()) {
                        handlerThread = sHandlerThread;
                    }
                    if (sHandlerThread.getLooper() == null) {
                        sHandlerThread.quit();
                        HandlerThread handlerThread2 = new HandlerThread(SHARE_THREAD_NAME);
                        sHandlerThread = handlerThread2;
                        handlerThread2.start();
                    }
                }
                handlerThread.start();
                if (sHandlerThread.getLooper() == null) {
                    sHandlerThread.quit();
                    HandlerThread handlerThread3 = new HandlerThread(SHARE_THREAD_NAME);
                    sHandlerThread = handlerThread3;
                    handlerThread3.start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void initMainThreadHandler() {
        if (sMainThreadHandler != null) {
            return;
        }
        synchronized (TPThreadPool.class) {
            try {
                if (sMainThreadHandler == null) {
                    Looper mainLooper = Looper.getMainLooper();
                    if (mainLooper != null) {
                        sMainThreadHandler = new Handler(mainLooper);
                    } else {
                        sMainThreadHandler = null;
                        TPNativeLog.printLog(4, TAG, "cannot get thread looper");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public HandlerThread obtainHandleThread(String str, int i11) {
        if (i11 >= 19 || i11 <= -19) {
            i11 = 0;
        }
        if (TextUtils.isEmpty(str)) {
            str = PRE_THREAD_NAME;
        }
        HandlerThread handlerThread = new HandlerThread(str, i11);
        handlerThread.start();
        return handlerThread;
    }

    public ScheduledExecutorService obtainScheduledExecutorService() {
        if (sScheduler == null) {
            synchronized (TPThreadPool.class) {
                try {
                    if (sScheduler == null) {
                        sScheduler = Executors.newScheduledThreadPool(1);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return sScheduler;
    }

    public ExecutorService obtainSingleThreadExecutor() {
        if (sShareSingleExecutor == null) {
            synchronized (TPThreadPool.class) {
                try {
                    if (sShareSingleExecutor == null) {
                        sShareSingleExecutor = Executors.newSingleThreadExecutor();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return sShareSingleExecutor;
    }

    public ExecutorService obtainThreadExecutor() {
        if (sCustomExecutor == null) {
            synchronized (TPThreadPool.class) {
                try {
                    if (sCustomExecutor == null) {
                        sCustomExecutor = TPThreadPoolExecutor.newCustomThreadExecutor(1, 20);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return sCustomExecutor;
    }

    public void recycle(HandlerThread handlerThread, Handler handler) {
        if (handlerThread == null) {
            return;
        }
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (!handlerThread.equals(sHandlerThread)) {
            handlerThread.quit();
            return;
        }
        synchronized (TPThreadPool.class) {
            sShareThreadCount--;
            TPNativeLog.printLog(2, TAG, "handlerThread recycle mShareThreadCount:" + sShareThreadCount);
        }
    }

    private TPThreadPool() {
    }

    public HandlerThread obtainShareThread() {
        HandlerThread handlerThread;
        initHandlerThread();
        synchronized (TPThreadPool.class) {
            sShareThreadCount++;
            TPNativeLog.printLog(2, TAG, "handlerThread obtainShareThread mShareThreadCount:" + sShareThreadCount);
            handlerThread = sHandlerThread;
        }
        return handlerThread;
    }

    public void postDelayRunnableOnMainThread(Runnable runnable, long j11) {
        initMainThreadHandler();
        if (sMainThreadHandler != null) {
            sMainThreadHandler.postDelayed(runnable, j11);
        }
    }

    public void postRunnableOnMainThread(Runnable runnable) {
        initMainThreadHandler();
        if (sMainThreadHandler != null) {
            sMainThreadHandler.post(runnable);
        }
    }

    public void postRunnableOnMainThreadFront(Runnable runnable) {
        initMainThreadHandler();
        if (sMainThreadHandler != null) {
            sMainThreadHandler.postAtFrontOfQueue(runnable);
        }
    }
}
