package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import com.tencent.bugly.common.heapdump.ForkJvmHeapDumper;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.rmonitor.base.meta.DumpResult;
import com.tencent.rmonitor.base.plugin.listener.IMemoryDumpListener;
import com.tencent.rmonitor.base.plugin.monitor.PluginController;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.common.util.AppInfo;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.sb */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33919sb extends AbstractC33610df implements Handler.Callback {

    /* JADX INFO: renamed from: A */
    public static final int f71868A = 16;

    /* JADX INFO: renamed from: B */
    public static final int f71869B = 32;

    /* JADX INFO: renamed from: o */
    public static final String f71870o = "RMonitor_MemoryCeiling";

    /* JADX INFO: renamed from: p */
    public static final int f71871p = 1;

    /* JADX INFO: renamed from: q */
    public static final int f71872q = 5000;

    /* JADX INFO: renamed from: r */
    public static final int f71873r = 30000;

    /* JADX INFO: renamed from: s */
    public static final int f71874s = 128;

    /* JADX INFO: renamed from: t */
    public static final int f71875t = 1024;

    /* JADX INFO: renamed from: u */
    public static boolean f71876u = false;

    /* JADX INFO: renamed from: v */
    public static final C33959ub f71877v = new C33959ub();

    /* JADX INFO: renamed from: w */
    public static volatile C33919sb f71878w = null;

    /* JADX INFO: renamed from: x */
    public static final int f71879x = 2;

    /* JADX INFO: renamed from: y */
    public static final int f71880y = 4;

    /* JADX INFO: renamed from: z */
    public static final int f71881z = 8;

    /* JADX INFO: renamed from: f */
    public long f71886f;

    /* JADX INFO: renamed from: b */
    public final C33809n4 f71882b = new C33809n4(5000, 5000, 30000);

    /* JADX INFO: renamed from: d */
    @NonNull
    public final StringBuilder f71884d = new StringBuilder(128);

    /* JADX INFO: renamed from: e */
    public final C33979vb f71885e = new C33979vb(f71877v);

    /* JADX INFO: renamed from: g */
    public int f71887g = 0;

    /* JADX INFO: renamed from: h */
    public int f71888h = 3;

    /* JADX INFO: renamed from: i */
    public int f71889i = 5;

    /* JADX INFO: renamed from: j */
    public boolean f71890j = false;

    /* JADX INFO: renamed from: k */
    public boolean f71891k = false;

    /* JADX INFO: renamed from: l */
    public boolean f71892l = false;

    /* JADX INFO: renamed from: m */
    public long f71893m = 0;

    /* JADX INFO: renamed from: n */
    public long f71894n = 0;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Handler f71883c = new Handler(ThreadManager.getMonitorThreadLooper(), this);

    /* JADX INFO: renamed from: a */
    public static DumpResult m74958a(String str, IMemoryDumpListener iMemoryDumpListener) {
        if (PluginController.INSTANCE.canCollect("java_memory_ceiling_hprof")) {
            return C34039yb.m75495a(str, str, true, false, iMemoryDumpListener, false, 0);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static C33919sb m74961b() {
        if (f71878w == null) {
            synchronized (C33919sb.class) {
                try {
                    if (f71878w == null) {
                        f71878w = new C33919sb();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f71878w;
    }

    /* JADX INFO: renamed from: e */
    public final void m74967e() {
        if (Logger.verbos) {
            long pssMemory = AppInfo.getPssMemory();
            this.f71884d.setLength(0);
            StringBuilder sb2 = this.f71884d;
            sb2.append("PSS=");
            sb2.append(pssMemory / 1024);
            sb2.append(" KB HeapMax=");
            sb2.append(Runtime.getRuntime().maxMemory() / 1024);
            sb2.append(" KB HeapAlloc=");
            sb2.append(Runtime.getRuntime().totalMemory() / 1024);
            sb2.append(" KB HeapFree=");
            sb2.append(Runtime.getRuntime().freeMemory() / 1024);
            sb2.append(" KB");
            Logger.INSTANCE.mo77133v(f71870o, this.f71884d.toString());
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC33610df
    public String getPluginName() {
        return "java_memory_ceiling_hprof";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        if (message.what == 1) {
            Logger logger = Logger.INSTANCE;
            logger.mo77130d(f71870o, "handle memory detect ceiling message.");
            m74967e();
            if (m74968f()) {
                this.f71885e.m75297b(this.f71886f);
            }
            if (PluginController.INSTANCE.canCollect("java_memory_ceiling_hprof")) {
                this.f71883c.sendEmptyMessageDelayed(1, this.f71882b.m74229a());
            } else {
                logger.mo77130d(f71870o, "memory celling report count above, remove MSG_MEMORY_CALCULATE msg,", " max report num: ", String.valueOf(C34019xb.m75453a().config.f70123h));
                this.f71883c.removeMessages(1);
            }
        }
        return true;
    }

    @Override // com.tencent.bugly.proguard.AbstractC33610df
    public boolean isRunning() {
        return this.f71891k;
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void start() {
        if (this.f71891k) {
            Logger.INSTANCE.mo77130d(f71870o, "MemoryCeilingMonitor is alreay started");
            return;
        }
        if (!m74965c()) {
            Logger.INSTANCE.mo77132i(f71870o, "has not valid dumper, start failed");
            return;
        }
        Logger.INSTANCE.mo77130d(f71870o, "Start MemoryCeilingMonitor");
        this.f71891k = true;
        this.f71882b.m74230b();
        this.f71888h = C34019xb.m75455c().f72072o;
        this.f71889i = C34019xb.m75455c().f72073p;
        this.f71890j = AndroidVersion.isOverM() && C34019xb.m75455c().f72074q;
        long jM73530a = C33728j7.m73530a();
        this.f71894n = jM73530a;
        this.f71893m = jM73530a;
        this.f71892l = jM73530a >= 0;
        m74962a();
        C33589cf.m72692a().m72696b(C33981vd.m75302a("java_memory_ceiling_hprof"));
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void stop() {
        if (!this.f71891k) {
            Logger.INSTANCE.mo77130d(f71870o, "MemoryCeilingMonitor is already stop");
        }
        if (C33915s7.m74925a() instanceof ForkJvmHeapDumper) {
            this.f71891k = false;
            Logger.INSTANCE.mo77130d(f71870o, "Stop MemoryCeilingMonitor");
            this.f71882b.m74231c();
            this.f71883c.removeMessages(1);
            C33589cf.m72692a().m72693a(C33981vd.m75302a("java_memory_ceiling_hprof"));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m74959a(DumpResult dumpResult) {
        if (dumpResult == null || !dumpResult.success) {
            return;
        }
        f71877v.m75174a(dumpResult, "customDump");
    }

    /* JADX INFO: renamed from: c */
    public boolean m74965c() {
        if (!AndroidVersion.isOverL() && !C33704i4.m73338a()) {
            C33648fb.m73043b(f71870o, "cannot start memory ceil monitor due to not support fork dump");
            return false;
        }
        if (!(C33915s7.m74925a() instanceof ForkJvmHeapDumper)) {
            C33648fb.m73043b(f71870o, "cannot start memory ceil monitor due to not have valid dumper");
            return false;
        }
        if (!PluginController.INSTANCE.canCollect("java_memory_ceiling_hprof")) {
            C33648fb.m73043b(f71870o, "report num is exceed today, please try next day");
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m74966d() {
        this.f71886f = C33712ic.m73402a();
        if (this.f71886f > C34019xb.m75454b() * Runtime.getRuntime().maxMemory()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m74968f() {
        long jM73530a;
        boolean zM74966d = m74966d();
        if (this.f71892l) {
            jM73530a = C33728j7.m73530a();
        } else {
            jM73530a = 0;
        }
        m74963a(zM74966d, jM73530a);
        if (this.f71887g >= this.f71888h) {
            this.f71887g = 0;
            return true;
        }
        return m74964b(zM74966d, jM73530a);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m74960a(String str, boolean z11, int i11) {
        if (!(C33915s7.m74925a() instanceof ForkJvmHeapDumper)) {
            Logger.INSTANCE.mo77132i(f71870o, "customDumpAndReportHprof fail for invalid Dumper");
            return false;
        }
        if (!PluginController.INSTANCE.canCollect("java_memory_ceiling_hprof")) {
            return false;
        }
        DumpResult dumpResultM75495a = C34039yb.m75495a(str, str, true, false, null, z11, i11);
        if (!dumpResultM75495a.success) {
            return true;
        }
        f71877v.m75174a(dumpResultM75495a, str);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m74964b(boolean z11, long j11) {
        boolean z12 = false;
        if (AndroidVersion.isOverM() && this.f71882b.m74229a() == 5000 && this.f71892l) {
            if (j11 - this.f71893m >= this.f71889i && z11) {
                z12 = true;
            }
            this.f71893m = j11;
        }
        return z12;
    }

    /* JADX INFO: renamed from: a */
    public final void m74962a() {
        Logger.INSTANCE.mo77130d(f71870o, "start detect memory ceiling");
        this.f71883c.removeMessages(1);
        this.f71883c.sendEmptyMessageDelayed(1, this.f71882b.m74229a());
    }

    /* JADX INFO: renamed from: a */
    public final void m74963a(boolean z11, long j11) {
        if (z11) {
            if (this.f71890j && this.f71892l) {
                if (j11 > this.f71894n) {
                    this.f71887g++;
                }
                this.f71894n = j11;
                return;
            }
            this.f71887g++;
            return;
        }
        this.f71887g = 0;
    }
}
