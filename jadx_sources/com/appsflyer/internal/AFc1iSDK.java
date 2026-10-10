package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1iSDK {

    @Nullable
    public String AFAdRevenueData;
    public boolean areAllFieldsValid;
    public boolean component1;

    @Nullable
    public AFd1eSDK component2;

    @Nullable
    public AdvertisingIdData component3;

    @Nullable
    public AppsFlyerConsent component4;

    @Nullable
    public AFb1cSDK copy;

    @Nullable
    public AFb1qSDK getCurrencyIso4217Code;

    @Nullable
    public String getMediationNetwork;

    @Nullable
    public AFb1vSDK getMonetizationNetwork;

    @Nullable
    public String getRevenue;

    public final synchronized void getRevenue(@Nullable AFd1eSDK aFd1eSDK) {
        this.component2 = aFd1eSDK;
    }

    public final boolean AFAdRevenueData() {
        return this.component1;
    }

    public final boolean getCurrencyIso4217Code() {
        return this.areAllFieldsValid;
    }
}
