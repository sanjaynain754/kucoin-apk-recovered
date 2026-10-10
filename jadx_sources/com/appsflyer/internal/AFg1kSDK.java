package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1kSDK extends AFe1mSDK<Void> {

    @Nullable
    private final Throwable component2;

    @Nullable
    private final AFe1zSDK<String> component3;
    private final AFc1pSDK component4;

    @Override // com.appsflyer.internal.AFe1mSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    public AFg1kSDK(AFf1sSDK aFf1sSDK, AFc1pSDK aFc1pSDK) {
        super(AFe1oSDK.GCDSDK, new AFe1oSDK[]{AFe1oSDK.RC_CDN}, "GCD-CHECK");
        this.component2 = aFf1sSDK.component4();
        this.component3 = ((AFe1cSDK) aFf1sSDK).component2;
        this.component4 = aFc1pSDK;
    }

    @Nullable
    private Map<String, Object> component3() {
        String mediationNetwork = this.component4.getMediationNetwork("attributionId", null);
        if (mediationNetwork == null) {
            return null;
        }
        try {
            new AFd1fSDK();
            return AFd1fSDK.getMediationNetwork(mediationNetwork);
        } catch (JSONException e11) {
            StringBuilder sb2 = new StringBuilder("[GCD] Failed to parse GCD response: ");
            sb2.append(e11.getMessage());
            AFLogger.afErrorLog(sb2.toString(), e11);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final long getCurrencyIso4217Code() {
        return 1000L;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    @NonNull
    public final AFe1qSDK getRevenue() throws Exception {
        AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf(this.component4.AFAdRevenueData("appsFlyerCount", 0))));
        long jAFAdRevenueData = this.component4.AFAdRevenueData("appsflyerConversionDataCacheExpiration", 0L);
        if (jAFAdRevenueData != 0 && System.currentTimeMillis() - jAFAdRevenueData > 5184000000L) {
            AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
            this.component4.getRevenue("sixtyDayConversionData", true);
            this.component4.getMonetizationNetwork("attributionId", (String) null);
            this.component4.getCurrencyIso4217Code("appsflyerConversionDataCacheExpiration", 0L);
        }
        Map<String, Object> mapComponent3 = component3();
        if (mapComponent3 != null) {
            try {
                if (!mapComponent3.containsKey("is_first_launch")) {
                    mapComponent3.put("is_first_launch", Boolean.FALSE);
                }
                AFg1nSDK.AFAdRevenueData(mapComponent3);
            } catch (Exception e11) {
                StringBuilder sb2 = new StringBuilder("[GCD] Error executing conversion data callback: ");
                sb2.append(e11.getLocalizedMessage());
                AFLogger.afErrorLog(sb2.toString(), e11);
            }
            return AFe1qSDK.SUCCESS;
        }
        try {
            if (this.component2 != null) {
                StringBuilder sb3 = new StringBuilder("Launch exception: ");
                sb3.append(this.component2.getMessage());
                AFg1nSDK.getMonetizationNetwork(sb3.toString());
                return AFe1qSDK.SUCCESS;
            }
            AFe1zSDK<String> aFe1zSDK = this.component3;
            if (aFe1zSDK != null && !aFe1zSDK.isSuccessful()) {
                StringBuilder sb4 = new StringBuilder("Launch status code: ");
                sb4.append(this.component3.getStatusCode());
                AFg1nSDK.getMonetizationNetwork(sb4.toString());
                return AFe1qSDK.SUCCESS;
            }
            return AFe1qSDK.FAILURE;
        } catch (Exception e12) {
            StringBuilder sb5 = new StringBuilder("[GCD] Error executing conversion data callback: ");
            sb5.append(e12.getLocalizedMessage());
            AFLogger.afErrorLog(sb5.toString(), e12);
        }
    }
}
