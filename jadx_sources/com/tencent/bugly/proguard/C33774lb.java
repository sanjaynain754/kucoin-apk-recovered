package com.tencent.bugly.proguard;

import java.security.MessageDigest;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.lb */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33774lb {

    /* JADX INFO: renamed from: a */
    public static final String f70835a = "RMonitor_MD5Utils";

    /* JADX INFO: renamed from: a */
    public static String m73975a(MessageDigest messageDigest) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b11 : messageDigest.digest()) {
            sb2.append(Integer.toHexString((b11 >> 4) & 15));
            sb2.append(Integer.toHexString(b11 & 15));
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m73976a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return m73975a(messageDigest);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }
}
