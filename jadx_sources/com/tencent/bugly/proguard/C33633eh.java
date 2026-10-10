package com.tencent.bugly.proguard;

import com.tencent.bugly.traffic.TrafficMonitor;
import com.tencent.rmonitor.base.config.ConfigProxy;
import com.tencent.rmonitor.base.plugin.monitor.PluginController;
import com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin;
import com.tencent.rmonitor.common.logger.Logger;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.eh */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33633eh extends QAPMMonitorPlugin {

    /* JADX INFO: renamed from: c */
    public static final String f69781c = "TrafficDetailPlugin";

    /* JADX INFO: renamed from: b */
    public final C33654fh f69782b = (C33654fh) ConfigProxy.INSTANCE.getConfig().m77076e("traffic_detail");

    /* JADX INFO: renamed from: a */
    public final boolean m72966a() {
        if (PluginController.INSTANCE.canCollect("traffic_detail")) {
            return true;
        }
        Logger.INSTANCE.mo77132i(f69781c, "traffic detail report too many times today,  please try again next day");
        return false;
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void start() {
        if (this.f69782b.f70122g && m72966a()) {
            Logger.INSTANCE.mo77132i(f69781c, "start traffic detail plugin");
            TrafficMonitor.m75606c().m75616b(true);
            TrafficMonitor.C34068b.f72668a.m75623g();
            C33589cf.m72692a().m72696b(C33981vd.m75302a("traffic_detail"));
        }
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void stop() {
        Logger.INSTANCE.mo77132i(f69781c, "stop traffic detail plugin");
        TrafficMonitor.m75606c().m75616b(false);
        TrafficMonitor.C34068b.f72668a.m75620d(false);
        C33589cf.m72692a().m72693a(C33981vd.m75302a("traffic_detail"));
    }
}
