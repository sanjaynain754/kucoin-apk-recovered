package com.forter.mobile.fortersdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.autofill.HintConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6526d0 {
    @SuppressLint({"MissingPermission", "HardwareIds"})
    /* JADX INFO: renamed from: a */
    public static String m12217a(@NonNull Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            if (telephonyManager != null) {
                return Build.VERSION.SDK_INT >= 26 ? telephonyManager.getImei() : telephonyManager.getDeviceId();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    @SuppressLint({"HardwareIds"})
    /* JADX INFO: renamed from: b */
    public static String m12218b(@NonNull Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static String m12219c(@NonNull Context context) {
        String strM12269c = AbstractC6539f3.m12269c(context);
        if ("FAILURE".equals(strM12269c)) {
            return null;
        }
        return strM12269c;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    /* JADX INFO: renamed from: d */
    public static JSONObject m12220d(@NonNull Context context) {
        byte b11;
        String strM12217a;
        String strM12289w;
        JSONObject jSONObject = new JSONObject();
        try {
            C6545h[] c6545hArrM12165b = AbstractC6515b0.m12165b("deviceUIDs");
            if (c6545hArrM12165b == null) {
                return null;
            }
            JSONArray jSONArrayM12175i = AbstractC6518b3.m12175i(c6545hArrM12165b, "identifiers");
            if (!AbstractC6539f3.m12285s(jSONArrayM12175i)) {
                for (int i11 = 0; i11 < jSONArrayM12175i.length(); i11++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayM12175i.optJSONObject(i11);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("name");
                        if (("telephony".equals(strOptString) || "widevine".equals(strOptString) || "android".equals(strOptString) || "installation".equals(strOptString)) && C6541g0.m12299f(jSONObjectOptJSONObject)) {
                            switch (strOptString.hashCode()) {
                                case -1400551171:
                                    if (strOptString.equals("widevine")) {
                                        b11 = 1;
                                    } else {
                                        b11 = -1;
                                    }
                                    break;
                                case -861391249:
                                    if (strOptString.equals("android")) {
                                        b11 = 2;
                                    } else {
                                        b11 = -1;
                                    }
                                    break;
                                case 783201304:
                                    if (strOptString.equals("telephony")) {
                                        b11 = 0;
                                    } else {
                                        b11 = -1;
                                    }
                                    break;
                                case 2037210682:
                                    if (strOptString.equals("installation")) {
                                        b11 = 3;
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
                                            strM12217a = null;
                                        } else {
                                            strM12217a = m12219c(context);
                                        }
                                    } else {
                                        strM12217a = m12218b(context);
                                    }
                                } else {
                                    strM12217a = C6531e0.m12238l();
                                }
                            } else {
                                strM12217a = m12217a(context);
                            }
                            String strOptString2 = jSONObjectOptJSONObject.optString("key", strOptString);
                            try {
                                String str = "";
                                if (TextUtils.isEmpty(strM12217a)) {
                                    jSONObject.put(strOptString2, jSONObjectOptJSONObject.optString("def", ""));
                                } else if (jSONObjectOptJSONObject.optBoolean("hash", true)) {
                                    String strOptString3 = jSONObjectOptJSONObject.optString("hashType");
                                    if (!TextUtils.isEmpty(strOptString3)) {
                                        strM12289w = AbstractC6539f3.m12273g(strM12217a, strOptString3);
                                    } else {
                                        strM12289w = AbstractC6539f3.m12289w(strM12217a);
                                    }
                                    if (strM12289w != null) {
                                        str = strM12289w;
                                    }
                                    jSONObject.put(strOptString2, str);
                                } else {
                                    jSONObject.put(strOptString2, strM12217a);
                                }
                            } catch (JSONException unused) {
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return jSONObject;
    }
}
