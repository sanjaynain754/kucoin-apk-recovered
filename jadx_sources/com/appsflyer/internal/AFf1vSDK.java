package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.tencent.bugly.proguard.C33820nf;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes34.dex */
public final class AFf1vSDK extends AFe1cSDK<String> {
    private final AFh1hSDK component1;

    @Override // com.appsflyer.internal.AFe1cSDK
    public final AFd1iSDK<String> AFAdRevenueData(@NonNull String str) {
        String strEncodeToString = Base64.encodeToString(this.component1.getMonetizationNetwork(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(strEncodeToString)));
        this.areAllFieldsValid.AFAdRevenueData(this.component1.component4, strEncodeToString);
        return ((AFe1cSDK) this).component4.getRevenue(this.component1);
    }

    @Override // com.appsflyer.internal.AFe1cSDK
    public final boolean equals() {
        return false;
    }

    public AFf1vSDK(@NonNull AFh1hSDK aFh1hSDK, @NonNull AFd1zSDK aFd1zSDK) {
        AFe1oSDK aFe1oSDK = aFh1hSDK.hashCode;
        AFe1oSDK aFe1oSDK2 = aFe1oSDK == null ? AFe1oSDK.CACHED_EVENT : aFe1oSDK;
        AFe1oSDK[] aFe1oSDKArr = {AFe1oSDK.RC_CDN};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aFh1hSDK.component3);
        sb2.append(C33820nf.f71144W);
        sb2.append(AFAdRevenueData(aFh1hSDK));
        super(aFe1oSDK2, aFe1oSDKArr, aFd1zSDK, sb2.toString(), aFh1hSDK.component3);
        this.component1 = aFh1hSDK;
    }

    private boolean copy() {
        ResponseNetwork responseNetwork;
        AFe1oSDK aFe1oSDK = this.component1.hashCode;
        if (aFe1oSDK == null) {
            aFe1oSDK = AFe1oSDK.CACHED_EVENT;
        }
        return aFe1oSDK == AFe1oSDK.ARS_VALIDATE && (responseNetwork = ((AFe1cSDK) this).component2) != null && responseNetwork.getStatusCode() == 424;
    }

    private boolean copydefault() {
        ResponseNetwork responseNetwork = ((AFe1cSDK) this).component2;
        boolean z11 = this.AFAdRevenueData == AFe1qSDK.FAILURE && responseNetwork != null && responseNetwork.getStatusCode() / 500 == 1;
        AFe1oSDK aFe1oSDK = this.getMediationNetwork;
        return z11 && (aFe1oSDK == AFe1oSDK.CONVERSION || aFe1oSDK == AFe1oSDK.ATTR);
    }

    @Override // com.appsflyer.internal.AFe1cSDK
    @Nullable
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return this.component1.getRevenue;
    }

    @Override // com.appsflyer.internal.AFe1cSDK, com.appsflyer.internal.AFe1mSDK
    public final boolean AFAdRevenueData() {
        return super.AFAdRevenueData() || copy() || copydefault();
    }

    private static String AFAdRevenueData(AFh1hSDK aFh1hSDK) {
        try {
            return new URL(aFh1hSDK.component4).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }
}
