package com.tencent.qcloud.tuicore.util;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.credentials.provider.CredentialEntry;
import cn.jiguang.privates.push.constants.JPushConstants;

/* JADX INFO: loaded from: classes56.dex */
public final class TUIBuild {
    private static String BOARD = "";
    private static String BRAND = "";
    private static String DEVICE = "";
    private static String HARDWARE = "";
    private static String MANUFACTURER = "";
    private static String MODEL = "";
    private static final String TAG = "TUIBuild";
    private static String VERSION = "";
    private static String VERSION_INCREMENTAL = "";
    private static int VERSION_INT;

    public static boolean isHarmonyOS() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return "harmony".equals(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]));
        } catch (Exception unused) {
            Log.e(TAG, "the phone not support the harmonyOS");
            return false;
        }
    }

    public static String getBoard() {
        String str = BOARD;
        if (str == null || str.isEmpty()) {
            synchronized (TUIBuild.class) {
                try {
                    String str2 = BOARD;
                    if (str2 == null || str2.isEmpty()) {
                        BOARD = Build.BOARD;
                        Log.i(TAG, "get BOARD by Build.BOARD :" + BOARD);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return BOARD;
    }

    public static String getBrand() {
        String str = BRAND;
        if (str == null || str.isEmpty()) {
            synchronized (TUIBuild.class) {
                try {
                    String str2 = BRAND;
                    if (str2 == null || str2.isEmpty()) {
                        BRAND = Build.BRAND;
                        Log.i(TAG, "get BRAND by Build.BRAND :" + BRAND);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return BRAND;
    }

    public static String getDevice() {
        String str = DEVICE;
        if (str == null || str.isEmpty()) {
            synchronized (TUIBuild.class) {
                try {
                    String str2 = DEVICE;
                    if (str2 == null || str2.isEmpty()) {
                        DEVICE = Build.DEVICE;
                        Log.i(TAG, "get DEVICE by Build.DEVICE :" + DEVICE);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return DEVICE;
    }

    public static String getHardware() {
        String str = HARDWARE;
        if (str == null || str.isEmpty()) {
            synchronized (TUIBuild.class) {
                try {
                    String str2 = HARDWARE;
                    if (str2 == null || str2.isEmpty()) {
                        HARDWARE = Build.HARDWARE;
                        Log.i(TAG, "get HARDWARE by Build.HARDWARE :" + HARDWARE);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return HARDWARE;
    }

    public static String getManufacturer() {
        String str = MANUFACTURER;
        if (str == null || str.isEmpty()) {
            synchronized (TUIBuild.class) {
                try {
                    String str2 = MANUFACTURER;
                    if (str2 == null || str2.isEmpty()) {
                        MANUFACTURER = Build.MANUFACTURER;
                        Log.i(TAG, "get MANUFACTURER by Build.MANUFACTURER :" + MANUFACTURER);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return MANUFACTURER;
    }

    public static String getModel() {
        String str = MODEL;
        if (str == null || str.isEmpty()) {
            synchronized (TUIBuild.class) {
                try {
                    String str2 = MODEL;
                    if (str2 == null || str2.isEmpty()) {
                        MODEL = Build.MODEL;
                        Log.i(TAG, "get MODEL by Build.MODEL :" + MODEL);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return MODEL;
    }

    public static String getVersion() {
        String str = VERSION;
        if (str == null || str.isEmpty()) {
            synchronized (TUIBuild.class) {
                try {
                    String str2 = VERSION;
                    if (str2 == null || str2.isEmpty()) {
                        VERSION = Build.VERSION.RELEASE;
                        Log.i(TAG, "get VERSION by Build.VERSION.RELEASE :" + VERSION);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return VERSION;
    }

    public static String getVersionIncremental() {
        String str = VERSION_INCREMENTAL;
        if (str == null || str.isEmpty()) {
            synchronized (TUIBuild.class) {
                try {
                    String str2 = VERSION_INCREMENTAL;
                    if (str2 == null || str2.isEmpty()) {
                        VERSION_INCREMENTAL = Build.VERSION.INCREMENTAL;
                        Log.i(TAG, "get VERSION_INCREMENTAL by Build.VERSION.INCREMENTAL :" + VERSION_INCREMENTAL);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return VERSION_INCREMENTAL;
    }

    public static int getVersionInt() {
        if (VERSION_INT == 0) {
            synchronized (TUIBuild.class) {
                try {
                    if (VERSION_INT == 0) {
                        VERSION_INT = Build.VERSION.SDK_INT;
                        Log.i(TAG, "get VERSION_INT by Build.VERSION.SDK_INT :" + VERSION_INT);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return VERSION_INT;
    }

    public static boolean isMiuiOptimization() {
        try {
            Class<?> cls = Class.forName("android.os.systemProperties");
            String str = (String) cls.getDeclaredMethod("get", String.class, String.class).invoke(cls, "persist.sys.miuiOptimization", "");
            return CredentialEntry.TRUE_STRING.equals(str) | TextUtils.isEmpty(str);
        } catch (Exception unused) {
            Log.e(TAG, "the phone not support the miui optimization");
            return false;
        }
    }

    public static void setBoard(String str) {
        synchronized (TUIBuild.class) {
            BOARD = str;
        }
    }

    public static void setBrand(String str) {
        synchronized (TUIBuild.class) {
            BRAND = str;
        }
    }

    public static void setDevice(String str) {
        synchronized (TUIBuild.class) {
            DEVICE = str;
        }
    }

    public static void setHardware(String str) {
        synchronized (TUIBuild.class) {
            HARDWARE = str;
        }
    }

    public static void setManufacturer(String str) {
        synchronized (TUIBuild.class) {
            MANUFACTURER = str;
        }
    }

    public static void setModel(String str) {
        synchronized (TUIBuild.class) {
            MODEL = str;
        }
    }

    public static void setVersion(String str) {
        synchronized (TUIBuild.class) {
            VERSION = str;
        }
    }

    public static void setVersionIncremental(String str) {
        synchronized (TUIBuild.class) {
            VERSION_INCREMENTAL = str;
        }
    }

    public static void setVersionInt(int i11) {
        synchronized (TUIBuild.class) {
            VERSION_INT = i11;
        }
    }

    public static boolean isBrandHonor() {
        if (JPushConstants.Manufacturer.HONOR.equalsIgnoreCase(getBrand()) && JPushConstants.Manufacturer.HONOR.equalsIgnoreCase(getManufacturer())) {
            return true;
        }
        return false;
    }

    public static boolean isBrandHuawei() {
        if (!JPushConstants.Manufacturer.HUAWEI.equalsIgnoreCase(getBrand()) && !JPushConstants.Manufacturer.HUAWEI.equalsIgnoreCase(getManufacturer()) && !JPushConstants.Manufacturer.HONOR.equalsIgnoreCase(getBrand())) {
            return false;
        }
        return true;
    }

    public static boolean isBrandMeizu() {
        if (!JPushConstants.Manufacturer.MEIZU.equalsIgnoreCase(getBrand()) && !JPushConstants.Manufacturer.MEIZU.equalsIgnoreCase(getManufacturer()) && !"22c4185e".equalsIgnoreCase(getBrand())) {
            return false;
        }
        return true;
    }

    public static boolean isBrandOppo() {
        if (!JPushConstants.Manufacturer.OPPO.equalsIgnoreCase(getBrand()) && !JPushConstants.Manufacturer.REALME.equalsIgnoreCase(getBrand()) && !JPushConstants.Manufacturer.ONEPLUS.equalsIgnoreCase(getBrand()) && !JPushConstants.Manufacturer.OPPO.equalsIgnoreCase(getManufacturer()) && !JPushConstants.Manufacturer.REALME.equalsIgnoreCase(getManufacturer()) && !JPushConstants.Manufacturer.ONEPLUS.equalsIgnoreCase(getManufacturer())) {
            return false;
        }
        return true;
    }

    public static boolean isBrandVivo() {
        if (!JPushConstants.Manufacturer.VIVO.equalsIgnoreCase(getBrand()) && !JPushConstants.Manufacturer.VIVO.equalsIgnoreCase(getManufacturer())) {
            return false;
        }
        return true;
    }

    public static boolean isBrandXiaoMi() {
        if (!JPushConstants.Manufacturer.XIAOMI.equalsIgnoreCase(getBrand()) && !JPushConstants.Manufacturer.XIAOMI.equalsIgnoreCase(getManufacturer())) {
            return false;
        }
        return true;
    }
}
