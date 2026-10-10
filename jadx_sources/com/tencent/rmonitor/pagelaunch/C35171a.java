package com.tencent.rmonitor.pagelaunch;

import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.bugly.proguard.C33591ch;
import com.tencent.bugly.proguard.C33612dh;
import com.tencent.bugly.proguard.C33616e0;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.rmonitor.pagelaunch.a */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
public class C35171a {

    /* JADX INFO: renamed from: i */
    public static final String f75311i = "PageLaunchInfo";

    /* JADX INFO: renamed from: a */
    public final String f75312a;

    /* JADX INFO: renamed from: b */
    public int f75313b;

    /* JADX INFO: renamed from: c */
    public long f75314c;

    /* JADX INFO: renamed from: d */
    public long f75315d;

    /* JADX INFO: renamed from: e */
    public long f75316e;

    /* JADX INFO: renamed from: f */
    public long f75317f;

    /* JADX INFO: renamed from: g */
    public PageLaunchMonitor.ViewTreeObserverOnWindowFocusChangeListenerC35168c f75318g;

    /* JADX INFO: renamed from: h */
    public CopyOnWriteArrayList<C33612dh> f75319h = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: a */
    public void m77208a(String str, String str2) {
        if (m77209a(str)) {
            return;
        }
        this.f75319h.add(new C33612dh(C33591ch.m72746d(), str, m77212c(str2)));
    }

    /* JADX INFO: renamed from: b */
    public void m77211b(String str) {
        if (TextUtils.isEmpty(str)) {
            Logger.INSTANCE.mo77132i(f75311i, "endSpan, spanName is empty.");
            return;
        }
        C33612dh c33612dhM77212c = m77212c(str);
        if (c33612dhM77212c == null) {
            Logger.INSTANCE.mo77132i(f75311i, "endSpan, span[", str, "] not exist.");
        } else {
            c33612dhM77212c.m72861c();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m77213c() {
        this.f75317f = SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: c */
    public final C33612dh m77212c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (C33612dh c33612dh : this.f75319h) {
            if (c33612dh != null && TextUtils.equals(c33612dh.f69621c, str)) {
                return c33612dh;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public JSONObject m77214d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("page_name", PageLaunchMonitor.getInstance().m77204a(this.f75313b, this.f75312a));
            jSONObject.put("render_state", this.f75316e > 0 ? 1 : 0);
            long j11 = this.f75316e;
            long j12 = this.f75314c;
            if (j11 > j12) {
                jSONObject.put("page_render_time", j11 - j12);
            } else {
                jSONObject.put("page_render_time", 0);
            }
            long j13 = this.f75317f;
            long j14 = this.f75314c;
            if (j13 > j14) {
                jSONObject.put("page_load_time", j13 - j14);
            } else {
                long j15 = this.f75316e;
                if (j15 > j14) {
                    jSONObject.put("page_load_time", j15 - j14);
                } else {
                    jSONObject.put("page_load_time", 0);
                }
            }
            JSONArray jSONArray = new JSONArray();
            long jM77207a = m77207a();
            Iterator<C33612dh> it = m77210b().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().m72859a(jM77207a, this.f75315d));
            }
            jSONObject.put(C33616e0.f69645t, jSONArray);
            return jSONObject;
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f75311i, th2);
            return jSONObject;
        }
    }

    public C35171a(int i11, String str) {
        this.f75313b = i11;
        this.f75312a = str;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m77209a(String str) {
        if (TextUtils.isEmpty(str)) {
            Logger.INSTANCE.mo77132i(f75311i, "startSpan, spanName is empty.");
            return true;
        }
        if (m77212c(str) == null) {
            return false;
        }
        Logger.INSTANCE.mo77132i(f75311i, "startSpan, span[", str, "] has appended before.");
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList<C33612dh> m77210b() {
        ArrayList<C33612dh> arrayList = new ArrayList<>();
        for (C33612dh c33612dh : this.f75319h) {
            if (c33612dh.m72860b()) {
                arrayList.add(c33612dh);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final long m77207a() {
        long jM72857a = Long.MAX_VALUE;
        for (C33612dh c33612dh : this.f75319h) {
            if (c33612dh.m72857a() < jM72857a) {
                jM72857a = c33612dh.m72857a();
            }
        }
        return jM72857a;
    }
}
