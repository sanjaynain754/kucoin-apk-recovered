package com.tencent.bugly.proguard;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tencent.rmonitor.common.logger.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.hc */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33691hc {

    /* JADX INFO: renamed from: k */
    public static final String f70098k = "RMonitor_MemoryQuantile";

    /* JADX INFO: renamed from: l */
    public static final String f70099l = "fg_";

    /* JADX INFO: renamed from: m */
    public static final String f70100m = "bg_";

    /* JADX INFO: renamed from: n */
    public static final String f70101n = "stage_";

    /* JADX INFO: renamed from: o */
    public static final String f70102o = "user_custom_";

    /* JADX INFO: renamed from: p */
    public static final String f70103p = "process_launch_id_";

    /* JADX INFO: renamed from: q */
    public static final String f70104q = "launch_id_";

    /* JADX INFO: renamed from: r */
    public static final String f70105r = "java_";

    /* JADX INFO: renamed from: s */
    public static final String f70106s = "pss_";

    /* JADX INFO: renamed from: t */
    public static final String f70107t = "vss_";

    /* JADX INFO: renamed from: a */
    public final String f70108a;

    /* JADX INFO: renamed from: b */
    public final C33649fc f70109b;

    /* JADX INFO: renamed from: c */
    public final C33649fc f70110c;

    /* JADX INFO: renamed from: d */
    public final C33649fc f70111d;

    /* JADX INFO: renamed from: e */
    public String f70112e;

    /* JADX INFO: renamed from: f */
    public String f70113f;

    /* JADX INFO: renamed from: g */
    public String f70114g;

    /* JADX INFO: renamed from: h */
    public String f70115h;

    /* JADX INFO: renamed from: i */
    public String f70116i;

    /* JADX INFO: renamed from: j */
    public String f70117j;

    public C33691hc(String str) {
        this.f70112e = "";
        this.f70113f = "";
        this.f70114g = "";
        this.f70115h = "";
        this.f70116i = "";
        this.f70117j = "";
        this.f70108a = str;
        this.f70109b = new C33649fc("", str);
        this.f70110c = new C33649fc(f70099l, str);
        this.f70111d = new C33649fc(f70100m, str);
        this.f70116i = C33591ch.m72746d();
        this.f70117j = C33591ch.m72741a(C33598d3.m72772c());
    }

    /* JADX INFO: renamed from: a */
    public C33649fc m73259a() {
        return this.f70111d;
    }

    /* JADX INFO: renamed from: a */
    public void m73261a(long j11, long j12, long j13, String str, String str2) {
        this.f70109b.m73047a(j11, j12, j13);
        this.f70110c.m73047a(j11, j12, j13);
        this.f70111d.m73047a(0L, 0L, 0L);
        this.f70112e = str;
        this.f70113f = str;
        this.f70114g = str;
        this.f70115h = str2;
    }

    /* JADX INFO: renamed from: b */
    public C33649fc m73266b() {
        return this.f70110c;
    }

    /* JADX INFO: renamed from: c */
    public String m73267c() {
        return this.f70117j;
    }

    /* JADX INFO: renamed from: d */
    public final String m73268d() {
        return f70104q + this.f70108a;
    }

    /* JADX INFO: renamed from: e */
    public C33649fc m73269e() {
        return this.f70109b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33691hc)) {
            return false;
        }
        C33691hc c33691hc = (C33691hc) obj;
        if (this.f70109b.equals(c33691hc.f70109b) && this.f70110c.equals(c33691hc.f70110c) && this.f70111d.equals(c33691hc.f70111d) && TextUtils.equals(this.f70112e, c33691hc.f70112e) && TextUtils.equals(this.f70113f, c33691hc.f70113f) && TextUtils.equals(this.f70114g, c33691hc.f70114g)) {
            return TextUtils.equals(this.f70115h, c33691hc.f70115h);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public String m73270f() {
        return this.f70116i;
    }

    /* JADX INFO: renamed from: g */
    public final String m73271g() {
        return f70103p + this.f70108a;
    }

    /* JADX INFO: renamed from: h */
    public final String m73272h() {
        return f70102o + this.f70108a;
    }

    /* JADX INFO: renamed from: i */
    public boolean m73273i() {
        return this.f70109b.m73057g();
    }

    /* JADX INFO: renamed from: a */
    public void m73263a(SharedPreferences.Editor editor, String str, String str2, boolean z11, boolean z12, boolean z13) {
        if (z11) {
            this.f70112e = str;
            editor.putString(m73260a(f70105r), str);
        }
        if (z12) {
            this.f70113f = str;
            editor.putString(m73260a(f70106s), str);
        }
        if (z13) {
            this.f70114g = str;
            editor.putString(m73260a(f70107t), str);
        }
        if (TextUtils.equals(this.f70115h, str2)) {
            return;
        }
        this.f70115h = str2;
        editor.putString(m73272h(), str2);
    }

    public C33691hc(C33691hc c33691hc) {
        this.f70112e = "";
        this.f70113f = "";
        this.f70114g = "";
        this.f70115h = "";
        this.f70116i = "";
        this.f70117j = "";
        this.f70108a = c33691hc.f70108a;
        this.f70109b = new C33649fc(c33691hc.f70109b);
        this.f70110c = new C33649fc(c33691hc.f70110c);
        this.f70111d = new C33649fc(c33691hc.f70111d);
        this.f70112e = c33691hc.f70112e;
        this.f70113f = c33691hc.f70113f;
        this.f70114g = c33691hc.f70114g;
        this.f70115h = c33691hc.f70115h;
        this.f70116i = c33691hc.f70116i;
        this.f70117j = c33691hc.f70117j;
    }

    /* JADX INFO: renamed from: a */
    public void m73262a(SharedPreferences.Editor editor) {
        this.f70109b.m73048a(editor);
        this.f70110c.m73048a(editor);
        this.f70111d.m73048a(editor);
        editor.putString(m73260a(f70105r), this.f70112e);
        editor.putString(m73260a(f70106s), this.f70113f);
        editor.putString(m73260a(f70107t), this.f70114g);
        editor.putString(m73272h(), this.f70115h);
        editor.putString(m73271g(), this.f70116i);
        editor.putString(m73268d(), this.f70117j);
        editor.commit();
    }

    /* JADX INFO: renamed from: a */
    public void m73264a(SharedPreferences sharedPreferences) {
        this.f70109b.m73050a(sharedPreferences);
        this.f70110c.m73050a(sharedPreferences);
        this.f70111d.m73050a(sharedPreferences);
        this.f70112e = sharedPreferences.getString(m73260a(f70105r), "");
        this.f70113f = sharedPreferences.getString(m73260a(f70106s), "");
        this.f70114g = sharedPreferences.getString(m73260a(f70107t), "");
        this.f70115h = sharedPreferences.getString(m73272h(), "");
        this.f70117j = sharedPreferences.getString(m73268d(), "");
        this.f70116i = sharedPreferences.getString(m73271g(), "");
    }

    /* JADX INFO: renamed from: a */
    public void m73265a(JSONObject jSONObject) throws JSONException {
        this.f70109b.m73051a(jSONObject);
        this.f70110c.m73051a(jSONObject);
        this.f70111d.m73051a(jSONObject);
        if (!TextUtils.isEmpty(this.f70112e)) {
            jSONObject.put("java_stage", this.f70112e);
        }
        if (!TextUtils.isEmpty(this.f70113f)) {
            jSONObject.put("pss_stage", this.f70113f);
        }
        if (!TextUtils.isEmpty(this.f70114g)) {
            jSONObject.put("vss_stage", this.f70114g);
        }
        if (TextUtils.isEmpty(this.f70115h)) {
            return;
        }
        try {
            jSONObject.put("user_custom", new JSONObject(this.f70115h));
        } catch (Throwable th2) {
            Logger.INSTANCE.exception("RMonitor_MemoryQuantile", "packJson", th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m73260a(String str) {
        return str + f70101n + this.f70108a;
    }
}
