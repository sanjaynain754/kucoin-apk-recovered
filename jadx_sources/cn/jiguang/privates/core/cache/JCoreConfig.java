package cn.jiguang.privates.core.cache;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class JCoreConfig {
    private static final String CONNECT_STATE = "connect_state";
    private static final String HTTP_ADDRESS = "http_address";
    private static final String LOGIN_CODE = "login_code";
    private static final String NAME = "cn.jiguang.privates.core.prefs";
    private static final String PASSWORD = "password";
    private static final String PLATFORM_STATE = "platform_state";
    private static final String REGISTER_CODE = "register_code";
    private static final String REGISTRATION_ID = "registration_id";
    private static final String SEED_ID = "seed_id";
    private static final String SERVER_TIME = "server_time";
    private static final String TCP_ADDRESS = "tcp_address";
    private static final String UDP_ADDRESS = "udp_address";
    private static final String USER_ID = "user_id";
    private static SharedPreferences sharedPreferences;

    public static int getSeedId(Context context) {
        return sharedPreferences.getInt("seed_id", 0);
    }

    private static SharedPreferences getSharedPreferences(Context context) {
        if (sharedPreferences == null) {
            sharedPreferences = context.getSharedPreferences(NAME, 0);
        }
        return sharedPreferences;
    }

    public static boolean getConnectState(Context context) {
        return getSharedPreferences(context).getBoolean(CONNECT_STATE, true);
    }

    public static Set<String> getHttpAddress(Context context) {
        return getSharedPreferences(context).getStringSet(HTTP_ADDRESS, new LinkedHashSet());
    }

    public static int getLoginCode(Context context) {
        return getSharedPreferences(context).getInt(LOGIN_CODE, -1);
    }

    public static String getPassword(Context context) {
        return getSharedPreferences(context).getString("password", "");
    }

    public static byte getPlatformState(Context context) {
        return (byte) getSharedPreferences(context).getInt(PLATFORM_STATE, 0);
    }

    public static int getRegisterCode(Context context) {
        return getSharedPreferences(context).getInt(REGISTER_CODE, -1);
    }

    public static String getRegistrationId(Context context) {
        return getSharedPreferences(context).getString("registration_id", "");
    }

    public static long getServerTime(Context context) {
        return getSharedPreferences(context).getLong("server_time", 0L);
    }

    public static Set<String> getTcpAddress(Context context) {
        return getSharedPreferences(context).getStringSet(TCP_ADDRESS, new LinkedHashSet());
    }

    public static Set<String> getUdpAddress(Context context) {
        return getSharedPreferences(context).getStringSet(UDP_ADDRESS, new LinkedHashSet());
    }

    public static long getUserId(Context context) {
        return getSharedPreferences(context).getLong("user_id", 0L);
    }

    public static void setConnectState(Context context, boolean z11) {
        getSharedPreferences(context).edit().putBoolean(CONNECT_STATE, z11).commit();
    }

    public static void setHttpAddress(Context context, Set<String> set) {
        getSharedPreferences(context).edit().putStringSet(HTTP_ADDRESS, set).commit();
    }

    public static void setLoginCode(Context context, int i11) {
        getSharedPreferences(context).edit().putInt(LOGIN_CODE, i11).commit();
    }

    public static void setPassword(Context context, String str) {
        getSharedPreferences(context).edit().putString("password", str).commit();
    }

    public static void setPlatformState(Context context, byte b11) {
        getSharedPreferences(context).edit().putInt(PLATFORM_STATE, b11).commit();
    }

    public static void setRegisterCode(Context context, int i11) {
        getSharedPreferences(context).edit().putInt(REGISTER_CODE, i11).commit();
    }

    public static void setRegistrationId(Context context, String str) {
        getSharedPreferences(context).edit().putString("registration_id", str).commit();
    }

    public static void setSeedId(Context context, int i11) {
        getSharedPreferences(context).edit().putInt("seed_id", i11).commit();
    }

    public static void setServerTime(Context context, long j11) {
        getSharedPreferences(context).edit().putLong("server_time", j11).commit();
    }

    public static void setTcpAddress(Context context, Set<String> set) {
        getSharedPreferences(context).edit().putStringSet(TCP_ADDRESS, set).commit();
    }

    public static void setUdpAddress(Context context, Set<String> set) {
        getSharedPreferences(context).edit().putStringSet(UDP_ADDRESS, set).commit();
    }

    public static void setUserId(Context context, long j11) {
        getSharedPreferences(context).edit().putLong("user_id", j11).commit();
    }
}
