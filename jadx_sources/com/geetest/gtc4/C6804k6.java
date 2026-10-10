package com.geetest.gtc4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.geetest.gtc4.k6 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6804k6 extends C6822m6 {

    /* JADX INFO: renamed from: c */
    public final Context f11419c;

    @Override // com.geetest.gtc4.C6822m6, com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public final boolean mo12620a() {
        Context context = this.f11419c;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.coloros.mcs", 0) != null;
        } catch (Exception unused) {
        }
    }

    public C6804k6(Context context) {
        super(context);
        this.f11419c = context;
    }

    @Override // com.geetest.gtc4.C6822m6, com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public final void mo12619a(C6783i3 c6783i3) {
        if (this.f11419c != null) {
            Intent intent = new Intent("action.com.oplus.stdid.ID_SERVICE");
            intent.setComponent(new ComponentName("com.coloros.mcs", "com.oplus.stdid.IdentifyService"));
            ServiceConnectionC6786i6.m12662a(this.f11419c, intent, c6783i3, new C6795j6(this));
        }
    }

    @Override // com.geetest.gtc4.C6822m6
    /* JADX INFO: renamed from: a */
    public final String mo12669a(IBinder iBinder, String str, String str2) {
        C6740d5 c6740d5;
        int i11 = AbstractBinderC6749e5.f11349a;
        if (iBinder == null) {
            c6740d5 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.oplus.stdid.IStdID");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof C6740d5)) {
                c6740d5 = (C6740d5) iInterfaceQueryLocalInterface;
            } else {
                c6740d5 = new C6740d5(iBinder);
            }
        }
        if (c6740d5 != null) {
            return c6740d5.mo12626a(str, str2);
        }
        throw new C6750e6("IStdID is null");
    }
}
