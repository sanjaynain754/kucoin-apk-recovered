package com.tencent.bugly.proguard;

import android.annotation.TargetApi;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.rmonitor.base.config.ConfigProxy;
import com.tencent.rmonitor.base.plugin.monitor.QAPMScenePlugin;
import com.tencent.rmonitor.common.logger.Logger;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.t4 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@TargetApi(16)
public class C33932t4 extends QAPMScenePlugin implements InterfaceC33699i {

    /* JADX INFO: renamed from: g */
    public static final String f72041g = "RMonitor_looper_metric";

    /* JADX INFO: renamed from: b */
    public boolean f72042b;

    /* JADX INFO: renamed from: c */
    public final C33720j f72043c;

    /* JADX INFO: renamed from: d */
    public final C33817nc f72044d;

    /* JADX INFO: renamed from: e */
    public C33732jb f72045e;

    /* JADX INFO: renamed from: f */
    public C33690hb f72046f;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.t4$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f72047b;

        public a(String str) {
            this.f72047b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C33932t4.this.isRunning()) {
                C33932t4.this.onEnterScene(this.f72047b);
            } else {
                C33932t4.this.onExitScene(this.f72047b);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.t4$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f72049b;

        public b(String str) {
            this.f72049b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C33932t4.this.f72044d.m74279c(this.f72049b);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.t4$c */
    /* JADX INFO: compiled from: BUGLY */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f72051b;

        public c(String str) {
            this.f72051b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C33932t4.this.f72044d.m74281d(this.f72051b);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.t4$d */
    /* JADX INFO: compiled from: BUGLY */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C33932t4.this.f72044d.mo72968a(C33657g.m73093d());
        }
    }

    public C33932t4() {
        this.f72042b = false;
        this.f72043c = new C33720j(this);
        this.f72045e = null;
        this.f72046f = null;
        C33732jb c33732jb = new C33732jb();
        this.f72045e = c33732jb;
        this.f72044d = new C33817nc(c33732jb);
    }

    /* JADX INFO: renamed from: a */
    public void m75032a(C33736jf c33736jf) {
        this.f72044d.m74273a(c33736jf);
    }

    /* JADX INFO: renamed from: d */
    public final C33690hb m75035d() {
        if (this.f72046f == null) {
            C33694hf c33694hfM77076e = ConfigProxy.INSTANCE.getConfig().m77076e(getPluginName());
            if (c33694hfM77076e instanceof C33690hb) {
                this.f72046f = (C33690hb) c33694hfM77076e;
            }
        }
        return this.f72046f;
    }

    @Override // com.tencent.bugly.proguard.AbstractC33610df
    public String getPluginName() {
        return "looper_metric";
    }

    @Override // com.tencent.bugly.proguard.AbstractC33610df
    public boolean isRunning() {
        return this.f72042b;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33699i
    public void onBackground() {
        this.f72044d.onBackground();
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33699i
    public void onForeground() {
        this.f72044d.onForeground();
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void stop() {
        if (!this.f72042b) {
            Logger.INSTANCE.mo77131e("RMonitor_looper_metric", getPluginName() + " not start yet.");
            return;
        }
        Logger.INSTANCE.mo77130d("RMonitor_looper_metric", getPluginName() + " stop");
        this.f72042b = false;
        this.f72043c.m73453b();
        C33657g.m73095h().m73102b(this);
        m75031a();
        this.f72044d.m74284g();
        notifyStopResult(0, null);
        C33732jb c33732jb = this.f72045e;
        if (c33732jb != null) {
            c33732jb.m73548b();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m75031a() {
        String strM73107g = C33657g.m73095h().m73107g();
        if (TextUtils.isEmpty(strM73107g)) {
            return;
        }
        ThreadManager.runInMainThread(new a(strM73107g), 0L);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m75033b() {
        C33690hb c33690hbM75035d = m75035d();
        if (c33690hbM75035d != null) {
            return c33690hbM75035d.f70093o;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m75034c() {
        C33690hb c33690hbM75035d = m75035d();
        if (c33690hbM75035d != null) {
            return c33690hbM75035d.f70092n;
        }
        return true;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33896r8
    public void onEnterScene(String str) {
        if (!TextUtils.isEmpty(str) && isRunning() && m75034c()) {
            if (C33549ah.m72371a(Looper.getMainLooper())) {
                this.f72044d.m74279c(str);
            } else {
                ThreadManager.runInMainThread(new b(str), 0L);
            }
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33896r8
    public void onExitScene(String str) {
        if (!m75034c()) {
            return;
        }
        if (C33549ah.m72371a(Looper.getMainLooper())) {
            this.f72044d.m74281d(str);
        } else {
            ThreadManager.runInMainThread(new c(str), 0L);
        }
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void start() {
        if (!AndroidVersion.isOverJellyBean()) {
            notifyStartResult(2, getPluginName() + " start fail for build version is lower than jelly bean.");
            return;
        }
        if (this.f72042b) {
            Logger.INSTANCE.mo77131e("RMonitor_looper_metric", getPluginName() + " has start before.");
            return;
        }
        Logger.INSTANCE.mo77130d("RMonitor_looper_metric", getPluginName() + " start");
        this.f72042b = true;
        this.f72043c.m73452a();
        C33657g.m73095h().m73098a(this);
        mo72968a(C33657g.f69911j.m73110k());
        this.f72044d.m74272a(m75035d());
        this.f72044d.m74282e();
        m75031a();
        notifyStartResult(0, null);
        C33732jb c33732jb = this.f72045e;
        if (c33732jb != null) {
            c33732jb.m73547a(m75035d());
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33699i
    /* JADX INFO: renamed from: a */
    public void mo72968a(String str) {
        if (m75033b()) {
            if (C33549ah.m72371a(Looper.getMainLooper())) {
                this.f72044d.mo72968a(str);
            } else {
                ThreadManager.runInMainThread(new d(), 0L);
            }
        }
    }

    public C33932t4(C33817nc c33817nc) {
        this.f72042b = false;
        this.f72043c = new C33720j(this);
        this.f72045e = null;
        this.f72046f = null;
        this.f72044d = c33817nc;
    }
}
