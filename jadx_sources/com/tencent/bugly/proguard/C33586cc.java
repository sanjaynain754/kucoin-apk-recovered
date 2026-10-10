package com.tencent.bugly.proguard;

import android.os.Handler;
import com.tencent.bugly.common.heapdump.ForkJvmHeapDumper;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.rmonitor.base.plugin.listener.IMemoryLeakListener;
import com.tencent.rmonitor.base.plugin.listener.ListenerManager;
import com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin;
import com.tencent.rmonitor.common.logger.Logger;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.cc */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33586cc extends QAPMMonitorPlugin {

    /* JADX INFO: renamed from: d */
    public static final String f69417d = "RMonitor_MemoryLeak";

    /* JADX INFO: renamed from: b */
    public C33565bc f69418b;

    /* JADX INFO: renamed from: c */
    public C33721j0 f69419c;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.cc$b */
    /* JADX INFO: compiled from: BUGLY */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final C33586cc f69420a = new C33586cc();
    }

    /* JADX INFO: renamed from: a */
    public static C33586cc m72681a() {
        return b.f69420a;
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public synchronized void start() {
        if (!AndroidVersion.isOverL() && !C33704i4.m73338a()) {
            Logger.INSTANCE.mo77132i(f69417d, "don't support fork dumper");
            return;
        }
        if (C33915s7.m74925a() instanceof ForkJvmHeapDumper) {
            if (this.f69418b == null) {
                Handler handler = new Handler(ThreadManager.getMonitorThreadLooper());
                IMemoryLeakListener c34032y4 = (IMemoryLeakListener) ListenerManager.memoryLeakListener.getListener();
                if (c34032y4 == null) {
                    c34032y4 = new C34032y4();
                }
                C33565bc c33565bc = new C33565bc(handler, c34032y4);
                this.f69418b = c33565bc;
                this.f69419c = m72682a(c33565bc);
            }
            this.f69419c.mo72930b();
            C33589cf.m72692a().m72696b(C33981vd.m75302a("activity_leak"));
        } else {
            Logger.INSTANCE.mo77132i(f69417d, "has not valid dumper, start failed");
        }
    }

    public C33586cc() {
    }

    /* JADX INFO: renamed from: a */
    public final C33721j0 m72682a(C33565bc c33565bc) {
        return new C33721j0(c33565bc);
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void stop() {
        if (C33915s7.m74925a() instanceof ForkJvmHeapDumper) {
            C33565bc c33565bc = this.f69418b;
            if (c33565bc != null) {
                c33565bc.m72508g();
            }
            C33721j0 c33721j0 = this.f69419c;
            if (c33721j0 != null) {
                c33721j0.mo72931c();
            }
            C33589cf.m72692a().m72693a(C33981vd.m75302a("activity_leak"));
        }
    }
}
