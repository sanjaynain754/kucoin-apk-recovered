package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1kSDK {
    private static String getCurrencyIso4217Code = "360";
    public final AFc1iSDK AFAdRevenueData;
    private PackageInfo areAllFieldsValid;
    private final Executor component4;
    public final AFc1fSDK getMediationNetwork;
    public final AFc1pSDK getRevenue;
    private Bundle component2 = null;
    public String getMonetizationNetwork = "";

    @NonNull
    public static String AFAdRevenueData() {
        return "6.17.4";
    }

    public static String getCurrencyIso4217Code() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public static String getRevenue() {
        return AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
    }

    public static String component2() {
        StringBuilder sb2 = new StringBuilder("version: 6.17.4 (build ");
        sb2.append(getCurrencyIso4217Code);
        sb2.append(")");
        return sb2.toString();
    }

    public final String AFAdRevenueData(Context context) {
        try {
            return new AFb1lSDK(context, this.component4).getMediationNetwork();
        } catch (Throwable th2) {
            AFLogger.INSTANCE.m5975e(AFh1ySDK.PUBLIC_API, "Exception while collecting facebook's attribution ID. ", th2, true, false, false);
            return null;
        }
    }

    @Nullable
    public final String areAllFieldsValid() {
        AdvertisingIdData advertisingIdData = this.AFAdRevenueData.component3;
        AFb1jSDK aFb1jSDK = advertisingIdData != null ? new AFb1jSDK(advertisingIdData.advertisingId, advertisingIdData.isLimited) : null;
        if (aFb1jSDK != null) {
            return aFb1jSDK.getMonetizationNetwork;
        }
        return null;
    }

    public final boolean component3() {
        return !this.AFAdRevenueData.getCurrencyIso4217Code();
    }

    @Nullable
    public final String getCurrencyIso4217Code(String str) {
        Object obj;
        try {
            if (this.component2 == null) {
                this.component2 = ((PackageItemInfo) this.getMediationNetwork.getMonetizationNetwork.getPackageManager().getApplicationInfo(this.getMediationNetwork.getMonetizationNetwork.getPackageName(), 128)).metaData;
            }
            Bundle bundle = this.component2;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder("Could not load manifest metadata!");
            sb2.append(th2.getMessage());
            AFLogger.afErrorLog(sb2.toString(), th2);
            return null;
        }
    }

    public final boolean getRevenue(String str) {
        String currencyIso4217Code = getCurrencyIso4217Code(str);
        if (currencyIso4217Code != null) {
            return Boolean.parseBoolean(currencyIso4217Code);
        }
        return false;
    }

    @NonNull
    /* JADX INFO: renamed from: n_ */
    public final PackageInfo m5954n_() {
        if (this.areAllFieldsValid == null) {
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    this.areAllFieldsValid = this.getMediationNetwork.getMonetizationNetwork.getPackageManager().getPackageInfo(this.getMediationNetwork.getMonetizationNetwork.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                } else {
                    this.areAllFieldsValid = this.getMediationNetwork.getMonetizationNetwork.getPackageManager().getPackageInfo(this.getMediationNetwork.getMonetizationNetwork.getPackageName(), 0);
                }
            } catch (PackageManager.NameNotFoundException e11) {
                AFLogger.INSTANCE.mo5915e(AFh1ySDK.GENERAL, "Exception while trying fo get PackageInfo", e11, false, false, true, false);
            }
        }
        return this.areAllFieldsValid;
    }

    public AFc1kSDK(AFc1fSDK aFc1fSDK, AFc1pSDK aFc1pSDK, AFc1iSDK aFc1iSDK, Executor executor) {
        this.getMediationNetwork = aFc1fSDK;
        this.getRevenue = aFc1pSDK;
        this.AFAdRevenueData = aFc1iSDK;
        this.component4 = executor;
    }

    @NonNull
    public static String getMonetizationNetwork() {
        return UUID.randomUUID().toString();
    }

    @Nullable
    public final String component4() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            string = getCurrencyIso4217Code("CHANNEL");
        }
        if (string != null && string.equals("")) {
            return null;
        }
        return string;
    }

    @Nullable
    @SuppressLint({"DiscouragedApi"})
    public final String AFAdRevenueData(String str) {
        try {
            int identifier = this.getMediationNetwork.getMonetizationNetwork.getResources().getIdentifier(str, TypedValues.Custom.S_STRING, this.getMediationNetwork.getMonetizationNetwork.getPackageName());
            if (identifier != 0) {
                return this.getMediationNetwork.getMonetizationNetwork.getString(identifier);
            }
            return null;
        } catch (Resources.NotFoundException e11) {
            StringBuilder sb2 = new StringBuilder("Could not load string resource!");
            sb2.append(e11.getMessage());
            AFLogger.afErrorLog(sb2.toString(), e11);
            return null;
        }
    }

    public final boolean getRevenue(Context context) {
        try {
            return (this.getMediationNetwork.getMonetizationNetwork.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0;
        } catch (PackageManager.NameNotFoundException e11) {
            AFLogger.INSTANCE.m5972e(AFh1ySDK.PUBLIC_API, "Could not check if app is pre installed", e11);
        }
    }
}
