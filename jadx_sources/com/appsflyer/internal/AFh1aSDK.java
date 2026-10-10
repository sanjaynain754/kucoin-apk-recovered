package com.appsflyer.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1aSDK {
    public final int AFAdRevenueData;
    public final int getCurrencyIso4217Code;
    public final String getMediationNetwork;
    public final long getMonetizationNetwork;

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && AFh1aSDK.class == obj.getClass()) {
            AFh1aSDK aFh1aSDK = (AFh1aSDK) obj;
            if (this.getCurrencyIso4217Code == aFh1aSDK.getCurrencyIso4217Code && this.AFAdRevenueData == aFh1aSDK.AFAdRevenueData && this.getMonetizationNetwork == aFh1aSDK.getMonetizationNetwork && (str = this.getMediationNetwork) != null && str.equals(aFh1aSDK.getMediationNetwork)) {
                return true;
            }
        }
        return false;
    }

    public final String getRevenue() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_ver", this.getMediationNetwork);
            jSONObject.put("min", this.getCurrencyIso4217Code);
            jSONObject.put("expire", this.AFAdRevenueData);
            jSONObject.put("ttl", this.getMonetizationNetwork);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final int hashCode() {
        String str = this.getMediationNetwork;
        return ((((((str != null ? str.hashCode() : 0) * 31) + this.getCurrencyIso4217Code) * 31) + this.AFAdRevenueData) * 31) + ((int) this.getMonetizationNetwork);
    }

    public AFh1aSDK(String str, int i11, int i12, long j11) {
        this.getMediationNetwork = str;
        this.getCurrencyIso4217Code = i11;
        this.AFAdRevenueData = i12;
        this.getMonetizationNetwork = j11;
    }
}
