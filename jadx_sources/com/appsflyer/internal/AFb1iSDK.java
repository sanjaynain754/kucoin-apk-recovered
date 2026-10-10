package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.oaid.OaidClient;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1iSDK {

    @Nullable
    public static Boolean AFAdRevenueData;
    public static String getCurrencyIso4217Code;

    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    @Nullable
    public static AFb1jSDK AFAdRevenueData(Context context) {
        Boolean lat;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String str = getCurrencyIso4217Code;
        boolean z11 = str != null;
        if (z11) {
            lat = null;
        } else {
            Boolean bool = AFAdRevenueData;
            if ((bool == null || !bool.booleanValue()) && !(AFAdRevenueData == null && appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_OAID, true))) {
                lat = null;
                str = null;
            } else {
                try {
                    OaidClient oaidClient = new OaidClient(context);
                    oaidClient.setLogging(appsFlyerProperties.isEnableLog());
                    OaidClient.Info infoFetch = oaidClient.fetch();
                    if (infoFetch != null) {
                        String id2 = infoFetch.getId();
                        try {
                            lat = infoFetch.getLat();
                            str = id2;
                        } catch (Throwable unused) {
                            str = id2;
                            AFLogger.afDebugLog("No OAID library");
                            lat = null;
                        }
                    } else {
                        lat = null;
                        str = null;
                    }
                } catch (Throwable unused2) {
                    str = null;
                }
            }
        }
        if (str == null) {
            return null;
        }
        AFb1jSDK aFb1jSDK = new AFb1jSDK(str, lat);
        aFb1jSDK.getCurrencyIso4217Code = Boolean.valueOf(z11);
        return aFb1jSDK;
    }

    @Nullable
    /* JADX INFO: renamed from: l_ */
    public static AFb1jSDK m5939l_(ContentResolver contentResolver) {
        String string;
        if (!AFAdRevenueData() || contentResolver == null || AppsFlyerProperties.getInstance().getString("amazon_aid") != null || !"Amazon".equals(Build.MANUFACTURER)) {
            return null;
        }
        int i11 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
        if (i11 == 0) {
            return new AFb1jSDK(Settings.Secure.getString(contentResolver, "advertising_id"), Boolean.FALSE);
        }
        if (i11 == 2) {
            return null;
        }
        try {
            string = Settings.Secure.getString(contentResolver, "advertising_id");
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th2);
            string = "";
        }
        return new AFb1jSDK(string, Boolean.TRUE);
    }

    private static boolean AFAdRevenueData() {
        Boolean bool = AFAdRevenueData;
        return bool == null || bool.booleanValue();
    }
}
