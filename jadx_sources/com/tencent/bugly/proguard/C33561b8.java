package com.tencent.bugly.proguard;

import androidx.annotation.NonNull;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.reporter.ReporterMachine;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.b8 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33561b8 implements InterfaceC33540a8 {

    /* JADX INFO: renamed from: g */
    public static final String f69153g = "RMonitor_net_quality_dealer";

    /* JADX INFO: renamed from: h */
    public static final String f69154h = "list";

    /* JADX INFO: renamed from: i */
    public static final int f69155i = 0;

    /* JADX INFO: renamed from: j */
    public static final int f69156j = 1;

    /* JADX INFO: renamed from: b */
    public final C33734jd f69158b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC33841of f69159c;

    /* JADX INFO: renamed from: d */
    public ReportData f69160d = null;

    /* JADX INFO: renamed from: e */
    public int f69161e = 0;

    /* JADX INFO: renamed from: f */
    public Runnable f69162f = null;

    /* JADX INFO: renamed from: a */
    public final ConcurrentLinkedQueue<C34055z7> f69157a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.b8$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C33561b8.this.m72490b();
            C33561b8.this.f69162f = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m72490b() {
        C33734jd c33734jd = this.f69158b;
        m72491b(c33734jd.f70391q, c33734jd.f70392r);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33540a8
    /* JADX INFO: renamed from: a */
    public void mo72320a(C34055z7 c34055z7) {
        if (c34055z7 == null) {
            return;
        }
        this.f69157a.offer(c34055z7);
        if (this.f69157a.size() >= this.f69158b.f70391q) {
            m72486a("meet maxBatchCount");
        }
    }

    /* JADX INFO: renamed from: b */
    public void m72491b(int i11, int i12) {
        if (i11 <= 0 || i12 < 0 || i11 < i12 || this.f69157a.isEmpty() || m72482a(i11, i12) == 1) {
            return;
        }
        ArrayList<C34055z7> arrayList = new ArrayList<>();
        int size = (this.f69157a.size() / i11) + 1;
        boolean zM72489a = false;
        for (int i13 = 0; !zM72489a && i13 < size && !this.f69157a.isEmpty(); i13++) {
            m72487a(arrayList, i11);
            zM72489a = arrayList.isEmpty() ? true : m72489a(i12, arrayList);
        }
    }

    public C33561b8(@NonNull C33734jd c33734jd, InterfaceC33841of interfaceC33841of) {
        this.f69158b = c33734jd;
        this.f69159c = interfaceC33841of;
        if (Logger.verbos) {
            Logger.INSTANCE.mo77133v(f69153g, "config: " + c33734jd);
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33540a8
    /* JADX INFO: renamed from: a */
    public C33734jd mo72319a() {
        return this.f69158b;
    }

    /* JADX INFO: renamed from: a */
    public void m72486a(String str) {
        if (this.f69162f != null) {
            Logger.INSTANCE.mo77130d(f69153g, "try report or cache data fail for last task not finish.");
            return;
        }
        Logger.INSTANCE.mo77130d(f69153g, C33770l7.m73937a("try report or cache data for ", str));
        a aVar = new a();
        this.f69162f = aVar;
        ThreadManager.runInMonitorThread(aVar, 0L);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m72489a(int i11, ArrayList<C34055z7> arrayList) {
        int size = arrayList.size();
        ReportData reportDataM72483a = m72483a(arrayList, BaseInfo.userMeta);
        if (reportDataM72483a == null) {
            return true;
        }
        if (size >= i11) {
            m72484a(reportDataM72483a);
            return false;
        }
        this.f69160d = reportDataM72483a;
        this.f69161e = size;
        this.f69159c.mo74453d(reportDataM72483a);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public int m72482a(int i11, int i12) {
        ReportData reportData = this.f69160d;
        if (reportData == null) {
            return 0;
        }
        int i13 = i11 - this.f69161e;
        if (i13 >= 0) {
            ArrayList<C34055z7> arrayList = new ArrayList<>();
            m72487a(arrayList, i13);
            m72485a(reportData, arrayList);
            this.f69161e = arrayList.size() + this.f69161e;
        }
        if (this.f69161e >= i12) {
            this.f69159c.mo74452c(reportData);
            m72484a(reportData);
            this.f69160d = null;
            this.f69161e = 0;
            return 0;
        }
        this.f69159c.mo74451b(reportData);
        return 1;
    }

    /* JADX INFO: renamed from: a */
    public void m72485a(ReportData reportData, List<C34055z7> list) {
        if (reportData == null) {
            return;
        }
        m72488a(reportData.getParams(), list);
    }

    /* JADX INFO: renamed from: a */
    public void m72488a(JSONObject jSONObject, List<C34055z7> list) {
        if (jSONObject == null || list == null || list.isEmpty()) {
            return;
        }
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C33820nf.f71161q);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
                jSONObject.put(C33820nf.f71161q, jSONObjectOptJSONObject);
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("list");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObjectOptJSONObject.put("list", jSONArrayOptJSONArray);
            }
            Iterator<C34055z7> it = list.iterator();
            while (it.hasNext()) {
                jSONArrayOptJSONArray.put(it.next().f72623m);
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77131e(f69153g, "appendData fail for " + th2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m72487a(@NonNull ArrayList<C34055z7> arrayList, int i11) {
        arrayList.clear();
        for (int i12 = 0; i12 < i11 && !this.f69157a.isEmpty(); i12++) {
            C34055z7 c34055z7Poll = this.f69157a.poll();
            if (c34055z7Poll == null) {
                return;
            }
            arrayList.add(c34055z7Poll);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m72484a(ReportData reportData) {
        Logger.INSTANCE.mo77130d(f69153g, "realReport, id: " + reportData.getDbId());
        ReporterMachine.INSTANCE.reportNow(reportData, null);
    }

    /* JADX INFO: renamed from: a */
    public ReportData m72483a(List<C34055z7> list, UserMeta userMeta) {
        if (list == null || list.isEmpty() || userMeta == null) {
            return null;
        }
        JSONObject jSONObjectM74303a = C33820nf.m74303a(C33598d3.m72772c(), InterfaceC33617e1.f69660i, "net_quality", userMeta);
        if (jSONObjectM74303a == null) {
            Logger.INSTANCE.mo77130d(f69153g, "makeReportData fail for param is null.");
            return null;
        }
        try {
            Iterator<C34055z7> it = list.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                z11 |= it.next().f72618h;
            }
            jSONObjectM74303a.put(C33820nf.f71158n, z11 ? "translate" : "none");
            JSONObject jSONObjectM74304a = C33820nf.m74304a(C33820nf.f71141T);
            C34011x3.a.f72491a.m75424a(jSONObjectM74304a);
            C34011x3.a.f72491a.m75427a(true, "net_quality", jSONObjectM74304a);
            jSONObjectM74303a.put(C33820nf.f71160p, jSONObjectM74304a);
            m72488a(jSONObjectM74303a, list);
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77130d(f69153g, "makeReportData fail for " + th2.getMessage());
        }
        ReportData reportData = new ReportData(userMeta.uin, 1, "net_quality", jSONObjectM74303a);
        reportData.setShouldRecordLinkData(false);
        return reportData;
    }
}
