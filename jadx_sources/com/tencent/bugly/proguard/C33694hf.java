package com.tencent.bugly.proguard;

import com.tencent.rmonitor.common.logger.Logger;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.hf */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33694hf extends AbstractC34022xe implements Cloneable, InterfaceC33814n9 {

    /* JADX INFO: renamed from: m */
    public static final String f70120m = "RMonitor_config";

    /* JADX INFO: renamed from: f */
    public final String f70121f;

    /* JADX INFO: renamed from: g */
    public boolean f70122g;

    /* JADX INFO: renamed from: h */
    public int f70123h;

    /* JADX INFO: renamed from: i */
    public float f70124i;

    /* JADX INFO: renamed from: j */
    public float f70125j;

    /* JADX INFO: renamed from: k */
    public float f70126k;

    /* JADX INFO: renamed from: l */
    public int f70127l;

    public C33694hf(String str) {
        this.f70122g = false;
        this.f70123h = 10;
        this.f70124i = 0.0f;
        this.f70125j = 0.0f;
        this.f70126k = 1.0f;
        this.f70127l = 0;
        this.f70121f = str;
    }

    /* JADX INFO: renamed from: a */
    public void mo72626a(C33694hf c33694hf) {
        if (c33694hf == null) {
            return;
        }
        this.f70122g = c33694hf.f70122g;
        this.f70123h = c33694hf.f70123h;
        this.f70124i = c33694hf.f70124i;
        this.f70125j = c33694hf.f70125j;
        this.f70126k = c33694hf.f70126k;
        this.f70127l = c33694hf.f70127l;
    }

    @Override // 
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C33694hf clone() {
        return new C33694hf(this);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33814n9
    /* JADX INFO: renamed from: a */
    public void mo72627a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has(AbstractC34022xe.f72511b)) {
                this.f70124i = (float) jSONObject.getDouble(AbstractC34022xe.f72511b);
            }
            if (jSONObject.has("enabled")) {
                this.f70122g = jSONObject.getBoolean("enabled");
            }
            if (jSONObject.has("daily_report_limit")) {
                this.f70123h = jSONObject.getInt("daily_report_limit");
            }
            if (jSONObject.has("event_sample_ratio")) {
                this.f70125j = (float) jSONObject.getDouble("event_sample_ratio");
            }
            if (jSONObject.has("report_sample_ratio")) {
                this.f70126k = (float) jSONObject.getDouble("report_sample_ratio");
            }
            if (jSONObject.has("threshold")) {
                this.f70127l = jSONObject.getInt("threshold");
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception("RMonitor_config", "parsePluginConfig", th2);
        }
    }

    public C33694hf(String str, boolean z11, int i11, float f11) {
        this(str);
        this.f70123h = i11;
        this.f70125j = f11;
        this.f70122g = z11;
    }

    public C33694hf(String str, boolean z11, int i11, float f11, int i12) {
        this(str, z11, i11, f11);
        this.f70127l = i12;
    }

    public C33694hf(String str, boolean z11, int i11, float f11, float f12, int i12) {
        this(str, z11, i11, f11);
        this.f70124i = f12;
        this.f70127l = i12;
    }

    public C33694hf(C33694hf c33694hf) {
        this(c33694hf.f70121f);
        mo72626a(c33694hf);
    }

    @Override // com.tencent.bugly.proguard.AbstractC34022xe
    /* JADX INFO: renamed from: a */
    public String mo72774a() {
        return this.f70121f;
    }
}
