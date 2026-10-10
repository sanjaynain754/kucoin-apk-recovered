package com.geetest.gtc4;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import java.security.MessageDigest;

/* JADX INFO: renamed from: com.geetest.gtc4.m6 */
/* JADX INFO: loaded from: classes45.dex */
public class C6822m6 implements InterfaceC6919x4 {

    /* JADX INFO: renamed from: a */
    public final Context f11437a;

    /* JADX INFO: renamed from: b */
    public String f11438b;

    @Override // com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public boolean mo12620a() {
        Context context = this.f11437a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.heytap.openid", 0) != null;
        } catch (Exception unused) {
        }
    }

    public C6822m6(Context context) {
        if (context instanceof Application) {
            this.f11437a = context;
        } else {
            this.f11437a = context.getApplicationContext();
        }
    }

    @Override // com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public void mo12619a(C6783i3 c6783i3) {
        if (this.f11437a != null) {
            Intent intent = new Intent("action.com.heytap.openid.OPEN_ID_SERVICE");
            intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
            ServiceConnectionC6786i6.m12662a(this.f11437a, intent, c6783i3, new C6813l6(this));
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m12684a(IBinder iBinder) {
        String packageName = this.f11437a.getPackageName();
        String str = this.f11438b;
        if (str == null) {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(this.f11437a.getPackageManager().getPackageInfo(packageName, 64).signatures[0].toByteArray());
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : bArrDigest) {
                sb2.append(Integer.toHexString((b11 & 255) | 256).substring(1, 3));
            }
            String string = sb2.toString();
            this.f11438b = string;
            return mo12669a(iBinder, packageName, string);
        }
        return mo12669a(iBinder, packageName, str);
    }

    /* JADX INFO: renamed from: a */
    public String mo12669a(IBinder iBinder, String str, String str2) {
        InterfaceC6936z4 c6928y4;
        int i11 = AbstractBinderC6749e5.f11349a;
        if (iBinder == null) {
            c6928y4 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC6936z4)) {
                c6928y4 = (InterfaceC6936z4) iInterfaceQueryLocalInterface;
            } else {
                c6928y4 = new C6928y4(iBinder);
            }
        }
        if (c6928y4 != null) {
            return c6928y4.mo12626a(str, str2);
        }
        throw new C6750e6("IOpenID is null");
    }
}
