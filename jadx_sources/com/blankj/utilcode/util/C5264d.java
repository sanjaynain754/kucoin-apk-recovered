package com.blankj.utilcode.util;

import android.app.ActivityManager;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: renamed from: com.blankj.utilcode.util.d */
/* JADX INFO: compiled from: AppUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C5264d {
    /* JADX INFO: renamed from: e */
    public static String m6159e(String str) {
        return m6157c(str, "MD5");
    }

    /* JADX INFO: renamed from: g */
    public static String m6161g(String str) {
        return m6157c(str, "SHA1");
    }

    /* JADX INFO: renamed from: i */
    public static String m6163i(String str) {
        return m6157c(str, "SHA256");
    }

    /* JADX INFO: renamed from: a */
    public static String m6155a() {
        return C5287o0.m6331a().getPackageName();
    }

    /* JADX INFO: renamed from: b */
    public static Signature[] m6156b(String str) {
        if (C5299u0.m6469G(str)) {
            return null;
        }
        try {
            PackageInfo packageInfo = C5287o0.m6331a().getPackageManager().getPackageInfo(str, 64);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.signatures;
        } catch (PackageManager.NameNotFoundException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m6157c(String str, String str2) {
        Signature[] signatureArrM6156b;
        if (C5299u0.m6469G(str) || (signatureArrM6156b = m6156b(str)) == null || signatureArrM6156b.length <= 0) {
            return "";
        }
        return C5299u0.m6480c(C5299u0.m6463A(signatureArrM6156b[0].toByteArray(), str2)).replaceAll("(?<=[0-9A-F]{2})[0-9A-F]{2}", ":$0");
    }

    /* JADX INFO: renamed from: d */
    public static String m6158d() {
        return m6159e(C5287o0.m6331a().getPackageName());
    }

    /* JADX INFO: renamed from: f */
    public static String m6160f() {
        return m6161g(C5287o0.m6331a().getPackageName());
    }

    /* JADX INFO: renamed from: h */
    public static String m6162h() {
        return m6163i(C5287o0.m6331a().getPackageName());
    }

    /* JADX INFO: renamed from: j */
    public static int m6164j() {
        return m6165k(C5287o0.m6331a().getPackageName());
    }

    /* JADX INFO: renamed from: k */
    public static int m6165k(String str) {
        if (C5299u0.m6469G(str)) {
            return -1;
        }
        try {
            PackageInfo packageInfo = C5287o0.m6331a().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return -1;
            }
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e11) {
            e11.printStackTrace();
            return -1;
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m6166l() {
        return m6167m(C5287o0.m6331a().getPackageName());
    }

    /* JADX INFO: renamed from: m */
    public static String m6167m(String str) {
        if (C5299u0.m6469G(str)) {
            return "";
        }
        try {
            PackageInfo packageInfo = C5287o0.m6331a().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m6168n() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = (ActivityManager) C5287o0.m6331a().getSystemService("activity");
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() != 0) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(C5287o0.m6331a().getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m6169o(String str) {
        if (C5299u0.m6469G(str)) {
            return false;
        }
        try {
            return C5287o0.m6331a().getPackageManager().getApplicationInfo(str, 0).enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m6170p() {
        m6171q(C5287o0.m6331a().getPackageName());
    }

    /* JADX INFO: renamed from: q */
    public static void m6171q(String str) {
        if (!C5299u0.m6469G(str)) {
            Intent intentM6498u = C5299u0.m6498u(str, true);
            if (!C5299u0.m6467E(intentM6498u)) {
                return;
            }
            C5287o0.m6331a().startActivity(intentM6498u);
        }
    }

    public static void registerAppStatusChangedListener(@NonNull C5287o0.b bVar) {
        C5299u0.addOnAppStatusChangedListener(bVar);
    }

    public static void unregisterAppStatusChangedListener(@NonNull C5287o0.b bVar) {
        C5299u0.removeOnAppStatusChangedListener(bVar);
    }
}
