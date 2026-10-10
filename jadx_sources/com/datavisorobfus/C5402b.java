package com.datavisorobfus;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.datavisor.vangogh.oaid.thirdparty.asus.msa.SupplementaryDID.IDidAidlInterface;

/* JADX INFO: renamed from: com.datavisorobfus.b */
/* JADX INFO: loaded from: classes34.dex */
public class C5402b implements InterfaceC5406c0 {

    /* JADX INFO: renamed from: a */
    private Context f7236a;

    /* JADX INFO: renamed from: com.datavisorobfus.b$a */
    public class a implements ServiceConnectionC5431m0.a {
        public a() {
        }

        @Override // com.datavisorobfus.ServiceConnectionC5431m0.a
        /* JADX INFO: renamed from: a */
        public String mo7112a(IBinder iBinder) {
            IDidAidlInterface iDidAidlInterfaceAsInterface = IDidAidlInterface.Stub.asInterface(iBinder);
            if (iDidAidlInterfaceAsInterface != null) {
                if (iDidAidlInterfaceAsInterface.isSupport()) {
                    return iDidAidlInterfaceAsInterface.getOAID();
                }
                throw new RuntimeException("IDidAidlInterface#isSupport return false");
            }
            throw new RuntimeException("IDidAidlInterface is null");
        }
    }

    @Override // com.datavisorobfus.InterfaceC5406c0
    /* JADX INFO: renamed from: a */
    public void mo7110a(InterfaceC5403b0 interfaceC5403b0) {
        Intent intent = new Intent("com.asus.msa.action.ACCESS_DID");
        intent.setComponent(new ComponentName("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService"));
        ServiceConnectionC5431m0.m7222a(this.f7236a, intent, interfaceC5403b0, new a());
    }

    @Override // com.datavisorobfus.InterfaceC5406c0
    /* JADX INFO: renamed from: a */
    public boolean mo7111a() {
        try {
            return this.f7236a.getPackageManager().getPackageInfo("com.asus.msa.SupplementaryDID", 0) != null;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return false;
        }
    }

    public C5402b(Context context) {
        this.f7236a = context;
    }
}
