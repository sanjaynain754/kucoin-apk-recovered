package cn.jiguang.privates.common.cache;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import cn.jiguang.privates.common.log.JCommonLog;

/* JADX INFO: loaded from: classes.dex */
public class JCommonTransferConfig {
    private static final String KEY_NAME_32 = "devcie_id_generated";
    private static final String KEY_NAME_64 = "devcie_id_generated";
    private static final String KEY_NAME_PRIVATE_64_V1 = "devcie_id_generated";
    private static final String KEY_NAME_PRIVATE_64_V2 = "devcie_id_generated";
    private static final String KEY_NAME_PRIVATE_64_V3 = "device_id";
    private static final String SP_NAME_32 = "cn.jpush.preferences.v2";
    private static final String SP_NAME_64 = "cn.jpush.android.user.profile";
    private static final String SP_NAME_PRIVATE_64_V1 = "cn.jpush.android.user.profile_64";
    private static final String SP_NAME_PRIVATE_64_V2 = "cn.jiguang.privates.device.profile";
    private static final String SP_NAME_PRIVATE_64_V3 = "cn.jiguang.privates.core.prefs";
    private static final String TAG = "JCommonTransferConfig";

    public static void initConfig(Context context) {
        String deviceId = JCommonConfig.getDeviceId(context);
        if (!TextUtils.isEmpty(deviceId)) {
            JCommonLog.m5430d(TAG, "current deviceId:" + deviceId);
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(SP_NAME_PRIVATE_64_V3, 0);
        if (!sharedPreferences.getAll().isEmpty()) {
            String string = sharedPreferences.getString("device_id", "");
            if (!TextUtils.isEmpty(string)) {
                JCommonLog.m5430d(TAG, "cache sp file:cn.jiguang.privates.core.prefs, deviceId:" + string);
                JCommonConfig.setDeviceId(context, string);
                return;
            }
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(SP_NAME_PRIVATE_64_V2, 0);
        if (!sharedPreferences2.getAll().isEmpty()) {
            String string2 = sharedPreferences2.getString("devcie_id_generated", "");
            if (!TextUtils.isEmpty(string2)) {
                JCommonLog.m5430d(TAG, "cache sp file:cn.jiguang.privates.device.profile, deviceId:" + string2);
                JCommonConfig.setDeviceId(context, string2);
                return;
            }
        }
        SharedPreferences sharedPreferences3 = context.getSharedPreferences(SP_NAME_PRIVATE_64_V1, 0);
        if (!sharedPreferences2.getAll().isEmpty()) {
            String string3 = sharedPreferences3.getString("devcie_id_generated", "");
            if (!TextUtils.isEmpty(string3)) {
                JCommonLog.m5430d(TAG, "cache sp file:cn.jpush.android.user.profile_64, deviceId:" + string3);
                JCommonConfig.setDeviceId(context, string3);
                return;
            }
        }
        SharedPreferences sharedPreferences4 = context.getSharedPreferences(SP_NAME_64, 0);
        if (!sharedPreferences4.getAll().isEmpty()) {
            String string4 = sharedPreferences4.getString("devcie_id_generated", "");
            if (!TextUtils.isEmpty(string4)) {
                JCommonLog.m5430d(TAG, "cache sp file:cn.jpush.android.user.profile, deviceId:" + string4);
                JCommonConfig.setDeviceId(context, string4);
                return;
            }
        }
        SharedPreferences sharedPreferences5 = context.getSharedPreferences(SP_NAME_32, 0);
        if (!sharedPreferences4.getAll().isEmpty()) {
            String string5 = sharedPreferences5.getString("devcie_id_generated", "");
            if (!TextUtils.isEmpty(string5)) {
                JCommonLog.m5430d(TAG, "cache sp file:cn.jpush.preferences.v2, deviceId:" + string5);
                JCommonConfig.setDeviceId(context, string5);
            }
        }
    }
}
