package com.sensorsdata.abtest.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: loaded from: classes23.dex */
public class TaskRunner {
    private static final String TAG = "SAB.TaskRunner";
    private Handler mBackHandler;
    private Handler mUiThreadHandler;

    public static class SingletonHolder {
        static TaskRunner sRunner = new TaskRunner();

        private SingletonHolder() {
        }
    }

    public static synchronized Handler getBackHandler() {
        Handler handler;
        handler = SingletonHolder.sRunner.mBackHandler;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("TaskRunner");
            handlerThread.start();
            Handler handler2 = new Handler(handlerThread.getLooper());
            SingletonHolder.sRunner.mBackHandler = handler2;
            handler = handler2;
        }
        return handler;
    }

    public static synchronized Handler getUiThreadHandler() {
        Handler handler;
        handler = SingletonHolder.sRunner.mUiThreadHandler;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
            SingletonHolder.sRunner.mUiThreadHandler = handler;
        }
        return handler;
    }
}
