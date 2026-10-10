package com.tencent.bugly.proguard;

import androidx.annotation.RestrictTo;
import com.tencent.rmonitor.common.logger.Logger;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.m6 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C33790m6 extends C33694hf {

    /* JADX INFO: renamed from: s */
    public static final int f70929s = 1;

    /* JADX INFO: renamed from: n */
    public int f70930n;

    /* JADX INFO: renamed from: o */
    public int f70931o;

    /* JADX INFO: renamed from: p */
    public boolean f70932p;

    /* JADX INFO: renamed from: q */
    public boolean f70933q;

    /* JADX INFO: renamed from: r */
    public double f70934r;

    public C33790m6() {
        super("fd_leak", false, 10, 0.5f, 0.1f, 800);
        this.f70930n = 1;
        this.f70931o = 9;
        this.f70932p = false;
        this.f70933q = false;
        this.f70934r = 1.0d;
    }

    @Override // com.tencent.bugly.proguard.C33694hf
    /* JADX INFO: renamed from: a */
    public void mo72626a(C33694hf c33694hf) {
        super.mo72626a(c33694hf);
        if (c33694hf instanceof C33790m6) {
            C33790m6 c33790m6 = (C33790m6) c33694hf;
            this.f70930n = c33790m6.f70930n;
            this.f70931o = c33790m6.f70931o;
            this.f70932p = c33790m6.f70932p;
            this.f70933q = c33790m6.f70933q;
            this.f70934r = c33790m6.f70934r;
        }
    }

    @Override // com.tencent.bugly.proguard.C33694hf
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C33790m6 clone() {
        return new C33790m6(this);
    }

    public String toString() {
        return "FdLeakPluginConfig{threshold=" + this.f70127l + ", maxReportNum=" + this.f70123h + ", eventSampleRatio=" + this.f70125j + ", fdMonitorSwitch=" + this.f70930n + ", hprofStripSwitch=" + this.f70931o + ", checkLeakInNative=" + this.f70932p + ", useFdTrackFeature=" + this.f70933q + ", hprofDumpRatio= " + this.f70934r + "}";
    }

    public C33790m6(C33790m6 c33790m6) {
        super(c33790m6);
        this.f70930n = 1;
        this.f70931o = 9;
        this.f70932p = false;
        this.f70933q = false;
        this.f70934r = 1.0d;
        mo72626a(c33790m6);
    }

    @Override // com.tencent.bugly.proguard.C33694hf, com.tencent.bugly.proguard.InterfaceC33814n9
    /* JADX INFO: renamed from: a */
    public void mo72627a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        super.mo72627a(jSONObject);
        try {
            if (jSONObject.has("fd_monitor_switch")) {
                this.f70930n = jSONObject.getInt("fd_monitor_switch");
            }
            if (jSONObject.has("hprof_strip_switch")) {
                this.f70931o = jSONObject.getInt("hprof_strip_switch");
            }
            if (jSONObject.has("check_leak_in_native")) {
                this.f70932p = jSONObject.getBoolean("check_leak_in_native");
            }
            if (jSONObject.has("use_fd_track_feature")) {
                this.f70933q = jSONObject.getBoolean("use_fd_track_feature");
            }
            if (jSONObject.has("hprof_dump_ratio")) {
                this.f70934r = jSONObject.optDouble("hprof_dump_ratio", 1.0d);
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception("RMonitor_config", "parsePluginConfig", th2);
        }
    }
}
