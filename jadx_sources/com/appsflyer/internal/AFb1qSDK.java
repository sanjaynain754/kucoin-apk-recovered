package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1qSDK {
    public final Map<String, Object> getMediationNetwork = new HashMap();
    public Map<String, Object> getMonetizationNetwork = new HashMap();

    public final void getMediationNetwork(Map<String, Object> map) {
        if (!this.getMediationNetwork.isEmpty()) {
            map.put("partner_data", this.getMediationNetwork);
        }
        if (this.getMonetizationNetwork.isEmpty()) {
            return;
        }
        AFa1ySDK.getMonetizationNetwork(map).put("partner_data", this.getMonetizationNetwork);
        this.getMonetizationNetwork = new HashMap();
    }
}
