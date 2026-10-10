package com.tencent.liteav.base.system;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.autofill.HintConstants;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.p130b.C34691a;
import com.tencent.liteav.base.util.C34745j;
import com.tencent.liteav.base.util.C34754s;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav")
public class LiteavSystemInfo {
    private static final int APP_SYSTEM_METHOD_DEFAULT_GET_INTERVAL_MS = 1000;
    private static final String EXT_KEY_APP_BACKGROUND = "isAppBackground";
    private static final String EXT_KEY_APP_NAME = "appName";
    private static final String EXT_KEY_APP_PACKAGE_NAME = "appPackageName";
    private static final String EXT_KEY_APP_VERSION = "appVersion";
    private static final String EXT_KEY_BUILD_BOARD = "buildBoard";
    private static final String EXT_KEY_BUILD_BRAND = "buildBrand";
    private static final String EXT_KEY_BUILD_HARDWARE = "buildHardware";
    private static final String EXT_KEY_BUILD_MANUFACTURER = "buildManufacturer";
    private static final String EXT_KEY_BUILD_MODEL = "buildModel";
    private static final String EXT_KEY_BUILD_VERSION = "buildVersion";
    private static final String EXT_KEY_BUILD_VERSION_INT = "buildVersionInt";
    private static final int NETWORK_TYPE_2G = 4;
    private static final int NETWORK_TYPE_3G = 3;
    private static final int NETWORK_TYPE_4G = 2;
    private static final int NETWORK_TYPE_5G = 6;
    private static final int NETWORK_TYPE_UNKNOWN = 0;
    private static final int NETWORK_TYPE_WIFI = 1;
    private static final int NETWORK_TYPE_WIRED = 5;
    private static final String TAG = "LiteavBaseSystemInfo";
    private static final C34754s<String> sModel = new C34754s<>(CallableC34720h.m76065a());
    private static final C34754s<String> sBrand = new C34754s<>(CallableC34721i.m76066a());
    private static final C34754s<String> sManufacturer = new C34754s<>(CallableC34722j.m76067a());
    private static final C34754s<String> sHardware = new C34754s<>(CallableC34723k.m76068a());
    private static final C34754s<String> sSystemOSVersion = new C34754s<>(CallableC34724l.m76069a());
    private static final C34754s<Integer> sSystemOSVersionInt = new C34754s<>(CallableC34725m.m76070a());
    private static final C34754s<String> sBoard = new C34754s<>(CallableC34726n.m76071a());
    private static final C34754s<String> sAppPackageName = new C34754s<>(CallableC34727o.m76072a());
    private static final C34754s<String> sAppName = new C34754s<>(CallableC34716d.m76061a());
    private static final C34754s<String> sAppVersion = new C34754s<>(CallableC34717e.m76062a());
    private static final C34754s<String> sUUID = new C34754s<>(CallableC34718f.m76063a());
    private static final C34754s<String[]> sCpuABIs = new C34754s<>(CallableC34719g.m76064a());
    private static int sLastNetworkType = 0;
    private static final C34691a sNetworkTypeThrottler = new C34691a(1000);
    private static int sLastGateway = 0;
    private static final C34691a sGatewayThrottler = new C34691a(1000);
    private static boolean sLastMicPermission = false;
    private static final C34691a sMicPermissionThrottler = new C34691a(1000);

    public static int[] getScreenSizeInPixels() {
        int[] iArr = {0, 0};
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            Log.m76033e(TAG, "Context is null.", new Object[0]);
            return iArr;
        }
        try {
            WindowManager windowManager = (WindowManager) applicationContext.getSystemService(InterfaceC33953u5.f72199F);
            if (windowManager == null) {
                Log.m76033e(TAG, "WindowManager is null.", new Object[0]);
                return iArr;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            iArr[0] = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
            iArr[1] = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
            return iArr;
        } catch (Throwable th2) {
            Log.m76033e(TAG, "Get display from window service failed. ".concat(String.valueOf(th2)), new Object[0]);
            return iArr;
        }
    }

    private static native void nativeOnAppBackgroundStateChanged(int i11);

    public static boolean setExtID(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            str.getClass();
            switch (str) {
                case "isAppBackground":
                    try {
                        C34745j.m76119a(Integer.parseInt(str2) == 1);
                        return true;
                    } catch (Exception e11) {
                        Log.m76033e(TAG, "set app background state failed. ".concat(String.valueOf(e11)), new Object[0]);
                        break;
                    }
                    break;
                case "buildVersion":
                    sSystemOSVersion.m76144a(str2);
                    return true;
                case "appName":
                    sAppName.m76144a(str2);
                    return true;
                case "buildManufacturer":
                    sManufacturer.m76144a(str2);
                    return true;
                case "buildBoard":
                    sBoard.m76144a(str2);
                    return true;
                case "buildBrand":
                    sBrand.m76144a(str2);
                    return true;
                case "buildModel":
                    sModel.m76144a(str2);
                    return true;
                case "appPackageName":
                    sAppPackageName.m76144a(str2);
                    return true;
                case "buildHardware":
                    sHardware.m76144a(str2);
                    return true;
                case "buildVersionInt":
                    try {
                        sSystemOSVersionInt.m76144a(Integer.valueOf(Integer.parseInt(str2)));
                        break;
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                    return true;
                case "appVersion":
                    sAppVersion.m76144a(str2);
                    return true;
                default:
                    return false;
            }
        }
        return false;
    }

    public static synchronized int getAppBackgroundState() {
        return C34745j.m76118a().m76126b() ? 1 : 0;
    }

    public static String getAppName() {
        return sAppName.m76143a();
    }

    public static String getAppPackageName() {
        return sAppPackageName.m76143a();
    }

    public static synchronized int getAppThreadSize() {
        ThreadGroup threadGroup;
        try {
            threadGroup = Thread.currentThread().getThreadGroup();
            while (threadGroup.getParent() != null) {
                threadGroup = threadGroup.getParent();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return threadGroup.activeCount();
    }

    public static String getAppVersion() {
        return sAppVersion.m76143a();
    }

    public static synchronized boolean getAudioRecordPermission() {
        try {
            if (sMicPermissionThrottler.m76041a()) {
                sLastMicPermission = getAudioRecordPermissionFromSystem();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return sLastMicPermission;
    }

    public static String getBoard() {
        return sBoard.m76143a();
    }

    public static String getBrand() {
        return sBrand.m76143a();
    }

    public static String getDeviceUuid() {
        return sUUID.m76143a();
    }

    public static synchronized int getGateway() {
        try {
            if (sGatewayThrottler.m76041a()) {
                sLastGateway = getGatewayFromSystem();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return sLastGateway;
    }

    public static String getHardware() {
        return sHardware.m76143a();
    }

    public static String getManufacturer() {
        return sManufacturer.m76143a();
    }

    public static String getModel() {
        return sModel.m76143a();
    }

    public static synchronized int getNetworkType() {
        try {
            if (sNetworkTypeThrottler.m76041a()) {
                sLastNetworkType = getNetworkTypeFromSystem();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return sLastNetworkType;
    }

    public static synchronized String getProperty(String str) {
        String property;
        try {
            property = System.getProperty(str);
            try {
                Log.m76034i(TAG, "Get " + str + " property is " + property, new Object[0]);
            } catch (Throwable th2) {
                th = th2;
                Log.m76033e(TAG, "Get property failed. ".concat(String.valueOf(th)), new Object[0]);
            }
        } catch (Throwable th3) {
            th = th3;
            property = null;
        }
        return property;
    }

    public static String[] getSupportABIs() {
        return sCpuABIs.m76143a();
    }

    public static String getSystemOSVersion() {
        return sSystemOSVersion.m76143a();
    }

    public static int getSystemOSVersionInt() {
        return sSystemOSVersionInt.m76143a().intValue();
    }

    public static synchronized String getSystemProperty(String str) {
        String str2;
        str2 = null;
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            if (objInvoke != null) {
                String str3 = (String) objInvoke;
                try {
                    Log.m76034i(TAG, "Get " + str + " property is " + str3, new Object[0]);
                    str2 = str3;
                } catch (Throwable th2) {
                    th = th2;
                    str2 = str3;
                    Log.m76033e(TAG, "Get system property failed. ".concat(String.valueOf(th)), new Object[0]);
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
        return str2;
    }

    public static synchronized void listenAppBackgroundState() {
        C34745j.m76118a().m76125a(C34715c.m76059a());
    }

    private static boolean getAudioRecordPermissionFromSystem() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null || applicationContext.checkPermission("android.permission.RECORD_AUDIO", Process.myPid(), Process.myUid()) != 0) {
            return false;
        }
        return true;
    }

    private static int getGatewayFromSystem() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return 0;
        }
        try {
            return ((WifiManager) applicationContext.getSystemService("wifi")).getDhcpInfo().gateway;
        } catch (Throwable th2) {
            Log.m76033e(TAG, "getGateway error " + th2.getMessage(), new Object[0]);
            return 0;
        }
    }

    private static int getNetworkTypeFromSystem() {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null || (connectivityManager = (ConnectivityManager) applicationContext.getSystemService("connectivity")) == null) {
            return 0;
        }
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception unused) {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return 0;
        }
        if (activeNetworkInfo.getType() == 9) {
            return 5;
        }
        if (activeNetworkInfo.getType() == 1) {
            return 1;
        }
        if (activeNetworkInfo.getType() != 0) {
            return 0;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) applicationContext.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            if (telephonyManager == null) {
                return 0;
            }
            int networkType = telephonyManager.getNetworkType();
            switch (networkType) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return 4;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return 3;
                default:
                    if (getSystemOSVersionInt() >= 29 && networkType == 20) {
                        return 6;
                    }
                case 13:
                    return 2;
            }
        } catch (Exception unused2) {
            return 2;
        }
    }

    public static void onAppBackgroundStateChanged(boolean z11) {
        nativeOnAppBackgroundStateChanged(z11 ? 1 : 0);
    }

    public static void setSDKWorking(boolean z11) {
        C34745j.m76118a().f73533a = z11;
    }
}
