package gi0;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import fi0.C37505e;
import fi0.InterfaceC37503c;
import fi0.InterfaceC37504d;
import third.sdk.com.bun.lib.MsaIdInterface;
import third.sdk.oaid.OAIDException;

/* JADX INFO: renamed from: gi0.j */
/* JADX INFO: compiled from: MsaImpl.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37959j implements InterfaceC37504d {

    /* JADX INFO: renamed from: a */
    public final Context f85378a;

    /* JADX INFO: renamed from: gi0.j$a */
    /* JADX INFO: compiled from: MsaImpl.java */
    public class a implements ServiceConnectionC37962m.a {
        public a() {
        }

        @Override // gi0.ServiceConnectionC37962m.a
        /* JADX INFO: renamed from: a */
        public String mo85798a(IBinder iBinder) throws OAIDException, RemoteException {
            MsaIdInterface msaIdInterfaceAsInterface = MsaIdInterface.Stub.asInterface(iBinder);
            if (msaIdInterfaceAsInterface != null) {
                if (msaIdInterfaceAsInterface.isSupported()) {
                    return msaIdInterfaceAsInterface.getOAID();
                }
                throw new OAIDException("MsaIdInterface#isSupported return false");
            }
            throw new OAIDException("MsaIdInterface is null");
        }
    }

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: a */
    public boolean mo84451a() {
        Context context = this.f85378a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.mdid.msa", 0) != null;
        } catch (Exception e11) {
            C37505e.m84453a(e11);
            return false;
        }
    }

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: b */
    public void mo84452b(InterfaceC37503c interfaceC37503c) {
        if (this.f85378a == null || interfaceC37503c == null) {
            return;
        }
        m85800c();
        Intent intent = new Intent("com.bun.msa.action.bindto.service");
        intent.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaIdService");
        intent.putExtra("com.bun.msa.param.pkgname", this.f85378a.getPackageName());
        ServiceConnectionC37962m.m85804a(this.f85378a, intent, interfaceC37503c, new a());
    }

    /* JADX INFO: renamed from: c */
    public final void m85800c() {
        try {
            Intent intent = new Intent("com.bun.msa.action.start.service");
            intent.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaKlService");
            intent.putExtra("com.bun.msa.param.pkgname", this.f85378a.getPackageName());
            if (Build.VERSION.SDK_INT < 26) {
                this.f85378a.startService(intent);
            } else {
                this.f85378a.startForegroundService(intent);
            }
        } catch (Exception e11) {
            C37505e.m84453a(e11);
        }
    }

    public C37959j(Context context) {
        this.f85378a = context;
    }
}
