package com.datavisorobfus;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: renamed from: com.datavisorobfus.b1 */
/* JADX INFO: loaded from: classes34.dex */
public class C5404b1 implements InterfaceC5406c0 {

    /* JADX INFO: renamed from: a */
    private Context f7238a;

    /* JADX INFO: renamed from: b */
    private Class<?> f7239b;

    /* JADX INFO: renamed from: c */
    private Object f7240c;

    @Override // com.datavisorobfus.InterfaceC5406c0
    /* JADX INFO: renamed from: a */
    public void mo7110a(InterfaceC5403b0 interfaceC5403b0) {
        try {
            String str = (String) this.f7239b.getMethod("getOAID", Context.class).invoke(this.f7240c, this.f7238a);
            if (C5457z0.m7480a(str)) {
                str = "empty";
            }
            if (interfaceC5403b0 != null) {
                try {
                    interfaceC5403b0.mo7113a(str);
                } catch (Throwable th2) {
                    C5415f0.m7139a(th2);
                }
            }
        } catch (Throwable th3) {
            C5415f0.m7139a(th3);
            if (interfaceC5403b0 != null) {
                try {
                    interfaceC5403b0.mo7113a("empty");
                } catch (Throwable th4) {
                    C5415f0.m7139a(th4);
                }
            }
        }
    }

    @Override // com.datavisorobfus.InterfaceC5406c0
    /* JADX INFO: renamed from: a */
    public boolean mo7111a() {
        return (this.f7240c == null || this.f7239b == null) ? false : true;
    }

    @SuppressLint({"PrivateApi"})
    public C5404b1(Context context) {
        this.f7238a = context;
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            this.f7239b = cls;
            this.f7240c = cls.newInstance();
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
        }
    }
}
