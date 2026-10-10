package com.sensorsdata.analytics.android.sdk.deeplink;

import android.content.Intent;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public interface DeepLinkProcessor {
    String getDeepLinkUrl();

    void mergeDeepLinkProperty(JSONObject jSONObject);

    void parseDeepLink(Intent intent);

    void setDeepLinkParseFinishCallback(DeepLinkManager.OnDeepLinkParseFinishCallback onDeepLinkParseFinishCallback);

    void setDeepLinkUrl(String str);
}
