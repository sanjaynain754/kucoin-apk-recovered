package com.appsflyer.internal;

import android.os.Build;
import androidx.annotation.CallSuper;
import androidx.credentials.provider.CredentialEntry;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFe1jSDK extends AFe1cSDK<String> {

    @NotNull
    private final AFe1oSDK component1;

    @NotNull
    private final Map<String, Object> copy;

    @NotNull
    private final AFc1kSDK copydefault;

    @NotNull
    private final AFf1dSDK equals;

    @NotNull
    private final AFc1pSDK hashCode;

    @NotNull
    private final AFg1pSDK toString;

    @Override // com.appsflyer.internal.AFe1cSDK
    @Nullable
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    public boolean component3() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1cSDK
    public final boolean equals() {
        return true;
    }

    @Nullable
    public abstract AFd1iSDK<String> getMonetizationNetwork(@NotNull Map<String, Object> map, @NotNull String str, @Nullable String str2);

    @Nullable
    public String getMonetizationNetwork(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1jSDK(@NotNull AFe1oSDK aFe1oSDK, @NotNull AFe1oSDK[] aFe1oSDKArr, @NotNull AFd1zSDK aFd1zSDK, @Nullable String str, @NotNull Map<String, ? extends Object> map) {
        super(aFe1oSDK, aFe1oSDKArr, aFd1zSDK, null);
        Intrinsics.checkNotNullParameter(aFe1oSDK, "");
        Intrinsics.checkNotNullParameter(aFe1oSDKArr, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.component1 = aFe1oSDK;
        this.copy = map;
        AFc1kSDK currencyIso4217Code = aFd1zSDK.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        this.copydefault = currencyIso4217Code;
        AFc1pSDK aFc1pSDKComponent4 = aFd1zSDK.component4();
        Intrinsics.checkNotNullExpressionValue(aFc1pSDKComponent4, "");
        this.hashCode = aFc1pSDKComponent4;
        AFg1pSDK aFg1pSDKComponent2 = aFd1zSDK.component2();
        Intrinsics.checkNotNullExpressionValue(aFg1pSDKComponent2, "");
        this.toString = aFg1pSDKComponent2;
        AFf1dSDK aFf1dSDKAfDebugLog = aFd1zSDK.afDebugLog();
        Intrinsics.checkNotNullExpressionValue(aFf1dSDKAfDebugLog, "");
        this.equals = aFf1dSDKAfDebugLog;
    }

    @Override // com.appsflyer.internal.AFe1cSDK
    @Nullable
    public final AFd1iSDK<String> AFAdRevenueData(@NotNull String str) {
        AFd1aSDK aFd1aSDK;
        Intrinsics.checkNotNullParameter(str, "");
        Map<String, Object> mutableMap = MapsKt.toMutableMap(this.copy);
        String currencyIso4217Code = getCurrencyIso4217Code(mutableMap);
        String monetizationNetwork = getMonetizationNetwork(mutableMap);
        Map<String, Object> mutableMap2 = MapsKt.toMutableMap(mutableMap);
        getRevenue(mutableMap2, currencyIso4217Code);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strAreAllFieldsValid = this.copydefault.areAllFieldsValid();
        if (strAreAllFieldsValid != null && !StringsKt.isBlank(strAreAllFieldsValid)) {
            linkedHashMap.put("advertising_id", strAreAllFieldsValid);
        }
        AFb1jSDK aFb1jSDKAFAdRevenueData = AFb1iSDK.AFAdRevenueData(this.copydefault.getMediationNetwork.getMonetizationNetwork);
        String str2 = null;
        String str3 = aFb1jSDKAFAdRevenueData != null ? aFb1jSDKAFAdRevenueData.getMonetizationNetwork : null;
        if (str3 != null && !StringsKt.isBlank(str3)) {
            linkedHashMap.put("oaid", str3);
        }
        AFb1jSDK aFb1jSDKM5939l_ = AFb1iSDK.m5939l_(this.copydefault.getMediationNetwork.getMonetizationNetwork.getContentResolver());
        String str4 = aFb1jSDKM5939l_ != null ? aFb1jSDKM5939l_.getMonetizationNetwork : null;
        if (str4 != null && !StringsKt.isBlank(str4)) {
            linkedHashMap.put("amazon_aid", str4);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            mutableMap2.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, CredentialEntry.TRUE_STRING);
        } else {
            String currencyIso4217Code2 = ((AFe1cSDK) this).component3.getCurrencyIso4217Code(this.hashCode);
            if (currencyIso4217Code2 != null && !StringsKt.isBlank(currencyIso4217Code2)) {
                linkedHashMap.put("imei", currencyIso4217Code2);
            }
        }
        String revenue = AFb1mSDK.getRevenue(this.copydefault.getRevenue);
        if (revenue == null) {
            revenue = "";
        }
        linkedHashMap.put("appsflyer_id", revenue);
        linkedHashMap.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("sdk_version", "6.17.4");
        if (monetizationNetwork != null && !StringsKt.isBlank(monetizationNetwork)) {
            linkedHashMap.put("sdk_connector_version", monetizationNetwork);
        }
        this.toString.getCurrencyIso4217Code(linkedHashMap, this.component1);
        mutableMap2.put("device_data", linkedHashMap);
        this.equals.getRevenue(mutableMap2, this.component1);
        AFd1iSDK<String> monetizationNetwork2 = getMonetizationNetwork(mutableMap2, str, currencyIso4217Code);
        if (monetizationNetwork2 != null && (aFd1aSDK = monetizationNetwork2.getRevenue) != null) {
            str2 = aFd1aSDK.getCurrencyIso4217Code;
        }
        if (str2 != null) {
            JSONObject jSONObject = new JSONObject(mutableMap2);
            AFh1zSDK.getCurrencyIso4217Code(toString() + ": preparing data: ", jSONObject);
            AFd1kSDK aFd1kSDK = this.areAllFieldsValid;
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            aFd1kSDK.AFAdRevenueData(str2, string);
        }
        return monetizationNetwork2;
    }

    @Nullable
    public String getCurrencyIso4217Code(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    @CallSuper
    public void getRevenue(@NotNull Map<String, Object> map, @Nullable String str) {
        Intrinsics.checkNotNullParameter(map, "");
        map.put("app_id", this.copydefault.getMediationNetwork.getMonetizationNetwork.getPackageName());
        String revenue = AFc1kSDK.getRevenue();
        if (revenue != null) {
            map.put("cuid", revenue);
        }
        map.put(TPDownloadProxyEnum.USER_APP_VERSION, this.copydefault.m5954n_().versionName);
        if (component3()) {
            map.put("event_timestamp", Long.valueOf(this.toString.getMonetizationNetwork()));
        }
        if (str != null) {
            map.put("billing_lib_version", str);
        }
    }
}
