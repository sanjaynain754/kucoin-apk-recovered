package com.tencent.bugly.proguard;

import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.g1 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33659g1 {

    /* JADX INFO: renamed from: r */
    public static final String f69925r = "BatteryElementMetricItem";

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ boolean f69926s = true;

    /* JADX INFO: renamed from: a */
    public int f69927a;

    /* JADX INFO: renamed from: b */
    public String f69928b = "";

    /* JADX INFO: renamed from: c */
    public String f69929c = "";

    /* JADX INFO: renamed from: d */
    public String f69930d = "";

    /* JADX INFO: renamed from: e */
    public String f69931e = "";

    /* JADX INFO: renamed from: f */
    public int f69932f = 0;

    /* JADX INFO: renamed from: g */
    public int f69933g = 0;

    /* JADX INFO: renamed from: h */
    public int f69934h = 0;

    /* JADX INFO: renamed from: i */
    public int f69935i = 0;

    /* JADX INFO: renamed from: j */
    public int f69936j = 0;

    /* JADX INFO: renamed from: k */
    public long f69937k = 0;

    /* JADX INFO: renamed from: l */
    public long f69938l = 0;

    /* JADX INFO: renamed from: m */
    public long f69939m = 0;

    /* JADX INFO: renamed from: n */
    public String f69940n = "";

    /* JADX INFO: renamed from: o */
    public JSONObject f69941o = new JSONObject();

    /* JADX INFO: renamed from: p */
    public JSONObject f69942p = new JSONObject();

    /* JADX INFO: renamed from: q */
    public HashMap<String, a> f69943q = new HashMap<>();

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.g1$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a {

        /* JADX INFO: renamed from: a */
        public long f69944a;

        /* JADX INFO: renamed from: b */
        public long f69945b;

        public a() {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73121a(String str, long j11, long j12) {
        if (this.f69943q.get(str) == null) {
            a aVar = new a();
            aVar.f69944a = j12;
            aVar.f69945b = j11;
            this.f69943q.put(str, aVar);
            return;
        }
        a aVar2 = this.f69943q.get(str);
        if (!f69926s && aVar2 == null) {
            throw new AssertionError();
        }
        aVar2.f69945b += j11;
        aVar2.f69944a += j12;
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m73120a() {
        JSONObject jSONObject = new JSONObject();
        this.f69942p = jSONObject;
        try {
            jSONObject.put("element", "cpu");
            this.f69942p.put("cpu_core", Runtime.getRuntime().availableProcessors());
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<String, a> entry : this.f69943q.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(DropFrameTable.COLUMN_SCENE, entry.getKey());
                jSONObject2.put("total_cpu_time_in_ms", entry.getValue().f69945b);
                jSONObject2.put("process_cpu_time_in_ms", entry.getValue().f69944a);
                jSONArray.put(jSONObject2);
            }
            this.f69942p.put("cpu_time_details", jSONArray);
        } catch (JSONException e11) {
            Logger.INSTANCE.exception(f69925r, e11);
        }
        return this.f69942p;
    }
}
