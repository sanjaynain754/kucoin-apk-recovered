package com.sensorsdata.analytics.android.sdk.util;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.tencent.bugly.proguard.C33872q4;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes23.dex */
public class NetworkUtils {
    private static final int HTTP_307 = 307;
    private static final String TAG = "SA.NetworkUtils";
    private static SABroadcastReceiver mReceiver;
    private static SANetworkCallbackImpl networkCallback;
    private static String networkType;

    public static void cleanNetworkTypeCache() {
        networkType = null;
    }

    public static String getLocation(HttpURLConnection httpURLConnection, String str) throws MalformedURLException {
        if (httpURLConnection == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String headerField = httpURLConnection.getHeaderField("Location");
        if (TextUtils.isEmpty(headerField)) {
            headerField = httpURLConnection.getHeaderField(FirebaseAnalytics.Param.LOCATION);
        }
        if (TextUtils.isEmpty(headerField)) {
            return null;
        }
        if (headerField.startsWith("http://") || headerField.startsWith("https://")) {
            return headerField;
        }
        URL url = new URL(str);
        return url.getProtocol() + "://" + url.getHost() + headerField;
    }

    @SuppressLint({"WrongConstant"})
    public static boolean isNetworkAvailable(Context context) {
        if (!SensorsDataUtils.checkHasPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return false;
        }
        try {
            return isNetworkAvailable((ConnectivityManager) context.getSystemService("connectivity"));
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return false;
        }
    }

    @SuppressLint({"NewApi", "WrongConstant"})
    public static boolean isNetworkValid(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities != null) {
            return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3) || networkCapabilities.hasTransport(7) || networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(16);
        }
        return false;
    }

    /* JADX INFO: loaded from: classes59.dex */
    public static class SABroadcastReceiver extends BroadcastReceiver {
        private SABroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                NetworkUtils.cleanNetworkTypeCache();
                SensorsDataAPI.sharedInstance().flushSync();
                SALog.m68589i(NetworkUtils.TAG, "SABroadcastReceiver is receiving ConnectivityManager.CONNECTIVITY_ACTION broadcast");
            }
        }
    }

    @TargetApi(21)
    public static class SANetworkCallbackImpl extends ConnectivityManager.NetworkCallback {
        private SANetworkCallbackImpl() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            super.onAvailable(network);
            NetworkUtils.cleanNetworkTypeCache();
            SensorsDataAPI.sharedInstance().flushSync();
            SALog.m68589i(NetworkUtils.TAG, "onAvailable is calling");
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            super.onCapabilitiesChanged(network, networkCapabilities);
            NetworkUtils.cleanNetworkTypeCache();
            SALog.m68589i(NetworkUtils.TAG, "onCapabilitiesChanged is calling");
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            super.onLost(network);
            NetworkUtils.cleanNetworkTypeCache();
            SALog.m68589i(NetworkUtils.TAG, "onLost is calling");
        }
    }

    @SuppressLint({"MissingPermission"})
    private static String mobileNetworkType(Context context, TelephonyManager telephonyManager, ConnectivityManager connectivityManager) {
        int subtype;
        NetworkInfo activeNetworkInfo;
        if (telephonyManager == null) {
            subtype = 0;
        } else if (Build.VERSION.SDK_INT < 30 || !(SensorsDataUtils.checkHasPermission(context, C33872q4.f71536c) || telephonyManager.hasCarrierPrivileges())) {
            try {
                subtype = telephonyManager.getNetworkType();
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
                subtype = 0;
            }
        } else {
            subtype = telephonyManager.getDataNetworkType();
        }
        if (subtype == 0) {
            if (Build.VERSION.SDK_INT >= 30) {
                return "NULL";
            }
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                subtype = activeNetworkInfo.getSubtype();
            }
        }
        switch (subtype) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
            case 18:
            case 19:
                return "4G";
            case 16:
            case 17:
            default:
                return "NULL";
            case 20:
                return "5G";
        }
    }

    public static boolean needRedirects(int i11) {
        return i11 == 301 || i11 == 302 || i11 == 307;
    }

    public static String networkType(Context context) {
        try {
            if (!TextUtils.isEmpty(networkType) && !"NULL".equals(networkType)) {
                return networkType;
            }
            if (!SensorsDataUtils.checkHasPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
                networkType = "NULL";
                return "NULL";
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                if (!isNetworkAvailable(connectivityManager)) {
                    networkType = "NULL";
                    return "NULL";
                }
                if (isWiFiNetwork(connectivityManager)) {
                    networkType = "WIFI";
                    return "WIFI";
                }
            }
            String strMobileNetworkType = mobileNetworkType(context, (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE), connectivityManager);
            networkType = strMobileNetworkType;
            return strMobileNetworkType;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            networkType = "NULL";
            return "NULL";
        }
    }

    public static void registerNetworkListener(Context context) {
        try {
            if (networkCallback == null) {
                networkCallback = new SANetworkCallbackImpl();
            }
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().build();
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                connectivityManager.registerNetworkCallback(networkRequestBuild, networkCallback);
                SALog.m68589i(TAG, "Register ConnectivityManager");
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    private static int toNetworkType(String str) {
        if ("NULL".equals(str)) {
            return 255;
        }
        if ("WIFI".equals(str)) {
            return 8;
        }
        if ("2G".equals(str)) {
            return 1;
        }
        if ("3G".equals(str)) {
            return 2;
        }
        if ("4G".equals(str)) {
            return 4;
        }
        return "5G".equals(str) ? 16 : 255;
    }

    public static void unregisterNetworkListener(Context context) {
        ConnectivityManager connectivityManager;
        try {
            if (networkCallback == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
                return;
            }
            connectivityManager.unregisterNetworkCallback(networkCallback);
            SALog.m68589i(TAG, "unregister ConnectivityManager");
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public static boolean isShouldFlush(String str, int i11) {
        if ((toNetworkType(str) & i11) != 0) {
            return true;
        }
        return false;
    }

    private static boolean isWiFiNetwork(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
            return networkCapabilities.hasTransport(1);
        }
        return false;
    }

    private static boolean isNetworkAvailable(ConnectivityManager connectivityManager) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return isNetworkValid(networkCapabilities);
    }
}
