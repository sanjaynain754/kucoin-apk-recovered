package cn.jiguang.privates.common.component;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import cn.jiguang.privates.common.binder.JMessenger;
import cn.jiguang.privates.common.log.JCommonLog;

/* JADX INFO: loaded from: classes.dex */
public class JCommonService extends Service {
    private static final String TAG = "JCommonService";

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i11, int i12) {
        return 2;
    }

    @Override // android.app.Service
    public final void onCreate() {
        JCommonLog.m5432i(TAG, "onService create");
        JMessenger.getInstance().initOnRemoteProcess(getApplicationContext());
    }

    @Override // android.app.Service
    public final void onDestroy() {
        JCommonLog.m5432i(TAG, "onService destroy");
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return JMessenger.getInstance().getBinder();
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }
}
