package com.tencent.bugly.proguard;

import com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin;
import com.tencent.rmonitor.base.reporter.ReporterMachine;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.gc */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33670gc extends QAPMMonitorPlugin {

    /* JADX INFO: renamed from: b */
    public static boolean f69968b;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.gc$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C33879qb.m74680a().m74684b();
        }
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void start() {
        if (f69968b) {
            return;
        }
        f69968b = true;
        ReporterMachine.INSTANCE.post(new a());
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void stop() {
    }
}
