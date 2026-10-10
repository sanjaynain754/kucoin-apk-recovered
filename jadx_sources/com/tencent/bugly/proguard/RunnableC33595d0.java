package com.tencent.bugly.proguard;

import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.plugin.monitor.PluginController;
import com.tencent.rmonitor.base.reporter.ReporterMachine;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.sla.C35186c;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.d0 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class RunnableC33595d0 implements Runnable {

    /* JADX INFO: renamed from: e */
    public static RunnableC33595d0 f69477e = null;

    /* JADX INFO: renamed from: f */
    public static final String f69478f = "RMonitor_launch_report";

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList<C33616e0> f69479b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList<a> f69480c = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: d */
    public boolean f69481d = false;

    /* JADX INFO: renamed from: b */
    public static RunnableC33595d0 m72759b() {
        if (f69477e == null) {
            synchronized (RunnableC33595d0.class) {
                try {
                    if (f69477e == null) {
                        f69477e = new RunnableC33595d0();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f69477e;
    }

    /* JADX INFO: renamed from: a */
    public void m72763a(boolean z11) {
        this.f69481d = z11;
        Logger.INSTANCE.mo77132i(f69478f, "disableReportPreLaunch: " + this.f69481d);
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.d0$a */
    /* JADX INFO: compiled from: BUGLY */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f69482a;

        /* JADX INFO: renamed from: b */
        public String f69483b;

        public a(String str, String str2) {
            this.f69482a = str;
            this.f69483b = str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m72762a(String str, String str2) {
        this.f69480c.add(new a(str, str2));
        m72760a();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!C33673gf.m73198a()) {
            Logger.INSTANCE.mo77131e(f69478f, "launch report fail for ", C33673gf.m73203d());
            return;
        }
        PluginController pluginController = PluginController.INSTANCE;
        if (!pluginController.canCollect("launch_metric")) {
            Logger.INSTANCE.mo77132i(f69478f, "launch report fail for reach limit.");
            return;
        }
        if (!pluginController.whetherPluginSampling("launch_metric")) {
            Logger.INSTANCE.mo77132i(f69478f, "launch report fail for disabled. ");
            return;
        }
        Iterator<C33616e0> it = this.f69479b.iterator();
        while (it.hasNext()) {
            m72761a(it.next());
        }
        this.f69479b.clear();
        for (a aVar : this.f69480c) {
            C35186c.m77234a(InterfaceC33617e1.f69659h, "launch_metric", aVar.f69482a, C33820nf.m74300a(BaseInfo.userMeta), aVar.f69483b);
        }
        this.f69480c.clear();
    }

    /* JADX INFO: renamed from: a */
    public void m72760a() {
        ReporterMachine.INSTANCE.post(this);
    }

    /* JADX INFO: renamed from: a */
    public void m72761a(C33616e0 c33616e0) {
        c33616e0.m72877a();
        if (c33616e0.m72881c() && this.f69481d) {
            Logger.INSTANCE.mo77132i(f69478f, "launch report fail for pre launch and disabled.");
            return;
        }
        ReportData reportData = new ReportData(BaseInfo.userMeta.uin, 1, "launch_metric", c33616e0.m72883e());
        C34011x3.a.f72491a.m75425a(true, reportData);
        ReporterMachine.INSTANCE.reportNow(reportData, null);
    }

    /* JADX INFO: renamed from: b */
    public void m72764b(C33616e0 c33616e0) {
        this.f69479b.add(c33616e0);
        m72760a();
    }
}
