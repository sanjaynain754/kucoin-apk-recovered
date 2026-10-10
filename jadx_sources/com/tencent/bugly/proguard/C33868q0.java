package com.tencent.bugly.proguard;

import com.tencent.rmonitor.base.config.ConfigProxy;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.q0 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33868q0 {

    /* JADX INFO: renamed from: b */
    public boolean f71512b = false;

    /* JADX INFO: renamed from: a */
    public final C33805n0 f71511a = new C33805n0();

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.q0$a */
    /* JADX INFO: compiled from: BUGLY */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C33868q0 f71513a = new C33868q0();
    }

    /* JADX INFO: renamed from: a */
    public void m74636a(C33805n0 c33805n0) {
        this.f71511a.m74176a(c33805n0);
        this.f71512b = true;
    }

    /* JADX INFO: renamed from: b */
    public static C33868q0 m74634b() {
        return a.f71513a;
    }

    /* JADX INFO: renamed from: a */
    public void m74635a() {
        if (C33673gf.m73198a() && !this.f71512b) {
            AbstractC34022xe abstractC34022xeM77068b = ConfigProxy.INSTANCE.getConfig().m77068b(AbstractC34022xe.f72512c);
            if (abstractC34022xeM77068b instanceof C33805n0) {
                m74636a((C33805n0) abstractC34022xeM77068b);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m74637a(String str) {
        m74635a();
        return Math.random() < ((double) this.f71511a.m74175a(str));
    }
}
