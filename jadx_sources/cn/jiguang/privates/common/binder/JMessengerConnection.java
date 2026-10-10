package cn.jiguang.privates.common.binder;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public class JMessengerConnection implements ServiceConnection {
    private final Context context;

    public JMessengerConnection(Context context) {
        this.context = context;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        JMessenger.getInstance().onServiceConnected(this.context, iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        JMessenger.getInstance().onServiceDisconnected(this.context);
    }
}
