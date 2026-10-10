package com.tencent.bugly.proguard;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.zh */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34065zh extends AbstractC34022xe {

    /* JADX INFO: renamed from: i */
    public static final String f72635i = "userinfo_report";

    /* JADX INFO: renamed from: j */
    public static final String f72636j = "session_enabled";

    /* JADX INFO: renamed from: k */
    public static final String f72637k = "session_threshold";

    /* JADX INFO: renamed from: l */
    public static final String f72638l = "enabled";

    /* JADX INFO: renamed from: f */
    public boolean f72639f = true;

    /* JADX INFO: renamed from: g */
    public boolean f72640g = false;

    /* JADX INFO: renamed from: h */
    public long f72641h = 30000;

    @Override // com.tencent.bugly.proguard.AbstractC34022xe
    /* JADX INFO: renamed from: a */
    public String mo72774a() {
        return f72635i;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33814n9
    /* JADX INFO: renamed from: a */
    public void mo72627a(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("enabled")) {
            this.f72639f = jSONObject.optBoolean("enabled", true);
        }
        if (jSONObject.has(f72636j)) {
            this.f72640g = jSONObject.optBoolean(f72636j, false);
        }
        if (jSONObject.has(f72637k)) {
            this.f72641h = jSONObject.optLong(f72637k, 30000L);
        }
    }

    /* JADX INFO: renamed from: b */
    public long m75602b() {
        return this.f72641h;
    }

    /* JADX INFO: renamed from: c */
    public boolean m75603c() {
        return this.f72640g;
    }

    /* JADX INFO: renamed from: d */
    public boolean m75604d() {
        return this.f72639f;
    }
}
