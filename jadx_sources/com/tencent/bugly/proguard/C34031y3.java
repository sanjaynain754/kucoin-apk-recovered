package com.tencent.bugly.proguard;

import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.y3 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34031y3 extends C33694hf {

    /* JADX INFO: renamed from: s */
    public static final int f72537s = 100000;

    /* JADX INFO: renamed from: t */
    public static final int f72538t = 20;

    /* JADX INFO: renamed from: u */
    public static final long f72539u = 300;

    /* JADX INFO: renamed from: v */
    public static final int f72540v = 50;

    /* JADX INFO: renamed from: w */
    public static final int f72541w = 50;

    /* JADX INFO: renamed from: x */
    public static final int f72542x = 64;

    /* JADX INFO: renamed from: y */
    public static final int f72543y = 256;

    /* JADX INFO: renamed from: n */
    public final ArrayList<String> f72544n;

    /* JADX INFO: renamed from: o */
    public int f72545o;

    /* JADX INFO: renamed from: p */
    public long f72546p;

    /* JADX INFO: renamed from: q */
    public int f72547q;

    /* JADX INFO: renamed from: r */
    public int f72548r;

    @Override // com.tencent.bugly.proguard.C33694hf
    /* JADX INFO: renamed from: a */
    public void mo72626a(C33694hf c33694hf) {
        super.mo72626a(c33694hf);
        if (c33694hf instanceof C34031y3) {
            C34031y3 c34031y3 = (C34031y3) c33694hf;
            this.f72544n.clear();
            this.f72544n.addAll(c34031y3.f72544n);
            this.f72545o = c34031y3.f72545o;
            this.f72546p = c34031y3.f72546p;
            this.f72547q = c34031y3.f72547q;
            this.f72548r = c34031y3.f72548r;
        }
    }

    @Override // com.tencent.bugly.proguard.C33694hf
    /* JADX INFO: renamed from: b */
    public C33694hf clone() {
        C34031y3 c34031y3 = new C34031y3(this.f70121f);
        c34031y3.mo72626a(this);
        return c34031y3;
    }

    /* JADX INFO: renamed from: c */
    public final void m75479c(JSONObject jSONObject) {
        if (jSONObject.has("dimensions_limit")) {
            int iOptInt = jSONObject.optInt("dimensions_limit", 50);
            if (iOptInt < 0) {
                iOptInt = 50;
            }
            this.f72547q = iOptInt;
        }
        if (jSONObject.has("metrics_limit")) {
            int iOptInt2 = jSONObject.optInt("metrics_limit", 50);
            this.f72548r = iOptInt2 >= 0 ? iOptInt2 : 50;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m75481d(JSONObject jSONObject) {
        if (jSONObject.has("batch_length")) {
            int iOptInt = jSONObject.optInt("batch_length", 20);
            this.f72545o = iOptInt >= 0 ? iOptInt : 20;
        }
        if (jSONObject.has("cache_interval_second")) {
            long jOptLong = jSONObject.optLong("cache_interval_second", 300L);
            this.f72546p = jOptLong >= 0 ? jOptLong : 300L;
        }
    }

    /* JADX INFO: renamed from: e */
    public int m75482e() {
        return this.f72547q;
    }

    /* JADX INFO: renamed from: f */
    public int m75483f() {
        return this.f72548r;
    }

    public C34031y3(String str) {
        super(str, true, 100000, 1.0f);
        this.f72544n = new ArrayList<>();
        this.f72545o = 20;
        this.f72546p = 300L;
        this.f72547q = 50;
        this.f72548r = 50;
    }

    /* JADX INFO: renamed from: b */
    public final void m75477b(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        if (!jSONObject.has(DbParams.TABLE_EVENTS) || (jSONArrayOptJSONArray = jSONObject.optJSONArray(DbParams.TABLE_EVENTS)) == null) {
            return;
        }
        this.f72544n.clear();
        for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
            String string = jSONArrayOptJSONArray.getString(i11);
            if (!TextUtils.isEmpty(string)) {
                this.f72544n.add(string);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public int m75478c() {
        return this.f72545o;
    }

    /* JADX INFO: renamed from: d */
    public long m75480d() {
        return this.f72546p * 1000;
    }

    @Override // com.tencent.bugly.proguard.C33694hf, com.tencent.bugly.proguard.InterfaceC33814n9
    /* JADX INFO: renamed from: a */
    public void mo72627a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        super.mo72627a(jSONObject);
        try {
            m75477b(jSONObject);
            m75481d(jSONObject);
            m75479c(jSONObject);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m75476a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f72544n.contains(str);
    }
}
