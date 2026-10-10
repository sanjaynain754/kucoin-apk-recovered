package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.tencent.bugly.library.MonitorCallback;
import com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.manager.RMonitorLauncher;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.o5 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33831o5 implements Handler.Callback {

    /* JADX INFO: renamed from: j */
    public static final String f71294j = "RMonitor_MonitorCallback";

    /* JADX INFO: renamed from: k */
    public static final long f71295k = 1000;

    /* JADX INFO: renamed from: l */
    public static final int f71296l = 1;

    /* JADX INFO: renamed from: m */
    public static final int f71297m = 3;

    /* JADX INFO: renamed from: b */
    public MonitorCallback f71298b = null;

    /* JADX INFO: renamed from: c */
    public Handler f71299c = null;

    /* JADX INFO: renamed from: d */
    public HandlerThread f71300d = null;

    /* JADX INFO: renamed from: e */
    public long f71301e = 0;

    /* JADX INFO: renamed from: f */
    public C33736jf f71302f = null;

    /* JADX INFO: renamed from: g */
    public int f71303g = 0;

    /* JADX INFO: renamed from: h */
    public boolean f71304h = false;

    /* JADX INFO: renamed from: i */
    public final a f71305i = new a(this);

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o5$a */
    /* JADX INFO: compiled from: BUGLY */
    public static class a extends C33758kg {

        /* JADX INFO: renamed from: b */
        public final C33831o5 f71306b;

        @Override // com.tencent.bugly.proguard.C33758kg, com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
        public void onBackground() {
            this.f71306b.m74420e();
        }

        @Override // com.tencent.bugly.proguard.C33758kg, com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
        public void onForeground() {
            this.f71306b.m74421f();
        }

        public a(C33831o5 c33831o5) {
            this.f71306b = c33831o5;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m74416a(MonitorCallback monitorCallback) {
        try {
            if (monitorCallback == null) {
                m74422g();
                m74423h();
                Logger.INSTANCE.mo77130d(f71294j, "release call back");
            } else {
                this.f71298b = monitorCallback;
                m74417b();
                if (this.f71304h) {
                    m74424i();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m74420e() {
        this.f71304h = false;
        m74415a();
    }

    /* JADX INFO: renamed from: f */
    public void m74421f() {
        this.f71304h = true;
        m74424i();
    }

    /* JADX INFO: renamed from: h */
    public final void m74423h() {
        this.f71298b = null;
        m74415a();
        this.f71299c = null;
        HandlerThread handlerThread = this.f71300d;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.f71300d = null;
        LifecycleCallback.unRegister(this.f71305i);
    }

    /* JADX INFO: renamed from: b */
    public final void m74417b() {
        if (this.f71299c == null) {
            HandlerThread handlerThread = new HandlerThread("MonitorCallback");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper(), this);
            this.f71300d = handlerThread;
            this.f71299c = handler;
            this.f71304h = LifecycleCallback.INSTANCE.isCurrentForeground();
            LifecycleCallback.register(this.f71305i);
            Logger.INSTANCE.mo77130d(f71294j, "set call back");
        }
    }

    /* JADX INFO: renamed from: c */
    public final C33736jf m74418c() {
        C33736jf c33736jf = this.f71302f;
        if (c33736jf != null) {
            return c33736jf;
        }
        this.f71303g++;
        C33932t4 c33932t4M74419d = m74419d();
        if (c33932t4M74419d != null) {
            c33736jf = new C33736jf();
            c33932t4M74419d.m75032a(c33736jf);
        }
        this.f71302f = c33736jf;
        Logger.INSTANCE.mo77130d(f71294j, "fetch monitor ".concat(c33736jf != null ? "success" : C33864ph.f71456b));
        if (this.f71303g >= 3) {
            m74423h();
        }
        return c33736jf;
    }

    /* JADX INFO: renamed from: d */
    public final C33932t4 m74419d() {
        QAPMMonitorPlugin plugin = RMonitorLauncher.INSTANCE.getPlugin("looper_metric", false);
        if (plugin instanceof C33932t4) {
            return (C33932t4) plugin;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m74422g() {
        C33932t4 c33932t4M74419d;
        if (this.f71302f != null && (c33932t4M74419d = m74419d()) != null) {
            c33932t4M74419d.m75032a((C33736jf) null);
        }
        this.f71302f = null;
        this.f71303g = 0;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            return true;
        }
        MonitorCallback monitorCallback = this.f71298b;
        if (monitorCallback == null) {
            m74423h();
        } else {
            C33736jf c33736jfM74418c = m74418c();
            if (c33736jfM74418c != null) {
                long j11 = this.f71301e;
                long jM73565b = c33736jfM74418c.m73565b();
                this.f71301e = jM73565b;
                if (j11 != jM73565b) {
                    monitorCallback.onEvent(MonitorCallback.EVENT_FPS, Float.valueOf(c33736jfM74418c.m73563a()));
                }
            }
            if (this.f71304h) {
                m74424i();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public void m74424i() {
        Handler handler = this.f71299c;
        if (handler == null || handler.hasMessages(1)) {
            return;
        }
        handler.sendEmptyMessageDelayed(1, 1000L);
    }

    /* JADX INFO: renamed from: a */
    public final void m74415a() {
        Handler handler = this.f71299c;
        if (handler != null) {
            handler.removeMessages(1);
        }
    }
}
