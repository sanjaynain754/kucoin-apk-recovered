package com.tencent.bugly.proguard;

import androidx.annotation.RestrictTo;
import com.tencent.rmonitor.common.logger.Logger;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.c0 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C33574c0 extends C33694hf {

    /* JADX INFO: renamed from: q */
    public static final int f69313q = 10;

    /* JADX INFO: renamed from: n */
    public boolean f69314n;

    /* JADX INFO: renamed from: o */
    public boolean f69315o;

    /* JADX INFO: renamed from: p */
    public int f69316p;

    public C33574c0() {
        super("launch_metric", false, 100, 1.0f);
        this.f69314n = false;
        this.f69315o = false;
        this.f69316p = 10;
    }

    @Override // com.tencent.bugly.proguard.C33694hf
    /* JADX INFO: renamed from: a */
    public void mo72626a(C33694hf c33694hf) {
        super.mo72626a(c33694hf);
        if (c33694hf instanceof C33574c0) {
            C33574c0 c33574c0 = (C33574c0) c33694hf;
            this.f69314n = c33574c0.f69314n;
            this.f69315o = c33574c0.f69315o;
            this.f69316p = c33574c0.f69316p;
        }
    }

    @Override // com.tencent.bugly.proguard.C33694hf
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C33574c0 clone() {
        return new C33574c0(this);
    }

    /* JADX INFO: renamed from: d */
    public int m72630d() {
        return this.f69316p;
    }

    /* JADX INFO: renamed from: e */
    public boolean m72631e() {
        return this.f69315o;
    }

    /* JADX INFO: renamed from: f */
    public boolean m72632f() {
        return this.f69314n;
    }

    public C33574c0(C33574c0 c33574c0) {
        super(c33574c0);
        this.f69314n = false;
        this.f69315o = false;
        this.f69316p = 10;
        mo72626a(c33574c0);
    }

    @Override // com.tencent.bugly.proguard.C33694hf, com.tencent.bugly.proguard.InterfaceC33814n9
    /* JADX INFO: renamed from: a */
    public void mo72627a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        super.mo72627a(jSONObject);
        try {
            if (jSONObject.has("enable_protect")) {
                this.f69314n = jSONObject.optBoolean("enable_protect", false);
            }
            if (jSONObject.has("disable_report_pre_launch")) {
                this.f69315o = jSONObject.optBoolean("disable_report_pre_launch", false);
            }
            if (jSONObject.has("warm_launch_max_report_count")) {
                this.f69316p = jSONObject.optInt("warm_launch_max_report_count", 10);
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77131e("RMonitor_config", C33799mf.m74131a("AppLaunchPluginConfig, parseLaunchConfigInfo, t: ", th2));
        }
    }
}
