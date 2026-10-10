package com.appsflyer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.internal.AFc1kSDK;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFe1nSDK;
import com.appsflyer.internal.AFj1dSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public final class PurchaseHandler {

    @NonNull
    private final AFc1kSDK AFAdRevenueData;

    @NonNull
    public final AFd1zSDK getMonetizationNetwork;

    @NonNull
    public final AFe1nSDK getRevenue;

    public interface PurchaseValidationCallback {
        void onFailure(@NonNull Throwable th2);

        void onResponse(@NonNull ResponseNetwork<String> responseNetwork);
    }

    public final boolean getMediationNetwork(Map<String, Object> map, @Nullable PurchaseValidationCallback purchaseValidationCallback, String... strArr) {
        boolean revenue = AFj1dSDK.getRevenue(map, strArr, this.AFAdRevenueData);
        if (!revenue && purchaseValidationCallback != null) {
            purchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
        }
        return revenue;
    }

    public PurchaseHandler(@NonNull AFd1zSDK aFd1zSDK) {
        this.getMonetizationNetwork = aFd1zSDK;
        this.AFAdRevenueData = aFd1zSDK.getCurrencyIso4217Code();
        this.getRevenue = aFd1zSDK.equals();
    }
}
