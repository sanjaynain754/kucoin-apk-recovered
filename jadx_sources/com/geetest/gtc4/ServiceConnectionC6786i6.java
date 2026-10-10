package com.geetest.gtc4;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: renamed from: com.geetest.gtc4.i6 */
/* JADX INFO: loaded from: classes45.dex */
public final class ServiceConnectionC6786i6 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final Context f11394a;

    /* JADX INFO: renamed from: b */
    public final C6783i3 f11395b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6777h6 f11396c;

    /* JADX INFO: renamed from: a */
    public static void m12662a(Context context, Intent intent, C6783i3 c6783i3, InterfaceC6777h6 interfaceC6777h6) {
        ServiceConnectionC6786i6 serviceConnectionC6786i6 = new ServiceConnectionC6786i6(context, c6783i3, interfaceC6777h6);
        try {
            if (!serviceConnectionC6786i6.f11394a.bindService(intent, serviceConnectionC6786i6, 1)) {
                throw new C6750e6("Service binding failed");
            }
            Objects.toString(intent);
        } catch (Exception unused) {
            serviceConnectionC6786i6.f11395b.f11392b.countDown();
        }
    }

    public ServiceConnectionC6786i6(Context context, C6783i3 c6783i3, InterfaceC6777h6 interfaceC6777h6) {
        if (context instanceof Application) {
            this.f11394a = context;
        } else {
            this.f11394a = context.getApplicationContext();
        }
        this.f11395b = c6783i3;
        this.f11396c = interfaceC6777h6;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        componentName.getClassName();
        try {
            try {
                try {
                    String strMo12656a = this.f11396c.mo12656a(iBinder);
                    if (strMo12656a != null && !strMo12656a.isEmpty()) {
                        C6783i3 c6783i3 = this.f11395b;
                        c6783i3.f11391a.set(strMo12656a);
                        c6783i3.f11392b.countDown();
                        this.f11394a.unbindService(this);
                        componentName.getClassName();
                        return;
                    }
                    throw new C6750e6("OAID/AAID acquire failed");
                } catch (Exception unused) {
                    this.f11395b.f11392b.countDown();
                    this.f11394a.unbindService(this);
                }
            } catch (Exception unused2) {
            }
        } catch (Throwable th2) {
            try {
                this.f11394a.unbindService(this);
                componentName.getClassName();
            } catch (Exception unused3) {
            }
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClassName();
    }
}
