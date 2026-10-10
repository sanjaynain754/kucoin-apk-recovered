package com.tencent.rmonitor.natmem;

import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.bugly.proguard.C33589cf;
import com.tencent.bugly.proguard.C33787m3;
import com.tencent.bugly.proguard.C33899rb;
import com.tencent.bugly.proguard.C33980vc;
import com.tencent.bugly.proguard.C33981vd;
import com.tencent.bugly.proguard.C34000wc;
import com.tencent.bugly.proguard.C34060zc;
import com.tencent.bugly.proguard.HandlerC33544ac;
import com.tencent.rmonitor.base.config.ConfigProxy;
import com.tencent.rmonitor.base.plugin.monitor.PluginController;
import com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin;
import com.tencent.rmonitor.common.logger.Logger;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
public class NatMemMonitor extends QAPMMonitorPlugin {

    /* JADX INFO: renamed from: e */
    public static final String f75293e = "RMonitor_NatMem_Monitor";

    /* JADX INFO: renamed from: f */
    public static NatMemMonitor f75294f = null;

    /* JADX INFO: renamed from: g */
    public static boolean f75295g = false;

    /* JADX INFO: renamed from: h */
    public static boolean f75296h = false;

    /* JADX INFO: renamed from: i */
    public static final long f75297i = 30000;

    /* JADX INFO: renamed from: b */
    public NatMemHandler f75298b;

    /* JADX INFO: renamed from: c */
    public C34000wc f75299c;

    /* JADX INFO: renamed from: d */
    public AtomicBoolean f75300d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public static NatMemMonitor m77197b() {
        if (f75294f == null) {
            synchronized (NatMemMonitor.class) {
                try {
                    if (f75294f == null) {
                        f75294f = new NatMemMonitor();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f75294f;
    }

    /* JADX INFO: renamed from: c */
    public void m77201c(String str) {
        if (!f75296h || !f75295g) {
            Logger.INSTANCE.mo77131e("dumpNatMemUsageInfo failed");
            return;
        }
        File parentFile = new File(str).getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        nativeDumpNatMemUsageInfo(str, HandlerC33544ac.m72327l().m72328a(false));
    }

    /* JADX INFO: renamed from: d */
    public void m77202d() {
        if (!f75296h || f75295g) {
            Logger.INSTANCE.mo77131e("startMonitor failed,mSoLoadSuccess = " + f75296h);
            return;
        }
        this.f75299c = (C34000wc) ConfigProxy.INSTANCE.getConfig().m77076e("native_memory");
        this.f75298b.obtainMessage(1).sendToTarget();
        this.f75298b.obtainMessage(2).sendToTarget();
        f75295g = true;
    }

    public native int nativeDumpNatMemLeakInfo(String str);

    public native int nativeDumpNatMemUsageInfo(String str, long j11);

    public native int nativeIgnoreLib(String str);

    public native int nativeInit();

    public native void nativeInitAppHookParameter(int i11);

    public native void nativeSetSceneInfo(String str);

    public native void nativeSetUnwindSwtich(boolean z11);

    public native int nativeStartHook(long j11, int i11, boolean z11);

    static {
        try {
            System.loadLibrary("rmonitor_memory");
            f75296h = true;
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f75293e, th2);
            f75296h = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public C34000wc m77198a() {
        return this.f75299c;
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void start() {
        if (!f75296h || this.f75300d.get()) {
            return;
        }
        int iM77200c = m77200c();
        if (iM77200c != 0) {
            C34060zc.m75595a(iM77200c);
            return;
        }
        m77202d();
        nativeSetUnwindSwtich(true);
        C33589cf.m72692a().m72696b(C33981vd.m75302a("native_memory"));
        this.f75300d.set(true);
        Logger.INSTANCE.mo77130d(f75293e, "start natmem monitor!!");
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void stop() {
        this.f75300d.set(false);
        if (f75296h) {
            nativeSetUnwindSwtich(false);
        }
        C33589cf.m72692a().m72693a(C33981vd.m75302a("native_memory"));
    }

    public NatMemMonitor() {
        if (f75296h) {
            this.f75299c = (C34000wc) ConfigProxy.INSTANCE.getConfig().m77076e("native_memory");
            this.f75298b = new NatMemHandler(ThreadManager.getMonitorThreadLooper());
        }
        f75294f = this;
        this.f75300d.set(false);
    }

    /* JADX INFO: renamed from: b */
    public void m77199b(String str) {
        if (f75296h && f75295g) {
            File parentFile = new File(str).getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            nativeDumpNatMemLeakInfo(str);
            return;
        }
        Logger.INSTANCE.mo77131e("dumpNatMemLeakInfo failed");
    }

    /* JADX INFO: renamed from: c */
    public int m77200c() {
        if (AndroidVersion.isOverO()) {
            if (!C33787m3.m74030a("native_memory", 30000L)) {
                if (!PluginController.INSTANCE.canCollect("native_memory")) {
                    Logger.INSTANCE.mo77132i(f75293e, "start native memory monitor fail, for can not report again");
                    return 3;
                }
                if (!C33899rb.m74807a().m74812c()) {
                    if (!C33899rb.m74807a().m74809a("native_memory")) {
                        if (!"native_memory".equals(C33899rb.m74807a().m74813d())) {
                            Logger.INSTANCE.mo77132i(f75293e, "start native memory monitor failed, local sample failed!");
                            return 4;
                        }
                        Logger.INSTANCE.mo77132i(f75293e, "prepare to start native memory monitor, local sample success!");
                        return 0;
                    }
                    Logger.INSTANCE.mo77132i(f75293e, "start native memory monitor fail, couldn't open native memory with fd or asan same time.");
                    return 4;
                }
                Logger.INSTANCE.mo77132i(f75293e, "start native memory monitor fail, couldn't support x86 or x86_64 arch");
                return 5;
            }
            Logger.INSTANCE.mo77131e(f75293e, "start native memory monitor fail, for start failed many times");
            C33980vc.m75300a(C33980vc.f72358d);
            return 1;
        }
        Logger.INSTANCE.mo77130d(f75293e, "start native memory monitor fail, for android version");
        C33980vc.m75300a(C33980vc.f72359e);
        return 2;
    }

    /* JADX INFO: renamed from: d */
    public void m77203d(String str) {
        nativeSetSceneInfo(str);
    }
}
