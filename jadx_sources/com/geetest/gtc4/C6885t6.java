package com.geetest.gtc4;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.geetest.gtc4.t6 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6885t6 implements InterfaceC6919x4 {

    /* JADX INFO: renamed from: a */
    public final Context f11519a;

    @Override // com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public final boolean mo12620a() {
        Context context = this.f11519a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.samsung.android.deviceidservice", 0) != null;
        } catch (Exception unused) {
        }
    }

    public C6885t6(Context context) {
        this.f11519a = context;
    }

    @Override // com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public final void mo12619a(C6783i3 c6783i3) {
        if (this.f11519a != null) {
            Intent intent = new Intent();
            intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
            ServiceConnectionC6786i6.m12662a(this.f11519a, intent, c6783i3, new C6876s6());
        }
    }
}
