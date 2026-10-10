package com.tencent.bugly.proguard;

import android.text.TextUtils;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.bugly.common.reporter.data.ReportStrategy;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.rmonitor.base.meta.DropFrameResultMeta;
import com.tencent.rmonitor.base.reporter.ReporterMachine;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.metrics.looper.LooperMetricReportDataBuilder;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.jb */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33732jb implements InterfaceC33730j9 {

    /* JADX INFO: renamed from: l */
    public static final String f70356l = "RMonitor_looper_metric";

    /* JADX INFO: renamed from: m */
    public static final int f70357m = 100;

    /* JADX INFO: renamed from: e */
    public final C33584ca f70358e = new C33584ca();

    /* JADX INFO: renamed from: f */
    public final LooperMetricReportDataBuilder f70359f = new LooperMetricReportDataBuilder();

    /* JADX INFO: renamed from: g */
    public final C33862pf f70360g = new C33862pf();

    /* JADX INFO: renamed from: h */
    public boolean f70361h = true;

    /* JADX INFO: renamed from: i */
    public DropFrameResultMeta f70362i = null;

    /* JADX INFO: renamed from: j */
    public JSONArray f70363j = null;

    /* JADX INFO: renamed from: k */
    public ReportData f70364k = null;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.jb$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DropFrameResultMeta f70365b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f70366c;

        public a(DropFrameResultMeta dropFrameResultMeta, String str) {
            this.f70365b = dropFrameResultMeta;
            this.f70366c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C33732jb.this.m73550c(this.f70365b, this.f70366c);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.jb$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LooperMetricReportDataBuilder looperMetricReportDataBuilder = new LooperMetricReportDataBuilder();
            looperMetricReportDataBuilder.deleteExpiredLooperMetricData();
            List<ReportData> listBuildLooperMetricReportDataAndClearCache = looperMetricReportDataBuilder.buildLooperMetricReportDataAndClearCache();
            if (listBuildLooperMetricReportDataAndClearCache == null || listBuildLooperMetricReportDataAndClearCache.isEmpty()) {
                Logger.INSTANCE.mo77130d("RMonitor_looper_metric", "no looper metric data to report.");
                return;
            }
            for (ReportData reportData : listBuildLooperMetricReportDataAndClearCache) {
                reportData.getReportStrategy().setUploadStrategy(ReportStrategy.UploadStrategy.UPLOAD_ANY);
                ReporterMachine.INSTANCE.reportNow(reportData, null);
            }
            Logger.INSTANCE.mo77130d("RMonitor_looper_metric", "report last launch looper metric data(" + listBuildLooperMetricReportDataAndClearCache.size() + ").");
        }
    }

    /* JADX INFO: renamed from: b */
    public void m73548b() {
        Logger.INSTANCE.mo77130d("RMonitor_looper_metric", InterfaceC33730j9.f70350a);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33730j9
    /* JADX INFO: renamed from: a */
    public void mo73531a(DropFrameResultMeta dropFrameResultMeta, String str) {
        ThreadManager.runInMonitorThread(new a(dropFrameResultMeta, str), 0L);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m73549b(DropFrameResultMeta dropFrameResultMeta, String str) throws JSONException {
        try {
            if (this.f70363j == null) {
                this.f70362i = dropFrameResultMeta;
                JSONArray jSONArray = new JSONArray();
                this.f70363j = jSONArray;
                jSONArray.put(this.f70362i.toJSONObject());
            } else {
                DropFrameResultMeta dropFrameResultMeta2 = this.f70362i;
                if (dropFrameResultMeta2 == null || !TextUtils.equals(dropFrameResultMeta.scene, dropFrameResultMeta2.scene)) {
                    this.f70362i = dropFrameResultMeta;
                    this.f70363j.put(dropFrameResultMeta.toJSONObject());
                } else {
                    this.f70362i.merge(dropFrameResultMeta);
                    JSONArray jSONArray2 = this.f70363j;
                    jSONArray2.put(jSONArray2.length() - 1, this.f70362i.toJSONObject());
                }
            }
            if (this.f70364k == null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C33675gh.f70007m, this.f70363j);
                this.f70364k = this.f70359f.buildReportData("looper_metric", C33591ch.m72741a(C33598d3.m72772c()), C33591ch.f69465f, jSONObject);
            }
            if (!this.f70361h) {
                this.f70360g.mo74451b(this.f70364k);
                if (this.f70363j.length() >= 100) {
                    m73546a();
                }
            } else if (this.f70363j.length() >= 100 || "background".equals(str)) {
                this.f70360g.mo74452c(this.f70364k);
                this.f70364k.getReportStrategy().setUploadStrategy(ReportStrategy.UploadStrategy.UPLOAD_ANY);
                ReporterMachine.INSTANCE.reportNow(this.f70364k, null);
                m73546a();
            } else {
                this.f70360g.mo74451b(this.f70364k);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m73550c(DropFrameResultMeta dropFrameResultMeta, String str) {
        try {
            if (Logger.verbos) {
                dropFrameResultMeta.dump();
            }
            if (this.f70358e.m72665a("looper_metric", dropFrameResultMeta)) {
                this.f70358e.m72666b("looper_metric", dropFrameResultMeta);
                this.f70358e.m72664a(dropFrameResultMeta);
                m73549b(dropFrameResultMeta, str);
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77130d("RMonitor_looper_metric", "onMetaCollectedSync", th2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73547a(C33690hb c33690hb) {
        if (c33690hb != null) {
            this.f70361h = c33690hb.f70096r;
        }
        Logger.INSTANCE.mo77130d("RMonitor_looper_metric", "start, reportBackground: " + this.f70361h);
        ThreadManager.runInMonitorThread(new b(), 0L);
    }

    /* JADX INFO: renamed from: a */
    public final void m73546a() {
        this.f70362i = null;
        this.f70363j = null;
        this.f70364k = null;
    }
}
