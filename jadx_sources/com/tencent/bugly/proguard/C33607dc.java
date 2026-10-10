package com.tencent.bugly.proguard;

import androidx.annotation.RestrictTo;
import com.tencent.rmonitor.common.logger.Logger;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.dc */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C33607dc extends C33694hf {

    /* JADX INFO: renamed from: n */
    public int f69564n;

    /* JADX INFO: renamed from: o */
    public boolean f69565o;

    /* JADX INFO: renamed from: p */
    public int f69566p;

    /* JADX INFO: renamed from: q */
    public boolean f69567q;

    /* JADX INFO: renamed from: r */
    public boolean f69568r;

    public C33607dc() {
        super("activity_leak", false, 10, 0.1f, 0.1f, 0);
        this.f69564n = 9;
        this.f69565o = true;
        this.f69566p = 100;
        this.f69567q = false;
        this.f69568r = true;
    }

    @Override // com.tencent.bugly.proguard.C33694hf
    /* JADX INFO: renamed from: a */
    public void mo72626a(C33694hf c33694hf) {
        super.mo72626a(c33694hf);
        if (c33694hf instanceof C33607dc) {
            C33607dc c33607dc = (C33607dc) c33694hf;
            this.f69565o = c33607dc.f69565o;
            this.f69566p = c33607dc.f69566p;
            this.f69567q = c33607dc.f69567q;
            this.f69568r = c33607dc.f69568r;
            this.f69564n = c33607dc.f69564n;
        }
    }

    @Override // com.tencent.bugly.proguard.C33694hf
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C33607dc clone() {
        return new C33607dc(this);
    }

    /* JADX INFO: renamed from: b */
    public void m72822b(int i11) {
        this.f69566p = i11;
    }

    /* JADX INFO: renamed from: c */
    public void m72825c(boolean z11) {
        this.f69567q = z11;
    }

    /* JADX INFO: renamed from: d */
    public int m72826d() {
        return this.f69566p;
    }

    /* JADX INFO: renamed from: e */
    public boolean m72827e() {
        return this.f69565o;
    }

    /* JADX INFO: renamed from: f */
    public boolean m72828f() {
        return this.f69568r;
    }

    /* JADX INFO: renamed from: g */
    public boolean m72829g() {
        return (this.f69564n & 1) != 0;
    }

    /* JADX INFO: renamed from: h */
    public boolean m72830h() {
        return this.f69567q;
    }

    /* JADX INFO: renamed from: b */
    public void m72823b(boolean z11) {
        this.f69568r = z11;
    }

    public C33607dc(C33607dc c33607dc) {
        super(c33607dc);
        this.f69564n = 9;
        this.f69565o = true;
        this.f69566p = 100;
        this.f69567q = false;
        this.f69568r = true;
        mo72626a(c33607dc);
    }

    /* JADX INFO: renamed from: a */
    public void m72821a(boolean z11) {
        this.f69565o = z11;
    }

    /* JADX INFO: renamed from: a */
    public void m72820a(int i11) {
        this.f69564n = i11;
    }

    @Override // com.tencent.bugly.proguard.C33694hf, com.tencent.bugly.proguard.InterfaceC33814n9
    /* JADX INFO: renamed from: a */
    public void mo72627a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        super.mo72627a(jSONObject);
        try {
            if (jSONObject.has("auto_dump")) {
                m72821a(jSONObject.getBoolean("auto_dump"));
            }
            if (jSONObject.has("loop_max_count")) {
                m72822b(jSONObject.getInt("loop_max_count"));
            }
            if (jSONObject.has("keep_uuid_when_leaked")) {
                m72825c(jSONObject.getBoolean("keep_uuid_when_leaked"));
            }
            if (jSONObject.has("enable_fragment_inspect")) {
                m72823b(jSONObject.getBoolean("enable_fragment_inspect"));
            }
            if (jSONObject.has("hprof_strip_switch")) {
                m72820a(jSONObject.getInt("hprof_strip_switch"));
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception("RMonitor_config", "parsePluginConfig", th2);
        }
    }
}
