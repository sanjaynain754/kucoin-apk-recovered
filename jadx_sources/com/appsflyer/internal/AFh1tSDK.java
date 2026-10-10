package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1tSDK {
    public final AFc1pSDK getMediationNetwork;
    public final AFc1kSDK getMonetizationNetwork;
    public long toString;
    public final Map<String, Object> getCurrencyIso4217Code = new ConcurrentHashMap();
    public final Map<String, Object> AFAdRevenueData = new ConcurrentHashMap();
    public final Map<String, Object> getRevenue = new ConcurrentHashMap();
    public long areAllFieldsValid = 0;
    public long component1 = 0;
    public final long[] component4 = new long[2];
    public final long[] component3 = new long[2];
    public final long[] component2 = new long[2];
    public long hashCode = 0;
    public long copy = 0;

    public final void getMediationNetwork(AFh1uSDK aFh1uSDK) {
        if (getCurrencyIso4217Code()) {
            this.getCurrencyIso4217Code.put("start_with", aFh1uSDK.toString());
            this.getMediationNetwork.getMonetizationNetwork("first_launch", new JSONObject(this.getCurrencyIso4217Code).toString());
        }
    }

    public final void getMonetizationNetwork(int i11) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = this.copy;
        if (j11 != 0) {
            this.getRevenue.put("net", Long.valueOf(jCurrentTimeMillis - j11));
        } else {
            AFLogger.afInfoLog("Metrics: gcdStart ts is missing");
        }
        this.getRevenue.put("retries", Integer.valueOf(i11));
        this.getMediationNetwork.getMonetizationNetwork("gcd", new JSONObject(this.getRevenue).toString());
    }

    public final boolean getCurrencyIso4217Code() {
        return this.getMonetizationNetwork.getRevenue.AFAdRevenueData("appsFlyerCount", 0) == 0;
    }

    public AFh1tSDK(AFc1pSDK aFc1pSDK, AFc1kSDK aFc1kSDK) {
        this.getMediationNetwork = aFc1pSDK;
        this.getMonetizationNetwork = aFc1kSDK;
    }

    public final void getRevenue() {
        this.component1 = System.currentTimeMillis();
        if (getCurrencyIso4217Code()) {
            long j11 = this.areAllFieldsValid;
            if (j11 != 0) {
                this.getCurrencyIso4217Code.put("init_to_fg", Long.valueOf(this.component1 - j11));
                this.getMediationNetwork.getMonetizationNetwork("first_launch", new JSONObject(this.getCurrencyIso4217Code).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: init ts is missing");
        }
    }

    public final void getMediationNetwork(DeepLinkResult deepLinkResult, long j11) {
        this.AFAdRevenueData.put("status", deepLinkResult.getStatus().toString());
        this.AFAdRevenueData.put("timeout_value", Long.valueOf(j11));
    }

    public final Map<String, Object> getMediationNetwork(String str) {
        Map<String, Object> map = Collections.EMPTY_MAP;
        String mediationNetwork = this.getMediationNetwork.getMediationNetwork(str, null);
        if (mediationNetwork != null) {
            try {
                return AFg1gSDK.getMediationNetwork(new JSONObject(mediationNetwork));
            } catch (Exception e11) {
                AFLogger.afErrorLog("Error while parsing cached json data", e11, true);
            }
        }
        return map;
    }

    public final boolean getMonetizationNetwork() {
        return this.getMonetizationNetwork.getRevenue.AFAdRevenueData("appsFlyerCount", 0) == 1;
    }
}
