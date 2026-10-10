package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1gSDK extends AFe1cSDK<String> {
    private final String component1;

    @NonNull
    private final UUID copy;

    @Nullable
    private final String copydefault;

    @Nullable
    private final LinkGenerator.ResponseListener equals;
    private final Map<String, String> hashCode;

    @NonNull
    private final LinkGenerator toString;

    @Override // com.appsflyer.internal.AFe1cSDK
    /* JADX INFO: renamed from: a_ */
    public final boolean mo5964a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1cSDK
    @Nullable
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1cSDK
    public final boolean equals() {
        return false;
    }

    public AFe1gSDK(@NonNull AFd1zSDK aFd1zSDK, @NonNull UUID uuid, @NonNull String str, @NonNull Map<String, String> map, @Nullable String str2, @Nullable LinkGenerator.ResponseListener responseListener, @NonNull LinkGenerator linkGenerator) {
        super(AFe1oSDK.ONELINK, new AFe1oSDK[]{AFe1oSDK.RC_CDN}, aFd1zSDK, uuid.toString());
        this.copy = uuid;
        this.component1 = str;
        this.hashCode = new HashMap(map);
        this.equals = responseListener;
        this.copydefault = str2;
        this.toString = linkGenerator;
    }

    @Override // com.appsflyer.internal.AFe1cSDK
    public final AFd1iSDK<String> AFAdRevenueData(@NonNull String str) {
        return ((AFe1cSDK) this).component4.getCurrencyIso4217Code(this.component1, this.hashCode, this.copydefault, this.copy, str);
    }

    @Override // com.appsflyer.internal.AFe1cSDK, com.appsflyer.internal.AFe1mSDK
    public final long getCurrencyIso4217Code() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFe1cSDK, com.appsflyer.internal.AFe1mSDK
    public final void getMonetizationNetwork() {
        ResponseNetwork responseNetwork;
        super.getMonetizationNetwork();
        LinkGenerator.ResponseListener responseListener = this.equals;
        if (responseListener != null) {
            if (this.AFAdRevenueData == AFe1qSDK.SUCCESS && (responseNetwork = ((AFe1cSDK) this).component2) != null) {
                responseListener.onResponse((String) responseNetwork.getBody());
                return;
            }
            Throwable thComponent4 = component4();
            if (thComponent4 instanceof ParsingException) {
                if (((ParsingException) thComponent4).getRawResponse().isSuccessful()) {
                    responseListener.onResponseError("Can't parse one link data");
                    return;
                } else {
                    responseListener.onResponse(this.toString.generateLink());
                    return;
                }
            }
            responseListener.onResponse(this.toString.generateLink());
        }
    }
}
