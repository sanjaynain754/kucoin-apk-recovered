package cn.jiguang.privates.push.cache;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public class PlatformConfig {
    private static final String NAME = "cn.jiguang.privates.push.prefs.platform";
    private static final String PLATFORM_TOKEN_FAILED = "platform_token_fail";
    private static final String PLATFORM_TOKEN_FAILED_FROM = "platform_token_fail_from";
    private static SharedPreferences sharedPreferences;

    private static SharedPreferences getSharedPreferences(Context context) {
        if (sharedPreferences == null) {
            sharedPreferences = context.getApplicationContext().getSharedPreferences(NAME, 0);
        }
        return sharedPreferences;
    }

    public static String getPlatformTokenFailed(Context context) {
        return getSharedPreferences(context).getString(PLATFORM_TOKEN_FAILED, "");
    }

    public static int getPlatformTokenFailedFrom(Context context) {
        return getSharedPreferences(context).getInt(PLATFORM_TOKEN_FAILED_FROM, 0);
    }

    public static void setPlatformTokenFailed(Context context, String str) {
        getSharedPreferences(context).edit().putString(PLATFORM_TOKEN_FAILED, str).commit();
    }

    public static void setPlatformTokenFailedFrom(Context context, int i11) {
        getSharedPreferences(context).edit().putInt(PLATFORM_TOKEN_FAILED_FROM, i11).commit();
    }
}
