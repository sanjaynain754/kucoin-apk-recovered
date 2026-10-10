package com.datavisorobfus;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.provider.Settings;
import com.datavisor.vangogh.oaid.thirdparty.uodis.opendevice.aidl.OpenDeviceIdentifierService;

/* JADX INFO: renamed from: com.datavisorobfus.z */
/* JADX INFO: loaded from: classes34.dex */
public class C5456z implements InterfaceC5406c0 {

    /* JADX INFO: renamed from: a */
    private Context f7422a;

    /* JADX INFO: renamed from: b */
    private String f7423b;

    /* JADX INFO: renamed from: com.datavisorobfus.z$a */
    public class a implements ServiceConnectionC5431m0.a {
        public a() {
        }

        @Override // com.datavisorobfus.ServiceConnectionC5431m0.a
        /* JADX INFO: renamed from: a */
        public String mo7112a(IBinder iBinder) {
            OpenDeviceIdentifierService openDeviceIdentifierServiceAsInterface = OpenDeviceIdentifierService.Stub.asInterface(iBinder);
            if (!openDeviceIdentifierServiceAsInterface.isOaidTrackLimited()) {
                return openDeviceIdentifierServiceAsInterface.getOaid();
            }
            throw new RuntimeException("Huawei OAID disabled");
        }
    }

    @Override // com.datavisorobfus.InterfaceC5406c0
    /* JADX INFO: renamed from: a */
    public void mo7110a(InterfaceC5403b0 interfaceC5403b0) {
        try {
            String string = Settings.Global.getString(this.f7422a.getContentResolver(), "pps_oaid");
            if (C5457z0.m7482b(string)) {
                try {
                    interfaceC5403b0.mo7113a(string);
                    return;
                } catch (Throwable th2) {
                    C5415f0.m7139a(th2);
                    return;
                }
            }
        } catch (Throwable th3) {
            C5415f0.m7139a(th3);
        }
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage(this.f7423b);
        ServiceConnectionC5431m0.m7222a(this.f7422a, intent, interfaceC5403b0, new a());
    }

    @Override // com.datavisorobfus.InterfaceC5406c0
    /* JADX INFO: renamed from: a */
    public boolean mo7111a() {
        String str = "com.huawei.hms";
        try {
            PackageManager packageManager = this.f7422a.getPackageManager();
            if (packageManager.getPackageInfo("com.huawei.hwid", 0) != null) {
                str = "com.huawei.hwid";
            } else if (packageManager.getPackageInfo("com.huawei.hwid.tv", 0) != null) {
                str = "com.huawei.hwid.tv";
            } else if (packageManager.getPackageInfo("com.huawei.hms", 0) == null) {
                this.f7423b = "";
                return false;
            }
            this.f7423b = str;
            return true;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return false;
        }
    }

    public C5456z(Context context) {
        this.f7422a = context;
    }
}
