package com.tencent.bugly.proguard;

import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.rmonitor.base.config.ConfigProxy;
import com.tencent.rmonitor.base.plugin.monitor.PluginController;
import com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin;
import com.tencent.rmonitor.common.logger.Logger;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.n1 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33806n1 extends QAPMMonitorPlugin {

    /* JADX INFO: renamed from: c */
    public static final String f71014c = "BatteryMetricPlugin";

    /* JADX INFO: renamed from: b */
    public final C33694hf f71015b = ConfigProxy.INSTANCE.getConfig().m77076e("battery_metric");

    /* JADX INFO: renamed from: a */
    public final boolean m74177a() {
        if (!PluginController.INSTANCE.canCollect("battery_metric")) {
            Logger.INSTANCE.mo77132i(f71014c, "battery metric report too many times today,  please try again next day");
            return false;
        }
        if (AndroidVersion.isOverM()) {
            return true;
        }
        Logger.INSTANCE.mo77132i(f71014c, "battery metric report couldn't open below Android M");
        return false;
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void start() {
        if (this.f71015b.f70122g && m74177a()) {
            Logger.INSTANCE.mo77132i(f71014c, "start battery metric plugin");
            C33785m1.b.f70890a.m74017c();
            C33589cf.m72692a().m72696b(C33981vd.m75302a("battery_metric"));
        }
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void stop() {
        Logger.INSTANCE.mo77132i(f71014c, "stop battery metric plugin");
        C33785m1.b.f70890a.m74018d();
        C33589cf.m72692a().m72693a(C33981vd.m75302a("battery_metric"));
    }
}
