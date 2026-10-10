package gi0;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import fi0.C37505e;
import fi0.InterfaceC37503c;
import third.sdk.oaid.OAIDException;

/* JADX INFO: renamed from: gi0.m */
/* JADX INFO: compiled from: OAIDService.java */
/* JADX INFO: loaded from: classes61.dex */
public class ServiceConnectionC37962m implements ServiceConnection {

    /* JADX INFO: renamed from: b */
    public final Context f85382b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC37503c f85383c;

    /* JADX INFO: renamed from: d */
    public final a f85384d;

    /* JADX INFO: renamed from: gi0.m$a */
    /* JADX INFO: compiled from: OAIDService.java */
    @FunctionalInterface
    public interface a {
        /* JADX INFO: renamed from: a */
        String mo85798a(IBinder iBinder) throws OAIDException, RemoteException;
    }

    /* JADX INFO: renamed from: a */
    public static void m85804a(Context context, Intent intent, InterfaceC37503c interfaceC37503c, a aVar) {
        new ServiceConnectionC37962m(context, interfaceC37503c, aVar).m85805b(intent);
    }

    /* JADX INFO: renamed from: b */
    public final void m85805b(Intent intent) {
        try {
            if (!this.f85382b.bindService(intent, this, 1)) {
                throw new OAIDException("Service binding failed");
            }
            C37505e.m84453a("Service has been bound: " + intent);
        } catch (Exception e11) {
            this.f85383c.mo84444b(e11);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C37505e.m84453a("Service has been connected: " + componentName.getClassName());
        try {
            try {
                try {
                    String strMo85798a = this.f85384d.mo85798a(iBinder);
                    if (strMo85798a == null || strMo85798a.length() == 0) {
                        throw new OAIDException("OAID/AAID acquire failed");
                    }
                    C37505e.m84453a("OAID/AAID acquire success: " + strMo85798a);
                    this.f85383c.mo84443a(strMo85798a);
                    this.f85382b.unbindService(this);
                    C37505e.m84453a("Service has been unbound: " + componentName.getClassName());
                } catch (Throwable th2) {
                    try {
                        this.f85382b.unbindService(this);
                        C37505e.m84453a("Service has been unbound: " + componentName.getClassName());
                    } catch (Exception e11) {
                        C37505e.m84453a(e11);
                    }
                    throw th2;
                }
            } catch (Exception e12) {
                C37505e.m84453a(e12);
                this.f85383c.mo84444b(e12);
                this.f85382b.unbindService(this);
                C37505e.m84453a("Service has been unbound: " + componentName.getClassName());
            }
        } catch (Exception e13) {
            C37505e.m84453a(e13);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        C37505e.m84453a("Service has been disconnected: " + componentName.getClassName());
    }

    public ServiceConnectionC37962m(Context context, InterfaceC37503c interfaceC37503c, a aVar) {
        if (context instanceof Application) {
            this.f85382b = context;
        } else {
            this.f85382b = context.getApplicationContext();
        }
        this.f85383c = interfaceC37503c;
        this.f85384d = aVar;
    }
}
