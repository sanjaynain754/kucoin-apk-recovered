package gi0;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import fi0.C37505e;
import fi0.InterfaceC37503c;
import fi0.InterfaceC37504d;
import third.sdk.com.samsung.android.deviceidservice.IDeviceIdService;
import third.sdk.oaid.OAIDException;

/* JADX INFO: renamed from: gi0.o */
/* JADX INFO: compiled from: SamsungImpl.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37964o implements InterfaceC37504d {

    /* JADX INFO: renamed from: a */
    public final Context f85388a;

    /* JADX INFO: renamed from: gi0.o$a */
    /* JADX INFO: compiled from: SamsungImpl.java */
    public class a implements ServiceConnectionC37962m.a {
        public a() {
        }

        @Override // gi0.ServiceConnectionC37962m.a
        /* JADX INFO: renamed from: a */
        public String mo85798a(IBinder iBinder) throws OAIDException, RemoteException {
            IDeviceIdService iDeviceIdServiceAsInterface = IDeviceIdService.Stub.asInterface(iBinder);
            if (iDeviceIdServiceAsInterface != null) {
                return iDeviceIdServiceAsInterface.getOAID();
            }
            throw new OAIDException("IDeviceIdService is null");
        }
    }

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: a */
    public boolean mo84451a() {
        Context context = this.f85388a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.samsung.android.deviceidservice", 0) != null;
        } catch (Exception e11) {
            C37505e.m84453a(e11);
            return false;
        }
    }

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: b */
    public void mo84452b(InterfaceC37503c interfaceC37503c) {
        if (this.f85388a == null || interfaceC37503c == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        ServiceConnectionC37962m.m85804a(this.f85388a, intent, interfaceC37503c, new a());
    }

    public C37964o(Context context) {
        this.f85388a = context;
    }
}
