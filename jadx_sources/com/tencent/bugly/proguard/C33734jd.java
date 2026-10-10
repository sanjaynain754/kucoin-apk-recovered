package com.tencent.bugly.proguard;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.jd */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33734jd extends C33694hf {

    /* JADX INFO: renamed from: t */
    public static final int f70381t = 1000;

    /* JADX INFO: renamed from: u */
    public static final long f70382u = 1000;

    /* JADX INFO: renamed from: v */
    public static final long f70383v = 30;

    /* JADX INFO: renamed from: w */
    public static final long f70384w = 14400;

    /* JADX INFO: renamed from: x */
    public static final long f70385x = 30000;

    /* JADX INFO: renamed from: y */
    public static final int f70386y = 500;

    /* JADX INFO: renamed from: z */
    public static final int f70387z = 5000;

    /* JADX INFO: renamed from: n */
    public long f70388n;

    /* JADX INFO: renamed from: o */
    public long f70389o;

    /* JADX INFO: renamed from: p */
    public long f70390p;

    /* JADX INFO: renamed from: q */
    public int f70391q;

    /* JADX INFO: renamed from: r */
    public int f70392r;

    /* JADX INFO: renamed from: s */
    public int f70393s;

    public C33734jd() {
        super("net_quality", false, 1000, 1.0f, 0.0f, 100);
        this.f70388n = 30000L;
        this.f70389o = 30000L;
        this.f70390p = 30000L;
        this.f70391q = 100;
        this.f70392r = 50;
        this.f70393s = 5000;
    }

    @Override // com.tencent.bugly.proguard.C33694hf
    /* JADX INFO: renamed from: a */
    public void mo72626a(C33694hf c33694hf) {
        super.mo72626a(c33694hf);
        if (c33694hf instanceof C33734jd) {
            C33734jd c33734jd = (C33734jd) c33694hf;
            this.f70388n = c33734jd.f70388n;
            this.f70389o = c33734jd.f70389o;
            this.f70390p = c33734jd.f70390p;
            this.f70391q = c33734jd.f70391q;
            this.f70392r = c33734jd.f70392r;
            this.f70393s = c33734jd.f70393s;
        }
    }

    @Override // com.tencent.bugly.proguard.C33694hf
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C33734jd clone() {
        return new C33734jd(this);
    }

    /* JADX INFO: renamed from: b */
    public void m73557b(JSONObject jSONObject) {
        int iOptInt;
        int iOptInt2;
        if (jSONObject.has("max_batch_count") && (iOptInt2 = jSONObject.optInt("max_batch_count")) > 0 && iOptInt2 <= 1000) {
            this.f70391q = iOptInt2;
        }
        if (jSONObject.has("min_batch_count") && (iOptInt = jSONObject.optInt("min_batch_count")) > 0 && iOptInt <= 1000) {
            this.f70392r = iOptInt;
        }
        int i11 = this.f70392r;
        int i12 = this.f70391q;
        if (i11 > i12) {
            this.f70392r = i12;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m73559c(JSONObject jSONObject) {
        if (jSONObject.has("call_end_delay_when_success")) {
            long jOptLong = jSONObject.optLong("call_end_delay_when_success");
            if (jOptLong >= 30 && jOptLong <= f70384w) {
                this.f70388n = jOptLong * 1000;
            }
        }
        if (jSONObject.has("call_end_delay_when_fail")) {
            long jOptLong2 = jSONObject.optLong("call_end_delay_when_fail");
            if (jOptLong2 >= 30 && jOptLong2 <= f70384w) {
                this.f70389o = jOptLong2 * 1000;
            }
        }
        if (jSONObject.has("call_end_delay_other")) {
            long jOptLong3 = jSONObject.optLong("call_end_delay_other");
            if (jOptLong3 < 30 || jOptLong3 > f70384w) {
                return;
            }
            this.f70390p = jOptLong3 * 1000;
        }
    }

    public String toString() {
        return "{callEndDelayWhenSuccess: " + this.f70388n + ", callEndDelayWhenFail: " + this.f70389o + ", callEndDelayOther: " + this.f70390p + ", maxBatchCount: " + this.f70391q + ", minBatchCount: " + this.f70392r + ", cacheSize: " + this.f70393s + "}";
    }

    public C33734jd(C33734jd c33734jd) {
        super(c33734jd);
        this.f70388n = 30000L;
        this.f70389o = 30000L;
        this.f70390p = 30000L;
        this.f70391q = 100;
        this.f70392r = 50;
        this.f70393s = 5000;
        mo72626a(c33734jd);
    }

    @Override // com.tencent.bugly.proguard.C33694hf, com.tencent.bugly.proguard.InterfaceC33814n9
    /* JADX INFO: renamed from: a */
    public void mo72627a(JSONObject jSONObject) {
        int iOptInt;
        super.mo72627a(jSONObject);
        m73559c(jSONObject);
        m73557b(jSONObject);
        if (!jSONObject.has("cache_size") || (iOptInt = jSONObject.optInt("cache_size")) < 500) {
            return;
        }
        this.f70393s = iOptInt;
    }
}
