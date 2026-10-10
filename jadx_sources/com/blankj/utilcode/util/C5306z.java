package com.blankj.utilcode.util;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: renamed from: com.blankj.utilcode.util.z */
/* JADX INFO: compiled from: ProcessUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C5306z {
    /* JADX INFO: renamed from: b */
    public static String m6518b() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        String str;
        try {
            ActivityManager activityManager = (ActivityManager) C5287o0.m6331a().getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() != 0) {
                int iMyPid = Process.myPid();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid && (str = runningAppProcessInfo.processName) != null) {
                        return str;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* JADX INFO: renamed from: c */
    public static String m6519c() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/cmdline")));
            String strTrim = bufferedReader.readLine().trim();
            bufferedReader.close();
            return strTrim;
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m6517a() {
        String strM6519c = m6519c();
        if (!TextUtils.isEmpty(strM6519c)) {
            return strM6519c;
        }
        String strM6518b = m6518b();
        if (!TextUtils.isEmpty(strM6518b)) {
            return strM6518b;
        }
        return m6520d();
    }

    /* JADX INFO: renamed from: d */
    public static String m6520d() {
        try {
            Application applicationM6331a = C5287o0.m6331a();
            Field field = applicationM6331a.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(applicationM6331a);
            Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            return (String) obj2.getClass().getDeclaredMethod("getProcessName", new Class[0]).invoke(obj2, new Object[0]);
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }
}
