package com.huawei.hms.ads.identifier;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: renamed from: com.huawei.hms.ads.identifier.b */
/* JADX INFO: loaded from: classes56.dex */
public class C9255b {
    /* JADX INFO: renamed from: a */
    public static String m14290a(Context context) {
        if (m14291a(context, "com.huawei.hwid")) {
            return "com.huawei.hwid";
        }
        if (m14291a(context, "com.huawei.hms")) {
            return "com.huawei.hms";
        }
        return m14291a(context, "com.huawei.hwid.tv") ? "com.huawei.hwid.tv" : "com.huawei.hwid";
    }

    /* JADX INFO: renamed from: a */
    public static boolean m14291a(Context context, String str) {
        return m14292b(context, str) != null;
    }

    /* JADX INFO: renamed from: b */
    public static PackageInfo m14292b(Context context, String str) {
        String str2;
        if (!TextUtils.isEmpty(str) && context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    return packageManager.getPackageInfo(str, 128);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                str2 = "getPackageInfo NameNotFoundException";
                Log.w("ApkUtil", str2);
            } catch (Exception unused2) {
                str2 = "getPackageInfo Exception";
                Log.w("ApkUtil", str2);
            }
        }
        return null;
    }
}
