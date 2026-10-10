package com.tencent.bugly.proguard;

import com.tencent.rmonitor.common.logger.Logger;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.fh */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33654fh extends C33694hf {

    /* JADX INFO: renamed from: w */
    public static final String f69899w = "TrafficDetailPluginConfig";

    /* JADX INFO: renamed from: n */
    public double f69900n;

    /* JADX INFO: renamed from: o */
    public double f69901o;

    /* JADX INFO: renamed from: p */
    public double f69902p;

    /* JADX INFO: renamed from: q */
    public double f69903q;

    /* JADX INFO: renamed from: r */
    public double f69904r;

    /* JADX INFO: renamed from: s */
    public boolean f69905s;

    /* JADX INFO: renamed from: t */
    public double f69906t;

    /* JADX INFO: renamed from: u */
    public double f69907u;

    /* JADX INFO: renamed from: v */
    public List<String> f69908v;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.fh$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a extends ArrayList<String> {
        public a() {
            add(".*/librmonitor_memory.so$");
            add(".*/librmonitor_base.so$");
            add(".*/libBugly_Native.so$");
            add(".*/libbuglybacktrace.so$");
        }
    }

    public C33654fh() {
        super("traffic_detail", false, 1000, 0.5f, 0.0f, 100);
        this.f69900n = 500.0d;
        this.f69901o = 50.0d;
        this.f69902p = 200.0d;
        this.f69903q = 200.0d;
        this.f69904r = 50.0d;
        this.f69905s = true;
        this.f69906t = 1.0d;
        this.f69907u = 1.0d;
        this.f69908v = new a();
    }

    @Override // com.tencent.bugly.proguard.C33694hf
    /* JADX INFO: renamed from: a */
    public void mo72626a(C33694hf c33694hf) {
        super.mo72626a(c33694hf);
        if (c33694hf instanceof C33654fh) {
            C33654fh c33654fh = (C33654fh) c33694hf;
            this.f69900n = c33654fh.f69900n;
            this.f69902p = c33654fh.f69902p;
            this.f69903q = c33654fh.f69903q;
            this.f69904r = c33654fh.f69904r;
            this.f69901o = c33654fh.f69901o;
            this.f69908v = c33654fh.f69908v;
            this.f69905s = c33654fh.f69905s;
            this.f69906t = c33654fh.f69906t;
            this.f69907u = c33654fh.f69907u;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m73079b(JSONObject jSONObject) {
        if (jSONObject.has("ignore_so_list")) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("ignore_so_list");
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    this.f69908v.add(jSONArray.getString(i11));
                }
            } catch (Throwable th2) {
                Logger.INSTANCE.exception(f69899w, "ignore_so_list parse failed", th2);
            }
        }
    }

    @Override // com.tencent.bugly.proguard.C33694hf
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C33654fh clone() {
        return new C33654fh(this);
    }

    public C33654fh(C33654fh c33654fh) {
        super(c33654fh);
        this.f69900n = 500.0d;
        this.f69901o = 50.0d;
        this.f69902p = 200.0d;
        this.f69903q = 200.0d;
        this.f69904r = 50.0d;
        this.f69905s = true;
        this.f69906t = 1.0d;
        this.f69907u = 1.0d;
        this.f69908v = new a();
        mo72626a(c33654fh);
    }

    @Override // com.tencent.bugly.proguard.C33694hf, com.tencent.bugly.proguard.InterfaceC33814n9
    /* JADX INFO: renamed from: a */
    public void mo72627a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        super.mo72627a(jSONObject);
        try {
            if (jSONObject.has("total_limit_in_megabyte")) {
                this.f69900n = jSONObject.getDouble("total_limit_in_megabyte");
            }
            if (jSONObject.has("mobile_limit_in_megabyte")) {
                this.f69902p = jSONObject.getDouble("mobile_limit_in_megabyte");
            }
            if (jSONObject.has("backend_limit_in_megabyte")) {
                this.f69901o = jSONObject.getDouble("backend_limit_in_megabyte");
            }
            if (jSONObject.has("custom_limit_in_megabyte")) {
                this.f69903q = jSONObject.getDouble("custom_limit_in_megabyte");
            }
            if (jSONObject.has("auto_start_limit_in_megabyte")) {
                this.f69904r = jSONObject.getDouble("auto_start_limit_in_megabyte");
            }
            if (jSONObject.has("filter_local_address")) {
                this.f69905s = jSONObject.getBoolean("filter_local_address");
            }
            if (jSONObject.has("metric_event_sample_ratio")) {
                this.f69906t = jSONObject.optDouble("metric_event_sample_ratio", 1.0d);
            }
            if (jSONObject.has("error_event_sample_ratio")) {
                this.f69907u = jSONObject.optDouble("error_event_sample_ratio", 1.0d);
            }
            m73079b(jSONObject);
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f69899w, "parsePluginConfig", th2);
        }
    }

    @Override // com.tencent.bugly.proguard.C33694hf, com.tencent.bugly.proguard.AbstractC34022xe
    /* JADX INFO: renamed from: a */
    public String mo72774a() {
        return "traffic_detail";
    }
}
