package com.tencent.bugly.proguard;

import com.tencent.bugly.network.BuglyListenerFactory;
import com.tencent.rmonitor.base.config.DefaultPluginConfig;
import com.tencent.rmonitor.base.plugin.monitor.PluginController;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import com.tencent.rmonitor.common.logger.Logger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.id */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33713id extends AbstractC33610df {

    /* JADX INFO: renamed from: g */
    public static final String f70263g = "RMonitor_net_quality";

    /* JADX INFO: renamed from: b */
    public final Object f70264b = new Object();

    /* JADX INFO: renamed from: c */
    public boolean f70265c = false;

    /* JADX INFO: renamed from: d */
    public C33561b8 f70266d = null;

    /* JADX INFO: renamed from: e */
    public C34015x7 f70267e = null;

    /* JADX INFO: renamed from: f */
    public a f70268f = null;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.id$a */
    /* JADX INFO: compiled from: BUGLY */
    public static class a extends C33758kg {

        /* JADX INFO: renamed from: b */
        public final C33561b8 f70269b;

        @Override // com.tencent.bugly.proguard.C33758kg, com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
        public void onBackground() {
            if (this.f70269b != null) {
                Logger.INSTANCE.mo77130d("RMonitor_net_quality", "try report or cache data for background.");
                this.f70269b.m72486a("onBackground");
            }
        }

        public a(C33561b8 c33561b8) {
            this.f70269b = c33561b8;
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC33610df
    public boolean isRunning() {
        return this.f70265c;
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void start() {
        if (this.f70265c) {
            return;
        }
        if (!PluginController.INSTANCE.canCollect("net_quality")) {
            Logger.INSTANCE.mo77132i("RMonitor_net_quality", "can not start plugin for can not collect.");
            return;
        }
        synchronized (this.f70264b) {
            try {
                if (!this.f70265c) {
                    if (this.f70266d == null) {
                        this.f70266d = new C33561b8(m73406a(), new C33862pf());
                    }
                    if (this.f70267e == null) {
                        this.f70267e = new C34015x7(this.f70266d);
                    }
                    this.f70267e.m75448a();
                    BuglyListenerFactory.getInstance().addFactory(this.f70267e);
                    this.f70265c = true;
                    notifyStartResult(0, "");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        a aVar = new a(this.f70266d);
        LifecycleCallback.register(aVar);
        this.f70268f = aVar;
        Logger.INSTANCE.mo77132i("RMonitor_net_quality", "start");
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void stop() {
        if (this.f70265c) {
            synchronized (this.f70264b) {
                try {
                    if (this.f70265c) {
                        BuglyListenerFactory.getInstance().removeFactory(this.f70267e);
                        C34015x7 c34015x7 = this.f70267e;
                        if (c34015x7 != null) {
                            c34015x7.m75449b();
                        }
                        this.f70265c = false;
                        notifyStopResult(0, "");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            LifecycleCallback.unRegister(this.f70268f);
            Logger.INSTANCE.mo77132i("RMonitor_net_quality", InterfaceC33730j9.f70350a);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public C33734jd m73406a() {
        C33694hf c33694hf;
        DefaultPluginConfig pluginConfig = getPluginConfig();
        if (pluginConfig != null) {
            c33694hf = pluginConfig.config;
        } else {
            c33694hf = null;
        }
        if (c33694hf instanceof C33734jd) {
            return (C33734jd) c33694hf;
        }
        return new C33734jd();
    }

    @Override // com.tencent.bugly.proguard.AbstractC33610df
    public String getPluginName() {
        return "net_quality";
    }
}
