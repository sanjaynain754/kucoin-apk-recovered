package com.tencent.bugly.proguard;

import androidx.annotation.RestrictTo;
import com.tencent.rmonitor.common.logger.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.kb */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C33753kb extends C33694hf {

    /* JADX INFO: renamed from: A */
    public static final float f70617A = 0.1f;

    /* JADX INFO: renamed from: B */
    public static final int f70618B = 30;

    /* JADX INFO: renamed from: C */
    public static final long f70619C = 20;

    /* JADX INFO: renamed from: D */
    public static final long f70620D = 3000;

    /* JADX INFO: renamed from: E */
    public static final long f70621E = 180000;

    /* JADX INFO: renamed from: F */
    public static final long f70622F = 200;

    /* JADX INFO: renamed from: G */
    public static final long f70623G = 52;

    /* JADX INFO: renamed from: H */
    public static final long f70624H = 3000;

    /* JADX INFO: renamed from: I */
    public static final boolean f70625I = true;

    /* JADX INFO: renamed from: J */
    public static final String f70626J = "msg";

    /* JADX INFO: renamed from: K */
    public static final String f70627K = "vsync";

    /* JADX INFO: renamed from: L */
    public static final String f70628L = "msg";

    /* JADX INFO: renamed from: y */
    public static final long f70629y = 5;

    /* JADX INFO: renamed from: z */
    public static final int f70630z = 100;

    /* JADX INFO: renamed from: n */
    public float f70631n;

    /* JADX INFO: renamed from: o */
    public boolean f70632o;

    /* JADX INFO: renamed from: p */
    public boolean f70633p;

    /* JADX INFO: renamed from: q */
    public long f70634q;

    /* JADX INFO: renamed from: r */
    public boolean f70635r;

    /* JADX INFO: renamed from: s */
    public int f70636s;

    /* JADX INFO: renamed from: t */
    public long f70637t;

    /* JADX INFO: renamed from: u */
    public long f70638u;

    /* JADX INFO: renamed from: v */
    public long f70639v;

    /* JADX INFO: renamed from: w */
    public boolean f70640w;

    /* JADX INFO: renamed from: x */
    public String f70641x;

    public C33753kb() {
        super("looper_stack", false, 100, 0.1f, 200);
        this.f70631n = 0.0f;
        this.f70632o = true;
        this.f70633p = false;
        this.f70634q = 52L;
        this.f70635r = true;
        this.f70636s = 30;
        this.f70637t = 20L;
        this.f70638u = 3000L;
        this.f70639v = 180000L;
        this.f70640w = true;
        this.f70641x = "msg";
    }

    @Override // com.tencent.bugly.proguard.C33694hf
    /* JADX INFO: renamed from: a */
    public void mo72626a(C33694hf c33694hf) {
        if (c33694hf == null) {
            return;
        }
        super.mo72626a(c33694hf);
        if (c33694hf instanceof C33753kb) {
            C33753kb c33753kb = (C33753kb) c33694hf;
            this.f70631n = c33753kb.f70631n;
            this.f70633p = c33753kb.f70633p;
            this.f70632o = c33753kb.f70632o;
            this.f70634q = c33753kb.f70634q;
            this.f70635r = c33753kb.f70635r;
            this.f70636s = c33753kb.f70636s;
            this.f70637t = c33753kb.f70637t;
            this.f70638u = c33753kb.f70638u;
            this.f70639v = c33753kb.f70639v;
            this.f70640w = c33753kb.f70640w;
            this.f70641x = c33753kb.f70641x;
        }
    }

    @Override // com.tencent.bugly.proguard.C33694hf
    /* JADX INFO: renamed from: b */
    public C33694hf clone() {
        return new C33753kb(this);
    }

    /* JADX INFO: renamed from: c */
    public boolean m73792c() {
        return this.f70633p;
    }

    /* JADX INFO: renamed from: b */
    public final void m73790b(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("quick_trace_ratio")) {
            this.f70631n = (float) jSONObject.optDouble("quick_trace_ratio");
        }
        if (jSONObject.has("quick_trace_record")) {
            this.f70632o = jSONObject.optBoolean("quick_trace_record");
        }
        if (jSONObject.has("quick_trace_protect")) {
            this.f70633p = jSONObject.optBoolean("quick_trace_protect");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m73791c(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("enable_validate")) {
            this.f70635r = jSONObject.optBoolean("enable_validate");
        }
        if (jSONObject.has("long_lag_slice_count")) {
            int iOptInt = jSONObject.optInt("long_lag_slice_count");
            if (iOptInt <= 0) {
                iOptInt = 30;
            }
            this.f70636s = iOptInt;
        }
        if (jSONObject.has("collect_stack_delay_in_ms")) {
            long jOptLong = jSONObject.optLong("collect_stack_delay_in_ms");
            if (jOptLong <= 0) {
                jOptLong = 20;
            }
            this.f70637t = jOptLong;
        }
        if (jSONObject.has("long_lag_in_ms")) {
            long jOptLong2 = jSONObject.optLong("long_lag_in_ms");
            if (jOptLong2 <= 0) {
                jOptLong2 = 3000;
            }
            this.f70638u = jOptLong2;
        }
        if (jSONObject.has("lag_max_cost_in_ms")) {
            long jOptLong3 = jSONObject.optLong("lag_max_cost_in_ms");
            if (jOptLong3 <= 0) {
                jOptLong3 = 180000;
            }
            this.f70639v = jOptLong3;
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m73793d() {
        return this.f70632o;
    }

    /* JADX INFO: renamed from: e */
    public boolean m73794e() {
        return this.f70635r;
    }

    /* JADX INFO: renamed from: f */
    public long m73795f() {
        return this.f70637t;
    }

    /* JADX INFO: renamed from: g */
    public long m73796g() {
        return this.f70639v;
    }

    /* JADX INFO: renamed from: h */
    public long m73797h() {
        return this.f70638u;
    }

    /* JADX INFO: renamed from: i */
    public int m73798i() {
        return this.f70636s;
    }

    /* JADX INFO: renamed from: j */
    public float m73799j() {
        return this.f70631n;
    }

    /* JADX INFO: renamed from: k */
    public boolean m73800k() {
        return this.f70640w;
    }

    /* JADX INFO: renamed from: l */
    public long m73801l() {
        return this.f70634q;
    }

    public C33753kb(C33753kb c33753kb) {
        super(c33753kb);
        this.f70631n = 0.0f;
        this.f70632o = true;
        this.f70633p = false;
        this.f70634q = 52L;
        this.f70635r = true;
        this.f70636s = 30;
        this.f70637t = 20L;
        this.f70638u = 3000L;
        this.f70639v = 180000L;
        this.f70640w = true;
        this.f70641x = "msg";
        mo72626a(c33753kb);
    }

    @Override // com.tencent.bugly.proguard.C33694hf, com.tencent.bugly.proguard.InterfaceC33814n9
    /* JADX INFO: renamed from: a */
    public void mo72627a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        super.mo72627a(jSONObject);
        try {
            m73790b(jSONObject);
            if (jSONObject.has("stack_interval_ms")) {
                long jOptLong = jSONObject.optLong("stack_interval_ms");
                if (jOptLong < 5) {
                    jOptLong = 5;
                }
                this.f70634q = jOptLong;
            }
            m73791c(jSONObject);
            if (jSONObject.has("suspend_before_get_stack")) {
                this.f70640w = jSONObject.optBoolean("suspend_before_get_stack");
            }
            if (jSONObject.has("detect_strategy")) {
                String strOptString = jSONObject.optString("detect_strategy");
                if ("msg".equals(strOptString)) {
                    this.f70641x = "msg";
                } else if (f70627K.equals(strOptString)) {
                    this.f70641x = f70627K;
                }
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77131e("RMonitor_config", C33799mf.m74131a("LooperConfigParser, t: ", th2));
        }
    }
}
