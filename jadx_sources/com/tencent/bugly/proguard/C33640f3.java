package com.tencent.bugly.proguard;

import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.rmonitor.common.logger.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.f3 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33640f3 extends AbstractC34022xe {

    /* JADX INFO: renamed from: m */
    public static final String f69794m = "RMonitor_config";

    /* JADX INFO: renamed from: n */
    public static final String f69795n = "cus_file_sample_ratio";

    /* JADX INFO: renamed from: o */
    public static final String f69796o = "log_length";

    /* JADX INFO: renamed from: p */
    public static final String f69797p = "log_before_time";

    /* JADX INFO: renamed from: q */
    public static final String f69798q = "new_userinfo";

    /* JADX INFO: renamed from: r */
    public static final String f69799r = "anr_msg_recorder";

    /* JADX INFO: renamed from: s */
    public static final String f69800s = "native_sub_process";

    /* JADX INFO: renamed from: t */
    public static final String f69801t = "support_load_bias";

    /* JADX INFO: renamed from: u */
    public static final String f69802u = "enable_custom_data";

    /* JADX INFO: renamed from: v */
    public static final String f69803v = "exception_white_list_switch";

    /* JADX INFO: renamed from: w */
    public static final String f69804w = "exception_white_list_str";

    /* JADX INFO: renamed from: x */
    public static final String f69805x = "dump_all_thread_stack";

    /* JADX INFO: renamed from: f */
    public boolean f69806f = false;

    /* JADX INFO: renamed from: g */
    public String f69807g = "";

    /* JADX INFO: renamed from: h */
    public boolean f69808h = false;

    /* JADX INFO: renamed from: i */
    public boolean f69809i = true;

    /* JADX INFO: renamed from: j */
    public int f69810j = 61440;

    /* JADX INFO: renamed from: k */
    public long f69811k = 2;

    /* JADX INFO: renamed from: l */
    public boolean f69812l = true;

    /* JADX INFO: renamed from: a */
    public boolean m72990a(String str, String str2) {
        if (this.f69806f && this.f69807g.length() > 0) {
            for (String str3 : this.f69807g.split(";")) {
                if (str3 != null && str3.split("&").length > 1) {
                    String str4 = str3.split("&")[0];
                    String str5 = str3.split("&")[1];
                    if (str4.equals(str) && str2.contains(str5)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public boolean m72992b() {
        return this.f69812l;
    }

    /* JADX INFO: renamed from: b */
    public final void m72991b(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has(f69795n)) {
            this.f69808h = Math.random() < jSONObject.getDouble(f69795n);
        }
        if (jSONObject.has(f69798q)) {
            this.f69809i = jSONObject.getBoolean(f69798q);
        }
        if (jSONObject.has(f69796o)) {
            this.f69810j = jSONObject.getInt(f69796o);
        }
        if (jSONObject.has(f69797p)) {
            this.f69811k = jSONObject.getLong(f69797p);
        }
        if (jSONObject.has(f69799r)) {
            C33927t.m75008a().m75009a(jSONObject.optBoolean(f69799r, false));
        }
        if (jSONObject.has(f69800s)) {
            C33545ad.m72356b().m72358a(jSONObject.optBoolean(f69800s, false));
        }
        if (jSONObject.has(f69801t)) {
            C33545ad.m72356b().m72360b(jSONObject.optBoolean(f69801t, true));
        }
        if (jSONObject.has(f69802u)) {
            this.f69812l = jSONObject.optBoolean(f69802u);
        }
        if (jSONObject.has(f69805x)) {
            boolean zOptBoolean = jSONObject.optBoolean(f69805x, false);
            NativeCrashHandler.enableNativeDumpAllThreadStack = zOptBoolean;
            NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
            if (nativeCrashHandler != null) {
                C34012x4.m75442d("enableNativeDumpAllThreadStack: " + zOptBoolean, new Object[0]);
                nativeCrashHandler.setNativeEnableDumpAllThread(Boolean.valueOf(zOptBoolean));
            }
        }
        if (jSONObject.has(f69803v)) {
            this.f69806f = jSONObject.optBoolean(f69803v, false);
            NativeCrashHandler nativeCrashHandler2 = NativeCrashHandler.getInstance();
            if (nativeCrashHandler2 != null) {
                C34012x4.m75442d("crashWhiteListEnabled: " + this.f69806f, new Object[0]);
                nativeCrashHandler2.setEnableCrashWhiteList(this.f69806f);
            }
        }
        if (jSONObject.has(f69804w)) {
            this.f69807g = jSONObject.optString(f69804w, "");
            NativeCrashHandler nativeCrashHandler3 = NativeCrashHandler.getInstance();
            if (nativeCrashHandler3 != null) {
                C34012x4.m75442d("userCrashWhiteListStr: " + this.f69807g, new Object[0]);
                nativeCrashHandler3.setCrashWhiteListStr(this.f69807g);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m72993c() {
        return this.f69808h;
    }

    /* JADX INFO: renamed from: d */
    public long m72994d() {
        return this.f69811k;
    }

    /* JADX INFO: renamed from: e */
    public int m72995e() {
        return this.f69810j;
    }

    /* JADX INFO: renamed from: f */
    public boolean m72996f() {
        return this.f69809i;
    }

    /* JADX INFO: renamed from: g */
    public boolean m72997g() {
        return this.f69806f;
    }

    @Override // com.tencent.bugly.proguard.AbstractC34022xe
    /* JADX INFO: renamed from: a */
    public String mo72774a() {
        return "crash";
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33814n9
    /* JADX INFO: renamed from: a */
    public void mo72627a(JSONObject jSONObject) {
        try {
            if (jSONObject == null) {
                Logger.INSTANCE.mo77132i("RMonitor_config", "crash configs is null");
            } else {
                m72991b(jSONObject);
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception("RMonitor_config", "parseCrashConfigs", th2);
        }
    }
}
