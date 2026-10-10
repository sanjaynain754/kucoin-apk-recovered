package com.datavisorobfus;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: renamed from: com.datavisorobfus.m0 */
/* JADX INFO: loaded from: classes34.dex */
public class ServiceConnectionC5431m0 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private Context f7318a;

    /* JADX INFO: renamed from: b */
    private InterfaceC5403b0 f7319b;

    /* JADX INFO: renamed from: c */
    private a f7320c;

    /* JADX INFO: renamed from: com.datavisorobfus.m0$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        String mo7112a(IBinder iBinder);
    }

    /* JADX INFO: renamed from: a */
    public static void m7222a(Context context, Intent intent, InterfaceC5403b0 interfaceC5403b0, a aVar) {
        try {
            new ServiceConnectionC5431m0(context, interfaceC5403b0, aVar).m7223a(intent);
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            if (interfaceC5403b0 != null) {
                try {
                    interfaceC5403b0.mo7113a("empty");
                } catch (Throwable th3) {
                    C5415f0.m7139a(th3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7223a(Intent intent) {
        try {
            if (this.f7318a.bindService(intent, this, 1)) {
            } else {
                throw new RuntimeException("OAID Service binding failed");
            }
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            InterfaceC5403b0 interfaceC5403b0 = this.f7319b;
            if (interfaceC5403b0 != null) {
                try {
                    interfaceC5403b0.mo7113a("empty");
                } catch (Throwable th3) {
                    C5415f0.m7139a(th3);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            try {
                a aVar = this.f7320c;
                if (aVar == null) {
                    throw new RuntimeException("No Remote Caller");
                }
                String strMo7112a = aVar.mo7112a(iBinder);
                if (C5457z0.m7480a(strMo7112a)) {
                    throw new RuntimeException("OAID acquire failed");
                }
                InterfaceC5403b0 interfaceC5403b0 = this.f7319b;
                if (interfaceC5403b0 != null) {
                    try {
                        interfaceC5403b0.mo7113a(strMo7112a);
                    } catch (Throwable th2) {
                        C5415f0.m7139a(th2);
                    }
                }
                this.f7318a.unbindService(this);
            } catch (Throwable th3) {
                C5415f0.m7139a(th3);
            }
        } catch (Throwable th4) {
            try {
                C5415f0.m7139a(th4);
                InterfaceC5403b0 interfaceC5403b1 = this.f7319b;
                if (interfaceC5403b1 != null) {
                    try {
                        interfaceC5403b1.mo7113a("empty");
                    } catch (Throwable th5) {
                        C5415f0.m7139a(th5);
                    }
                }
                this.f7318a.unbindService(this);
            } catch (Throwable th6) {
                try {
                    this.f7318a.unbindService(this);
                } catch (Throwable th7) {
                    C5415f0.m7139a(th7);
                }
                throw th6;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        C5415f0.m7136a("Service has been disconnected: " + componentName.getClassName());
    }

    private ServiceConnectionC5431m0(Context context, InterfaceC5403b0 interfaceC5403b0, a aVar) {
        this.f7318a = context;
        this.f7319b = interfaceC5403b0;
        this.f7320c = aVar;
    }
}
