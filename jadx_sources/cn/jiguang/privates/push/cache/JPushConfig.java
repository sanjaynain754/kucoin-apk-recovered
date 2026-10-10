package cn.jiguang.privates.push.cache;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class JPushConfig {
    private static final String LAST_LIFECYCLE_SESSION = "last_lifecycle_session";
    private static final String LAST_LIFECYCLE_SESSION_JSON = "last_lifecycle_session_json";
    private static final String LAST_TO_BACKGROUND_TIME = "last_to_background_time";
    private static final String LAST_TO_FOREGROUND_TIME = "last_to_foreground_time";
    public static final String MESSAGE_ID_SET = "message_id_set_";
    private static final String NAME = "cn.jiguang.privates.push.prefs";
    public static final String NOTIFICATION_BADGE = "notification_badge";
    private static final String NOTIFICATION_COUNT = "notification_count";
    private static final String NOTIFICATION_LAYOUT = "notification_layout_";
    private static final String NOTIFICATION_SHOW_TIME = "notification_show_time";
    private static final String NOTIFICATION_SILENCE_TIME = "notification_silence_time";
    public static final String OVERRIDE_MESSAGE_ID_SET = "override_message_id_set";
    private static final String PLATFORM_TOKEN = "platform_token";
    public static final String REVOKE_MESSAGE_ID_SET = "revoke_message_id_set";
    private static SharedPreferences sharedPreferences;

    private static SharedPreferences getSharedPreferences(Context context) {
        if (sharedPreferences == null) {
            sharedPreferences = context.getApplicationContext().getSharedPreferences(NAME, 0);
        }
        return sharedPreferences;
    }

    public static String getLastLifecycleSession(Context context) {
        return getSharedPreferences(context).getString(LAST_LIFECYCLE_SESSION, "");
    }

    public static String getLastLifecycleSessionJson(Context context) {
        return getSharedPreferences(context).getString(LAST_LIFECYCLE_SESSION_JSON, "");
    }

    public static long getLastToBackgroundTime(Context context) {
        return getSharedPreferences(context).getLong(LAST_TO_BACKGROUND_TIME, 0L);
    }

    public static long getLastToForegroundTime(Context context) {
        return getSharedPreferences(context).getLong(LAST_TO_FOREGROUND_TIME, 0L);
    }

    public static Set<String> getMessageIdSet(Context context, byte b11) {
        return getSharedPreferences(context).getStringSet(MESSAGE_ID_SET + ((int) b11), new LinkedHashSet());
    }

    public static int getNotificationBadge(Context context) {
        return getSharedPreferences(context).getInt("notification_badge", 0);
    }

    public static int getNotificationCount(Context context) {
        return getSharedPreferences(context).getInt("notification_count", 5);
    }

    public static String getNotificationLayout(Context context, int i11) {
        return getSharedPreferences(context).getString(NOTIFICATION_LAYOUT + i11, "");
    }

    public static String getNotificationShowTime(Context context) {
        return getSharedPreferences(context).getString(NOTIFICATION_SHOW_TIME, "");
    }

    public static String getNotificationSilenceTime(Context context) {
        return getSharedPreferences(context).getString(NOTIFICATION_SILENCE_TIME, "");
    }

    public static Set<String> getOverrideMessageIdSet(Context context) {
        return getSharedPreferences(context).getStringSet(OVERRIDE_MESSAGE_ID_SET, new LinkedHashSet());
    }

    public static String getPlatformToken(Context context, byte b11) {
        return getSharedPreferences(context).getString("platform_token_" + ((int) b11), "");
    }

    public static Set<String> getRevokeMessageIdSet(Context context) {
        return getSharedPreferences(context).getStringSet(REVOKE_MESSAGE_ID_SET, new LinkedHashSet());
    }

    public static void setLastLifecycleSession(Context context, String str) {
        getSharedPreferences(context).edit().putString(LAST_LIFECYCLE_SESSION, str).commit();
    }

    public static void setLastLifecycleSessionJson(Context context, String str) {
        getSharedPreferences(context).edit().putString(LAST_LIFECYCLE_SESSION_JSON, str).commit();
    }

    public static void setLastToBackgroundTime(Context context, long j11) {
        getSharedPreferences(context).edit().putLong(LAST_TO_BACKGROUND_TIME, j11).commit();
    }

    public static void setLastToForegroundTime(Context context, long j11) {
        getSharedPreferences(context).edit().putLong(LAST_TO_FOREGROUND_TIME, j11).commit();
    }

    public static void setMessageIdSet(Context context, byte b11, Set<String> set) {
        getSharedPreferences(context).edit().putStringSet(MESSAGE_ID_SET + ((int) b11), set).commit();
    }

    public static void setNotificationBadge(Context context, int i11) {
        getSharedPreferences(context).edit().putInt("notification_badge", i11).commit();
    }

    public static void setNotificationCount(Context context, int i11) {
        getSharedPreferences(context).edit().putInt("notification_count", i11).commit();
    }

    public static void setNotificationLayout(Context context, int i11, String str) {
        getSharedPreferences(context).edit().putString(NOTIFICATION_LAYOUT + i11, str).commit();
    }

    public static void setNotificationShowTime(Context context, String str) {
        getSharedPreferences(context).edit().putString(NOTIFICATION_SHOW_TIME, str).commit();
    }

    public static void setNotificationSilenceTime(Context context, String str) {
        getSharedPreferences(context).edit().putString(NOTIFICATION_SILENCE_TIME, str).commit();
    }

    public static void setOverrideMessageIdSet(Context context, Set<String> set) {
        getSharedPreferences(context).edit().putStringSet(OVERRIDE_MESSAGE_ID_SET, set).commit();
    }

    public static void setPlatformToken(Context context, byte b11, String str) {
        getSharedPreferences(context).edit().putString("platform_token_" + ((int) b11), str).commit();
    }

    public static void setRevokeMessageIdSet(Context context, Set<String> set) {
        getSharedPreferences(context).edit().putStringSet(REVOKE_MESSAGE_ID_SET, set).commit();
    }
}
