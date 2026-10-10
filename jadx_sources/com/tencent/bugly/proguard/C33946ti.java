package com.tencent.bugly.proguard;

import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.looper.LooperConfig;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ti */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33946ti extends AbstractC33610df {

    /* JADX INFO: renamed from: c */
    public static final String f72124c = "RMonitor_looper_WorkThread";

    /* JADX INFO: renamed from: d */
    public static WeakReference<C33946ti> f72125d;

    /* JADX INFO: renamed from: b */
    public boolean f72126b = false;

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void stop() {
        this.f72126b = false;
        Logger.INSTANCE.mo77132i("RMonitor_looper_WorkThread", InterfaceC33730j9.f70350a);
        notifyStopResult(0, null);
    }

    /* JADX INFO: renamed from: a */
    public static C33946ti m75066a() {
        WeakReference<C33946ti> weakReference = f72125d;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.tencent.bugly.proguard.AbstractC33610df
    public boolean isRunning() {
        return this.f72126b;
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void start() {
        if (LooperConfig.INSTANCE.isCanCollect("work_thread_lag")) {
            this.f72126b = true;
            Logger.INSTANCE.mo77132i("RMonitor_looper_WorkThread", "start");
            notifyStartResult(0, null);
        } else {
            this.f72126b = false;
            notifyStartResult(1, "can not collect");
            Logger.INSTANCE.mo77132i("RMonitor_looper_WorkThread", "start, can not collect");
        }
    }

    public C33946ti() {
        f72125d = new WeakReference<>(this);
    }

    @Override // com.tencent.bugly.proguard.AbstractC33610df
    public String getPluginName() {
        return "work_thread_lag";
    }
}
