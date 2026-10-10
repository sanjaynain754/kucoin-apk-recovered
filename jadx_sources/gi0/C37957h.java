package gi0;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import fi0.C37505e;
import fi0.InterfaceC37503c;
import fi0.InterfaceC37504d;
import third.sdk.com.zui.deviceidservice.IDeviceidInterface;
import third.sdk.oaid.OAIDException;

/* JADX INFO: renamed from: gi0.h */
/* JADX INFO: compiled from: LenovoImpl.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37957h implements InterfaceC37504d {

    /* JADX INFO: renamed from: a */
    public final Context f85375a;

    /* JADX INFO: renamed from: gi0.h$a */
    /* JADX INFO: compiled from: LenovoImpl.java */
    public class a implements ServiceConnectionC37962m.a {
        public a() {
        }

        @Override // gi0.ServiceConnectionC37962m.a
        /* JADX INFO: renamed from: a */
        public String mo85798a(IBinder iBinder) throws OAIDException, RemoteException {
            IDeviceidInterface iDeviceidInterfaceAsInterface = IDeviceidInterface.Stub.asInterface(iBinder);
            if (iDeviceidInterfaceAsInterface != null) {
                if (iDeviceidInterfaceAsInterface.isSupport()) {
                    return iDeviceidInterfaceAsInterface.getOAID();
                }
                throw new OAIDException("IDeviceidInterface#isSupport return false");
            }
            throw new OAIDException("IDeviceidInterface is null");
        }
    }

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: a */
    public boolean mo84451a() {
        Context context = this.f85375a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.zui.deviceidservice", 0) != null;
        } catch (Exception e11) {
            C37505e.m84453a(e11);
            return false;
        }
    }

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: b */
    public void mo84452b(InterfaceC37503c interfaceC37503c) {
        if (this.f85375a == null || interfaceC37503c == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
        ServiceConnectionC37962m.m85804a(this.f85375a, intent, interfaceC37503c, new a());
    }

    public C37957h(Context context) {
        this.f85375a = context;
    }
}
