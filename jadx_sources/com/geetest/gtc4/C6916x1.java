package com.geetest.gtc4;

import android.app.KeyguardManager;
import android.content.Context;
import java.util.Objects;

/* JADX INFO: renamed from: com.geetest.gtc4.x1 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6916x1 implements InterfaceC6919x4 {

    /* JADX INFO: renamed from: a */
    public final Context f11548a;

    /* JADX INFO: renamed from: b */
    public final KeyguardManager f11549b;

    @Override // com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public final boolean mo12620a() {
        KeyguardManager keyguardManager;
        if (this.f11548a == null || (keyguardManager = this.f11549b) == null) {
            return false;
        }
        try {
            Object objInvoke = keyguardManager.getClass().getDeclaredMethod("isSupported", null).invoke(this.f11549b, null);
            Objects.requireNonNull(objInvoke);
            return ((Boolean) objInvoke).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public C6916x1(Context context) {
        this.f11548a = context;
        this.f11549b = (KeyguardManager) context.getSystemService("keyguard");
    }

    @Override // com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public final void mo12619a(C6783i3 c6783i3) {
        if (this.f11548a != null) {
            KeyguardManager keyguardManager = this.f11549b;
            if (keyguardManager == null) {
                new C6750e6("KeyguardManager not found");
                c6783i3.f11392b.countDown();
                return;
            }
            try {
                Object objInvoke = keyguardManager.getClass().getDeclaredMethod("obtainOaid", null).invoke(this.f11549b, null);
                if (objInvoke != null) {
                    c6783i3.f11391a.set(objInvoke.toString());
                    c6783i3.f11392b.countDown();
                    return;
                }
                throw new C6750e6("OAID obtain failed");
            } catch (Exception unused) {
            }
        }
    }
}
