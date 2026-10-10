package gi0;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import fi0.C37505e;
import fi0.InterfaceC37503c;
import fi0.InterfaceC37504d;
import third.sdk.com.coolpad.deviceidsupport.IDeviceIdManager;
import third.sdk.oaid.OAIDException;

/* JADX INFO: renamed from: gi0.b */
/* JADX INFO: compiled from: CoolpadImpl.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37951b implements InterfaceC37504d {

    /* JADX INFO: renamed from: a */
    public final Context f85364a;

    /* JADX INFO: renamed from: gi0.b$a */
    /* JADX INFO: compiled from: CoolpadImpl.java */
    public class a implements ServiceConnectionC37962m.a {
        public a() {
        }

        @Override // gi0.ServiceConnectionC37962m.a
        /* JADX INFO: renamed from: a */
        public String mo85798a(IBinder iBinder) throws OAIDException, RemoteException {
            IDeviceIdManager iDeviceIdManagerAsInterface = IDeviceIdManager.Stub.asInterface(iBinder);
            if (iDeviceIdManagerAsInterface != null) {
                return iDeviceIdManagerAsInterface.getOAID(C37951b.this.f85364a.getPackageName());
            }
            throw new OAIDException("IDeviceIdManager is null");
        }
    }

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: a */
    public boolean mo84451a() {
        Context context = this.f85364a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.coolpad.deviceidsupport", 0) != null;
        } catch (Exception e11) {
            C37505e.m84453a(e11);
            return false;
        }
    }

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: b */
    public void mo84452b(InterfaceC37503c interfaceC37503c) {
        if (this.f85364a == null || interfaceC37503c == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.coolpad.deviceidsupport", "com.coolpad.deviceidsupport.DeviceIdService"));
        ServiceConnectionC37962m.m85804a(this.f85364a, intent, interfaceC37503c, new a());
    }

    public C37951b(Context context) {
        if (context instanceof Application) {
            this.f85364a = context;
        } else {
            this.f85364a = context.getApplicationContext();
        }
    }
}
