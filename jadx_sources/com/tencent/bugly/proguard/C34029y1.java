package com.tencent.bugly.proguard;

import android.content.Context;
import com.tencent.bugly.library.BuglyBuilder;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.manager.RMonitorLauncher;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.y1 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34029y1 {
    /* JADX INFO: renamed from: a */
    public static void m75473a(Context context, BuglyBuilder buglyBuilder) {
        if ("foreground".equals(buglyBuilder.initAppState) || "background".equals(buglyBuilder.initAppState)) {
            LifecycleCallback.initAppState(buglyBuilder.initAppState);
        }
        m75474b();
        m75472a();
        m75475c();
        C34018xa.m75452a(context, buglyBuilder.appId);
    }

    /* JADX INFO: renamed from: b */
    public static void m75474b() {
        Logger.INSTANCE.mo77134w(C34021xd.f72510a, "initJsonProtocol");
        C33808n3.m74208d(true);
    }

    /* JADX INFO: renamed from: c */
    public static void m75475c() {
        Logger.INSTANCE.mo77134w(C34021xd.f72510a, "initPluginFactory");
        RMonitorLauncher.INSTANCE.setPluginFactory(new C34021xd());
    }

    /* JADX INFO: renamed from: a */
    public static void m75472a() {
        Logger.INSTANCE.mo77134w(C34021xd.f72510a, "initConfig");
        C33970v2.b.f72311a.m75258a(new C33661g3());
        C33970v2.b.f72311a.m75258a(new C33836oa());
        C33970v2.b.f72311a.m75258a(new C33999wb());
        C33970v2.b.f72311a.m75258a(new C33746k4());
        C33970v2.b.f72311a.m75258a(new C33963uf());
        C33970v2.b.f72311a.m75258a(new C33807n2());
    }
}
