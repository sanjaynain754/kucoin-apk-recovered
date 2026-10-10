package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.Version;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.util.k */
/* JADX INFO: compiled from: VersionUtil.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6332k {

    /* JADX INFO: renamed from: a */
    public static final Pattern f10182a = Pattern.compile("[-_./;:]");

    /* JADX INFO: renamed from: a */
    public static Version m11123a(String str, String str2, String str3) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.length() > 0) {
                String[] strArrSplit = f10182a.split(strTrim);
                return new Version(m11124b(strArrSplit[0]), strArrSplit.length > 1 ? m11124b(strArrSplit[1]) : 0, strArrSplit.length > 2 ? m11124b(strArrSplit[2]) : 0, strArrSplit.length > 3 ? strArrSplit[3] : null, str2, str3);
            }
        }
        return Version.unknownVersion();
    }

    /* JADX INFO: renamed from: c */
    public static final void m11125c() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }

    /* JADX INFO: renamed from: b */
    public static int m11124b(String str) {
        int length = str.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt > '9' || cCharAt < '0') {
                break;
            }
            i11 = (i11 * 10) + (cCharAt - '0');
        }
        return i11;
    }
}
