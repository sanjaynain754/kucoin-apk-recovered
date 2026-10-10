package com.tencent.bugly.proguard;

import androidx.annotation.RestrictTo;
import com.tencent.rmonitor.common.logger.Logger;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.tb */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C33939tb extends C33694hf {

    /* JADX INFO: renamed from: r */
    public static final int f72067r = 9;

    /* JADX INFO: renamed from: s */
    public static final int f72068s = 3;

    /* JADX INFO: renamed from: t */
    public static final int f72069t = 5;

    /* JADX INFO: renamed from: u */
    public static final boolean f72070u = false;

    /* JADX INFO: renamed from: n */
    public int f72071n;

    /* JADX INFO: renamed from: o */
    public int f72072o;

    /* JADX INFO: renamed from: p */
    public int f72073p;

    /* JADX INFO: renamed from: q */
    public boolean f72074q;

    public C33939tb() {
        super("java_memory_ceiling_hprof", false, 5, 0.5f, 90);
        this.f72071n = 9;
        this.f72072o = 3;
        this.f72073p = 5;
        this.f72074q = false;
    }

    @Override // com.tencent.bugly.proguard.C33694hf
    /* JADX INFO: renamed from: a */
    public void mo72626a(C33694hf c33694hf) {
        super.mo72626a(c33694hf);
        if (c33694hf instanceof C33939tb) {
            C33939tb c33939tb = (C33939tb) c33694hf;
            this.f72071n = c33939tb.f72071n;
            this.f72072o = c33939tb.f72072o;
            this.f72073p = c33939tb.f72073p;
            this.f72074q = c33939tb.f72074q;
        }
    }

    @Override // com.tencent.bugly.proguard.C33694hf
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C33939tb clone() {
        return new C33939tb(this);
    }

    /* JADX INFO: renamed from: d */
    public boolean m75051d() {
        return (this.f72071n & 1) != 0;
    }

    public C33939tb(C33939tb c33939tb) {
        super(c33939tb);
        this.f72071n = 9;
        this.f72072o = 3;
        this.f72073p = 5;
        this.f72074q = false;
        mo72626a(c33939tb);
    }

    @Override // com.tencent.bugly.proguard.C33694hf, com.tencent.bugly.proguard.InterfaceC33814n9
    /* JADX INFO: renamed from: a */
    public void mo72627a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        super.mo72627a(jSONObject);
        try {
            if (jSONObject.has("hprof_strip_switch")) {
                this.f72071n = jSONObject.optInt("hprof_strip_switch", 9);
            }
            if (jSONObject.has("max_check_count")) {
                this.f72072o = jSONObject.optInt("max_check_count", 3);
            }
            if (jSONObject.has("max_gc_count")) {
                this.f72073p = jSONObject.optInt("max_gc_count", 5);
            }
            if (jSONObject.has("check_gc_before_ceiling")) {
                this.f72074q = jSONObject.optBoolean("check_gc_before_ceiling", false);
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception("RMonitor_config", "parsePluginConfig", th2);
        }
    }
}
