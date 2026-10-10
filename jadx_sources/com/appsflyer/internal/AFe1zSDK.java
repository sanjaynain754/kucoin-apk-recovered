package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class AFe1zSDK<Body> implements ResponseNetwork<Body> {

    @NonNull
    private final Body AFAdRevenueData;
    final boolean getCurrencyIso4217Code;
    final int getMediationNetwork;

    @NonNull
    public final AFd1eSDK getMonetizationNetwork;

    @NonNull
    final Map<String, List<String>> getRevenue;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1zSDK aFe1zSDK = (AFe1zSDK) obj;
        if (this.getMediationNetwork == aFe1zSDK.getMediationNetwork && this.getCurrencyIso4217Code == aFe1zSDK.getCurrencyIso4217Code && this.AFAdRevenueData.equals(aFe1zSDK.AFAdRevenueData) && this.getRevenue.equals(aFe1zSDK.getRevenue)) {
            return this.getMonetizationNetwork.equals(aFe1zSDK.getMonetizationNetwork);
        }
        return false;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    @NonNull
    public Body getBody() {
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    @Nullable
    public List<String> getHeaderField(@NonNull String str) {
        for (String str2 : this.getRevenue.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return this.getRevenue.get(str2);
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public int getStatusCode() {
        return this.getMediationNetwork;
    }

    public int hashCode() {
        return (((((((this.AFAdRevenueData.hashCode() * 31) + this.getMediationNetwork) * 31) + (this.getCurrencyIso4217Code ? 1 : 0)) * 31) + this.getRevenue.hashCode()) * 31) + this.getMonetizationNetwork.hashCode();
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public boolean isSuccessful() {
        return this.getCurrencyIso4217Code;
    }

    public AFe1zSDK(@NonNull Body body, int i11, boolean z11, Map<String, List<String>> map, @NonNull AFd1eSDK aFd1eSDK) {
        this.AFAdRevenueData = body;
        this.getMediationNetwork = i11;
        this.getCurrencyIso4217Code = z11;
        this.getRevenue = new HashMap(map);
        this.getMonetizationNetwork = aFd1eSDK;
    }

    @Nullable
    public final String AFAdRevenueData(@NonNull String str) {
        List<String> headerField = getHeaderField(str);
        if (headerField != null && !headerField.isEmpty()) {
            Iterator<String> it = headerField.iterator();
            StringBuilder sb2 = new StringBuilder(it.next());
            while (it.hasNext()) {
                sb2.append(", ");
                sb2.append(it.next());
            }
            return sb2.toString();
        }
        return null;
    }
}
