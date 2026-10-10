package com.forter.mobile.fortersdk;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6546h0 {
    /* JADX INFO: renamed from: c */
    public static void m12310c(@NonNull JSONArray jSONArray, @NonNull JSONObject jSONObject) {
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i11);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("name");
                String strOptString2 = jSONObjectOptJSONObject.optString("type");
                if (!TextUtils.isEmpty(strOptString) && (("str".equals(strOptString2) || "bool".equals(strOptString2) || "int".equals(strOptString2) || "long".equals(strOptString2) || "prop".equals(strOptString2)) && C6541g0.m12299f(jSONObjectOptJSONObject))) {
                    C6541g0.m12298e(strOptString, m12308a(strOptString, strOptString2, C6541g0.m12294a(jSONObjectOptJSONObject, "def", strOptString2)), strOptString2, jSONObjectOptJSONObject, jSONObject);
                }
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static JSONObject m12309b() {
        JSONObject jSONObject = new JSONObject();
        try {
            C6545h[] c6545hArrM12165b = AbstractC6515b0.m12165b("systemProps");
            if (c6545hArrM12165b == null) {
                return null;
            }
            JSONArray jSONArrayM12175i = AbstractC6518b3.m12175i(c6545hArrM12165b, "props");
            if (!AbstractC6539f3.m12285s(jSONArrayM12175i)) {
                m12310c(jSONArrayM12175i, jSONObject);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static Object m12308a(@NonNull String str, @NonNull String str2, @Nullable Object obj) {
        byte b11;
        try {
            boolean z11 = false;
            switch (str2.hashCode()) {
                case 104431:
                    if (str2.equals("int")) {
                        b11 = 2;
                    } else {
                        b11 = -1;
                    }
                    break;
                case 114225:
                    if (str2.equals("str")) {
                        b11 = 0;
                    } else {
                        b11 = -1;
                    }
                    break;
                case 3029738:
                    if (str2.equals("bool")) {
                        b11 = 1;
                    } else {
                        b11 = -1;
                    }
                    break;
                case 3327612:
                    if (str2.equals("long")) {
                        b11 = 3;
                    } else {
                        b11 = -1;
                    }
                    break;
                case 3449699:
                    if (str2.equals("prop")) {
                        b11 = 4;
                    } else {
                        b11 = -1;
                    }
                    break;
                default:
                    b11 = -1;
                    break;
            }
            if (b11 != 0) {
                if (b11 != 1) {
                    if (b11 != 2) {
                        if (b11 != 3) {
                            if (b11 == 4) {
                                return System.getProperty(str, C6541g0.m12295b(obj));
                            }
                            return null;
                        }
                        return C6529d3.m12224c(str, C6541g0.m12302i(obj));
                    }
                    return C6529d3.m12223b(str, C6541g0.m12300g(obj));
                }
                if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                    z11 = true;
                }
                return C6529d3.m12222a(str, z11);
            }
            return C6529d3.m12225d(str, C6541g0.m12295b(obj));
        } catch (Throwable unused) {
            return null;
        }
    }
}
