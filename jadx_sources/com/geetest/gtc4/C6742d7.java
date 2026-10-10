package com.geetest.gtc4;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Base64;

/* JADX INFO: renamed from: com.geetest.gtc4.d7 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6742d7 {
    /* JADX INFO: renamed from: a */
    public static String m12627a(IBinder iBinder) {
        InterfaceC6731c5 c6713a5;
        try {
            int i11 = AbstractBinderC6722b5.f11320a;
            if (iBinder == null) {
                c6713a5 = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.tencent.soter.soterserver.ISoterService");
                c6713a5 = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6731c5)) ? new C6713a5(iBinder) : (InterfaceC6731c5) iInterfaceQueryLocalInterface;
            }
            return Base64.encodeToString(((C6713a5) c6713a5).m12603a().f11494b, 0).trim();
        } catch (Exception unused) {
            return "";
        }
    }
}
