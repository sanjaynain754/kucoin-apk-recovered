package com.appsflyer.internal;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.webkit.ProxyConfig;
import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public final class AFh1zSDK {
    @VisibleForTesting
    private static String getMonetizationNetwork(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (i11 == 0 || i11 == str.length() - 1) {
                sb2.append(str.charAt(i11));
            } else {
                sb2.append(ProxyConfig.MATCH_ALL_SCHEMES);
            }
        }
        return sb2.toString();
    }

    public static String AFAdRevenueData(String str) {
        if (str.length() > 20) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str.substring(0, 10));
            sb2.append("...");
            return sb2.toString();
        }
        return str;
    }

    public static void getCurrencyIso4217Code(String str, @Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("appsflyerKey")) {
                    jSONObject.put("appsflyerKey", getMonetizationNetwork(jSONObject.getString("appsflyerKey")));
                }
                if (jSONObject.has("tcstring")) {
                    jSONObject.put("tcstring", AFAdRevenueData("tcstring"));
                }
                if (jSONObject.has("referrer")) {
                    jSONObject.put("referrer", AFAdRevenueData("referrer"));
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1ySDK aFh1ySDK = AFh1ySDK.OTHER;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(jSONObject);
                aFLogger.m5976i(aFh1ySDK, sb2.toString());
            } catch (JSONException e11) {
                AFLogger.INSTANCE.m5972e(AFh1ySDK.OTHER, "Not able to log the payload", e11);
            }
        }
    }
}
