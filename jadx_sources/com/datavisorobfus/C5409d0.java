package com.datavisorobfus;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.datavisor.vangogh.oaid.thirdparty.zui.deviceidservice.IDeviceidInterface;

/* JADX INFO: renamed from: com.datavisorobfus.d0 */
/* JADX INFO: loaded from: classes34.dex */
public class C5409d0 implements InterfaceC5406c0 {

    /* JADX INFO: renamed from: a */
    private Context f7245a;

    /* JADX INFO: renamed from: com.datavisorobfus.d0$a */
    public class a implements ServiceConnectionC5431m0.a {
        public a() {
        }

        @Override // com.datavisorobfus.ServiceConnectionC5431m0.a
        /* JADX INFO: renamed from: a */
        public String mo7112a(IBinder iBinder) {
            IDeviceidInterface iDeviceidInterfaceAsInterface = IDeviceidInterface.Stub.asInterface(iBinder);
            if (iDeviceidInterfaceAsInterface != null) {
                if (iDeviceidInterfaceAsInterface.isSupport()) {
                    return iDeviceidInterfaceAsInterface.getOAID();
                }
                throw new RuntimeException("IDeviceidInterface#isSupport return false");
            }
            throw new RuntimeException("IDeviceidInterface is null");
        }
    }

    @Override // com.datavisorobfus.InterfaceC5406c0
    /* JADX INFO: renamed from: a */
    public void mo7110a(InterfaceC5403b0 interfaceC5403b0) {
        Intent intent = new Intent();
        intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
        ServiceConnectionC5431m0.m7222a(this.f7245a, intent, interfaceC5403b0, new a());
    }

    @Override // com.datavisorobfus.InterfaceC5406c0
    /* JADX INFO: renamed from: a */
    public boolean mo7111a() {
        try {
            return this.f7245a.getPackageManager().getPackageInfo("com.zui.deviceidservice", 0) != null;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return false;
        }
    }

    public C5409d0(Context context) {
        this.f7245a = context;
    }
}
