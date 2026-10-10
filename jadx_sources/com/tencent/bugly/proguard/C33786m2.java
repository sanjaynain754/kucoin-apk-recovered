package com.tencent.bugly.proguard;

import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.m2 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33786m2 extends C33694hf {

    /* JADX INFO: renamed from: A */
    public static final String f70891A = "fragment_life_monitor";

    /* JADX INFO: renamed from: t */
    public static final String f70892t = "common";

    /* JADX INFO: renamed from: u */
    public static final String f70893u = "suspend_thread_feature";

    /* JADX INFO: renamed from: v */
    public static final String f70894v = "enable_oom_hprof";

    /* JADX INFO: renamed from: w */
    public static final String f70895w = "enable_gc_info";

    /* JADX INFO: renamed from: x */
    public static final String f70896x = "ignore_origin_printer";

    /* JADX INFO: renamed from: y */
    public static final String f70897y = "enable_encrypt_attachment";

    /* JADX INFO: renamed from: z */
    public static final String f70898z = "enable_new_anr_scheme";

    /* JADX INFO: renamed from: n */
    public boolean f70899n;

    /* JADX INFO: renamed from: o */
    public boolean f70900o;

    /* JADX INFO: renamed from: p */
    public boolean f70901p;

    /* JADX INFO: renamed from: q */
    public boolean f70902q;

    /* JADX INFO: renamed from: r */
    public boolean f70903r;

    /* JADX INFO: renamed from: s */
    public boolean f70904s;

    @Override // com.tencent.bugly.proguard.C33694hf, com.tencent.bugly.proguard.InterfaceC33814n9
    /* JADX INFO: renamed from: a */
    public void mo72627a(JSONObject jSONObject) {
        if (jSONObject.has(f70893u)) {
            this.f70899n = jSONObject.optBoolean(f70893u, false);
        }
        if (jSONObject.has(f70894v)) {
            this.f70900o = jSONObject.optBoolean(f70894v, false);
        }
        if (jSONObject.has(f70895w)) {
            this.f70901p = jSONObject.optBoolean(f70895w, false);
        }
        if (jSONObject.has(f70896x)) {
            this.f70902q = jSONObject.optBoolean(f70896x, false);
        }
        if (jSONObject.has(f70897y)) {
            this.f70903r = jSONObject.optBoolean(f70897y, false);
        }
        if (jSONObject.has(f70898z)) {
            this.f70904s = jSONObject.optBoolean(f70898z, false);
        }
        if (jSONObject.has(f70891A) && jSONObject.optBoolean(f70891A, false)) {
            LifecycleCallback.enableFragmentLifecycleMonitor();
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m74020c() {
        return this.f70902q;
    }

    /* JADX INFO: renamed from: d */
    public boolean m74021d() {
        return this.f70903r;
    }

    /* JADX INFO: renamed from: e */
    public boolean m74022e() {
        return this.f70901p;
    }

    /* JADX INFO: renamed from: f */
    public boolean m74023f() {
        return this.f70904s;
    }

    /* JADX INFO: renamed from: g */
    public boolean m74024g() {
        return this.f70900o;
    }

    /* JADX INFO: renamed from: h */
    public boolean m74025h() {
        return this.f70899n;
    }

    public C33786m2(String str) {
        super(str);
        this.f70899n = false;
        this.f70900o = false;
        this.f70901p = false;
        this.f70902q = false;
        this.f70903r = false;
        this.f70904s = false;
    }

    @Override // com.tencent.bugly.proguard.C33694hf, com.tencent.bugly.proguard.AbstractC34022xe
    /* JADX INFO: renamed from: a */
    public String mo72774a() {
        return f70892t;
    }
}
