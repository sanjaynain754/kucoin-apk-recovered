package com.tencent.bugly.proguard;

import com.tencent.rmonitor.common.logger.Logger;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.f0 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33637f0 {

    /* JADX INFO: renamed from: a */
    public static final String f69792a = "RMonitor_config";

    /* JADX INFO: renamed from: a */
    public void m72974a(C33574c0 c33574c0) {
        C33553b0.m72375g().m72377a(c33574c0.m72630d());
        RunnableC33595d0.m72759b().m72763a(c33574c0.m72631e());
        m72975b(c33574c0);
        m72976c(c33574c0);
    }

    /* JADX INFO: renamed from: b */
    public final void m72975b(C33574c0 c33574c0) {
        try {
            if (c33574c0.m72632f()) {
                C34047z.b.f72583a.m75558c(true);
            } else {
                C34047z.b.f72583a.m75558c(false);
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77131e("RMonitor_config", C33799mf.m74131a("AppLaunchSampler, parseLaunchConfigInfo, t: ", th2));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m72976c(C33574c0 c33574c0) {
        try {
            C34047z c34047z = C34047z.b.f72583a;
            if (c33574c0.f70122g) {
                if (c33574c0.m72632f() && c34047z.m75552a()) {
                    c34047z.m75551a(false);
                    return;
                }
                if (c33574c0.m72632f()) {
                    c34047z.m75556b(false);
                }
                c34047z.m75551a(true);
                return;
            }
            c34047z.m75551a(false);
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77131e("RMonitor_config", C33799mf.m74131a("AppLaunchSampler, scheduleNextLaunchMonitor, t: ", th2));
        }
    }
}
