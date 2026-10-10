package cn.jiguang.privates.analysis.cache;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import cn.jiguang.privates.common.log.JCommonLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class JAnalysisConfig {
    private static final String ACCOUNT_COMMON_JSON = "account_common_json";
    private static final String ACCOUNT_ID = "account_id";
    private static final String ACTIVE_COMMON_JSON = "active_common_json";
    private static final String ACTIVE_EVENT_JSON = "active_event_json";
    private static final String COMMON_PROPERTY_MAP = "static_property_map";
    private static final String FIRST_ACCOUNT = "first_account";
    private static final String FIRST_ACCOUNT_OFFSET = "first_account_offset";
    private static final String FIRST_TIME = "first_time";
    private static final String FOLLOW_ACCOUNT = "follow_account";
    private static final String FOLLOW_ACCOUNT_OFFSET = "follow_account_offset";
    private static final String LAST_SESSION = "last_session";
    private static final String LAST_SESSION_JSON = "last_session_json";
    private static final String LAST_TO_BACKGROUND_TIME = "last_to_background_time";
    private static final String LAST_TO_FOREGROUND_TIME = "last_to_foreground_time";
    private static final String NAME = "cn.jiguang.privates.analysis.prefs";
    private static final String TAG = "JAnalysisConfig";
    private static SharedPreferences sharedPreferences;

    private static SharedPreferences getSharedPreferences(Context context) {
        if (sharedPreferences == null) {
            sharedPreferences = context.getApplicationContext().getSharedPreferences(NAME, 0);
        }
        return sharedPreferences;
    }

    public static Map<String, Object> getStaticProperty(Context context) {
        try {
            HashMap map = new HashMap();
            String string = getSharedPreferences(context).getString(COMMON_PROPERTY_MAP, "");
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.opt(next));
                }
            }
            return map;
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "getCommonProperty failed " + th2.getMessage());
            return new HashMap();
        }
    }

    public static String getAccountCommonJson(Context context) {
        return getSharedPreferences(context).getString(ACCOUNT_COMMON_JSON, "");
    }

    public static String getAccountId(Context context) {
        return getSharedPreferences(context).getString("account_id", "");
    }

    public static String getActiveCommonJson(Context context) {
        return getSharedPreferences(context).getString(ACTIVE_COMMON_JSON, "");
    }

    public static String getActiveEventJson(Context context) {
        return getSharedPreferences(context).getString(ACTIVE_EVENT_JSON, "");
    }

    public static String getFirstAccount(Context context) {
        return getSharedPreferences(context).getString(FIRST_ACCOUNT, "");
    }

    public static int getFirstAccountOffset(Context context) {
        return getSharedPreferences(context).getInt(FIRST_ACCOUNT_OFFSET, -1);
    }

    public static boolean getFirstTime(Context context) {
        return getSharedPreferences(context).getBoolean(FIRST_TIME, true);
    }

    public static String getFollowAccount(Context context) {
        return getSharedPreferences(context).getString(FOLLOW_ACCOUNT, "");
    }

    public static int getFollowAccountOffset(Context context) {
        return getSharedPreferences(context).getInt(FOLLOW_ACCOUNT_OFFSET, -1);
    }

    public static String getLastSession(Context context) {
        return getSharedPreferences(context).getString(LAST_SESSION, "");
    }

    public static String getLastSessionJson(Context context) {
        return getSharedPreferences(context).getString(LAST_SESSION_JSON, "");
    }

    public static long getLastToBackgroundTime(Context context) {
        return getSharedPreferences(context).getLong(LAST_TO_BACKGROUND_TIME, 0L);
    }

    public static long getLastToForegroundTime(Context context) {
        return getSharedPreferences(context).getLong(LAST_TO_FOREGROUND_TIME, 0L);
    }

    public static void setAccountCommonJson(Context context, String str) {
        getSharedPreferences(context).edit().putString(ACCOUNT_COMMON_JSON, str).commit();
    }

    public static void setAccountId(Context context, String str) {
        getSharedPreferences(context).edit().putString("account_id", str).commit();
    }

    public static void setActiveCommonJson(Context context, String str) {
        getSharedPreferences(context).edit().putString(ACTIVE_COMMON_JSON, str).commit();
    }

    public static void setActiveEventJson(Context context, String str) {
        getSharedPreferences(context).edit().putString(ACTIVE_EVENT_JSON, str).commit();
    }

    public static void setFirstAccount(Context context, String str) {
        getSharedPreferences(context).edit().putString(FIRST_ACCOUNT, str).commit();
    }

    public static void setFirstAccountOffset(Context context, int i11) {
        getSharedPreferences(context).edit().putInt(FIRST_ACCOUNT_OFFSET, i11).commit();
    }

    public static void setFirstTime(Context context, boolean z11) {
        getSharedPreferences(context).edit().putBoolean(FIRST_TIME, z11).commit();
    }

    public static void setFollowAccount(Context context, String str) {
        getSharedPreferences(context).edit().putString(FOLLOW_ACCOUNT, str).commit();
    }

    public static void setFollowAccountOffset(Context context, int i11) {
        getSharedPreferences(context).edit().putInt(FOLLOW_ACCOUNT_OFFSET, i11).commit();
    }

    public static void setLastSession(Context context, String str) {
        getSharedPreferences(context).edit().putString(LAST_SESSION, str).commit();
    }

    public static void setLastSessionJson(Context context, String str) {
        getSharedPreferences(context).edit().putString(LAST_SESSION_JSON, str).commit();
    }

    public static void setLastToBackgroundTime(Context context, long j11) {
        getSharedPreferences(context).edit().putLong(LAST_TO_BACKGROUND_TIME, j11).commit();
    }

    public static void setLastToForegroundTime(Context context, long j11) {
        getSharedPreferences(context).edit().putLong(LAST_TO_FOREGROUND_TIME, j11).commit();
    }

    public static void setStaticProperty(Context context, Map<String, Object> map) {
        try {
            if (map == null) {
                getSharedPreferences(context).edit().putString(COMMON_PROPERTY_MAP, "").commit();
                return;
            }
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
            getSharedPreferences(context).edit().putString(COMMON_PROPERTY_MAP, jSONObject.toString()).commit();
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "setCommonProperty failed " + th2.getMessage());
        }
    }
}
