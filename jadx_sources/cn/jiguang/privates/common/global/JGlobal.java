package cn.jiguang.privates.common.global;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import cn.jiguang.privates.common.cache.JCommonConfig;
import cn.jiguang.privates.common.component.JCommonReceiver;
import cn.jiguang.privates.common.component.JCommonService;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.common.utils.StringUtil;
import cn.jiguang.privates.common.utils.SystemUtil;
import com.tencent.bugly.proguard.C33627eb;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class JGlobal {
    private static final String APP_CHANNEL = "JIGUANG_PRIVATES_CHANNEL";
    private static final String APP_KEY = "JIGUANG_PRIVATES_APPKEY";
    private static final String APP_PROCESS = "JIGUANG_PRIVATES_PROCESS";
    private static final String INTENT_COMMON_RECEIVER = "cn.jiguang.privates.intent.USER_RECEIVER";
    private static final String INTENT_COMMON_SERVICE = "cn.jiguang.privates.intent.USER_SERVICE";
    public static boolean IS_FOR_BINANCE = false;
    public static boolean IS_FOR_CHINALIFE = false;
    public static boolean IS_FOR_PINGANBANK = false;
    public static boolean IS_FOR_PINGANTECH = false;
    public static boolean IS_FOR_SGM = false;
    public static boolean IS_FOR_SPDBAND = false;
    private static final String TAG = "JGlobal";
    private static String appChannel = null;
    private static String appKey = null;
    private static String appProcess = null;
    private static int appVersionCode = 0;
    private static String appVersionName = null;
    private static JCommonReceiver commonReceiver = null;
    private static JCommonService commonService = null;
    public static Context context = null;
    private static String countryCode = null;
    private static String currentActivityName = "";
    private static int encryptType = 2;
    private static boolean isDebugMode = false;
    private static AtomicBoolean isMainProcess = null;
    public static boolean isNeedRemoteProcess = false;
    private static AtomicBoolean isRemoteProcess = null;
    private static boolean lifecycleState = false;
    private static String networkName = "unknown";
    private static String networkRadio = "";
    private static boolean networkState;
    private static int networkType;

    private static String getCurrentProcessName(Context context2) {
        StringBuilder sb2;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                return Application.getProcessName();
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "getCurrentProcessName failed " + th2.getMessage());
        }
        FileInputStream fileInputStream = null;
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable th3) {
            JCommonLog.m5433w(TAG, "getCurrentProcessName failed " + th3.getMessage());
        }
        try {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/self/cmdline");
            try {
                byte[] bArr = new byte[256];
                int i11 = 0;
                while (true) {
                    int i12 = fileInputStream2.read();
                    if (i12 <= 0 || i11 >= 256) {
                        break;
                    }
                    bArr[i11] = (byte) i12;
                    i11++;
                }
                if (i11 > 0) {
                    String str = new String(bArr, 0, i11, "UTF-8");
                    try {
                        fileInputStream2.close();
                    } catch (Throwable th4) {
                        JCommonLog.m5433w(TAG, "getCurrentProcessName failed " + th4.getMessage());
                    }
                    return str;
                }
                try {
                    fileInputStream2.close();
                    return "";
                } catch (Throwable th5) {
                    th = th5;
                    sb2 = new StringBuilder();
                }
            } catch (Throwable th6) {
                th = th6;
                fileInputStream = fileInputStream2;
                try {
                    JCommonLog.m5433w(TAG, "getCurrentProcessName failed " + th.getMessage());
                    if (fileInputStream == null) {
                        return "";
                    }
                    try {
                        return "";
                    } catch (Throwable th7) {
                        th = th7;
                        sb2 = new StringBuilder();
                    }
                } finally {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th8) {
                            JCommonLog.m5433w(TAG, "getCurrentProcessName failed " + th8.getMessage());
                        }
                    }
                }
            }
        } catch (Throwable th9) {
            th = th9;
        }
        sb2.append("getCurrentProcessName failed ");
        sb2.append(th.getMessage());
        String string = sb2.toString();
        return "";
    }

    public static boolean hasPermission(Context context2, String str) {
        try {
            return context2.checkSelfPermission(str) == 0;
        } catch (Throwable unused) {
        }
    }

    public static String getAppChannel(Context context2) {
        if (TextUtils.isEmpty(appChannel)) {
            appChannel = getMetaData(context2, APP_CHANNEL);
        }
        return appChannel;
    }

    public static String getAppKey(Context context2) {
        if (TextUtils.isEmpty(appKey)) {
            appKey = getMetaData(context2, APP_KEY);
        }
        return appKey;
    }

    public static String getAppProcess(Context context2) {
        if (TextUtils.isEmpty(appProcess)) {
            appProcess = getMetaData(context2, APP_PROCESS);
        }
        return appProcess;
    }

    public static int getAppVersionCode(Context context2) {
        int i11 = appVersionCode;
        if (i11 != 0) {
            return i11;
        }
        try {
            int i12 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
            appVersionCode = i12;
            return i12;
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "getAppVersionCode failed: " + th2.getMessage());
            return 0;
        }
    }

    public static String getAppVersionName(Context context2) {
        if (!TextUtils.isEmpty(appVersionName)) {
            return appVersionName;
        }
        try {
            String str = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
            appVersionName = str;
            return str;
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "getAppVersionName failed: " + th2.getMessage());
            return "";
        }
    }

    public static JCommonReceiver getCommonReceiver(Context context2) {
        JCommonReceiver jCommonReceiver = commonReceiver;
        if (jCommonReceiver != null) {
            return jCommonReceiver;
        }
        try {
            Intent intent = new Intent();
            intent.setAction(INTENT_COMMON_RECEIVER);
            intent.setPackage(context2.getPackageName());
            Iterator<ResolveInfo> it = context2.getPackageManager().queryBroadcastReceivers(intent, 0).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null) {
                    String str = activityInfo.name;
                    if (!TextUtils.isEmpty(str)) {
                        Class<?> cls = Class.forName(str);
                        if (JCommonReceiver.class.isAssignableFrom(cls)) {
                            JCommonReceiver jCommonReceiver2 = (JCommonReceiver) cls.newInstance();
                            commonReceiver = jCommonReceiver2;
                            return jCommonReceiver2;
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "getCommonReceiver failed " + th2.getMessage());
            return null;
        }
    }

    public static JCommonService getCommonService(Context context2) {
        JCommonService jCommonService = commonService;
        if (jCommonService != null) {
            return jCommonService;
        }
        try {
            Intent intent = new Intent();
            intent.setAction(INTENT_COMMON_SERVICE);
            intent.setPackage(context2.getPackageName());
            Iterator<ResolveInfo> it = context2.getPackageManager().queryIntentServices(intent, 0).iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    String str = serviceInfo.name;
                    if (!TextUtils.isEmpty(str)) {
                        Class<?> cls = Class.forName(str);
                        if (JCommonService.class.isAssignableFrom(cls)) {
                            JCommonService jCommonService2 = (JCommonService) cls.newInstance();
                            commonService = jCommonService2;
                            return jCommonService2;
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "getCommonService failed " + th2.getMessage());
            return null;
        }
    }

    public static String getCountryCode(Context context2) {
        if (TextUtils.isEmpty(countryCode)) {
            countryCode = SystemUtil.getCountry(context2);
        }
        return countryCode;
    }

    public static String getCurrentActivityName() {
        return currentActivityName;
    }

    public static boolean getDebugMode() {
        return isDebugMode;
    }

    public static String getDeviceId(Context context2) {
        String str;
        String deviceId = JCommonConfig.getDeviceId(context2);
        if (!TextUtils.isEmpty(deviceId)) {
            return deviceId;
        }
        try {
            str = StringUtil.get32MD5String(C33627eb.f69716f + Settings.Secure.getString(context2.getContentResolver(), "android_id") + C33627eb.f69716f + (Build.PRODUCT.toLowerCase() + "_" + Build.TIME));
        } catch (Throwable unused) {
            str = StringUtil.get32MD5String(C33627eb.f69716f + UUID.randomUUID().toString() + "  ");
        }
        JCommonConfig.setDeviceId(context2, str);
        return str;
    }

    public static int getEncryptType() {
        return encryptType;
    }

    public static boolean getLifecycleState() {
        return lifecycleState;
    }

    public static String getNetworkName() {
        return networkName;
    }

    public static String getNetworkRadio() {
        return networkRadio;
    }

    public static boolean getNetworkState() {
        return networkState;
    }

    public static int getNetworkType() {
        return networkType;
    }

    public static boolean isMainProcess(Context context2) {
        AtomicBoolean atomicBoolean = isMainProcess;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        isMainProcess = new AtomicBoolean(false);
        try {
            if (TextUtils.equals(getCurrentProcessName(context2), getMainProcessName(context2))) {
                isMainProcess.set(true);
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "isMainProcess failed " + th2.getMessage());
        }
        return isMainProcess.get();
    }

    public static boolean isRemoteProcess(Context context2) {
        AtomicBoolean atomicBoolean = isRemoteProcess;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        isRemoteProcess = new AtomicBoolean(false);
        try {
            String currentProcessName = getCurrentProcessName(context2);
            if (TextUtils.isEmpty(currentProcessName)) {
                isRemoteProcess.set(true);
            }
            if (TextUtils.equals(currentProcessName, getRemoteProcessName(context2, getCommonService(context2).getClass()))) {
                isRemoteProcess.set(true);
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "isRemoteProcess failed " + th2.getMessage());
        }
        return isRemoteProcess.get();
    }

    public static void setAppChannel(String str) {
        appChannel = str;
    }

    public static void setAppKey(String str) {
        appKey = str;
    }

    public static void setCountryCode(String str) {
        countryCode = str;
    }

    public static void setCurrentActivityName(String str) {
        currentActivityName = str;
    }

    public static void setDebugMode(boolean z11) {
        isDebugMode = z11;
    }

    public static void setEncryptType(int i11) {
        encryptType = i11;
    }

    public static void setLifecycleState(boolean z11) {
        lifecycleState = z11;
    }

    public static void setNetworkName(String str) {
        networkName = str;
    }

    public static void setNetworkRadio(String str) {
        networkRadio = str;
    }

    public static void setNetworkState(boolean z11) {
        networkState = z11;
    }

    public static void setNetworkType(int i11) {
        networkType = i11;
    }

    private static String getMainProcessName(Context context2) {
        return context2.getPackageName();
    }

    public static String getMetaData(Context context2, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo(context2.getPackageName(), 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                return String.valueOf(bundle.get(str));
            }
            return "";
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "getMetaData failed " + th2.getMessage());
            return "";
        }
    }

    private static String getRemoteProcessName(Context context2, Class<?> cls) {
        try {
            return context2.getPackageManager().getServiceInfo(new ComponentName(context2.getPackageName(), cls.getCanonicalName()), 128).processName;
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "getRemoteProcessName failed " + th2.getMessage());
            return "";
        }
    }

    public static void setDeviceId(Context context2, String str) {
        JCommonConfig.setDeviceId(context2, str);
    }
}
