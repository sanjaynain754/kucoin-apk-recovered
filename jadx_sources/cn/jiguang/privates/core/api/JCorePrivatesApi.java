package cn.jiguang.privates.core.api;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.global.JGlobal;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.common.observer.JObservable;
import cn.jiguang.privates.core.cache.JCoreConfig;
import cn.jiguang.privates.core.constants.JCoreConstants;
import cn.jiguang.privates.core.global.JCoreGlobal;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class JCorePrivatesApi {
    public static final int SDK_VERSION_CODE = 322;
    public static final String SDK_VERSION_NAME = "3.2.2";
    private static final String TAG = "JCorePrivatesApi";

    @Deprecated
    public static void configHost(String str) {
        Address address = new Address();
        if (!TextUtils.isEmpty(str)) {
            address.setDefaultReportUrl(str);
        }
        configAddress(null, address);
    }

    public static int getLoginCode(Context context) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "getLoginCode context can't be null, please check it");
            return 0;
        }
        if (JGlobal.isMainProcess(context.getApplicationContext())) {
            return JCoreGlobal.getLoginCode(context);
        }
        if (JGlobal.isRemoteProcess(context.getApplicationContext())) {
            return JCoreConfig.getLoginCode(context.getApplicationContext());
        }
        return 0;
    }

    public static int getRegisterCode(Context context) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "getRegisterCode context can't be null, please check it");
            return 0;
        }
        if (JGlobal.isMainProcess(context.getApplicationContext())) {
            return JCoreGlobal.getRegisterCode(context);
        }
        if (JGlobal.isRemoteProcess(context.getApplicationContext())) {
            return JCoreConfig.getRegisterCode(context.getApplicationContext());
        }
        return 0;
    }

    public static int getSeedId(Context context) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "getSeedId context can't be null, please check it");
            return 0;
        }
        if (JGlobal.isMainProcess(context.getApplicationContext())) {
            return JCoreGlobal.getSeedId(context);
        }
        if (JGlobal.isRemoteProcess(context.getApplicationContext())) {
            return JCoreConfig.getSeedId(context.getApplicationContext());
        }
        return 0;
    }

    public static boolean isConnectContinue(Context context) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "isConnectContinue context can't be null, please check it");
            return false;
        }
        if (!JGlobal.isMainProcess(context.getApplicationContext()) && !JGlobal.isRemoteProcess(context.getApplicationContext())) {
            return false;
        }
        for (String str : JObservable.getInstance().observeNameQueue) {
            if (TextUtils.equals(str, "cn.jiguang.privates.push.JPush") || TextUtils.equals(str, "cn.jiguang.privates.message.JMessage")) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public static void setDebugMode(boolean z11) {
        configDebugMode(null, z11);
    }

    public static void configAddress(Context context, Address address) {
        if (context == null) {
            JCoreGlobal.setAddress(address);
        } else if (JGlobal.isMainProcess(context.getApplicationContext()) || JGlobal.isRemoteProcess(context.getApplicationContext())) {
            JCoreGlobal.setAddress(address);
        }
    }

    public static void configAppChannel(Context context, String str) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "configAppChannel context can't be null, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            JCommonLog.m5431e(TAG, "configAppChannel appChannel can't be empty, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext()) || JGlobal.isRemoteProcess(context.getApplicationContext())) {
            JGlobal.setAppChannel(str);
        }
    }

    public static void configAppKey(Context context, String str) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "configAppKey context can't be null, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            JCommonLog.m5431e(TAG, "configAppKey appKey can't be empty, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext()) || JGlobal.isRemoteProcess(context.getApplicationContext())) {
            JGlobal.setAppKey(str);
        }
    }

    public static void configConnectRetryCount(Context context, int i11) {
        if (context == null) {
            JCoreGlobal.setConnectRetryCount(i11);
        } else if (JGlobal.isMainProcess(context.getApplicationContext()) || JGlobal.isRemoteProcess(context.getApplicationContext())) {
            JCoreGlobal.setConnectRetryCount(i11);
        }
    }

    public static void configDebugMode(Context context, boolean z11) {
        if (context == null) {
            JGlobal.setDebugMode(z11);
        } else if (JGlobal.isMainProcess(context.getApplicationContext()) || JGlobal.isRemoteProcess(context.getApplicationContext())) {
            JGlobal.setDebugMode(z11);
        }
    }

    public static void configHeartbeatInterval(Context context, long j11) {
        if (context == null) {
            JCoreGlobal.setHeartbeatInterval(j11);
        } else if (JGlobal.isMainProcess(context.getApplicationContext()) || JGlobal.isRemoteProcess(context.getApplicationContext())) {
            JCoreGlobal.setHeartbeatInterval(j11);
        }
    }

    public static void configSM4(Context context) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "configSM4 context can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext()) || JGlobal.isRemoteProcess(context.getApplicationContext())) {
            JGlobal.setEncryptType(2);
        }
    }

    public static void configWakeAndBeWake(Context context, boolean z11) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "configWakeAndBeWake context can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext()) || JGlobal.isRemoteProcess(context.getApplicationContext())) {
            JCoreGlobal.setWakeAndBeWakeState(z11);
        }
    }

    public static String getPassword(Context context) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "getPassword context can't be null, please check it");
            return "";
        }
        if (JGlobal.isMainProcess(context.getApplicationContext())) {
            return JCoreGlobal.getPassword(context);
        }
        return JGlobal.isRemoteProcess(context.getApplicationContext()) ? JCoreConfig.getPassword(context.getApplicationContext()) : "";
    }

    public static String getRegistrationId(Context context) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "getRegistrationId context can't be null, please check it");
            return "";
        }
        if (JGlobal.isMainProcess(context.getApplicationContext())) {
            return JCoreGlobal.getRegistrationId(context);
        }
        return JGlobal.isRemoteProcess(context.getApplicationContext()) ? JCoreConfig.getRegistrationId(context.getApplicationContext()) : "";
    }

    public static long getServerTime(Context context) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "getServerTime context can't be null, please check it");
            return 0L;
        }
        if (JGlobal.isMainProcess(context.getApplicationContext())) {
            return JCoreGlobal.getServerTime(context);
        }
        if (JGlobal.isRemoteProcess(context.getApplicationContext())) {
            return JCoreConfig.getServerTime(context.getApplicationContext());
        }
        return 0L;
    }

    public static long getUserId(Context context) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "getUserId context can't be null, please check it");
            return 0L;
        }
        if (JGlobal.isMainProcess(context.getApplicationContext())) {
            return JCoreGlobal.getUserId(context);
        }
        if (JGlobal.isRemoteProcess(context.getApplicationContext())) {
            return JCoreConfig.getUserId(context.getApplicationContext());
        }
        return 0L;
    }

    public static void uploadCacheReport(Context context) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "uploadCacheReport context can't be null, please check it");
        } else if (JGlobal.isRemoteProcess(context.getApplicationContext())) {
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JCoreConstants.RemoteWhat.REPORT_CACHE, Bundle.EMPTY);
        }
    }

    @Deprecated
    public static void setWakeAndBeWakeEnable(Context context, boolean z11) {
        configWakeAndBeWake(context, z11);
    }

    @Deprecated
    public static void configHost(List<String> list, List<String> list2, int i11, String str, String str2, int i12, String str3) {
        Address address = new Address();
        if (list != null && !list.isEmpty()) {
            address.setSisHostArray((String[]) list.toArray(new String[list.size()]));
        }
        if (list2 != null && !list2.isEmpty()) {
            address.setSisIpArray((String[]) list2.toArray(new String[list2.size()]));
        }
        if (i11 > 0) {
            address.setSisPort(i11);
        }
        if (!TextUtils.isEmpty(str)) {
            address.setDefaultHost(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            address.setDefaultIp(str2);
        }
        if (i12 > 0) {
            address.setDefaultPort(i12);
        }
        if (!TextUtils.isEmpty(str3)) {
            address.setDefaultReportUrl(str3);
        }
        configAddress(null, address);
    }
}
