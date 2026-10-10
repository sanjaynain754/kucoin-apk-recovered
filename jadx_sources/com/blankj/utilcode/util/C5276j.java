package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.tencent.bugly.proguard.C33820nf;
import java.util.UUID;

/* JADX INFO: renamed from: com.blankj.utilcode.util.j */
/* JADX INFO: compiled from: DeviceUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C5276j {

    /* JADX INFO: renamed from: a */
    public static volatile String f6550a;

    /* JADX INFO: renamed from: b */
    public static String m6243b() {
        return Build.MANUFACTURER;
    }

    /* JADX INFO: renamed from: c */
    public static String m6244c() {
        String str = Build.MODEL;
        return str != null ? str.trim().replaceAll("\\s*", "") : "";
    }

    /* JADX INFO: renamed from: d */
    public static int m6245d() {
        return Build.VERSION.SDK_INT;
    }

    /* JADX INFO: renamed from: e */
    public static String m6246e(String str, String str2) {
        if (str2.equals("")) {
            return str + UUID.randomUUID().toString().replace(C33820nf.f71144W, "");
        }
        return str + UUID.nameUUIDFromBytes(str2.getBytes()).toString().replace(C33820nf.f71144W, "");
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    /* JADX INFO: renamed from: f */
    public static String m6247f() {
        return m6248g("", true);
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    /* JADX INFO: renamed from: g */
    public static String m6248g(String str, boolean z11) {
        if (!z11) {
            return m6249h(str);
        }
        if (f6550a == null) {
            synchronized (C5276j.class) {
                try {
                    if (f6550a == null) {
                        String strM6176d = C5299u0.m6500w().m6176d("KEY_UDID", null);
                        if (strM6176d == null) {
                            return m6249h(str);
                        }
                        f6550a = strM6176d;
                        return f6550a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f6550a;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m6250i() {
        String networkOperatorName;
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.toLowerCase().contains("vbox") && !str.toLowerCase().contains("test-keys")) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !"google_sdk".equals(Build.PRODUCT))) {
                TelephonyManager telephonyManager = (TelephonyManager) C5287o0.m6331a().getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                if (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) {
                    networkOperatorName = "";
                }
                if (networkOperatorName.toLowerCase().equals("android")) {
                    return true;
                }
                Intent intent = new Intent();
                intent.setData(Uri.parse("tel:123456"));
                intent.setAction("android.intent.action.DIAL");
                return intent.resolveActivity(C5287o0.m6331a().getPackageManager()) == null;
            }
        }
        return true;
    }

    public C5276j() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @SuppressLint({"HardwareIds"})
    /* JADX INFO: renamed from: a */
    public static String m6242a() {
        String string = Settings.Secure.getString(C5287o0.m6331a().getContentResolver(), "android_id");
        if ("9774d56d682e549c".equals(string) || string == null) {
            return "";
        }
        return string;
    }

    /* JADX INFO: renamed from: h */
    public static String m6249h(String str) {
        try {
            String strM6242a = m6242a();
            if (!TextUtils.isEmpty(strM6242a)) {
                return m6251j(str + 2, strM6242a);
            }
        } catch (Exception unused) {
        }
        return m6251j(str + 9, "");
    }

    /* JADX INFO: renamed from: j */
    public static String m6251j(String str, String str2) {
        f6550a = m6246e(str, str2);
        C5299u0.m6500w().m6177f("KEY_UDID", f6550a);
        return f6550a;
    }
}
