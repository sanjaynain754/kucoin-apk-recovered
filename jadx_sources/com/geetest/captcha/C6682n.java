package com.geetest.captcha;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.remoteconfig.internal.Personalization;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.geetest.captcha.n */
/* JADX INFO: loaded from: classes45.dex */
public final class C6682n {
    /* JADX INFO: renamed from: a */
    public static String m12548a(Context context) {
        String strM12543a;
        long jCurrentTimeMillis;
        JSONObject jSONObject = new JSONObject();
        if (context == null) {
            return jSONObject.toString();
        }
        try {
            strM12543a = context.getSharedPreferences("gt_fp", 0).getString("gt_fp", null);
        } catch (Exception unused) {
            strM12543a = "$unknown";
        }
        try {
            jCurrentTimeMillis = context.getSharedPreferences("gt_fp", 0).getLong("gt_ts", 0L);
        } catch (Exception unused2) {
            jCurrentTimeMillis = 0;
        }
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            C6676k.m12544a(context, jCurrentTimeMillis);
        }
        try {
            jSONObject.put("bd", "$unknown");
            Pair<String, String> pairM12549a = C6684o.m12549a(context);
            if (pairM12549a != null) {
                jSONObject.put("d", pairM12549a.first);
                jSONObject.put("e", pairM12549a.second);
                if (TextUtils.isEmpty(strM12543a) || "$unknown".equals(strM12543a)) {
                    String str = (String) pairM12549a.first;
                    if (!TextUtils.isEmpty(str) && !"$unknown".equals(str)) {
                        strM12543a = C6676k.m12543a(context, (String) pairM12549a.first);
                    }
                }
            } else {
                jSONObject.put("d", "$unknown");
                jSONObject.put("e", "$unknown");
            }
            if (TextUtils.isEmpty(strM12543a) || "$unknown".equals(strM12543a)) {
                strM12543a = C6676k.m12543a(context, UUID.randomUUID().toString());
            }
            jSONObject.put(Personalization.ANALYTICS_ORIGIN_PERSONALIZATION, strM12543a);
            jSONObject.put("ts", jCurrentTimeMillis + "");
            jSONObject.put("ver", "1.0.0");
            jSONObject.put("client_type", "android");
        } catch (JSONException unused3) {
        }
        return jSONObject.toString();
    }
}
