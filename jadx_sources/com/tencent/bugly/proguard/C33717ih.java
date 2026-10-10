package com.tencent.bugly.proguard;

import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.bugly.common.reporter.data.ReportStrategy;
import com.tencent.bugly.traffic.TrafficMonitor;
import com.tencent.bugly.traffic.TrafficMsg;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.reporter.ReporterMachine;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.common.util.AppInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ih */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33717ih {

    /* JADX INFO: renamed from: a */
    public static final String f70294a = "TrafficReport";

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ boolean f70295b = true;

    /* JADX INFO: renamed from: a */
    public static JSONObject m73436a(int i11, ArrayList<TrafficMsg> arrayList, List<AbstractC33615e> list) throws JSONException {
        String str;
        JSONObject jSONObjectM74304a = C33820nf.m74304a(C33820nf.f71141T);
        jSONObjectM74304a.put("process_name", AppInfo.obtainProcessName(BaseInfo.app));
        jSONObjectM74304a.put(C33675gh.f69997c, TrafficMonitor.f72648z);
        jSONObjectM74304a.put("report_type", 2);
        jSONObjectM74304a.put(C33675gh.f69999e, i11);
        if (i11 != 0) {
            C34011x3.a.f72491a.m75424a(jSONObjectM74304a);
            C34011x3.a.f72491a.m75427a(false, "traffic_detail", jSONObjectM74304a);
        } else {
            C34011x3.a.f72491a.m75427a(true, "traffic_detail", jSONObjectM74304a);
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<AbstractC33615e> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            str = C33675gh.f70000f;
            if (!zHasNext) {
                break;
            }
            AbstractC33615e next = it.next();
            for (Map.Entry<String, TrafficMsg> entry : next.m72869b().entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(C33675gh.f70000f, entry.getValue().mCollectType);
                jSONObject2.put(C33675gh.f70001g, C33675gh.f69993B);
                jSONObject2.put(C33675gh.f70002h, entry.getKey());
                jSONObject2.put("front_state", C33738jh.m73568a(next.mo72875f()));
                jSONObject2.put("net_type", C33738jh.m73569b(next.mo72876g()));
                jSONObject2.put(C33675gh.f70005k, entry.getValue().mTx);
                jSONObject2.put(C33675gh.f70006l, entry.getValue().mRx);
                jSONArray.put(jSONObject2);
                it = it;
            }
            Iterator<AbstractC33615e> it2 = it;
            for (Iterator<Map.Entry<String, TrafficMsg>> it3 = next.m72873d().entrySet().iterator(); it3.hasNext(); it3 = it3) {
                Map.Entry<String, TrafficMsg> next2 = it3.next();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(C33675gh.f70000f, next2.getValue().mCollectType);
                jSONObject3.put(C33675gh.f70001g, "http");
                jSONObject3.put(C33675gh.f70002h, next2.getKey());
                jSONObject3.put("front_state", C33738jh.m73568a(next.mo72875f()));
                jSONObject3.put("net_type", C33738jh.m73569b(next.mo72876g()));
                jSONObject3.put(C33675gh.f70005k, next2.getValue().mTx);
                jSONObject3.put(C33675gh.f70006l, next2.getValue().mRx);
                jSONArray.put(jSONObject3);
            }
            it = it2;
        }
        if (jSONArray.length() <= 0) {
            return null;
        }
        jSONObject.put(C33675gh.f70007m, jSONArray);
        if (i11 != 0) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator<TrafficMsg> it4 = arrayList.iterator();
            while (it4.hasNext()) {
                TrafficMsg next3 = it4.next();
                JSONObject jSONObject4 = new JSONObject();
                Iterator<TrafficMsg> it5 = it4;
                jSONObject4.put(str, next3.mCollectType);
                String str2 = str;
                jSONObject4.put(C33675gh.f70001g, next3.mCollectType.equalsIgnoreCase("auto") ? C33675gh.f69993B : "http");
                jSONObject4.put(C33675gh.f70002h, next3.mHost);
                jSONObject4.put("front_state", C33738jh.m73568a(next3.mFore));
                jSONObject4.put("net_type", C33738jh.m73569b(next3.mNet));
                jSONObject4.put(C33675gh.f70005k, next3.mTx);
                jSONObject4.put(C33675gh.f70006l, next3.mRx);
                jSONObject4.put("start_time", 0);
                jSONObject4.put(C33675gh.f70010p, next3.mTime);
                jSONArray2.put(jSONObject4);
                it4 = it5;
                str = str2;
            }
            jSONObject.put(C33675gh.f70008n, jSONArray2);
        }
        JSONObject jSONObjectM74303a = C33820nf.m74303a(BaseInfo.app, InterfaceC33617e1.f69660i, "traffic_detail", BaseInfo.userMeta);
        if (!f70295b && jSONObjectM74303a == null) {
            throw new AssertionError();
        }
        jSONObjectM74303a.put(C33820nf.f71160p, jSONObjectM74304a);
        jSONObjectM74303a.put(C33820nf.f71161q, jSONObject);
        return jSONObjectM74303a;
    }

    /* JADX INFO: renamed from: b */
    public static void m73438b(int i11, ArrayList<TrafficMsg> arrayList, List<AbstractC33615e> list) {
        if (!arrayList.isEmpty()) {
            try {
                JSONObject jSONObjectM73436a = m73436a(i11, arrayList, list);
                if (jSONObjectM73436a != null) {
                    m73437a(jSONObjectM73436a);
                }
            } catch (Throwable th2) {
                Logger.INSTANCE.exception("TrafficReport", th2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m73437a(JSONObject jSONObject) {
        ReportData reportData = new ReportData(BaseInfo.userMeta.uin, 1, "traffic_detail", jSONObject);
        reportData.getReportStrategy().setUploadStrategy(ReportStrategy.UploadStrategy.UPLOAD_ANY);
        ReporterMachine.INSTANCE.reportNow(reportData, null);
    }
}
