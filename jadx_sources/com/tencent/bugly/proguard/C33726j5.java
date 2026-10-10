package com.tencent.bugly.proguard;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.j5 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33726j5 extends AbstractC34022xe {

    /* JADX INFO: renamed from: h */
    public static final String f70340h = "exit_file_ratio";

    /* JADX INFO: renamed from: i */
    public static final String f70341i = "application_exit";

    /* JADX INFO: renamed from: f */
    public boolean f70342f = false;

    /* JADX INFO: renamed from: g */
    public double f70343g = 0.0d;

    @Override // com.tencent.bugly.proguard.InterfaceC33814n9
    /* JADX INFO: renamed from: a */
    public void mo72627a(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("enabled")) {
            this.f70342f = jSONObject.getBoolean("enabled");
        }
        if (jSONObject.has(f70340h)) {
            this.f70343g = jSONObject.getDouble(f70340h);
        }
    }

    /* JADX INFO: renamed from: b */
    public double m73523b() {
        return this.f70343g;
    }

    /* JADX INFO: renamed from: c */
    public boolean m73524c() {
        return this.f70342f;
    }

    @Override // com.tencent.bugly.proguard.AbstractC34022xe
    /* JADX INFO: renamed from: a */
    public String mo72774a() {
        return "application_exit";
    }
}
