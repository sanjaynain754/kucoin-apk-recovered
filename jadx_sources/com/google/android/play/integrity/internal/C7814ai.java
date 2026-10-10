package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.ai */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class C7814ai {

    /* JADX INFO: renamed from: a */
    private static final C7837s f12107a = new C7837s("PhoneskyVerificationUtils");

    /* JADX INFO: renamed from: c */
    private static boolean m13302c(Signature[] signatureArr) {
        if (signatureArr == null || (signatureArr.length) == 0) {
            f12107a.m13327e("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
            return false;
        }
        for (Signature signature : signatureArr) {
            String strM13299a = C7813ah.m13299a(signature.toByteArray());
            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strM13299a)) {
                return true;
            }
            String str = Build.TAGS;
            if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strM13299a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m13301b(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled && m13302c(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures);
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m13300a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null && applicationInfo.enabled && m13302c(packageInfo.signatures)) {
                return packageInfo.versionCode;
            }
            return 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }
}
