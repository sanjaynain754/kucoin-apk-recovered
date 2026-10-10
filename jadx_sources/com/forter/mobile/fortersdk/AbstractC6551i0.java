package com.forter.mobile.fortersdk;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.credentials.provider.CredentialEntry;
import cn.jiguang.privates.push.constants.JPushConstants;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.i0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6551i0 {

    /* JADX INFO: renamed from: a */
    public static int f10967a = -1;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static String m12311a() {
        try {
            if (m12312b()) {
                return CredentialEntry.TRUE_STRING;
            }
            if (f10967a < 0) {
                String str = Build.PRODUCT;
                int i11 = (str.equals("sdk") || str.equals("google_sdk") || str.equals("sdk_google_phone_x86") || str.equals("sdk_x86") || str.equals("vbox86p") || str.equals("remix_x86_64") || str.equals("gce_x86_phone")) ? 1 : 0;
                String str2 = Build.MANUFACTURER;
                if (str2.equals("unknown") || str2.equals("Genymotion")) {
                    i11++;
                }
                String str3 = Build.BRAND;
                if (str3.equals("generic") || str3.equals("generic_x86") || str3.equals("Jide")) {
                    i11++;
                }
                String str4 = Build.DEVICE;
                if (str4.equals("generic") || str4.equals("generic_x86") || str4.equals("vbox86p") || str4.equals("gce_x86") || str4.equals("remix_x86_64")) {
                    i11++;
                }
                String str5 = Build.MODEL;
                if (str5.equals("sdk") || str5.equals("google_sdk") || str5.equals("Android SDK built for x86") || str5.equals("GCE x86 phone")) {
                    i11++;
                }
                String str6 = Build.HARDWARE;
                if (str6.equals("goldfish") || str6.equals("vbox86") || str6.equals("gce_x86") || str6.equals("remix_x86_64")) {
                    i11++;
                }
                String str7 = Build.FINGERPRINT;
                if (str7.contains("generic/sdk/generic") || str7.contains("generic_x86/sdk_x86/generic_x86") || str7.contains("generic/google_sdk/generic") || str7.contains("Android/sdk_google_phone_x86/generic_x86") || str7.contains("generic/vbox86p/vbox86p") || str7.contains("generic/gce_x86_phone/gce_x86") || str7.contains("Jide/remix_x86_64/remix_x86_64:6.0.1")) {
                    i11++;
                }
                f10967a = i11;
            }
            return f10967a > 4 ? CredentialEntry.TRUE_STRING : CredentialEntry.FALSE_STRING;
        } catch (Exception unused) {
            return "unknown";
        }
    }

    @SuppressLint({"HardwareIds"})
    /* JADX INFO: renamed from: b */
    public static boolean m12312b() {
        try {
            return Build.VERSION.RELEASE.equals("4.4.2") && Build.BRAND.equalsIgnoreCase(JPushConstants.Manufacturer.XIAOMI) && Build.MANUFACTURER.equalsIgnoreCase("Lenovo") && Build.BOOTLOADER.equalsIgnoreCase("Nox") && Build.SERIAL.equalsIgnoreCase("Nox");
        } catch (Exception unused) {
        }
    }
}
