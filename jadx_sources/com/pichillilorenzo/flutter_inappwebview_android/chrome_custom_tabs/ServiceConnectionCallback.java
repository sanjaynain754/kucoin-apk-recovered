package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import androidx.browser.customtabs.CustomTabsClient;

/* JADX INFO: loaded from: classes59.dex */
public interface ServiceConnectionCallback {
    void onServiceConnected(CustomTabsClient customTabsClient);

    void onServiceDisconnected();
}
