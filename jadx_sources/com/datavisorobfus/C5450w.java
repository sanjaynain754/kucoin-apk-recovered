package com.datavisorobfus;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.datavisor.vangogh.oaid.thirdparty.google.android.gms.ads.identifier.internal.IAdvertisingIdService;

/* JADX INFO: renamed from: com.datavisorobfus.w */
/* JADX INFO: loaded from: classes34.dex */
public class C5450w implements InterfaceC5406c0 {

    /* JADX INFO: renamed from: a */
    private Context f7389a;

    /* JADX INFO: renamed from: com.datavisorobfus.w$a */
    public class a implements ServiceConnectionC5431m0.a {
        public a() {
        }

        @Override // com.datavisorobfus.ServiceConnectionC5431m0.a
        /* JADX INFO: renamed from: a */
        public String mo7112a(IBinder iBinder) {
            IAdvertisingIdService iAdvertisingIdServiceAsInterface = IAdvertisingIdService.Stub.asInterface(iBinder);
            if (iAdvertisingIdServiceAsInterface != null) {
                if (iAdvertisingIdServiceAsInterface.isLimitAdTrackingEnabled(true)) {
                    C5415f0.m7136a("isLimitAdTrackingEnabled isLimitAdTrackingEnabled isLimitAdTrackingEnabled");
                }
                return iAdvertisingIdServiceAsInterface.getId();
            }
            throw new RuntimeException("IAdvertisingIdService is null");
        }
    }

    @Override // com.datavisorobfus.InterfaceC5406c0
    /* JADX INFO: renamed from: a */
    public void mo7110a(InterfaceC5403b0 interfaceC5403b0) {
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        ServiceConnectionC5431m0.m7222a(this.f7389a, intent, interfaceC5403b0, new a());
    }

    @Override // com.datavisorobfus.InterfaceC5406c0
    /* JADX INFO: renamed from: a */
    public boolean mo7111a() {
        try {
            return this.f7389a.getPackageManager().getPackageInfo("com.android.vending", 0) != null;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return false;
        }
    }

    public C5450w(Context context) {
        this.f7389a = context;
    }
}
