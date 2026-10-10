package com.sensorsdata.analytics.android.sdk.deeplink;

import android.content.Intent;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.ServerUrl;
import com.sensorsdata.analytics.android.sdk.advert.utils.ChannelUtils;
import com.sensorsdata.analytics.android.sdk.network.HttpCallback;
import com.sensorsdata.analytics.android.sdk.network.HttpMethod;
import com.sensorsdata.analytics.android.sdk.network.RequestHelper;
import com.sensorsdata.analytics.android.sdk.util.JSONUtils;
import com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
class SensorsDataDeepLink extends AbsDeepLink {
    private String errorMsg;
    private String pageParams;
    private String project;
    private String serverUrl;
    private boolean success;

    public String getRequestUrl() {
        int iLastIndexOf;
        if (TextUtils.isEmpty(this.serverUrl) || (iLastIndexOf = this.serverUrl.lastIndexOf("/")) == -1) {
            return "";
        }
        return this.serverUrl.substring(0, iLastIndexOf) + "/sdk/deeplink/param";
    }

    @Override // com.sensorsdata.analytics.android.sdk.deeplink.DeepLinkProcessor
    public void mergeDeepLinkProperty(JSONObject jSONObject) {
        try {
            jSONObject.put("$deeplink_url", getDeepLinkUrl());
        } catch (JSONException e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.deeplink.DeepLinkProcessor
    public void parseDeepLink(Intent intent) {
        if (intent == null || intent.getData() == null) {
            return;
        }
        String lastPathSegment = intent.getData().getLastPathSegment();
        if (TextUtils.isEmpty(lastPathSegment)) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap map = new HashMap();
        map.put("key", lastPathSegment);
        map.put("system_type", "ANDROID");
        map.put("project", this.project);
        new RequestHelper.Builder(HttpMethod.GET, getRequestUrl()).params(map).callback(new HttpCallback.JsonCallback() { // from class: com.sensorsdata.analytics.android.sdk.deeplink.SensorsDataDeepLink.1
            @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
            public void onFailure(int i11, String str) {
                SensorsDataDeepLink.this.errorMsg = str;
                SensorsDataDeepLink.this.success = false;
            }

            @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
            public void onResponse(JSONObject jSONObject) {
                if (jSONObject == null) {
                    SensorsDataDeepLink.this.success = false;
                    return;
                }
                SensorsDataDeepLink.this.success = true;
                ChannelUtils.parseParams(JSONUtils.json2Map(jSONObject.optJSONObject("channel_params")));
                SensorsDataDeepLink.this.pageParams = jSONObject.optString("page_params");
                SensorsDataDeepLink.this.errorMsg = jSONObject.optString("errorMsg");
                if (TextUtils.isEmpty(SensorsDataDeepLink.this.errorMsg)) {
                    return;
                }
                SensorsDataDeepLink.this.success = false;
            }

            @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback.JsonCallback, com.sensorsdata.analytics.android.sdk.network.HttpCallback
            public void onAfter() {
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                JSONObject jSONObject = new JSONObject();
                try {
                    if (!TextUtils.isEmpty(SensorsDataDeepLink.this.pageParams)) {
                        jSONObject.put("$deeplink_options", SensorsDataDeepLink.this.pageParams);
                    }
                    if (!TextUtils.isEmpty(SensorsDataDeepLink.this.errorMsg)) {
                        jSONObject.put("$deeplink_match_fail_reason", SensorsDataDeepLink.this.errorMsg);
                    }
                    jSONObject.put("$deeplink_url", SensorsDataDeepLink.this.getDeepLinkUrl());
                    jSONObject.put("$event_duration", String.format(Locale.CHINA, "%.3f", Float.valueOf(jCurrentTimeMillis2 / 1000.0f)));
                } catch (JSONException e11) {
                    SALog.printStackTrace(e11);
                }
                SensorsDataUtils.mergeJSONObject(ChannelUtils.getUtmProperties(), jSONObject);
                SensorsDataDeepLink sensorsDataDeepLink = SensorsDataDeepLink.this;
                DeepLinkManager.OnDeepLinkParseFinishCallback onDeepLinkParseFinishCallback = sensorsDataDeepLink.mCallBack;
                if (onDeepLinkParseFinishCallback != null) {
                    onDeepLinkParseFinishCallback.onFinish(DeepLinkManager.DeepLinkType.SENSORSDATA, sensorsDataDeepLink.pageParams, SensorsDataDeepLink.this.success, jCurrentTimeMillis2);
                }
                SensorsDataAPI.sharedInstance().trackInternal("$AppDeeplinkMatchedResult", jSONObject);
            }
        }).execute();
    }

    public SensorsDataDeepLink(Intent intent, String str) {
        super(intent);
        this.serverUrl = str;
        this.project = new ServerUrl(str).getProject();
    }
}
