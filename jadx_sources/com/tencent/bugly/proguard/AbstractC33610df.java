package com.tencent.bugly.proguard;

import com.tencent.rmonitor.base.plugin.listener.ListenerManager;
import com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin;
import java.util.Iterator;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.df */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC33610df extends QAPMMonitorPlugin {
    public abstract String getPluginName();

    public boolean isResume() {
        return true;
    }

    public abstract boolean isRunning();

    public void notifyStartResult(int i11, String str) {
        if (i11 == 0) {
            C33589cf.m72692a().m72696b(C33981vd.m75302a(getPluginName()));
        }
        Iterator it = ListenerManager.pluginStateListener.getListenerList().iterator();
        while (it.hasNext()) {
            ((InterfaceC33856p9) it.next()).mo74514b(getPluginName(), i11, str);
        }
    }

    public void notifyStopResult(int i11, String str) {
        if (i11 == 0) {
            C33589cf.m72692a().m72693a(C33981vd.m75302a(getPluginName()));
        }
        Iterator it = ListenerManager.pluginStateListener.getListenerList().iterator();
        while (it.hasNext()) {
            ((InterfaceC33856p9) it.next()).mo74513a(getPluginName(), i11, str);
        }
    }

    public void pause() {
    }

    public void resume() {
    }
}
