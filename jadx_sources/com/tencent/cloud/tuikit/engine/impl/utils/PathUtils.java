package com.tencent.cloud.tuikit.engine.impl.utils;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.liteav.base.util.LiteavLog;
import java.io.File;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes59.dex */
public class PathUtils {
    private static final String TAG = "PathUtils";

    public static String getCurrentProcessName() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            return objInvoke instanceof String ? (String) objInvoke : "";
        } catch (Throwable th2) {
            th2.printStackTrace();
            return "";
        }
    }

    public static String getSDKInitPath(Context context) {
        if (context == null) {
            return "";
        }
        String string = context.getFilesDir().toString();
        String packageName = context.getPackageName();
        String currentProcessName = getCurrentProcessName();
        if (!TextUtils.isEmpty(currentProcessName) && !packageName.equals(currentProcessName)) {
            try {
                int iLastIndexOf = currentProcessName.lastIndexOf(C33844oi.f71346o);
                if (iLastIndexOf < 0) {
                    iLastIndexOf = currentProcessName.lastIndexOf(C33978va.f72339h);
                }
                if (iLastIndexOf >= 0) {
                    currentProcessName = currentProcessName.substring(iLastIndexOf + 1);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                String str = File.separator;
                sb2.append(str);
                sb2.append(currentProcessName);
                sb2.append(str);
                string = sb2.toString();
            } catch (Exception e11) {
                LiteavLog.m76083e(TAG, "getSDKInitPath exception = " + e11);
            }
        }
        Log.d(TAG, "SDK Init Path: " + string);
        return string;
    }

    public static String getSDKLogPath(Context context) {
        String string;
        if (context == null) {
            return "";
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            string = "/sdcard/Android/data/" + context.getPackageName() + "/log/tencent/imsdk";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(externalFilesDir.getAbsolutePath());
            String str = File.separator;
            sb2.append(str);
            sb2.append("log");
            sb2.append(str);
            sb2.append("tencent");
            sb2.append(str);
            sb2.append("imsdk");
            string = sb2.toString();
        }
        File file = new File(string);
        if (!file.exists() && !file.mkdirs()) {
            file = context.getFilesDir();
            LiteavLog.m76083e(TAG, "create log folder failed");
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(file.getAbsolutePath());
        String str2 = File.separator;
        sb3.append(str2);
        String string2 = sb3.toString();
        String packageName = context.getPackageName();
        String currentProcessName = getCurrentProcessName();
        if (!TextUtils.isEmpty(currentProcessName) && !packageName.equals(currentProcessName)) {
            try {
                int iLastIndexOf = currentProcessName.lastIndexOf(C33844oi.f71346o);
                if (iLastIndexOf < 0) {
                    iLastIndexOf = currentProcessName.lastIndexOf(C33978va.f72339h);
                }
                if (iLastIndexOf >= 0) {
                    currentProcessName = currentProcessName.substring(iLastIndexOf + 1);
                }
                string2 = string2 + currentProcessName + str2;
            } catch (Exception e11) {
                LiteavLog.m76083e(TAG, "getSDKLogPath exception = " + e11);
            }
        }
        Log.d(TAG, "SDK LOG Path: " + string2);
        return string2;
    }
}
