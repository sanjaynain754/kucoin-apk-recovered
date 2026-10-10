package gi0;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import fi0.C37505e;
import fi0.InterfaceC37503c;
import fi0.InterfaceC37504d;
import third.sdk.com.android.creator.IdsSupplier;
import third.sdk.oaid.OAIDException;

/* JADX INFO: renamed from: gi0.e */
/* JADX INFO: compiled from: FreemeImpl.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37954e implements InterfaceC37504d {

    /* JADX INFO: renamed from: a */
    public final Context f85368a;

    /* JADX INFO: renamed from: gi0.e$a */
    /* JADX INFO: compiled from: FreemeImpl.java */
    public class a implements ServiceConnectionC37962m.a {
        public a() {
        }

        @Override // gi0.ServiceConnectionC37962m.a
        /* JADX INFO: renamed from: a */
        public String mo85798a(IBinder iBinder) throws OAIDException, RemoteException {
            IdsSupplier idsSupplierAsInterface = IdsSupplier.Stub.asInterface(iBinder);
            if (idsSupplierAsInterface != null) {
                return idsSupplierAsInterface.getOAID();
            }
            throw new OAIDException("IdsSupplier is null");
        }
    }

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: a */
    public boolean mo84451a() {
        Context context = this.f85368a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.android.creator", 0) != null;
        } catch (Exception e11) {
            C37505e.m84453a(e11);
            return false;
        }
    }

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: b */
    public void mo84452b(InterfaceC37503c interfaceC37503c) {
        if (this.f85368a == null || interfaceC37503c == null) {
            return;
        }
        Intent intent = new Intent("android.service.action.msa");
        intent.setPackage("com.android.creator");
        ServiceConnectionC37962m.m85804a(this.f85368a, intent, interfaceC37503c, new a());
    }

    public C37954e(Context context) {
        this.f85368a = context;
    }
}
