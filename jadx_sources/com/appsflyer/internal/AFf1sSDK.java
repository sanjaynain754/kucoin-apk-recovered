package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.google.firebase.messaging.Constants;
import com.google.zxing.client.android.Intents;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public final class AFf1sSDK extends AFf1tSDK {

    @NonNull
    private final AFa1jSDK AFInAppEventType;

    @Nullable
    private final AFh1qSDK AFKeystoreWrapper;

    @NonNull
    private final AFf1iSDK AFLogger;

    @NonNull
    private final AFj1sSDK copydefault;

    @NonNull
    private final AFc1pSDK equals;

    @NonNull
    private final AFh1tSDK hashCode;

    @NonNull
    private final AppsFlyerProperties registerClient;
    public Map<String, Object> toString;

    @Override // com.appsflyer.internal.AFe1cSDK, com.appsflyer.internal.AFe1mSDK
    public final void getMonetizationNetwork() {
        super.getMonetizationNetwork();
        AFh1tSDK aFh1tSDK = this.hashCode;
        if (aFh1tSDK.getMonetizationNetwork()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j11 = aFh1tSDK.hashCode;
            if (j11 == 0) {
                AFLogger.afInfoLog("Metrics: launch start ts is missing");
                return;
            }
            aFh1tSDK.getCurrencyIso4217Code.put("net", Long.valueOf(jCurrentTimeMillis - j11));
            aFh1tSDK.getMediationNetwork.getMonetizationNetwork("first_launch", new JSONObject(aFh1tSDK.getCurrencyIso4217Code).toString());
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1sSDK$1 */
    public static /* synthetic */ class C51691 {
        static final /* synthetic */ int[] getCurrencyIso4217Code;

        static {
            int[] iArr = new int[AFj1tSDK.AFa1ySDK.values().length];
            getCurrencyIso4217Code = iArr;
            try {
                iArr[AFj1tSDK.AFa1ySDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getCurrencyIso4217Code[AFj1tSDK.AFa1ySDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @VisibleForTesting
    private boolean copydefault() {
        ResponseNetwork responseNetwork = ((AFe1cSDK) this).component2;
        boolean z11 = this.AFAdRevenueData == AFe1qSDK.FAILURE && responseNetwork != null && responseNetwork.getStatusCode() / 500 == 1;
        AFe1oSDK aFe1oSDK = this.getMediationNetwork;
        return z11 && (aFe1oSDK == AFe1oSDK.CONVERSION || aFe1oSDK == AFe1oSDK.ATTR);
    }

    public AFf1sSDK(@NonNull AFh1mSDK aFh1mSDK, @NonNull AFd1zSDK aFd1zSDK) {
        super(aFh1mSDK, aFd1zSDK);
        this.copydefault = aFd1zSDK.AFLogger();
        this.equals = aFd1zSDK.component4();
        this.hashCode = aFd1zSDK.component3();
        this.AFLogger = aFd1zSDK.areAllFieldsValid();
        this.registerClient = AppsFlyerProperties.getInstance();
        this.AFInAppEventType = aFd1zSDK.afWarnLog();
        this.AFKeystoreWrapper = aFd1zSDK.afRDLog();
        this.getRevenue.add(AFe1oSDK.RESOLVE_ESP);
        this.getRevenue.add(AFe1oSDK.DLSDK);
    }

    @Override // com.appsflyer.internal.AFe1cSDK, com.appsflyer.internal.AFe1mSDK
    public final boolean AFAdRevenueData() {
        if (!super.AFAdRevenueData() && !copydefault()) {
            return false;
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void getMonetizationNetwork(AFh1mSDK aFh1mSDK) {
        AFh1qSDK aFh1qSDK;
        AFh1qSDK aFh1qSDK2;
        super.getMonetizationNetwork(aFh1mSDK);
        int i11 = aFh1mSDK.component2;
        AFh1tSDK aFh1tSDK = this.hashCode;
        if (aFh1tSDK.getMonetizationNetwork()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            aFh1tSDK.hashCode = jCurrentTimeMillis;
            long j11 = aFh1tSDK.component1;
            if (j11 != 0) {
                aFh1tSDK.getCurrencyIso4217Code.put("from_fg", Long.valueOf(jCurrentTimeMillis - j11));
                aFh1tSDK.getMediationNetwork.getMonetizationNetwork("first_launch", new JSONObject(aFh1tSDK.getCurrencyIso4217Code).toString());
            } else {
                AFLogger.afInfoLog("Metrics: fg ts is missing");
            }
        }
        Map map = (Map) aFh1mSDK.getMonetizationNetwork.get("meta");
        if (map == null) {
            map = new HashMap();
            aFh1mSDK.getMonetizationNetwork.put("meta", map);
        }
        if (!aFh1mSDK.getMonetizationNetwork.containsKey("af_deeplink")) {
            aFh1mSDK.getMonetizationNetwork(this.AFInAppEventType.AFAdRevenueData());
        }
        AFi1vSDK currencyIso4217Code = this.AFLogger.getCurrencyIso4217Code();
        if (currencyIso4217Code != null) {
            HashMap map2 = new HashMap();
            map2.put("cdn_token", currencyIso4217Code.getMonetizationNetwork);
            String str = currencyIso4217Code.AFAdRevenueData;
            if (str != null) {
                map2.put("c_ver", str);
            }
            long j12 = currencyIso4217Code.getMediationNetwork;
            if (j12 > 0) {
                map2.put("latency", Long.valueOf(j12));
            }
            long j13 = currencyIso4217Code.getRevenue;
            if (j13 > 0) {
                map2.put("delay", Long.valueOf(j13));
            }
            int i12 = currencyIso4217Code.getCurrencyIso4217Code;
            if (i12 > 0) {
                map2.put("res_code", Integer.valueOf(i12));
            }
            if (currencyIso4217Code.component1 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(currencyIso4217Code.component1.getClass().getSimpleName());
                sb2.append(": ");
                sb2.append(currencyIso4217Code.component1.getMessage());
                map2.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, sb2.toString());
            }
            AFi1xSDK aFi1xSDK = currencyIso4217Code.areAllFieldsValid;
            if (aFi1xSDK != null) {
                map2.put("sig", aFi1xSDK.toString());
            }
            String str2 = currencyIso4217Code.component4;
            if (str2 != null) {
                map2.put("cdn_cache_status", str2);
            }
            map.put("rc", map2);
        }
        this.copy.getRevenue(aFh1mSDK.getMonetizationNetwork);
        if (i11 == 1) {
            if (this.registerClient.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFh1mSDK.getMonetizationNetwork.put("wait_cid", Boolean.toString(true));
            }
            AFh1tSDK aFh1tSDK2 = this.hashCode;
            HashMap map3 = new HashMap(aFh1tSDK2.AFAdRevenueData);
            aFh1tSDK2.AFAdRevenueData.clear();
            if (!map3.isEmpty()) {
                map.put("ddl", map3);
            }
            HashMap map4 = new HashMap(this.hashCode.getCurrencyIso4217Code);
            if (!map4.isEmpty()) {
                map.put("first_launch", map4);
            }
            AFh1qSDK aFh1qSDK3 = this.AFKeystoreWrapper;
            if (aFh1qSDK3 != null) {
                aFh1qSDK3.getMonetizationNetwork(aFh1mSDK);
            }
        } else if (i11 == 2) {
            AFh1tSDK aFh1tSDK3 = this.hashCode;
            aFh1tSDK3.getMediationNetwork.getRevenue("first_launch");
            HashMap map5 = new HashMap(aFh1tSDK3.getCurrencyIso4217Code);
            if (!map5.isEmpty()) {
                map.put("first_launch", map5);
            }
            if ((aFh1mSDK instanceof AFh1nSDK) && (aFh1qSDK2 = this.AFKeystoreWrapper) != null && !aFh1qSDK2.getCurrencyIso4217Code()) {
                this.AFKeystoreWrapper.getMediationNetwork(aFh1mSDK);
            }
        }
        if (map.isEmpty()) {
            aFh1mSDK.getMonetizationNetwork.remove("meta");
        }
        if (i11 <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFj1tSDK aFj1tSDK : (AFj1tSDK[]) this.copydefault.getCurrencyIso4217Code.toArray(new AFj1tSDK[0])) {
                boolean z11 = aFj1tSDK instanceof AFi1cSDK;
                int i13 = C51691.getCurrencyIso4217Code[aFj1tSDK.areAllFieldsValid.ordinal()];
                if (i13 == 1) {
                    if (z11) {
                        aFh1mSDK.AFAdRevenueData("rfr", ((AFi1cSDK) aFj1tSDK).getMonetizationNetwork);
                        this.equals.getRevenue(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFj1tSDK.getMediationNetwork);
                } else if (i13 == 2 && i11 == 2 && !z11) {
                    HashMap map6 = new HashMap();
                    map6.put("source", aFj1tSDK.AFAdRevenueData);
                    map6.put("response", Intents.Scan.TIMEOUT);
                    map6.put("type", aFj1tSDK.component2);
                    arrayList.add(map6);
                }
            }
            if (!arrayList.isEmpty()) {
                aFh1mSDK.AFAdRevenueData("referrers", arrayList);
            }
            Object obj = this.toString;
            if (obj != null) {
                aFh1mSDK.AFAdRevenueData("fb_ddl", obj);
            }
        }
        if (aFh1mSDK.AFAdRevenueData() == AFe1oSDK.LAUNCH && (aFh1qSDK = this.AFKeystoreWrapper) != null && aFh1qSDK.getRevenue()) {
            this.AFKeystoreWrapper.AFAdRevenueData(aFh1mSDK);
        }
        this.copy.getMediationNetwork(aFh1mSDK);
    }
}
