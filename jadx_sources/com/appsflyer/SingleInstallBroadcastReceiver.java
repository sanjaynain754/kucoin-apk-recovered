package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.appsflyer.internal.AFa1ySDK;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes34.dex */
public class SingleInstallBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws UnsupportedEncodingException {
        String stringExtra;
        if (intent != null) {
            try {
                stringExtra = intent.getStringExtra("referrer");
            } catch (Throwable th2) {
                AFLogger.afErrorLog("error in BroadcastReceiver ", th2);
                stringExtra = null;
            }
            if (stringExtra != null && AFa1ySDK.m5930d_(context).getString("referrer", null) != null) {
                AFa1ySDK.getMonetizationNetwork().AFAdRevenueData(context, stringExtra);
                return;
            }
            String string = AppsFlyerProperties.getInstance().getString("referrer_timestamp");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (string != null && jCurrentTimeMillis - Long.parseLong(string) < 2000) {
                return;
            }
            AFLogger.afInfoLog("SingleInstallBroadcastReceiver called");
            AFa1ySDK.getMonetizationNetwork().m5936b_(context, intent);
            AppsFlyerProperties.getInstance().set("referrer_timestamp", String.valueOf(System.currentTimeMillis()));
        }
    }
}
