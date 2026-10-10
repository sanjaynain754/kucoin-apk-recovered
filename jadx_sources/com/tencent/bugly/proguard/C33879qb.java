package com.tencent.bugly.proguard;

import android.app.Application;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.reporter.IReporter;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.bugly.common.reporter.data.ReportStrategy;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.reporter.ReporterMachine;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.common.util.AppInfo;
import com.tencent.rmonitor.sla.C35186c;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.qb */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33879qb {

    /* JADX INFO: renamed from: b */
    public static C33879qb f71556b = null;

    /* JADX INFO: renamed from: c */
    public static final String f71557c = "RMonitor_MemoryQuantile";

    /* JADX INFO: renamed from: d */
    public static final int f71558d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f71559e = 2;

    /* JADX INFO: renamed from: f */
    public static final int f71560f = 4;

    /* JADX INFO: renamed from: g */
    public static final int f71561g = 8;

    /* JADX INFO: renamed from: h */
    public static final int f71562h = 200000;

    /* JADX INFO: renamed from: a */
    public boolean f71563a = false;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.qb$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements IReporter.ReportCallback {
        public a() {
        }

        @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
        public void onBlocked(int i11) {
            Logger.INSTANCE.mo77130d("RMonitor_MemoryQuantile", "reportQuantileEvent fail for blocked!");
        }

        @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
        public void onCached() {
            Logger.INSTANCE.mo77130d("RMonitor_MemoryQuantile", "reportQuantileEvent fail for cached!");
        }

        @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
        public void onFailure(int i11, @NonNull String str, int i12, int i13) {
            Logger.INSTANCE.mo77131e("RMonitor_MemoryQuantile", "reportQuantileEvent fail! errorCode = " + i11 + ", errorMsg = " + str);
        }

        @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
        public void onSuccess(int i11, int i12) {
            Logger.INSTANCE.mo77130d("RMonitor_MemoryQuantile", "reportQuantileEvent success!");
        }
    }

    /* JADX INFO: renamed from: a */
    public static C33879qb m74680a() {
        if (f71556b == null) {
            synchronized (C33879qb.class) {
                try {
                    if (f71556b == null) {
                        f71556b = new C33879qb();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f71556b;
    }

    /* JADX INFO: renamed from: b */
    public void m74684b() {
        if (this.f71563a) {
            return;
        }
        this.f71563a = true;
        if (HandlerC33544ac.m72327l().m72349m()) {
            try {
                C33691hc c33691hcM72350n = HandlerC33544ac.m72327l().m72350n();
                JSONObject jSONObjectM74681a = m74681a(c33691hcM72350n);
                if (jSONObjectM74681a != null) {
                    Application application = BaseInfo.app;
                    UserMeta userMeta = BaseInfo.userMeta;
                    JSONObject jSONObjectM74303a = C33820nf.m74303a(application, InterfaceC33617e1.f69654c, "memory_quantile", userMeta);
                    m74683a(jSONObjectM74303a, c33691hcM72350n);
                    jSONObjectM74303a.put(C33820nf.f71160p, jSONObjectM74681a);
                    ReportData reportData = new ReportData(userMeta.uin, 1, "QUANTILE_EVENT", jSONObjectM74303a);
                    reportData.getReportStrategy().setUploadStrategy(ReportStrategy.UploadStrategy.UPLOAD_ANY);
                    ReporterMachine.INSTANCE.reportNow(reportData, new a());
                } else {
                    m74682a(c33691hcM72350n.m73269e());
                }
            } catch (Throwable th2) {
                Logger.INSTANCE.exception("RMonitor_MemoryQuantile", th2);
                C34059zb.m75592a(C34059zb.f72629d, th2.toString());
            }
            HandlerC33544ac.m72327l().m72337b(false);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m74682a(C33649fc c33649fc) {
        long jM73053c = c33649fc.m73053c();
        int i11 = jM73053c <= 0 ? 1 : 0;
        long jM73055e = c33649fc.m73055e();
        if (jM73055e <= 0 && BaseInfo.is64Bit.booleanValue()) {
            i11 |= 4;
        }
        if (jM73055e <= 0 && !BaseInfo.is64Bit.booleanValue()) {
            i11 |= 2;
        }
        long jM73046a = c33649fc.m73046a();
        if (jM73046a <= 0) {
            i11 |= 8;
        }
        C35186c.m77234a(InterfaceC33617e1.f69653b, "memory_quantile", String.valueOf(200000 | i11), C33820nf.m74300a(BaseInfo.userMeta), jM73053c + "," + jM73055e + "," + jM73046a);
    }

    /* JADX INFO: renamed from: a */
    public void m74683a(JSONObject jSONObject, C33691hc c33691hc) throws JSONException {
        if (!TextUtils.isEmpty(c33691hc.m73270f())) {
            jSONObject.put("process_launch_id", c33691hc.m73270f());
        }
        if (TextUtils.isEmpty(c33691hc.m73267c())) {
            return;
        }
        jSONObject.put("launch_id", c33691hc.m73267c());
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m74681a(C33691hc c33691hc) throws JSONException {
        if (!c33691hc.m73273i()) {
            return null;
        }
        JSONObject jSONObjectM74304a = C33820nf.m74304a(C33820nf.f71141T);
        jSONObjectM74304a.put("process_name", AppInfo.obtainProcessName(BaseInfo.app));
        jSONObjectM74304a.put("is64bit", BaseInfo.is64Bit);
        c33691hc.m73265a(jSONObjectM74304a);
        Logger.INSTANCE.mo77132i("RMonitor_MemoryQuantile", "makeAttribute, " + jSONObjectM74304a);
        return jSONObjectM74304a;
    }
}
