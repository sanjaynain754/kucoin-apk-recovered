package com.tencent.bugly.proguard;

import android.app.Application;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.network.NetworkWatcher;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.meta.TrafficInfo;
import com.tencent.rmonitor.base.p144db.table.TrafficInfoTable;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.common.util.AppInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.gh */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33675gh {

    /* JADX INFO: renamed from: A */
    public static final String f69992A = "http";

    /* JADX INFO: renamed from: B */
    public static final String f69993B = "tcp";

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ boolean f69994C = true;

    /* JADX INFO: renamed from: a */
    public static final String f69995a = "TrafficReport";

    /* JADX INFO: renamed from: b */
    public static final String f69996b = "process_name";

    /* JADX INFO: renamed from: c */
    public static final String f69997c = "operator";

    /* JADX INFO: renamed from: d */
    public static final String f69998d = "report_type";

    /* JADX INFO: renamed from: e */
    public static final String f69999e = "exception_type";

    /* JADX INFO: renamed from: f */
    public static final String f70000f = "collect_type";

    /* JADX INFO: renamed from: g */
    public static final String f70001g = "traffic_type";

    /* JADX INFO: renamed from: h */
    public static final String f70002h = "peer_name";

    /* JADX INFO: renamed from: i */
    public static final String f70003i = "front_state";

    /* JADX INFO: renamed from: j */
    public static final String f70004j = "net_type";

    /* JADX INFO: renamed from: k */
    public static final String f70005k = "send";

    /* JADX INFO: renamed from: l */
    public static final String f70006l = "recv";

    /* JADX INFO: renamed from: m */
    public static final String f70007m = "metrics";

    /* JADX INFO: renamed from: n */
    public static final String f70008n = "connection_details";

    /* JADX INFO: renamed from: o */
    public static final String f70009o = "start_time";

    /* JADX INFO: renamed from: p */
    public static final String f70010p = "end_time";

    /* JADX INFO: renamed from: q */
    public static final int f70011q = 1;

    /* JADX INFO: renamed from: r */
    public static final int f70012r = 2;

    /* JADX INFO: renamed from: s */
    public static final int f70013s = 0;

    /* JADX INFO: renamed from: t */
    public static final int f70014t = 1;

    /* JADX INFO: renamed from: u */
    public static final int f70015u = 2;

    /* JADX INFO: renamed from: v */
    public static final int f70016v = 4;

    /* JADX INFO: renamed from: w */
    public static final int f70017w = 8;

    /* JADX INFO: renamed from: x */
    public static final int f70018x = 16;

    /* JADX INFO: renamed from: y */
    public static final String f70019y = "auto";

    /* JADX INFO: renamed from: z */
    public static final String f70020z = "custom";

    /* JADX INFO: renamed from: a */
    public static ReportData m73206a(ArrayList<TrafficInfo> arrayList) {
        try {
            JSONObject jSONObjectM74304a = C33820nf.m74304a(C33820nf.f71141T);
            jSONObjectM74304a.put("process_name", AppInfo.obtainProcessName(BaseInfo.app));
            jSONObjectM74304a.put(f69997c, NetworkWatcher.INSTANCE.getOperatorName());
            jSONObjectM74304a.put("report_type", 1);
            jSONObjectM74304a.put(f69999e, 0);
            jSONObjectM74304a.put(C33820nf.f71135N, arrayList.get(0).getHotPatchNum());
            jSONObjectM74304a.put("user_custom", arrayList.get(0).getUserData());
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (TrafficInfo trafficInfo : arrayList) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(f70000f, trafficInfo.getType());
                if (trafficInfo.getType().equals("custom")) {
                    jSONObject2.put(f70001g, "http");
                } else {
                    jSONObject2.put(f70001g, f69993B);
                }
                jSONObject2.put(f70002h, trafficInfo.getHost());
                jSONObject2.put("front_state", trafficInfo.getFrontState());
                jSONObject2.put("net_type", trafficInfo.getNetState());
                jSONObject2.put(f70005k, trafficInfo.getTx());
                jSONObject2.put(f70006l, trafficInfo.getRx());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put(f70007m, jSONArray);
            Application application = BaseInfo.app;
            UserMeta userMeta = BaseInfo.userMeta;
            JSONObject jSONObjectM74303a = C33820nf.m74303a(application, InterfaceC33617e1.f69660i, "traffic", userMeta);
            if (!f69994C && jSONObjectM74303a == null) {
                throw new AssertionError();
            }
            jSONObjectM74303a.put("process_launch_id", arrayList.get(0).getProcessLaunchID());
            jSONObjectM74303a.put("launch_id", arrayList.get(0).getLaunchID());
            jSONObjectM74303a.put("app_version", arrayList.get(0).getAppVersion());
            jSONObjectM74303a.put("process_name", arrayList.get(0).getProcessName());
            jSONObjectM74303a.put(C33820nf.f71160p, jSONObjectM74304a);
            jSONObjectM74303a.put(C33820nf.f71161q, jSONObject);
            return new ReportData(userMeta.uin, 1, "Traffic", jSONObjectM74303a);
        } catch (Throwable th2) {
            Logger.INSTANCE.exception("TrafficReport", th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList<TrafficInfo> m73208b() {
        return (ArrayList) TrafficInfoTable.getInstance().query(null, "process_name = ? AND process_launch_id != ? ", new String[]{AppInfo.obtainProcessName(BaseInfo.app), C33591ch.m72746d()}, false, null, null, null, null);
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList<ReportData> m73207a() {
        ReportData reportDataM73206a;
        try {
            ArrayList<TrafficInfo> arrayListM73208b = m73208b();
            if (arrayListM73208b != null && !arrayListM73208b.isEmpty()) {
                HashMap map = new HashMap();
                for (TrafficInfo trafficInfo : arrayListM73208b) {
                    if (!map.containsKey(trafficInfo.getProcessLaunchID())) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(trafficInfo);
                        map.put(trafficInfo.getProcessLaunchID(), arrayList);
                    } else {
                        ((ArrayList) map.get(trafficInfo.getProcessLaunchID())).add(trafficInfo);
                    }
                }
                ArrayList<ReportData> arrayList2 = new ArrayList<>();
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    ArrayList arrayList3 = (ArrayList) ((Map.Entry) it.next()).getValue();
                    if (!arrayList3.isEmpty() && (reportDataM73206a = m73206a(arrayList3)) != null) {
                        arrayList2.add(reportDataM73206a);
                    }
                }
                TrafficInfoTable.getInstance().batchDelete(arrayListM73208b);
                return arrayList2;
            }
            return null;
        } catch (Throwable th2) {
            Logger.INSTANCE.exception("TrafficReport", th2);
            return null;
        }
    }
}
