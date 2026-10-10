package com.tencent.bugly.proguard;

import android.os.Looper;
import com.tencent.bugly.common.looper.LooperDispatchWatcher;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.t */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33927t {

    /* JADX INFO: renamed from: c */
    public static C33927t f72018c;

    /* JADX INFO: renamed from: d */
    public static Object f72019d = new Object();

    /* JADX INFO: renamed from: a */
    public C33920sc f72020a = new C33920sc(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public boolean f72021b = false;

    /* JADX INFO: renamed from: a */
    public static C33927t m75008a() {
        if (f72018c == null) {
            synchronized (f72019d) {
                try {
                    if (f72018c == null) {
                        f72018c = new C33927t();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f72018c;
    }

    /* JADX INFO: renamed from: b */
    public C33920sc m75010b() {
        return this.f72020a;
    }

    /* JADX INFO: renamed from: c */
    public boolean m75011c() {
        return this.f72021b;
    }

    /* JADX INFO: renamed from: a */
    public void m75009a(boolean z11) {
        if (z11) {
            LooperDispatchWatcher.INSTANCE.register(Looper.getMainLooper(), this.f72020a);
            this.f72021b = true;
        } else {
            LooperDispatchWatcher.INSTANCE.unregister(Looper.getMainLooper(), this.f72020a);
            this.f72021b = false;
        }
    }
}
