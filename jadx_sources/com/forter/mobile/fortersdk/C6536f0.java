package com.forter.mobile.fortersdk;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6536f0 {
    /* JADX INFO: renamed from: c */
    public static void m12253c(@NonNull ContentResolver contentResolver, @NonNull JSONArray jSONArray, @NonNull JSONObject jSONObject) {
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i11);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("name");
                String strOptString2 = jSONObjectOptJSONObject.optString("scope");
                String strOptString3 = jSONObjectOptJSONObject.optString("type");
                if (!TextUtils.isEmpty(strOptString) && (("global".equals(strOptString2) || "system".equals(strOptString2) || "secure".equals(strOptString2)) && (("str".equals(strOptString3) || "int".equals(strOptString3) || TypedValues.Custom.S_FLOAT.equals(strOptString3) || "long".equals(strOptString3)) && C6541g0.m12299f(jSONObjectOptJSONObject)))) {
                    C6541g0.m12298e(strOptString, m12251a(contentResolver, strOptString2, strOptString, strOptString3, C6541g0.m12294a(jSONObjectOptJSONObject, "def", strOptString3)), strOptString3, jSONObjectOptJSONObject, jSONObject);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:84:0x010e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static Object m12251a(@NonNull ContentResolver contentResolver, @NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable Object obj) {
        try {
            byte b11 = 0;
            if ("global".equals(str)) {
                switch (str3.hashCode()) {
                    case 104431:
                        if (!str3.equals("int")) {
                            b11 = -1;
                        } else {
                            b11 = 1;
                        }
                        break;
                    case 114225:
                        if (!str3.equals("str")) {
                            b11 = -1;
                        }
                        break;
                    case 3327612:
                        if (!str3.equals("long")) {
                            b11 = -1;
                        } else {
                            b11 = 3;
                        }
                        break;
                    case 97526364:
                        if (!str3.equals(TypedValues.Custom.S_FLOAT)) {
                            b11 = -1;
                        } else {
                            b11 = 2;
                        }
                        break;
                    default:
                        b11 = -1;
                        break;
                }
                if (b11 != 0) {
                    if (b11 == 1) {
                        return Integer.valueOf(Settings.Global.getInt(contentResolver, str2, C6541g0.m12300g(obj)));
                    }
                    if (b11 == 2) {
                        return Float.valueOf(Settings.Global.getFloat(contentResolver, str2, C6541g0.m12301h(obj)));
                    }
                    if (b11 != 3) {
                        return null;
                    }
                    return Long.valueOf(Settings.Global.getLong(contentResolver, str2, C6541g0.m12302i(obj)));
                }
                String string = Settings.Global.getString(contentResolver, str2);
                if (string != null) {
                    return string;
                }
            } else if ("system".equals(str)) {
                switch (str3.hashCode()) {
                    case 104431:
                        if (!str3.equals("int")) {
                            b11 = -1;
                        } else {
                            b11 = 1;
                        }
                        break;
                    case 114225:
                        if (!str3.equals("str")) {
                            b11 = -1;
                        }
                        break;
                    case 3327612:
                        if (!str3.equals("long")) {
                            b11 = -1;
                        } else {
                            b11 = 3;
                        }
                        break;
                    case 97526364:
                        if (!str3.equals(TypedValues.Custom.S_FLOAT)) {
                            b11 = -1;
                        } else {
                            b11 = 2;
                        }
                        break;
                    default:
                        b11 = -1;
                        break;
                }
                if (b11 != 0) {
                    if (b11 == 1) {
                        return Integer.valueOf(Settings.System.getInt(contentResolver, str2, C6541g0.m12300g(obj)));
                    }
                    if (b11 == 2) {
                        return Float.valueOf(Settings.System.getFloat(contentResolver, str2, C6541g0.m12301h(obj)));
                    }
                    if (b11 != 3) {
                        return null;
                    }
                    return Long.valueOf(Settings.System.getLong(contentResolver, str2, C6541g0.m12302i(obj)));
                }
                String string2 = Settings.System.getString(contentResolver, str2);
                if (string2 != null) {
                    return string2;
                }
            } else {
                if (!"secure".equals(str)) {
                    return null;
                }
                switch (str3.hashCode()) {
                    case 104431:
                        if (!str3.equals("int")) {
                            b11 = -1;
                        } else {
                            b11 = 1;
                        }
                        break;
                    case 114225:
                        if (!str3.equals("str")) {
                            b11 = -1;
                        }
                        break;
                    case 3327612:
                        if (!str3.equals("long")) {
                            b11 = -1;
                        } else {
                            b11 = 3;
                        }
                        break;
                    case 97526364:
                        if (!str3.equals(TypedValues.Custom.S_FLOAT)) {
                            b11 = -1;
                        } else {
                            b11 = 2;
                        }
                        break;
                    default:
                        b11 = -1;
                        break;
                }
                if (b11 != 0) {
                    if (b11 == 1) {
                        return Integer.valueOf(Settings.Secure.getInt(contentResolver, str2, C6541g0.m12300g(obj)));
                    }
                    if (b11 == 2) {
                        return Float.valueOf(Settings.Secure.getFloat(contentResolver, str2, C6541g0.m12301h(obj)));
                    }
                    if (b11 != 3) {
                        return null;
                    }
                    return Long.valueOf(Settings.Secure.getLong(contentResolver, str2, C6541g0.m12302i(obj)));
                }
                String string3 = Settings.Secure.getString(contentResolver, str2);
                if (string3 != null) {
                    return string3;
                }
            }
            return C6541g0.m12295b(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static JSONObject m12252b(@NonNull Context context) {
        ContentResolver contentResolver;
        JSONObject jSONObject = new JSONObject();
        try {
            C6545h[] c6545hArrM12165b = AbstractC6515b0.m12165b("deviceSettings");
            if (c6545hArrM12165b == null) {
                return null;
            }
            JSONArray jSONArrayM12175i = AbstractC6518b3.m12175i(c6545hArrM12165b, "settings");
            if (!AbstractC6539f3.m12285s(jSONArrayM12175i) && (contentResolver = context.getContentResolver()) != null) {
                m12253c(contentResolver, jSONArrayM12175i, jSONObject);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
