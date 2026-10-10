package cn.jiguang.privates.analysis.cache;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import cn.jiguang.privates.common.log.JCommonLog;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class JAnalysisTransferConfig {
    private static final String KEY_ACCOUNT_FIRST = "firstAccount";
    private static final String KEY_ACCOUNT_FIRST_OFFSET = "firstAccount_offset";
    private static final String KEY_ACCOUNT_FOLLOW = "followAccount";
    private static final String KEY_ACCOUNT_FOLLOW_OFFSET = "followAccount_offset";
    private static final String KEY_ACCOUNT_ID = "analytics_account_id";
    private static final String KEY_ACCOUNT_REPORT_JSON = "account_report_json";
    private static final String KEY_ACTIVE_EVENT_JSON = "active_event_json";
    private static final String KEY_ACTIVE_REPORT_JSON = "active_report_json";
    private static final String KEY_LAST_SESSION_JSON = "JAnalysisAccount__cache_pause_data";
    private static final String KEY_STATIC_MAP = "JAnalysisAccount_common_map";
    private static final String SP_ANALYTICS = "cn.jiguang.privates.analysis.config";
    private static final String SP_CORE = "cn.jiguang.privates.userset.profile";
    private static final String TAG = "JAnalysisTransferConfig";

    public static void initConfig(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(SP_ANALYTICS, 0);
            if (!sharedPreferences.getAll().isEmpty()) {
                String string = sharedPreferences.getString(KEY_ACCOUNT_FIRST, "");
                if (!TextUtils.isEmpty(string)) {
                    JAnalysisConfig.setFirstAccount(context, string);
                }
                String string2 = sharedPreferences.getString(KEY_ACCOUNT_FOLLOW, "");
                if (!TextUtils.isEmpty(string2)) {
                    JAnalysisConfig.setFollowAccount(context, string2);
                }
                int i11 = sharedPreferences.getInt(KEY_ACCOUNT_FIRST_OFFSET, -1);
                if (i11 != -1) {
                    JAnalysisConfig.setFirstAccountOffset(context, i11);
                }
                int i12 = sharedPreferences.getInt(KEY_ACCOUNT_FOLLOW_OFFSET, -1);
                if (i12 != -1) {
                    JAnalysisConfig.setFollowAccountOffset(context, i12);
                }
                String string3 = sharedPreferences.getString(KEY_ACCOUNT_REPORT_JSON, "");
                if (!TextUtils.isEmpty(string3)) {
                    JAnalysisConfig.setAccountCommonJson(context, string3);
                }
                String string4 = sharedPreferences.getString(KEY_ACTIVE_REPORT_JSON, "");
                if (!TextUtils.isEmpty(string4)) {
                    JAnalysisConfig.setActiveCommonJson(context, string4);
                }
                String string5 = sharedPreferences.getString(KEY_ACTIVE_EVENT_JSON, "");
                if (!TextUtils.isEmpty(string5)) {
                    JAnalysisConfig.setActiveEventJson(context, string5);
                }
                String string6 = sharedPreferences.getString(KEY_LAST_SESSION_JSON, "");
                if (!TextUtils.isEmpty(string6)) {
                    JAnalysisConfig.setLastSessionJson(context, string6);
                }
                String string7 = sharedPreferences.getString(KEY_STATIC_MAP, "");
                if (!TextUtils.isEmpty(string7)) {
                    HashMap map = new HashMap();
                    JSONObject jSONObject = new JSONObject(string7);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        map.put(next, jSONObject.opt(next));
                    }
                    if (!map.isEmpty()) {
                        JAnalysisConfig.setStaticProperty(context, map);
                    }
                }
            }
            if (context.getSharedPreferences(SP_CORE, 0).getAll().isEmpty()) {
                return;
            }
            String string8 = sharedPreferences.getString(KEY_ACCOUNT_ID, "");
            if (TextUtils.isEmpty(string8)) {
                return;
            }
            JAnalysisConfig.setAccountId(context, string8);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "initConfig failed " + th2.getMessage());
        }
    }
}
