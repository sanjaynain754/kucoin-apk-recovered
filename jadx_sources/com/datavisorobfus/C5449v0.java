package com.datavisorobfus;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.datavisor.vangogh.oaid.thirdparty.samsung.android.deviceidservice.IDeviceIdService;

/* JADX INFO: renamed from: com.datavisorobfus.v0 */
/* JADX INFO: loaded from: classes34.dex */
public class C5449v0 implements InterfaceC5406c0 {

    /* JADX INFO: renamed from: a */
    private Context f7387a;

    /* JADX INFO: renamed from: com.datavisorobfus.v0$a */
    public class a implements ServiceConnectionC5431m0.a {
        public a() {
        }

        @Override // com.datavisorobfus.ServiceConnectionC5431m0.a
        /* JADX INFO: renamed from: a */
        public String mo7112a(IBinder iBinder) {
            IDeviceIdService iDeviceIdServiceAsInterface = IDeviceIdService.Stub.asInterface(iBinder);
            if (iDeviceIdServiceAsInterface != null) {
                return iDeviceIdServiceAsInterface.getOAID();
            }
            throw new RuntimeException("IDeviceIdService is null");
        }
    }

    @Override // com.datavisorobfus.InterfaceC5406c0
    /* JADX INFO: renamed from: a */
    public void mo7110a(InterfaceC5403b0 interfaceC5403b0) {
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        ServiceConnectionC5431m0.m7222a(this.f7387a, intent, interfaceC5403b0, new a());
    }

    @Override // com.datavisorobfus.InterfaceC5406c0
    /* JADX INFO: renamed from: a */
    public boolean mo7111a() {
        try {
            return this.f7387a.getPackageManager().getPackageInfo("com.samsung.android.deviceidservice", 0) != null;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return false;
        }
    }

    public C5449v0(Context context) {
        this.f7387a = context;
    }
}
