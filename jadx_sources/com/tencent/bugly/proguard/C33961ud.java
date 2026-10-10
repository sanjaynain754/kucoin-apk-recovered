package com.tencent.bugly.proguard;

import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.reporter.ReporterMachine;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.common.util.AppInfo;
import com.tencent.rmonitor.pagelaunch.C35171a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ud */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33961ud {

    /* JADX INFO: renamed from: a */
    public static final String f72257a = "PageLaunchReporter";

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ud$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ConcurrentHashMap f72258b;

        public a(ConcurrentHashMap concurrentHashMap) {
            this.f72258b = concurrentHashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f72258b.keySet().iterator();
            while (it.hasNext()) {
                C35171a c35171a = (C35171a) this.f72258b.get((Integer) it.next());
                if (C33961ud.m75179b(c35171a)) {
                    arrayList.add(c35171a);
                } else {
                    Logger.INSTANCE.mo77132i(C33961ud.f72257a, "pageLaunchInfo not valid," + c35171a.f75314c + "," + c35171a.f75316e);
                }
            }
            C33961ud.m75178b((ArrayList<C35171a>) arrayList);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m75179b(C35171a c35171a) {
        return (c35171a == null || c35171a.f75314c == 0) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static void m75178b(ArrayList<C35171a> arrayList) {
        try {
            if (arrayList.isEmpty()) {
                Logger.INSTANCE.mo77132i(f72257a, "reportInternal with empty list");
                return;
            }
            JSONObject jSONObjectM74303a = C33820nf.m74303a(BaseInfo.app, InterfaceC33617e1.f69659h, "page_launch", BaseInfo.userMeta);
            if (jSONObjectM74303a == null) {
                return;
            }
            JSONObject jSONObjectM74304a = C33820nf.m74304a(C33820nf.f71140S);
            jSONObjectM74304a.put("process_name", AppInfo.obtainProcessName(BaseInfo.app));
            jSONObjectM74303a.put(C33820nf.f71160p, jSONObjectM74304a);
            JSONArray jSONArray = new JSONArray();
            for (C35171a c35171a : arrayList) {
                if (c35171a != null) {
                    jSONArray.put(c35171a.m77214d());
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pages", jSONArray);
            jSONObjectM74303a.put(C33820nf.f71161q, jSONObject);
            ReportData reportData = new ReportData(BaseInfo.userMeta.uin, 1, "page_launch", jSONObjectM74303a);
            C34011x3.a.f72491a.m75425a(true, reportData);
            ReporterMachine.INSTANCE.reportNow(reportData, null);
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f72257a, "realReport", th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m75176a(ConcurrentHashMap<Integer, C35171a> concurrentHashMap) {
        if (concurrentHashMap.isEmpty()) {
            Logger.INSTANCE.mo77132i(f72257a, "reportNow with empty map");
        } else {
            ThreadManager.runInMonitorThread(new a(concurrentHashMap), 0L);
        }
    }
}
