package com.appsflyer.internal;

/* JADX INFO: loaded from: classes34.dex */
public final class AFh1iSDK extends AFh1mSDK {
    @Override // com.appsflyer.internal.AFh1mSDK
    public final boolean component4() {
        return true;
    }

    @Override // com.appsflyer.internal.AFh1mSDK
    public final AFe1oSDK AFAdRevenueData() {
        return this.component2 == 1 ? AFe1oSDK.CONVERSION : AFe1oSDK.LAUNCH;
    }
}
