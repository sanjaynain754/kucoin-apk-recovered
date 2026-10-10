package com.geetest.gtc4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: com.geetest.gtc4.f4 */
/* JADX INFO: loaded from: classes45.dex */
public final class ServiceConnectionC6757f4 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public C6748e4 f11358a;

    /* JADX INFO: renamed from: b */
    public final CountDownLatch f11359b;

    /* JADX INFO: renamed from: c */
    public IBinder f11360c;

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f11358a = null;
        this.f11360c = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f11360c = iBinder;
            this.f11359b.countDown();
        } catch (Throwable unused) {
        }
    }

    public ServiceConnectionC6757f4(CountDownLatch countDownLatch) {
        this.f11359b = countDownLatch;
    }
}
