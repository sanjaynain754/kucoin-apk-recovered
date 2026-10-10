package com.sumsub.sentry.android;

import android.content.pm.PackageInfo;
import android.os.Build;

/* JADX INFO: renamed from: com.sumsub.sentry.android.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C27915c {

    /* JADX INFO: renamed from: a */
    public static final C27915c f57021a = new C27915c();

    /* JADX INFO: renamed from: a */
    public static String m68995a(PackageInfo packageInfo) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            return Long.toString(packageInfo.getLongVersionCode());
        }
        return i11 < 31 ? String.valueOf(packageInfo.versionCode) : String.valueOf(packageInfo.getLongVersionCode());
    }
}
