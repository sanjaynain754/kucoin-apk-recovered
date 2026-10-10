package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.jh */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33738jh {
    /* JADX INFO: renamed from: a */
    public static String m73568a(int i11) {
        if (i11 == 1) {
            return "front_end";
        }
        return i11 == 2 ? "back_end" : "unknown";
    }

    /* JADX INFO: renamed from: b */
    public static String m73569b(int i11) {
        if (i11 == 1) {
            return "wifi";
        }
        if (i11 != 2) {
            return i11 != 3 ? "unknown" : "disconnect";
        }
        return "mobile";
    }
}
