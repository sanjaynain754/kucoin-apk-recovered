package com.tencent.bugly.proguard;

import androidx.annotation.NonNull;
import com.tencent.rmonitor.common.logger.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.j1 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33722j1 extends C33694hf {

    /* JADX INFO: renamed from: v */
    public static final String f70311v = "BatteryElementPluginConfig";

    /* JADX INFO: renamed from: n */
    public long f70312n;

    /* JADX INFO: renamed from: o */
    public long f70313o;

    /* JADX INFO: renamed from: p */
    public long f70314p;

    /* JADX INFO: renamed from: q */
    public long f70315q;

    /* JADX INFO: renamed from: r */
    public long f70316r;

    /* JADX INFO: renamed from: s */
    public long f70317s;

    /* JADX INFO: renamed from: t */
    public long f70318t;

    /* JADX INFO: renamed from: u */
    public long f70319u;

    public C33722j1() {
        super("battery_element", false, 1000, 0.5f, 0.0f, 100);
        this.f70312n = 10000L;
        this.f70313o = 30000L;
        this.f70314p = 20L;
        this.f70315q = 10000L;
        this.f70316r = 30000L;
        this.f70317s = 20L;
        this.f70318t = 20L;
        this.f70319u = 20L;
    }

    @Override // com.tencent.bugly.proguard.C33694hf
    /* JADX INFO: renamed from: a */
    public void mo72626a(C33694hf c33694hf) {
        super.mo72626a(c33694hf);
        if (c33694hf instanceof C33722j1) {
            C33722j1 c33722j1 = (C33722j1) c33694hf;
            this.f70312n = c33722j1.f70312n;
            this.f70313o = c33722j1.f70313o;
            this.f70314p = c33722j1.f70314p;
            this.f70315q = c33722j1.f70315q;
            this.f70316r = c33722j1.f70316r;
            this.f70317s = c33722j1.f70317s;
            this.f70318t = c33722j1.f70318t;
            this.f70319u = c33722j1.f70319u;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m73454b(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("single_location_duration_in_ms")) {
            this.f70312n = jSONObject.getLong("single_location_duration_in_ms");
        }
        if (jSONObject.has("total_location_duration_in_ms")) {
            this.f70313o = jSONObject.getLong("total_location_duration_in_ms");
        }
        if (jSONObject.has("max_location_open_num")) {
            this.f70314p = jSONObject.getLong("max_location_open_num");
        }
        if (jSONObject.has("single_wakelock_duration_in_ms")) {
            this.f70315q = jSONObject.getLong("single_wakelock_duration_in_ms");
        }
        if (jSONObject.has("total_wakelock_duration_in_ms")) {
            this.f70316r = jSONObject.getLong("total_wakelock_duration_in_ms");
        }
        if (jSONObject.has("max_wakelock_open_num")) {
            this.f70317s = jSONObject.getLong("max_wakelock_open_num");
        }
        if (jSONObject.has("max_alarm_open_num")) {
            this.f70318t = jSONObject.getLong("max_alarm_open_num");
        }
        if (jSONObject.has("max_wakeup_alarm_open_num")) {
            this.f70319u = jSONObject.getLong("max_wakeup_alarm_open_num");
        }
    }

    @Override // com.tencent.bugly.proguard.C33694hf
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C33722j1 clone() {
        return new C33722j1(this);
    }

    public C33722j1(C33722j1 c33722j1) {
        super(c33722j1);
        this.f70312n = 10000L;
        this.f70313o = 30000L;
        this.f70314p = 20L;
        this.f70315q = 10000L;
        this.f70316r = 30000L;
        this.f70317s = 20L;
        this.f70318t = 20L;
        this.f70319u = 20L;
        mo72626a(c33722j1);
    }

    @Override // com.tencent.bugly.proguard.C33694hf, com.tencent.bugly.proguard.InterfaceC33814n9
    /* JADX INFO: renamed from: a */
    public void mo72627a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        super.mo72627a(jSONObject);
        try {
            m73454b(jSONObject);
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f70311v, "parsePluginConfig", th2);
        }
    }

    @Override // com.tencent.bugly.proguard.C33694hf, com.tencent.bugly.proguard.AbstractC34022xe
    /* JADX INFO: renamed from: a */
    public String mo72774a() {
        return "battery_element";
    }
}
