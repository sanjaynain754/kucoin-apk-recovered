package com.tencent.bugly.proguard;

import android.text.TextUtils;
import com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin;
import com.tencent.rmonitor.base.reporter.ReporterMachine;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.manager.RMonitorLauncher;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.a4 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33536a4 {

    /* JADX INFO: renamed from: e */
    public static final String f68795e = "RMonitor_CustomEvent";

    /* JADX INFO: renamed from: f */
    public static final int f68796f = 1000;

    /* JADX INFO: renamed from: g */
    public static final long f68797g = 1800000;

    /* JADX INFO: renamed from: h */
    public static final int f68798h = 0;

    /* JADX INFO: renamed from: i */
    public static final int f68799i = 1;

    /* JADX INFO: renamed from: j */
    public static final int f68800j = 2;

    /* JADX INFO: renamed from: k */
    public static volatile C33536a4 f68801k;

    /* JADX INFO: renamed from: b */
    public long f68803b = 0;

    /* JADX INFO: renamed from: c */
    public int f68804c = 0;

    /* JADX INFO: renamed from: d */
    public C34051z3 f68805d = null;

    /* JADX INFO: renamed from: a */
    public final ConcurrentLinkedQueue<JSONObject> f68802a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: c */
    public static C33536a4 m72292c() {
        if (f68801k == null) {
            synchronized (C33536a4.class) {
                try {
                    if (f68801k == null) {
                        f68801k = new C33536a4();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f68801k;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m72293a(long j11, String str, Map<String, Double> map, Map<String, String> map2) {
        if (TextUtils.isEmpty(str) || str.length() > 64) {
            Logger.INSTANCE.mo77130d("RMonitor_CustomEvent", String.format("event_name{%s} is invalid", str));
            return null;
        }
        if (m72300b(map) && m72297a(map2)) {
            return m72301c(j11, str, map, map2);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m72299b(long j11, String str, Map<String, Double> map, Map<String, String> map2) {
        JSONObject jSONObjectM72293a;
        if (1 == this.f68804c || (jSONObjectM72293a = m72293a(j11, str, map, map2)) == null) {
            return false;
        }
        if (this.f68804c == 0) {
            m72294a();
        }
        boolean zM72296a = m72296a(str, jSONObjectM72293a);
        if (zM72296a) {
            Logger.INSTANCE.mo77130d("RMonitor_CustomEvent", String.format("event_name{%s} is appended/cached.", str));
            return zM72296a;
        }
        Logger.INSTANCE.mo77130d("RMonitor_CustomEvent", String.format("event_name{%s} is discarded.", str));
        return zM72296a;
    }

    /* JADX INFO: renamed from: d */
    public int m72302d() {
        C34031y3 c34031y3M75584d;
        C34051z3 c34051z3 = this.f68805d;
        if (c34051z3 == null || (c34031y3M75584d = c34051z3.m75584d()) == null) {
            return 50;
        }
        return c34031y3M75584d.m75482e();
    }

    /* JADX INFO: renamed from: e */
    public int m72303e() {
        C34031y3 c34031y3M75584d;
        C34051z3 c34051z3 = this.f68805d;
        if (c34051z3 == null || (c34031y3M75584d = c34051z3.m75584d()) == null) {
            return 50;
        }
        return c34031y3M75584d.m75483f();
    }

    /* JADX INFO: renamed from: f */
    public final void m72304f() {
        C34051z3 c34051z3 = this.f68805d;
        if (c34051z3 != null) {
            while (!this.f68802a.isEmpty()) {
                try {
                    JSONObject jSONObjectPoll = this.f68802a.poll();
                    if (c34051z3.m75583c(jSONObjectPoll.optString("event_name"))) {
                        c34051z3.m75579a(jSONObjectPoll);
                    }
                } catch (Throwable unused) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m72296a(String str, JSONObject jSONObject) {
        int i11 = this.f68804c;
        if (2 == i11) {
            C34051z3 c34051z3 = this.f68805d;
            if (c34051z3 == null || !c34051z3.m75583c(str)) {
                return false;
            }
            c34051z3.m75579a(jSONObject);
            return true;
        }
        if (1 == i11) {
            m72298b();
            return false;
        }
        if (i11 != 0) {
            return false;
        }
        try {
            if (this.f68802a.size() >= 1000) {
                return false;
            }
            this.f68802a.offer(jSONObject);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public JSONObject m72301c(long j11, String str, Map<String, Double> map, Map<String, String> map2) {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("event_name", str);
                jSONObject.put(C33820nf.f71148d, j11);
                if (map != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, Double> entry : map.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    }
                    jSONObject.put(C33675gh.f70007m, jSONObject2);
                }
                if (map2 == null) {
                    return jSONObject;
                }
                JSONObject jSONObject3 = new JSONObject();
                for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                    jSONObject3.put(entry2.getKey(), entry2.getValue());
                }
                jSONObject.put("dimensions", jSONObject3);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m72298b() {
        try {
            if (this.f68802a.size() > 0) {
                this.f68802a.clear();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m72300b(Map<String, Double> map) {
        if (map == null) {
            return true;
        }
        if (map.size() > m72303e()) {
            Logger.INSTANCE.mo77130d("RMonitor_CustomEvent", String.format("size of metrics is over limit {%d}", Integer.valueOf(map.size())));
            return false;
        }
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key) && key.length() <= 64) {
                Double value = entry.getValue();
                if (value == null) {
                    Logger.INSTANCE.mo77130d("RMonitor_CustomEvent", String.format("value of key{%s} is null", key));
                    return false;
                }
                if (value.isInfinite() || value.isNaN()) {
                    Logger.INSTANCE.mo77130d("RMonitor_CustomEvent", String.format("value of key{%s} is invalid", key));
                    return false;
                }
            } else {
                Logger.INSTANCE.mo77130d("RMonitor_CustomEvent", String.format("key{%s} is invalid", key));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m72295a(C34051z3 c34051z3, boolean z11) {
        if (z11) {
            this.f68805d = c34051z3;
            this.f68804c = 2;
            m72304f();
            Logger.INSTANCE.mo77130d("RMonitor_CustomEvent", "custom event monitor is enabled.");
        } else {
            this.f68805d = null;
            this.f68804c = 1;
            m72298b();
            Logger.INSTANCE.mo77130d("RMonitor_CustomEvent", "custom event monitor is disabled.");
        }
        Logger.INSTANCE.mo77130d("RMonitor_CustomEvent", String.format("custom event monitor's state is %d", Integer.valueOf(this.f68804c)));
    }

    /* JADX INFO: renamed from: a */
    public final void m72294a() {
        if (ReporterMachine.INSTANCE.isStart()) {
            QAPMMonitorPlugin plugin = RMonitorLauncher.INSTANCE.getPlugin("custom_event", false);
            if (plugin instanceof C34051z3) {
                m72295a((C34051z3) plugin, true);
                return;
            } else {
                m72295a((C34051z3) null, false);
                return;
            }
        }
        if (this.f68803b == 0) {
            this.f68803b = System.currentTimeMillis();
        }
        if (Math.abs(System.currentTimeMillis() - this.f68803b) > f68797g) {
            m72295a((C34051z3) null, false);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m72297a(Map<String, String> map) {
        if (map == null) {
            return true;
        }
        if (map.size() > m72302d()) {
            Logger.INSTANCE.mo77130d("RMonitor_CustomEvent", String.format("size of dimensions is over limit {%d}", Integer.valueOf(map.size())));
            return false;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key) && key.length() <= 64) {
                String value = entry.getValue();
                if (TextUtils.isEmpty(value) || value.length() > 256) {
                    Logger.INSTANCE.mo77130d("RMonitor_CustomEvent", String.format("value{%s} of key{%s} is invalid", value, key));
                    return false;
                }
            } else {
                Logger.INSTANCE.mo77130d("RMonitor_CustomEvent", String.format("key{%s} is invalid", key));
                return false;
            }
        }
        return true;
    }
}
