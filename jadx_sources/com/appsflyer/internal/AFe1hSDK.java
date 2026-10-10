package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public abstract class AFe1hSDK extends AFe1jSDK {

    @Nullable
    private final PurchaseHandler.PurchaseValidationCallback component1;

    @Override // com.appsflyer.internal.AFe1jSDK
    public final boolean component3() {
        return true;
    }

    @Override // com.appsflyer.internal.AFe1cSDK, com.appsflyer.internal.AFe1mSDK
    public final void getMonetizationNetwork() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
        super.getMonetizationNetwork();
        Throwable thComponent4 = component4();
        if (thComponent4 != null && (purchaseValidationCallback2 = this.component1) != null) {
            purchaseValidationCallback2.onFailure(thComponent4);
        }
        ResponseNetwork<String> responseNetwork = ((AFe1cSDK) this).component2;
        if (responseNetwork == null || (purchaseValidationCallback = this.component1) == null) {
            return;
        }
        purchaseValidationCallback.onResponse(responseNetwork);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1hSDK(@NotNull AFe1oSDK aFe1oSDK, @NotNull AFe1oSDK[] aFe1oSDKArr, @NotNull AFd1zSDK aFd1zSDK, @NotNull Map<String, ? extends Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFe1oSDK, aFe1oSDKArr, aFd1zSDK, null, map);
        Intrinsics.checkNotNullParameter(aFe1oSDK, "");
        Intrinsics.checkNotNullParameter(aFe1oSDKArr, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.component1 = purchaseValidationCallback;
    }

    @Override // com.appsflyer.internal.AFe1cSDK, com.appsflyer.internal.AFe1mSDK
    public boolean AFAdRevenueData() {
        ResponseNetwork responseNetwork = ((AFe1cSDK) this).component2;
        if (responseNetwork != null) {
            Intrinsics.checkNotNull(responseNetwork);
            if (responseNetwork.getStatusCode() == 503) {
                return true;
            }
        }
        return super.AFAdRevenueData();
    }

    @Override // com.appsflyer.internal.AFe1jSDK
    @Nullable
    public final String getCurrencyIso4217Code(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (map.containsKey("billing_library_version")) {
            Object objRemove = map.remove("billing_library_version");
            if (objRemove instanceof String) {
                return (String) objRemove;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFe1jSDK
    @Nullable
    public final String getMonetizationNetwork(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (map.containsKey("connector_version")) {
            Object objRemove = map.remove("connector_version");
            if (objRemove instanceof String) {
                return (String) objRemove;
            }
        }
        return null;
    }
}
