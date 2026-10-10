package com.tencent.bugly.proguard;

import android.content.Context;
import com.tencent.bugly.matrix.memguard.MemGuard;
import com.tencent.rmonitor.base.config.ConfigProxy;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.m */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33783m extends AbstractC33610df {

    /* JADX INFO: renamed from: d */
    public static volatile C33783m f70863d = null;

    /* JADX INFO: renamed from: e */
    public static final String f70864e = "Bugly_Asan_Monitor";

    /* JADX INFO: renamed from: f */
    public static boolean f70865f;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f70866b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public C33763l0 f70867c;

    /* JADX INFO: renamed from: a */
    public final void m74001a(Context context) {
        MemGuard.Options.C33524a c33524a = new MemGuard.Options.C33524a(context);
        C33763l0 c33763l0 = this.f70867c;
        c33524a.f68749b = c33763l0.f70677n;
        c33524a.f68750c = c33763l0.f70678o;
        c33524a.f68751d = c33763l0.f70679p;
        c33524a.f68752e = c33763l0.f70680q;
        c33524a.f68753f = c33763l0.f70681r;
        c33524a.f68754g = c33763l0.f70682s;
        List<String> list = c33763l0.f70683t;
        if (list != null && !list.isEmpty()) {
            if (list.size() == 1) {
                c33524a.m72221b(list.get(0), new String[0]);
            } else {
                c33524a.m72221b(list.get(0), (String[]) list.subList(1, list.size()).toArray(new String[0]));
            }
        }
        List<String> list2 = this.f70867c.f70684u;
        if (list2 != null && !list2.isEmpty()) {
            if (list2.size() == 1) {
                c33524a.m72217a(list2.get(0), new String[0]);
            } else {
                c33524a.m72217a(list2.get(0), (String[]) list2.subList(1, list2.size()).toArray(new String[0]));
            }
        }
        MemGuard.m72210a(c33524a.m72219a(), (MemGuard.InterfaceC33528d) null);
    }

    /* JADX INFO: renamed from: b */
    public static C33783m m73999b() {
        if (f70863d == null) {
            synchronized (C33783m.class) {
                try {
                    if (f70863d == null) {
                        f70863d = new C33783m();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f70863d;
    }

    @Override // com.tencent.bugly.proguard.AbstractC33610df
    public String getPluginName() {
        return "asan";
    }

    @Override // com.tencent.bugly.proguard.AbstractC33610df
    public boolean isRunning() {
        return this.f70866b.get();
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void start() {
        if (!f70865f) {
            Logger.INSTANCE.mo77131e(f70864e, "start addressSanitizer failed, so load failed!");
            return;
        }
        if (this.f70866b.get()) {
            Logger.INSTANCE.mo77130d(f70864e, "addressSanitizer has already started!");
            return;
        }
        if (!m74002c()) {
            Logger.INSTANCE.mo77130d(f70864e, "start addressSanitizer failed!");
            return;
        }
        this.f70867c = m74000a();
        m74001a(C33598d3.m72772c());
        notifyStartResult(0, "");
        Logger.INSTANCE.mo77130d(f70864e, "start addressSanitizer success!");
        this.f70866b.set(true);
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void stop() {
        if (this.f70866b.get()) {
            Logger.INSTANCE.mo77132i(f70864e, "stop addressSanitizer, only stop dump issue file.");
            MemGuard.stopDumpIssue();
            notifyStopResult(0, "");
            this.f70866b.set(false);
        }
    }

    static {
        try {
            System.loadLibrary("rmonitor_base");
            System.loadLibrary(C33865pi.f71470q);
            f70865f = true;
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f70864e, th2);
            f70865f = false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m74002c() {
        if (C33899rb.m74807a().m74812c()) {
            Logger.INSTANCE.mo77132i(f70864e, "start addressSanitizer failed, couldn't support x86 or x86_64 arch");
            return false;
        }
        if (C33899rb.m74807a().m74809a("asan")) {
            Logger.INSTANCE.mo77132i(f70864e, "start addressSanitizer failed, couldn't open asan with fd or native memory same time.");
            return false;
        }
        if (!"asan".equals(C33899rb.m74807a().m74813d())) {
            Logger.INSTANCE.mo77132i(f70864e, "start addressSanitizer failed, local sample failed!");
            return false;
        }
        Logger.INSTANCE.mo77132i(f70864e, "prepare to start addressSanitizer, local sample success!");
        return true;
    }

    /* JADX INFO: renamed from: a */
    public C33763l0 m74000a() {
        return (C33763l0) ConfigProxy.INSTANCE.getConfig().m77072c("asan").config;
    }
}
