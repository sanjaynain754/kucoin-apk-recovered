package com.tencent.bugly.proguard;

import android.app.Application;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.bugly.common.reporter.data.ReportStrategy;
import com.tencent.rmonitor.base.config.ConfigProxy;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.reporter.ReporterMachine;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import com.tencent.rmonitor.common.logger.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.z3 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34051z3 extends AbstractC33610df {

    /* JADX INFO: renamed from: h */
    public static final String f72587h = "RMonitor_CustomEvent";

    /* JADX INFO: renamed from: b */
    public boolean f72588b = false;

    /* JADX INFO: renamed from: c */
    public C33758kg f72589c = null;

    /* JADX INFO: renamed from: d */
    public ReportData f72590d = null;

    /* JADX INFO: renamed from: e */
    public JSONArray f72591e = null;

    /* JADX INFO: renamed from: f */
    public C34031y3 f72592f = null;

    /* JADX INFO: renamed from: g */
    public Runnable f72593g = null;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.z3$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a extends C33758kg {
        public a() {
        }

        @Override // com.tencent.bugly.proguard.C33758kg, com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
        public void onBackground() {
            C34051z3.this.m75581b("onBackground");
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.z3$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C34051z3 c34051z3 = C34051z3.this;
                JSONArray jSONArray = c34051z3.f72591e;
                ReportData reportData = c34051z3.f72590d;
                if (reportData != null && jSONArray != null) {
                    Logger.INSTANCE.mo77130d("RMonitor_CustomEvent", "cacheEvents, cacheEvent: " + jSONArray.length());
                    new C33862pf().mo74451b(reportData);
                }
            } catch (Throwable unused) {
            }
            C34051z3.this.f72593g = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m75583c(String str) {
        C34031y3 c34031y3 = this.f72592f;
        return c34031y3 != null && c34031y3.m75476a(str);
    }

    /* JADX INFO: renamed from: b */
    public void m75581b(String str) {
        JSONArray jSONArray = this.f72591e;
        ReportData reportData = this.f72590d;
        this.f72590d = null;
        this.f72591e = null;
        if (reportData == null || jSONArray == null) {
            return;
        }
        try {
            Logger.INSTANCE.mo77130d("RMonitor_CustomEvent", "reportEvent, reason: " + str + ", event_count: " + jSONArray.length());
            reportData.getReportStrategy().setUploadStrategy(ReportStrategy.UploadStrategy.UPLOAD_ANY);
            ReporterMachine.INSTANCE.reportNow(reportData, null);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public C34031y3 m75584d() {
        return this.f72592f;
    }

    @Override // com.tencent.bugly.proguard.AbstractC33610df
    public String getPluginName() {
        return "custom_event";
    }

    @Override // com.tencent.bugly.proguard.AbstractC33610df
    public boolean isRunning() {
        return this.f72588b;
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void start() {
        if (this.f72588b) {
            return;
        }
        Logger.INSTANCE.mo77130d("RMonitor_CustomEvent", "start CustomEventMonitor");
        this.f72588b = true;
        if (this.f72589c == null) {
            this.f72589c = new a();
        }
        LifecycleCallback.register(this.f72589c);
        C33694hf c33694hfM77076e = ConfigProxy.INSTANCE.getConfig().m77076e("custom_event");
        if (c33694hfM77076e instanceof C34031y3) {
            this.f72592f = (C34031y3) c33694hfM77076e;
        }
        C33536a4.m72292c().m72295a(this, true);
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void stop() {
        if (this.f72588b) {
            Logger.INSTANCE.mo77130d("RMonitor_CustomEvent", "stop CustomEventMonitor");
            this.f72588b = false;
            C33758kg c33758kg = this.f72589c;
            if (c33758kg != null) {
                LifecycleCallback.unRegister(c33758kg);
            }
            C33536a4.m72292c().m72295a(this, false);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m75579a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        ReportData reportData = this.f72590d;
        JSONArray jSONArray = this.f72591e;
        if (reportData == null || jSONArray == null) {
            try {
                Application application = BaseInfo.app;
                UserMeta userMeta = BaseInfo.userMeta;
                JSONObject jSONObjectM74303a = C33820nf.m74303a(application, InterfaceC33617e1.f69654c, "custom_event", userMeta);
                if (jSONObjectM74303a != null) {
                    JSONObject jSONObjectM74304a = C33820nf.m74304a(C33820nf.f71140S);
                    JSONArray jSONArray2 = new JSONArray();
                    try {
                        jSONObjectM74304a.put("event_infos", jSONArray2);
                        jSONObjectM74303a.put(C33820nf.f71160p, jSONObjectM74304a);
                        reportData = new ReportData(userMeta.uin, 1, "custom_event", jSONObjectM74303a);
                        jSONArray = jSONArray2;
                    } catch (Throwable th2) {
                        th = th2;
                        jSONArray = jSONArray2;
                        Logger.INSTANCE.mo77130d("RMonitor_CustomEvent", "add event fail for " + th.getMessage());
                    }
                } else {
                    Logger.INSTANCE.mo77130d("RMonitor_CustomEvent", "add event fail for params is null.");
                }
            } catch (Throwable th3) {
                th = th3;
            }
            this.f72591e = jSONArray;
            this.f72590d = reportData;
        }
        if (jSONArray != null) {
            try {
                jSONArray.put(jSONObject);
            } catch (Throwable unused) {
            }
            if (jSONArray.length() >= m75580b()) {
                m75581b("meet_batch_count");
            } else {
                m75578a();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public long m75582c() {
        C34031y3 c34031y3 = this.f72592f;
        if (c34031y3 == null) {
            return 300000L;
        }
        return c34031y3.m75480d();
    }

    /* JADX INFO: renamed from: b */
    public int m75580b() {
        C34031y3 c34031y3 = this.f72592f;
        if (c34031y3 == null) {
            return 20;
        }
        return c34031y3.m75478c();
    }

    /* JADX INFO: renamed from: a */
    public void m75578a() {
        if (this.f72593g != null) {
            return;
        }
        b bVar = new b();
        this.f72593g = bVar;
        ReporterMachine.INSTANCE.postDelayed(bVar, m75582c());
    }
}
