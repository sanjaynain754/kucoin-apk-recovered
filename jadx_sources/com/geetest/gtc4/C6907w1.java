package com.geetest.gtc4;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.geetest.gtc4.w1 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6907w1 implements InterfaceC6919x4 {

    /* JADX INFO: renamed from: a */
    public final Context f11541a;

    @Override // com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public final boolean mo12620a() {
        Context context = this.f11541a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.coolpad.deviceidsupport", 0) != null;
        } catch (Exception unused) {
        }
    }

    public C6907w1(Context context) {
        if (context instanceof Application) {
            this.f11541a = context;
        } else {
            this.f11541a = context.getApplicationContext();
        }
    }

    @Override // com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public final void mo12619a(C6783i3 c6783i3) {
        if (this.f11541a != null) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.coolpad.deviceidsupport", "com.coolpad.deviceidsupport.DeviceIdService"));
            ServiceConnectionC6786i6.m12662a(this.f11541a, intent, c6783i3, new C6898v1(this));
        }
    }
}
