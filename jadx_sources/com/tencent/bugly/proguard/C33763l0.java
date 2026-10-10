package com.tencent.bugly.proguard;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.l0 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C33763l0 extends C33694hf {

    /* JADX INFO: renamed from: v */
    public static final boolean f70676v = false;

    /* JADX INFO: renamed from: n */
    public int f70677n;

    /* JADX INFO: renamed from: o */
    public int f70678o;

    /* JADX INFO: renamed from: p */
    public int f70679p;

    /* JADX INFO: renamed from: q */
    public int f70680q;

    /* JADX INFO: renamed from: r */
    public boolean f70681r;

    /* JADX INFO: renamed from: s */
    public boolean f70682s;

    /* JADX INFO: renamed from: t */
    public List<String> f70683t;

    /* JADX INFO: renamed from: u */
    public List<String> f70684u;

    public C33763l0() {
        super("asan", false, 1000, 1.0f, 1.0f, 0);
        this.f70677n = 8192;
        this.f70678o = 4096;
        this.f70679p = 5;
        this.f70680q = 30;
        this.f70681r = false;
        this.f70682s = false;
        this.f70683t = new ArrayList();
        this.f70684u = new ArrayList();
    }

    @Override // com.tencent.bugly.proguard.C33694hf
    /* JADX INFO: renamed from: a */
    public void mo72626a(C33694hf c33694hf) {
        super.mo72626a(c33694hf);
        if (c33694hf instanceof C33763l0) {
            C33763l0 c33763l0 = (C33763l0) c33694hf;
            this.f70677n = c33763l0.f70677n;
            this.f70678o = c33763l0.f70678o;
            this.f70679p = c33763l0.f70679p;
            this.f70680q = c33763l0.f70680q;
            this.f70681r = c33763l0.f70681r;
            this.f70682s = c33763l0.f70682s;
            this.f70683t = c33763l0.f70683t;
            this.f70684u = c33763l0.f70684u;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m73823b(JSONObject jSONObject) {
        try {
            if (jSONObject.has("slot_size")) {
                this.f70677n = Math.max(jSONObject.getInt("slot_size"), 0);
            }
            if (jSONObject.has("slot_count")) {
                this.f70678o = Math.max(jSONObject.getInt("slot_count"), 0);
            }
            if (jSONObject.has("max_sample_gap_count")) {
                this.f70679p = Math.max(jSONObject.getInt("max_sample_gap_count"), 0);
            }
            if (jSONObject.has("left_side_align_percentage")) {
                this.f70680q = Math.max(Math.min(jSONObject.getInt("left_side_align_percentage"), 100), 0);
            }
            if (jSONObject.has("right_side_perfect_align")) {
                this.f70681r = jSONObject.getBoolean("right_side_perfect_align");
            }
            if (jSONObject.has("ignore_overlapped_reading")) {
                this.f70682s = jSONObject.getBoolean("ignore_overlapped_reading");
            }
            if (jSONObject.has("target_so_patterns")) {
                m73822a(this.f70683t, jSONObject.getJSONArray("target_so_patterns"));
            }
            if (jSONObject.has("ignore_so_patterns")) {
                m73822a(this.f70684u, jSONObject.getJSONArray("ignore_so_patterns"));
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception("RMonitor_config", "parse asan config failed", th2);
        }
    }

    @Override // com.tencent.bugly.proguard.C33694hf
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C33763l0 clone() {
        return new C33763l0(this);
    }

    public C33763l0(C33763l0 c33763l0) {
        super(c33763l0);
        this.f70677n = 8192;
        this.f70678o = 4096;
        this.f70679p = 5;
        this.f70680q = 30;
        this.f70681r = false;
        this.f70682s = false;
        this.f70683t = new ArrayList();
        this.f70684u = new ArrayList();
        mo72626a(c33763l0);
    }

    @Override // com.tencent.bugly.proguard.C33694hf, com.tencent.bugly.proguard.InterfaceC33814n9
    /* JADX INFO: renamed from: a */
    public void mo72627a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        super.mo72627a(jSONObject);
        m73823b(jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public final void m73822a(List<String> list, JSONArray jSONArray) {
        if (list == null || jSONArray == null) {
            return;
        }
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                list.add(jSONArray.getString(i11));
            } catch (Exception e11) {
                Logger.INSTANCE.exception("RMonitor_config", e11);
                return;
            }
        }
    }
}
