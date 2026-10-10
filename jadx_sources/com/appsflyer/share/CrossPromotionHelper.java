package com.appsflyer.share;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1ySDK;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFe1dSDK;
import com.appsflyer.internal.AFe1nSDK;
import com.appsflyer.internal.AFe1nSDK.RunnableC51572;
import com.appsflyer.internal.AFh1ySDK;
import com.appsflyer.internal.AFk1sSDK;
import com.appsflyer.internal.AFk1tSDK;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class CrossPromotionHelper {
    private static String getMonetizationNetwork = "https://%simpression.%s";

    public static void logAndOpenStore(@NonNull Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, null);
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, null);
    }

    @NonNull
    private static LinkGenerator getRevenue(@NonNull Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.getMediationNetwork = str3;
        linkGenerator.AFAdRevenueData = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        return linkGenerator;
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator revenue = getRevenue(context, str, str2, map, String.format(AFk1tSDK.AFAdRevenueData, AppsFlyerLib.getInstance().getHostPrefix(), AFa1ySDK.getMonetizationNetwork().getHostName()));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.INSTANCE.mo5916i(AFh1ySDK.CROSS_PROMOTION, "CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.INSTANCE.mo5916i(AFh1ySDK.CROSS_PROMOTION, "SDK is stopped, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
        getMediationNetwork(revenue.generateLink(), context, new AFk1sSDK(context));
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.INSTANCE.mo5916i(AFh1ySDK.CROSS_PROMOTION, "CustomerUserId not set, Promote Impression is disabled", true);
        } else if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.INSTANCE.mo5916i(AFh1ySDK.CROSS_PROMOTION, "SDK is stopped, Promote Impression is disabled", true);
        } else {
            getMediationNetwork(getRevenue(context, str, str2, map, String.format(getMonetizationNetwork, AppsFlyerLib.getInstance().getHostPrefix(), AFa1ySDK.getMonetizationNetwork().getHostName())).generateLink(), context, null);
        }
    }

    private static void getMediationNetwork(@NonNull String str, @NonNull Context context, @Nullable AFk1sSDK aFk1sSDK) {
        AFa1ySDK monetizationNetwork = AFa1ySDK.getMonetizationNetwork();
        monetizationNetwork.getMonetizationNetwork(context);
        AFd1zSDK aFd1zSDK = (AFd1zSDK) AFa1ySDK.getCurrencyIso4217Code(new Object[]{monetizationNetwork}, 254507867, -254507852, System.identityHashCode(monetizationNetwork));
        AFe1dSDK aFe1dSDK = new AFe1dSDK(aFd1zSDK, str, aFk1sSDK);
        AFe1nSDK aFe1nSDKEquals = aFd1zSDK.equals();
        aFe1nSDKEquals.getMonetizationNetwork.execute(aFe1nSDKEquals.new RunnableC51572(aFe1dSDK));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    public static void setUrl(Map<String, String> map) {
        byte b11;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            int iHashCode = key.hashCode();
            if (iHashCode != 96801) {
                if (iHashCode == 120623625 && key.equals("impression")) {
                    b11 = 1;
                } else {
                    b11 = -1;
                }
            } else if (key.equals("app")) {
                b11 = 0;
            } else {
                b11 = -1;
            }
            if (b11 != 0) {
                if (b11 == 1) {
                    getMonetizationNetwork = value;
                }
            } else {
                AFk1tSDK.AFAdRevenueData = value;
            }
        }
    }
}
