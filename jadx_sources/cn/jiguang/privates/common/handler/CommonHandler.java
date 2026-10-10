package cn.jiguang.privates.common.handler;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.common.observer.JObservable;

/* JADX INFO: loaded from: classes.dex */
public class CommonHandler extends Handler {
    private static final String TAG = "CommonHandler";
    private static final int WHAT_RELEASE = -1000;
    private final Context context;
    private final int releaseInterval;

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            int i11 = message.arg1;
            String strValueOf = String.valueOf(message.obj);
            int i12 = message.what;
            Bundle data = message.getData();
            if (i12 == -1000) {
                JHandler.getInstance().releaseHandler(this.context, getLooper().getThread().getName());
                return;
            }
            removeMessages(-1000);
            sendEmptyMessageDelayed(-1000, this.releaseInterval);
            JObservable.getInstance().handleMessage(this.context, i11, strValueOf, i12, data);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "handleMessage failed " + th2.getMessage());
        }
    }

    public CommonHandler(Looper looper, Context context, int i11) {
        super(looper);
        this.context = context;
        this.releaseInterval = i11;
    }
}
