package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFe1nSDK.RunnableC51572;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public final class AFa1vSDK implements Runnable {
    private final WeakReference<Context> AFAdRevenueData;
    private final Map<String, String> areAllFieldsValid;
    private final String component1;
    private final String component2;
    private final String getCurrencyIso4217Code;
    final String getMediationNetwork;
    final String getMonetizationNetwork;
    final String getRevenue;

    public static void getCurrencyIso4217Code(boolean z11, String str, String str2, String str3, String str4) {
        if (AFa1ySDK.getRevenue != null) {
            StringBuilder sb2 = new StringBuilder("Validate callback parameters: ");
            sb2.append(str);
            sb2.append(C33627eb.f69716f);
            sb2.append(str2);
            sb2.append(C33627eb.f69716f);
            sb2.append(str3);
            AFLogger.afDebugLog(sb2.toString());
            if (z11) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AFa1ySDK.getRevenue.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFa1ySDK.getRevenue;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.getCurrencyIso4217Code;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        try {
            Context context = this.AFAdRevenueData.get();
            if (context == null) {
                return;
            }
            HashMap map = new HashMap();
            map.put("public-key", this.component1);
            map.put("sig-data", this.getMediationNetwork);
            map.put(TUIConstants.TUICalling.PARAM_NAME_AUDIO_SIGNATURE, this.component2);
            Object map2 = new HashMap(map);
            Object obj = this.areAllFieldsValid;
            AFa1ySDK monetizationNetwork = AFa1ySDK.getMonetizationNetwork();
            String mediationNetwork = ((AFd1zSDK) AFa1ySDK.getCurrencyIso4217Code(new Object[]{monetizationNetwork}, 254507867, -254507852, System.identityHashCode(monetizationNetwork))).component4().getMediationNetwork("referrer", "");
            AFh1bSDK aFh1bSDK = new AFh1bSDK();
            aFh1bSDK.component1 = mediationNetwork;
            AFa1ySDK monetizationNetwork2 = AFa1ySDK.getMonetizationNetwork();
            Map<String, Object> revenue = monetizationNetwork2.getRevenue(aFh1bSDK);
            revenue.put(FirebaseAnalytics.Param.PRICE, this.getRevenue);
            revenue.put(FirebaseAnalytics.Param.CURRENCY, this.getMonetizationNetwork);
            revenue.put("receipt_data", map2);
            if (obj != null) {
                revenue.put("extra_prms", obj);
            }
            revenue.putAll(((AFd1zSDK) AFa1ySDK.getCurrencyIso4217Code(new Object[]{monetizationNetwork2}, 254507867, -254507852, System.identityHashCode(monetizationNetwork2))).AFKeystoreWrapper().getCurrencyIso4217Code());
            aFh1bSDK.getMonetizationNetwork((Map<String, ?>) revenue);
            getMediationNetwork(context, aFh1bSDK);
            map.put("dev_key", this.getCurrencyIso4217Code);
            map.put("app_id", context.getPackageName());
            map.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            AFa1ySDK monetizationNetwork3 = AFa1ySDK.getMonetizationNetwork();
            AdvertisingIdData advertisingIdData = ((AFd1zSDK) AFa1ySDK.getCurrencyIso4217Code(new Object[]{monetizationNetwork3}, 254507867, -254507852, System.identityHashCode(monetizationNetwork3))).getCurrencyIso4217Code().AFAdRevenueData.component3;
            AFb1jSDK aFb1jSDK = advertisingIdData != null ? new AFb1jSDK(advertisingIdData.advertisingId, advertisingIdData.isLimited) : null;
            String str2 = aFb1jSDK != null ? aFb1jSDK.getMonetizationNetwork : null;
            if (str2 != null) {
                map.put("advertiserId", str2);
            }
            AFh1cSDK aFh1cSDK = (AFh1cSDK) new AFh1cSDK().getMonetizationNetwork(map);
            final AFf1tSDK mediationNetwork2 = getMediationNetwork(context, aFh1cSDK);
            aFh1cSDK.getRevenue = new AppsFlyerRequestListener() { // from class: com.appsflyer.internal.AFa1vSDK.1
                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onError(int i11, @NonNull String str3) {
                    ResponseNetwork responseNetwork;
                    if (i11 == 50 && (responseNetwork = ((AFe1cSDK) mediationNetwork2).component2) != null) {
                        str3 = responseNetwork.toString();
                    }
                    AFa1vSDK aFa1vSDK = AFa1vSDK.this;
                    AFa1vSDK.getCurrencyIso4217Code(false, aFa1vSDK.getMediationNetwork, aFa1vSDK.getRevenue, aFa1vSDK.getMonetizationNetwork, str3);
                }

                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onSuccess() {
                    try {
                        JSONObject jSONObject = new JSONObject((String) ((AFe1cSDK) mediationNetwork2).component2.getBody());
                        AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf(jSONObject)));
                        boolean zOptBoolean = jSONObject.optBoolean(DbParams.KEY_CHANNEL_RESULT);
                        AFa1vSDK aFa1vSDK = AFa1vSDK.this;
                        AFa1vSDK.getCurrencyIso4217Code(zOptBoolean, aFa1vSDK.getMediationNetwork, aFa1vSDK.getRevenue, aFa1vSDK.getMonetizationNetwork, jSONObject.toString());
                    } catch (Exception e11) {
                        AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf(e11)), e11);
                        AFa1vSDK aFa1vSDK2 = AFa1vSDK.this;
                        AFa1vSDK.getCurrencyIso4217Code(false, aFa1vSDK2.getMediationNetwork, aFa1vSDK2.getRevenue, aFa1vSDK2.getMonetizationNetwork, e11.getMessage());
                    }
                }
            };
        } catch (Throwable th2) {
            if (AFa1ySDK.getRevenue != null) {
                AFLogger.afErrorLog("Failed Validate request + ex", th2);
                getCurrencyIso4217Code(false, this.getMediationNetwork, this.getRevenue, this.getMonetizationNetwork, th2.getMessage());
            }
            AFLogger.afErrorLog(th2.getMessage(), th2);
        }
    }

    public AFa1vSDK(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.AFAdRevenueData = new WeakReference<>(context);
        this.getCurrencyIso4217Code = str;
        this.component1 = str2;
        this.getMediationNetwork = str4;
        this.getRevenue = str5;
        this.getMonetizationNetwork = str6;
        this.areAllFieldsValid = map;
        this.component2 = str3;
    }

    private static AFf1tSDK getMediationNetwork(Context context, @NonNull AFh1eSDK aFh1eSDK) {
        AFa1ySDK.getMonetizationNetwork().getMonetizationNetwork(context);
        AFa1ySDK monetizationNetwork = AFa1ySDK.getMonetizationNetwork();
        AFd1zSDK aFd1zSDK = (AFd1zSDK) AFa1ySDK.getCurrencyIso4217Code(new Object[]{monetizationNetwork}, 254507867, -254507852, System.identityHashCode(monetizationNetwork));
        aFh1eSDK.getCurrencyIso4217Code(aFd1zSDK.getCurrencyIso4217Code().getRevenue.AFAdRevenueData("appsFlyerCount", 0));
        AFf1tSDK aFf1tSDK = new AFf1tSDK(aFh1eSDK, aFd1zSDK);
        AFe1nSDK aFe1nSDKEquals = aFd1zSDK.equals();
        aFe1nSDKEquals.getMonetizationNetwork.execute(aFe1nSDKEquals.new RunnableC51572(aFf1tSDK));
        return aFf1tSDK;
    }
}
