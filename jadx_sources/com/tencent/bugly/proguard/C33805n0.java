package com.tencent.bugly.proguard;

import android.text.TextUtils;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.n0 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33805n0 extends AbstractC34022xe {

    /* JADX INFO: renamed from: g */
    public static final String f71011g = "RMonitor_config_atta";

    /* JADX INFO: renamed from: h */
    public static final String f71012h = "default";

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap<String, Float> f71013f;

    /* JADX INFO: renamed from: a */
    public void m74176a(C33805n0 c33805n0) {
        this.f71013f.clear();
        this.f71013f.putAll(c33805n0.f71013f);
    }

    public C33805n0() {
        ConcurrentHashMap<String, Float> concurrentHashMap = new ConcurrentHashMap<>();
        this.f71013f = concurrentHashMap;
        concurrentHashMap.put("default", Float.valueOf(0.0f));
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33814n9
    /* JADX INFO: renamed from: a */
    public void mo72627a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                float f11 = (float) jSONObject.getDouble(next);
                if (f11 > 1.0d) {
                    f11 = 1.0f;
                } else if (f11 < 0.0f) {
                    f11 = 0.0f;
                }
                this.f71013f.put(next, Float.valueOf(f11));
            } catch (JSONException e11) {
                Logger.INSTANCE.mo77131e(f71011g, "parse, attaEvent: " + next + ", e: " + e11);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public float m74175a(String str) {
        Float f11;
        Float f12 = this.f71013f.get("default");
        return (TextUtils.isEmpty(str) || (f11 = this.f71013f.get(str)) == null) ? f12 != null ? f12.floatValue() : 0.0f : f11.floatValue();
    }

    @Override // com.tencent.bugly.proguard.AbstractC34022xe
    /* JADX INFO: renamed from: a */
    public String mo72774a() {
        return AbstractC34022xe.f72512c;
    }
}
