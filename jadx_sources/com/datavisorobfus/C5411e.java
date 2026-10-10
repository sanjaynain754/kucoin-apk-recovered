package com.datavisorobfus;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.datavisorobfus.e */
/* JADX INFO: loaded from: classes34.dex */
public class C5411e {
    /* JADX INFO: renamed from: a */
    public static Map<String, String> m7127a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            return map;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m7130b(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (!m7129a(map)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    jSONObject.put(entry.getKey(), entry.getValue());
                } catch (Throwable th2) {
                    C5415f0.m7139a(th2);
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7128a(String str) {
        int length;
        if (str != null && (length = str.length()) != 0) {
            for (int i11 = 0; i11 < length; i11++) {
                if (!Character.isWhitespace(str.charAt(i11))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m7131b(String str) {
        return !m7128a(str);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7129a(Map map) {
        return map == null || map.size() <= 0;
    }

    /* JADX INFO: renamed from: c */
    public static String m7132c(String str) {
        return str.replaceAll("uid_\\d+", "").replaceAll("pid_\\d+", "");
    }
}
