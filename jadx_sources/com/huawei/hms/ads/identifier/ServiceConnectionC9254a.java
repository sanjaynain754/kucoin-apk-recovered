package com.huawei.hms.ads.identifier;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.ads.identifier.a */
/* JADX INFO: loaded from: classes56.dex */
public final class ServiceConnectionC9254a implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public static final ThreadPoolExecutor f13260a = new ThreadPoolExecutor(0, 3, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(2048), new ThreadPoolExecutor.DiscardPolicy());

    /* JADX INFO: renamed from: b */
    boolean f13261b = false;

    /* JADX INFO: renamed from: c */
    private final LinkedBlockingQueue<IBinder> f13262c = new LinkedBlockingQueue<>(1);

    /* JADX INFO: renamed from: a */
    public IBinder m14289a() throws InterruptedException {
        if (this.f13261b) {
            throw new IllegalStateException();
        }
        this.f13261b = true;
        return this.f13262c.take();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        Log.d("PPSSerivceConnection", "onServiceConnected");
        f13260a.execute(new Runnable() { // from class: com.huawei.hms.ads.identifier.a.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Log.d("PPSSerivceConnection", "onServiceConnected " + System.currentTimeMillis());
                    ServiceConnectionC9254a.this.f13262c.offer(iBinder);
                } catch (Throwable th2) {
                    Log.w("PPSSerivceConnection", "onServiceConnected  " + th2.getClass().getSimpleName());
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        Log.d("PPSSerivceConnection", "onServiceDisconnected " + System.currentTimeMillis());
    }
}
