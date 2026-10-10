package com.forter.mobile.fortersdk;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.g0 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6541g0 {
    /* JADX INFO: renamed from: e */
    public static void m12298e(@NonNull String str, @Nullable Object obj, @NonNull String str2, @NonNull JSONObject jSONObject, @NonNull JSONObject jSONObject2) {
        m12296c(str, obj, str2, null, jSONObject, jSONObject2);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static String m12295b(@Nullable Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static void m12296c(@NonNull String str, @Nullable Object obj, @NonNull String str2, @Nullable String str3, @NonNull JSONObject jSONObject, @NonNull JSONObject jSONObject2) {
        if (obj != null) {
            Object objM12294a = m12294a(jSONObject, "equals", str2);
            Object objM12294a2 = m12294a(jSONObject, "notEquals", str2);
            if (!obj.getClass().isInstance(objM12294a) || obj.equals(objM12294a)) {
                if (obj.getClass().isInstance(objM12294a2) && obj.equals(objM12294a2)) {
                    return;
                }
                if (obj instanceof String) {
                    String str4 = (String) obj;
                    if (TextUtils.isEmpty(str4)) {
                        return;
                    }
                    String strOptString = jSONObject.optString("hashType");
                    if (!TextUtils.isEmpty(strOptString)) {
                        String strM12273g = AbstractC6539f3.m12273g(str4, strOptString);
                        String strOptString2 = jSONObject.optString("key", str);
                        if (strM12273g == null) {
                            strM12273g = "";
                        }
                        m12297d(strOptString2, strM12273g, str3, jSONObject2);
                        return;
                    }
                }
                m12297d(jSONObject.optString("key", str), obj, str3, jSONObject2);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m12297d(@NonNull String str, @Nullable Object obj, @Nullable String str2, @NonNull JSONObject jSONObject) {
        try {
            if (str2 == null) {
                jSONObject.put(str, obj);
                return;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            jSONObjectOptJSONObject.put(str2, obj);
            jSONObject.put(str, jSONObjectOptJSONObject);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m12299f(@NonNull JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("minSdk", 0);
        int iOptInt2 = jSONObject.optInt("maxSdk", 0);
        String strOptString = jSONObject.optString("manufacturer");
        return (iOptInt <= 0 || Build.VERSION.SDK_INT >= iOptInt) && (iOptInt2 <= 0 || Build.VERSION.SDK_INT <= iOptInt2) && (TextUtils.isEmpty(strOptString) || strOptString.equals(Build.MANUFACTURER));
    }

    /* JADX INFO: renamed from: g */
    public static int m12300g(@Nullable Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public static float m12301h(@Nullable Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        return -1.0f;
    }

    /* JADX INFO: renamed from: i */
    public static long m12302i(@Nullable Object obj) {
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static Object m12294a(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull String str2) {
        try {
            switch (str2) {
                case "str":
                    return jSONObject.getString(str);
                case "int":
                    return Integer.valueOf(jSONObject.getInt(str));
                case "float":
                    return Float.valueOf((float) jSONObject.getDouble(str));
                case "long":
                    return Long.valueOf(jSONObject.getLong(str));
                case "bool":
                    return Boolean.valueOf(jSONObject.getBoolean(str));
                case "lArr":
                    return jSONObject.getJSONArray(str);
                case "bArr":
                    return jSONObject.getString(str);
                default:
                    return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}
