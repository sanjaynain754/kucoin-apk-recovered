package gi0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import android.provider.Settings;
import android.text.TextUtils;
import fi0.C37505e;
import fi0.InterfaceC37503c;
import fi0.InterfaceC37504d;
import third.sdk.com.uodis.opendevice.aidl.OpenDeviceIdentifierService;
import third.sdk.oaid.OAIDException;

/* JADX INFO: renamed from: gi0.g */
/* JADX INFO: compiled from: HuaweiImpl.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37956g implements InterfaceC37504d {

    /* JADX INFO: renamed from: a */
    public final Context f85372a;

    /* JADX INFO: renamed from: b */
    public String f85373b;

    /* JADX INFO: renamed from: gi0.g$a */
    /* JADX INFO: compiled from: HuaweiImpl.java */
    public class a implements ServiceConnectionC37962m.a {
        public a() {
        }

        @Override // gi0.ServiceConnectionC37962m.a
        /* JADX INFO: renamed from: a */
        public String mo85798a(IBinder iBinder) throws OAIDException, RemoteException {
            OpenDeviceIdentifierService openDeviceIdentifierServiceAsInterface = OpenDeviceIdentifierService.Stub.asInterface(iBinder);
            if (!openDeviceIdentifierServiceAsInterface.isOaidTrackLimited()) {
                return openDeviceIdentifierServiceAsInterface.getOaid();
            }
            throw new OAIDException("User has disabled advertising identifier");
        }
    }

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: a */
    public boolean mo84451a() {
        Context context = this.f85372a;
        if (context == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager.getPackageInfo("com.huawei.hwid", 0) != null) {
                this.f85373b = "com.huawei.hwid";
                return true;
            }
            if (packageManager.getPackageInfo("com.huawei.hwid.tv", 0) != null) {
                this.f85373b = "com.huawei.hwid.tv";
                return true;
            }
            this.f85373b = "com.huawei.hms";
            return packageManager.getPackageInfo("com.huawei.hms", 0) != null;
        } catch (Exception e11) {
            C37505e.m84453a(e11);
            return false;
        }
    }

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: b */
    public void mo84452b(InterfaceC37503c interfaceC37503c) {
        Context context = this.f85372a;
        if (context == null || interfaceC37503c == null) {
            return;
        }
        try {
            String string = Settings.Global.getString(context.getContentResolver(), "pps_oaid");
            if (!TextUtils.isEmpty(string)) {
                C37505e.m84453a("Get oaid from global settings: " + string);
                interfaceC37503c.mo84443a(string);
                return;
            }
        } catch (Exception e11) {
            C37505e.m84453a(e11);
        }
        if (TextUtils.isEmpty(this.f85373b) && !mo84451a()) {
            interfaceC37503c.mo84444b(new OAIDException("Huawei Advertising ID not available"));
            return;
        }
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage(this.f85373b);
        ServiceConnectionC37962m.m85804a(this.f85372a, intent, interfaceC37503c, new a());
    }

    public C37956g(Context context) {
        this.f85372a = context;
    }
}
