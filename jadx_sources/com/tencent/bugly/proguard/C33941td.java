package com.tencent.bugly.proguard;

import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.rmonitor.base.config.ConfigProxy;
import com.tencent.rmonitor.base.plugin.monitor.PluginController;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.pagelaunch.PageLaunchMonitor;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.td */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33941td extends AbstractC33610df {

    /* JADX INFO: renamed from: c */
    public static final String f72079c = "PageLaunchPlugin";

    /* JADX INFO: renamed from: b */
    public boolean f72080b = false;

    @Override // com.tencent.bugly.proguard.AbstractC33610df
    public boolean isRunning() {
        return this.f72080b;
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void start() {
        C33694hf c33694hfM77076e = ConfigProxy.INSTANCE.getConfig().m77076e("page_launch");
        if (c33694hfM77076e == null) {
            Logger.INSTANCE.mo77132i(f72079c, "get config failed");
            return;
        }
        if (!c33694hfM77076e.f70122g) {
            Logger.INSTANCE.mo77132i(f72079c, "config not enabled, just return");
            return;
        }
        if (!PluginController.INSTANCE.canCollect("page_launch")) {
            Logger.INSTANCE.mo77132i(f72079c, "report num reach the limit, just return");
            return;
        }
        if (!AndroidVersion.isOverJellyBeanMr2()) {
            Logger.INSTANCE.mo77132i(f72079c, "isOverJellyBeanMr2 false, just return");
        } else if (PageLaunchMonitor.getInstance() != null) {
            this.f72080b = true;
            PageLaunchMonitor.getInstance().m77205a();
            notifyStartResult(0, "");
            Logger.INSTANCE.mo77132i(f72079c, "start page launch monitor");
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC33610df
    public String getPluginName() {
        return "page_launch";
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void stop() {
        if (PageLaunchMonitor.getInstance() != null && this.f72080b) {
            PageLaunchMonitor.getInstance().m77206b();
            this.f72080b = false;
            notifyStopResult(0, "");
            Logger.INSTANCE.mo77132i(f72079c, "stop page launch monitor");
        }
    }
}
