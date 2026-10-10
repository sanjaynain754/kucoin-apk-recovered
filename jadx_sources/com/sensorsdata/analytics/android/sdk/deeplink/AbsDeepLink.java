package com.sensorsdata.analytics.android.sdk.deeplink;

import android.content.Intent;

/* JADX INFO: loaded from: classes59.dex */
public abstract class AbsDeepLink implements DeepLinkProcessor {
    private String deepLinkUrl;
    protected DeepLinkManager.OnDeepLinkParseFinishCallback mCallBack;

    @Override // com.sensorsdata.analytics.android.sdk.deeplink.DeepLinkProcessor
    public String getDeepLinkUrl() {
        return this.deepLinkUrl;
    }

    @Override // com.sensorsdata.analytics.android.sdk.deeplink.DeepLinkProcessor
    public void setDeepLinkParseFinishCallback(DeepLinkManager.OnDeepLinkParseFinishCallback onDeepLinkParseFinishCallback) {
        this.mCallBack = onDeepLinkParseFinishCallback;
    }

    @Override // com.sensorsdata.analytics.android.sdk.deeplink.DeepLinkProcessor
    public void setDeepLinkUrl(String str) {
        this.deepLinkUrl = str;
    }

    public AbsDeepLink(Intent intent) {
        if (intent != null && intent.getData() != null) {
            setDeepLinkUrl(intent.getData().toString());
        }
    }
}
