package com.tencent.bugly.proguard;

import android.text.TextUtils;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.rmonitor.base.config.C35101b;
import com.tencent.rmonitor.custom.C35153a;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.g5 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33663g5 {
    /* JADX INFO: renamed from: a */
    public static boolean m73146a() {
        AbstractC34022xe abstractC34022xeM77083a = C35101b.c.f75199a.m77083a("crash");
        if (abstractC34022xeM77083a instanceof C33640f3) {
            return ((C33640f3) abstractC34022xeM77083a).m72992b();
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static void m73147b(CrashDetailBean crashDetailBean) {
        if (crashDetailBean == null || TextUtils.isEmpty(crashDetailBean.f68635e)) {
            return;
        }
        String str = crashDetailBean.f68635e;
        if (TextUtils.equals(str, C33591ch.m72746d())) {
            m73141a(crashDetailBean);
        } else {
            m73143a(crashDetailBean, str);
        }
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m73149c(CrashDetailBean crashDetailBean) {
        JSONObject jSONObject;
        if (crashDetailBean == null) {
            return new JSONObject();
        }
        String strM72183a = crashDetailBean.m72183a("user_custom");
        if (TextUtils.isEmpty(strM72183a)) {
            jSONObject = null;
        } else {
            try {
                jSONObject = new JSONObject(strM72183a);
            } catch (JSONException unused) {
                jSONObject = null;
            }
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            m73144a(crashDetailBean, jSONObject, "RDelivery", C35153a.f75231i);
            m73144a(crashDetailBean, jSONObject, CrashDetailBean.f68590E0, C35153a.f75232j);
            m73144a(crashDetailBean, jSONObject, CrashDetailBean.f68589D0, C35153a.f75233k);
        } catch (Throwable unused2) {
        }
        C34012x4.m75434a("[extra data]assemble custom data {%s}", crashDetailBean.f68635e);
        return jSONObject;
    }

    /* JADX INFO: renamed from: d */
    public static String m73150d(CrashDetailBean crashDetailBean) {
        String strM72183a = crashDetailBean.m72183a("stage");
        if (strM72183a == null) {
            return "";
        }
        return strM72183a;
    }

    /* JADX INFO: renamed from: a */
    public static void m73143a(CrashDetailBean crashDetailBean, String str) {
        m73142a(crashDetailBean, C33991w3.m75339a(C33882qe.a.f71576a.m74693a(str, new C33819ne())));
    }

    /* JADX INFO: renamed from: b */
    public static void m73148b(JSONObject jSONObject, CrashDetailBean crashDetailBean) {
        if (jSONObject == null || crashDetailBean == null) {
            return;
        }
        try {
            jSONObject.put("stage", m73150d(crashDetailBean));
            jSONObject.put("user_custom", m73149c(crashDetailBean));
            m73145a(jSONObject, crashDetailBean);
        } catch (Throwable unused) {
        }
        C34012x4.m75434a("[extra data]append extra data to attribute {%s}", crashDetailBean.f68635e);
    }

    /* JADX INFO: renamed from: a */
    public static void m73141a(CrashDetailBean crashDetailBean) {
        String strM73094e = C33657g.m73094e();
        if (!TextUtils.isEmpty(strM73094e)) {
            crashDetailBean.m72184a("stage", strM73094e);
        }
        m73142a(crashDetailBean, C33991w3.m75338a());
    }

    /* JADX INFO: renamed from: a */
    public static void m73142a(CrashDetailBean crashDetailBean, C35153a c35153a) {
        JSONObject jSONObjectM77157e;
        JSONObject jSONObjectM77152c;
        if (crashDetailBean == null || c35153a == null) {
            return;
        }
        if (m73146a()) {
            jSONObjectM77157e = c35153a.m77159g();
            jSONObjectM77152c = c35153a.m77152c();
        } else {
            jSONObjectM77157e = c35153a.m77157e();
            jSONObjectM77152c = null;
        }
        if (jSONObjectM77157e != null) {
            crashDetailBean.m72184a("user_custom", jSONObjectM77157e.toString());
        }
        if (jSONObjectM77152c != null) {
            crashDetailBean.m72184a("extend_info", jSONObjectM77152c.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m73145a(JSONObject jSONObject, CrashDetailBean crashDetailBean) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C33820nf.f71130I);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            String strM72183a = crashDetailBean.m72183a("extend_info");
            if (!TextUtils.isEmpty(strM72183a)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(strM72183a);
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!jSONObjectOptJSONObject.has(next)) {
                            jSONObjectOptJSONObject.put(next, jSONObject2.getString(next));
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            jSONObject.put(C33820nf.f71130I, jSONObjectOptJSONObject);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m73144a(CrashDetailBean crashDetailBean, JSONObject jSONObject, String str, String str2) throws JSONException {
        JSONArray jSONArrayM73140a = m73140a(crashDetailBean.m72183a(str));
        if (jSONArrayM73140a != null) {
            jSONObject.put(str2, jSONArrayM73140a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONArray m73140a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (String str2 : str.split(C33861pe.f71429b)) {
                jSONArray.put(str2);
            }
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
        return jSONArray;
    }
}
