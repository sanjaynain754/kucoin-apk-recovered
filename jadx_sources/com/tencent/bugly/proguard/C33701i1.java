package com.tencent.bugly.proguard;

import com.tencent.rmonitor.base.config.ConfigProxy;
import com.tencent.rmonitor.base.plugin.monitor.PluginController;
import com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin;
import com.tencent.rmonitor.common.logger.Logger;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.i1 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33701i1 extends QAPMMonitorPlugin {

    /* JADX INFO: renamed from: c */
    public static final String f70153c = "BatteryElementPlugin";

    /* JADX INFO: renamed from: b */
    public final C33722j1 f70154b = (C33722j1) ConfigProxy.INSTANCE.getConfig().m77076e("battery_element");

    /* JADX INFO: renamed from: a */
    public final boolean m73293a() {
        if (PluginController.INSTANCE.canCollect("battery_element")) {
            return true;
        }
        Logger.INSTANCE.mo77132i(f70153c, "battery element  report too many times today,  please try again next day");
        return false;
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void start() throws Throwable {
        if (this.f70154b.f70122g && m73293a()) {
            Logger.INSTANCE.mo77132i(f70153c, "start battery element plugin");
            C33827o1 c33827o1 = C33827o1.f.f71282a;
            c33827o1.m74380a(true);
            c33827o1.m74381b();
            C33589cf.m72692a().m72696b(C33981vd.m75302a("battery_element"));
        }
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void stop() {
        Logger.INSTANCE.mo77132i(f70153c, "stop battery element plugin");
        C33827o1 c33827o1 = C33827o1.f.f71282a;
        c33827o1.m74380a(false);
        c33827o1.m74384c();
        C33589cf.m72692a().m72693a(C33981vd.m75302a("battery_element"));
    }
}
