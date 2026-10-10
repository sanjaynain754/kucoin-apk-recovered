package com.datavisorobfus;

/* JADX INFO: renamed from: com.datavisorobfus.z0 */
/* JADX INFO: loaded from: classes34.dex */
public class C5457z0 {
    /* JADX INFO: renamed from: a */
    public static boolean m7480a(String str) {
        int length;
        if (str != null && (length = str.length()) != 0) {
            for (int i11 = 0; i11 < length; i11++) {
                if (!Character.isWhitespace(str.charAt(i11))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7481a(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m7482b(String str) {
        return !m7480a(str);
    }
}
