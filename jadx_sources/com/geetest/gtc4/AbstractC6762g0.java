package com.geetest.gtc4;

/* JADX INFO: renamed from: com.geetest.gtc4.g0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6762g0 {
    /* JADX INFO: renamed from: a */
    public static String m12635a(int i11, int i12) {
        if (i11 == 64) {
            return "[APPLICATION " + i12 + "]";
        }
        if (i11 == 128) {
            return "[CONTEXT " + i12 + "]";
        }
        if (i11 != 192) {
            return "[UNIVERSAL " + i12 + "]";
        }
        return "[PRIVATE " + i12 + "]";
    }
}
