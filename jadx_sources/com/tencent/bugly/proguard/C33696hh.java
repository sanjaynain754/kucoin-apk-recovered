package com.tencent.bugly.proguard;

import com.tencent.bugly.traffic.TrafficMonitor;
import com.tencent.rmonitor.base.config.ConfigProxy;
import com.tencent.rmonitor.base.plugin.monitor.PluginController;
import com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin;
import com.tencent.rmonitor.common.logger.Logger;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.hh */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33696hh extends QAPMMonitorPlugin {

    /* JADX INFO: renamed from: c */
    public static final String f70148c = "TrafficPlugin";

    /* JADX INFO: renamed from: b */
    public final C33694hf f70149b = ConfigProxy.INSTANCE.getConfig().m77076e("traffic");

    /* JADX INFO: renamed from: a */
    public final boolean m73290a() {
        if (PluginController.INSTANCE.canCollect("traffic")) {
            return true;
        }
        Logger.INSTANCE.mo77132i(f70148c, "traffic report too many times today,  please try again next day");
        return false;
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void start() {
        if (this.f70149b.f70122g && m73290a()) {
            Logger.INSTANCE.mo77132i(f70148c, "start traffic plugin");
            TrafficMonitor.m75606c().m75618c(true);
            TrafficMonitor.C34068b.f72668a.m75623g();
            C33589cf.m72692a().m72696b(C33981vd.m75302a("traffic"));
        }
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void stop() {
        Logger.INSTANCE.mo77132i(f70148c, "stop traffic plugin");
        TrafficMonitor.m75606c().m75618c(false);
        TrafficMonitor.C34068b.f72668a.m75620d(true);
        C33589cf.m72692a().m72693a(C33981vd.m75302a("traffic"));
    }
}
