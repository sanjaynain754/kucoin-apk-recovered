package com.sensorsdata.abtest.core;

import android.net.Uri;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.network.HttpCallback;
import com.sensorsdata.analytics.android.sdk.network.HttpMethod;
import com.sensorsdata.analytics.android.sdk.network.RequestHelper;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class SensorsABTestSchemeHandler {
    private static final String TAG = "SAB.SensorsABTesSchemeHandler";

    public static void handleSchemeUrl(String str) {
        try {
            SALog.m68589i(TAG, "handleSchemeUrl receive uri : " + str);
            if (TextUtils.isEmpty(str)) {
                SALog.m68589i(TAG, "uriString is empty and return");
                return;
            }
            Uri uri = Uri.parse(str);
            String queryParameter = uri.getQueryParameter("sensors_abtest_url");
            if (TextUtils.isEmpty(queryParameter)) {
                SALog.m68589i(TAG, "postUrl is empty and return");
                return;
            }
            String queryParameter2 = uri.getQueryParameter("feature_code");
            if (TextUtils.isEmpty(queryParameter2)) {
                SALog.m68589i(TAG, "featureCode is empty and return");
                return;
            }
            String queryParameter3 = uri.getQueryParameter("account_id");
            if (TextUtils.isEmpty(queryParameter3)) {
                SALog.m68589i(TAG, "accountId is empty and return");
                return;
            }
            try {
                int i11 = Integer.parseInt(queryParameter3);
                String distinctId = SensorsDataAPI.sharedInstance().getDistinctId();
                if (TextUtils.isEmpty(distinctId)) {
                    SALog.m68589i(TAG, "distinctId is empty and return");
                    return;
                }
                HashMap map = new HashMap();
                map.put("accept", "application/json");
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("distinct_id", distinctId);
                    jSONObject.put("feature_code", queryParameter2);
                    jSONObject.put("account_id", i11);
                    new RequestHelper.Builder(HttpMethod.POST, queryParameter).header(map).jsonData(jSONObject.toString()).callback(new HttpCallback.StringCallback() { // from class: com.sensorsdata.abtest.core.SensorsABTestSchemeHandler.1
                        @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
                        public void onFailure(int i12, String str2) {
                            SALog.m68589i(SensorsABTestSchemeHandler.TAG, "code: " + i12 + ",message: " + str2);
                        }

                        @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
                        public void onResponse(String str2) {
                            if (str2 != null) {
                                SALog.m68589i(SensorsABTestSchemeHandler.TAG, str2);
                            }
                        }

                        @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
                        public void onAfter() {
                        }
                    }).execute();
                } catch (JSONException e11) {
                    SALog.printStackTrace(e11);
                }
            } catch (NumberFormatException e12) {
                SALog.printStackTrace(e12);
            }
        } catch (Exception e13) {
            SALog.printStackTrace(e13);
        }
    }
}
