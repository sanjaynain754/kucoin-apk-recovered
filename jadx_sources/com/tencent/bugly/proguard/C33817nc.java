package com.tencent.bugly.proguard;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.rmonitor.base.meta.DropFrameResultMeta;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import com.tencent.rmonitor.common.logger.Logger;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.nc */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33817nc implements InterfaceC33699i {

    /* JADX INFO: renamed from: l */
    public static final String f71106l = "RMonitor_looper_metric";

    /* JADX INFO: renamed from: b */
    public final InterfaceC33730j9 f71107b;

    /* JADX INFO: renamed from: c */
    public C33754kc f71108c;

    /* JADX INFO: renamed from: d */
    public long f71109d = 200;

    /* JADX INFO: renamed from: e */
    public boolean f71110e = false;

    /* JADX INFO: renamed from: f */
    public String f71111f = null;

    /* JADX INFO: renamed from: g */
    public String f71112g = null;

    /* JADX INFO: renamed from: h */
    public boolean f71113h = false;

    /* JADX INFO: renamed from: i */
    public C33736jf f71114i = null;

    /* JADX INFO: renamed from: j */
    public long f71115j = 0;

    /* JADX INFO: renamed from: k */
    public final Runnable f71116k = new c();

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.nc$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C33817nc.this.m74283f();
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.nc$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C33817nc.this.m74285h();
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.nc$c */
    /* JADX INFO: compiled from: BUGLY */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Logger.INSTANCE.mo77130d("RMonitor_looper_metric", "regular Collect Task run");
            if (Math.abs(SystemClock.uptimeMillis() - C33817nc.this.f71115j) >= C33791m7.m74050c()) {
                C33817nc.this.m74277b(InterfaceC33730j9.f70353d);
            }
            C33754kc c33754kc = C33817nc.this.f71108c;
            if (c33754kc == null || !c33754kc.m73809d() || c33754kc.m73808c()) {
                return;
            }
            C33817nc.this.m74280d();
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m74284g() {
        if (this.f71113h) {
            this.f71113h = false;
            ThreadManager.runInMainThread(new b(), 0L);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m74274a(C33754kc c33754kc) {
        this.f71108c = c33754kc;
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: b */
    public final C33754kc m74276b() {
        C33754kc c33775lc;
        if (this.f71110e && AndroidVersion.isOverO()) {
            c33775lc = new C33796mc();
            Logger.INSTANCE.mo77130d("RMonitor_looper_metric", "collector use FrameMetric");
        } else if (AndroidVersion.isOverJellyBean()) {
            c33775lc = new C33775lc();
            Logger.INSTANCE.mo77130d("RMonitor_looper_metric", "collector use FrameCallback");
        } else {
            c33775lc = null;
        }
        if (c33775lc != null) {
            c33775lc.m73803a(this.f71114i);
            this.f71114i = null;
        }
        return c33775lc;
    }

    /* JADX INFO: renamed from: c */
    public void m74279c(String str) {
        if (TextUtils.equals(this.f71112g, str)) {
            return;
        }
        this.f71112g = str;
        m74271a();
    }

    /* JADX INFO: renamed from: d */
    public void m74281d(String str) {
        if (TextUtils.equals(this.f71112g, str)) {
            this.f71112g = null;
            m74271a();
        }
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m74282e() {
        if (!this.f71113h) {
            this.f71113h = true;
            ThreadManager.runInMainThread(new a(), 0L);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m74283f() {
        C33754kc c33754kcM74276b = this.f71108c;
        if (c33754kcM74276b == null) {
            c33754kcM74276b = m74276b();
            this.f71108c = c33754kcM74276b;
        }
        boolean zIsCurrentForeground = LifecycleCallback.INSTANCE.isCurrentForeground();
        if (Logger.verbos) {
            Logger logger = Logger.INSTANCE;
            StringBuilder sb2 = new StringBuilder("startCollect, isStart: ");
            sb2.append(c33754kcM74276b == null ? "null" : Boolean.valueOf(c33754kcM74276b.m73809d()));
            sb2.append(", isForeground: ");
            sb2.append(zIsCurrentForeground);
            logger.mo77133v("RMonitor_looper_metric", sb2.toString());
        }
        if (c33754kcM74276b != null && !c33754kcM74276b.m73809d() && zIsCurrentForeground) {
            c33754kcM74276b.mo73805a(m74278c(), this.f71109d);
        }
        m74280d();
    }

    /* JADX INFO: renamed from: h */
    public final void m74285h() {
        C33754kc c33754kc = this.f71108c;
        if (c33754kc == null) {
            return;
        }
        if (Logger.verbos) {
            Logger.INSTANCE.mo77133v("RMonitor_looper_metric", "stopCollect, isStart: " + c33754kc.m73809d() + ", isForeground: " + LifecycleCallback.INSTANCE.isCurrentForeground());
        }
        if (c33754kc.m73809d()) {
            m74275a(c33754kc.m73806b(), InterfaceC33730j9.f70350a);
            c33754kc.mo73812g();
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33699i
    public void onBackground() {
        C33754kc c33754kc = this.f71108c;
        if (c33754kc != null && c33754kc.m73809d()) {
            c33754kc.mo73810e();
        }
        m74277b("background");
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33699i
    public void onForeground() {
        C33754kc c33754kc = this.f71108c;
        if (c33754kc == null || !c33754kc.m73809d()) {
            m74283f();
        } else {
            c33754kc.mo73811f();
            m74280d();
        }
    }

    public C33817nc(InterfaceC33730j9 interfaceC33730j9) {
        Logger.INSTANCE.mo77132i("RMonitor_looper_metric", "MetricMonitor init");
        this.f71107b = interfaceC33730j9;
    }

    /* JADX INFO: renamed from: a */
    public void m74273a(C33736jf c33736jf) {
        C33754kc c33754kc = this.f71108c;
        if (c33754kc != null) {
            c33754kc.m73803a(c33736jf);
        } else {
            this.f71114i = c33736jf;
        }
    }

    /* JADX INFO: renamed from: c */
    public String m74278c() {
        String str = this.f71112g;
        if (TextUtils.isEmpty(str)) {
            str = this.f71111f;
        }
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: d */
    public final void m74280d() {
        long jM74050c = C33791m7.m74050c();
        ThreadManager.cancelFromMainThread(this.f71116k);
        ThreadManager.runInMainThread(this.f71116k, jM74050c);
    }

    /* JADX INFO: renamed from: a */
    public void m74272a(C33690hb c33690hb) {
        if (c33690hb != null) {
            this.f71109d = c33690hb.f70127l;
            this.f71110e = C33690hb.f70091v.equals(c33690hb.f70097s);
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33699i
    /* JADX INFO: renamed from: a */
    public void mo72968a(String str) {
        if (TextUtils.equals(this.f71111f, str)) {
            return;
        }
        this.f71111f = str;
        m74271a();
    }

    /* JADX INFO: renamed from: b */
    public void m74277b(String str) {
        C33754kc c33754kc = this.f71108c;
        if (c33754kc == null || !c33754kc.m73809d()) {
            return;
        }
        m74275a(c33754kc.m73806b(), str);
        c33754kc.m73804a(m74278c());
    }

    /* JADX INFO: renamed from: a */
    public final void m74271a() {
        C33754kc c33754kc = this.f71108c;
        if (c33754kc == null) {
            return;
        }
        String str = c33754kc.m73806b().scene;
        String strM74278c = m74278c();
        if (TextUtils.equals(str, strM74278c)) {
            return;
        }
        if (Logger.verbos) {
            Logger.INSTANCE.mo77133v("RMonitor_looper_metric", "changeScene, " + str + " --> " + strM74278c);
        }
        m74277b(InterfaceC33730j9.f70352c);
    }

    /* JADX INFO: renamed from: a */
    public void m74275a(DropFrameResultMeta dropFrameResultMeta, String str) {
        if (dropFrameResultMeta.totalDuration <= 0) {
            return;
        }
        DropFrameResultMeta dropFrameResultMeta2 = new DropFrameResultMeta();
        dropFrameResultMeta2.copyFrom(dropFrameResultMeta);
        this.f71107b.mo73531a(dropFrameResultMeta2, str);
        this.f71115j = SystemClock.uptimeMillis();
    }
}
