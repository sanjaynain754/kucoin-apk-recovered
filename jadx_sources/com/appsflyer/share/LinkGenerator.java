package com.appsflyer.share;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFa1ySDK;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFe1gSDK;
import com.appsflyer.internal.AFe1nSDK;
import com.appsflyer.internal.AFe1nSDK.RunnableC51572;
import com.appsflyer.internal.AFj1cSDK;
import com.appsflyer.internal.AFk1tSDK;
import com.tencent.bugly.proguard.C33556b3;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import p852kotlin.text.Typography;

/* JADX INFO: loaded from: classes34.dex */
public class LinkGenerator {
    String AFAdRevenueData;
    private String areAllFieldsValid;
    private String component1;
    private String component2;
    private String component3;
    private String component4;
    private String copydefault;
    private String equals;
    private final String getCurrencyIso4217Code;
    String getMediationNetwork;
    private String getMonetizationNetwork;
    private String getRevenue;
    private final Map<String, String> hashCode = new HashMap();

    public interface ResponseListener {
        @WorkerThread
        void onResponse(String str);

        @WorkerThread
        void onResponseError(String str);
    }

    public String generateLink() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.getMediationNetwork;
        if (str == null || !str.startsWith("http")) {
            sb2.append(String.format(AFk1tSDK.AFAdRevenueData, AppsFlyerLib.getInstance().getHostPrefix(), AFa1ySDK.getMonetizationNetwork().getHostName()));
        } else {
            sb2.append(this.getMediationNetwork);
        }
        if (this.AFAdRevenueData != null) {
            sb2.append('/');
            sb2.append(this.AFAdRevenueData);
        }
        Map<String, String> monetizationNetwork = getMonetizationNetwork();
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry<String, String> entry : monetizationNetwork.entrySet()) {
            if (sb3.length() == 0) {
                sb3.append('?');
            } else {
                sb3.append(Typography.amp);
            }
            sb3.append(entry.getKey());
            sb3.append('=');
            sb3.append(entry.getValue());
        }
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    private Map<String, String> getMonetizationNetwork() {
        HashMap map = new HashMap();
        map.put(C33556b3.f69038e2, this.getCurrencyIso4217Code);
        String str = this.component4;
        if (str != null) {
            map.put("af_referrer_uid", str);
        }
        String str2 = this.getRevenue;
        if (str2 != null) {
            map.put(AFInAppEventParameterName.AF_CHANNEL, str2);
        }
        String str3 = this.component2;
        if (str3 != null) {
            map.put("af_referrer_customer_id", str3);
        }
        String str4 = this.getMonetizationNetwork;
        if (str4 != null) {
            map.put("c", str4);
        }
        String str5 = this.component3;
        if (str5 != null) {
            map.put("af_referrer_name", str5);
        }
        String str6 = this.component1;
        if (str6 != null) {
            map.put("af_referrer_image_url", str6);
        }
        if (this.equals != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.equals);
            String str7 = this.areAllFieldsValid;
            if (str7 != null) {
                this.areAllFieldsValid = str7.replaceFirst("^[/]", "");
                sb2.append(this.equals.endsWith("/") ? "" : "/");
                sb2.append(this.areAllFieldsValid);
            }
            map.put("af_dp", sb2.toString());
        }
        for (Map.Entry<String, String> entry : this.hashCode.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        return AFj1cSDK.AFAdRevenueData(map);
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.hashCode.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.hashCode.putAll(map);
        }
        return this;
    }

    public String getBrandDomain() {
        return this.copydefault;
    }

    public String getCampaign() {
        return this.getMonetizationNetwork;
    }

    public String getChannel() {
        return this.getRevenue;
    }

    public String getMediaSource() {
        return this.getCurrencyIso4217Code;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.hashCode);
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.equals = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.getMediationNetwork = String.format("https://%s/%s", String.format("%sapp.%s", AppsFlyerLib.getInstance().getHostPrefix(), AFa1ySDK.getMonetizationNetwork().getHostName()), str3);
            return this;
        }
        if (str2 == null || str2.length() < 5) {
            str2 = "go.onelink.me";
        }
        this.getMediationNetwork = String.format("https://%s/%s", str2, str);
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.copydefault = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.getMonetizationNetwork = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.getRevenue = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.areAllFieldsValid = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.component2 = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.component1 = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.component3 = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.component4 = str;
        return this;
    }

    public LinkGenerator(String str) {
        this.getCurrencyIso4217Code = str;
    }

    public void generateLink(Context context, ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String str = this.copydefault;
        Map<String, String> monetizationNetwork = getMonetizationNetwork();
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        AFa1ySDK.getMonetizationNetwork().getMonetizationNetwork(context);
        AFa1ySDK monetizationNetwork2 = AFa1ySDK.getMonetizationNetwork();
        AFd1zSDK aFd1zSDK = (AFd1zSDK) AFa1ySDK.getCurrencyIso4217Code(new Object[]{monetizationNetwork2}, 254507867, -254507852, System.identityHashCode(monetizationNetwork2));
        AFe1gSDK aFe1gSDK = new AFe1gSDK(aFd1zSDK, UUID.randomUUID(), string, monetizationNetwork, str, responseListener, this);
        AFe1nSDK aFe1nSDKEquals = aFd1zSDK.equals();
        aFe1nSDKEquals.getMonetizationNetwork.execute(aFe1nSDKEquals.new RunnableC51572(aFe1gSDK));
    }

    @Deprecated
    public void generateLink(Context context, final CreateOneLinkHttpTask.ResponseListener responseListener) {
        generateLink(context, new ResponseListener() { // from class: com.appsflyer.share.LinkGenerator.4
            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponse(String str) {
                responseListener.onResponse(str);
            }

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponseError(String str) {
                responseListener.onResponseError(str);
            }
        });
    }
}
