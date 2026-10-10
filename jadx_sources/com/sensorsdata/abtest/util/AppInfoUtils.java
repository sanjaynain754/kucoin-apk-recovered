package com.sensorsdata.abtest.util;

import android.text.TextUtils;
import android.util.Log;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPIEmptyImplementation;
import com.tencent.bugly.proguard.C33820nf;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes23.dex */
public class AppInfoUtils {
    public static final String MIN_SA_SDK_VERSION = "4.3.6";
    private static final String TAG = "AppInfoUtils";

    public static boolean checkSASDKVersionIsValid() {
        SensorsDataAPI sensorsDataAPISharedInstance = SensorsDataAPI.sharedInstance();
        if (sensorsDataAPISharedInstance instanceof SensorsDataAPIEmptyImplementation) {
            Log.e(TAG, "神策 Android 埋点 SDK 未集成或未初始化");
            return false;
        }
        try {
            Field declaredField = sensorsDataAPISharedInstance.getClass().getDeclaredField("VERSION");
            declaredField.setAccessible(true);
            String str = (String) declaredField.get(sensorsDataAPISharedInstance);
            if (!TextUtils.isEmpty(str)) {
                if (!isVersionValid(str.contains(C33820nf.f71144W) ? str.substring(0, str.indexOf(C33820nf.f71144W)) : str, MIN_SA_SDK_VERSION)) {
                    Log.e(TAG, String.format("当前神策 Android 埋点 SDK 版本 %s 过低，请升级至 %s 及其以上版本后进行使用", str, MIN_SA_SDK_VERSION));
                    return false;
                }
            }
            return true;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return false;
        }
    }

    public static boolean isVersionValid(String str, String str2) {
        try {
            if (str.equals(str2)) {
                return true;
            }
            String[] strArrSplit = str.split("\\.");
            String[] strArrSplit2 = str2.split("\\.");
            for (int i11 = 0; i11 < strArrSplit2.length; i11++) {
                if (Integer.parseInt(strArrSplit[i11]) > Integer.parseInt(strArrSplit2[i11])) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
