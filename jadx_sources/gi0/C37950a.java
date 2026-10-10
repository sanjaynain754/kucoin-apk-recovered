package gi0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import fi0.C37505e;
import fi0.InterfaceC37503c;
import fi0.InterfaceC37504d;
import third.sdk.com.asus.msa.SupplementaryDID.IDidAidlInterface;
import third.sdk.oaid.OAIDException;

/* JADX INFO: renamed from: gi0.a */
/* JADX INFO: compiled from: AsusImpl.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37950a implements InterfaceC37504d {

    /* JADX INFO: renamed from: a */
    public final Context f85362a;

    /* JADX INFO: renamed from: gi0.a$a */
    /* JADX INFO: compiled from: AsusImpl.java */
    public class a implements ServiceConnectionC37962m.a {
        public a() {
        }

        @Override // gi0.ServiceConnectionC37962m.a
        /* JADX INFO: renamed from: a */
        public String mo85798a(IBinder iBinder) throws OAIDException, RemoteException {
            IDidAidlInterface iDidAidlInterfaceAsInterface = IDidAidlInterface.Stub.asInterface(iBinder);
            if (iDidAidlInterfaceAsInterface != null) {
                if (iDidAidlInterfaceAsInterface.isSupport()) {
                    return iDidAidlInterfaceAsInterface.getOAID();
                }
                throw new OAIDException("IDidAidlInterface#isSupport return false");
            }
            throw new OAIDException("IDidAidlInterface is null");
        }
    }

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: a */
    public boolean mo84451a() {
        Context context = this.f85362a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.asus.msa.SupplementaryDID", 0) != null;
        } catch (Exception e11) {
            C37505e.m84453a(e11);
            return false;
        }
    }

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: b */
    public void mo84452b(InterfaceC37503c interfaceC37503c) {
        if (this.f85362a == null || interfaceC37503c == null) {
            return;
        }
        Intent intent = new Intent("com.asus.msa.action.ACCESS_DID");
        intent.setComponent(new ComponentName("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService"));
        ServiceConnectionC37962m.m85804a(this.f85362a, intent, interfaceC37503c, new a());
    }

    public C37950a(Context context) {
        this.f85362a = context;
    }
}
