package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.google.firebase.messaging.Constants;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1xSDK extends AFe1mSDK<Map<String, Object>> {
    private static final int component2 = (int) TimeUnit.SECONDS.toMillis(2);
    private Map<String, Object> areAllFieldsValid;
    private final AFa1qSDK component1;
    private final AFa1gSDK component3;
    private final Uri component4;
    private final List<String> copy;

    @Override // com.appsflyer.internal.AFe1mSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    public AFf1xSDK(AFa1qSDK aFa1qSDK, @NonNull AFa1gSDK aFa1gSDK, @NonNull Uri uri, @NonNull List<String> list) {
        super(AFe1oSDK.RESOLVE_ESP, new AFe1oSDK[]{AFe1oSDK.RC_CDN}, "ResolveEsp");
        this.component1 = aFa1qSDK;
        this.component3 = aFa1gSDK;
        this.component4 = uri;
        this.copy = list;
    }

    private boolean getMediationNetwork(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder("Validate if link ");
        sb2.append(str);
        sb2.append(" belongs to ESP domains: ");
        sb2.append(this.copy);
        AFLogger.afRDLog(sb2.toString());
        try {
            return this.copy.contains(new URL(str).getHost());
        } catch (MalformedURLException e11) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e11);
            return false;
        }
    }

    /* JADX INFO: renamed from: r_ */
    private static Map<String, Object> m5969r_(Uri uri) {
        HashMap map = new HashMap();
        try {
            StringBuilder sb2 = new StringBuilder("ESP deeplink resolving is started: ");
            sb2.append(uri.toString());
            AFLogger.afDebugLog(sb2.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection()));
            httpURLConnection.setInstanceFollowRedirects(false);
            int i11 = component2;
            httpURLConnection.setReadTimeout(i11);
            httpURLConnection.setConnectTimeout(i11);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.17.4");
            int responseCode = httpURLConnection.getResponseCode();
            map.put("status", Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                map.put("res", httpURLConnection.getHeaderField("Location"));
            }
            httpURLConnection.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
            return map;
        } catch (Throwable th2) {
            map.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, th2.getLocalizedMessage());
            AFLogger.afErrorLog(th2.getMessage(), th2);
            return map;
        }
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    @NonNull
    public final AFe1qSDK getRevenue() throws Exception {
        Integer num = null;
        if (!getMediationNetwork(this.component4.toString())) {
            this.component1.m5923j_(this.component3, this.component4, null);
            return AFe1qSDK.SUCCESS;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = this.component4.toString();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        String str = null;
        while (i11 < 5) {
            Map<String, Object> mapM5969r_ = m5969r_(Uri.parse(string));
            String str2 = (String) mapM5969r_.get("res");
            Integer num2 = (Integer) mapM5969r_.get("status");
            String str3 = (String) mapM5969r_.get(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            if (str2 == null || !getMediationNetwork(str2)) {
                str = str3;
                string = str2;
                num = num2;
                break;
            }
            if (i11 < 4) {
                arrayList.add(str2);
            }
            i11++;
            str = str3;
            string = str2;
            num = num2;
        }
        HashMap map = new HashMap();
        map.put("res", string != null ? string : "");
        map.put("status", Integer.valueOf(num != null ? num.intValue() : -1));
        if (str != null) {
            map.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, str);
        }
        if (!arrayList.isEmpty()) {
            map.put("redirects", arrayList);
        }
        map.put("latency", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        synchronized (this.component3) {
            this.component3.getCurrencyIso4217Code("af_deeplink_r", map);
            this.component3.getCurrencyIso4217Code("af_deeplink", this.component4.toString());
        }
        this.component1.m5923j_(this.component3, string != null ? Uri.parse(string) : this.component4, this.component4);
        this.areAllFieldsValid = map;
        return AFe1qSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final long getCurrencyIso4217Code() {
        return 60000L;
    }
}
