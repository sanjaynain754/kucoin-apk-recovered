package com.tencent.bugly.proguard;

import com.tencent.rmonitor.common.logger.Logger;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.hb */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33690hb extends C33694hf {

    /* JADX INFO: renamed from: t */
    public static final String f70089t = "list_metric";

    /* JADX INFO: renamed from: u */
    public static final String f70090u = "FrameCallback";

    /* JADX INFO: renamed from: v */
    public static final String f70091v = "FrameMetric";

    /* JADX INFO: renamed from: n */
    public boolean f70092n;

    /* JADX INFO: renamed from: o */
    public boolean f70093o;

    /* JADX INFO: renamed from: p */
    public String f70094p;

    /* JADX INFO: renamed from: q */
    public long f70095q;

    /* JADX INFO: renamed from: r */
    public boolean f70096r;

    /* JADX INFO: renamed from: s */
    public String f70097s;

    public C33690hb(String str) {
        super(str, false, 1000, 0.0f, 200);
        this.f70092n = true;
        this.f70093o = true;
        this.f70094p = null;
        this.f70095q = 3000L;
        this.f70096r = true;
        this.f70097s = f70090u;
    }

    @Override // com.tencent.bugly.proguard.C33694hf
    /* JADX INFO: renamed from: a */
    public void mo72626a(C33694hf c33694hf) {
        super.mo72626a(c33694hf);
        if (c33694hf instanceof C33690hb) {
            C33690hb c33690hb = (C33690hb) c33694hf;
            this.f70092n = c33690hb.f70092n;
            this.f70093o = c33690hb.f70093o;
            this.f70094p = c33690hb.f70094p;
            this.f70095q = c33690hb.f70095q;
            this.f70096r = c33690hb.f70096r;
            this.f70097s = c33690hb.f70097s;
        }
    }

    @Override // com.tencent.bugly.proguard.C33694hf
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C33690hb clone() {
        return new C33690hb(this);
    }

    public C33690hb(C33690hb c33690hb) {
        super(c33690hb);
        this.f70092n = true;
        this.f70093o = true;
        this.f70094p = null;
        this.f70095q = 3000L;
        this.f70096r = true;
        this.f70097s = f70090u;
        mo72626a((C33694hf) c33690hb);
    }

    @Override // com.tencent.bugly.proguard.C33694hf, com.tencent.bugly.proguard.InterfaceC33814n9
    /* JADX INFO: renamed from: a */
    public void mo72627a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        super.mo72627a(jSONObject);
        try {
            this.f70094p = jSONObject.optString("name");
            if (jSONObject.has("enable_custom_stage")) {
                this.f70092n = jSONObject.optBoolean("enable_custom_stage", true);
            }
            if (jSONObject.has("enable_activity_switch")) {
                this.f70093o = jSONObject.optBoolean("enable_activity_switch", true);
            }
            if (jSONObject.has("report_background_delay")) {
                this.f70095q = Math.max(jSONObject.optLong("report_background_delay", 0L), 0L);
            }
            if (jSONObject.has("report_background")) {
                this.f70096r = jSONObject.optBoolean("report_background", true);
            }
            if (jSONObject.has("collector")) {
                this.f70097s = jSONObject.optString("collector");
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception("RMonitor_config", th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73257a(C33690hb c33690hb) {
        if (c33690hb == null) {
            return;
        }
        this.f70122g = this.f70122g || c33690hb.f70122g;
    }
}
