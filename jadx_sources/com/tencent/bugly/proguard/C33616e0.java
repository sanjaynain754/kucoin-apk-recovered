package com.tencent.bugly.proguard;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.common.util.AppInfo;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.e0 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33616e0 {

    /* JADX INFO: renamed from: g */
    public static final String f69632g = "AppLaunchResult";

    /* JADX INFO: renamed from: h */
    public static final String f69633h = "cold_launch";

    /* JADX INFO: renamed from: i */
    public static final String f69634i = "warm_launch";

    /* JADX INFO: renamed from: j */
    public static final String f69635j = "tag_pre_launch";

    /* JADX INFO: renamed from: k */
    public static final String f69636k = "tag_normal_launch";

    /* JADX INFO: renamed from: l */
    public static final String f69637l = "tag_first_launch";

    /* JADX INFO: renamed from: m */
    public static final String f69638m = "applicationCreate";

    /* JADX INFO: renamed from: n */
    public static final String f69639n = "firstScreenRender";

    /* JADX INFO: renamed from: o */
    public static final String f69640o = "process_name";

    /* JADX INFO: renamed from: p */
    public static final String f69641p = "launch_type";

    /* JADX INFO: renamed from: q */
    public static final String f69642q = "launch_cost";

    /* JADX INFO: renamed from: r */
    public static final String f69643r = "start_time";

    /* JADX INFO: renamed from: s */
    public static final String f69644s = "tags";

    /* JADX INFO: renamed from: t */
    public static final String f69645t = "spans";

    /* JADX INFO: renamed from: a */
    public final String f69646a;

    /* JADX INFO: renamed from: b */
    public final long f69647b;

    /* JADX INFO: renamed from: c */
    public final long f69648c;

    /* JADX INFO: renamed from: d */
    public final long f69649d;

    /* JADX INFO: renamed from: e */
    public final CopyOnWriteArrayList<C33612dh> f69650e = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: f */
    public final CopyOnWriteArrayList<String> f69651f = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: a */
    public void m72878a(List<C33612dh> list) {
        if (list != null) {
            this.f69650e.clear();
            this.f69650e.addAll(list);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m72879b(List<String> list) {
        if (list != null) {
            this.f69651f.clear();
            this.f69651f.addAll(list);
        }
    }

    /* JADX INFO: renamed from: e */
    public JSONObject m72883e() {
        JSONObject jSONObjectM74303a = null;
        try {
            jSONObjectM74303a = C33820nf.m74303a(BaseInfo.app, InterfaceC33617e1.f69659h, "launch_metric", BaseInfo.userMeta);
            jSONObjectM74303a.put("event_time", this.f69649d / 1000);
            jSONObjectM74303a.put(C33820nf.f71148d, this.f69649d);
            jSONObjectM74303a.put(C33820nf.f71160p, m72882d());
            return jSONObjectM74303a;
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f69632g, "realReport", th2);
            return jSONObjectM74303a;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m72881c() {
        return f69633h.equals(this.f69646a) && this.f69651f.contains(f69635j);
    }

    /* JADX INFO: renamed from: f */
    public final void m72884f() {
        SharedPreferences sharedPreferences = BaseInfo.sharePreference;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString(InterfaceC33611dg.f69603l, BaseInfo.userMeta.appVersion).apply();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("{launchType: ");
        sb2.append(this.f69646a);
        sb2.append(", launchCostInMs: ");
        sb2.append(this.f69647b);
        sb2.append(", tags: [");
        int i11 = 0;
        int i12 = 0;
        for (String str : this.f69651f) {
            if (i12 > 0) {
                sb2.append(",");
            }
            sb2.append(str);
            i12++;
        }
        sb2.append("], spans: [");
        for (C33612dh c33612dh : this.f69650e) {
            if (i11 > 0) {
                sb2.append(",");
            }
            sb2.append(c33612dh);
            i11++;
        }
        sb2.append("]}");
        return sb2.toString();
    }

    public C33616e0(String str, long j11, long j12, long j13) {
        this.f69646a = str;
        this.f69648c = j11;
        this.f69647b = j12;
        this.f69649d = j13;
    }

    /* JADX INFO: renamed from: a */
    public void m72877a() {
        if (f69633h.equals(this.f69646a) && m72880b()) {
            this.f69651f.add(f69637l);
            m72884f();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m72880b() {
        SharedPreferences sharedPreferences = BaseInfo.sharePreference;
        if (sharedPreferences == null) {
            return true;
        }
        return !TextUtils.equals(sharedPreferences.getString(InterfaceC33611dg.f69603l, ""), BaseInfo.userMeta.appVersion);
    }

    /* JADX INFO: renamed from: d */
    public final JSONObject m72882d() throws JSONException {
        JSONObject jSONObjectM74302a = C33820nf.m74302a();
        jSONObjectM74302a.put("process_name", AppInfo.obtainProcessName(BaseInfo.app));
        jSONObjectM74302a.put(f69641p, this.f69646a);
        jSONObjectM74302a.put(f69642q, this.f69647b);
        jSONObjectM74302a.put("start_time", this.f69649d);
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.f69651f.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        jSONObjectM74302a.put(f69644s, jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        Iterator<C33612dh> it2 = this.f69650e.iterator();
        while (it2.hasNext()) {
            jSONArray2.put(it2.next().m72859a(this.f69648c, this.f69649d));
        }
        jSONObjectM74302a.put(f69645t, jSONArray2);
        C33749k7 c33749k7 = C33749k7.d.f70597a;
        long j11 = this.f69649d;
        JSONObject jSONObjectM73733a = c33749k7.m73733a(j11, this.f69647b + j11);
        if (jSONObjectM73733a != null) {
            jSONObjectM74302a.put(C33820nf.f71136O, jSONObjectM73733a);
        }
        return jSONObjectM74302a;
    }
}
