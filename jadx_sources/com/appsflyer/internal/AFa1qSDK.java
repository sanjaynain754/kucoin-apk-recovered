package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFe1nSDK.RunnableC51572;
import com.facebook.AccessToken;
import com.kubi.user.protocol.entity.SignTermItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class AFa1qSDK {

    @Nullable
    public String[] areAllFieldsValid;
    public long component2;
    public final AFd1zSDK component4;

    @Nullable
    public DeepLinkListener getCurrencyIso4217Code;
    public Intent getMediationNetwork;
    public String getMonetizationNetwork;
    public Map<String, String> getRevenue;

    @NonNull
    public List<List<String>> AFAdRevenueData = new ArrayList();

    @NonNull
    public final List<String> component1 = new ArrayList();

    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX INFO: renamed from: h_ */
    private boolean m5919h_(Intent intent, AFa1gSDK aFa1gSDK) {
        String string;
        Uri uriM5920i_;
        Uri uri = null;
        Uri data = (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData();
        Intent intent2 = this.getMediationNetwork;
        Uri data2 = (intent2 == null || !"android.intent.action.VIEW".equals(intent2.getAction())) ? null : intent2.getData();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (!this.AFAdRevenueData.isEmpty() && extras != null) {
                for (List<String> list : this.AFAdRevenueData) {
                    if (list == null) {
                        uriM5920i_ = null;
                    } else {
                        Iterator<String> it = list.iterator();
                        if (it.hasNext() && (string = extras.getString(it.next())) != null) {
                            uriM5920i_ = m5920i_(string, it);
                        } else {
                            uriM5920i_ = null;
                        }
                    }
                    if (uriM5920i_ != null) {
                        StringBuilder sb2 = new StringBuilder("Found deeplink in push payload at ");
                        sb2.append(list.toString());
                        AFLogger.afDebugLog(sb2.toString());
                        List<List<String>> list2 = this.AFAdRevenueData;
                        Intrinsics.checkNotNullParameter("payloadKey", "");
                        Map<String, Object> monetizationNetwork = AFa1ySDK.getMonetizationNetwork(aFa1gSDK.AFAdRevenueData);
                        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                        monetizationNetwork.put("payloadKey", list2);
                        AFa1jSDK aFa1jSDK = aFa1gSDK.getRevenue;
                        if (aFa1jSDK != null) {
                            aFa1jSDK.getMediationNetwork(aFa1gSDK.AFAdRevenueData);
                        }
                        uri = uriM5920i_;
                        break;
                    }
                }
            }
        } else {
            AFLogger.afDebugLog("Could not extract deeplink from null intent");
        }
        if (data != null) {
            AFj1hSDK aFj1hSDK = new AFj1hSDK(intent);
            if (!aFj1hSDK.getMonetizationNetwork("af_consumed")) {
                aFj1hSDK.m5993I_("af_consumed", System.currentTimeMillis());
                m5922g_(aFa1gSDK, data);
                return true;
            }
            StringBuilder sb3 = new StringBuilder("skipping re-use of previously consumed deep link: ");
            sb3.append(data.toString());
            sb3.append(" w/af_consumed");
            AFLogger.afInfoLog(sb3.toString());
            return false;
        }
        if (data2 != null) {
            AFj1hSDK aFj1hSDK2 = new AFj1hSDK(this.getMediationNetwork);
            if (!aFj1hSDK2.getMonetizationNetwork("af_consumed")) {
                aFj1hSDK2.m5993I_("af_consumed", System.currentTimeMillis());
                m5922g_(aFa1gSDK, data2);
                return true;
            }
            StringBuilder sb4 = new StringBuilder("skipping re-use of previously consumed trampoline deep link: ");
            sb4.append(data2.toString());
            sb4.append(" w/af_consumed");
            AFLogger.afInfoLog(sb4.toString());
            return false;
        }
        if (uri == null) {
            AFLogger.afDebugLog("No deep link detected");
            return false;
        }
        AFj1hSDK aFj1hSDK3 = new AFj1hSDK(intent);
        if (!aFj1hSDK3.getMonetizationNetwork("af_consumed")) {
            aFj1hSDK3.m5993I_("af_consumed", System.currentTimeMillis());
            m5922g_(aFa1gSDK, uri);
            return true;
        }
        StringBuilder sb5 = new StringBuilder("skipping re-use of previously consumed deep link from push: ");
        sb5.append(uri.toString());
        sb5.append(" w/af_consumed");
        AFLogger.afInfoLog(sb5.toString());
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: i_ */
    private Uri m5920i_(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri uri = Uri.parse(obj.toString());
                if (uri == null || uri.getScheme() == null || uri.getHost() == null) {
                    return null;
                }
                return uri;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException e11) {
                AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", e11);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f_ */
    public final void m5921f_(AFa1gSDK aFa1gSDK, Intent intent, Context context) {
        AFc1dSDK aFc1dSDK = (AFc1dSDK) this.component4;
        if (context != null) {
            aFc1dSDK.getMonetizationNetwork.getMonetizationNetwork = context.getApplicationContext();
        }
        if (!m5919h_(intent, aFa1gSDK) && this.getCurrencyIso4217Code != null && this.component4.getCurrencyIso4217Code().getRevenue.AFAdRevenueData("appsFlyerCount", 0) == 0 && !this.component4.component4().getMonetizationNetwork("ddl_sent", false)) {
            AFa1rSDK aFa1rSDK = new AFa1rSDK();
            AFe1nSDK aFe1nSDKEquals = this.component4.equals();
            aFe1nSDKEquals.getMonetizationNetwork.execute(aFe1nSDKEquals.new RunnableC51572(new AFf1zSDK(aFa1rSDK, this.component4)));
        }
        this.component4.component4().getRevenue("ddl_sent", true);
    }

    /* JADX INFO: renamed from: g_ */
    public final void m5922g_(AFa1gSDK aFa1gSDK, Uri uri) {
        AFf1xSDK aFf1xSDK = new AFf1xSDK(this, aFa1gSDK, uri, this.component1);
        AFe1nSDK aFe1nSDKEquals = this.component4.equals();
        aFe1nSDKEquals.getMonetizationNetwork.execute(aFe1nSDKEquals.new RunnableC51572(aFf1xSDK));
        this.getMediationNetwork = null;
    }

    public final void getCurrencyIso4217Code(DeepLinkResult deepLinkResult) {
        if (this.getCurrencyIso4217Code == null) {
            AFLogger.INSTANCE.m5971d(AFh1ySDK.DDL, "skipping, no callback registered");
            return;
        }
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1ySDK aFh1ySDK = AFh1ySDK.DDL;
        StringBuilder sb2 = new StringBuilder("Calling onDeepLinking with:\n");
        sb2.append(deepLinkResult.toString());
        aFLogger.m5971d(aFh1ySDK, sb2.toString());
        try {
            this.getCurrencyIso4217Code.onDeepLinking(deepLinkResult);
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
        }
    }

    public final void getMonetizationNetwork(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (this.getCurrencyIso4217Code != null) {
            try {
                try {
                    DeepLink mediationNetwork = DeepLink.getMediationNetwork(map);
                    mediationNetwork.getMediationNetwork.put("is_deferred", false);
                    deepLinkResult = new DeepLinkResult(mediationNetwork, null);
                } catch (JSONException e11) {
                    AFLogger.INSTANCE.m5973e(AFh1ySDK.DDL, "Error occurred", e11, true);
                    deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                }
                getCurrencyIso4217Code(deepLinkResult);
                return;
            } catch (Throwable th2) {
                getCurrencyIso4217Code(new DeepLinkResult(null, null));
                throw th2;
            }
        }
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1ySDK.getMonetizationNetwork().getMediationNetwork;
        if (appsFlyerConversionListener != null) {
            try {
                StringBuilder sb2 = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb2.append(map.toString());
                AFLogger.afDebugLog(sb2.toString());
                appsFlyerConversionListener.onAppOpenAttribution(map);
            } catch (Throwable th3) {
                AFLogger.afErrorLog(th3.getLocalizedMessage(), th3);
            }
        }
    }

    public final void getRevenue(String str, DeepLinkResult.Error error) {
        if (this.getCurrencyIso4217Code == null) {
            getMediationNetwork(str);
        } else {
            AFLogger.INSTANCE.m5971d(AFh1ySDK.DDL, "Error occurred: ".concat(String.valueOf(str)));
            getCurrencyIso4217Code(new DeepLinkResult(null, error));
        }
    }

    /* JADX INFO: renamed from: j_ */
    public final void m5923j_(AFa1gSDK aFa1gSDK, Uri uri, @Nullable Uri uri2) {
        if (!aFa1gSDK.AFAdRevenueData("af_deeplink")) {
            String string = uri.toString();
            if (string == null) {
                string = null;
            } else if (string.matches("fb\\d*?://authorize.*") && string.contains(AccessToken.ACCESS_TOKEN_KEY)) {
                int iIndexOf = string.indexOf(63);
                String strSubstring = iIndexOf == -1 ? "" : string.substring(iIndexOf);
                if (strSubstring.length() != 0) {
                    ArrayList arrayList = new ArrayList();
                    if (strSubstring.contains("&")) {
                        arrayList = new ArrayList(Arrays.asList(strSubstring.split("&")));
                    } else {
                        arrayList.add(strSubstring);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (str.contains(AccessToken.ACCESS_TOKEN_KEY)) {
                            it.remove();
                        } else {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            } else if (!str.startsWith("?")) {
                                sb2.append("?");
                            }
                            sb2.append(str);
                        }
                    }
                    string = string.replace(strSubstring, sb2.toString());
                }
            }
            String str2 = this.getMonetizationNetwork;
            if (str2 != null && this.getRevenue != null && string.contains(str2)) {
                Uri.Builder builderBuildUpon = Uri.parse(string).buildUpon();
                Uri.Builder builderBuildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry<String, String> entry : this.getRevenue.entrySet()) {
                    builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    builderBuildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                string = builderBuildUpon.build().toString();
                String encodedQuery = builderBuildUpon2.build().getEncodedQuery();
                Intrinsics.checkNotNullParameter("appended_query_params", "");
                aFa1gSDK.AFAdRevenueData.put("appended_query_params", encodedQuery);
                AFa1jSDK aFa1jSDK = aFa1gSDK.getRevenue;
                if (aFa1jSDK != null) {
                    aFa1jSDK.getMediationNetwork(aFa1gSDK.AFAdRevenueData);
                }
            }
            Intrinsics.checkNotNullParameter("af_deeplink", "");
            aFa1gSDK.AFAdRevenueData.put("af_deeplink", string);
            AFa1jSDK aFa1jSDK2 = aFa1gSDK.getRevenue;
            if (aFa1jSDK2 != null) {
                aFa1jSDK2.getMediationNetwork(aFa1gSDK.AFAdRevenueData);
            }
        }
        final HashMap map = new HashMap();
        map.put(SignTermItem.LINK, uri.toString());
        if (uri2 != null) {
            map.put("original_link", uri2.toString());
        }
        AFj1jSDK.m5997M_(this.component4.getCurrencyIso4217Code().m5954n_(), map, uri);
        AFf1rSDK aFf1rSDK = new AFf1rSDK(this.component4, UUID.randomUUID(), uri);
        if (aFf1rSDK.copy()) {
            Boolean bool = Boolean.TRUE;
            Intrinsics.checkNotNullParameter("isBrandedDomain", "");
            aFa1gSDK.AFAdRevenueData.put("isBrandedDomain", bool);
            AFa1jSDK aFa1jSDK3 = aFa1gSDK.getRevenue;
            if (aFa1jSDK3 != null) {
                aFa1jSDK3.getMediationNetwork(aFa1gSDK.AFAdRevenueData);
            }
        }
        if (!aFf1rSDK.copydefault()) {
            this.component4.mo5947e().getMonetizationNetwork(map);
            return;
        }
        aFf1rSDK.component1 = new AFf1rSDK.AFa1ySDK() { // from class: com.appsflyer.internal.AFa1qSDK.4
            @Override // com.appsflyer.internal.AFf1rSDK.AFa1ySDK
            public final void getMediationNetwork(String str3) {
                AFa1qSDK.this.getRevenue(str3, DeepLinkResult.Error.NETWORK);
            }

            @Override // com.appsflyer.internal.AFf1rSDK.AFa1ySDK
            public final void AFAdRevenueData(Map<String, String> map2) {
                for (String str3 : map2.keySet()) {
                    map.put(str3, map2.get(str3));
                }
                AFa1qSDK.this.getMonetizationNetwork(map);
            }
        };
        AFe1nSDK aFe1nSDKEquals = this.component4.equals();
        aFe1nSDKEquals.getMonetizationNetwork.execute(aFe1nSDKEquals.new RunnableC51572(aFf1rSDK));
    }

    public AFa1qSDK(@NonNull AFd1zSDK aFd1zSDK) {
        this.component4 = aFd1zSDK;
    }

    private static void getMediationNetwork(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1ySDK.getMonetizationNetwork().getMediationNetwork;
        if (appsFlyerConversionListener != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                appsFlyerConversionListener.onAttributionFailure(str);
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
            }
        }
    }
}
