package com.tencent.bugly.proguard;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.s3 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33911s3 extends AbstractC34022xe {

    /* JADX INFO: renamed from: h */
    public static final String f71802h = "crash_report";

    /* JADX INFO: renamed from: i */
    public static final String f71803i = "report_with_json";

    /* JADX INFO: renamed from: j */
    public static final String f71804j = "enabled";

    /* JADX INFO: renamed from: k */
    public static boolean f71805k = true;

    /* JADX INFO: renamed from: f */
    public boolean f71806f = f71805k;

    /* JADX INFO: renamed from: g */
    public boolean f71807g = true;

    @Override // com.tencent.bugly.proguard.InterfaceC33814n9
    /* JADX INFO: renamed from: a */
    public void mo72627a(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("enabled")) {
            this.f71807g = jSONObject.optBoolean("enabled", true);
        }
        if (jSONObject.has(f71803i)) {
            this.f71806f = jSONObject.optBoolean(f71803i, f71805k);
        }
    }

    /* JADX INFO: renamed from: b */
    public Boolean m74908b() {
        return Boolean.valueOf(this.f71807g);
    }

    /* JADX INFO: renamed from: c */
    public Boolean m74909c() {
        return Boolean.valueOf(this.f71806f);
    }

    @Override // com.tencent.bugly.proguard.AbstractC34022xe
    /* JADX INFO: renamed from: a */
    public String mo72774a() {
        return f71802h;
    }
}
