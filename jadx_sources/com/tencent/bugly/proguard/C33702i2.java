package com.tencent.bugly.proguard;

import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.i2 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33702i2 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static String m73294a(String str) {
        if (str == null) {
            return "";
        }
        return str.length() > 1024 ? str.substring(0, 1024) : str;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m73295a(String[] strArr, String str) {
        if (str != null && !str.isEmpty()) {
            for (String str2 : strArr) {
                if (TextUtils.equals(str2, str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
