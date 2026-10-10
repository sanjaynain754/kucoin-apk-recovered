package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public final class AFe1iSDK extends AFe1hSDK {
    public AFe1iSDK(@NonNull Map<String, Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFd1zSDK aFd1zSDK) {
        super(AFe1oSDK.ARS_VALIDATE, new AFe1oSDK[]{AFe1oSDK.RC_CDN, AFe1oSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, map, purchaseValidationCallback);
        this.getRevenue.add(AFe1oSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFe1hSDK, com.appsflyer.internal.AFe1cSDK, com.appsflyer.internal.AFe1mSDK
    public final boolean AFAdRevenueData() {
        ResponseNetwork responseNetwork = ((AFe1cSDK) this).component2;
        if (responseNetwork == null || responseNetwork.getStatusCode() != 424) {
            return super.AFAdRevenueData();
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFe1jSDK
    @Nullable
    public final AFd1iSDK<String> getMonetizationNetwork(@NonNull Map<String, Object> map, @NonNull String str, @Nullable String str2) {
        AFd1mSDK aFd1mSDK = ((AFe1cSDK) this).component4;
        return (AFd1iSDK) AFd1mSDK.getMonetizationNetwork(new Object[]{aFd1mSDK, map, str, str2}, 1656774302, -1656774302, System.identityHashCode(aFd1mSDK));
    }
}
