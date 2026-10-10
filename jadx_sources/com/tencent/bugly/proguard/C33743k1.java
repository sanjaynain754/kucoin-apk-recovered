package com.tencent.bugly.proguard;

import android.app.Application;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.rmonitor.base.config.ConfigProxy;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.reporter.ReporterMachine;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.k1 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33743k1 {

    /* JADX INFO: renamed from: a */
    public static final String f70465a = "BatteryElementReporter";

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ boolean f70466b = true;

    /* JADX INFO: renamed from: a */
    public static JSONObject m73622a() {
        JSONObject jSONObject = new JSONObject();
        C33722j1 c33722j1 = (C33722j1) ConfigProxy.INSTANCE.getConfig().m77076e("battery_element");
        try {
            jSONObject.put("single_location_duration_in_ms", c33722j1.f70312n);
            jSONObject.put("total_location_duration_in_ms", c33722j1.f70313o);
            jSONObject.put("max_location_open_num", c33722j1.f70314p);
            jSONObject.put("single_wakelock_duration_in_ms", c33722j1.f70315q);
            jSONObject.put("total_wakelock_duration_in_ms", c33722j1.f70316r);
            jSONObject.put("max_wakelock_open_num", c33722j1.f70317s);
            jSONObject.put("max_alarm_open_num", c33722j1.f70318t);
            jSONObject.put("max_wakeup_alarm_open_num", c33722j1.f70319u);
            return jSONObject;
        } catch (JSONException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m73626b(ArrayList<AbstractC33988w0> arrayList, ArrayList<AbstractC33988w0> arrayList2, ArrayList<AbstractC33988w0> arrayList3, long j11, long j12) {
        try {
            JSONArray jSONArray = new JSONArray();
            if (!arrayList.isEmpty()) {
                jSONArray.put("single_wake_lock_duration_exceed");
            }
            if (!arrayList2.isEmpty()) {
                jSONArray.put("sum_wake_lock_duration_exceed");
            }
            if (!arrayList3.isEmpty()) {
                jSONArray.put("sum_wake_lock_frequency_exceed");
            }
            HashSet hashSet = new HashSet();
            hashSet.addAll(arrayList);
            hashSet.addAll(arrayList2);
            hashSet.addAll(arrayList3);
            ArrayList arrayList4 = new ArrayList(hashSet);
            JSONArray jSONArray2 = new JSONArray();
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                jSONArray2.put(((AbstractC33988w0) it.next()).mo73209b(j11));
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("element", "wake_lock");
            jSONObject.put("frequency", arrayList4.size());
            jSONObject.put("duration_in_ms", j12);
            jSONObject.put("exception_threshold", m73622a());
            jSONObject.put(C33675gh.f69999e, jSONArray);
            jSONObject.put("stacks", jSONArray2);
            m73625a(jSONObject);
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f70465a, th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m73624a(ArrayList<AbstractC33988w0> arrayList, ArrayList<AbstractC33988w0> arrayList2, ArrayList<AbstractC33988w0> arrayList3, long j11, long j12) {
        try {
            JSONArray jSONArray = new JSONArray();
            if (!arrayList.isEmpty()) {
                jSONArray.put("single_location_duration_exceed");
            }
            if (!arrayList2.isEmpty()) {
                jSONArray.put("sum_location_duration_exceed");
            }
            if (!arrayList3.isEmpty()) {
                jSONArray.put("sum_location_frequency_exceed");
            }
            HashSet hashSet = new HashSet();
            hashSet.addAll(arrayList);
            hashSet.addAll(arrayList2);
            hashSet.addAll(arrayList3);
            ArrayList arrayList4 = new ArrayList(hashSet);
            JSONArray jSONArray2 = new JSONArray();
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                jSONArray2.put(((AbstractC33988w0) it.next()).mo73209b(j11));
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("element", FirebaseAnalytics.Param.LOCATION);
            jSONObject.put("frequency", arrayList4.size());
            jSONObject.put("duration_in_ms", j12);
            jSONObject.put("exception_threshold", m73622a());
            jSONObject.put(C33675gh.f69999e, jSONArray);
            jSONObject.put("stacks", jSONArray2);
            m73625a(jSONObject);
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f70465a, th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m73623a(ArrayList<AbstractC33988w0> arrayList, ArrayList<AbstractC33988w0> arrayList2, long j11) {
        try {
            JSONArray jSONArray = new JSONArray();
            if (!arrayList.isEmpty()) {
                jSONArray.put("sum_alarm_frequency_exceed");
            }
            if (!arrayList2.isEmpty()) {
                jSONArray.put("sum_wakeup_alarm_frequency_exceed");
            }
            JSONArray jSONArray2 = new JSONArray();
            Iterator<AbstractC33988w0> it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray2.put(it.next().mo73209b(j11));
            }
            Iterator<AbstractC33988w0> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(it2.next().mo73209b(j11));
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("element", NotificationCompat.CATEGORY_ALARM);
            jSONObject.put("frequency", arrayList.size());
            jSONObject.put("wakeup_frequency", arrayList2.size());
            jSONObject.put("duration_in_ms", 0);
            jSONObject.put("exception_threshold", m73622a());
            jSONObject.put(C33675gh.f69999e, jSONArray);
            jSONObject.put("stacks", jSONArray2);
            m73625a(jSONObject);
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f70465a, th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m73625a(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectM74304a = C33820nf.m74304a(C33820nf.f71141T);
            try {
                JSONObject jSONObjectM77159g = C33991w3.m75338a().m77159g();
                if (jSONObjectM77159g != null) {
                    jSONObjectM74304a.put("user_custom", jSONObjectM77159g);
                }
            } catch (JSONException e11) {
                Logger.INSTANCE.mo77131e(f70465a, " getUserCustom, msg: " + e11.getMessage());
            }
            Application application = BaseInfo.app;
            UserMeta userMeta = BaseInfo.userMeta;
            JSONObject jSONObjectM74303a = C33820nf.m74303a(application, InterfaceC33617e1.f69660i, "battery_element", userMeta);
            if (!f70466b && jSONObjectM74303a == null) {
                throw new AssertionError();
            }
            jSONObjectM74303a.put(C33820nf.f71160p, jSONObjectM74304a);
            jSONObjectM74303a.put(C33820nf.f71161q, jSONObject);
            ReporterMachine.INSTANCE.reportNow(new ReportData(userMeta.uin, 1, "BatteryElement", jSONObjectM74303a), null);
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f70465a, th2);
        }
    }
}
