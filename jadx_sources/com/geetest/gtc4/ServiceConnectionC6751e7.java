package com.geetest.gtc4;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.geetest.gtc4.e7 */
/* JADX INFO: loaded from: classes45.dex */
public final class ServiceConnectionC6751e7 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final Application f11350a;

    /* JADX INFO: renamed from: b */
    public final C6724b7 f11351b;

    /* JADX INFO: renamed from: c */
    public final C6742d7 f11352c;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Application application;
        try {
            try {
                try {
                    this.f11352c.getClass();
                    String strM12627a = C6742d7.m12627a(iBinder);
                    if (TextUtils.isEmpty(strM12627a)) {
                        throw new IllegalStateException("getDeviceId failed");
                    }
                    C6724b7 c6724b7 = this.f11351b;
                    c6724b7.f11321a.set(strM12627a);
                    c6724b7.f11322b.countDown();
                    application = this.f11350a;
                    application.unbindService(this);
                } catch (Exception unused) {
                    this.f11351b.f11322b.countDown();
                    application = this.f11350a;
                }
            } catch (Throwable th2) {
                try {
                    this.f11350a.unbindService(this);
                } catch (Exception unused2) {
                }
                throw th2;
            }
        } catch (Exception unused3) {
        }
    }

    public ServiceConnectionC6751e7(Context context, C6724b7 c6724b7, C6742d7 c6742d7) {
        if (context instanceof Application) {
            this.f11350a = (Application) context;
        } else {
            this.f11350a = (Application) context.getApplicationContext();
        }
        this.f11351b = c6724b7;
        this.f11352c = c6742d7;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
