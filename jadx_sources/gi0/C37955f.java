package gi0;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import ei0.InterfaceC37192a;
import fi0.C37505e;
import fi0.InterfaceC37503c;
import fi0.InterfaceC37504d;
import third.sdk.oaid.OAIDException;

/* JADX INFO: renamed from: gi0.f */
/* JADX INFO: compiled from: GmsImpl.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37955f implements InterfaceC37504d {

    /* JADX INFO: renamed from: a */
    public final Context f85370a;

    /* JADX INFO: renamed from: gi0.f$a */
    /* JADX INFO: compiled from: GmsImpl.java */
    public class a implements ServiceConnectionC37962m.a {
        public a() {
        }

        @Override // gi0.ServiceConnectionC37962m.a
        /* JADX INFO: renamed from: a */
        public String mo85798a(IBinder iBinder) throws OAIDException, RemoteException {
            InterfaceC37192a interfaceC37192aM83185b = InterfaceC37192a.a.m83185b(iBinder);
            if (interfaceC37192aM83185b.isLimitAdTrackingEnabled(true)) {
                C37505e.m84453a("User has disabled advertising identifier");
            }
            return interfaceC37192aM83185b.getId();
        }
    }

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: a */
    public boolean mo84451a() {
        Context context = this.f85370a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.android.vending", 0) != null;
        } catch (Exception e11) {
            C37505e.m84453a(e11);
            return false;
        }
    }

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: b */
    public void mo84452b(InterfaceC37503c interfaceC37503c) {
        if (this.f85370a == null || interfaceC37503c == null) {
            return;
        }
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        ServiceConnectionC37962m.m85804a(this.f85370a, intent, interfaceC37503c, new a());
    }

    public C37955f(Context context) {
        this.f85370a = context;
    }
}
