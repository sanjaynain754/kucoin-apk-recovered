package cn.jiguang.privates.common.cache;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public class JCommonConfig {
    private static final String APP_CHANNEL = "app_channel";
    private static final String APP_KEY = "app_key";
    private static final String DEVICE_ID = "device_id";
    private static final String NAME = "cn.jiguang.privates.common.prefs";
    private static final String SDK_VERSION_CODE = "sdk_version_code";
    private static final String SDK_VERSION_NAME = "sdk_version_name";
    private static SharedPreferences sharedPreferences;

    private static SharedPreferences getSP(Context context) {
        if (sharedPreferences == null) {
            sharedPreferences = context.getSharedPreferences(NAME, 0);
        }
        return sharedPreferences;
    }

    public static String getAppChannel(Context context) {
        return getSP(context).getString("app_channel", "");
    }

    public static String getAppKey(Context context) {
        return getSP(context).getString("app_key", "");
    }

    public static String getDeviceId(Context context) {
        return getSP(context).getString("device_id", "");
    }

    public static int getSdkVersionCode(Context context) {
        return getSP(context).getInt(SDK_VERSION_CODE, 0);
    }

    public static String getSdkVersionName(Context context) {
        return getSP(context).getString(SDK_VERSION_NAME, "");
    }

    public static void setAppChannel(Context context, String str) {
        getSP(context).edit().putString("app_channel", str).commit();
    }

    public static void setAppKey(Context context, String str) {
        getSP(context).edit().putString("app_key", str).commit();
    }

    public static void setDeviceId(Context context, String str) {
        getSP(context).edit().putString("device_id", str).commit();
    }

    public static void setSdkVersionCode(Context context, int i11) {
        getSP(context).edit().putInt(SDK_VERSION_CODE, i11).commit();
    }

    public static void setSdkVersionName(Context context, String str) {
        getSP(context).edit().putString(SDK_VERSION_NAME, str).commit();
    }
}
