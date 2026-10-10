package com.facebook.react.modules.network;

/* JADX INFO: loaded from: classes45.dex */
class HeaderUtil {
    public static String stripHeaderName(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        boolean z11 = false;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt <= ' ' || cCharAt >= 127) {
                z11 = true;
            } else {
                sb2.append(cCharAt);
            }
        }
        return z11 ? sb2.toString() : str;
    }
}
