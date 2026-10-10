package com.tencent.bugly.proguard;

import com.tencent.rmonitor.common.logger.Logger;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.t2 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33930t2 {

    /* JADX INFO: renamed from: g */
    public static final long f72026g = 1000;

    /* JADX INFO: renamed from: a */
    public JSONObject f72027a = null;

    /* JADX INFO: renamed from: b */
    public int f72028b = 0;

    /* JADX INFO: renamed from: c */
    public String f72029c = null;

    /* JADX INFO: renamed from: d */
    public long f72030d = 0;

    /* JADX INFO: renamed from: e */
    public long f72031e = 0;

    /* JADX INFO: renamed from: f */
    public long f72032f = 0;

    /* JADX INFO: renamed from: a */
    public void m75017a() {
        this.f72027a = null;
        this.f72028b = 0;
        this.f72029c = null;
        this.f72030d = 0L;
        this.f72031e = 0L;
        this.f72032f = 0L;
    }

    public C33930t2() {
        m75017a();
    }

    /* JADX INFO: renamed from: a */
    public void m75018a(C33930t2 c33930t2) {
        if (c33930t2 == null) {
            return;
        }
        this.f72027a = c33930t2.f72027a;
        this.f72028b = c33930t2.f72028b;
        this.f72029c = c33930t2.f72029c;
        this.f72030d = c33930t2.f72030d;
        this.f72031e = c33930t2.f72031e;
        this.f72032f = c33930t2.f72032f;
    }

    /* JADX INFO: renamed from: a */
    public void m75020a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f72032f = System.currentTimeMillis();
        this.f72028b = jSONObject.optInt("status");
        this.f72027a = jSONObject.optJSONObject("data");
        this.f72029c = jSONObject.optString("md5code");
        this.f72030d = jSONObject.optLong("next_time_in_sec", 0L) * 1000;
        this.f72031e = jSONObject.optLong("config_latest_update_time", 0L);
        m75019a("apply result from json");
    }

    /* JADX INFO: renamed from: a */
    public void m75019a(String str) {
        if (Logger.debug) {
            Logger.INSTANCE.mo77130d("RMonitor_config", str + ", status: " + this.f72028b + ", md5code: " + this.f72029c + ", next_time_in_sec: " + (this.f72030d / 1000) + ", config_latest_update_time_in_sec: " + this.f72031e + ", last_load_config_time_in_ms: " + this.f72032f);
        }
    }
}
