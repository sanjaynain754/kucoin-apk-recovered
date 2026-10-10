package cn.jiguang.privates.common.binder;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.common.observer.JObservable;

/* JADX INFO: loaded from: classes34.dex */
public class RemoteMessengerHandler extends Handler {
    private static final String TAG = "RemoteMessengerHandler";
    private final Context context;

    public RemoteMessengerHandler(Context context, Looper looper) {
        super(looper);
        this.context = context;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            JMessenger.getInstance().initMainMessenger(message.replyTo);
            int i11 = message.what;
            Bundle data = message.getData();
            if (i11 == 101) {
                JObservable.getInstance().observerOnRemoteProcess(this.context, data);
            } else {
                JObservable.getInstance().dispatchMessage(this.context, i11, data);
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "handleMessage failed " + th2.getMessage());
        }
    }
}
