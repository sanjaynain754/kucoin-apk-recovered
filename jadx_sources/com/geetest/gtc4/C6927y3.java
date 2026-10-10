package com.geetest.gtc4;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.geetest.gtc4.y3 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6927y3 implements InterfaceC6919x4 {

    /* JADX INFO: renamed from: a */
    public final Context f11560a;

    @Override // com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public final boolean mo12620a() {
        Context context = this.f11560a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.android.vending", 0) != null;
        } catch (Exception unused) {
        }
    }

    public C6927y3(Context context) {
        this.f11560a = context;
    }

    @Override // com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public final void mo12619a(C6783i3 c6783i3) {
        if (this.f11560a != null) {
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            ServiceConnectionC6786i6.m12662a(this.f11560a, intent, c6783i3, new C6918x3());
        }
    }
}
