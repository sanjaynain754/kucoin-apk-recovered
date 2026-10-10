package com.datavisorobfus;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.datavisor.vangogh.oaid.thirdparty.heytap.openid.IOpenID;
import java.security.MessageDigest;

/* JADX INFO: renamed from: com.datavisorobfus.n0 */
/* JADX INFO: loaded from: classes34.dex */
public class C5433n0 implements InterfaceC5406c0 {

    /* JADX INFO: renamed from: a */
    private Context f7332a;

    /* JADX INFO: renamed from: b */
    private String f7333b = null;

    /* JADX INFO: renamed from: com.datavisorobfus.n0$a */
    public class a implements ServiceConnectionC5431m0.a {
        public a() {
        }

        @Override // com.datavisorobfus.ServiceConnectionC5431m0.a
        /* JADX INFO: renamed from: a */
        public String mo7112a(IBinder iBinder) {
            String packageName = C5433n0.this.f7332a.getPackageName();
            if (C5433n0.this.f7333b == null) {
                try {
                    byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(C5433n0.this.f7332a.getPackageManager().getPackageInfo(packageName, 64).signatures[0].toByteArray());
                    StringBuilder sb2 = new StringBuilder();
                    for (byte b11 : bArrDigest) {
                        sb2.append(Integer.toHexString((b11 & 255) | 256).substring(1, 3));
                    }
                    C5433n0.this.f7333b = sb2.toString();
                } catch (Throwable th2) {
                    C5415f0.m7139a(th2);
                }
            }
            if (C5433n0.this.f7333b == null) {
                throw new RuntimeException("sign is empty");
            }
            C5433n0 c5433n0 = C5433n0.this;
            return c5433n0.m7235a(iBinder, packageName, c5433n0.f7333b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public String m7235a(IBinder iBinder, String str, String str2) {
        IOpenID iOpenIDAsInterface = IOpenID.Stub.asInterface(iBinder);
        if (iOpenIDAsInterface != null) {
            return iOpenIDAsInterface.getSerID(str, str2, "OUID");
        }
        throw new RuntimeException("getSerId null");
    }

    public C5433n0(Context context) {
        this.f7332a = context;
    }

    @Override // com.datavisorobfus.InterfaceC5406c0
    /* JADX INFO: renamed from: a */
    public void mo7110a(InterfaceC5403b0 interfaceC5403b0) {
        Intent intent = new Intent("action.com.heytap.openid.OPEN_ID_SERVICE");
        intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
        ServiceConnectionC5431m0.m7222a(this.f7332a, intent, interfaceC5403b0, new a());
    }

    @Override // com.datavisorobfus.InterfaceC5406c0
    /* JADX INFO: renamed from: a */
    public boolean mo7111a() {
        try {
            return this.f7332a.getPackageManager().getPackageInfo("com.heytap.openid", 0) != null;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return false;
        }
    }
}
