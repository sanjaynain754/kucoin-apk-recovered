package com.datavisorobfus;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import java.util.List;

/* JADX INFO: renamed from: com.datavisorobfus.a */
/* JADX INFO: loaded from: classes34.dex */
public class C5399a {

    /* JADX INFO: renamed from: a */
    private static C5399a f7232a = new C5399a();

    /* JADX INFO: renamed from: a */
    public static C5399a m7098a() {
        return f7232a;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: b */
    public synchronized String m7100b() {
        return "5.3.5.20260227_Android";
    }

    /* JADX INFO: renamed from: c */
    public synchronized String m7102c(Context context) {
        try {
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime + "";
    }

    /* JADX INFO: renamed from: d */
    public synchronized String m7103d(Context context) {
        PackageManager packageManager;
        try {
            packageManager = context.getPackageManager();
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
        return packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 0)).toString();
    }

    /* JADX INFO: renamed from: e */
    public synchronized String m7104e(Context context) {
        try {
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
    }

    /* JADX INFO: renamed from: f */
    public synchronized String m7105f(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (C5457z0.m7480a(packageInfo.packageName)) {
                return "empty";
            }
            return packageInfo.packageName;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized String m7106g(Context context) {
        try {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (C5457z0.m7480a(runningAppProcessInfo.processName)) {
                            return "empty";
                        }
                        return runningAppProcessInfo.processName;
                    }
                }
            }
            return "empty";
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: h */
    public synchronized boolean m7107h(Context context) {
        try {
            String strM7105f = m7105f(context);
            String strM7106g = m7106g(context);
            if (C5457z0.m7482b(strM7106g) && strM7106g.equals("exception")) {
                return false;
            }
            if (!C5457z0.m7480a(strM7105f) && !strM7105f.equals("empty") && !strM7105f.equals("exception") && !C5457z0.m7480a(strM7106g) && !strM7106g.equals("empty")) {
                return strM7105f.equals(strM7106g);
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized String m7099a(Context context) {
        String absolutePath;
        try {
            absolutePath = context.getFilesDir().getAbsolutePath();
            if (C5457z0.m7480a(absolutePath)) {
                absolutePath = "empty";
            }
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
        return absolutePath;
    }

    /* JADX INFO: renamed from: b */
    public synchronized String m7101b(Context context) {
        try {
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime + "";
    }
}
