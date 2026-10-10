package cn.jiguang.privates.common.binder;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.common.observer.JObservable;

/* JADX INFO: loaded from: classes.dex */
public class MainMessengerHandler extends Handler {
    private static final String TAG = "MainMessengerHandler";
    private final Context context;

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            JObservable.getInstance().dispatchMessage(this.context, message.what, message.getData());
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "handleMessage failed " + th2.getMessage());
        }
    }

    public MainMessengerHandler(Context context, Looper looper) {
        super(looper);
        this.context = context;
    }
}
