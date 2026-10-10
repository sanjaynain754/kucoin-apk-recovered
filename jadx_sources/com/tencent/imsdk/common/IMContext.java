package com.tencent.imsdk.common;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes59.dex */
public class IMContext {
    private static final String TAG = "IMContext";
    private Context mContext;
    private Handler mMainHandler;

    public static class Holder {
        public static IMContext instance = new IMContext();

        private Holder() {
        }
    }

    private IMContext() {
        this.mMainHandler = new Handler(Looper.getMainLooper());
    }

    public static IMContext getInstance() {
        return Holder.instance;
    }

    public Context getApplicationContext() {
        return this.mContext;
    }

    public void init(Context context) {
        this.mContext = context;
    }

    public void runOnMainThread(Runnable runnable) {
        this.mMainHandler.post(runnable);
    }
}
