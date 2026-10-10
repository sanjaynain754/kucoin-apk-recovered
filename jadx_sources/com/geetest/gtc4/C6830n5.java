package com.geetest.gtc4;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.geetest.gtc4.n5 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6830n5 implements InterfaceC6919x4 {

    /* JADX INFO: renamed from: a */
    public final Context f11443a;

    @Override // com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public final boolean mo12620a() {
        Context context = this.f11443a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.zui.deviceidservice", 0) != null;
        } catch (Exception unused) {
        }
    }

    public C6830n5(Context context) {
        this.f11443a = context;
    }

    @Override // com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public final void mo12619a(C6783i3 c6783i3) {
        if (this.f11443a != null) {
            Intent intent = new Intent();
            intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
            ServiceConnectionC6786i6.m12662a(this.f11443a, intent, c6783i3, new C6821m5());
        }
    }
}
