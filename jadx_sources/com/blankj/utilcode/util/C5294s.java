package com.blankj.utilcode.util;

import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.blankj.utilcode.util.s */
/* JADX INFO: compiled from: JsonUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C5294s {
    /* JADX INFO: renamed from: a */
    public static String m6395a(String str) {
        return m6396b(str, 4);
    }

    /* JADX INFO: renamed from: d */
    public static <T> T m6398d(String str, String str2, T t11, byte b11) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            try {
                return (T) m6399e(new JSONObject(str), str2, t11, b11);
            } catch (JSONException e11) {
                Log.e("JsonUtils", "getValueByType: ", e11);
            }
        }
        return t11;
    }

    /* JADX INFO: renamed from: e */
    public static <T> T m6399e(JSONObject jSONObject, String str, T t11, byte b11) {
        if (jSONObject != null && str != null && str.length() != 0) {
            try {
                if (b11 == 0) {
                    return (T) Boolean.valueOf(jSONObject.getBoolean(str));
                }
                if (b11 == 1) {
                    return (T) Integer.valueOf(jSONObject.getInt(str));
                }
                if (b11 == 2) {
                    return (T) Long.valueOf(jSONObject.getLong(str));
                }
                if (b11 == 3) {
                    return (T) Double.valueOf(jSONObject.getDouble(str));
                }
                if (b11 == 4) {
                    return (T) jSONObject.getString(str);
                }
                if (b11 == 5) {
                    return (T) jSONObject.getJSONObject(str);
                }
                if (b11 == 6) {
                    return (T) jSONObject.getJSONArray(str);
                }
            } catch (JSONException e11) {
                Log.e("JsonUtils", "getValueByType: ", e11);
            }
        }
        return t11;
    }

    /* JADX INFO: renamed from: b */
    public static String m6396b(String str, int i11) {
        try {
            int length = str.length();
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = str.charAt(i12);
                if (cCharAt == '{') {
                    return new JSONObject(str).toString(i11);
                }
                if (cCharAt == '[') {
                    return new JSONArray(str).toString(i11);
                }
                if (!Character.isWhitespace(cCharAt)) {
                    return str;
                }
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m6397c(String str, String str2, boolean z11) {
        return ((Boolean) m6398d(str, str2, Boolean.valueOf(z11), (byte) 0)).booleanValue();
    }
}
