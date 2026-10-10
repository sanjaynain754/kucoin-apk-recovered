package com.geetest.gtc4;

import android.content.Context;

/* JADX INFO: renamed from: com.geetest.gtc4.x7 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6922x7 implements InterfaceC6919x4 {

    /* JADX INFO: renamed from: a */
    public final Context f11553a;

    /* JADX INFO: renamed from: b */
    public final Class f11554b;

    /* JADX INFO: renamed from: c */
    public final Object f11555c;

    @Override // com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public final boolean mo12620a() {
        return this.f11555c != null;
    }

    @Override // com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public final void mo12619a(C6783i3 c6783i3) {
        if (this.f11553a != null) {
            Class cls = this.f11554b;
            if (cls == null || this.f11555c == null) {
                new C6750e6("Xiaomi IdProvider not exists");
                c6783i3.f11392b.countDown();
                return;
            }
            try {
                String str = (String) cls.getMethod("getOAID", Context.class).invoke(this.f11555c, this.f11553a);
                if (str == null || str.isEmpty()) {
                    throw new C6750e6("OAID query failed");
                }
                c6783i3.f11391a.set(str);
                c6783i3.f11392b.countDown();
            } catch (Exception unused) {
                c6783i3.f11392b.countDown();
            }
        }
    }

    public C6922x7(Context context) {
        this.f11553a = context;
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            this.f11554b = cls;
            this.f11555c = cls.newInstance();
        } catch (Exception unused) {
        }
    }
}
