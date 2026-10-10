package com.geetest.gtc4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.geetest.gtc4.s0 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6870s0 implements InterfaceC6919x4 {

    /* JADX INFO: renamed from: a */
    public final Context f11488a;

    @Override // com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public final boolean mo12620a() {
        Context context = this.f11488a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.asus.msa.SupplementaryDID", 0) != null;
        } catch (Exception unused) {
        }
    }

    public C6870s0(Context context) {
        this.f11488a = context;
    }

    @Override // com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public final void mo12619a(C6783i3 c6783i3) {
        if (this.f11488a != null) {
            Intent intent = new Intent("com.asus.msa.action.ACCESS_DID");
            intent.setComponent(new ComponentName("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService"));
            ServiceConnectionC6786i6.m12662a(this.f11488a, intent, c6783i3, new C6861r0());
        }
    }
}
