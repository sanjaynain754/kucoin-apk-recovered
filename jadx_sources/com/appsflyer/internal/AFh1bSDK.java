package com.appsflyer.internal;

import com.appsflyer.AFInAppEventType;

/* JADX INFO: loaded from: classes34.dex */
public final class AFh1bSDK extends AFh1eSDK {
    public AFh1bSDK() {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE);
    }

    @Override // com.appsflyer.internal.AFh1mSDK
    public final AFe1oSDK AFAdRevenueData() {
        return AFe1oSDK.PURCHASE_VALIDATE;
    }
}
