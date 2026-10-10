package com.geetest.gtc4;

import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: renamed from: com.geetest.gtc4.x5 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6920x5 implements InterfaceC6919x4 {

    /* JADX INFO: renamed from: a */
    public final Context f11552a;

    @Override // com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public final boolean mo12620a() {
        Context context = this.f11552a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.mdid.msa", 0) != null;
        } catch (Exception unused) {
        }
    }

    public C6920x5(Context context) {
        this.f11552a = context;
    }

    @Override // com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public final void mo12619a(C6783i3 c6783i3) {
        if (this.f11552a != null) {
            try {
                Intent intent = new Intent("com.bun.msa.action.start.service");
                intent.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaKlService");
                intent.putExtra("com.bun.msa.param.pkgname", this.f11552a.getPackageName());
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f11552a.startForegroundService(intent);
                } else {
                    this.f11552a.startService(intent);
                }
            } catch (Exception unused) {
            }
            Intent intent2 = new Intent("com.bun.msa.action.bindto.service");
            intent2.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaIdService");
            intent2.putExtra("com.bun.msa.param.pkgname", this.f11552a.getPackageName());
            ServiceConnectionC6786i6.m12662a(this.f11552a, intent2, c6783i3, new C6911w5());
        }
    }
}
