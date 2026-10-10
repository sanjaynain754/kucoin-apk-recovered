package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.kucoin.token.ITokenLifecycleRefreshSPI;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class AFf1eSDK implements AFf1dSDK {

    @NotNull
    private final AppsFlyerProperties AFAdRevenueData;

    @NotNull
    private final AFc1iSDK getCurrencyIso4217Code;

    @NotNull
    private final AFg1zSDK getRevenue;

    public AFf1eSDK(@NotNull AFg1zSDK aFg1zSDK, @NotNull AFc1iSDK aFc1iSDK, @NotNull AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(aFg1zSDK, "");
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.getRevenue = aFg1zSDK;
        this.getCurrencyIso4217Code = aFc1iSDK;
        this.AFAdRevenueData = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFf1dSDK
    public final void getRevenue(@NotNull Map<String, Object> map, @NotNull AFe1oSDK aFe1oSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFe1oSDK, "");
        AFg1ySDK aFg1ySDKAFAdRevenueData = this.getRevenue.AFAdRevenueData();
        AppsFlyerConsent appsFlyerConsent = this.getCurrencyIso4217Code.component4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (appsFlyerConsent != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Boolean boolIsUserSubjectToGDPR = appsFlyerConsent.isUserSubjectToGDPR();
            if (boolIsUserSubjectToGDPR != null) {
                linkedHashMap2.put("gdpr_applies", boolIsUserSubjectToGDPR);
            }
            Boolean hasConsentForDataUsage = appsFlyerConsent.getHasConsentForDataUsage();
            if (hasConsentForDataUsage != null) {
                linkedHashMap2.put("ad_user_data_enabled", hasConsentForDataUsage);
            }
            Boolean hasConsentForAdsPersonalization = appsFlyerConsent.getHasConsentForAdsPersonalization();
            if (hasConsentForAdsPersonalization != null) {
                linkedHashMap2.put("ad_personalization_enabled", hasConsentForAdsPersonalization);
            }
            Boolean hasConsentForAdStorage = appsFlyerConsent.getHasConsentForAdStorage();
            if (hasConsentForAdStorage != null) {
                linkedHashMap2.put("ad_storage_enabled", hasConsentForAdStorage);
            }
            linkedHashMap.put(ITokenLifecycleRefreshSPI.Companion.SOURCE_MANUAL, linkedHashMap2);
        }
        if (aFg1ySDKAFAdRevenueData != null) {
            boolean z11 = appsFlyerConsent != null;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("policy_version", Integer.valueOf(aFg1ySDKAFAdRevenueData.getMonetizationNetwork));
            linkedHashMap3.put("cmp_sdk_id", Integer.valueOf(aFg1ySDKAFAdRevenueData.getRevenue));
            linkedHashMap3.put("cmp_sdk_version", Integer.valueOf(aFg1ySDKAFAdRevenueData.getCurrencyIso4217Code));
            if (z11) {
                linkedHashMap3.put("gdpr_applies", -1);
                linkedHashMap3.put("tcstring", "");
            } else {
                linkedHashMap3.put("gdpr_applies", Integer.valueOf(aFg1ySDKAFAdRevenueData.AFAdRevenueData));
                linkedHashMap3.put("tcstring", aFg1ySDKAFAdRevenueData.getMediationNetwork);
            }
            linkedHashMap.put("tcf", linkedHashMap3);
        }
        if (!linkedHashMap.isEmpty()) {
            map.put("consent_data", linkedHashMap);
        }
        if (aFe1oSDK != AFe1oSDK.CONVERSION || this.AFAdRevenueData.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION) == null) {
            return;
        }
        Map<String, Object> monetizationNetwork = AFa1ySDK.getMonetizationNetwork(map);
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        monetizationNetwork.put("api", MapsKt.mapOf(TuplesKt.m90091to(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, this.AFAdRevenueData.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))));
    }
}
