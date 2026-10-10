package com.tencent.bugly.proguard;

import android.util.Log;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.manager.RMonitorLauncher;
import com.tencent.rmonitor.sla.C35185b;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.mb */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33795mb {

    /* JADX INFO: renamed from: a */
    public static final String f70950a = "RMonitor_Magnifier";

    /* JADX INFO: renamed from: b */
    public static final int f70951b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f70952c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f70953d = 3;

    /* JADX INFO: renamed from: e */
    public static final int f70954e = 4;

    /* JADX INFO: renamed from: f */
    public static volatile boolean f70955f;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.mb$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f70956b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ List f70957c;

        public a(int i11, List list) {
            this.f70956b = i11;
            this.f70957c = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                int i11 = this.f70956b;
                if (i11 == 1) {
                    RMonitorLauncher rMonitorLauncher = RMonitorLauncher.INSTANCE;
                    rMonitorLauncher.preLaunch();
                    rMonitorLauncher.launch(this.f70957c);
                } else if (i11 == 2) {
                    RMonitorLauncher.INSTANCE.stop(this.f70957c);
                } else if (i11 == 3) {
                    RMonitorLauncher.INSTANCE.abolish();
                } else if (i11 == 4) {
                    RMonitorLauncher.INSTANCE.stopDisabledPlugins();
                }
            } catch (Throwable th2) {
                Log.e(C33795mb.f70950a, "fail for " + th2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static QAPMMonitorPlugin m74112a(String str, boolean z11) {
        C35185b.c.f75333a.m77225a();
        QAPMMonitorPlugin plugin = RMonitorLauncher.INSTANCE.getPlugin(str, z11);
        C35185b.c.f75333a.m77232h();
        return plugin;
    }

    /* JADX INFO: renamed from: b */
    public static void m74117b(List<String> list) {
        if (!C33673gf.m73198a()) {
            Logger.INSTANCE.mo77131e(f70950a, "stopMonitors fail app: " + BaseInfo.app + ", userMeta: " + BaseInfo.userMeta);
            return;
        }
        if (RMonitorLauncher.INSTANCE.checkSomeDesiredPluginStarted(list)) {
            m74114a(2, list);
            return;
        }
        Logger.INSTANCE.mo77132i(f70950a, "stopMonitors, no monitor started for " + list.toString());
    }

    /* JADX INFO: renamed from: a */
    public static void m74115a(List<String> list) {
        if (C33673gf.m73198a()) {
            if (f70955f && RMonitorLauncher.INSTANCE.checkAllDesiredPluginStarted(list)) {
                Logger.INSTANCE.mo77132i(f70950a, "startMonitors, " + list.toString() + " has started yet.");
                return;
            }
            if (!f70955f) {
                f70955f = true;
            }
            m74114a(1, list);
            return;
        }
        Logger.INSTANCE.mo77131e(f70950a, String.format(Locale.getDefault(), "startMonitors fail, app: %s, userMeta: %s", BaseInfo.app, BaseInfo.userMeta));
    }

    /* JADX INFO: renamed from: b */
    public static void m74116b() {
        if (C33673gf.m73198a()) {
            m74114a(4, (List<String>) null);
            return;
        }
        Logger.INSTANCE.mo77131e(f70950a, "stopDisabledPlugins fail for [app: " + BaseInfo.app + ", userMeta: " + BaseInfo.userMeta + "]");
    }

    /* JADX INFO: renamed from: a */
    public static void m74113a() {
        if (C33673gf.m73198a()) {
            m74114a(3, (List<String>) null);
            return;
        }
        Logger.INSTANCE.mo77131e(f70950a, "abolish fail, app: " + BaseInfo.app + ", userMeta: " + BaseInfo.userMeta);
    }

    /* JADX INFO: renamed from: a */
    public static void m74114a(int i11, List<String> list) {
        ThreadManager.runInMonitorThread(new a(i11, list), 0L);
    }
}
