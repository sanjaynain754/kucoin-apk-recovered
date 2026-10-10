package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.tencent.bugly.proguard.AbstractC34022xe;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1ySDK {
    private final boolean AFAdRevenueData;

    @NonNull
    public final String getCurrencyIso4217Code;

    @NonNull
    public final String getMediationNetwork;

    @NonNull
    public final AFh1dSDK getMonetizationNetwork;

    @Nullable
    public final AFi1zSDK getRevenue;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFi1ySDK.class != obj.getClass()) {
            return false;
        }
        AFi1ySDK aFi1ySDK = (AFi1ySDK) obj;
        if (this.AFAdRevenueData == aFi1ySDK.AFAdRevenueData && this.getCurrencyIso4217Code.equals(aFi1ySDK.getCurrencyIso4217Code)) {
            return this.getMediationNetwork.equals(aFi1ySDK.getMediationNetwork);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.AFAdRevenueData ? 1 : 0) * 31) + this.getCurrencyIso4217Code.hashCode()) * 31) + this.getMediationNetwork.hashCode();
        AFi1zSDK aFi1zSDK = this.getRevenue;
        return aFi1zSDK != null ? (iHashCode * 31) + aFi1zSDK.hashCode() : iHashCode;
    }

    public AFi1ySDK(@NonNull String str) throws JSONException {
        AFh1dSDK aFh1dSDK;
        AFi1zSDK aFi1zSDK;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("ver");
                this.getCurrencyIso4217Code = string;
                this.AFAdRevenueData = jSONObject.optBoolean("test_mode");
                this.getMediationNetwork = str;
                if (string.startsWith("default")) {
                    aFh1dSDK = AFh1dSDK.DEFAULT;
                } else {
                    aFh1dSDK = AFh1dSDK.CUSTOM;
                }
                this.getMonetizationNetwork = aFh1dSDK;
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(AbstractC34022xe.f72514e);
                if (jSONObjectOptJSONObject != null) {
                    aFi1zSDK = new AFi1zSDK(jSONObjectOptJSONObject);
                } else {
                    aFi1zSDK = null;
                }
                this.getRevenue = aFi1zSDK;
                return;
            } catch (JSONException e11) {
                AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", e11);
                throw new JSONException("Failed to parse remote configuration JSON");
            }
        }
        throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
    }
}
