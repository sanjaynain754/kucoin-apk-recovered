package com.tencent.bugly.proguard;

import com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.o9 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public interface InterfaceC33835o9 {
    QAPMMonitorPlugin getPlugin(boolean z11, String str);

    boolean isPluginStart(String str);

    void setPluginFactory(InterfaceC34001wd interfaceC34001wd);

    void start(String str);

    void stop(String str);

    void stopAll();
}
