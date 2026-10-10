package com.appsflyer;

import androidx.annotation.NonNull;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFh1ySDK;
import com.appsflyer.share.LinkGenerator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class AppsFlyer2dXConversionCallback implements AppsFlyerConversionListener, DeepLinkListener, LinkGenerator.ResponseListener {
    public native void onAppOpenAttributionNative(Object obj);

    public native void onAttributionFailureNative(Object obj);

    public native void onDeepLinkingNative(@NonNull DeepLinkResult deepLinkResult);

    public native void onInstallConversionDataLoadedNative(Object obj);

    public native void onInstallConversionFailureNative(Object obj);

    public native void onResponseErrorNative(String str);

    public native void onResponseNative(String str);

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    private void AFAdRevenueData(String str, String str2) {
        byte b11;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", "failure");
            jSONObject.put("data", str2);
            int iHashCode = str.hashCode();
            if (iHashCode != -1390007222) {
                if (iHashCode == 1050716216 && str.equals("onInstallConversionFailure")) {
                    b11 = 0;
                } else {
                    b11 = -1;
                }
            } else if (str.equals("onAttributionFailure")) {
                b11 = 1;
            } else {
                b11 = -1;
            }
            if (b11 == 0) {
                onInstallConversionFailureNative(jSONObject);
            } else {
                if (b11 != 1) {
                    return;
                }
                onAttributionFailureNative(jSONObject);
            }
        } catch (JSONException e11) {
            AFLogger.INSTANCE.m5974e(AFh1ySDK.OTHER, "2dx error", e11, false, false);
        }
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(String str) {
        AFAdRevenueData("onInstallConversionFailure", str);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(String str) {
        AFAdRevenueData("onAttributionFailure", str);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(Map<String, String> map) {
        onAppOpenAttributionNative(map);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(Map<String, Object> map) {
        onInstallConversionDataLoadedNative(map);
    }

    @Override // com.appsflyer.deeplink.DeepLinkListener
    public void onDeepLinking(@NonNull DeepLinkResult deepLinkResult) {
        onDeepLinkingNative(deepLinkResult);
    }

    @Override // com.appsflyer.share.LinkGenerator.ResponseListener
    public void onResponse(String str) {
        onResponseNative(str);
    }

    @Override // com.appsflyer.share.LinkGenerator.ResponseListener
    public void onResponseError(String str) {
        onResponseErrorNative(str);
    }
}
