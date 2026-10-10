package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.tencent.bugly.proguard.C33820nf;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1qSDK extends AFe1cSDK<Map<String, Object>> {
    private static final List<String> component1 = Arrays.asList("googleplay", "playstore", "googleplaystore");

    @Nullable
    private String AFKeystoreWrapper;
    private final AFh1tSDK copy;
    private final AFd1mSDK copydefault;
    private final AFc1kSDK equals;

    @Nullable
    private Map<String, Object> hashCode;
    private final AFc1pSDK toString;

    @Override // com.appsflyer.internal.AFe1cSDK, com.appsflyer.internal.AFe1mSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1cSDK
    @Nullable
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1cSDK
    public final boolean equals() {
        return false;
    }

    public AFg1qSDK(@NonNull AFd1zSDK aFd1zSDK) {
        super(AFe1oSDK.GCDSDK, new AFe1oSDK[]{AFe1oSDK.RC_CDN}, aFd1zSDK, "GCD-FETCH");
        this.copydefault = aFd1zSDK.AFAdRevenueData();
        this.toString = aFd1zSDK.component4();
        this.copy = aFd1zSDK.component3();
        this.equals = aFd1zSDK.getCurrencyIso4217Code();
        this.getRevenue.add(AFe1oSDK.CONVERSION);
        this.getRevenue.add(AFe1oSDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFe1cSDK
    public final AFd1iSDK<Map<String, Object>> AFAdRevenueData(@NonNull String str) {
        String strConcat;
        String mediationNetwork = AFa1ySDK.getMediationNetwork(this.toString, this.equals.component4());
        if (mediationNetwork == null || mediationNetwork.trim().isEmpty()) {
            strConcat = "";
        } else if (component1.contains(mediationNetwork.toLowerCase(Locale.getDefault()))) {
            AFLogger.afWarnLog(String.format("[GCD] AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", mediationNetwork));
            strConcat = "";
        } else {
            strConcat = C33820nf.f71144W.concat(mediationNetwork);
        }
        AFd1iSDK<Map<String, Object>> currencyIso4217Code = this.copydefault.getCurrencyIso4217Code(strConcat, str);
        StringBuilder sb2 = new StringBuilder("[GCD-B01] URL: ");
        sb2.append(currencyIso4217Code.getRevenue.getCurrencyIso4217Code);
        AFLogger.afInfoLog(sb2.toString());
        return currencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFe1cSDK, com.appsflyer.internal.AFe1mSDK
    @NonNull
    public final AFe1qSDK getRevenue() throws Exception {
        AFe1qSDK revenue;
        AFe1qSDK aFe1qSDK;
        if (((AFe1cSDK) this).component3.getMediationNetwork()) {
            AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
            this.AFKeystoreWrapper = "'isStopTracking' enabled";
            throw new AFe1kSDK();
        }
        AFe1qSDK aFe1qSDK2 = AFe1qSDK.FAILURE;
        int i11 = 0;
        while (i11 <= 2) {
            boolean z11 = true;
            boolean z12 = i11 >= 2;
            this.copy.copy = System.currentTimeMillis();
            try {
                try {
                    revenue = super.getRevenue();
                    ResponseNetwork responseNetwork = ((AFe1cSDK) this).component2;
                    if (responseNetwork != null) {
                        int statusCode = responseNetwork.getStatusCode();
                        if (statusCode != 403 && statusCode < 500) {
                            z11 = false;
                        }
                        if (responseNetwork.isSuccessful() || statusCode == 404) {
                            Map<String, Object> map = (Map) responseNetwork.getBody();
                            int statusCode2 = responseNetwork.getStatusCode();
                            Boolean bool = (Boolean) map.get("iscache");
                            if (statusCode2 == 404) {
                                map.remove("error_reason");
                                map.remove("status_code");
                                map.put("af_status", "Organic");
                                map.put("af_message", "organic install");
                            }
                            if (bool != null && !bool.booleanValue()) {
                                this.toString.getCurrencyIso4217Code("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                            }
                            if (map.containsKey("af_siteid")) {
                                if (map.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                    StringBuilder sb2 = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                    sb2.append(map.get(AFInAppEventParameterName.AF_CHANNEL));
                                    AFLogger.afDebugLog(sb2.toString());
                                } else {
                                    AFLogger.afDebugLog(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", map.get("af_siteid")));
                                }
                            }
                            map.put("is_first_launch", Boolean.FALSE);
                            this.toString.getMonetizationNetwork("attributionId", new JSONObject(map).toString());
                            if (!this.toString.getMonetizationNetwork("sixtyDayConversionData", false)) {
                                map.put("is_first_launch", Boolean.TRUE);
                            }
                            this.hashCode = map;
                            aFe1qSDK = AFe1qSDK.SUCCESS;
                        } else {
                            if (!z12) {
                                if (!z11) {
                                }
                            }
                            this.AFKeystoreWrapper = "Error connection to server: ".concat(String.valueOf(statusCode));
                            aFe1qSDK = AFe1qSDK.FAILURE;
                        }
                        this.copy.getMonetizationNetwork(i11);
                        AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                        return aFe1qSDK;
                    }
                } catch (AFe1pSDK e11) {
                    AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
                    this.AFKeystoreWrapper = "AppsFlyer dev key is missing";
                    throw e11;
                } catch (Exception e12) {
                    StringBuilder sb3 = new StringBuilder("[GCD] Error: ");
                    sb3.append(e12.getMessage());
                    AFLogger.afErrorLog(sb3.toString(), e12, false, false);
                    revenue = AFe1qSDK.FAILURE;
                    if (z12) {
                        this.AFKeystoreWrapper = e12.getMessage();
                        throw e12;
                    }
                }
                this.copy.getMonetizationNetwork(i11);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                aFe1qSDK2 = revenue;
                i11++;
            } catch (Throwable th2) {
                this.copy.getMonetizationNetwork(i11);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                throw th2;
            }
        }
        return aFe1qSDK2;
    }

    @Override // com.appsflyer.internal.AFe1cSDK, com.appsflyer.internal.AFe1mSDK
    public final void getMonetizationNetwork() {
        super.getMonetizationNetwork();
        Map<String, Object> map = this.hashCode;
        String str = this.AFKeystoreWrapper;
        if (map != null) {
            AFg1nSDK.AFAdRevenueData(map);
        } else if (str != null && !str.isEmpty()) {
            AFg1nSDK.getMonetizationNetwork(str);
        } else {
            AFg1nSDK.getMonetizationNetwork("Unknown error");
        }
    }
}
