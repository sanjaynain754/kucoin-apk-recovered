package com.forter.mobile.fortersdk;

import com.forter.mobile.fortersdk.models.ForterAccountIDType;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.x3 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6629x3 {

    /* JADX INFO: renamed from: a */
    public static final HashMap<ForterAccountIDType, String> f11088a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public static synchronized JSONArray m12509a() {
        JSONArray jSONArray;
        jSONArray = new JSONArray();
        try {
            for (Map.Entry<ForterAccountIDType, String> entry : f11088a.entrySet()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(AbstractC6539f3.m12272f(entry.getKey().toString()), entry.getValue());
                    jSONArray.put(jSONObject);
                } catch (Exception unused) {
                    AbstractC6524c3.m12212d();
                }
            }
        } catch (Exception e11) {
            C6520c.m12182b().m12187e("AccountIDs::getAllIDs() -> got exception: " + e11.getMessage(), null);
            AbstractC6524c3.m12212d();
        }
        return jSONArray;
    }
}
