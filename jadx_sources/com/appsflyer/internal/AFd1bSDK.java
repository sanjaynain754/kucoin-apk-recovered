package com.appsflyer.internal;

import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1bSDK implements AFe1ySDK<AFi1ySDK> {
    @Override // com.appsflyer.internal.AFe1ySDK
    public final /* synthetic */ AFi1ySDK getMonetizationNetwork(String str) throws JSONException {
        return new AFi1ySDK(str);
    }
}
