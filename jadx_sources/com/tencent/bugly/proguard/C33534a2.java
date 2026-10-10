package com.tencent.bugly.proguard;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.a2 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33534a2 {
    /* JADX INFO: renamed from: a */
    public static void m72283a(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C33900rc.f71640i) {
            Log.d(str, str2);
        }
        C33627eb.m72945c("D", str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static void m72285b(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C33900rc.f71640i) {
            Log.e(str, str2);
        }
        C33627eb.m72945c(ExifInterface.LONGITUDE_EAST, str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static void m72286c(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C33900rc.f71640i) {
            Log.i(str, str2);
        }
        C33627eb.m72945c("I", str, str2);
    }

    /* JADX INFO: renamed from: d */
    public static void m72287d(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C33900rc.f71640i) {
            Log.v(str, str2);
        }
        C33627eb.m72945c(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m72288e(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C33900rc.f71640i) {
            Log.w(str, str2);
        }
        C33627eb.m72945c(ExifInterface.LONGITUDE_WEST, str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static void m72284a(String str, String str2, Throwable th2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C33900rc.f71640i) {
            Log.e(str, str2, th2);
        }
        C33627eb.m72938a(ExifInterface.LONGITUDE_EAST, str, th2);
    }

    /* JADX INFO: renamed from: a */
    public static void m72282a(int i11) {
        C33627eb.m72936a(i11);
    }
}
