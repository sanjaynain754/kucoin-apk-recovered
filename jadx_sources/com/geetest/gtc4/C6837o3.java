package com.geetest.gtc4;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.geetest.gtc4.o3 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6837o3 implements InterfaceC6919x4 {

    /* JADX INFO: renamed from: a */
    public final Context f11448a;

    @Override // com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public final boolean mo12620a() {
        Context context = this.f11448a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.android.creator", 0) != null;
        } catch (Exception unused) {
        }
    }

    public C6837o3(Context context) {
        this.f11448a = context;
    }

    @Override // com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public final void mo12619a(C6783i3 c6783i3) {
        if (this.f11448a != null) {
            Intent intent = new Intent("android.service.action.msa");
            intent.setPackage("com.android.creator");
            ServiceConnectionC6786i6.m12662a(this.f11448a, intent, c6783i3, new C6828n3());
        }
    }
}
