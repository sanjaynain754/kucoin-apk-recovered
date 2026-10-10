package com.forter.mobile.fortersdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6503a0 {
    @Nullable
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: a */
    public static NetworkInfo m12069a(Context context) throws NullPointerException {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: b */
    public static String m12070b(@NonNull Context context) {
        NetworkCapabilities networkCapabilities;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return "FAILURE";
            }
            int i11 = Build.VERSION.SDK_INT;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                if (!networkCapabilities.hasCapability(12)) {
                    return "Offline";
                }
                ArrayList arrayList = new ArrayList();
                if (networkCapabilities.hasTransport(0)) {
                    arrayList.add("Mobile");
                }
                if (networkCapabilities.hasTransport(1)) {
                    arrayList.add("WiFi");
                }
                if (networkCapabilities.hasTransport(2)) {
                    arrayList.add("Bluetooth");
                }
                if (networkCapabilities.hasTransport(3)) {
                    arrayList.add("Ethernet");
                }
                if (networkCapabilities.hasTransport(4)) {
                    arrayList.add("VPN");
                }
                if (i11 >= 26 && networkCapabilities.hasTransport(5)) {
                    arrayList.add("WiFiAware");
                }
                if (i11 >= 27 && networkCapabilities.hasTransport(6)) {
                    arrayList.add("LoWPAN");
                }
                if (arrayList.size() > 0) {
                    return TextUtils.join("_", arrayList);
                }
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                if (activeNetworkInfo.getType() == 0) {
                    return "Mobile";
                }
                if (activeNetworkInfo.getType() == 1) {
                    return "WiFi";
                }
                if (activeNetworkInfo.getType() == 7) {
                    return "Bluetooth";
                }
                if (activeNetworkInfo.getType() == 9) {
                    return "Ethernet";
                }
                if (activeNetworkInfo.getType() == 17) {
                    return "VPN";
                }
            }
            return "Offline";
        } catch (Exception unused) {
            return "FAILURE";
        }
    }
}
