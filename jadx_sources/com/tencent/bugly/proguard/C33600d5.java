package com.tencent.bugly.proguard;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.d5 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33600d5 extends AbstractC34022xe {

    /* JADX INFO: renamed from: h */
    public static final String f69503h = "error_report";

    /* JADX INFO: renamed from: i */
    public static final String f69504i = "enabled";

    /* JADX INFO: renamed from: j */
    public static final String f69505j = "disable_error_merge";

    /* JADX INFO: renamed from: f */
    public Boolean f69506f = Boolean.TRUE;

    /* JADX INFO: renamed from: g */
    public boolean f69507g = false;

    @Override // com.tencent.bugly.proguard.AbstractC34022xe
    /* JADX INFO: renamed from: a */
    public String mo72774a() {
        return f69503h;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33814n9
    /* JADX INFO: renamed from: a */
    public void mo72627a(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("enabled")) {
            this.f69506f = Boolean.valueOf(jSONObject.optBoolean("enabled", true));
        }
        if (jSONObject.has(f69505j)) {
            this.f69507g = jSONObject.optBoolean(f69505j, false);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m72775b() {
        return this.f69507g;
    }

    /* JADX INFO: renamed from: c */
    public Boolean m72776c() {
        return this.f69506f;
    }
}
