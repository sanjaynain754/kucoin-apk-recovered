package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.PurchaseHandler;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1fSDK extends AFe1hSDK {
    public AFe1fSDK(@NonNull Map<String, Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFd1zSDK aFd1zSDK) {
        super(AFe1oSDK.PURCHASE_VALIDATE, new AFe1oSDK[]{AFe1oSDK.RC_CDN, AFe1oSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, map, purchaseValidationCallback);
        this.getRevenue.add(AFe1oSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFe1jSDK
    @Nullable
    public final AFd1iSDK<String> getMonetizationNetwork(@NonNull Map<String, Object> map, @NonNull String str, @Nullable String str2) {
        return ((AFe1cSDK) this).component4.getCurrencyIso4217Code(map, str, str2);
    }
}
