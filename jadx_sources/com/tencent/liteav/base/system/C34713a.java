package com.tencent.liteav.base.system;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.C34754s;

/* JADX INFO: renamed from: com.tencent.liteav.base.system.a */
/* JADX INFO: loaded from: classes59.dex */
final class C34713a {

    /* JADX INFO: renamed from: a */
    private static final C34754s<PackageInfo> f73496a = new C34754s<>(CallableC34714b.m76058a());

    /* JADX INFO: renamed from: a */
    public static String m76054a() {
        PackageInfo packageInfoM76143a = f73496a.m76143a();
        return packageInfoM76143a == null ? "" : packageInfoM76143a.packageName;
    }

    /* JADX INFO: renamed from: c */
    public static String m76056c() {
        PackageInfo packageInfoM76143a = f73496a.m76143a();
        return packageInfoM76143a == null ? "" : packageInfoM76143a.versionName;
    }

    /* JADX INFO: renamed from: b */
    public static String m76055b() {
        PackageInfo packageInfoM76143a;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null || (packageInfoM76143a = f73496a.m76143a()) == null) {
            return "";
        }
        return applicationContext.getPackageManager().getApplicationLabel(packageInfoM76143a.applicationInfo).toString();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ PackageInfo m76057d() throws Exception {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        return applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
    }
}
