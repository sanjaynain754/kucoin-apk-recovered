package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.google.firebase.messaging.FirebaseMessagingService;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1vSDK {
    public final AFc1pSDK getMonetizationNetwork;

    public static boolean getMediationNetwork(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            String str = FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT;
            return AFj1jSDK.m5996L_(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class));
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th2) {
            AFLogger.INSTANCE.m5972e(AFh1ySDK.UNINSTALL, "An error occurred while trying to verify manifest declarations: ", th2);
        }
    }

    @Nullable
    public final AFf1aSDK AFAdRevenueData() {
        String string;
        String string2;
        String mediationNetwork = this.getMonetizationNetwork.getMediationNetwork("afUninstallToken", null);
        long jAFAdRevenueData = this.getMonetizationNetwork.AFAdRevenueData("afUninstallToken_received_time", 0L);
        boolean monetizationNetwork = this.getMonetizationNetwork.getMonetizationNetwork("afUninstallToken_queued", false);
        this.getMonetizationNetwork.getRevenue("afUninstallToken_queued", false);
        if (mediationNetwork == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] strArrSplit = string2.split(",");
            mediationNetwork = strArrSplit[strArrSplit.length - 1];
        }
        if (jAFAdRevenueData == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] strArrSplit2 = string.split(",");
            if (strArrSplit2.length >= 2) {
                try {
                    jAFAdRevenueData = Long.parseLong(strArrSplit2[strArrSplit2.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (mediationNetwork != null) {
            return new AFf1aSDK(mediationNetwork, jAFAdRevenueData, monetizationNetwork);
        }
        return null;
    }

    public AFg1vSDK(@NonNull Context context) {
        AFa1ySDK monetizationNetwork = AFa1ySDK.getMonetizationNetwork();
        this.getMonetizationNetwork = (AFc1pSDK) AFa1ySDK.getCurrencyIso4217Code(new Object[]{monetizationNetwork, context}, 659825386, -659825380, System.identityHashCode(monetizationNetwork));
    }

    public static boolean getMediationNetwork(@NonNull AFc1pSDK aFc1pSDK) {
        return aFc1pSDK.getMonetizationNetwork("sentRegisterRequestToAF", false);
    }
}
