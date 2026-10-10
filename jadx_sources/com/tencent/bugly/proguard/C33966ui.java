package com.tencent.bugly.proguard;

import android.os.Looper;
import com.tencent.rmonitor.base.config.ConfigProxy;
import com.tencent.rmonitor.base.plugin.listener.ListenerManager;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ui */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33966ui implements InterfaceC33856p9 {

    /* JADX INFO: renamed from: k */
    public static final String f72274k = "RMonitor_looper_WorkThread";

    /* JADX INFO: renamed from: i */
    public volatile boolean f72275i;

    /* JADX INFO: renamed from: j */
    public final ArrayList<b> f72276j = new ArrayList<>();

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ui$a */
    /* JADX INFO: compiled from: BUGLY */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C33966ui f72277a = new C33966ui();
    }

    /* JADX INFO: renamed from: b */
    public static C33966ui m75203b() {
        return a.f72277a;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33856p9
    /* JADX INFO: renamed from: a */
    public void mo74513a(String str, int i11, String str2) {
        if ("work_thread_lag".equals(str) && i11 == 0) {
            m75208a(false);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ui$b */
    /* JADX INFO: compiled from: BUGLY */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final Looper f72278a;

        /* JADX INFO: renamed from: b */
        public final String f72279b;

        /* JADX INFO: renamed from: c */
        public volatile C33542aa f72280c = null;

        public b(Looper looper, String str) {
            this.f72278a = looper;
            this.f72279b = str;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m75211b(Looper looper, String str) {
        if (looper == null) {
            Logger.INSTANCE.mo77131e("RMonitor_looper_WorkThread", "monitor fail for looper is null");
            return;
        }
        if (m75209b(str) == null) {
            Logger.INSTANCE.mo77131e("RMonitor_looper_WorkThread", C33778lf.m73987a("monitor fail for ", str, " invalid."));
            return;
        }
        b bVarM75206a = m75206a(looper, str);
        if (this.f72275i) {
            m75207a(bVarM75206a);
            return;
        }
        Logger.INSTANCE.mo77132i("RMonitor_looper_WorkThread", "startMonitor looper[" + looper + "] wait monitor to run.");
    }

    /* JADX INFO: renamed from: c */
    public void m75213c(Looper looper) {
        b bVarM75210b;
        if (looper == null || (bVarM75210b = m75210b(looper)) == null) {
            return;
        }
        m75212b(bVarM75210b);
    }

    /* JADX INFO: renamed from: d */
    public void m75214d() {
        ArrayList arrayList;
        synchronized (this.f72276j) {
            arrayList = new ArrayList(this.f72276j);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m75207a((b) it.next());
        }
    }

    /* JADX INFO: renamed from: e */
    public void m75215e() {
        ArrayList arrayList;
        synchronized (this.f72276j) {
            arrayList = new ArrayList(this.f72276j);
            this.f72276j.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m75212b((b) it.next());
        }
    }

    public C33966ui() {
        this.f72275i = false;
        ListenerManager.pluginStateListener.addListener(this);
        C33946ti c33946tiM75066a = C33946ti.m75066a();
        if (c33946tiM75066a != null) {
            this.f72275i = c33946tiM75066a.isRunning();
        }
        Logger.INSTANCE.mo77132i("RMonitor_looper_WorkThread", "init isMonitorRunning: " + this.f72275i);
    }

    /* JADX INFO: renamed from: a */
    public void m75208a(boolean z11) {
        if (this.f72275i == z11) {
            return;
        }
        Logger.INSTANCE.mo77130d("RMonitor_looper_WorkThread", "changeRunningState, from [" + this.f72275i + "] to [" + z11 + "]");
        this.f72275i = z11;
        if (this.f72275i) {
            m75214d();
        } else {
            m75215e();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m75207a(b bVar) {
        C33926si.a aVarM75209b;
        if (bVar == null || bVar.f72280c != null || (aVarM75209b = m75209b(bVar.f72279b)) == null) {
            return;
        }
        if (Math.random() < aVarM75209b.f72013b) {
            C33542aa c33542aa = new C33542aa(bVar.f72278a, m75204a(aVarM75209b));
            c33542aa.m72325c();
            bVar.f72280c = c33542aa;
            Logger.INSTANCE.mo77132i("RMonitor_looper_WorkThread", "start monitor looper[" + bVar.f72278a + "]");
            return;
        }
        Logger.INSTANCE.mo77132i("RMonitor_looper_WorkThread", "start monitor looper[" + bVar.f72278a + "] fail for not hit sampling.");
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33856p9
    /* JADX INFO: renamed from: b */
    public void mo74514b(String str, int i11, String str2) {
        if ("work_thread_lag".equals(str) && i11 == 0) {
            m75208a(true);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m75212b(b bVar) {
        C33542aa c33542aa = bVar == null ? null : bVar.f72280c;
        if (c33542aa != null) {
            c33542aa.m72326d();
            Logger logger = Logger.INSTANCE;
            StringBuilder sb2 = new StringBuilder("stop monitor looper[");
            sb2.append(bVar == null ? "" : bVar.f72278a);
            sb2.append("]");
            logger.mo77132i("RMonitor_looper_WorkThread", sb2.toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public final b m75210b(Looper looper) {
        b bVarM75205a;
        synchronized (this.f72276j) {
            try {
                bVarM75205a = m75205a(looper);
                if (bVarM75205a != null) {
                    this.f72276j.remove(bVarM75205a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVarM75205a;
    }

    /* JADX INFO: renamed from: a */
    public final b m75206a(Looper looper, String str) {
        b bVarM75205a;
        synchronized (this) {
            try {
                bVarM75205a = m75205a(looper);
                if (bVarM75205a == null) {
                    bVarM75205a = new b(looper, str);
                    this.f72276j.add(bVarM75205a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVarM75205a;
    }

    /* JADX INFO: renamed from: b */
    public C33926si.a m75209b(String str) {
        C33694hf c33694hf = ConfigProxy.INSTANCE.getConfig().m77072c("work_thread_lag").config;
        C33926si c33926si = c33694hf instanceof C33926si ? (C33926si) c33694hf : null;
        if (c33926si == null) {
            return null;
        }
        return c33926si.m75002a(str);
    }

    /* JADX INFO: renamed from: a */
    public final b m75205a(Looper looper) {
        for (b bVar : this.f72276j) {
            if (bVar.f72278a == looper) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public C33878qa m75204a(C33926si.a aVar) {
        C33878qa c33878qa = new C33878qa();
        c33878qa.f71550a = aVar.f72014c;
        c33878qa.f71551b = aVar.f72015d;
        c33878qa.f71553d = aVar.f72016e;
        c33878qa.f71552c = aVar.f72017f;
        return c33878qa;
    }
}
