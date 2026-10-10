package com.sensorsdata.analytics.android.sdk.visual.util;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes59.dex */
public class Dispatcher {
    private static String TAG = "Dispatcher";
    private Handler mHandler;

    public static class DispatchHolder {
        private static final Dispatcher INSTANCE = new Dispatcher();

        private DispatchHolder() {
        }
    }

    private Dispatcher() {
        HandlerThread handlerThread = new HandlerThread(TAG);
        handlerThread.start();
        this.mHandler = new Handler(handlerThread.getLooper());
    }

    public void post(Runnable runnable) {
        postDelayed(runnable, 0L);
    }

    public void postDelayed(Runnable runnable, long j11) {
        this.mHandler.removeCallbacks(runnable);
        this.mHandler.postDelayed(runnable, j11);
    }

    public void removeCallbacksAndMessages() {
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public static Dispatcher getInstance() {
        return DispatchHolder.INSTANCE;
    }
}
