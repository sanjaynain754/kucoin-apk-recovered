package com.sensorsdata.analytics.android.sdk.util;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.ThreadNameConstants;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes23.dex */
public class AppInfoUtils {
    private static String mAppVersionName;
    private static Bundle mConfigBundle;

    private static String getCurrentProcessNameByAT() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static String getCurrentProcessNameByCmd() {
        FileInputStream fileInputStream;
        try {
            try {
                fileInputStream = new FileInputStream("/proc/self/cmdline");
                try {
                    byte[] bArr = new byte[256];
                    int i11 = 0;
                    while (true) {
                        int i12 = fileInputStream.read();
                        if (i12 <= 0 || i11 >= 256) {
                            break;
                        }
                        bArr[i11] = (byte) i12;
                        i11++;
                    }
                    if (i11 > 0) {
                        String str = new String(bArr, 0, i11, "UTF-8");
                        try {
                            fileInputStream.close();
                            return str;
                        } catch (IOException e11) {
                            SALog.printStackTrace(e11);
                            return str;
                        }
                    }
                    fileInputStream.close();
                } catch (Throwable unused) {
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return null;
                }
            } catch (IOException e12) {
                SALog.printStackTrace(e12);
            }
        } catch (Throwable unused2) {
            fileInputStream = null;
        }
        return null;
    }

    public static boolean isMainProcess(Context context, Bundle bundle) {
        if (context == null) {
            return false;
        }
        String mainProcessName = getMainProcessName(context);
        if (TextUtils.isEmpty(mainProcessName) && bundle != null) {
            mainProcessName = bundle.getString("com.sensorsdata.analytics.android.MainProcessName");
        }
        if (TextUtils.isEmpty(mainProcessName)) {
            return true;
        }
        String currentProcessName = getCurrentProcessName();
        return TextUtils.isEmpty(currentProcessName) || mainProcessName.equals(currentProcessName);
    }

    public static Bundle getAppInfoBundle(Context context) {
        if (mConfigBundle == null) {
            try {
                mConfigBundle = context.getApplicationContext().getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e11) {
                SALog.printStackTrace(e11);
            }
        }
        Bundle bundle = mConfigBundle;
        return bundle == null ? new Bundle() : bundle;
    }

    public static CharSequence getAppName(Context context) {
        if (context == null) {
            return "";
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getApplicationInfo(context.getPackageName(), 128).loadLabel(packageManager);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return "";
        }
    }

    public static String getAppVersionName(Context context) {
        if (context == null) {
            return "";
        }
        if (!TextUtils.isEmpty(mAppVersionName)) {
            return mAppVersionName;
        }
        try {
            mAppVersionName = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
        return mAppVersionName;
    }

    private static String getCurrentProcessName() {
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                return Application.getProcessName();
            }
            String currentProcessNameByCmd = getCurrentProcessNameByCmd();
            return TextUtils.isEmpty(currentProcessNameByCmd) ? getCurrentProcessNameByAT() : currentProcessNameByCmd;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return null;
        }
    }

    public static String getMainProcessName(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getApplicationContext().getApplicationInfo().processName;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return "";
        }
    }

    public static String getProcessName(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getApplicationInfo().processName;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return "";
        }
    }

    public static boolean isTaskExecuteThread() {
        return TextUtils.equals(ThreadNameConstants.THREAD_TASK_EXECUTE, Thread.currentThread().getName());
    }
}
