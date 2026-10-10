package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1sSDK implements AFg1wSDK {

    @VisibleForTesting
    private static IntentFilter getMonetizationNetwork = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    @Override // com.appsflyer.internal.AFg1wSDK
    @NonNull
    public final AFg1wSDK.AFa1uSDK getMediationNetwork(@NonNull Context context) {
        String str = null;
        float f11 = 0.0f;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, getMonetizationNetwork);
            if (intentRegisterReceiver != null) {
                if (2 == intentRegisterReceiver.getIntExtra("status", -1)) {
                    int intExtra = intentRegisterReceiver.getIntExtra("plugged", -1);
                    if (intExtra == 1) {
                        str = "ac";
                    } else if (intExtra != 2) {
                        str = intExtra != 4 ? "other" : "wireless";
                    } else {
                        str = "usb";
                    }
                } else {
                    str = "no";
                }
                int intExtra2 = intentRegisterReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
                int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                if (-1 != intExtra2 && -1 != intExtra3) {
                    f11 = (intExtra2 * 100.0f) / intExtra3;
                }
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("Device that failed to register receiver", th2);
        }
        return new AFg1wSDK.AFa1uSDK(f11, str);
    }
}
