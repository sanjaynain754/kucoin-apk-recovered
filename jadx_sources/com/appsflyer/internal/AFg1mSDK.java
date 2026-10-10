package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import com.appsflyer.AFLogger;

/* JADX INFO: loaded from: classes34.dex */
public final class AFg1mSDK {
    public static boolean getMonetizationNetwork(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return context.getPackageManager().isInstantApp();
        }
        try {
            context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
            return true;
        } catch (ClassNotFoundException e11) {
            AFLogger.afErrorLogForExcManagerOnly("InstantAppsRuntime not found", e11, true);
            return false;
        }
    }
}
