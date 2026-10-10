package com.tencent.bugly.proguard;

import com.tencent.rmonitor.base.config.ConfigProxy;
import com.tencent.rmonitor.base.plugin.monitor.PluginController;
import com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin;
import com.tencent.rmonitor.common.logger.Logger;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.h1 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33680h1 extends QAPMMonitorPlugin {

    /* JADX INFO: renamed from: c */
    public static final String f70046c = "BatteryElementMetricPlugin";

    /* JADX INFO: renamed from: b */
    public final C33694hf f70047b = ConfigProxy.INSTANCE.getConfig().m77076e("battery_ele_metric");

    /* JADX INFO: renamed from: a */
    public final boolean m73231a() {
        if (PluginController.INSTANCE.canCollect("battery_ele_metric")) {
            return true;
        }
        Logger.INSTANCE.mo77132i(f70046c, "battery element metric report too many times today,  please try again next day");
        return false;
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void start() throws Throwable {
        if (this.f70047b.f70122g && m73231a()) {
            Logger.INSTANCE.mo77132i(f70046c, "start battery element metric plugin");
            C33827o1 c33827o1 = C33827o1.f.f71282a;
            c33827o1.m74383b(true);
            c33827o1.m74381b();
            C33589cf.m72692a().m72696b(C33981vd.m75302a("battery_ele_metric"));
        }
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void stop() {
        Logger.INSTANCE.mo77132i(f70046c, "stop battery element metric plugin");
        C33827o1 c33827o1 = C33827o1.f.f71282a;
        c33827o1.m74383b(false);
        c33827o1.m74384c();
        C33589cf.m72692a().m72693a(C33981vd.m75302a("battery_ele_metric"));
    }
}
