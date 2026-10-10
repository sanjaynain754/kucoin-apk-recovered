package com.sensorsdata.analytics.android.sdk.deeplink;

import android.annotation.TargetApi;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.advert.utils.ChannelUtils;
import com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
class ChannelDeepLink extends AbsDeepLink {
    @Override // com.sensorsdata.analytics.android.sdk.deeplink.DeepLinkProcessor
    public void mergeDeepLinkProperty(JSONObject jSONObject) {
        try {
            jSONObject.put("$deeplink_url", getDeepLinkUrl());
        } catch (JSONException e11) {
            SALog.printStackTrace(e11);
        }
        SensorsDataUtils.mergeJSONObject(ChannelUtils.getUtmProperties(), jSONObject);
    }

    @Override // com.sensorsdata.analytics.android.sdk.deeplink.DeepLinkProcessor
    @TargetApi(11)
    public void parseDeepLink(Intent intent) {
        Uri data;
        Set<String> queryParameterNames;
        if (intent == null || intent.getData() == null || (queryParameterNames = (data = intent.getData()).getQueryParameterNames()) == null || queryParameterNames.size() <= 0) {
            return;
        }
        HashMap map = new HashMap();
        for (String str : queryParameterNames) {
            String queryParameter = data.getQueryParameter(str);
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = "";
            }
            map.put(str, queryParameter);
        }
        ChannelUtils.parseParams(map);
        DeepLinkManager.OnDeepLinkParseFinishCallback onDeepLinkParseFinishCallback = this.mCallBack;
        if (onDeepLinkParseFinishCallback != null) {
            onDeepLinkParseFinishCallback.onFinish(DeepLinkManager.DeepLinkType.CHANNEL, null, true, 0L);
        }
    }

    public ChannelDeepLink(Intent intent) {
        super(intent);
    }
}
